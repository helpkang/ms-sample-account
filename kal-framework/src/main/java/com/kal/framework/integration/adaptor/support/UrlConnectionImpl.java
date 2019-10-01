 package com.kal.framework.integration.adaptor.support;
 
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.*;

// import javax.annotation.Resource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

// import pip_service_library.pip_session.Session;

import com.kal.framework.integration.adaptor.UrlConnectionService;
import com.kal.framework.integration.adaptor.WebServiceVo;
// import com.kal.framework.properties.support.KalProperties;
// import com.kal.ibe.onea.client.SessionClient;
// import com.kal.ibe.onea.client.SessionClients;

// import org.apache.commons.lang.exception.ExceptionUtils;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import net.sf.jazzlib.GZIPInputStream;
 
public class UrlConnectionImpl implements UrlConnectionService
{
	private static Logger logger = Logger.getLogger(UrlConnectionImpl.class);
 
	// @Resource(name="propertiesService")
	// protected KalProperties propertiesService;
	protected KalProperties propertiesService = new KalProperties();
	
	private static final int amadeus_altea_headertype     = 1;
	private static final int amadeus_ecommerce_headertype = 2;
	private static final int pip_altea_headertype         = 3;
	private static final int pip_ecommerce_headertype     = 4;
	private static final int pip_ods_headertype           = 5;
	private static final int pid_headertype     		  = 6;
	
	public void init()
	{
	}
	
	@SuppressWarnings("rawtypes")
	public String call(WebServiceVo vo) throws Exception 
	{
		WebServiceVo webserviceVo = setWebServiceVo(vo);
		String result = null;
		OutputStreamWriter clsOutput = null;
		BufferedReader clsInput = null;
 
		if (webserviceVo != null)
		{
			StringBuffer buffer = new StringBuffer();
 
			URL url = new URL(webserviceVo.getHost());
			HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
			urlConnection.setConnectTimeout(Integer.parseInt(this.propertiesService.getProperty("connect.time.out")));
			urlConnection.setReadTimeout(Integer.parseInt(this.propertiesService.getProperty("read.time.out")));
			String query = "";
 
			switch (webserviceVo.getHeaderType()) 
			{
				case amadeus_altea_headertype:


					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					urlConnection.setRequestProperty("AuthType","No Authorization");
					query = getAmadeusAlteaHeader(webserviceVo);
					System.out.println("1a altea restful query : " + query);

					if (logger.isInfoEnabled()) logger.info("1a altea restful query : " + query);
					break;
				case amadeus_ecommerce_headertype:
					if ((webserviceVo.getJsessionId() != null) && (webserviceVo.getJsessionId().trim().length() > 0))
						urlConnection.setRequestProperty("Cookie", "JSESSIONID=" + webserviceVo.getJsessionId());
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					urlConnection.setRequestProperty("edgeproxy_cip", webserviceVo.getEdgeproxycip());
 
					// query = getAmadeusEcommerceHeader(webserviceVo);
//					System.out.println("1a ecommerce restful query : " + query);
					if (logger.isInfoEnabled()) logger.info("1a ecommerce restful query : " + query);
					break;
					
				case pip_altea_headertype:
					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					// query = getPipAlteaHeader(webserviceVo);
//					System.out.println("pip altea restful query : " + query);
					if (logger.isInfoEnabled()) logger.info("REQUEST MESSAGE :: " + query);
					break;
					
				case pip_ecommerce_headertype:
					if ((webserviceVo.getJsessionId() != null) && (webserviceVo.getJsessionId().trim().length() > 0)) {
						urlConnection.setRequestProperty("Cookie", "JSESSIONID=" + webserviceVo.getJsessionId());
					}
					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					urlConnection.setRequestProperty("edgeproxy_cip", webserviceVo.getEdgeproxycip());
					urlConnection.setRequestProperty("X-inf-operation", webserviceVo.getXinfoperation());
					urlConnection.setRequestProperty("X-inf-flowCode", webserviceVo.getXinfflowCode());
 
					query = getPipEcommerceHeader(webserviceVo);
 
					System.out.println("pip ecommerce restful query : " + query);
					if (logger.isInfoEnabled()) logger.info("pip ecommerce restful query : " + query);
					break;
				case pip_ods_headertype:
					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					// query = getPipOdsHeader(webserviceVo);
//					System.out.println("pip ods restful query : " + query);
					if (logger.isInfoEnabled()) logger.info("pip ods query : " + query);
					break;
				case pid_headertype:
					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					// query = getPidHeader(webserviceVo);
					System.out.println("pid restful query : " + query);
					if (logger.isInfoEnabled()) logger.info("pid restful query : " + query);
					break;
					
				default:
					if (!logger.isInfoEnabled()) logger.info("current host is not exist : " + query);
			}
 
			urlConnection.setRequestMethod(webserviceVo.getRequestMethod());
			urlConnection.setDoInput(true);
			urlConnection.setDoOutput(true);
			urlConnection.setUseCaches(false);
			
			urlConnection.setRequestProperty("Content-Length", String.valueOf(query.length()) );			
			urlConnection.setRequestProperty("Accept", "application/xml");
//			urlConnection.setRequestProperty("Accept-Encoding", "gzip,deflate");
 
			clsOutput = new OutputStreamWriter(urlConnection.getOutputStream());
			clsOutput.write(query);
			clsOutput.flush();
			vo.setQuery(query);

			boolean soapFault = false;
			String res_encode = null;
			InputStream is = null;
			
			try
			{
				is = urlConnection.getInputStream();
				
				// Response 에서 gzip 인지 여부 식별 정보
	        	res_encode = urlConnection.getHeaderField("Content-Encoding");
	        	
	        	// response 가 gzip 인경우 
	        	if("gzip".equalsIgnoreCase(res_encode))
	        	{
	        		clsInput = new BufferedReader(new InputStreamReader(new GZIPInputStream(is), "UTF-8"));
	        	}
	        	else
	        	{
	        		clsInput = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        	}
//				clsInput = new BufferedReader(new InputStreamReader(new GZIPInputStream(urlConnection.getInputStream()), "UTF-8"));
			}
			catch(Exception e)
			{
				soapFault = true;
//				e.printStackTrace();
				logger.error("", e);
//				if(logger.isDebugEnabled())
//				{
//					logger.debug("[ " + "HOST = " + vo.getHost() + ", WSAP = " + vo.getWsap() + ", OperationName = " + vo.getOperationName() + " ]");
//					logger.debug("SOAP FAULT TRACE :: " + e.fillInStackTrace());
//				}
				
				// Response 에서 gzip 인지 여부 식별 정보
	        	res_encode = urlConnection.getHeaderField("Content-Encoding");
	        	
	        	// response 가 gzip 인경우 
	        	if("gzip".equalsIgnoreCase(res_encode))
	        	{
	        		clsInput = new BufferedReader(new InputStreamReader(new GZIPInputStream(urlConnection.getErrorStream()), "UTF-8" ) );
	        	}
	        	else
	        	{
	        		clsInput = new BufferedReader(new InputStreamReader(urlConnection.getErrorStream(), "UTF-8"));
	        	}
			}
			finally
			{
				String inputLine;
				while ((inputLine = clsInput.readLine()) != null)
				{
					buffer.append( inputLine ).append("\r\n");
				}
				
				if(clsInput != null) clsInput.close();
				if(clsOutput != null) clsOutput.close();
				if(urlConnection != null) urlConnection.disconnect();
				
				// E-commerce 인경우
				if ((webserviceVo.getHeaderType() == amadeus_ecommerce_headertype) || (webserviceVo.getHeaderType() == pip_ecommerce_headertype))
				{
					
					Map headers = urlConnection.getHeaderFields();					
					List jsessionIds = (List)headers.get("Set-Cookie");
 
					if (jsessionIds != null) 
					{
						String jsessionId = "";
						jsessionId = jsessionIds.toString();
 
						vo.setJsessionId(new String(jsessionId.substring(jsessionId.indexOf("=") + 1, jsessionId.lastIndexOf(";"))));
					}
				}
				result = buffer.toString();
				
				// Response Message Logging
				if(soapFault)
				{
					if(logger.isInfoEnabled()) logger.info("RESPONSE MESSAGE(FAULT) :: " + result );
				}
				else
				{
					if(logger.isInfoEnabled()) logger.info("RESPONSE MESSAGE(NORMAL) :: " + result );
					
				}
	        }
    	}
		return result;
	}
 
	public WebServiceVo setWebServiceVo(WebServiceVo webserviceVo)
	{
		WebServiceVo result = new WebServiceVo();
 
		if (webserviceVo.getHost().equals("pip.altea.host")) {
			// Session session = webserviceVo.getPipsession();
			// session = sessionNullCheck(webserviceVo);
			// result.setPipsession(session);
 
			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);
 
			result.setHeaderType(3);
//			result.setHost(pipEndPointUrlNullCheck(webserviceVo));
			result.setHost(this.propertiesService.getProperty(webserviceVo.getHost()));
			result.setOperationName(webserviceVo.getOperationName());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(this.propertiesService.getProperty("pip.altea.soapaction.url") + "/" + this.propertiesService.getProperty(webserviceVo.getOperationName()));
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
		}
		else if (webserviceVo.getHost().equals("pip.ecommerce.host"))
		{
			result.setHeaderType(4);
 
			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);
 
			result.setHost(this.propertiesService.getProperty(webserviceVo.getHost()));
			result.setBodyXml(webserviceVo.getBodyXml());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(this.propertiesService.getProperty("pip.ecommerce.soapaction.url") + "/" + "E_Commerce");
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
		}
		else if (webserviceVo.getHost().equals("amadeus.altea.host"))
		{		   
			// result.setPipsession(webserviceVo.getPipsession());
		
			result.setHeaderType(1);
			result.setHost(this.propertiesService.getProperty(webserviceVo.getHost()));
			result.setOperationName(webserviceVo.getOperationName());
			result.setWsap(webserviceVo.getWsap());

			result.setSoapAction(this.propertiesService.getProperty("amadeus.altea.soapaction.url") + "/" + this.propertiesService.getProperty(webserviceVo.getOperationName()));
			result.setMessageId(webserviceVo.getMessageId());
			result.setGuid(webserviceVo.getGuid());
		}
		else if (webserviceVo.getHost().equals("amadeus.ecommerce.host")) 
		{
			// Session session = sessionNullCheck(webserviceVo);
			// result.setPipsession(session);
			result.setHeaderType(2);
			result.setHost(this.propertiesService.getProperty(webserviceVo.getHost()));
			result.setJsessionId(webserviceVo.getJsessionId());
			result.setEdgeproxycip(webserviceVo.getEdgeproxycip());
		}	   
		else if (webserviceVo.getHost().equals("pip.ods.host"))
		{
			// Session session = sessionNullCheck(webserviceVo);
			// result.setPipsession(session);

			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);

			result.setHeaderType(5);
			result.setHost(this.propertiesService.getProperty(webserviceVo.getHost()));
			result.setOperationName(webserviceVo.getOperationName());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(this.propertiesService.getProperty("pip.altea.soapaction.url") + "/" + this.propertiesService.getProperty(webserviceVo.getOperationName()));
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
		}
		else
		{
			// Session session = sessionNullCheck(webserviceVo);
			// result.setPipsession(session);

			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);

			result.setHeaderType(6);
			result.setHost(webserviceVo.getHost());

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
		}
		result.setBodyXml(webserviceVo.getBodyXml());
		result.setRequestMethod(webserviceVo.getRequestMethod());

		return result;
	}
	
	@SuppressWarnings("rawtypes")
	public String call(WebServiceVo vo, KalProperties properties) throws Exception
	{
		WebServiceVo webserviceVo = setWebServiceVo(vo, properties);
		String result = null;
		OutputStreamWriter clsOutput = null;
		BufferedReader clsInput = null;

		if (webserviceVo != null)
		{
			StringBuffer buffer = new StringBuffer();

			URL url = new URL(webserviceVo.getHost());
			HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
			String query = "";

			switch (webserviceVo.getHeaderType())
			{
				case 1:
					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					query = getAmadeusAlteaHeader(webserviceVo);
					System.out.println("1a altea restful query : " + query);
					if (!logger.isInfoEnabled()) break;
					logger.info("1a altea restful query : " + query);
					break;
					
				case 2:
					if ((webserviceVo.getJsessionId() != null) && (webserviceVo.getJsessionId().trim().length() > 0))
					{
						urlConnection.setRequestProperty("Set-Cookie", "JSESSIONID=" + webserviceVo.getJsessionId());
					}
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					// query = getAmadeusEcommerceHeader(webserviceVo);
					System.out.println("1a ecommerce restful query : " + query);
					if (!logger.isInfoEnabled()) break;
					logger.info("1a ecommerce restful query : " + query);
					break;
					
				case 3:
					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					// query = getPipAlteaHeader(webserviceVo);
					System.out.println("pip altea restful query : " + query);
					if (!logger.isInfoEnabled()) break;
					logger.info("pip altea restful query : " + query);
					break;
					
				case 4:
					if ((webserviceVo.getJsessionId() != null) && (webserviceVo.getJsessionId().trim().length() > 0)) 
					{
						urlConnection.setRequestProperty("Set-Cookie", "JSESSIONID=" + webserviceVo.getJsessionId());
					}
					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					query = getPipEcommerceHeader(webserviceVo);

					System.out.println("pip ecommerce restful query : " + query);
					if (!logger.isInfoEnabled()) break;
					logger.info("pip ecommerce restful query : " + query);
					break;
					
				case 5:		   		
					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					// query = getPipOdsHeader(webserviceVo);
					System.out.println("pip ods restful query : " + query);
					if (!logger.isInfoEnabled()) break;
					logger.info("pip ods query : " + query);
					break;
					
				case 6:
					urlConnection.setRequestProperty("SOAPAction", "\"" + webserviceVo.getSoapAction() + "\"");
					urlConnection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
					// query = getPidHeader(webserviceVo);
					System.out.println("pid restful query : " + query);
					if (!logger.isInfoEnabled()) break;
					logger.info("pid restful query : " + query);
					break;
					
				default:
					if (!logger.isInfoEnabled()) break;
					logger.info("current host is not exist : " + query);
			}
 
			urlConnection.setRequestMethod(webserviceVo.getRequestMethod());
			urlConnection.setDoInput(true);
			urlConnection.setDoOutput(true);
			urlConnection.setUseCaches(false);

			urlConnection.setRequestProperty("Content-Length", String.valueOf(query.length()));
			urlConnection.setRequestProperty("Accept", "application/xml");

			clsOutput = new OutputStreamWriter(urlConnection.getOutputStream());
			clsOutput.write(query);
			clsOutput.flush();
			vo.setQuery(query);
			
			boolean soapFault = false;
	        String res_encode = null;
	        InputStream is = null;
			
			try 
			{
				clsInput = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
			}
			catch (Exception e)
			{
				soapFault = true;
				e.printStackTrace();
				clsInput = new BufferedReader(new InputStreamReader(urlConnection.getErrorStream(), "UTF-8"));
				
				String inputLine;
				while ((inputLine = clsInput.readLine()) != null)
				{
					buffer.append(inputLine);
				}				
				
				clsOutput.close();
				clsInput.close();

				if ((webserviceVo.getHeaderType() == 2) || (webserviceVo.getHeaderType() == 4)) 
				{
					Map headers = urlConnection.getHeaderFields();
					List jsessionIds = (List)headers.get("Set-Cookie");

					String jsessionId = "";
					jsessionId = jsessionIds.toString();

					vo.setJsessionId(new String(jsessionId.substring(jsessionId.indexOf("=") + 1, jsessionId.lastIndexOf(";"))));
				}
				result = buffer.toString();
			}
			finally
			{
				String inputLine;
		        while ((inputLine = clsInput.readLine()) != null)
		        	buffer.append( inputLine ).append("\r\n");   //	buffer.append( inputLine ).append("\r\n");
		
		        if(clsInput != null)
		        	clsInput.close();       
		        if(clsOutput != null)
		        	clsOutput.close();
		        if(urlConnection != null)
		        	urlConnection.disconnect();
		        
		        if(webserviceVo.getHeaderType() == amadeus_ecommerce_headertype || webserviceVo.getHeaderType() == pip_ecommerce_headertype){
		        	Map<String, List<String>> headers = urlConnection.getHeaderFields();
		        	List<String> jsessionIds = headers.get("Set-Cookie");
		        	
		        	if(jsessionIds != null){
		        	 	String jsessionId = "";
			        	jsessionId = jsessionIds.toString();
			        //	System.out.println("jsessionId : " + jsessionId);
			        	vo.setJsessionId(new String(jsessionId.substring(jsessionId.indexOf("=")+1, jsessionId.lastIndexOf(";"))));	
		        	}
		        }
			    result = buffer.toString();
			    
			    /*if(webserviceVo.getHeaderType() == amadeus_altea_headertype || webserviceVo.getHeaderType() == pip_altea_headertype)
			    {
			    	if(soapFault)
			    	{
		              	 if(vo.getPipsessionType() != dedicated)
		              	 {
		              		inputLine = this.parseFaultString(result);
		              		if(!(inputLine.toLowerCase().contains("session")) )
		              		{
		              			vo.getAlteasessionVO().sendFaultSignOut = true;
		              		}
		              		else
		              		{
		              			vo.getAlteasessionVO().sendFaultSignOut = false;
		              		}
		              		this.destroySession(vo);  //altea세션 정보는 비지니스 개발자에게 돌려주기 위해서 vo에 셋팅해놨음, 그래서 webservicevo를 넘기지 않고 vo를 넘김
		              	 }
		        	}
			    	if(vo.getAlteasessionVO() != null)
			    	{
        				vo.getAlteasessionVO().setLastQueryDate(System.currentTimeMillis());
			    	}
			    }*/
			}
		}
		return result;
	}
 
	public WebServiceVo setWebServiceVo(WebServiceVo webserviceVo, KalProperties properties)
	{
		WebServiceVo result = new WebServiceVo();

		if (webserviceVo.getHost().equals("pip.altea.host")) 
		{
			// Session session = webserviceVo.getPipsession();
			// session = sessionNullCheck(webserviceVo);
			// result.setPipsession(session);

			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);

			result.setHeaderType(3);
			result.setHost(properties.getProperty(webserviceVo.getHost()));
			result.setOperationName(webserviceVo.getOperationName());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(properties.getProperty("pip.altea.soapaction.url") + "/" + properties.getProperty(webserviceVo.getOperationName()));
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
		}
		else if (webserviceVo.getHost().equals("pip.ecommerce.host")) 
		{
			result.setHeaderType(4);

			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);

			result.setHost(properties.getProperty(webserviceVo.getHost()));
			result.setBodyXml(webserviceVo.getBodyXml());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(properties.getProperty("pip.ecommerce.soapaction.url") + "/" + "E_Commerce");
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
		}
		else if (webserviceVo.getHost().equals("amadeus.altea.host"))
		{

			// result.setPipsession(webserviceVo.getPipsession());
			result.setHeaderType(1);
			result.setHost(properties.getProperty(webserviceVo.getHost()));
			result.setOperationName(webserviceVo.getOperationName());
			result.setWsap(webserviceVo.getWsap());

			result.setSoapAction(properties.getProperty("amadeus.altea.soapaction.url") + "/" + properties.getProperty(webserviceVo.getOperationName()));
			result.setMessageId(webserviceVo.getMessageId());
			result.setGuid(webserviceVo.getGuid());
		}
		else if (webserviceVo.getHost().equals("amadeus.ecommerce.host")) 
		{
			// Session session = sessionNullCheck(webserviceVo);
			// result.setPipsession(session);
			result.setHeaderType(2);
			result.setHost(properties.getProperty(webserviceVo.getHost()));
		}
		else if (webserviceVo.getHost().equals("pip.ods.host"))
		{
			// Session session = sessionNullCheck(webserviceVo);
			// result.setPipsession(session);

			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);

			result.setHeaderType(5);
			result.setHost(properties.getProperty(webserviceVo.getHost()));
			result.setOperationName(webserviceVo.getOperationName());
			result.setWsap(webserviceVo.getWsap());
			result.setSoapAction(properties.getProperty("pip.altea.soapaction.url") + "/" + properties.getProperty(webserviceVo.getOperationName()));
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
		}
		else
		{
			// Session session = sessionNullCheck(webserviceVo);
			// result.setPipsession(session);

			String mustUnderstand = "";
			mustUnderstand = mustUnderstandNullCheck(webserviceVo);
			result.setMustUnderstand(mustUnderstand);

			result.setHeaderType(6);
			result.setHost(webserviceVo.getHost());

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

			result.setBodyXml(webserviceVo.getBodyXml());
			result.setRequestMethod(webserviceVo.getRequestMethod());
		}
		return result;
	}
 
	// public Session sessionNullCheck(WebServiceVo webserviceVo)
	// {
	// 	Session result = new Session();

	// 	if (webserviceVo.getPipsession() == null)
	// 	{
	// 		result.setSecurityToken("");
	// 		result.setSequenceNumber("");
	// 		result.setSessionId("");

	// 		if ((webserviceVo.getPipsessionType() == null) || (webserviceVo.getPipsessionType() == ""))
	// 			result.setSessionType("");
	// 		else
	// 			result.setSessionType(webserviceVo.getPipsessionType());
	// 	}
	// 	else
	// 	{
	// 		result = webserviceVo.getPipsession();
	// 	}
	// 	return result;
	// }

	protected String getAmadeusAlteaHeader(WebServiceVo webserviceVo)throws Exception
	{
		String nonce = generate_nonce();
		String created = generate_created();
		String password = password_digest(password_encrypt("SHA-1", "AMADEUS"),nonce,created);

		//TODO 4.0 Security header 김현성 추가 요청
		String result = "<soapenv:Envelope xmlns:wsa=\"http://www.w3.org/2005/08/addressing\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:link=\"http://wsdl.amadeus.com/2010/06/ws/Link_v1\" xmlns:wbs=\"http://xml.amadeus.com/ws/2009/01/WBS_Session-2.0.xsd\"><soapenv:Header><link:TransactionFlowLink><link:Consumer><link:UniqueID>" + webserviceVo.getGuid() + "</link:UniqueID>" + "</link:Consumer>" + "</link:TransactionFlowLink>" + "<wsaw:Action>" + webserviceVo.getSoapAction() + "</wsaw:Action>" + "<wsaw:MessageID>" + webserviceVo.getMessageId() + "</wsaw:MessageID>" + "<wsaw:To>" + webserviceVo.getHost() + "/" + webserviceVo.getWsap() + "</wsaw:To>"+
			"	<link:TransactionFlowLink xmlns:link=\"http://wsdl.amadeus.com/2010/06/ws/Link_v1\">\n" +
			"    <link:Consumer>\n" +
			"      <link:UniqueID>"+webserviceVo.getGuid()+"</link:UniqueID>\n" +
			"    </link:Consumer>\n" +
			"  </link:TransactionFlowLink>"+
			"      <sec:AMA_SecurityHostedUser>\n" +
			"         <sec:UserID POS_Type=\"1\" RequestorType=\"U\" PseudoCityCode=\"SELKE08IW\" AgentDutyCode=\"SU\"/>\n" +
			"      </sec:AMA_SecurityHostedUser>\n" +
			"      <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" +
			"         <wsse:UsernameToken>\n" +
			"            <wsse:Username>WSKEIBE</wsse:Username>\n" +
			"            <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest\">"+password+"</wsse:Password>\n" +
			//"            <wsse:Nonce EncodingType=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\">"+generate_nonce()+"</wsse:Nonce>\n" +
			"            <wsse:Nonce EncodingType=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\">"+nonce+"</wsse:Nonce>\n" +
			"            <wsu:Created>"+created+"</wsu:Created>\n" +
			"         </wsse:UsernameToken>\n" +
			"      </wsse:Security>\n" +
			"      <wsa:Action soapenv:mustUnderstand=\"1\">http://webservices.amadeus.com/PNRRET_17_2_1A</wsa:Action>\n" +
			"      <wsa:ReplyTo soapenv:mustUnderstand=\"1\">\n" +
			"         <wsa:Address>http://www.w3.org/2005/08/addressing/anonymous</wsa:Address>\n" +
			"      </wsa:ReplyTo>\n" +
			"      <wsa:MessageID soapenv:mustUnderstand=\"1\" xmlns:add=\"http://www.w3.org/2005/08/addressing\">"+generate_messageID()+"</wsa:MessageID>\n" +
			"      <wsa:To soapenv:mustUnderstand=\"1\">https://nodeA1.test.webservices.amadeus.com/1ASIWGENKEU</wsa:To>\n" +
			"      <ses:Session TransactionStatusCode=\"Start\"/>\n" +
				 "</soapenv:Header>" + "<soapenv:Body>" + webserviceVo.getBodyXml() + "</soapenv:Body>" + "</soapenv:Envelope>";
		return result;
	}


 
	// protected String getPipAlteaHeader(WebServiceVo webserviceVo)
	// {
	// 	String result = 
	// 	   "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pips=\"http://PIP_Service_Library/PIP_Session\" xmlns:pip=\"http://PIP_Service_Library/PIP_Processing\"><soapenv:Header><wsse:Security soapenv:mustUnderstand=\"" + 
	// 	   webserviceVo.getMustUnderstand() + "\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">" + 
	// 	   "<wsse:UsernameToken wsu:Id=\"UsernameToken-1\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">" + 
	// 	   "<wsse:Username>" + webserviceVo.getPipuserName() + "</wsse:Username>" + 
	// 	   "<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">" + webserviceVo.getPippassWord() + "</wsse:Password>" + 
	// 	   "</wsse:UsernameToken>" + 
	// 	   "</wsse:Security>" + 
	// 	   "<pips:Session>" + 
	// 	   "<pips:sessionType>" + webserviceVo.getPipsession().getSessionType() + "</pips:sessionType>" + 
	// 	   "<pips:sessionId>" + webserviceVo.getPipsession().getSessionId() + "</pips:sessionId>" + 
	// 	   "<pips:sequenceNumber>" + webserviceVo.getPipsession().getSequenceNumber() + "</pips:sequenceNumber>" + 
	// 	   "<pips:securityToken>" + webserviceVo.getPipsession().getSecurityToken() + "</pips:securityToken>" + 
	// 	   "</pips:Session>" + 
	// 	   "<pip:ProcessingFlow>" + 
	// 	   "<pip:guid>" + webserviceVo.getGuid() + "</pip:guid>" + 
	// 	   "<pip:requestSystem>" + webserviceVo.getPiprequestSystem() + "</pip:requestSystem>" + 
	// 	   "<pip:employeeNo>" + webserviceVo.getPipemployeeNumber() + "</pip:employeeNo>" + 
	// 	   "<pip:lssUserId>" + webserviceVo.getPiplssuserId() + "</pip:lssUserId>" + 
	// 	   "<pip:officeId>" + webserviceVo.getPipSourceofficeId() + "</pip:officeId>" + 
	// 	   "<pip:dutyCode>" + webserviceVo.getPipdutyCode() + "</pip:dutyCode>" + 
	// 	   "<pip:wsap>" + webserviceVo.getWsap() + "</pip:wsap>" + 
	// 	   "<pip:companyName>" + webserviceVo.getCompanyName() + "</pip:companyName>" + 
	// 	   "<pip:workstationId>" + webserviceVo.getWorkstationId() + "</pip:workstationId>" + 
	// 	   "</pip:ProcessingFlow>" + 
	// 	   "</soapenv:Header>" + 
	// 	   "<soapenv:Body>" + 
	// 	   webserviceVo.getBodyXml() + 
	// 	   "</soapenv:Body>" + 
	// 	   "</soapenv:Envelope>";

	// 	return result;
	// }
 
	// protected String getPipOdsHeader(WebServiceVo webserviceVo)
	// {
	// 	String result = 
	// 		"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pips=\"http://PIP_Service_Library/PIP_Session\" xmlns:pip=\"http://PIP_Service_Library/PIP_Processing\" xmlns:pip2=\"http://PIP_Service_Library\"><soapenv:Header><wsse:Security soapenv:mustUnderstand=\"" + 
	// 		webserviceVo.getMustUnderstand() + "\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">" + 
	// 		"<wsse:UsernameToken wsu:Id=\"UsernameToken-1\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">" + 
	// 		"<wsse:Username>" + webserviceVo.getPipuserName() + "</wsse:Username>" + 
	// 		"<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">" + webserviceVo.getPippassWord() + "</wsse:Password>" + 
	// 		"</wsse:UsernameToken>" + 
	// 		"</wsse:Security>" + 
	// 		"<pips:Session>" + 
	// 		"<pips:sessionType>" + webserviceVo.getPipsession().getSessionType() + "</pips:sessionType>" + 
	// 		"<pips:sessionId>" + webserviceVo.getPipsession().getSessionId() + "</pips:sessionId>" + 
	// 		"<pips:sequenceNumber>" + webserviceVo.getPipsession().getSequenceNumber() + "</pips:sequenceNumber>" + 
	// 		"<pips:securityToken>" + webserviceVo.getPipsession().getSecurityToken() + "</pips:securityToken>" + 
	// 		"</pips:Session>" + 
	// 		"<pip:ProcessingFlow>" + 
	// 		"<pip:guid>" + webserviceVo.getGuid() + "</pip:guid>" + 
	// 		"<pip:requestSystem>" + webserviceVo.getPiprequestSystem() + "</pip:requestSystem>" + 
	// 		"<pip:employeeNo>" + webserviceVo.getPipemployeeNumber() + "</pip:employeeNo>" + 
	// 		"<pip:lssUserId>" + webserviceVo.getPiplssuserId() + "</pip:lssUserId>" + 
	// 		"<pip:officeId>" + webserviceVo.getPipSourceofficeId() + "</pip:officeId>" + 
	// 		"<pip:dutyCode>" + webserviceVo.getPipdutyCode() + "</pip:dutyCode>" + 
	// 		"<pip:wsap>" + webserviceVo.getWsap() + "</pip:wsap>" + 
	// 		"<pip:companyName>" + webserviceVo.getCompanyName() + "</pip:companyName>" + 
	// 		"<pip:workstationId>" + webserviceVo.getWorkstationId() + "</pip:workstationId>" + 
	// 		"</pip:ProcessingFlow>" + 
	// 		"</soapenv:Header>" + 
	// 		"<soapenv:Body>" + 
	// 		webserviceVo.getBodyXml() + 
	// 		"</soapenv:Body>" + 
	// 		"</soapenv:Envelope>";

	// 	return result;
	// }
 
	// protected String getPidHeader(WebServiceVo webserviceVo)
	// {
	// 	String result = 
	// 		"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:pips=\"http://PIP_Service_Library/PIP_Session\" xmlns:pip=\"http://PIP_Service_Library/PIP_Processing\"><soapenv:Header><wsse:Security soapenv:mustUnderstand=\"" + 
	// 		webserviceVo.getMustUnderstand() + "\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">" + 
	// 		"<wsse:UsernameToken>" + 
	// 		"<wsse:Username>" + webserviceVo.getPipuserName() + "</wsse:Username>" + 
	// 		"<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">" + webserviceVo.getPippassWord() + "</wsse:Password>" + 
	// 		"</wsse:UsernameToken>" + 
	// 		"</wsse:Security>" + 
	// 		"<pips:Session>" + 
	// 		"<pips:sessionType>" + webserviceVo.getPipsession().getSessionType() + "</pips:sessionType>" + 
	// 		"<pips:sessionId>" + webserviceVo.getPipsession().getSessionId() + "</pips:sessionId>" + 
	// 		"<pips:sequenceNumber>" + webserviceVo.getPipsession().getSequenceNumber() + "</pips:sequenceNumber>" + 
	// 		"<pips:securityToken>" + webserviceVo.getPipsession().getSecurityToken() + "</pips:securityToken>" + 
	// 		"</pips:Session>" + 
	// 		"<pip:ProcessingFlow>" + 
	// 		"<pip:guid>" + webserviceVo.getGuid() + "</pip:guid>" + 
	// 		"<pip:requestSystem>" + webserviceVo.getPiprequestSystem() + "</pip:requestSystem>";

	// 	if ((webserviceVo.getPipemployeeNumber() == null) || (webserviceVo.getPipemployeeNumber() == ""))
	// 	{
	// 		result = result + "<pip:employeeNo/>";
	// 	}
	// 	else 
	// 	{
	// 		result = result + "<pip:employeeNo>" + webserviceVo.getPipemployeeNumber() + "</pip:employeeNo>";
	// 	}
 
	// 	result = result + "<pip:lssUserId>" + webserviceVo.getPiplssuserId() + "</pip:lssUserId>" + 
	// 	"<pip:officeId>" + webserviceVo.getPipSourceofficeId() + "</pip:officeId>";

	// 	if ((webserviceVo.getPipdutyCode() == null) || (webserviceVo.getPipdutyCode() == ""))
	// 	{
	// 		result = result + "<pip:dutyCode/>";
	// 	}
	// 	else
	// 	{
	// 		result = result + "<pip:dutyCode>" + webserviceVo.getPipdutyCode() + "</pip:dutyCode>";
	// 	}
	// 	result = result + 
	// 	"<pip:wsap>" + webserviceVo.getWsap() + "</pip:wsap>" + 
	// 	"<pip:companyName>" + webserviceVo.getCompanyName() + "</pip:companyName>" + 
	// 	"<pip:workstationId>" + webserviceVo.getWorkstationId() + "</pip:workstationId>" + 
	// 	"</pip:ProcessingFlow>" + 
	// 	"</soapenv:Header>" + 
	// 	"<soapenv:Body>" + 
	// 	webserviceVo.getBodyXml() + 
	// 	"</soapenv:Body>" + 
	// 	"</soapenv:Envelope>";
		
	// 	return result;
	// }
 
	// protected String getAmadeusEcommerceHeader(WebServiceVo webserviceVo)
	// {
	// 	String result = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><SOAP-ENV:Header /><SOAP-ENV:Body><ns1:process xmlns:ns1=\"urn:TripFlow\"><request xsi:type=\"xsd:string\">" + webserviceVo.getBodyXml() + "</request>" + "</ns1:process>" + "</SOAP-ENV:Body>" + "</SOAP-ENV:Envelope>";
	// 	return result;
	// }
 
	protected String getPipEcommerceHeader(WebServiceVo webserviceVo)
	{
		String result = 
			"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pips=\"http://PIP_Service_Library/PIP_Session\" xmlns:pip=\"http://PIP_Service_Library/PIP_Processing\" xmlns:ret=\"http://PIP1A_Retail/Retail/Retail_Request\"><soapenv:Header><wsse:Security soapenv:mustUnderstand=\"" + 
			webserviceVo.getMustUnderstand() + "\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">" + 
			"<wsse:UsernameToken wsu:Id=\"UsernameToken-1\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">" + 
			"<wsse:Username>" + webserviceVo.getPipuserName() + "</wsse:Username>" + 
			"<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">" + webserviceVo.getPippassWord() + "</wsse:Password>" + 
			"</wsse:UsernameToken>" + 
			"</wsse:Security>" + 
			"<pips:Session>" + 
			"<pips:sessionType>3</pips:sessionType>" + 
			"<pips:sessionId></pips:sessionId>" + 
			"<pips:sequenceNumber></pips:sequenceNumber>" + 
			"<pips:securityToken></pips:securityToken>" + 
			"</pips:Session>" + 
			"<pip:ProcessingFlow>" + 
			"<pip:guid>" + webserviceVo.getGuid() + "</pip:guid>" + 
			"<pip:requestSystem>" + webserviceVo.getPiprequestSystem() + "</pip:requestSystem>" + 
			"<pip:employeeNo>" + webserviceVo.getPipemployeeNumber() + "</pip:employeeNo>" + 
			"<pip:lssUserId>" + webserviceVo.getPiplssuserId() + "</pip:lssUserId>" + 
			"<pip:officeId>" + webserviceVo.getPipSourceofficeId() + "</pip:officeId>" + 
			"<pip:dutyCode>" + webserviceVo.getPipdutyCode() + "</pip:dutyCode>" + 
			"<pip:wsap>" + webserviceVo.getWsap() + "</pip:wsap>" + 
			"<pip:companyName>" + webserviceVo.getCompanyName() + "</pip:companyName>" + 
			"<pip:workstationId>" + webserviceVo.getWorkstationId() + "</pip:workstationId>" + 
			"</pip:ProcessingFlow>" + 
			"</soapenv:Header>" + 
			"<soapenv:Body>" + 
			"<ret:E_Commerce>" + 
			"<request>" + 
			webserviceVo.getBodyXml() + 
			"</request>" + 
			"</ret:E_Commerce>" + 
			"</soapenv:Body>" + 
			"</soapenv:Envelope>";

		return result;
	}
 
	// public Session parseSession(String xmlResponse) throws Exception
	// {
	// 	Session session = null;

	// 	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	// 	DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
	// 	InputSource is = new InputSource();
	// 	is.setCharacterStream(new StringReader(xmlResponse));

	// 	Document doc = dbBuilder.parse(is);
	// 	NodeList nList = doc.getElementsByTagName("awss:Session");

	// 	for (int temp = 0; temp < nList.getLength(); temp++) 
	// 	{
	// 		Node nNode = nList.item(temp);
	// 		if (nNode.getNodeType() == 1) 
	// 		{
	// 			Element eElement = (Element)nNode;
	// 			String sessionId = getTagValue("awss:SessionId", eElement);
	// 			String sequenceNumber = getTagValue("awss:SequenceNumber", eElement);
	// 			String securityToken = getTagValue("awss:SecurityToken", eElement);

	// 			session = new Session();
	// 			session.setSecurityToken(securityToken);
	// 			session.setSequenceNumber(sequenceNumber);
	// 			session.setSessionId(sessionId);
	// 		}
	// 	}
	// 	return session;
	// }
 
	// public Session parsePipSession(String xmlResponse) throws Exception 
	// {
	// 	Session session = null;

	// 	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	// 	DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
	// 	InputSource is = new InputSource();
	// 	is.setCharacterStream(new StringReader(xmlResponse));

	// 	Document doc = dbBuilder.parse(is);
	// 	NodeList nList = doc.getElementsByTagName("pips:Session");

	// 	for (int temp = 0; temp < nList.getLength(); temp++) 
	// 	{
	// 		Node nNode = nList.item(temp);
	// 		if (nNode.getNodeType() == 1) 
	// 		{
	// 			Element eElement = (Element)nNode;
	// 			String sessionType = getTagValue("pips:sessionType", eElement);
	// 			String sessionId = getTagValue("pips:sessionId", eElement);
	// 			String sequenceNumber = getTagValue("pips:sequenceNumber", eElement);
	// 			String securityToken = getTagValue("pips:securityToken", eElement);

	// 			session = new Session();
	// 			session.setSessionType(sessionType);
	// 			session.setSecurityToken(securityToken);
	// 			session.setSequenceNumber(sequenceNumber);
	// 			session.setSessionId(sessionId);
	// 		}
	// 	}
	// 	return session;
	// }
	private static String getTagValue(String sTag, Element eElement) 
	{
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = nlList.item(0);

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
 
	public Boolean releaseSession(WebServiceVo webserviceVo) throws Exception
	{
		return null;
	}
 
	public String mustUnderstandNullCheck(WebServiceVo webserviceVo) 
	{
		String result = "";
 
		if ((webserviceVo.getMustUnderstand() != null) && (webserviceVo.getMustUnderstand() != "")) {
			result = webserviceVo.getMustUnderstand();
		}
		else
		{
			result = "1";
		}
		return result;
	}
	
	public String parseFaultString(String xmlResponse) throws Exception {

		// pip_service_library.pip_session.Session session = null;
		String result = null;
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(xmlResponse));

		Document doc = dbBuilder.parse(is);
		NodeList nList = null;
		int isTagName = 0;
		String[] soapFault = {"soapenv:Fault", "soap:Fault", "SOAP-ENV:Fault", "env:Fault"};
		
		for(String str : soapFault)
		{
			isTagName = doc.getElementsByTagName(str).getLength();
			if(isTagName > 0)
			{
				nList = doc.getElementsByTagName(str);
				break;
			}
		}
		
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;

				result = getTagValue("faultstring", eElement);
			}
		}
		return result;
	}

	public String pipEndPointUrlNullCheck(WebServiceVo webserviceVo) 
	{
		String result = "";

		if ((webserviceVo.getEndPointUrl() != null) && (webserviceVo.getEndPointUrl() != "")) 
		{
			result = this.propertiesService.getProperty(webserviceVo.getEndPointUrl());
		}
		else 
		{
			result = this.propertiesService.getProperty(webserviceVo.getHost());
		}
		return result;
	}
	
	@Override
	public Boolean destroySession(WebServiceVo webserviceVo) throws Exception 
	{
		return null;
	}
	
	@Override
	public Boolean releaseReUseSession(WebServiceVo webserviceVo) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) throws Exception{
		UrlConnectionImpl url = new UrlConnectionImpl();
		KalProperties pp = new KalProperties();
		WebServiceVo vo = new WebServiceVo();
		vo.setHeaderType(1);
		vo.setSoapAction("http://webservices.amadeus.com/PNRRET_17_2_1A");
		vo.setWsap("1ASIWIBEKEU");
		vo.setHost("amadeus.altea.host");
		vo.setOperationName("PNR_Retrieve");
		vo.setGuid(generate_guid());
		vo.setRequestMethod("POST");
		vo.setNamespace("PNR_Retrieve");
		String aa = url.call(vo);
		System.out.println(aa);
	}

	public String generate_messageID() throws Exception {
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		random.setSeed(System.currentTimeMillis());
		byte[] messageIDValue = new byte[16];
		random.nextBytes(messageIDValue);
		return org.apache.ws.security.util.Base64.encode(messageIDValue);
	}

	public String generate_nonce() throws Exception {
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		random.setSeed(System.currentTimeMillis());
		byte[] messageIDValue = new byte[16];
		random.nextBytes(messageIDValue);
		return org.apache.ws.security.util.Base64.encode(messageIDValue);
	}

	public String generate_created() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		Calendar cal = Calendar.getInstance();
		format.setTimeZone(TimeZone.getTimeZone("Zulu"));
		return format.format(cal.getTime());
	}
	public static String generate_guid() throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar cal = Calendar.getInstance();
		format.setTimeZone(TimeZone.getTimeZone("Zulu"));
		return "KEIBE"+format.format(cal.getTime());
	}

	public byte[] password_encrypt(String algorithm,String clearPassword)throws Exception{
        MessageDigest sha = MessageDigest.getInstance(algorithm);
        sha.reset();
        String password = clearPassword;

        byte[] b1 = password.getBytes("UTF-8");
        sha.update(b1);
        return sha.digest();
    }

    public String password_digest(byte[] password, String nonce,String created)throws Exception {
        String passwdDigest = null;
        byte[] b1 = nonce != null ? org.apache.ws.security.util.Base64.decode(nonce) : new byte[0];
        byte[] b2 = created != null ? created.getBytes("UTF-8") : new byte[0];
        byte[] b3 = password;
        byte[] b4 = new byte[b1.length + b2.length + b3.length];
        int offset = 0;
        System.arraycopy(b1, 0, b4, offset, b1.length);
        offset += b1.length;
        System.arraycopy(b2, 0, b4, offset, b2.length);
        offset += b2.length;
        System.arraycopy(b3, 0, b4, offset, b3.length);
        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        sha.reset();
        sha.update(b4);
        passwdDigest = org.apache.ws.security.util.Base64.encode(sha.digest());
        return passwdDigest;
    }

}



class KalProperties {

	Map<String, String> doubleBraceMap  = new HashMap<String, String>() {{
		put("connect.time.out", "3000");
		put("read.time.out", "200000");
	
		put("amadeus.altea.host", "https://nodeA1.test.webservices.amadeus.com/1ASIWGENKEU/");
		put("pip.ecommerce.soapaction.url", "http://pip.koreanair.com");
		put("PNR_Retrieve", "PNRRET_17_2_1A");
		put("amadeus.altea.soapaction.url", "http://webservices.amadeus.com");
	}};

	public String getProperty(String key) {
		return doubleBraceMap.get(key);
	}

}
