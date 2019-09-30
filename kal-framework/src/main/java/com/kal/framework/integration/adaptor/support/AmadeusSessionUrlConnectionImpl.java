package com.kal.framework.integration.adaptor.support;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.kal.framework.exception.BizException;
import com.kal.framework.guid.Guid;
import com.kal.framework.guid.support.DefaultGuidManager;
import com.kal.framework.integration.adaptor.UrlConnectionService;
import com.kal.framework.integration.adaptor.WebServiceVo;
import com.kal.framework.integration.adaptor.util.AdaptorUtil;
import com.kal.framework.properties.support.KalProperties;
import com.kal.ibe.onea.client.SessionClient;
import com.kal.ibe.onea.client.SessionClients;
import com.kal.ibe.onea.service.AlteaSessionVO;

import net.sf.jazzlib.GZIPInputStream;
import pip_service_library.pip_session.Session;

/**
 * WebService Adaptor Implementator :
 * <p>
 * UrlConnectionService 인터페이스의 Implementator. 개발자는UrlConnectionServiceImpl 클래스에
 * 접근하여 웹서비스 연동 처리.
 *
 * @author 이형규
 * @version 1.0
 * @since 2012-09-20
 */
public class AmadeusSessionUrlConnectionImpl implements UrlConnectionService {
	private static final Logger logger = Logger.getLogger(AmadeusSessionUrlConnectionImpl.class);

	@Resource(name = "propertiesService")
	protected KalProperties propertiesService;

	@Autowired
	public SessionClients clients;

	private static final int amadeus_altea_headertype = 1;
	private static final int amadeus_ecommerce_headertype = 2;
	private static final int pip_altea_headertype = 3;
	private static final int pip_ecommerce_headertype = 4;
	private static final int pip_ods_headertype = 5;
	private static final int pid_headertype = 6;
	private static final int custom_headertype = 0;

	private static final String stateless = "1";
	private static final String stateful = "2";
	private static final String dedicated = "3";

	public AmadeusSessionUrlConnectionImpl(SessionClients clients, KalProperties propertiesService) {
		this.clients = clients;
		this.propertiesService = propertiesService;
	}

	public AmadeusSessionUrlConnectionImpl() {
	}

	@Override
	public void init() {
	}

	/**
	 * Description : UrlConnection방식의 웹서비스를 호출함 PIP, Amadeus 웹서비스 처리
	 *
	 * @param WebServiceVo
	 *            vo
	 * @return String
	 */
	@Override
	public String call(WebServiceVo vo) throws Exception {
		WebServiceVo webserviceVo = setWebServiceVo(vo);

		String result = null;

		BufferedReader clsInput = null;
		OutputStream outputStream = null;
		boolean isCompressCheck = false;

		if (webserviceVo != null) {
			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				@Override
				public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
				}

				@Override
				public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
				}
			} };

			SSLContext sc = SSLContext.getInstance("TLSv1.2");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			HostnameVerifier allHostsValid = new HostnameVerifier() {
				@Override
				public boolean verify(String arg0, SSLSession arg1) {
					return true;
				}
			};

			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

			URL url;
			HttpURLConnection urlConnection;

			url = new URL(webserviceVo.getHost());
			// 요청 호스트에 연결
			urlConnection = (HttpURLConnection) url.openConnection();
			// 요청 응답 타임아웃 설정
			urlConnection.setConnectTimeout(Integer.parseInt(propertiesService.getProperty("connect.time.out")));
			// 읽기 타임아웃 설정
			urlConnection.setReadTimeout(Integer.parseInt(propertiesService.getProperty("read.time.out")));
			if (webserviceVo.getReadTimeOut() != null) {
				urlConnection.setReadTimeout(Integer.valueOf(webserviceVo.getReadTimeOut()));
			}
			// 6가지 headertype 에 따른 SOAP Header 설정

			String query = "";
			/** 2014.07.31 webservice compress 위한 속성 추가 */
			switch (webserviceVo.getHeaderType()) {
			case custom_headertype:
				query = webserviceVo.getBodyXml();
				break;

			case amadeus_altea_headertype:
				urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
				if (isQueryCompress("altea.http.compress")) {
					isCompressCheck = compressCheck(urlConnection);
				}
				query = getAmadeusAlteaHeader(webserviceVo);
				break;

			case amadeus_ecommerce_headertype:
				if (StringUtils.isNotBlank(webserviceVo.getJsessionId())) {
					urlConnection.setRequestProperty("Cookie", "JSESSIONID=" + webserviceVo.getJsessionId());
				}
				urlConnection.setRequestProperty("edgeproxy_cip", webserviceVo.getEdgeproxycip());

				if (isQueryCompress("ecommerce.http.compress")) {
					urlConnection.setRequestProperty("Accept-Encoding", "gzip");
				}
				query = getAmadeusEcommerceHeader(webserviceVo);
				break;

			case pip_altea_headertype:
				urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
				/**
				 * 2014.04.24 특정 웹서비스 (ATC transaction 과금 audit) 호출 시에 Http
				 * Header 에 X-atc-Option : "A" 값을 전달 PIP 로 보낼 때만 적용 해당 웹 서비스 외에는
				 * 해당 header 값이 필요 없으나 null 값 체크 없이 Header 셋팅 하여 PIP로 전달되게 적용.
				 */
				urlConnection.setRequestProperty("X-atc-Option", webserviceVo.getxAtcOption());
				if (isQueryCompress("pip.altea.http.compress")) {
					isCompressCheck = compressCheck(urlConnection);
				}
				query = getPipAlteaHeader(webserviceVo);
				break;

			case pip_ecommerce_headertype:
				if (StringUtils.isNotBlank(webserviceVo.getJsessionId())) {
					urlConnection.setRequestProperty("Cookie", "JSESSIONID=" + webserviceVo.getJsessionId());
				}
				urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
				urlConnection.setRequestProperty("edgeproxy_cip", webserviceVo.getEdgeproxycip()); //
				urlConnection.setRequestProperty("X-inf-operation", webserviceVo.getXinfoperation());
				urlConnection.setRequestProperty("X-inf-flowCode", webserviceVo.getXinfflowCode());
				if (isQueryCompress("pip.ecommerce.http.compress")) {
					isCompressCheck = compressCheck(urlConnection);
				}
				query = getPipEcommerceHeader(webserviceVo);
				break;

			case pip_ods_headertype:
				urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
				if (isQueryCompress("pip.ods.http.compress")) {
					isCompressCheck = compressCheck(urlConnection);
				}
				query = getPipOdsHeader(webserviceVo);
				break;

			case pid_headertype:
				urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
				if (isQueryCompress("pid.http.compress")) {
					isCompressCheck = compressCheck(urlConnection);
				}
				query = getPidHeader(webserviceVo);
				break;

			default:
				if (logger.isInfoEnabled())
					logger.info("current host is not exist : " + query);
				break;
			}
			// 전송 방식 (POST, GET)
			((HttpURLConnection) urlConnection).setRequestMethod(webserviceVo.getRequestMethod());
			// 요청편집허가
			urlConnection.setDoInput(true); // 서버에서 읽기 모드 지정
			urlConnection.setDoOutput(true); // 서버로 쓰기 모드 지정
			urlConnection.setUseCaches(false);
			urlConnection.setRequestProperty("Content-Length", "" + query.length());
			if (StringUtils.isNotBlank(vo.getContentsType())) {
				urlConnection.setRequestProperty("Content-Type", vo.getContentsType());
				urlConnection.setRequestProperty("Accept", vo.getContentsType());
			} else {
				urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
				urlConnection.setRequestProperty("Accept", "application/xml");
			}

			if (webserviceVo.getReqHttpHeaderFields() != null) {
				Map<String, String> reqHeaderMap = webserviceVo.getReqHttpHeaderFields();
				for (String key : reqHeaderMap.keySet()) {
					urlConnection.setRequestProperty(key, reqHeaderMap.get(key));
				}
			}

			if (logger.isInfoEnabled())
				logger.info("Request Soap Message :: " + query);

			outputStream = urlConnection.getOutputStream();
			outputStream.write(isCompressCheck == true ? AdaptorUtil.StringToZipBytes(query) : query.getBytes("UTF-8"));
			outputStream.flush();

			vo.setQuery(query);
			boolean soapFault = false;

			String res_encode = null;
			InputStream is = null;
			try {
				// 목적지 호스트로부터 Response 를 받는다.
				is = urlConnection.getInputStream();

				// Response 에서 gzip 인지 여부 식별 정보
				res_encode = urlConnection.getHeaderField("Content-Encoding");

				// response 가 gzip 인경우
				if ("gzip".equalsIgnoreCase(res_encode)) {
					clsInput = new BufferedReader(new InputStreamReader(new GZIPInputStream(is), "UTF-8"));
				} else {
					clsInput = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				}
			}
			// 요청 연결 타임아웃 및 읽기 응답 타임아웃 Exception
			catch (SocketTimeoutException ste) {
				String stackTrace = ste.toString();
				is = new ByteArrayInputStream(stackTrace.getBytes());
				clsInput = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				logger.error("", ste);
				throw ste;
			} catch (Exception e) {
				soapFault = true;
				e.printStackTrace();
				// Response 에서 gzip 인지 여부 식별 정보
				res_encode = urlConnection.getHeaderField("Content-Encoding");

				// response 가 gzip 인경우
				if ("gzip".equalsIgnoreCase(res_encode)) {
					clsInput = new BufferedReader(
							new InputStreamReader(new GZIPInputStream(urlConnection.getErrorStream()), "UTF-8"));
				} else {
					clsInput = new BufferedReader(new InputStreamReader(urlConnection.getErrorStream(), "UTF-8"));
				}
			} finally {
				// Response Http Header Fields setting
				vo.setResHttpHeaderFields(urlConnection.getHeaderFields());

				StringBuffer buffer = new StringBuffer();
				String inputLine;

				while ((inputLine = clsInput.readLine()) != null) {
					buffer.append(inputLine).append("\r\n");
				}
				// stream objects close
				if (clsInput != null)
					clsInput.close();
				if (outputStream != null)
					outputStream.close();
				if (urlConnection != null)
					urlConnection.disconnect();
				// stream objects close

				if (webserviceVo.getHeaderType() == amadeus_ecommerce_headertype
						|| webserviceVo.getHeaderType() == pip_ecommerce_headertype) {
					Map<String, List<String>> headers = urlConnection.getHeaderFields();
					List<String> jsessionIds = null;

					Set<String> keys = headers.keySet();
					for (String key : keys) {
						if (StringUtils.equalsIgnoreCase(key, "Set-Cookie")) {
							jsessionIds = headers.get(key);
							break;
						}
					}

					if (jsessionIds != null) {
						String jsessionId = "";
						jsessionId = jsessionIds.toString();
						vo.setJsessionId(new String(
								jsessionId.substring(jsessionId.indexOf("=") + 1, jsessionId.lastIndexOf(";"))));
					}
				}
				result = buffer.toString();

				if (webserviceVo.getHeaderType() == amadeus_altea_headertype
						|| webserviceVo.getHeaderType() == pip_altea_headertype) {
					if (soapFault) {
						if (vo.getPipsessionType() != dedicated) {
							logger.error("soap fault message :: " + result);
							inputLine = parseFaultString(result);
							// soap fault 발생 시 sign-out 처리 대상 체크
							boolean isFaultCodeCheck = faultCodeCheck(inputLine);
							if (isFaultCodeCheck) {
								vo.getAlteasessionVO().setSendFaultSignOut(true);
								this.destroySession(vo);
								if (logger.isInfoEnabled())
									logger.info("destroy session completed !!");
							}
							/*
							 * 2014.05.26 (IBE 요청) 특정 업무에서 soap fault 시에
							 * PNR_IGNORE (roll-back 수행을 위한..) 처리를 위해 F/W 에서
							 * session release 처리를 하지않고 Biz 구현 Application 에서
							 * 처리함.
							 */
							else {
								/*
								 * 2014.06.11 (PAS 협의) PAS 시스템만 releaseSession 을
								 * 호출해 줘야 함. F/W 에서 releaseSession 을 호출 하여 세션 풀에
								 * 반납해줘야 함.
								 */
								if (vo.getPiprequestSystem() != null
										&& "PAS".equalsIgnoreCase(vo.getPiprequestSystem())) {
									this.releaseSession(vo);
									if (logger.isInfoEnabled())
										logger.info(vo.getPiprequestSystem() + " release session completed !!");
								}
							}
						}
					}

					if (vo.getAlteasessionVO() != null) {
						vo.getAlteasessionVO().setLastQueryDate(System.currentTimeMillis());
						SessionClient client = getClassifySessionClient(vo);
						client.updateStateful(vo.getAlteasessionVO());
						logger.info("session updateStateful completed !!");
					}
				}
			}
		}
		return result;
	}

	private boolean isQueryCompress(String target) {
		return "ON".equalsIgnoreCase(propertiesService.getString(target, "OFF"));
	}

	private boolean compressCheck(HttpURLConnection urlConnection) {
		urlConnection.setRequestProperty("Content-Encoding", "gzip");
		urlConnection.setRequestProperty("Accept-Encoding", "gzip");
		return true;
	}

	/**
	 * Description : UrlConnection방식의 웹서비스에서 사용할 vo객체 설정
	 *
	 * @param WebServiceVo
	 *            vo
	 * @return WebServiceVo
	 */
	public WebServiceVo setWebServiceVo(WebServiceVo webserviceVo) throws Exception {
		WebServiceVo result = new WebServiceVo();
		result.setReadTimeOut(webserviceVo.getReadTimeOut());

		if (StringUtils.isNotBlank(webserviceVo.getReserved1())){
			result.setReserved1(webserviceVo.getReserved1());
		}
		if (StringUtils.isNotBlank(webserviceVo.getReserved2())){
			result.setReserved2(webserviceVo.getReserved2());
		}
		if (StringUtils.isNotBlank(webserviceVo.getReserved3())){
			result.setReserved3(webserviceVo.getReserved3());
		}
		if (StringUtils.isNotBlank(webserviceVo.getReserved4())){
			result.setReserved4(webserviceVo.getReserved4());
		}
		if (StringUtils.isNotBlank(webserviceVo.getReserved5())){
			result.setReserved5(webserviceVo.getReserved5());
		}

		if (webserviceVo.getHost().equals("pip.altea.host")) {
			Session session = getSession(webserviceVo);

			result.setPipsession(session);

			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);

			result.setHeaderType(pip_altea_headertype);
			result.setHost(pipEndPointUrlNullCheck(webserviceVo));
			result.setOperationName(webserviceVo.getOperationName());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(propertiesService.getProperty("pip.altea.soapaction.url") + "/"
					+ propertiesService.getProperty(webserviceVo.getOperationName()));
			result.setPiprequestSystem(webserviceVo.getPiprequestSystem());
			result.setPipemployeeNumber(webserviceVo.getPipemployeeNumber());
			result.setPiplssuserId(webserviceVo.getPiplssuserId());
			result.setPipSourceofficeId(webserviceVo.getPipSourceofficeId());
			result.setPipuserName(webserviceVo.getPipuserName());
			result.setPippassWord(webserviceVo.getPippassWord());
			result.setPipdutyCode(webserviceVo.getPipdutyCode());
			result.setGuid(webserviceVo.getGuid());
			result.setCompanyName(webserviceVo.getCompanyName());
			result.setWorkstationId(webserviceVo.getWorkstationId());
			result.setxAtcOption(webserviceVo.getxAtcOption());
		} else if (webserviceVo.getHost().equals("pip.ecommerce.host")) {
			result.setHeaderType(pip_ecommerce_headertype);

			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);

			// 2013.11.26 일 IBE 변경요청
			result.setHost(pipEndPointUrlNullCheck(webserviceVo));
			result.setBodyXml(webserviceVo.getBodyXml());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(propertiesService.getProperty("pip.ecommerce.soapaction.url") + "/" + "E_Retail");
			result.setPiprequestSystem(webserviceVo.getPiprequestSystem());
			result.setPipemployeeNumber(webserviceVo.getPipemployeeNumber());
			result.setPiplssuserId(webserviceVo.getPiplssuserId());
			result.setPipSourceofficeId(webserviceVo.getPipSourceofficeId());
			result.setPipuserName(webserviceVo.getPipuserName());
			result.setPippassWord(webserviceVo.getPippassWord());
			result.setPipdutyCode(webserviceVo.getPipdutyCode());
			result.setGuid(webserviceVo.getGuid());
			result.setCompanyName(webserviceVo.getCompanyName());
			result.setWorkstationId(webserviceVo.getWorkstationId());
			result.setJsessionId(webserviceVo.getJsessionId());
			result.setEdgeproxycip(webserviceVo.getEdgeproxycip());
			result.setXinfflowCode(webserviceVo.getXinfflowCode());
			result.setXinfoperation(webserviceVo.getXinfoperation());
		} else if (webserviceVo.getHost().equals("amadeus.altea.host")) {
			Session session = getSession(webserviceVo);
			result.setPipsession(session);
			result.setHeaderType(amadeus_altea_headertype);
			result.setHost(propertiesService.getProperty(webserviceVo.getHost()));
			result.setOperationName(webserviceVo.getOperationName());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(
					(new StringBuilder(String.valueOf(propertiesService.getProperty("amadeus.altea.soapaction.url"))))
							.append("/").append(propertiesService.getProperty(webserviceVo.getOperationName()))
							.toString());
			result.setMessageId(webserviceVo.getMessageId());
			result.setGuid(webserviceVo.getGuid());
		} else if (webserviceVo.getHost().equals("amadeus.ecommerce.host")) {
			Session session = sessionNullCheck(webserviceVo);
			result.setPipsession(session);
			result.setHeaderType(amadeus_ecommerce_headertype);
			result.setHost(propertiesService.getProperty(webserviceVo.getHost()));
			result.setJsessionId(webserviceVo.getJsessionId());
			result.setEdgeproxycip(webserviceVo.getEdgeproxycip());
		} else if (webserviceVo.getHost().equals("pip.ods.host")) {
			Session session = sessionNullCheck(webserviceVo);
			result.setPipsession(session);

			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);

			result.setHeaderType(pip_ods_headertype);
			result.setHost(propertiesService.getProperty(webserviceVo.getHost()));
			result.setOperationName(webserviceVo.getOperationName());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(
					(new StringBuilder(String.valueOf(propertiesService.getProperty("pip.ods.soapaction.url"))))
							.append("/").append(propertiesService.getProperty(webserviceVo.getOperationName()))
							.toString());
			result.setPiprequestSystem(webserviceVo.getPiprequestSystem());
			result.setPipemployeeNumber(webserviceVo.getPipemployeeNumber());
			result.setPiplssuserId(webserviceVo.getPiplssuserId());
			result.setPipSourceofficeId(webserviceVo.getPipSourceofficeId());
			result.setPipuserName(webserviceVo.getPipuserName());
			result.setPippassWord(webserviceVo.getPippassWord());
			result.setPipdutyCode(webserviceVo.getPipdutyCode());
			result.setGuid(webserviceVo.getGuid());
			result.setCompanyName(webserviceVo.getCompanyName());
			result.setWorkstationId(webserviceVo.getWorkstationId());
		} else {
			result.setHost(webserviceVo.getHost());
			if (BooleanUtils.isTrue(webserviceVo.isOuterApi())) {
				result.setHeaderType(custom_headertype);
			} else {
				result.setHeaderType(pid_headertype);
				result.setWsap(webserviceVo.getWsap());
				result.setSoapAction(webserviceVo.getSoapAction());
				result.setPiprequestSystem(webserviceVo.getPiprequestSystem());
				result.setPipemployeeNumber(webserviceVo.getPipemployeeNumber());
				result.setPiplssuserId(webserviceVo.getPiplssuserId());
				result.setPipSourceofficeId(webserviceVo.getPipSourceofficeId());
				result.setPipuserName(webserviceVo.getPipuserName());
				result.setPippassWord(webserviceVo.getPippassWord());
				result.setPipdutyCode(webserviceVo.getPipdutyCode());
				result.setGuid(webserviceVo.getGuid());
				result.setCompanyName(webserviceVo.getCompanyName());
				result.setWorkstationId(webserviceVo.getWorkstationId());

				Session session = sessionNullCheck(webserviceVo);
				result.setPipsession(session);

				String mustUnderstand = "";
				mustUnderstand = mustUnderstandNullCheck(webserviceVo);
				result.setMustUnderstand(mustUnderstand);
			}
		}
		result.setBodyXml(webserviceVo.getBodyXml());
		result.setRequestMethod(webserviceVo.getRequestMethod());

		return result;
	}

	public pip_service_library.pip_session.Session sessionNullCheck(WebServiceVo webserviceVo) {

		Session result = new Session();

		if (webserviceVo.getPipsession() == null) {

			result.setSecurityToken("");
			result.setSequenceNumber("");
			result.setSessionId("");

			if (StringUtils.isBlank(webserviceVo.getPipsessionType())) {
				result.setSessionType("");
			} else {
				result.setSessionType(webserviceVo.getPipsessionType());
			}
		} else {
			result = webserviceVo.getPipsession();
		}
		return result;
	}

	/**
	 * Description : Amadeus altea 용 헤더 설정
	 *
	 * @param WebServiceVo
	 *            vo
	 * @return String
	 */
	protected String getAmadeusAlteaHeader(WebServiceVo webserviceVo) {
		StringBuilder result = new StringBuilder();
		result.append("").append("<?xml version='1.0' encoding='UTF-8'?>")
				.append("<soapenv:Envelope xmlns:wsaw=\"http://www.w3.org/2005/08/addressing\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:link=\"http://wsdl.amadeus.com/2010/06/ws/Link_v1\" xmlns:wbs=\"http://xml.amadeus.com/ws/2009/01/WBS_Session-2.0.xsd\"><soapenv:Header><link:TransactionFlowLink><link:Consumer><link:UniqueID>")
				.append(webserviceVo.getGuid()).append("</link:UniqueID>").append("</link:Consumer>")
				.append("</link:TransactionFlowLink>").append("<wsaw:Action>").append(webserviceVo.getSoapAction())
				.append("</wsaw:Action>").append("<wsaw:MessageID>").append(webserviceVo.getMessageId())
				.append("</wsaw:MessageID>").append("<wsaw:To>").append(webserviceVo.getHost()).append("/")
				.append(webserviceVo.getWsap()).append("</wsaw:To>").append("<wbs:Session>").append("<wbs:SessionId>")
				.append(webserviceVo.getPipsession().getSessionId()).append("</wbs:SessionId>")
				.append("<wbs:SequenceNumber>").append(webserviceVo.getPipsession().getSequenceNumber())
				.append("</wbs:SequenceNumber>").append("<wbs:SecurityToken>")
				.append(webserviceVo.getPipsession().getSecurityToken()).append("</wbs:SecurityToken>")
				.append("</wbs:Session>").append("</soapenv:Header>").append("<soapenv:Body>")
				.append(webserviceVo.getBodyXml()).append("</soapenv:Body>").append("</soapenv:Envelope>");

		return result.toString();
	}

	/**
	 * Description : pip altea 용 헤더 설정
	 *
	 * @param WebServiceVo
	 *            vo
	 * @return String
	 */
	protected String getPipAlteaHeader(WebServiceVo webserviceVo) {
		StringBuilder sb = new StringBuilder();

		sb.append("<?xml version='1.0' encoding='UTF-8'?>");
		sb.append(
				"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pips=\"http://PIP_Service_Library/PIP_Session\" xmlns:pip=\"http://PIP_Service_Library/PIP_Processing\">");
		sb.append("<soapenv:Header>");
		sb.append("<wsse:Security soapenv:mustUnderstand=\"").append(webserviceVo.getMustUnderstand()).append(
				"\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">");
		sb.append(
				"<wsse:UsernameToken wsu:Id=\"UsernameToken-1\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">");
		sb.append("<wsse:Username>").append(webserviceVo.getPipuserName()).append("</wsse:Username>");
		sb.append(
				"<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">")
				.append(webserviceVo.getPippassWord()).append("</wsse:Password>");
		sb.append("</wsse:UsernameToken>");
		sb.append("</wsse:Security>");
		sb.append("<pips:Session>");
		sb.append("<pips:sessionType>").append(webserviceVo.getPipsession().getSessionType())
				.append("</pips:sessionType>");
		sb.append("<pips:sessionId>").append(webserviceVo.getPipsession().getSessionId()).append("</pips:sessionId>");
		sb.append("<pips:sequenceNumber>").append(webserviceVo.getPipsession().getSequenceNumber())
				.append("</pips:sequenceNumber>");
		sb.append("<pips:securityToken>").append(webserviceVo.getPipsession().getSecurityToken())
				.append("</pips:securityToken>");
		sb.append("</pips:Session>");
		sb.append("<pip:ProcessingFlow>");
		sb.append("<pip:guid>").append(webserviceVo.getGuid()).append("</pip:guid>");
		sb.append("<pip:requestSystem>").append(webserviceVo.getPiprequestSystem()).append("</pip:requestSystem>");
		sb.append("<pip:employeeNo>").append(webserviceVo.getPipemployeeNumber()).append("</pip:employeeNo>");
		sb.append("<pip:lssUserId>").append(webserviceVo.getPiplssuserId()).append("</pip:lssUserId>");
		sb.append("<pip:officeId>").append(webserviceVo.getPipSourceofficeId()).append("</pip:officeId>");
		sb.append("<pip:dutyCode>").append(webserviceVo.getPipdutyCode()).append("</pip:dutyCode>");
		sb.append("<pip:wsap>").append(webserviceVo.getWsap()).append("</pip:wsap>");
		sb.append("<pip:companyName>").append(webserviceVo.getCompanyName()).append("</pip:companyName>");
		sb.append("<pip:workstationId>").append(webserviceVo.getWorkstationId()).append("</pip:workstationId>");
		sb.append(setReserved(webserviceVo));
		sb.append("</pip:ProcessingFlow>");
		sb.append("</soapenv:Header>");
		sb.append("<soapenv:Body>").append(webserviceVo.getBodyXml()).append("</soapenv:Body>");
		sb.append("</soapenv:Envelope>");

		return sb.toString();
	}

	private String setReserved(WebServiceVo webserviceVo) {
		StringBuilder sb = new StringBuilder();
		if (webserviceVo.getReserved1() != null) {
			sb.append("<pip:Reserved1>").append(webserviceVo.getReserved1()).append("</pip:Reserved1>");
		}
		if (webserviceVo.getReserved2() != null) {
			sb.append("<pip:Reserved2>").append(webserviceVo.getReserved2()).append("</pip:Reserved2>");
		}
		if (webserviceVo.getReserved3() != null) {
			sb.append("<pip:Reserved3>").append(webserviceVo.getReserved3()).append("</pip:Reserved3>");
		}
		if (webserviceVo.getReserved4() != null) {
			sb.append("<pip:Reserved4>").append(webserviceVo.getReserved4()).append("</pip:Reserved4>");
		}
		if (webserviceVo.getReserved5() != null) {
			sb.append("<pip:Reserved5>").append(webserviceVo.getReserved5()).append("</pip:Reserved5>");
		}

		return sb.toString();
	}

	/**
	 * Description : pip ods 용 헤더 설정
	 *
	 * @param WebServiceVo
	 *            vo
	 * @return String
	 */
	protected String getPipOdsHeader(WebServiceVo webserviceVo) {
		String result =

				"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pips=\"http://PIP_Service_Library/PIP_Session\" xmlns:pip=\"http://PIP_Service_Library/PIP_Processing\" xmlns:pip2=\"http://PIP_Service_Library\">"
						+ "<soapenv:Header>" + "<wsse:Security soapenv:mustUnderstand=\""
						+ webserviceVo.getMustUnderstand()
						+ "\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">"
						+ "<wsse:UsernameToken wsu:Id=\"UsernameToken-1\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">"
						+ "<wsse:Username>" + webserviceVo.getPipuserName() + "</wsse:Username>"
						+ "<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">"
						+ webserviceVo.getPippassWord() + "</wsse:Password>" + "</wsse:UsernameToken>"
						+ "</wsse:Security>" + "<pips:Session>" + "<pips:sessionType>"
						+ webserviceVo.getPipsession().getSessionType() + "</pips:sessionType>" + "<pips:sessionId>"
						+ webserviceVo.getPipsession().getSessionId() + "</pips:sessionId>" + "<pips:sequenceNumber>"
						+ webserviceVo.getPipsession().getSequenceNumber() + "</pips:sequenceNumber>"
						+ "<pips:securityToken>" + webserviceVo.getPipsession().getSecurityToken()
						+ "</pips:securityToken>" + "</pips:Session>" + "<pip:ProcessingFlow>" + "<pip:guid>"
						+ webserviceVo.getGuid() + "</pip:guid>" + "<pip:requestSystem>"
						+ webserviceVo.getPiprequestSystem() + "</pip:requestSystem>" + "<pip:employeeNo>"
						+ webserviceVo.getPipemployeeNumber() + "</pip:employeeNo>" + "<pip:lssUserId>"
						+ webserviceVo.getPiplssuserId() + "</pip:lssUserId>" + "<pip:officeId>"
						+ webserviceVo.getPipSourceofficeId() + "</pip:officeId>" + "<pip:dutyCode>"
						+ webserviceVo.getPipdutyCode() + "</pip:dutyCode>" + "<pip:wsap>" + webserviceVo.getWsap()
						+ "</pip:wsap>" + "<pip:companyName>" + webserviceVo.getCompanyName() + "</pip:companyName>"
						+ "<pip:workstationId>" + webserviceVo.getWorkstationId() + "</pip:workstationId>"
						+ setReserved(webserviceVo)
						+ "</pip:ProcessingFlow>" + "</soapenv:Header>" + "<soapenv:Body>" + webserviceVo.getBodyXml()
						+ "</soapenv:Body>" + "</soapenv:Envelope>";

		return result;
	}

	/**
	 * Description : pid 용 헤더 설정
	 *
	 * @param WebServiceVo
	 *            vo
	 * @return String
	 */
	protected String getPidHeader(WebServiceVo webserviceVo) {
		String result =

				"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:pips=\"http://PIP_Service_Library/PIP_Session\" xmlns:pip=\"http://PIP_Service_Library/PIP_Processing\">"
						+ "<soapenv:Header>" + "<wsse:Security soapenv:mustUnderstand=\""
						+ webserviceVo.getMustUnderstand()
						+ "\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">"
						+ "<wsse:UsernameToken>" + "<wsse:Username>" + webserviceVo.getPipuserName()
						+ "</wsse:Username>"
						+ "<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">"
						+ webserviceVo.getPippassWord() + "</wsse:Password>" + "</wsse:UsernameToken>"
						+ "</wsse:Security>" + "<pips:Session>" + "<pips:sessionType>"
						+ webserviceVo.getPipsession().getSessionType() + "</pips:sessionType>" + "<pips:sessionId>"
						+ webserviceVo.getPipsession().getSessionId() + "</pips:sessionId>" + "<pips:sequenceNumber>"
						+ webserviceVo.getPipsession().getSequenceNumber() + "</pips:sequenceNumber>"
						+ "<pips:securityToken>" + webserviceVo.getPipsession().getSecurityToken()
						+ "</pips:securityToken>" + "</pips:Session>" + "<pip:ProcessingFlow>" + "<pip:guid>"
						+ webserviceVo.getGuid() + "</pip:guid>" + "<pip:requestSystem>"
						+ webserviceVo.getPiprequestSystem() + "</pip:requestSystem>";

		if (webserviceVo.getPipemployeeNumber() == null || webserviceVo.getPipemployeeNumber() == "")
			result += "<pip:employeeNo/>";
		else
			result += "<pip:employeeNo>" + webserviceVo.getPipemployeeNumber() + "</pip:employeeNo>";

		result += "<pip:lssUserId>" + webserviceVo.getPiplssuserId() + "</pip:lssUserId>" + "<pip:officeId>"
				+ webserviceVo.getPipSourceofficeId() + "</pip:officeId>";

		if (webserviceVo.getPipdutyCode() == null || webserviceVo.getPipdutyCode() == "")
			result += "<pip:dutyCode/>";
		else
			result += "<pip:dutyCode>" + webserviceVo.getPipdutyCode() + "</pip:dutyCode>";

		result += "<pip:wsap>" + webserviceVo.getWsap() + "</pip:wsap>"
				+ "<pip:companyName>"+ webserviceVo.getCompanyName() + "</pip:companyName>"
				+ "<pip:workstationId>" + webserviceVo.getWorkstationId() + "</pip:workstationId>"
				+ setReserved(webserviceVo)
				+ "</pip:ProcessingFlow>"
				+ "</soapenv:Header>" + "<soapenv:Body>" + webserviceVo.getBodyXml() + "</soapenv:Body>"
				+ "</soapenv:Envelope>";

		return result;
	}

	/**
	 * Description : Amadeus ecommerce 용 헤더 설정 (직결)
	 *
	 * @param WebServiceVo
	 *            vo
	 * @return String
	 */
	protected String getAmadeusEcommerceHeader(WebServiceVo webserviceVo) {
		StringBuilder result = new StringBuilder();

		result.append("").append("<?xml version='1.0' encoding='UTF-8'?>")
				.append("<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SOAP-ENV:Header /><SOAP-ENV:Body><ns1:process xmlns:ns1=\"urn:TripFlow\"><request xsi:type=\"xsd:string\">")
				.append(webserviceVo.getBodyXml()).append("</request>").append("</ns1:process>")
				.append("</SOAP-ENV:Body>").append("</SOAP-ENV:Envelope>");

		return result.toString();
	}

	/**
	 * Description : Pip ecommerce 용 헤더 설정
	 *
	 * @param WebServiceVo
	 *            vo
	 * @return String
	 */
	protected String getPipEcommerceHeader(WebServiceVo webserviceVo) {
		StringBuilder result = new StringBuilder();

		result.append("").append("<?xml version='1.0' encoding='UTF-8'?>")
				.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pips=\"http://PIP_Service_Library/PIP_Session\" xmlns:pip=\"http://PIP_Service_Library/PIP_Processing\" xmlns:ret=\"http://PIP1A_Retail/Retail/Retail_Request\">")
				.append("<soapenv:Header>")
				.append("<wsse:Security soapenv:mustUnderstand=\"" + webserviceVo.getMustUnderstand()
						+ "\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">")
				.append("<wsse:UsernameToken wsu:Id=\"UsernameToken-1\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">")
				.append("<wsse:Username>" + webserviceVo.getPipuserName() + "</wsse:Username>")
				.append("<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">"
						+ webserviceVo.getPippassWord() + "</wsse:Password>")
				.append("</wsse:UsernameToken>").append("</wsse:Security>").append("<pips:Session>")
				.append("<pips:sessionType>3</pips:sessionType>").append("<pips:sessionId></pips:sessionId>")
				.append("<pips:sequenceNumber></pips:sequenceNumber>")
				.append("<pips:securityToken></pips:securityToken>").append("</pips:Session>")
				.append("<pip:ProcessingFlow>").append("<pip:guid>" + webserviceVo.getGuid() + "</pip:guid>")
				.append("<pip:requestSystem>" + webserviceVo.getPiprequestSystem() + "</pip:requestSystem>")
				.append("<pip:employeeNo>" + webserviceVo.getPipemployeeNumber() + "</pip:employeeNo>")
				.append("<pip:lssUserId>" + webserviceVo.getPiplssuserId() + "</pip:lssUserId>")
				.append("<pip:officeId>" + webserviceVo.getPipSourceofficeId() + "</pip:officeId>")
				.append("<pip:dutyCode>" + webserviceVo.getPipdutyCode() + "</pip:dutyCode>")
				.append("<pip:wsap>" + webserviceVo.getWsap() + "</pip:wsap>")
				.append("<pip:companyName>" + webserviceVo.getCompanyName() + "</pip:companyName>")
				.append("<pip:workstationId>" + webserviceVo.getWorkstationId() + "</pip:workstationId>")
				.append(setReserved(webserviceVo))
				.append("</pip:ProcessingFlow>").append("</soapenv:Header>").append("<soapenv:Body>")
				.append("<ret:E_Retail>").append("<request>").append(webserviceVo.getBodyXml()).append("</request>")
				.append("</ret:E_Retail>").append("</soapenv:Body>").append("</soapenv:Envelope>");

		return result.toString();
	}

	public String parseFaultString(String xmlResponse) throws Exception {
		String result = null;

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(xmlResponse));

		Document doc = dbBuilder.parse(is);
		NodeList nList = null;
		int isTagName = 0;
		String[] soapFault = { "soapenv:Fault", "soap:Fault", "SOAP-ENV:Fault", "env:Fault" };

		for (String str : soapFault) {
			isTagName = doc.getElementsByTagName(str).getLength();
			if (isTagName > 0) {
				nList = doc.getElementsByTagName(str);
				break;
			}
		}

		/*
		 * soapFault 배열에 정의되지 않은 soap fault태그가 존재 하면 null 발생 존재 하지 않는 태그 발견시 배열에
		 * 추가..
		 */
		// if(nList == null)
		// {
		// throw new NullPointerException("[soapenv:Fault, soap:Fault,
		// SOAP-ENV:Fault, env:Fault] ==> 해당 범위에 정의 되지 않은 SOAP FAULT");
		//
		// }
		if (nList != null) {
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					result = getTagValue("faultstring", eElement);
				}
			}
		}
		return result;
	}

	@Override
	public Session parseSession(String xmlResponse) throws Exception {

		Session session = null;

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(xmlResponse));

		Document doc = dbBuilder.parse(is);
		NodeList nList = doc.getElementsByTagName("awss:Session");

		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;

				String sessionId = getTagValue("awss:SessionId", eElement);
				String sequenceNumber = getTagValue("awss:SequenceNumber", eElement);
				String securityToken = getTagValue("awss:SecurityToken", eElement);

				session = new Session();
				session.setSecurityToken(securityToken);
				session.setSequenceNumber(sequenceNumber);
				session.setSessionId(sessionId);
			}
		}
		return session;
	}

	public pip_service_library.pip_session.Session parsePipSession(String xmlResponse) throws Exception {
		pip_service_library.pip_session.Session session = null;

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(xmlResponse));

		Document doc = dbBuilder.parse(is);
		NodeList nList = doc.getElementsByTagName("pips:Session");

		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;

				String sessionType = getTagValue("pips:sessionType", eElement);
				String sessionId = getTagValue("pips:sessionId", eElement);
				String sequenceNumber = getTagValue("pips:sequenceNumber", eElement);
				String securityToken = getTagValue("pips:securityToken", eElement);

				session = new pip_service_library.pip_session.Session();
				session.setSessionType(sessionType);
				session.setSecurityToken(securityToken);
				session.setSequenceNumber(sequenceNumber);
				session.setSessionId(sessionId);
			}
		}
		return session;
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);

		return nValue.getNodeValue();
	}

	public String convertToPipEcommerceHttpMessage(String source) {
		source = source.replaceAll("<", "&amp;lt;");
		source = source.replaceAll(">", "&amp;gt;");
		return source;
	}

	public String convertToAmadeusEcommerceHttpMessage(String source) {
		source = source.replaceAll("<", "&lt;");
		source = source.replaceAll(">", "&gt;");
		return source;
	}

	public String convertToXmlMessage(String source) {
		source = source.replaceAll("&lt;", "<");
		source = source.replaceAll("&gt;", ">");
		source = source.replaceAll("&apos;", "'");
		return source;
	}

	public String mustUnderstandNullCheck(WebServiceVo webserviceVo) {
		return StringUtils.isNotBlank(webserviceVo.getMustUnderstand()) ? webserviceVo.getMustUnderstand() : "1";
	}

	public String pipEndPointUrlNullCheck(WebServiceVo webserviceVo) {
		return propertiesService.getProperty(StringUtils.isNotBlank(webserviceVo.getEndPointUrl())
				? webserviceVo.getEndPointUrl() : webserviceVo.getHost());
	}

	/**
	 * Session Pool 로 부터 세션을 얻어온다.
	 *
	 * @param webserviceVo
	 *            : Client Application 에서 던져주는 webservice 호출에 필요한 정보를 담고 있는
	 *            Value Object <br>
	 * @return Session : Session 객체
	 * @throws Exception
	 */
	public Session getSession(WebServiceVo webserviceVo) throws Exception {
		Session sessionResult = new Session();
		AlteaSessionVO alteasessionVO = null;
		String oid = webserviceVo.getPipSourceofficeId();
		// PIP 에서 session 이 없는 경우
		if (webserviceVo.getPipsession() == null) {
			SessionClient client = getClassifySessionClient(webserviceVo);

			try {
				if (webserviceVo.getPipsessionType() == stateless) {
					alteasessionVO = client.borrowStateless();
					if (logger.isInfoEnabled())
						logger.info("borrow stateless session !!");
				} else if (webserviceVo.getPipsessionType() == stateful) {
					alteasessionVO = client.borrowStateful();
					if (logger.isInfoEnabled())
						logger.info("borrow stateful session !!");
				} else {
					return null;
				}
			} catch (Exception e) {
				logger.error("", e);
				e.printStackTrace();
				throw new BizException("SF002", "can not borrow session!:" + oid, null);
			}
		} else {
			if (webserviceVo.getPipsession().getSessionId() != null
					&& webserviceVo.getPipsession().getSessionId() != "") {
				if (!dedicated.equals(webserviceVo.getPipsessionType())) {
					// altea Session 중복(동일시점) 사용 제어 start
					SessionClient client = getClassifySessionClient(webserviceVo);

					if (client.checkQueryInProgress(webserviceVo.getAlteasessionVO())) {
						throw new BizException("SF001", "session duplication error", null);
					}
					// altea Session 중복(동일시점) 사용 제어 end

					// PIP Session Sequence + 1 증가
					// 1. Application 에서 사용하는 session vo
					// 2. 세션 풀에서 사용하는 session vo
					webserviceVo.getPipsession().setSequenceNumber(
							String.valueOf(webserviceVo.getAlteasessionVO().getSequenceNumber() + 1));
					webserviceVo.getAlteasessionVO()
							.setSequenceNumber(webserviceVo.getAlteasessionVO().getSequenceNumber() + 1);
				}
				sessionResult = webserviceVo.getPipsession();
				return sessionResult;
			} else {
				SessionClient client = getClassifySessionClient(webserviceVo);

				try {
					if (webserviceVo.getPipsessionType() == stateless) {
						alteasessionVO = client.borrowStateless();
					} else if (webserviceVo.getPipsessionType() == stateful) {
						alteasessionVO = client.borrowStateful();
					} else {
						sessionResult = webserviceVo.getPipsession();
						return sessionResult;
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new BizException("SF002", "can not borrow session!:" + oid, null);
				}
			}
		}
		alteasessionVO.setSequenceNumber(alteasessionVO.getSequenceNumber() + 1);

		sessionResult.setSecurityToken(alteasessionVO.getSecurityToken());
		sessionResult.setSessionId(alteasessionVO.getSessionID());
		sessionResult.setSequenceNumber(String.valueOf(alteasessionVO.getSequenceNumber()));
		sessionResult.setSessionType(dedicated); // PIP에는 전부 3번만 보내야 함

		webserviceVo.setPipsession(sessionResult);
		webserviceVo.setAlteasessionVO(alteasessionVO);

		if (logger.isInfoEnabled())
			logger.info("session infomation :: " + alteasessionVO);

		return sessionResult;
	}

	/**
	 * 사용한 session id 를 세션 풀 서버에 반환한다.
	 *
	 * @param webserviceVo
	 *            : WebServiceVo 객체 <br>
	 * @return boolean : true or false
	 */
	@Override
	public Boolean releaseSession(WebServiceVo webserviceVo) throws Exception {
		if (logger.isInfoEnabled())
			logger.info("releaseSession start :: " + webserviceVo.getAlteasessionVO());

		SessionClient client = getClassifySessionClient(webserviceVo);
		Boolean bool = false;

		if (webserviceVo.getPipsessionType() == stateless) {
			webserviceVo.getAlteasessionVO().setSendFaultSignOut(false);
			client.returnStateless(webserviceVo.getAlteasessionVO());
			bool = true;
		} else if (webserviceVo.getPipsessionType() == stateful) {
			client.returnStateful(webserviceVo.getAlteasessionVO());
			bool = true;
		} else {
			return false;
		}

		webserviceVo.setPipsession(null);
		webserviceVo.setAlteasessionVO(null);

		if (logger.isInfoEnabled())
			logger.info("releaseSession end !!");

		return bool;
	}

	/**
	 * 세션풀 서버에, 사용한 session id 를 삭제하고 sign-out 을 1A에 보낸다.
	 *
	 * @param webserviceVo
	 *            : WebServiceVo 객체 <br>
	 * @return boolean : true or false
	 */
	@Override
	public Boolean destroySession(WebServiceVo webserviceVo) throws Exception {
		if (logger.isInfoEnabled())
			logger.info("destroySession start :: " + webserviceVo.getAlteasessionVO());

		SessionClient client = getClassifySessionClient(webserviceVo);
		Boolean bool = false;

		if (webserviceVo.getPipsessionType() == stateless) {
			webserviceVo.getAlteasessionVO().setSendFaultSignOut(true);
			client.destroyStateless(webserviceVo.getAlteasessionVO());
			bool = true;
		} else if (webserviceVo.getPipsessionType() == stateful) {
			webserviceVo.getAlteasessionVO().setSendFaultSignOut(true);
			client.destroyStateful(webserviceVo.getAlteasessionVO());
			bool = true;
		} else {
			return false;
		}
		webserviceVo.setPipsession(null);
		webserviceVo.setAlteasessionVO(null);

		if (logger.isInfoEnabled())
			logger.info("destroySession end !!");

		return bool;
	}

	/**
	 * stateful 시 세션 ID 를 재사용한다. <br>
	 *
	 * 1. 1A 에 사용한 세션을 재사용 할 수 있도록 PNR_IGNORE 를 보낸다.<br>
	 * 2. 사용한 session id 를 세션 풀 서버에 반환한다.
	 *
	 * @param webserviceVo
	 *            : WebServiceVo 객체 <br>
	 * @return boolean : true or false
	 */
	@Override
	public Boolean releaseReUseSession(WebServiceVo webserviceVo) throws Exception {
		Boolean bool = false;
		WebServiceVo wsvo = new WebServiceVo();
		BeanUtils.copyProperties(webserviceVo, wsvo);

		if (logger.isInfoEnabled())
			logger.info("releaseReUseSession start :: " + wsvo.getAlteasessionVO());

		// PNR_IGNORE 의 GUID 생성
		// KAL 에서 각 팀별로 부여하는 값을(requestSystem) 활용하여 GUID 생성
		DefaultGuidManager guidManager = new DefaultGuidManager(wsvo.getPiprequestSystem());
		Guid tempGuid = guidManager.getNextId();

		// PNR_IGNORE web service 을 위한 VO 셋팅
		wsvo.setGuid(tempGuid.toString()); // GUID
		wsvo.setOperationName("PNR_IGNORE"); // webservice.properties 파일의
												// Operation Key
		wsvo.setBodyXml(this.makePnrIgnoreSoapBodyMessage()); // PNR_IGNORE soap
																// body

		String responseMsg = this.call(wsvo);

		if (logger.isInfoEnabled())
			logger.info("pnr ignore response message :: " + responseMsg);

		String faultString = this.parseFaultString(responseMsg);

		// PNR_Ignore 수행 후 정상적인 Response message 를 받으면 세션 풀에 반납
		if (faultString == null) {
			SessionClient client = getClassifySessionClient(wsvo);
			// 세션 풀에 반환
			if (wsvo.getPipsessionType() == stateless) {
				// wsvo.getAlteasessionVO().setSendFaultSignOut(false);
				client.returnStateless(wsvo.getAlteasessionVO());
				bool = true;
			} else if (wsvo.getPipsessionType() == stateful) {
				client.returnStateful(wsvo.getAlteasessionVO());
				bool = true;
			} else {
				return false;
			}
		}
		// PNR_Ignore 수행 후 Soap Fault Response message 를 받으면 sign-out / destroy
		// 수행
		else {
			// soap fault 발생 시 sign-out 처리 대상 체크
			boolean isFaultCodeCheck = faultCodeCheck(faultString);
			/*
			 * "42", "93", "95", "97" 인 경우 call() 메소드에서 sign-out 처리하므로 위의 코드 제외한
			 * soap fault 인경우 sign-out 처리
			 */
			if (!isFaultCodeCheck) {
				// PAS 인 경우 call() 메소드에서 releaseSession 처리가 되므로 제외함.
				if (wsvo.getAlteasessionVO() != null) {
					SessionClient client = getClassifySessionClient(wsvo);

					if (wsvo.getPipsessionType() == stateless) {
						wsvo.getAlteasessionVO().setSendFaultSignOut(true);
						client.destroyStateless(wsvo.getAlteasessionVO());
						bool = true;
					} else if (wsvo.getPipsessionType() == stateful) {
						wsvo.getAlteasessionVO().setSendFaultSignOut(true);
						client.destroyStateful(wsvo.getAlteasessionVO());
						bool = true;
					} else {
						return false;
					}
				}
			}
		}

		webserviceVo.setPipsession(null);
		webserviceVo.setAlteasessionVO(null);
		wsvo = null;

		if (logger.isInfoEnabled())
			logger.info("releaseReUseSession end !!");

		return bool;
	}

	/**
	 * PNR IGNORE SOAP BODY MESSAGE 를 만든다.
	 *
	 * @return String : SOAP BODY MESSAGE
	 */
	private String makePnrIgnoreSoapBodyMessage() {
		StringBuilder sb = new StringBuilder();

		sb.append("<clt:PNR_Ignore xmlns:clt=\"http://xml.amadeus.com/CLTREQ_04_1_IA\">");
		sb.append("<clt:clearInformation>");
		sb.append("<clt:actionRequest>A</clt:actionRequest>");
		sb.append("</clt:clearInformation>");
		sb.append("</clt:PNR_Ignore>");

		return sb.toString();
	}

	/**
	 * Amadeus SOAP Fault Content 체크 Soap Fault 중 error code 값을 체크한다.
	 *
	 * @param inputLine
	 *            : soap fault Content 를 파싱한 faultstring 태그의 값 <br>
	 * @return boolean : true or false
	 */
	private boolean faultCodeCheck(String inputLine) {
		boolean isRtn = false;
		if (inputLine == null)
			return isRtn;
		/*
		 * strArry[0] 값이 error code 임. (error code 로 체크함.) split 해서 나온 결과 값 형태 예
		 * strArry [0] :: 95 (error code) strArry [1] :: Session (OSI Layer)
		 * strArry [2] :: Inactive conversation (Error Text)
		 */
		String[] faultCodes = { "42", "93", "95", "97" };
		String[] strArry = inputLine.split("\\|", 3);

		for (int i = 0; i < faultCodes.length; i++) {
			if (faultCodes[i].equals(strArry[0].trim())) {
				isRtn = true;
				break;
			}
		}

		return isRtn;
	}

	/**
	 * SessionClient 객체를 구분하기 위한 메소드 (IBE 요청 사항)
	 *
	 * @param webserviceVo
	 *            : WebServiceVo 객체 <br>
	 * @return SessionClient : Session Pool 에 접근할때 사용하는 객체
	 */
	private SessionClient getClassifySessionClient(WebServiceVo webserviceVo) throws Exception {
		SessionClient client = null;

		if (webserviceVo.getHost().equals("amadeus.altea.host") || webserviceVo.getHost().equals("pip.altea.host")) {
			if (StringUtils.isNotBlank(webserviceVo.getDirectSourceOfficeId())) {
				client = this.clients.getSessionClient(webserviceVo.getDirectSourceOfficeId());
			} else {
				client = this.clients.getSessionClient(webserviceVo.getPipSourceofficeId());
			}
		} else {
			client = this.clients.getSessionClient(webserviceVo.getPipSourceofficeId());
		}

		return client;
	}
}
