package com.koreanair.ms_ibe.helper;

import com.koreanair.common.utils.ObjectSerializeUtil;
import com.koreanair.common.utils.StringUtil;
import com.koreanair.ms_ibe.service.vo.*;
import com.koreanair.ms_ibe.util.JsonUtil;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.UriBuilder;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class PaymentAuthenticationHelper {

    public HashMap<String, String> makeKakaoHeaderInputData(PaymentAuthenticationInput inputVo) {
        HashMap<String, String>envMap = new HashMap<>();
        envMap.put("method", "POST");
        envMap.put("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
        envMap.put("Accept", "application/json");
        envMap.put("Authorization", "KakaoAK 7e6251c307b5efcfd4387d52359592ce");
        envMap.put("url", "https://kapi.kakao.com/v1/payment/ready");
        return envMap;
    }

    public String makeKakaoBodyInputData(KakaoAuthenticationInput inputVo) {
        String bodyStr = "";
        HashMap<String,Object> bodyMap = new HashMap<String,Object>();
        bodyMap.put("cid", inputVo.getCid());
        bodyMap.put("partner_order_id",inputVo.getOrderNo());
        bodyMap.put("partner_user_id","keonline");
        bodyMap.put("item_name",inputVo.getProductName());
        bodyMap.put("quantity", "1");
        bodyMap.put("total_amount", inputVo.getAmount());
        bodyMap.put("tax_free_amount", inputVo.getAmountTaxFree());
        bodyMap.put("approval_url", inputVo.getCallbackUrl());
        bodyMap.put("cancel_url", inputVo.getCancelUrl());
        bodyMap.put("fail_url", inputVo.getFailUrl());
        bodyMap.put("install_month",inputVo.getInstallments());
        bodyStr = JsonUtil.mapToString(bodyMap);
        return bodyStr;
    }

    public KakaoAuthenticationOutput makeKakaoResultData(PaymentAuthenticationInput inputVo,String resultStr)throws Exception {
        KakaoAuthenticationOutput output = new KakaoAuthenticationOutput();
        Map<String, Object> stringObjectMap = JsonUtil.stringToMap(resultStr);
        if(null!=stringObjectMap.get("tid")){
            stringObjectMap.put("resultCode", "Success");
            stringObjectMap.put("orderNo", inputVo.getOrderNo());
        }else{
            stringObjectMap.put("resultCode", "Fail");
        }
        resultStr = JsonUtil.mapToString(stringObjectMap);
        output = (KakaoAuthenticationOutput) ObjectSerializeUtil.convertJsonToObject(resultStr, KakaoAuthenticationOutput.class);
        return output;
    }

    public HashMap<String, String> makePaypalHeaderInputData(PaymentAuthenticationInput inputVo) {
        HashMap<String, String>envMap = new HashMap<>();
        envMap.put("method", "POST");
        envMap.put("Content-Type", "application/x-www-form-urlencoded");
        envMap.put("Accept", "application/json");
        envMap.put("url", "https://api-3t.paypal.com/nvp");
        return envMap;
    }

    public String makePaypalBodyInputData(PaypalAuthenticationInput inputVo) {
        String bodyStr = "";
        HashMap<String,Object> bodyMap = new HashMap<>();
        bodyMap.put("USER", inputVo.getUserId());
        bodyMap.put("PWD",inputVo.getPwd());
        bodyMap.put("SIGNATURE",inputVo.getSignature());
        bodyMap.put("VERSION","204");
        bodyMap.put("METHOD", "SetExpressCheckout");
        bodyMap.put("NOSHIPPING", "1");
        bodyMap.put("SOLUTIONTYPE", "Mark");
        bodyMap.put("PAYMENTREQUEST_0_PAYMENTACTION", "Authorization");
        bodyMap.put("L_PAYMENTREQUEST_0_NAME0", "Air Ticket");
        bodyMap.put("L_PAYMENTREQUEST_0_QTY0", "1");
        bodyMap.put("L_PAYMENTREQUEST_0_AMT0",inputVo.getAmount());
        bodyMap.put("PAYMENTREQUEST_0_AMT",inputVo.getAmount());
        bodyMap.put("PAYMENTREQUEST_0_CURRENCYCODE",inputVo.getCurrency());
        bodyMap.put("PAYMENTREQUEST_0_CUSTOM", "KAL:JTVGbnDo:125294:paypal");
        bodyMap.put("RETURNURL",inputVo.getCallbackUrl());
        bodyMap.put("CANCELURL",inputVo.getCancelUrl());
        bodyStr = JsonUtil.mapToString(bodyMap);
        return bodyStr;
    }

    public HashMap<String,Object> makePaycoBodyInputData(PaycoAuthenticationInput inputVo) {
        String bodyStr = "";
        ArrayList<HashMap<String,Object>> orderProducts = new ArrayList<HashMap<String,Object>>();
        HashMap<String,Object>orderProduct = new HashMap<String, Object>();
        orderProduct.put("cpId", inputVo.getCpId());
        orderProduct.put("productId",inputVo.getProductId());
        orderProduct.put("productAmt",inputVo.getAmount());
        orderProduct.put("productPaymentAmt",inputVo.getAmount());
        orderProduct.put("sortOrdering", "1");
        orderProduct.put("productName", inputVo.getProductName());
        orderProduct.put("orderQuantity", "1");
        orderProduct.put("sellerOrderProductReferenceKey", inputVo.getOrderNo());

        HashMap<String,Object>map = new HashMap<String, Object>();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append("    \"viewOptions\":");
        stringBuilder.append("            {");
        stringBuilder.append("                \"languageCode\": \""+inputVo.getLanguage() +"\"");
        stringBuilder.append("                ,\"showMobileTopGnbYn\": \"N\"");
        stringBuilder.append("                ,\"iframeYn\": \"Y\"");
        stringBuilder.append("            }");
        if(StringUtil.isNotEmpty(inputVo.getAppUrl())){
            stringBuilder.append(",    \"appUrl\": \""+inputVo.getAppUrl()+"\"");
        }
        if(StringUtil.isNotEmpty(inputVo.getCancelMobileUrl())){
            stringBuilder.append(",    \"cancelMobileUrl\": \""+inputVo.getCancelMobileUrl()+"\"");
        }
        stringBuilder.append("}");
        map.put("extraData",stringBuilder);
        map.put("sellerKey", inputVo.getSellerKey());
        map.put("sellerOrderReferenceKey", inputVo.getOrderNo());
        map.put("totalPaymentAmt", inputVo.getAmount());
        map.put("payMode", inputVo.getPayMode());
        map.put("returnUrl", inputVo.getCallbackUrl());
        map.put("orderMethod", inputVo.getOrderMethod());
        map.put("orderProducts", orderProducts);
        map.put("orderChannel",inputVo.getOrderChannel());
        map.put("orderTitle",inputVo.getProductName());
        map.put("inAppYn",inputVo.getInAppYn());
        return map;
    }

    public PaycoAuthenticationOutput makePaycoResultData(PaymentAuthenticationInput inputVo, String resultStr)throws Exception {
        PaycoAuthenticationOutput output = new PaycoAuthenticationOutput();
        Map<String, Object> stringObjectMap = JsonUtil.stringToMap(resultStr);
        output = (PaycoAuthenticationOutput)ObjectSerializeUtil.convertJsonToObject(resultStr, PaycoAuthenticationOutput.class);
        return output;
    }

    public PaypalAuthenticationOutput makePaypalResultData(PaymentAuthenticationInput inputVo, String resultStr) throws Exception{
        PaypalAuthenticationOutput output = new PaypalAuthenticationOutput();
        Map<String, Object> resultMap = JsonUtil.stringToMap(resultStr);
        if (resultMap != null) {
            if(null!=resultMap.get("ACK")
                    &&"Success".equals(resultMap.get("ACK").toString())){
                resultMap.put("url", "https://www.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token="+ resultMap.get("TOKEN"));
                resultMap.put("resultCode", resultMap.get("ACK"));
                resultMap.put("orderNo", inputVo.getOrderNo());
                resultMap.put("token", resultMap.get("TOKEN"));
            }else{
                resultMap.put("resultCode", "Fail");
            }
        }else{
            resultMap.put("resultCode", "Fail");
        }
        output = (PaypalAuthenticationOutput)ObjectSerializeUtil.convertJsonToObject(resultStr, PaypalAuthenticationOutput.class);
        return output;
    }

    public HashMap<String, String> makeTossHeaderInputData(PaymentAuthenticationInput inputVo) {
        HashMap<String, String>envMap = new HashMap<>();
        envMap.put("method", "POST");
        envMap.put("Content-Type", "application/json");
        envMap.put("Accept", "application/json");
        envMap.put("url", "https://pay.toss.im/api/v1/payments");
        return envMap;
    }

    public String makeTossBodyInputData(PaymentAuthenticationInput inputVo) {
        String bodyStr = "";
        HashMap<String,Object> bodyMap = new HashMap<>();
        bodyMap.put("orderNo", inputVo.getOrderNo());
        bodyMap.put("amount",inputVo.getAmount());
        bodyMap.put("amountTaxFree",inputVo.getAmountTaxFree());
        bodyMap.put("productDesc",inputVo.getProductName());
        bodyMap.put("apiKey", "SetExpressCheckout");
        bodyMap.put("autoExecute", "false");
        bodyMap.put("resultCallback", inputVo.getCallbackUrl());
        bodyMap.put("retUrl", inputVo.getFailUrl());
        bodyMap.put("retCancelUrl", inputVo.getCancelUrl());
        bodyStr = JsonUtil.mapToString(bodyMap);
        return bodyStr;
    }

    public TossAuthenticationOutput makeTossResultData(PaymentAuthenticationInput inputVo, String resultStr)throws Exception {
        TossAuthenticationOutput output = new TossAuthenticationOutput();
        Map<String, Object> resultMap = JsonUtil.stringToMap(resultStr);
        if (resultMap != null) {
            resultMap.put("orderNo", inputVo.getOrderNo());
        }
        resultStr = JsonUtil.mapToString(resultMap);
        output = (TossAuthenticationOutput)ObjectSerializeUtil.convertJsonToObject(resultStr, TossAuthenticationOutput.class);
        return output;
    }

    public HashMap<String, String> makeAlipayHeaderInputData(PaymentAuthenticationInput inputVo) {
        HashMap<String, String>envMap = new HashMap<>();
        envMap.put("method", "GET");
        envMap.put("Content-Type", "application/json");
        envMap.put("Accept", "application/json");
        return envMap;
    }

    public HashMap<String,Object> makeAlipayInputData(AlipayAuthenticationInput inputVo) {
        HashMap<String,Object> inputMap = new HashMap<>();
        HashMap<String,Object> paramMap = new HashMap<>();
        paramMap.put("pnrNumber",inputVo.getReservationRecLoc());
        paramMap.put("pnrNumeralNumber",inputVo.getReservationNumber());
        paramMap.put("total_fee",inputVo.getAmount());
        paramMap.put("userId","ANONYMOUS");
        paramMap.put("officeId",inputVo.getOfficeId());
        //pc or mobile
        paramMap.put("device","PCW");
        paramMap.put("return_url",inputVo.getCallbackUrl());
        paramMap.put("nt_url",inputVo.getNotifyUrl());
        inputMap.put("param", paramMap);
        inputMap.put("host", "https://gps.koreanair.com/pg/aliPay/return_oid.jsp");
        return inputMap;
    }

    public AlipayAuthenticationOutput makeAlipayOutputData(String result, AlipayAuthenticationInput inputVo) {
        AlipayAuthenticationOutput output = new AlipayAuthenticationOutput();
        if(result != null) {
            result = result.replaceAll("\r\n", "").replaceAll("\n", "");
            if (result.contains("out_trade_no") && result.contains("sign")) {
                if (result.contains(",") && result.split(",").length > 0) {
                    String[] resultStr = result.split(",");
                    output.setOrderNo(resultStr[0].substring(resultStr[0].indexOf("=") + 1).trim());
                    output.setMd5(resultStr[1].substring(resultStr[1].indexOf("=") + 1).trim());
                }
            }
        }else{
            //exception처리
        }
        HashMap<String,Object>paramMap = new HashMap<>();
        paramMap.put("_input_charset", "utf-8");
        paramMap.put("it_b_pay", "10m");
        paramMap.put("notify_url", inputVo.getNotifyUrl());
        paramMap.put("out_trade_no", output.getOrderNo());
        paramMap.put("partner", "2088701818975853");
        paramMap.put("payment_type", "1");
        paramMap.put("paymethod", "bankPay");
        paramMap.put("return_url", inputVo.getCallbackUrl());
        paramMap.put("seller_email", "hechen@koreanair.com");
        paramMap.put("service", "create_direct_pay_by_user");
        paramMap.put("show_url", "http://www.xxx.com/order/myorder.jsp");
        paramMap.put("subject", "KOREANAIR");
        paramMap.put("total_fee", inputVo.getAmount());
        paramMap.put("sign", output.getMd5());
        String param = urlEncodeUTF8(paramMap);
        String url  = "https://mapi.alipay.com/gateway.do?"+param;
        output.setUrl(url);
        return output;
    }

    public String urlEncodeUTF8(Map<?,?> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<?,?> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            System.out.println(sb.toString());
            sb.append(String.format("%s=%s",
                    urlEncodeUTF8(entry.getKey().toString()), urlEncodeUTF8(entry.getValue().toString())
            ));
        }
        return sb.toString();
    }

    public String urlEncodeUTF8(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public HashMap<String, String> makeChinapayHeaderInputData(ChinapayAuthenticationInput inputVo) {
        HashMap<String, String>envMap = new HashMap<>();
        envMap.put("method", "GET");
        envMap.put("Content-Type", "application/json");
        envMap.put("Accept", "application/json");
        return envMap;
    }

    public HashMap<String, Object> makeChinapayInputData(ChinapayAuthenticationInput inputVo) {
        HashMap<String,Object> inputMap = new HashMap<>();
        HashMap<String,Object> paramMap = new HashMap<>();
        paramMap.put("pnrNumber",inputVo.getReservationRecLoc());
        paramMap.put("pnrNumeralNumber",inputVo.getReservationNumber());
        paramMap.put("OrderAmt",inputVo.getAmount());
        paramMap.put("userId","ANONYMOUS");
        paramMap.put("officeId",inputVo.getOfficeId());

        String[] currentTime = getCurrentTime();
        paramMap.put("TranDate", currentTime[0]);
        paramMap.put("TranTime", currentTime[1]);
        inputVo.setTranDate(currentTime[0]);
        inputVo.setTranTime(currentTime[1]);
        paramMap.put("RemoteAddr", "100.1.111.11");

        paramMap.put("mode",inputVo.getMode().toLowerCase());
        paramMap.put("return_url",inputVo.getCallbackUrl());
        paramMap.put("nt_url",inputVo.getNotifyUrl());
        paramMap.put("env","live");
        paramMap.put("deviceCode","PCW");

        inputMap.put("param", paramMap);
        inputMap.put("host", "https://gps.koreanair.com/pg/chinaPay/return_oid.jsp");
        return inputMap;
    }

    public ChinapayAuthenticationOutput makeChinapayOutputData(String result, ChinapayAuthenticationInput inputVo) {
        ChinapayAuthenticationOutput output = new ChinapayAuthenticationOutput();
        if(result != null) {
            result = result.replaceAll("\r\n", "").replaceAll("\n", "");
            if(result.contains("oid") && result.contains("signature")){
                if (result.contains(",") && result.split(",").length > 0) {
                    String[] resultStr = result.split(",");
                    inputVo.setOrderNo(resultStr[0].substring(resultStr[0].indexOf("=") + 1).trim());
                    output.setSignature(resultStr[1].substring(resultStr[1].indexOf("=") + 1).trim());
                }
            }
        }else{
            //exception처리
        }


        BigDecimal amt = new BigDecimal(inputVo.getAmount());
        amt = amt.multiply(new BigDecimal("100"));

        String merId = "";
        String url = "https://payment.chinapay.com/CTITS/service/rest/page/nref/000000000017/0/0/0/0/0";
        if("upop".equals(inputVo.getMode())|| "upopmob".equals(inputVo.getMode())){
            merId = "451111802220002";
        }else{
            merId = "451111802220001";
        }
        output.setVersion("20140728");
        output.setAccessType("0");
        output.setAcqCode("000000000000014");
        output.setMerId(merId);
        output.setUrl(url);
        output.setTranType("0001");
        output.setBusiType("0001");
        output.setCurryNo("CNY");
        output.setTranDate(inputVo.getTranDate());
        output.setTranTime(inputVo.getTranTime());
        output.setMerBgUrl(inputVo.getNotifyUrl());
        output.setMerPageUrl(inputVo.getCallbackUrl());
        output.setMerOrderNo(inputVo.getOrderNo());
        output.setOrderAmt(amt.toString());
        return output;
    }

    private String[] getCurrentTime() {
        String[] time = new String[2];
        SimpleDateFormat sdfmt = new SimpleDateFormat("yyyyMMddHHmmss");
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.HOUR, -1);
        String todayDate = sdfmt.format(cal.getTime());
        time[0] = todayDate.substring(0,8);
        time[1] = todayDate.substring(8,14);
        return time;
    }

}
