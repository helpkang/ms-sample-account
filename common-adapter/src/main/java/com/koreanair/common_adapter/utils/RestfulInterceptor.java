package com.koreanair.common_adapter.utils;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * Restful sevice의 호출 시 interceptor
 * Rest service 제공 전 Header에 정보 추가 등의 기능을 수행한다.
 * </pre>
 * @author bdlee
 * @version 1.0.0
 */
@Slf4j
public class RestfulInterceptor implements ClientHttpRequestInterceptor {

	/**
	 * <pre>
	 * Rest 호출 전 http header에 정보 추가
	 * </pre>
	 *
	 * @param restHttpRequest
	 * @param bodyOfByte
	 * @param execution
	 * @return
	 * @throws IOException
	 */
	@Override
	public ClientHttpResponse intercept(HttpRequest restHttpRequest, byte[] bodyOfByte, ClientHttpRequestExecution execution) throws IOException {
		HttpHeaders headers = restHttpRequest.getHeaders();

		// json type으로 message를 전달할 경우 .
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);

		log.info("============================== Rest service request begin ==============================");
		log.info("Request URI = {}", restHttpRequest.getURI());
		for (Entry<String, List<String>> entry : headers.entrySet()) {
			log.info("key = {} / value = {}", entry.getKey(), entry.getValue());
		}
		ClientHttpResponse response = execution.execute(restHttpRequest, bodyOfByte);
		traceResponse(response);
		log.info("============================== Rest service request end ================================");
		return response;
	}

	/**
	 * <pre>
	 * Rest응답의 trace
	 * </pre>
	 *
	 * @param response
	 * @throws IOException
	 */
	private void traceResponse(ClientHttpResponse response) throws IOException {
		log.info("============================== Rest service response begin ==============================");
		log.info("status code: {} / status text: {}" , response.getStatusCode(), response.getStatusText());

		HttpHeaders headers = response.getHeaders();
		for (Entry<String, List<String>> entry : headers.entrySet()) {
			log.info("key = {} / value = {}", entry.getKey(), entry.getValue());
		}
		log.info("============================== Rest service response end ================================");
	}
}
