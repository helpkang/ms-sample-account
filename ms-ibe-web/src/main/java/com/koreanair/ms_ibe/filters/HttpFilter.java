/*
 * Copyright 2011-2017 AsianaIDT Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.koreanair.ms_ibe.filters;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ReadListener;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.koreanair.common.exception.GenericException;
import com.koreanair.common.exception.GenericException.ExceptionCode;
import com.koreanair.common.utils.StringUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * HTTP 요청 및 응답결과 추적 Filter.
 * Created by bdlee on 2019. 10. 31.
 * </pre>
 *
 * @author bdlee
 *
 * @version 1.0.0
 * @since 2019. 10. 31.
 */
@Slf4j
@Component(value = "httpFilter")
public class HttpFilter implements Filter {

	@Autowired
	private ObjectMapper jacksonMapper;

	/**
	 * Request Body 숨김 대상 (민감한 개인정보 등은 로깅 제외)
	 */
	private String[] hidddenRequestBodyPaths = { "/auth/user" };

	public static String getClientIp(HttpServletRequest request) {
		String clientIp = StringUtil.defaultString(request.getHeader("True-Client-IP")).trim();

		if (StringUtils.isBlank(clientIp) || "unknown".equalsIgnoreCase(clientIp)) {
			clientIp = request.getHeader("X-Forwarded-For");
		}
		if (StringUtils.isBlank(clientIp) || "unknown".equalsIgnoreCase(clientIp)) {
			clientIp = request.getHeader("Proxy-Client-IP");
		}
		if (StringUtils.isBlank(clientIp) || "unknown".equalsIgnoreCase(clientIp)) {
			clientIp = request.getHeader("WL-Proxy-Client-IP");
		}
		if (StringUtils.isBlank(clientIp) || "unknown".equalsIgnoreCase(clientIp)) {
			clientIp = request.getHeader("HTTP_CLIENT_IP");
		}
		if (StringUtils.isBlank(clientIp) || "unknown".equalsIgnoreCase(clientIp)) {
			clientIp = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (StringUtils.isBlank(clientIp) || "unknown".equalsIgnoreCase(clientIp)) {
			clientIp = request.getRemoteAddr();
		}
		return clientIp;
	}

	/**
	 * <pre>
	 * HTTP 요청 및 응답결과 추적
	 *
	 * - 사용자 추적정보를 로깅하고 DB에 저장한다.
	 *
	 * - 요청정보 : URI, Method, Content-Type, Request-Body
	 * - 응답정보 : Status, Content-Type, Response-Body
	 * - 요청자정보 : 사용자ID, 사용자명, 역할, 접근 IP
	 * - 수행정보 : 수행시간
	 * </pre>
	 *
	 * @param request HTTP Request 요청 정보
	 * @param response HTTP Response 응답 정보
	 * @param chain 필터 체인 정보
	 * @throws IOException IO 예외
	 * @throws ServletException Servlet 예외
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		long startTime;
		long endTime;
		HttpLog httpLog = new HttpLog();

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		try {
			String clientSystemIp = getClientIp(httpRequest); // 이 서버에 접속을 시도한 client의 ip
			String currentServerIp = "";
			String userIp = httpRequest.getHeader("USER_IP");
			String userInfo = httpRequest.getHeader("USER_INFO");
			String caller = httpRequest.getHeader("CALLER_NAME");
			String uiLang = httpRequest.getHeader("UI_LANG");
			String site = httpRequest.getHeader("SITE");
			String ePnr = httpRequest.getHeader("EPNR");
			String nPnr = httpRequest.getHeader("NPNR");
			String deviceType = httpRequest.getHeader("DEVICE_TYPE");
			String systemType = httpRequest.getHeader("SYSTEM_TYPE");
			String serviceFlowName = httpRequest.getHeader("SERVICE_FLOW_NAME");
			String sessionId = httpRequest.getHeader("UI_SESSION_ID");

//			// HTTP Header로 들어온 정보를 접속 Thread내에서 사용하기 위한 객체
//			HeaderDataBean headerData = new HeaderDataBean();
//			headerData.CURRENT_SERVER_IP = currentServerIp;
//			headerData.CLIENT_SYSTEM_IP = clientSystemIp;
//			headerData.USER_IP = userIp;
//			headerData.USER_INFO = userInfo;
//			headerData.CALLER_NAME = caller;
//			headerData.DEVICE_TYPE = deviceType;
//			headerData.SYSTEM_TYPE = systemType;
//			headerData.EPNR_NO = ePnr;
//			headerData.NPNR_NO = nPnr;
//			headerData.SITE = site;
//			headerData.UI_LANG = uiLang;
//			headerData.SERVICE_FLOW_NAME = serviceFlowName;
//			headerData.UI_SESSION_ID = sessionId;
//			HeaderContextHolder.setHeader(headerData);

			// logger를 위한 MDC 설정
			String strRandomNumber = RandomStringUtils.randomNumeric(9);
			MDC.put("PRCNUM", "P" + strRandomNumber);
			if (clientSystemIp != null) {
				MDC.put("ClientIP", clientSystemIp); // UI 서버의 IP
			}
			if (userIp != null) {
				MDC.put("UserIP", userIp); // 고객의 IP
			}
			MDC.put("PNR", StringUtils.defaultString(ePnr, nPnr));

			// ServletRequest/ServletResponse 를 Body reload 가능한 객체로 변환
			String contentType = httpRequest.getContentType();
			if (contentType != null) {
				httpRequest = new ReadableStreamRequest(httpRequest);
			}
			ReadableStreamResponse httpResponse = new ReadableStreamResponse((HttpServletResponse) response);

			// 요청정보 수집
			httpLog = getHttpRequestInfo(httpRequest, httpLog);

			// 콘솔/파일 로깅
			if (log.isInfoEnabled()) {
				synchronized (log) {
					Enumeration<String> eHeader = httpRequest.getHeaderNames();
					HashMap<String, String> headerMap = new HashMap<>();
					while (eHeader.hasMoreElements()) {
						String key = eHeader.nextElement();
						String val = httpRequest.getHeader(key);
						headerMap.put(key, val);
					}

					log.info("");
					log.info("Inbound Message");
					log.info("──────────────────────────────────────────────────────────────────────────");
					log.info(" Address : {} ", httpRequest.getRequestURL());
					log.info(" URI : {} ", httpRequest.getRequestURI());
					log.info(" Method : {} ", httpRequest.getMethod());
					log.info(" Content-Type: {}" , httpLog.getRequestContentType());
					log.info(" Headers: {}" , jacksonMapper.writeValueAsString(headerMap));
					log.info(" Payload : {} " , httpLog.getRequestBody());
					log.info("──────────────────────────────────────────────────────────────────────────");
				}
			}


			// Controller 수행
			startTime = System.currentTimeMillis();
			chain.doFilter(httpRequest, httpResponse);
			endTime = System.currentTimeMillis();
			log.debug("httpResponse.getContentType() == {}",httpResponse.getContentType() );

			// 응답 정보 수집
			httpLog = getHttpResponseInfo(httpResponse, httpLog);

			// 컨트롤러 맵핑 패턴 얻기
			String requestMappingPattern = (String) httpRequest.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
			httpLog.setRequestMapping(requestMappingPattern);

			// 수행시간 계산
			httpLog.setElapsedTime(((double) (endTime - startTime)) / 1000);

			// 콘솔/파일 로깅
			if (log.isInfoEnabled()) {
				HashMap<String, String> headerMap = new HashMap<>();
				for(String headerName : httpResponse.getHeaderNames()) {
					String key = headerName;
					String val = httpResponse.getHeader(key);
					headerMap.put(key, val);
				}

				synchronized (log) {
					log.info("Outbound Message");
					log.info("──────────────────────────────────────────────────────────────────────────");
					log.info(" Response-Code: {}", httpLog.getResponseStatus());
					log.info(" Content-Type: {}" , httpResponse.getContentType()); //httpLog.getResponseContentType()
					log.info(" Headers: {}" , jacksonMapper.writeValueAsString(headerMap));
					log.info(" Payload : {} " , httpLog.getResponseBody());
					log.info("──────────────────────────────────────────────────────────────────────────");
					log.info("");
				}
			}


		} finally {
			MDC.remove("ClientIP");
			MDC.remove("UserIP");
			MDC.remove("PRCNUM");
			MDC.remove("PNR");
		}
	}

	/**
	 * <pre>
	 * 요청 정보 수집
	 * </pre>
	 *
	 * @param httpRequest HTTP Request
	 * @param httpLog 사용자 추적정보 VO
	 * @return 사용자 추적정보 VO : Request URI, Request Content-Type, Request Method,
	 *         Request Body, 컨트롤러 맵핑 패턴
	 * @throws IOException IO 예외
	 */
	private HttpLog getHttpRequestInfo(HttpServletRequest httpRequest, HttpLog httpLog) throws IOException {
		// 요청 정보
		String requestUri;
		String requestContentType;
		String requestMethod;
		String requestBody;

		// Request URI 얻기
		StringBuilder uri = new StringBuilder(1024);
		uri.append(httpRequest.getMethod()).append(" ").append(httpRequest.getScheme()).append("://").append(httpRequest.getServerName()).append(":")
				.append(httpRequest.getServerPort()).append(httpRequest.getRequestURI());
		if (httpRequest.getQueryString() != null) {
			uri.append("?").append(URLDecoder.decode(httpRequest.getQueryString(), "UTF-8"));
		}
		requestUri = StringUtil.replacePattern(uri.toString(), "(\r\n|\n\r|\r|\n)", "");

		// Request Content-Type 얻기
		requestContentType = httpRequest.getContentType();
		if (requestContentType != null) {
			requestContentType = StringUtil.replacePattern(requestContentType, "(\r\n|\n\r|\r|\n)", "");
		} else {
			requestContentType = "";
		}

		// Request Method 얻기
		requestMethod = httpRequest.getMethod();

		// Request Body 얻기
		if (requestContentType.startsWith("application/json") || requestContentType.startsWith("application/xml") || requestContentType.startsWith("text/xml")) {

			requestBody = IOUtils.toString(httpRequest.getReader());
			if (requestBody == null) {
				requestBody = "";
			}

			// Request Body 를 숨겨야 하는경우 처리 (예: 사용자 비번 등)
			String requestURI = httpRequest.getRequestURI();
			for (String path : hidddenRequestBodyPaths) {
				if (requestURI != null && requestURI.startsWith(httpRequest.getContextPath() + path)) {
					requestBody = "";
				}
			}
		} else {
			Map<String, String[]> map = httpRequest.getParameterMap();
			requestBody = jacksonMapper.writeValueAsString(map);
		}

		// 사용자 추적정보 VO 셋팅
		httpLog.setRequestUri(requestUri);
		httpLog.setRequestContentType(requestContentType);
		httpLog.setRequestMethod(requestMethod);
		httpLog.setRequestBody(requestBody);

		return httpLog;
	}

	/**
	 * <pre>
	 * 응답 정보 수집
	 * </pre>
	 *
	 * @param httpResponse HTTP Response
	 * @param httpLog 사용자 추적정보 VO
	 * @return 사용자 추적정보 VO : Response Status-Code, Response Content-Type, Response
	 *         Body
	 * @throws IOException IO 예외
	 */
	private HttpLog getHttpResponseInfo(ReadableStreamResponse httpResponse, HttpLog httpLog) throws IOException {
		// 응답 정보
		int responseStatus;
		String responseContentType;
		String responseBody;

		// Response Status-Code 얻기
		responseStatus = httpResponse.getStatus();

		// Response Content-Type 얻기
		if (httpResponse.getContentType() != null) {
			responseContentType = httpResponse.getContentType().split(";")[0];
		} else {
			responseContentType = "";
		}

		// Response Body 얻기
		httpResponse.flushBuffer();
		if (responseContentType != null && !responseContentType.startsWith("text/html")) {
			responseBody = new String(httpResponse.getContents(), httpResponse.getCharacterEncoding());
		} else {
			log.debug("Not Json Type Response = {} ", new String(httpResponse.getContents(), httpResponse.getCharacterEncoding()));
			responseBody = "";
		}

		// 사용자 추적정보 VO 셋팅
		httpLog.setResponseStatus(String.valueOf(responseStatus));
		httpLog.setResponseContentType(responseContentType);
		httpLog.setResponseBody(responseBody);

		return httpLog;
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// do init
	}

	@Override
	public void destroy() {
		// do destroy
	}

	/**
	 * <pre>
	 * request body reload 가능 HttpServletRequest Wrapper
	 * </pre>
	 */
	public class ReadableStreamRequest extends HttpServletRequestWrapper {

		private final Charset encoding;
		private byte[] rawData;

		public ReadableStreamRequest(HttpServletRequest request) throws IOException {
			super(request);

			String characterEncoding = request.getCharacterEncoding();
			if (StringUtils.isEmpty(characterEncoding)) {
				characterEncoding = StandardCharsets.UTF_8.name();
			}
			this.encoding = Charset.forName(characterEncoding);

			try {
				InputStream inputStream = request.getInputStream();
				this.rawData = IOUtils.toByteArray(inputStream);
			} catch (IOException e) {
				throw new GenericException(ExceptionCode.NOT_FOUND, "IOException ERROR  ");
			}
		}

		@Override
		public ServletInputStream getInputStream() throws IOException {

			final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.rawData);
			return new ServletInputStream() {
				public int read() throws IOException {
					return byteArrayInputStream.read();
				}

				@Override
				public boolean isFinished() {
					return false;
				}

				@Override
				public boolean isReady() {
					return false;
				}

				@Override
				public void setReadListener(ReadListener readListener) {
					throw new GenericException("Not Implemented");
				}
			};
		}

		@Override
		public BufferedReader getReader() throws IOException {
			return new BufferedReader(new InputStreamReader(this.getInputStream(), this.encoding));
		}

	}

	/**
	 * <pre>
	 * response body reload 가능 HttpServletResponse Wrapper
	 * </pre>
	 */
	public class ReadableStreamResponse extends HttpServletResponseWrapper {

		private ServletOutputStream outputStream;
		private PrintWriter writer;
		private ServletOutputStreamCopier copier;

		public ReadableStreamResponse(HttpServletResponse response) {
			super(response);
		}

		@Override
		public ServletOutputStream getOutputStream() throws IOException {
			if (writer != null) {
				throw new IllegalStateException("getWriter() has already been called on this response.");
			}

			if (outputStream == null) {
				outputStream = getResponse().getOutputStream();
				copier = new ServletOutputStreamCopier(outputStream);
			}

			return copier;
		}

		@Override
		public PrintWriter getWriter() throws IOException {
			if (outputStream != null) {
				throw new IllegalStateException("getOutputStream() has already been called on this response.");
			}

			if (writer == null) {
				copier = new ServletOutputStreamCopier(getResponse().getOutputStream());
				writer = new PrintWriter(new OutputStreamWriter(copier, getResponse().getCharacterEncoding()), true);
			}

			return writer;
		}

		@Override
		public void flushBuffer() throws IOException {
			if (writer != null) {
				writer.flush();
			} else if (outputStream != null) {
				copier.flush();
			}
		}

		public byte[] getContents() {
			if (copier != null) {
				return copier.getCopy();
			} else {
				return new byte[0];
			}
		}

		public class ServletOutputStreamCopier extends ServletOutputStream {

			private OutputStream outputStream;
			private ByteArrayOutputStream copy;

			public ServletOutputStreamCopier(OutputStream outputStream) {
				this.outputStream = outputStream;
				this.copy = new ByteArrayOutputStream(1024);
			}

			@Override
			public void write(int b) throws IOException {
				outputStream.write(b);
				copy.write(b);
			}

			public byte[] getCopy() {
				return copy.toByteArray();
			}

			@Override
			public boolean isReady() {
				return false;
			}

			@Override
			public void setWriteListener(WriteListener writeListener) {
				// do
			}
		}
	}

}