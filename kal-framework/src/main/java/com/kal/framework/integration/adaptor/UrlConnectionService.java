package com.kal.framework.integration.adaptor;

// import pip_service_library.pip_session.Session;

public interface UrlConnectionService 
{
	public String call(WebServiceVo webserviceVo) throws Exception;
//	public String call(WebServiceVo vo,  KalProperties properties) throws Exception;
	// public Session parseSession(String xmlResponse) throws Exception;
	public void init();
	// public pip_service_library.pip_session.Session parsePipSession(String xmlResponse) throws Exception;
	public Boolean releaseSession(WebServiceVo webserviceVo) throws Exception;
	public Boolean destroySession(WebServiceVo webserviceVo) throws Exception;
	public Boolean releaseReUseSession(WebServiceVo webserviceVo) throws Exception;
	
}
 