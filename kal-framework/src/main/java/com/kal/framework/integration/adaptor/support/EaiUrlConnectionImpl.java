package com.kal.framework.integration.adaptor.support;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import net.sf.jazzlib.GZIPInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import pip_service_library.pip_session.Session;

import com.kal.framework.integration.adaptor.UrlConnectionService;
import com.kal.framework.integration.adaptor.WebServiceVo;


/**
 * EAI 간의 Soap Message 를 주고받을 수있는 기능을 제공하는 class 이다.
 * <p>
 * 다음과 같은 방식으로 {@link EaiUrlConnectionImpl}를 설정해주어야 한다.<br>
 * Bean 생성 value 및 인스턴스 생성자 인자 값은 서비스 받고자 하는 웹서비스에 따라 셋팅
 * <pre>
 * [1] Spring ApplicationContext 사용 시
 *         
 * <code> 
 * &lt;bean id="eaiAdaptor" class="com.kal.framework.integration.adaptor.support.EaiUrlConnectionImpl"&gt;
 *   &lt;property name="hostName" value="" /&gt;
 *   &lt;property name="requestMethod" value="" /&gt;
 *   &lt;property name="soapAction" value="" /&gt;
 *   &lt;property name="contentType" value="" /&gt;
 *   &lt;property name="encoding" value="" /&gt;
 *   &lt;property name="connectionTimeOut" value="" /&gt;
 *   &lt;property name="readTimeOut" value="" /&gt;
 * &lt;/bean&gt;
 * </code>
 * [2] Java 인스턴스 생성하여 사용 시
 * <code>
 * UrlConnectionService eaiAdaptor = new EaiUrlConnectionImpl
 * (host uri, request method, soapAction, Content-Type, encoding, connection time out, read time out)
 * </code>
 * </pre>
 * @author <a href="mailto:jnoh@hist.co.kr">Roh Jin Wook</a>
 * @version 1.0
 * @since 2014-02-20
 */							                                                                     
public class EaiUrlConnectionImpl implements UrlConnectionService, InitializingBean, DisposableBean
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/** 기본 {@link #connectionTimeout} */
	public static final int DEFAULT_CONNECTION_TIMEOUT = 60000;

	/** 기본 {@link #readTimeout} */
	public static final int DEFAULT_READ_TIMEOUT = 60000;
	
	private String hostName;
	private String requestMethod;
	private String soapAction;
	private String contentType;
	private String encoding;
	private int connectionTimeOut = DEFAULT_CONNECTION_TIMEOUT;
	private int readTimeOut = DEFAULT_READ_TIMEOUT;

	public String getHostName()
	{
		return hostName;
	}

	public void setHostName(String hostName)
	{
		this.hostName = hostName;
	}
	
	public String getRequestMethod()
	{
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod)
	{
		this.requestMethod = requestMethod;
	}

	public String getSoapAction()
	{
		return soapAction;
	}

	public void setSoapAction(String soapAction)
	{
		this.soapAction = soapAction;
	}

	public String getContentType()
	{
		return contentType;
	}

	public void setContentType(String contentType)
	{
		this.contentType = contentType;
	}
	
	public String getEncoding()
	{
		return encoding;
	}

	public void setEncoding(String encoding)
	{
		this.encoding = encoding;
	}
	
	public int getConnectionTimeOut()
	{
		return connectionTimeOut;
	}

	public void setConnectionTimeOut(int connectionTimeOut)
	{
		this.connectionTimeOut = connectionTimeOut;
	}

	public int getReadTimeOut()
	{
		return readTimeOut;
	}

	public void setReadTimeOut(int readTimeOut)
	{
		this.readTimeOut = readTimeOut;
	}
	
	/**
	 * @param hostName (String)
	 * 				Host URI (endpoint URI)
	 * @param requestMethod (String)
	 * 				HTTP METHOD (POST, GET)
	 * @param soapAction (String)
	 * 				SOAP ACTION
	 * @param contentType (String)
	 * 				Content-type
	 * @param connectionTimeOut (int)
	 * 				Http Connection Time Out (1000 = 1초)
	 * @param readTimeOut (int)
	 * 				SOAP Message Read Time Out (1000 = 1초)
	 * @throws Exception 
	 */
	public EaiUrlConnectionImpl(String hostName, String requestMethod, String soapAction, String contentType, String encoding, int connectionTimeOut, int readTimeOut) throws Exception
	{
		this.hostName = hostName;
		this.requestMethod = requestMethod;
		this.soapAction = soapAction;
		this.contentType = contentType;
		this.encoding = encoding;
		this.connectionTimeOut = connectionTimeOut;
		this.readTimeOut = readTimeOut;
	}
	
	public EaiUrlConnectionImpl(){}
	
	
	/**
	 * 웹서비스를 수행하기 위한 메인 메소드<br>
	 * 개발 Application 에서 해당 메소드를 호출 한다.
	 * 
	 * @param 
	 * 		{@link WebServiceVo}
	 * @return String Type 의 Response Soap Message 
	 * @exception Exception
	 */
	@Override
	public String call(WebServiceVo vo) throws Exception
	{
		WebServiceVo webserviceVo = setWebServiceVo(vo);
		
    	String responseMessage = null;
    	OutputStreamWriter osw = null;
    	BufferedReader br = null;
    	
		if(webserviceVo != null)
    	{
			StringBuffer buffer = new StringBuffer();
			
	        URL url;
	        HttpURLConnection urlConnection;

	        url = new URL( this.hostName );
	        // 요청 호스트에 연결
	        urlConnection = (HttpURLConnection)url.openConnection();
	        // 요청 응답 타임아웃 설정
	        urlConnection.setConnectTimeout( this.connectionTimeOut );
	        // 읽기 타임아웃 설정
	        urlConnection.setReadTimeout( this.readTimeOut );
	        // 전송 방식 (POST, GET)
	        ((HttpURLConnection)urlConnection).setRequestMethod( this.requestMethod.toUpperCase() );
	       
	        urlConnection.setRequestProperty("Content-Type", this.contentType);
	        urlConnection.setRequestProperty("Content-Length", Integer.toString(vo.getSoapMessage().getBytes().length));
	        urlConnection.setRequestProperty("SOAPAction", this.soapAction);
	       
            // 요청편집허가
	        urlConnection.setDoInput(true);		// 서버에서 읽기 모드 지정 
	        urlConnection.setDoOutput(true);	// 서버로 쓰기 모드 지정
	        // 캐쉬설정 (꺼두었음)
	        urlConnection.setUseCaches(false);
	       	
	       	logger.info("request Message :: {}", vo.getSoapMessage());
	        
	        osw = new OutputStreamWriter( urlConnection.getOutputStream() );
	        osw.write( vo.getSoapMessage() );	// 스트림에 데이터쓰기
	        osw.flush();						// 스트림의 데이터 목적지로 분출하기
	        
	        vo.setQuery( vo.getSoapMessage() );	// 개발 어플리케이션에 전체 요청 메세지를 확인할 수 있도록하기 위해.
	        
	        @SuppressWarnings("unused")
			boolean soapFault = false;
	        String res_encode = null;
	        InputStream is = null;
	        try
	        {
	        	
	        	// 목적지 호스트로부터 Response 를 받는다.
	        	is = urlConnection.getInputStream();
	        	
        		// Response 에서 gzip 인지 여부 식별 정보
	        	res_encode = urlConnection.getHeaderField("Content-Encoding");
	        	
	        	// response 가 gzip 인경우 
	        	if("gzip".equalsIgnoreCase(res_encode))
	        	{
	        		br = new BufferedReader(new InputStreamReader(new GZIPInputStream(is), this.encoding));
	        	}
	        	else
	        	{
	        		br = new BufferedReader(new InputStreamReader(is, this.encoding));
	        	}
	        }
	        // 요청 연결 타임아웃 및 읽기 응답 타임아웃 Exception
	        catch(SocketTimeoutException ste)
	        {
	        	String stackTrace = ste.toString();
	        	is = new ByteArrayInputStream(stackTrace.getBytes());
	        	br = new BufferedReader(new InputStreamReader(is, this.encoding));
	        	throw ste;
	        }
	        catch(Exception e)
	        {
	        	soapFault = true;
	        	e.printStackTrace();
	        	
        		// Response 에서 gzip 인지 여부 식별 정보
	        	res_encode = urlConnection.getHeaderField("Content-Encoding");
	        	
	        	// response 가 gzip 인경우 
	        	if("gzip".equalsIgnoreCase(res_encode))
	        	{
	        		br = new BufferedReader(new InputStreamReader(new GZIPInputStream(urlConnection.getErrorStream()), this.encoding ) );
	        	}
	        	else
	        	{
	        		br = new BufferedReader(new InputStreamReader(urlConnection.getErrorStream(), this.encoding));
	        	}
	        }
	        finally
	        {
	        	String inputLine;
		        while ((inputLine = br.readLine()) != null)
		        {
		        	buffer.append( inputLine ).append("\r\n");
		        }
		
		        if(br != null) br.close();
		        if(osw != null) osw.close();
		        if(urlConnection != null) urlConnection.disconnect();
		        
		        responseMessage = buffer.toString();
	        }
    	}
		return responseMessage;
	}
	
	/**
     * UrlConnection 방식의 웹서비스에서 사용할  Value Object 객체 설정
     * @param Type WebServiceVo
     * @return {@linkplain WebServiceVo}
     */
	public WebServiceVo setWebServiceVo(WebServiceVo vo)
	{
    	WebServiceVo wsvo = new WebServiceVo();
    	
    	// 어플리케이션에서 VO 객체의 값을 유지하기 위해서  original 객체를 target 객체에 clone 한다.
    	BeanUtils.copyProperties(vo, wsvo);
    	
    	return wsvo;
    }
	
	public String parseFaultString(String xmlResponse) throws Exception 
	{
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
		
		for (int temp = 0; temp < nList.getLength(); temp++) 
		{
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE)
			{
				Element eElement = (Element) nNode;
				result = getTagValue("PRE", eElement);
			}
		}
		return result;
	}
    
	private String getTagValue(String sTag, Element eElement) 
	{
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
 
		return nValue.getNodeValue();
    }
	
	public String convertToXmlMessage(String source)
	{
		source = source.replaceAll("<", "&lt;");
		source = source.replaceAll(">", "&gt;");
		return source;
	}
	public String convertToXmlTag(String source)
	{
		source = source.replaceAll("&lt;", "<");
		source = source.replaceAll("&gt;", ">");
		source = source.replaceAll("&apos;", "'");
		return source;
	}
	
	@Override
	public void init()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public Boolean releaseSession(WebServiceVo webserviceVo) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean destroySession(WebServiceVo webserviceVo) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean releaseReUseSession(WebServiceVo webserviceVo)
			throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session parseSession(String xmlResponse) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session parsePipSession(String xmlResponse) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Bean LifeCycle 중 초기화 메소드 <br>
	 * 빈 객체의 프로퍼티가 올바르게 설정되었는지 여부를 검사하는 용도<br>
	 *   
	 * @exception property 셋팅 미완료 시
	 */
	@Override
	public void afterPropertiesSet() throws Exception
	{
		Assert.notNull(hostName, "Bean Property 'Host Name' must not be null.");
		Assert.notNull(requestMethod, "Bean Property 'Request Method' must not be null.");
		Assert.notNull(soapAction, "Bean Property 'Soap Action' must not be null.");
		Assert.notNull(contentType, "Bean Property 'Content Type' must not be null.");
		Assert.notNull(encoding, "Bean Property 'encoding' must not be null.");
	}
	
	/**
	 * Bean LifeCycle 중 소멸 메소드 <br>	 
	 *
	 * @exception Exception
	 */
	@Override
	public void destroy() throws Exception
	{
		// TODO Auto-generated method stub
	}
}
