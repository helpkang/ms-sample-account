package com.kal.framework.integration.adaptor.support;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.log4j.Logger;

import com.kal.framework.exception.FwException;
import com.kal.framework.integration.adaptor.WebServiceAdaptorStatic;
import com.kal.framework.web.util.CommonUtil;

/**
 * WebService Adaptor Implementator :
 * <p> WebServiceAdaptorStatic 클래스의 Implementator. 개발자는 WebServiceAdaptorStaticImpl 클래스에 접근하여 웹서비스 연동 처리.
 * 
 * @author 조인호
 * @version 1.0
 * @since 2012-03-23
 */
public class WebServiceAdaptorStaticImpl extends WebServiceAdaptorStatic{

	private static Logger logger = Logger.getLogger(WebServiceAdaptorStaticImpl.class);
	private Method[] awsptMethod;
	private Map<String, Method> serviceList = new HashMap<String, Method>();;
	
	public WebServiceAdaptorStaticImpl(){
	}
	
	/**
	 * Description : 웹서비스에 접속에 필요한 설정정보 (wsdlLocation, 웹서비스 서비스 클래스, 
	 * 웹서비스 바인딩 클래스 정보) 를 이용하여 웹서비스 서버에 접속. <br>
	 * WebServiceAdaptorStatic 클래스의 init() 메소드 호출함.
	 * @throws Exception
	 * @return void
	 */
	public void connect() throws Exception{
		super.init();
		awsptMethod   = bindingMethod;
		setServiceList();
	}
	
	/**
	 * Description : WebServiceAdaptorStatic 클래스의 close() 메소드 호출함.
	 * @return void
	 */
	public void destroy() {
		super.close();
		awsptMethod = null;
		serviceList = null;
	}
	
	/**
	 * Description : 웹서비스 바인딩 클래스에 노출된 서비스 리스트에서 methodName에 해당되는 서비스와 
	 * 서비스 호출에 필요한 requestObj, session 정보를 이용하여 서비스 요청 후 결과를 리턴
	 * @param methodName
	 * @param requestObj
	 * @param session
	 * @return
	 */
	public Object call(String methodName, Object requestObj, Object session)
		throws Exception
	{
		Object returnObj=null;

		if(serviceList.size() < 1) init();
		Method m  = (Method)serviceList.get(methodName);
		if(m == null) throw new Exception("Can't find the requested operation name : " + methodName + "!!!");
			
		/** Print Request Object into log */ 
		if(logger.isDebugEnabled()){
			try{
				logger.debug("Request >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(requestObj, ToStringStyle.DEFAULT_STYLE));
				logger.debug("Request >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(session, ToStringStyle.DEFAULT_STYLE));
			}catch(Exception ex){ex.printStackTrace();}
		}
		returnObj = m.invoke(getWebServiceBidingObject(), requestObj, session);
		/** Print Respone Object into log */ 
		if(logger.isDebugEnabled()){
			try{
				logger.debug("Response >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(returnObj, ToStringStyle.DEFAULT_STYLE));
				logger.debug("Response >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(session, ToStringStyle.DEFAULT_STYLE));
			}catch(Exception ex){ex.printStackTrace();}
		}
		m = null;

		return returnObj;
	}
	
	/**
	 * Description : 웹서비스 바인딩 클래스에 노출된 서비스 리스트에서 methodName에 해당되는 서비스와
	 *  서비스 호출에 필요한 정보를 Object[] 형태로 전달받아, 서비스 요청 후 결과를 리턴
	 * @param methodName
	 * @param requestArrayObj
	 * @return
	 */
	public Object call(String methodName, Object[] requestArrayObj)
		throws Exception	
	{
		Object returnObj=null;

		Method m  = (Method)serviceList.get(methodName);
		if(m == null) throw new Exception("Can't find the requested operation name : " + methodName + "!!!");
		if(checkParamTypes(m, requestArrayObj)){
			/** Print Request Object into log */ 
			if(logger.isInfoEnabled()){
				try{
					for(int index=0; index<requestArrayObj.length; index++){
						logger.info("Request >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(requestArrayObj[index], ToStringStyle.DEFAULT_STYLE));
					}
				}catch(Exception ex){ex.printStackTrace();}
			}
			returnObj = m.invoke(getWebServiceBidingObject(), requestArrayObj);
			/** Print Response Object into log */ 
			if(logger.isInfoEnabled()){
				try{
					logger.info("Response >>>"+CommonUtil.getSimpleHeaderLog()+"|"+ToStringBuilder.reflectionToString(returnObj, ToStringStyle.DEFAULT_STYLE));
				}catch(Exception ex){ex.printStackTrace();}
			}
		}
		m = null;
		return returnObj;
	}
	
	private boolean checkParamTypes(Method m, Object[] requestArrayObj) throws Exception{
		boolean result = false;
		Class[] paramTypes = m.getParameterTypes();
			
		if(paramTypes.length != requestArrayObj.length){
			throw new Exception("The number of parameters is not the same size as the service's!!!");
		}
		else{
			int index = 0;
			for(Class cls : paramTypes){
				if(!cls.getName().trim().equals(requestArrayObj[index++].getClass().getName().trim())){
					throw new Exception("Parameter types doesn't match up the requested operation's paramters!!!");
				}
			}
			result = true;
		}
		return result;
	}
	
	private void setServiceList() throws Exception{
		for(Method method : awsptMethod){
			serviceList.put(method.getName(), method);
		}
	}
}