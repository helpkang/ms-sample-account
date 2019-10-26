package com.koreanair.ms_ibe.helper;

import com.koreanair.common_adapter.utils.ObjectSerializeUtil;
import com.koreanair.common_adapter.utils.StringUtil;
import com.koreanair.ms_ibe.service.vo.*;
import com.koreanair.ms_ibe.util.JsonUtil;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public String makeKakaoBodyInputData(PaymentAuthenticationInput inputVo) {
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
        output = (KakaoAuthenticationOutput)ObjectSerializeUtil.convertJsonToObject(resultStr, KakaoAuthenticationOutput.class);
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

    public String makePaypalBodyInputData(PaymentAuthenticationInput inputVo) {
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

    public HashMap<String,Object> makePaycoBodyInputData(PaymentAuthenticationInput inputVo) {
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
}
