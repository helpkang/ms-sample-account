package com.kal.framework.integration.adaptor.support;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import com.kal.framework.exception.FwException;
import com.kal.framework.integration.adaptor.HttpAdaptor;
import com.kal.framework.integration.adaptor.message.ConvertMessageType;
import com.kal.framework.integration.adaptor.message.SoapMessageContext;
import com.kal.framework.web.util.CommonUtil;

/**
 * ECommerce Adaptor : 
 * <p> HttpAdaptor를 상속받은 Adaptor로, E-Commerce시스템과의 연동 목적으로 만들어짐.
 *       
 * @author 조인호
 * @version 1.0
 * @since 2012-03-23
 */
public class ECommerceAdaptor extends HttpAdaptor {
	private static Logger logger = Logger.getLogger(ECommerceAdaptor.class);
	   
	public ECommerceAdaptor(){
	}
	
	/**
	 * Description : HTTP 서버와의 접속 제한 시간 설정
	 * @return void
	 */
	public void setConnectionTimeout(int timeout){
		super.setConnectionTimeout(timeout);
	}
	
	/**
	 * Description : HTTP Server URL 정보 등록
	 * @return void
	 */
	public void setTargetUrl(String url){
		super.setTargetUrl(url);
	}
	
	/**
	 * Description : HTTP Server 에 연결. HttpAdaptor의 afterPropertiesSet() 메소드 호출 
	 * @return void
	 * @throws Exception
	 */
	public void connect() throws Exception{
			afterPropertiesSet();
	}
	
	/**
	 * description : HTTP 서버에 String 타입의 데이터 전송 후 결과를 리턴
	 * @param _input
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	public String callByString(String _input){
		String _output = "";
		try{
			_output = call(_input.getBytes());
		}catch(Exception e){
			throw new FwException(e.getMessage(), e);
		}
		return _output;
	}
	
	/**
	 * Description : 전달된 Object를 XML String 타입으로 변환후, 변환된 데이터 전송 후 결과를 리턴
	 * @param _input
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	public String callByObject(Object _input){
		String _output = "";
		try{
			/** Convert Object to XML --> Customizing Part  */
			ConvertMessageType provider = new ConvertMessageType();
			String _str = provider.writeXml(_input);
			if(_str.isEmpty()) throw new Exception();
			_output = call(_str.getBytes());
			return _output;
		}catch(Exception e){
			throw new FwException(e.getMessage(), e);
		}
	}
	
	/**
	 * Description : HTTP 서버(특히 E-Commerce 서버)에 Soap Message 형태의 데이터 전송 후, 
	 * Soap Message 형태의 결과를 리턴. 리턴된 Soap Message 형태의 결과 중 Body 정보만 추출하여 리턴
	 * @param _input
	 * @return
	 * @throws SOAPException
	 * @throws IOException
	 * @throws Exception
	 */
	public String callBySoapMessage(SOAPMessage _input){
		String _output = "";
		try{
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			_input.writeTo(bos);
			
			ArrayList<String> cookieMap = getHeadersByNameFromHttpPost("Set-Cookie");
			String jsessionId = "jsessionid is not exist";
			if(cookieMap.size() > 0)
			{
				String [] jsessionIds = null;
				jsessionIds = new String[cookieMap.size()];
				jsessionIds[0] = cookieMap.get(0);
				jsessionId = jsessionIds[0];
			}
			
			
			if(logger.isInfoEnabled())
				logger.info("\n##################### ECommerce request #####################\n"  + jsessionId + "\n" + bos);
			
			_output = call(bos.toByteArray());

			
			cookieMap = getHeadersByName("Set-Cookie");
			jsessionId = "jsessionid is not exist";
			if(cookieMap.size() > 0)
			{
				String [] jsessionIds = null;
				jsessionIds = new String[cookieMap.size()];
				jsessionIds[0] = cookieMap.get(0);
				jsessionId = jsessionIds[0];
			}
			
			if(logger.isInfoEnabled())
				logger.info("\n##################### ECommerce response #####################\n"  + jsessionId + "\n" + _output);
			
			_input = null;
			SoapMessageContext messageContext = new SoapMessageContext();
			_input = messageContext.setSoapMessageByString(_output);
			if(_input == null) throw new Exception();
			_output = _input.getSOAPPart().getEnvelope().getBody().getTextContent();
			return _output;
		}catch(Exception e){
			throw new FwException(e.getMessage(), e);
		}
	}
	
	/**
	 * Description : HTTP 서버(특히 E-Commerce 서버)에 Soap Message 형태의 데이터 전송 후, Soap Message 형태의 결과를 리턴
	 * @param _input
	 * @return
	 * @throws SOAPException
	 * @throws IOException
	 * @throws Exception
	 */
	public SOAPMessage callBySoapMessageReturn(SOAPMessage _input){
		String _output = "";
		try{
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			_input.writeTo(bos);
			_output = call(bos.toByteArray());
			
			_input = null;
			SoapMessageContext messageContext = new SoapMessageContext();
			_input = messageContext.setSoapMessageByString(_output);
			if(_input == null) throw new Exception();
			return _input;
			
		}catch(Exception e){
			throw new FwException(e.getMessage(), e);
		}
	}
	
	/**
	 * Description : HTTP 서버에 데이터 전송 후 결과를 리턴
	 * @param input
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	public String call(byte[] input){
		String output = null;
		try{
			output = new String(send(input));
			/** Print Response Object into log */ 
			if(logger.isDebugEnabled()){
				try{
					logger.info("Response >>>"+CommonUtil.getSimpleHeaderLog()+"|"+output);
				}catch(Exception ex){ex.printStackTrace();}
			}
		}catch(Exception e){
			throw new FwException(e.getMessage(), e);
		}
		return output;
	}
	
}
