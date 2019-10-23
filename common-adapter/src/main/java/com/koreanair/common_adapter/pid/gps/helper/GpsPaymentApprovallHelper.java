package com.koreanair.common_adapter.pid.gps.helper;

import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalInputVo;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalOutputVo;
import com.koreanair.common_external.pid.gps.approvalHistory.ApprovalHistoryInputVo;
import com.koreanair.common_external.pid.gps.approvalHistory.ApprovalHistoryOutputVo;
import com.koreanair.common_external.pid.gps.approvalHistory.HistoryInfo;
import com.koreanair.common_external.pid.gps.approvalHistory.HistoryInfo2;
import com.koreanair.common_external.pid.gps.approvalRequest.ApprovalRequestService;
import com.koreanair.common_external.pid.gps.approvalRequest.CybersourceDmInfo;
import com.koreanair.common_external.pid.gps.approvalRequest.GeneralInfo;
import com.koreanair.common_external.pid.gps.approvalRequest.GeneralInfo2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Component
public class GpsPaymentApprovallHelper {

    public ApprovalRequestService makeApprovalRequestServiceInput(PaymentApprovalInputVo inputVo) {
        ApprovalRequestService gpsinput = new ApprovalRequestService();

        //홈페이지로그인아이디
        inputVo.getGeneralinfo().setUserId("ANONYMOUS");
        //발권시 사용할 officeId
        inputVo.getGeneralinfo().setOfcId("SELKE08IW");
        //officeID와 1:1맵핑되는 iata번호
        inputVo.getGeneralinfo().setIataNo("17392340");
        //고정값
        inputVo.getGeneralinfo().setSign("0001AA");
        inputVo.getGeneralinfo().setChannel(4);
        inputVo.getGeneralinfo().setReqSys("IBE");
        inputVo.getGeneralinfo().setErrLang("ENG");
        inputVo.getGeneralinfo().setApvStatus("A");
        inputVo.getGeneralinfo().setReqNoTyp(1);
        inputVo.getGeneralinfo().setTid("K0");

        //국내선 D, 국제선 I
        inputVo.getGeneralinfo().setDomIntTyp("I");

        if("KAKAO".equalsIgnoreCase(inputVo.getPaymentType())){
            kakaoInput(inputVo);
        }else if("PAYCO".equalsIgnoreCase(inputVo.getPaymentType())){
            paycoInput(inputVo);
        }else if("BNKP".equalsIgnoreCase(inputVo.getPaymentType())) {
            bankpayInput(inputVo);
        }else if("PAYPAL".equalsIgnoreCase(inputVo.getPaymentType())) {
            paypalInput(inputVo);
        }else if("CBSC".equalsIgnoreCase(inputVo.getPaymentType())
        ||"WORLD_PAY".equalsIgnoreCase(inputVo.getPaymentType())
        ){
            cbscInput(inputVo);
        }else{
            //KICC or SAMSUNGPAY
            convertForKmotion(inputVo);
            kiccSamsungPayInput(inputVo);
        }



        gpsinput.setGeneralinfo(inputVo.getGeneralinfo());
        if (null != inputVo.getAuthinfo()) {
            gpsinput.setAuthinfo(inputVo.getAuthinfo());
        }
        if (null != inputVo.getCybersourceaddedinfo()) {
            gpsinput.setCybersourceaddedinfo(inputVo.getCybersourceaddedinfo());
        }
        if (null != inputVo.getCybersourceDmInfo()) {
            gpsinput.setCybersourceDmInfo(inputVo.getCybersourceDmInfo());
        }

        return gpsinput;
    }

    public PaymentApprovalOutputVo makeApprovalRequestServiceOutput(GeneralInfo2 output) {
        PaymentApprovalOutputVo outputVo = new PaymentApprovalOutputVo();
        return outputVo;
    }

    private void convertForKmotion(PaymentApprovalInputVo inputVo) {
        if("KICC".equalsIgnoreCase(inputVo.getPaymentType())
                ||"SAMSUNG".equalsIgnoreCase(inputVo.getPaymentType())){
            if(null!=inputVo.getGeneralinfo().getReqNo()){
                String virtualCardNumber = inputVo.getGeneralinfo().getReqNo();
                if(virtualCardNumber.length()>16){
                    inputVo.getGeneralinfo().setReqNo(StringUtils.substring(virtualCardNumber, 0, 16));
                    inputVo.getAuthinfo().setKvpCardPrefix(StringUtils.substring(virtualCardNumber, 16));
                    inputVo.getGeneralinfo().setCcVldYM("1189");
                }
            }
        }
    }

    private void kakaoInput(PaymentApprovalInputVo inputVo) {
        inputVo.getGeneralinfo().setPayMthd("P");
        inputVo.getGeneralinfo().setCurrency("KRW");
        inputVo.getGeneralinfo().setPayDstn("KAKAOPAY");
        inputVo.getGeneralinfo().setAuthn("KKP");
        inputVo.getGeneralinfo().setReqNo(inputVo.getAuthinfo().getMerchantTxnNum());
    }

    private void paycoInput(PaymentApprovalInputVo inputVo) {
        inputVo.getGeneralinfo().setPayMthd("Q");
        inputVo.getGeneralinfo().setCurrency("KRW");
        inputVo.getGeneralinfo().setPayDstn("PAYCO");
        inputVo.getGeneralinfo().setAuthn("PCO");
        inputVo.getGeneralinfo().setReqNo(inputVo.getAuthinfo().getSellerOrderReferenceKey());
    }

    private void paypalInput(PaymentApprovalInputVo inputVo) {

    }

    private void cbscInput(PaymentApprovalInputVo inputVo) {
        inputVo.getGeneralinfo().setPayMthd("C");
        if(null==inputVo.getCybersourceDmInfo().getThirdPartyPurchaseYn()){
            inputVo.getCybersourceDmInfo().setThirdPartyPurchaseYn("N");
        }

        if (StringUtils.isBlank(inputVo.getCybersourceaddedinfo().getPARes())) {
            // PARes 값이 없으면 C&A인증.
            if(null==inputVo.getGeneralinfo().getPayDstn()
                    ||"".equals(inputVo.getGeneralinfo().getPayDstn())
            ){
                inputVo.getGeneralinfo().setAuthn("C&A");
            }else{
                inputVo.getGeneralinfo().setAuthn("");
            }
            //3ds2.0
            if(null!=inputVo.getCybersourceDmInfo()
                &&null!=inputVo.getCybersourceDmInfo().getVersion()){
                inputVo.getGeneralinfo().setAuthn("3DS");
            }
        } else {
            // PARes 값이 있으면 3DS인증.
            inputVo.getGeneralinfo().setAuthn("3DS");
        }

        if ("CAD".equals(inputVo.getGeneralinfo().getCurrency())) {		// 결제통화가 CAD이면,
            if(null==inputVo.getGeneralinfo().getPayDstn()
                    ||"".equals(inputVo.getGeneralinfo().getPayDstn())
            ){
                /*
                if("VI".equals(inputVo.getCardType())
                        ||"CA".equals(inputVo.getCardType())
                        ||"AX".equals(inputVo.getCardType())
                ){
                    inputVo.getGeneralinfo().setPayDstn("CYBERSOURCE");	// Viaconex로 결제
                    inputVo.getGeneralinfo().setApvStatus("S");
                }else{
                    inputVo.getGeneralinfo().setPayDstn("");	// Viaconex로 결제
                }
                 */
                inputVo.getGeneralinfo().setPayDstn("CYBERSOURCE");	// 사이버소스로 결제
                inputVo.getGeneralinfo().setApvStatus("S");
            }
            // 2015-04-23 by ST.LEE
            String DmCountry = inputVo.getCybersourceDmInfo().getBillToCountry();
            inputVo = setDminfo(inputVo);
            inputVo.getCybersourceaddedinfo().setCountry(DmCountry);
            //inputVo = setSkypassInfo(inputVo);
        } else {
            // Dim에 Country 와 AddInfo County를 바꾼다.
            // 2015-04-02 BY ST.LEE
            String DmCountry = inputVo.getCybersourceDmInfo().getBillToCountry();
            inputVo = setDminfo(inputVo);
            inputVo.getCybersourceaddedinfo().setCountry(DmCountry);
            //inputVo = setSkypassInfo(inputVo);
            if(null==inputVo.getGeneralinfo().getPayDstn()
                    ||"".equals(inputVo.getGeneralinfo().getPayDstn())
            ){
                inputVo.getGeneralinfo().setPayDstn("CYBERSOURCE");	// 그 외에는 CyberSource로 결제
                inputVo.getGeneralinfo().setApvStatus("S");
            }else{
                inputVo.getGeneralinfo().setApvStatus("A");
            }
        }

        // Cyber Source 무상 결제시 PCC-ON 처리를 위한 Farebasis 정보를 PUT (2015-09-09)
        //LoggingUtil.doMessageLogging("Cybersource Farebasis Put", IBESessionUtils.getFareBasis() + "");
        //ArrayList<String> fareBasisList 	= IBESessionUtils.getFareBasis();
        ArrayList<String> fareBasisList 	= new ArrayList<>();
        StringBuffer inputFareBasis = new StringBuffer();
        String airlineFarebasis = "";
        int i=0;
        if (fareBasisList != null) {
            for (String fareBasis : fareBasisList) {
                if(i==0){
                    airlineFarebasis=fareBasis;
                }
                inputFareBasis.append(fareBasis).append(";");
                i++;
            }
        }
        //LoggingUtil.doMessageLogging("Cybersource Farebasis Info", inputFareBasis.toString());
        if (inputFareBasis.length() > 1) {
            inputVo.getCybersourceDmInfo().setFareBasisList(
                    inputFareBasis.substring(0, inputFareBasis.length() - 1).toString());
            inputVo.getCybersourceDmInfo().setAirlineDataFareBasis(airlineFarebasis);
        }
    }
    private void bankpayInput(PaymentApprovalInputVo inputVo) {
        inputVo.getGeneralinfo().setPayMthd("A");
        inputVo.getGeneralinfo().setCurrency("KRW");
        inputVo.getGeneralinfo().setPayDstn("BANKPAY");
    }
    private void kiccSamsungPayInput(PaymentApprovalInputVo inputVo) {
        inputVo.getGeneralinfo().setPayMthd("C");
        inputVo.getGeneralinfo().setCurrency("KRW");
        inputVo.getGeneralinfo().setPayDstn("VAN");
        if(null!=inputVo.getAuthinfo().getReqType() && !"".equals(inputVo.getAuthinfo().getReqType())){
            if ("2".equals(inputVo.getAuthinfo().getReqType())) {
                inputVo.getGeneralinfo().setAuthn("");
            } else if("1".equals(inputVo.getAuthinfo().getReqType())) {
                inputVo.getGeneralinfo().setAuthn("ISP");
                if(null!=inputVo.getAuthinfo()
                        &&null!=inputVo.getAuthinfo().getHalbuinfo()){
                    inputVo.getAuthinfo().setKvpQuota(inputVo.getAuthinfo().getHalbuinfo());
                }
            }

            else if("0".equals(inputVo.getAuthinfo().getReqType())){
                inputVo.getGeneralinfo().setAuthn("ISP");
                if(null!=inputVo.getAuthinfo()
                        &&null!=inputVo.getAuthinfo().getHalbuinfo()){
                    inputVo.getAuthinfo().setKvpQuota(inputVo.getAuthinfo().getHalbuinfo());
                }
            }

            else{
                //오류처리
                //throw BizRuntimeException.create("8021");
            }
            //reqType은 GPS에 보내면 안됨. IBE에서만 사용됨
            inputVo.getAuthinfo().setReqType(null);
        }else{
            if (StringUtils.isNotBlank(inputVo.getAuthinfo().getXid())) {
                inputVo.getGeneralinfo().setAuthn("MPI");
            } else {
                inputVo.getGeneralinfo().setAuthn("ISP");
            }
        }
        //삼성페이일때는 cavv,eci
        if("SAMSUNG".equals(inputVo.getPaymentType())){
            if("ISP".equals(inputVo.getGeneralinfo().getAuthn())){
                if(null!=inputVo.getAuthinfo().getKvpEncdata()){
                }
                if(null!=inputVo.getGeneralinfo() && null!=inputVo.getGeneralinfo().getCcVldYM()){
                    if(!"1189".equals(inputVo.getGeneralinfo().getCcVldYM())){
                        inputVo.getGeneralinfo().setCcVldYM(null);
                    }
                }
                if(null!=inputVo.getAuthinfo().getXid()){
                    inputVo.getAuthinfo().setXid(null);
                }
            }

            if(null!=inputVo.getAuthinfo()){
                if(null!=inputVo.getAuthinfo().getCavv() && "".equals(inputVo.getAuthinfo().getCavv())){
                    inputVo.getAuthinfo().setCavv(null);
                }
                if(null!=inputVo.getAuthinfo().getEci() && "".equals(inputVo.getAuthinfo().getEci())){
                    inputVo.getAuthinfo().setEci(null);
                }
            }
            inputVo.setPaymentType("KICC");
        }
    }

    private PaymentApprovalInputVo setDminfo(PaymentApprovalInputVo inputVo) {
        CybersourceDmInfo dmInfo = inputVo.getCybersourceDmInfo();

        dmInfo.setQuantity("1");
        dmInfo.setUnitPrice(inputVo.getGeneralinfo().getReqAmt());
        dmInfo.setBillToCity(inputVo.getCybersourceaddedinfo().getCity());
        dmInfo.setBillToCountry(inputVo.getCybersourceaddedinfo().getCountry());
        dmInfo.setBillToEmail(inputVo.getCybersourceaddedinfo().getEmail());
        dmInfo.setBillToFirstName(inputVo.getCybersourceaddedinfo().getFirstName());
        dmInfo.setBillToLastName(inputVo.getCybersourceaddedinfo().getLastName());
        //dmInfo.setBillToIpAddress(ClassificationUtils.getClientIp());
        dmInfo.setBillToIpAddress("111.111.111.111");
        dmInfo.setBillToPostalCode(inputVo.getCybersourceaddedinfo().getPostalCode());
        dmInfo.setBillToState(inputVo.getCybersourceaddedinfo().getState());
        if("".equals(dmInfo.getBillToState())){
            dmInfo.setBillToState(null);
            inputVo.getCybersourceaddedinfo().setState(null);
        }

        dmInfo.setBillToStreet1(inputVo.getCybersourceaddedinfo().getAddress1());
        dmInfo.setCardAccountNumber(inputVo.getGeneralinfo().getReqNo());
        dmInfo.setCardExpirationMonth(inputVo.getGeneralinfo().getCcVldYM().substring(0, 2));
        dmInfo.setCardExpirationYear("20" + inputVo.getGeneralinfo().getCcVldYM().substring(2, 4));
        dmInfo.setShipToFirstName(inputVo.getCybersourceaddedinfo().getFirstName());
        dmInfo.setShipToLastName(inputVo.getCybersourceaddedinfo().getLastName());
        dmInfo.setPurchaseTotalsCurrency(inputVo.getGeneralinfo().getCurrency());
        // 여정의 도시 CODE 외 국가 정보 추가
        // 2015.05.13
        String TravellData = inputVo.getCybersourceDmInfo().getDecisionManagerTravelDataCompleteRoute();
        String nation = "";
        String depApo = "";
        String appApo = "";
        if (null != TravellData ) {
            //depApo = CacheValueUtils.airportToCountry(TravellData.substring(0, 3));
            nation = depApo;
            if (TravellData.indexOf("-") > -1) {
             //   appApo = CacheValueUtils.airportToCountry(TravellData.substring(4, 7));
                nation = nation +";"+appApo;
            }
        }
        String awad = inputVo.isAward()?"Y":"N";//   StringUtils.startsWith(serviceName, "R") ? "N" : "Y";

        TravellData = TravellData+";"+nation+";"+awad;
        dmInfo.setDecisionManagerTravelDataCompleteRoute(TravellData);
        dmInfo.setDecisionManagerTravelDataJourneyType(inputVo.getCybersourceDmInfo().getDecisionManagerTravelDataJourneyType());
        inputVo.setCybersourceDmInfo(dmInfo);
        return inputVo;
    }

}
