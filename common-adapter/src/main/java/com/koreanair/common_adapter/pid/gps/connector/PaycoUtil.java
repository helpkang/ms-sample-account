package com.koreanair.common_adapter.pid.gps.connector;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.HttpsURLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**-----------------------------------------------------------------------
 * 페이코 연동 유틸리티
 *------------------------------------------------------------------------
 * @Class PaycoUtil
 * @author PAYCO기술지원<dl_payco_ts@nhnent.com>
 * @since 2015.03.24.
 * @version 1.0
 * @Description 
 */

public class PaycoUtil {
	
	//private static final String FILE_PATH   = "C:/logs";
	
	private static final Logger logger = LoggerFactory.getLogger(PaycoUtil.class);
	
	private String RESERVE_URI    			= "";
	private String APPROVAL_URI				= "";
	private String CANCEL_URI      			= "";
	private String CANCEL_CHECK_URI   		= "";
	private String UPDATE_STATUS_URI		= ""; 
	private String CANCEL_MILEAGE_URI		= "";
	private String CHECK_USABILITY_URI		= "";
	private String VARIFY_PAYMENT_URI		= "";
	
	//생성자
	public PaycoUtil(String serverType){
		
		if(serverType.equals("DEV")){
			RESERVE_URI 		= "https://alpha-api-bill.payco.com/outseller/order/reserve";
			APPROVAL_URI		= "https://alpha-api-bill.payco.com/outseller/payment/approval";
			CANCEL_URI 			= "https://alpha-api-bill.payco.com/outseller/order/cancel";
			CANCEL_CHECK_URI 	= "https://alpha-api-bill.payco.com/outseller/order/cancel/checkAvailability";
			UPDATE_STATUS_URI 	= "https://alpha-api-bill.payco.com/outseller/order/updateOrderProductStatus";
			CANCEL_MILEAGE_URI 	= "https://alpha-api-bill.payco.com/outseller/order/cancel/partMileage";
			CHECK_USABILITY_URI = "https://alpha-api-bill.payco.com/outseller/code/checkUsability";
			VARIFY_PAYMENT_URI  = "https://alpha-api-bill.payco.com/outseller/payment/approval/getDetailForVerify";
		} else {
			RESERVE_URI 		= "https://api-bill.payco.com/outseller/order/reserve";
			APPROVAL_URI		= "https://api-bill.payco.com/outseller/payment/approval";
			CANCEL_URI 			= "https://api-bill.payco.com/outseller/order/cancel";
			CANCEL_CHECK_URI 	= "https://api-bill.payco.com/outseller/order/cancel/checkAvailability";
			UPDATE_STATUS_URI 	= "https://api-bill.payco.com/outseller/order/updateOrderProductStatus";
			CANCEL_MILEAGE_URI 	= "https://api-bill.payco.com/outseller/order/cancel/partMileage";
			CHECK_USABILITY_URI = "https://api-bill.payco.com/outseller/code/checkUsability";
			VARIFY_PAYMENT_URI  = "https://api-bill.payco.com/outseller/payment/approval/getDetailForVerify";
		}
	}
	
	ObjectMapper mapper = new ObjectMapper();
	java.text.SimpleDateFormat dateformat = new java.text.SimpleDateFormat("yyyyMMdd HH:mm:ss");
	
	/**
	 * 주문예약
	 * @param map
	 * @param logYn : Y/N
	 * @return
	 */
	public String payco_reserve(Map<String, Object> map, String logYn){ 
		
	    String returnStr = "";
	    
	    try {
	    	
	    	returnStr = getSSLConnection( RESERVE_URI, mapper.writeValueAsString(map));
	    	logger.info("[" +dateformat.format(new java.util.Date()) + "][주문예약요청] " +"[callUrl :" + RESERVE_URI +" ] " + mapper.writeValueAsString(map), logYn);
	    	logger.info("[" +dateformat.format(new java.util.Date()) + "][주문예약결과] " + returnStr, logYn);
	    	
	    } catch (Exception e){
	    	e.printStackTrace();
	    	returnStr = "{\"code\":\"9999\",\"message\":\""+e.getMessage()+"\"}";
	    }
	    return returnStr;
	}
	
	/**
	 * 결제승인
	 * @param map
	 * @param logYn : Y/N
	 * @return
	 */
	public String payco_approval(Map<String, Object> map, String logYn){
		
	    String returnStr = "";
	    
	    try {
	    	
	    	returnStr = getSSLConnection( APPROVAL_URI, mapper.writeValueAsString(map));
    		
	    	logger.info("[" +dateformat.format(new java.util.Date()) + "][주문결제 승인요청] " +"[callUrl :" + APPROVAL_URI +" ] " + mapper.writeValueAsString(map), logYn);
    		logger.info("[" +dateformat.format(new java.util.Date()) + "][주문결제 승인결과] " + returnStr, logYn);
	    } catch (Exception e){
	    	e.printStackTrace();
	    	returnStr = "{\"code\":\"9999\",\"message\":\""+e.getMessage()+"\"}";
	    }
	    return returnStr;
	}
	
	/**
	 * 주문취소
	 * @param map
	 * @param logYn : Y/N
	 * @return
	 */
	public String payco_cancel(Map<String, Object> map, String logYn){
		String returnStr = "";
		
		try {
	    	returnStr = getSSLConnection( CANCEL_URI, mapper.writeValueAsString(map));
	    	
	    	logger.info("[" +dateformat.format(new java.util.Date()) + "][주문취소요청] " +"[callUrl :" + CANCEL_URI +" ] " + mapper.writeValueAsString(map), logYn);
    		logger.info("[" +dateformat.format(new java.util.Date()) + "][주문취소결과] " + returnStr, logYn);
	    } catch (Exception e){
	    	e.printStackTrace();
	    	returnStr = "{\"code\":\"9999\",\"message\":\""+e.getMessage()+"\"}";
	    }
		
		return returnStr;
	}
	
	/**
	 * 주문취소검사
	 * @param map
	 * @param logYn : Y/N
	 * @return
	 */
	public String payco_cancel_check(Map<String, Object> map, String logYn){
		String returnStr = "";
		
		try {
	    	returnStr = getSSLConnection( CANCEL_CHECK_URI, mapper.writeValueAsString(map));
    		
	    	logger.info("[" +dateformat.format(new java.util.Date()) + "][주문취소검사결과] " +"[callUrl :" + CANCEL_CHECK_URI +" ] " + returnStr, logYn);
	    } catch (Exception e){
	    	e.printStackTrace();
	    	returnStr = "{\"code\":\"9999\",\"message\":\""+e.getMessage()+"\"}";
	    }
		
		return returnStr;
	}
	
	/**
	 * 주문상태 변경
	 * @param map
	 * @param logYn : Y/N
	 * @return
	 */
	public String payco_upstatus(Map<String, Object> map, String logYn){
		String returnStr = "";
		
		try {
			returnStr = getSSLConnection( UPDATE_STATUS_URI, mapper.writeValueAsString(map));
    		
			logger.info("[" +dateformat.format(new java.util.Date()) + "][주문상태변경결과] " +"[callUrl :" + UPDATE_STATUS_URI +" ] " + returnStr, logYn);
	    } catch (Exception e){
	    	e.printStackTrace();
	    	returnStr = "{\"code\":\"9999\",\"message\":\""+e.getMessage()+"\"}";
	    }
		
		return returnStr;
	}
	
	/**
	 * 마일리지 적립취소
	 * @param map
	 * @param logYn : Y/N
	 * @return
	 */
	public String payco_cancelmileage(Map<String, Object> map, String logYn){
		String returnStr = "";
		
		try {
	    	returnStr = getSSLConnection( CANCEL_MILEAGE_URI, mapper.writeValueAsString(map));
    		
	    	logger.info("[" +dateformat.format(new java.util.Date()) + "][마일리지적립취소결과] " +"[callUrl :" + CANCEL_MILEAGE_URI +" ] " + returnStr, logYn);
	    } catch (Exception e){
	    	e.printStackTrace();
	    	returnStr = "{\"code\":\"9999\",\"message\":\""+e.getMessage()+"\"}";
	    }
		
		return returnStr;
	}
	
	/**
	 * 가맹점별 연동키 유효성 체크
	 * @param map
	 * @param logYn : Y/N
	 * @return
	 */
	public String payco_keycheck(Map<String, Object> map, String logYn){
		String returnStr = "";
		
		try {
	    	returnStr = getSSLConnection( CHECK_USABILITY_URI, mapper.writeValueAsString(map));
    		
	    	logger.info("[" +dateformat.format(new java.util.Date()) + "][가맹점별연동키유효성체크결과] " +"[callUrl :" + CHECK_USABILITY_URI +" ] " + returnStr, logYn);
	    } catch (Exception e){
	    	e.printStackTrace();
	    	returnStr = "{\"code\":\"9999\",\"message\":\""+e.getMessage()+"\"}";
	    }
		
		return returnStr;
	}
	
	/**
	 * 결제상세 조회(검증용)
	 * @param map
	 * @param logYn : Y/N
	 * @return
	 */
	public String payco_verifyPayment(Map<String, Object> map, String logYn){
		
	    String returnStr = "";
	    
	    try {
	    	returnStr = getSSLConnection( VARIFY_PAYMENT_URI, mapper.writeValueAsString(map));
    		
	    	logger.info("[" +dateformat.format(new java.util.Date()) + "][결제상세 조회 요청] " +"[callUrl :" + VARIFY_PAYMENT_URI +" ] " + mapper.writeValueAsString(map), logYn);
	    	logger.info("[" +dateformat.format(new java.util.Date()) + "][결제상세 조회 결과] " + returnStr, logYn);
	    } catch (Exception e){
	    	e.printStackTrace();
	    	returnStr = "{\"code\":\"9999\",\"message\":\""+e.getMessage()+"\"}";
	    }
	    return returnStr;
	}
	
	
	public String getConnection(String apiUrl, String arrayObj) throws Exception{
		
		URL url 			  = new URL(apiUrl); 	// 요청을 보낸 URL
		String sendData 	  = arrayObj;
		HttpURLConnection con = null;
		StringBuffer buf 	  = new StringBuffer();
		String returnStr 	  = "";
		
		try {
			con = (HttpURLConnection)url.openConnection();
			
			con.setConnectTimeout(30000);		//서버통신 timeout 설정. 페이코 권장 30초
			con.setReadTimeout(30000);			//스트림읽기 timeout 설정. 페이코 권장 30초
			
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
		    con.setDoOutput(true);
		    con.setRequestMethod("POST");
		    con.connect();
		    
		    // 송신할 데이터 전송.
		    DataOutputStream dos = new DataOutputStream(con.getOutputStream());
		    dos.write(sendData.getBytes("UTF-8"));
		    dos.flush();
		    dos.close();
		    
		    int resCode = con.getResponseCode();
		    
		    if (resCode == HttpURLConnection.HTTP_OK) {
		    
		    	BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			   	
				int c;
			    
			    while ((c = br.read()) != -1) {
			    	buf.append((char)c);
			    }
			    
			    returnStr = buf.toString();
			    br.close();
			    
		    } else {
		    	returnStr = "{ \"code\" : 9999, \"message\" : \"Connection Error\" }";
		    }
		    
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (con != null) con.disconnect();
		}
		
		return returnStr;
	}
	
	public String getSSLConnection(String apiUrl, String arrayObj) throws Exception{
		
		URL url 			   = new URL(apiUrl); 	// 요청을 보낸 URL
		String sendData 	   = arrayObj;
		HttpsURLConnection con = null;
		StringBuffer buf 	   = new StringBuffer();
		String returnStr 	   = "";
		
		try {
			con = (HttpsURLConnection)url.openConnection();
			
			con.setConnectTimeout(30000);		//서버통신 timeout 설정. 페이코 권장 30초
			con.setReadTimeout(30000);			//스트림읽기 timeout 설정. 페이코 권장 30초
			
			con.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
			con.setDoOutput(true);
		    con.setRequestMethod("POST");
		    con.connect();
		    // 송신할 데이터 전송.
		    DataOutputStream dos = new DataOutputStream(con.getOutputStream());
		    dos.write(sendData.getBytes("UTF-8"));
		    dos.flush();
		    dos.close();
		    int resCode = con.getResponseCode();
		    if (resCode == HttpsURLConnection.HTTP_OK) {
		    	BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
				int c;
			    
			    while ((c = br.read()) != -1) {
			    	buf.append((char)c);
			    }
			    returnStr = buf.toString();
			    br.close();
		    } else {
		    	returnStr = "{ \"code\" : 9999, \"message\" : \"Connection Error\" }";
		    }
		    
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (con != null) con.disconnect();
		}
		
		return returnStr;
	}
}
