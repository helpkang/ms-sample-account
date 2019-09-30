package com.kal.framework.integration.adaptor.support;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.soap.SOAPFaultException;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.cxf.binding.soap.SoapFault;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.service.model.BindingInfo;
import org.apache.cxf.service.model.BindingOperationInfo;
import org.apache.cxf.service.model.ServiceInfo;
import org.apache.log4j.Logger;

import com.kal.framework.integration.adaptor.WebServiceAdaptorDynamic;
import com.kal.framework.web.util.CommonUtil;

/**
 * WebService Adaptor Implementator :
 * <p> WebServiceAdaptorDynamic 클래스의 Implementator. 개발자는 WebServiceAdaptorDynamicImpl 클래스에 접근하여 웹서비스 연동 처리.
 * 
 * @author 조인호
 * @version 1.0
 * @since 2012-03-23
 */
public class WebServiceAdaptorDynamicImpl extends WebServiceAdaptorDynamic{
	private static Logger logger = Logger.getLogger(WebServiceAdaptorDynamicImpl.class);
	
    /** Define the operation QName */
	private String namespace;
	private String operationName;
    private QName opName;
    private boolean checkOPName = false;
    
    /** Web Service Client */ 
    private Client client;
	
    /**
     * Description : 웹에 노출된 WSDL 파일의 Target Namespace 정보를 등록
     * @param namespace
     * @return void
     */
	public void setNamespace(String namespace){
		this.namespace = namespace;
	}
	
	/**
	 * Description : 접근하고자 하는 웹서비스 이름 등록
	 * @param operationName
	 * @return void
	 */
	public void setOperationName(String operationName){
		this.operationName = operationName;
	}
	
	private void makeOperationQName(){
		opName = new QName(this.namespace, this.operationName);
		checkOPName = true;
	}
	
	/**
	 * Description : namespace 정보와 operationName을 이용하여 QName 생성
	 * @param namespace
	 * @param operationName
	 * @return void
	 */
	public void makeOperationQName(String namespace, String operationName){
		this.namespace = namespace;
		this.operationName = operationName;
		opName = new QName(namespace, operationName);
		checkOPName = true;
	}
	
	/**
	 * Description : WebServiceAdaptorDynamic 클래스의 connectServer() 메소드 호출
	 * @throws Exception
	 * @return void
	 */
	public void connect() throws Exception{
		if(this.namespace != null && this.operationName != null){
			makeOperationQName();
		}
		else{
			throw new Exception("Must set namespace & operation name before calling connect()!!!");
		}
		client = connectServer();
	}
	
	/**
	 * Description : Http 헤더 정보 중 Cookie 정보 설정
	 * @param cookie
	 * @throws Exception
	 * @return void
	 */
	public void setCookie(String cookie) throws Exception{
		// Creating HTTP headers
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("Cookie", Arrays.asList(cookie));
		// Add HTTP headers to the web service request
		client.getRequestContext().put(Message.PROTOCOL_HEADERS, headers);
	}
	
	public Object getCookie() throws Exception
	{
		String jsessionId = "";
		
		Map headerMap = (Map)client.getResponseContext().get(Message.PROTOCOL_HEADERS);
//		System.out.println("headerMap : " + headerMap.toString());
		
		Object cookies = headerMap.get("Set-Cookie");
		if(null != cookies)
		{
			jsessionId = new String(cookies.toString());
			jsessionId = new String(jsessionId.substring(jsessionId.lastIndexOf("=")+1, jsessionId.length()-1));
		}
		
		return jsessionId;
	}
	
	/**
	 * Description : Http 헤더 정보 설정 (헤더 값은 List 타입으로 설정)
	 * @param headerName
	 * @param headerValues
	 * @throws Exception
	 * @return void
	 */
	public void setHeader(String headerName, List<String> headerValues) throws Exception{
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put(headerName, headerValues);
		client.getRequestContext().put(Message.PROTOCOL_HEADERS, headers);
	}
	
	/**
	 * Description : 헤더정보 가져오기
	 * @param headerName
	 * @return
	 * @throws Exception
	 */
	public Object getHeader(String headerName) throws Exception{
		return client.getRequestContext().get(headerName);
	}
	
	/**
	 * Description : 웹서비스 서버와의 접속 종료
	 * @throws Exception
	 * @return void
	 */
	public void destroy(){
		try{
			client.destroy();
		}catch(NullPointerException npe){
			npe.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Description : 웹서비스 연동 정보를 관리하는 BindingOperationInfo 정보와 Parameter 정보(input)을 이용하여 서비스 호출 후 결과를 리턴
	 * @param boi
	 * @param input
	 * @return
	 * @throws Exception
	 */
	public Object[] call(BindingOperationInfo boi, Object input)throws Exception{
		Object[] params = {input};
		/** Print Request Object into log */ 
		if(logger.isInfoEnabled()){
			try{
				logger.info("Request >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(input, ToStringStyle.DEFAULT_STYLE));
			}catch(Exception ex){ex.printStackTrace();}
		}
		Object[] resObj = client.invoke (boi, params);
		/** Print Response Object into log */ 
		if(logger.isInfoEnabled()){
			try{
				for(int index=0; index<resObj.length; index++){
					logger.info("Response >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(resObj[index], ToStringStyle.DEFAULT_STYLE));
				}
			}catch(Exception ex){ex.printStackTrace();}
				
		}
		return resObj;
	}

	/**
	 * Description : 웹서비스 연동 정보를 관리하는 BindingOperationInfo 정보와 배열형태의 Parameter 정보(input)을 이용하여 서비스 호출 후 결과를 리턴
	 * @param boi
	 * @param input
	 * @return
	 * @throws Exception
	 */
	public Object[] call(BindingOperationInfo boi, Object[] input)throws Exception{
		/** Print Request Object into log */ 
		if(logger.isInfoEnabled()){
			try{
				for(int index=0; index<input.length; index++){
					logger.info("Request >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(input[index], ToStringStyle.DEFAULT_STYLE));
				}
			}catch(Exception ex){ex.printStackTrace();}
		}
		Object[] resObj = client.invoke (boi, input); 
		/** Print Response Object into log */ 
		if(logger.isInfoEnabled()){
			try{
				for(int index=0; index<resObj.length; index++){
					logger.info("Response >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(resObj[index], ToStringStyle.DEFAULT_STYLE));
				}
			}catch(Exception ex){ex.printStackTrace();}
		}
		return resObj;
	}
	
	/**
	 * Description : 연동하고자 하는 웹서비스에 필요한 Parameter 정보(input)를 전달, 서비스 호출 후 결과를 리턴
	 * @param input
	 * @return
	 * @throws Exception
	 */
	public Object[] call(Object input) throws Exception{
		/** Make connection to WebService Server*/
		if(!checkOPName) throw new Exception("You should set makeOperationName()!!!");
		if(client == null) throw new Exception("Must call connect() before call()!!!");
		/** Print Request Object into log */ 
		if(logger.isInfoEnabled()){
			try{
				logger.info("Request >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(input, ToStringStyle.DEFAULT_STYLE));
			}catch(Exception ex){ex.printStackTrace();}
		}
		Object[] params = {input};
		/** Print Response Object into log */ 
		Object[] resObj = client.invoke (this.opName, params);
		
		/** 2012.07.06 노진욱 추가 */
		if(resObj != null && resObj.length > 0)
		{
			int j = 0;
			for(int i = 0; i < resObj.length; i++)
			{
				if(resObj[i] != null && (resObj[i].getClass().getName() != "java.lang.Object"))
				{
					resObj[j] = resObj[i];
					if(logger.isInfoEnabled())
					{
						logger.info("Reponse Object >>> " + "Index[" + j + "] = " + resObj[j].getClass().getName());
					}
					j++;
				}
			}
		}
		
		if(logger.isInfoEnabled()){
			try{
				for(int index=0; index<resObj.length; index++){
					logger.info("Response >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(resObj[index], ToStringStyle.DEFAULT_STYLE));
				}
			}catch(Exception ex){ex.printStackTrace();}
		}
		return resObj;
	}
	
	/**
	 * Description : 연동하고자 하는 웹서비스에 필요한 배열형태의 Parameter 정보(input)를 전달, 서비스 호출 후 결과를 리턴
	 * @param input
	 * @return
	 * @throws Exception
	 */	
	public Object[] call(Object[] input) throws Exception
	{
		/** Make connection to WebService Server*/
		if(!checkOPName) throw new Exception("You should set makeOperationName()!!!");
		if(client == null) throw new Exception("Must call connect() before call()!!!");
		/** Print Request Object into log */ 
		if(logger.isInfoEnabled()){
			try{
				for(int index=0; index<input.length; index++){
					logger.info("Request >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(input[index], ToStringStyle.DEFAULT_STYLE));
				}
			}catch(Exception ex){ex.printStackTrace();}
		}
		
//		Endpoint cxfEndpoint = client.getEndpoint();
//		HttpProtocolInterceptor interceptor = new HttpProtocolInterceptor();
//		cxfEndpoint.getInInterceptors().add(interceptor);
//		client.getInInterceptors().add(interceptor);
//		
		/** 2012.07.06  노진욱 추가 */
		client.getInInterceptors().add(new LoggingInInterceptor());
		client.getOutInterceptors().add(new LoggingOutInterceptor());

		/** Print Response Object into log */
		Object[] resObj = client.invoke (this.opName, input);
		
		/** 2012.07.06  노진욱 추가 */
		if(resObj != null && resObj.length > 0)
		{
			int j = 0;
			for(int i = 0; i < resObj.length; i++)
			{
				if(resObj[i] != null && (resObj[i].getClass().getName() != "java.lang.Object"))
				{
					resObj[j] = resObj[i];
					if(logger.isInfoEnabled())
					{
						logger.info("Reponse Object >>> " + "Index[" + j + "] = " + resObj[j].getClass().getName());
					}
//					System.out.println("Index[" + j + "] = " + resObj[j].getClass().getName());
					j++;
				}
			}
		}
//		client.getOutInterceptors().add(new SOAPHeaderOutInterceptor());
//      client.getInInterceptors().add(new SOAPHeaderOutInterceptor());
	
		if(logger.isInfoEnabled()){
			try{
				for(int index=0; index<resObj.length; index++){
					logger.info("Response >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(resObj[index], ToStringStyle.DEFAULT_STYLE));
				}
			}catch(Exception ex){ex.printStackTrace();}
		}
		return resObj;
	}
	
	
	/**
	 * Description : 연동하고자 하는 웹서비스에 필요한 배열형태의 Parameter 정보(input)를 전달, 서비스 호출 후 결과를 리턴
	 * @param input
	 * @return
	 * @throws Exception
	 */	
	public Object[] pipCall(Object[] input) throws Exception
	{
		/** Make connection to WebService Server*/
		if(!checkOPName) throw new Exception("You should set makeOperationName()!!!");
		if(client == null) throw new Exception("Must call connect() before call()!!!");
		/** Print Request Object into log */ 
		if(logger.isInfoEnabled()){
			try{
				for(int index=0; index<input.length; index++){
					logger.info("Request >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(input[index], ToStringStyle.DEFAULT_STYLE));
				}
			}catch(Exception ex){ex.printStackTrace();}
		}
		
//		Endpoint cxfEndpoint = client.getEndpoint();
//		HttpProtocolInterceptor interceptor = new HttpProtocolInterceptor();
//		cxfEndpoint.getInInterceptors().add(interceptor);
//		client.getInInterceptors().add(interceptor);
//		
		/** 2012.07.06  노진욱 추가 */
		client.getInInterceptors().add(new LoggingInInterceptor());
		client.getOutInterceptors().add(new LoggingOutInterceptor());
		
		/** Print Response Object into log */ 
		Object[] resObj = client.invoke (this.opName, input);
		
		/** 2012.07.06  노진욱 추가 */
		if(resObj != null && resObj.length > 0)
		{
			int j = 0;
			for(int i = 0; i < resObj.length; i++)
			{
				if(resObj[i] != null && (resObj[i].getClass().getName() != "java.lang.Object"))
				{
					resObj[j] = resObj[i];
					if(logger.isInfoEnabled())
					{
						logger.info("Reponse Object >>> " + "Index[" + j + "] = " + resObj[j].getClass().getName());
					}
//					System.out.println("Index[" + j + "] = " + resObj[j].getClass().getName());
					j++;
				}
			}
		}
//		client.getOutInterceptors().add(new SOAPHeaderOutInterceptor());
//      client.getInInterceptors().add(new SOAPHeaderOutInterceptor());
		
		if(logger.isInfoEnabled()){
			try{
				for(int index=0; index<resObj.length; index++){
					logger.info("Response >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(resObj[index], ToStringStyle.DEFAULT_STYLE));
				}
			}catch(Exception ex){ex.printStackTrace();}
		}
		return resObj;
	}
	
	/**
	 * Description : WSDL상에 등재된 Service Name, Binding Name, Operation Name 및 Namespace 정보를 이용하여
	 * 연동하려는 Operation의 Information 정보를 가져오는 메소드
	 * @param namespace
	 * @param serviceName
	 * @param bindingName
	 * @param operatioName
	 * @return
	 */
	public BindingOperationInfo getBindingOperationInfo(String namespace, String serviceName, String bindingName, String operatioName){
		BindingOperationInfo boi =  null;
		boolean check = false;
		try{
			if(client == null) throw new Exception("Must set connect() before calling getBindingOperationInfo()!!!");
			Endpoint endpoint = client.getEndpoint();
			
			/** Whether Service Name exists or not...Check */
			QName svcName = new QName(namespace, serviceName);
			ServiceInfo serviceInfo = null;
			int serviceListCount = endpoint.getService().getServiceInfos().size();
			for(int i = 0; i < serviceListCount; i++){
				serviceInfo = endpoint.getService().getServiceInfos().get(i);
				if(serviceInfo.getName().equals(svcName)){
					check = true;
					break;
				}
			}
			if(!check) throw new Exception("Must identify service name!!!! ServiceName is wrong!!!");
			check = false;

			/** 선택한 서비스에 대한 Binding 정보 조회 */
			BindingInfo binding = null;
			QName bdName = new QName(namespace, bindingName);
			Iterator<BindingInfo> iterator = serviceInfo.getBindings().iterator();
			while(iterator.hasNext()){
				BindingInfo bi = (BindingInfo)iterator.next();
				if(bi.getName().equals(bdName)){
					binding = bi;
					check = true;
					break;
				}
			}
			if(!check) throw new Exception("Must identify binding name!!!! BindingName is wrong!!!");
			//binding = serviceInfo.getBinding(bdName);
			
			check = false;
			/** Binding Operation 정보 조회 */			
			QName operationName = new QName(namespace, operatioName);
			Iterator<BindingOperationInfo> iterfator2 = binding.getOperations().iterator();
			while(iterfator2.hasNext()){
				BindingOperationInfo oper = (BindingOperationInfo)iterfator2.next();
				if(oper.getName().equals(operationName)){
					boi = oper;
					check = true;
					break;
				}
			}
			if(!check) throw new Exception("Must identify operation name!!!! OperationName is wrong!!!");
			//boi = binding.getOperation(operationName);
		}catch(Exception e){
			e.printStackTrace();
		}
		return boi;
	}
}
