package com.koreanair.common_adapter.altea.helper.pnr_retrieve_13_2_1a;

import com.koreanair.common_adapter.altea.connector.AlteaConnector;
import com.koreanair.common_adapter.altea.vo.AlteaInputVo;
import com.koreanair.common_adapter.common.vo.*;
import com.koreanair.common_adapter.utils.JAXBFactory;
import com.koreanair.common_adapter.utils.ObjectSerializeUtil;
import com.koreanair.external.altea.vo.pnr_reply_13_2_1a.*;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.PNRRetrieve;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.ReservationControlInformationDetailsType;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.ReservationControlInformationType;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.RetrievePNRType;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Component
public class RetrievePnrHelper {
    public PNRRetrieve makeRetrievePNRInput(String reservation) {
        reservation = reservation.replaceAll("-","");
        PNRRetrieve input = new PNRRetrieve();
        PNRRetrieve.RetrievalFacts refacts = new PNRRetrieve.RetrievalFacts();
        RetrievePNRType retrievepnr = new RetrievePNRType();
        retrievepnr.setType(BigInteger.valueOf(2));
        refacts.setRetrieve(retrievepnr);
        ReservationControlInformationType value = new ReservationControlInformationType();
        List<ReservationControlInformationDetailsType> list = value.getReservation();
        ReservationControlInformationDetailsType element = new ReservationControlInformationDetailsType();
        element.setControlNumber(reservation);
        element.setCompanyId("KE");
        if(reservation.length()==8){
            element.setControlType("I");
        }
        list.add(0, element);
        refacts.setReservationOrProfileIdentifier(value);
        input.setRetrievalFacts(refacts);
        return input;
    }

    public CommonPnrReply makeRetrievePNROutput(PNRReply output){
        CommonPnrReply reply = new CommonPnrReply();
        ArrayList<TravellerInformation>travellerInformationList = new ArrayList<>();
        ArrayList<TicketInformation>ticketInfoList = new ArrayList<>();
        ArrayList<TicketInformation>emdTicketInfoList = new ArrayList<>();
        ArrayList<PaymentInformation>paymentInformationList = new ArrayList<>();
        ArrayList<Itinerary>itineraryList = new ArrayList<>();
        ArrayList<ContactPoint> contactPointList = new ArrayList<>();
        ArrayList<FreeText>freeTextList = new ArrayList<>();
        ArrayList<Service>serviceList = new ArrayList<>();

        if(null!=output){
            //recloc, reservationnumber 추출
            for(PNRReply.PnrHeader pnrHeader : output.getPnrHeader()){
                if("1A".equals(pnrHeader.getReservationInfo().getReservation().get(0).getCompanyId()) &&
                        pnrHeader.getReservationInfo().getReservation().get(0).getControlType() == null){
                    reply.setReservationRecLoc(pnrHeader.getReservationInfo().getReservation().get(0).getControlNumber());
                }
                if("KE".equals(pnrHeader.getReservationInfo().getReservation().get(0).getCompanyId())){
                    reply.setReservationNumber(pnrHeader.getReservationInfo().getReservation().get(0).getControlNumber().replace("-",""));
                }
            }

            for(PNRReply.TravellerInfo travellerInfo : output.getTravellerInfo()){
                PNRReply.TravellerInfo.PassengerData passengerData = travellerInfo.getPassengerData().get(0);
                for(int i=0;i<passengerData.getTravellerInformation().getPassenger().size();i++){
                    TravellerInformation traveller= new TravellerInformation();
                    traveller.setPassengerLastName(passengerData.getTravellerInformation().getTraveller().getSurname());
                    String arr[] = passengerData.getTravellerInformation().getPassenger().get(i).getFirstName().split(" ");
                    if(arr.length>0 && arr.length==2){
                        traveller.setPassengerFirstName(arr[0]);
                    }else if(arr.length>0 && arr.length>2){
                        String name = "";
                        for(int k=0;k<arr.length;k++){
                            if(k<arr.length-1){
                                name += arr[k];
                            }
                        }
                        traveller.setPassengerFirstName(name);
                    }else{
                        traveller.setPassengerFirstName(passengerData.getTravellerInformation().getPassenger().get(i).getFirstName());
                    }
                    traveller.setPassengerTypeCode(passengerData.getTravellerInformation().getPassenger().get(i).getType());
                    if(null==traveller.getPassengerTypeCode() || "".equals(traveller.getPassengerTypeCode())){
                        traveller.setPassengerTypeCode("ADT");
                    }
                    traveller.setPassengerTatooNumber(travellerInfo.getElementManagementPassenger().getReference().getNumber().toString());
                    travellerInformationList.add(traveller);
                }
            }
            reply.setTravellerInformationList(travellerInformationList);

            List<PNRReply.OriginDestinationDetails> originDestinationDetailsList = output.getOriginDestinationDetails();
            //국내,국제선 여부 판단하기 위해, 모든 출발 도착 여정을 담는리스트
            List<String> locationCodeList = new ArrayList<String>();

            /**
             * 여정 정보
             */
            if(CollectionUtils.isNotEmpty(originDestinationDetailsList)) {
                PNRReply.OriginDestinationDetails originDestinationDetails = originDestinationDetailsList.get(0);
                for(PNRReply.OriginDestinationDetails.ItineraryInfo itineraryInfo : originDestinationDetails.getItineraryInfo()) {
                    Itinerary itinerary = new Itinerary();
                    if(null!=itineraryInfo.getRelatedProduct()){
                        ElementManagementSegmentType elementManagementItinerary = itineraryInfo.getElementManagementItinerary();
                        String segmentName = elementManagementItinerary.getSegmentName();

                        // segmentName이 AIR가 아니면 seg 정보 무시
                        if("AIR".equals(segmentName)) {
                            //segment.setta(elementManagementItinerary.getReference().getNumber().toString());
                            //itineraryInfoVo.setLineNumber(elementManagementItinerary.getLineNumber());
                            if(null!=elementManagementItinerary
                                    &&null!=elementManagementItinerary.getReference()
                                    &&null!=elementManagementItinerary.getReference().getQualifier()
                                    &&"ST".equalsIgnoreCase(elementManagementItinerary.getReference().getQualifier())
                            ) {
                                itinerary.setSegmentNumber(elementManagementItinerary.getReference().getNumber());
                            }
                            TravelProductInformationTypeI travelProduct = itineraryInfo.getTravelProduct();
                            // boardpointDetail
                            itinerary.setDepartureCityCode(travelProduct.getBoardpointDetail().getCityCode());	// 출발 도시 코드

                            // offpointDetail
                            itinerary.setArrivalCityCode(travelProduct.getOffpointDetail().getCityCode());		// 도착 도시 코드

                            // product
                            ProductDateTimeTypeI171495C product = travelProduct.getProduct();
                            itinerary.setDepartureDate(product.getDepDate());	// 출발 일자
                            itinerary.setDepartureTime(product.getDepTime());	// 출발 시간
                            itinerary.setArrivalDate(product.getArrDate());	// 도착 일자
                            itinerary.setArrivalTime(product.getArrTime());	// 도착 시간
                            // companyDetail
                            itinerary.setAirLineCode(travelProduct.getCompanyDetail().getIdentification());		// 항공사 코드
                            // productDetails
                            //segment.setFlightNumber(BookingUtil.getFlightNumberFormat(travelProduct.getProductDetails().getIdentification()));		// 항공기 번호
                            itinerary.setFlightNumber(travelProduct.getProductDetails().getIdentification());		// 항공기 번호
                            String bookingClass = travelProduct.getProductDetails().getClassOfService();				// 부킹 클래스
                            itinerary.setBookingClass(bookingClass);
/*
                            String cabinClass = commonService.toBkgclsCbncls(BookingUtil.convertDomIntlCd(domestic), bookingClass);
                            if(IbeCommonUtil.isNotNull(cabinClass)){
                                itineraryInfoVo.setCabinClass(cabinClass);
                            }
                            if(null!=product.getDayChangeIndicator()){
                                itineraryInfoVo.setDayChangeIndicator(product.getDayChangeIndicator());
                            }
*/
                            // KE 편명이 하나라도 있는지 여부 확인(KE편명만 좌석승급 가능)
                            // Airline code가 KE이고 OPERATE BY가 없으면 KE 편명으로 판단
                            String companyCode = itineraryInfo.getTravelProduct().getCompanyDetail().getIdentification();
                            if("KE".equals(companyCode)) {
                                if(CollectionUtils.isNotEmpty(itineraryInfo.getItineraryfreeFormText())) {
                                    InteractiveFreeTextTypeI132924S itineraryfreeFormText = itineraryInfo.getItineraryfreeFormText().get(0);

                                    for(String text : itineraryfreeFormText.getText()) {
                                        if(text.contains("OPERATED BY")) {
                                            int idx = text.indexOf("OPERATED BY");
                                            itinerary.setOtherAirLineCode(text.substring(idx+12, idx+14));
                                            break;
                                        }
                                    }
                                }
                            }
                            //flown seg 체크
                            if(null!=itineraryInfo.getRelatedProduct()){
                                boolean isStatus1 = true;

                                for(String s1 : itineraryInfo.getRelatedProduct().getStatus()){
                                    if("B".equals(s1)){
                                        isStatus1 = false;
                                    }
                                }
                            }
                        }
                    }
                    itineraryList.add(itinerary);
                }
            }


            if(CollectionUtils.isNotEmpty(output.getDataElementsMaster().getDataElementsIndiv())){
                for(PNRReply.DataElementsMaster.DataElementsIndiv dataElementsIndiv : output.getDataElementsMaster().getDataElementsIndiv()) {
                    String otNumber = "";
                    if(null!=dataElementsIndiv.getElementManagementData()
                            &&null!=dataElementsIndiv.getElementManagementData().getReference()
                            &&null!=dataElementsIndiv.getElementManagementData().getReference().getQualifier()){
                        if("OT".equalsIgnoreCase(dataElementsIndiv.getElementManagementData().getReference().getQualifier())){
                            otNumber = dataElementsIndiv.getElementManagementData().getReference().getNumber().toString();
                        }
                    }
                    List<LongFreeTextType> otherDataFreetextList = dataElementsIndiv.getOtherDataFreetext();
                    for(int k=0; k< otherDataFreetextList.size(); k++){
                        LongFreeTextType otherDataFreetextTmp = otherDataFreetextList.get(k);
                        //OtherDataFreetext 하위 값 null 체크 추가 2014.11.11
                        if(null != otherDataFreetextTmp.getFreetextDetail() && null != otherDataFreetextTmp.getLongFreetext())
                        {
                            String contactType = otherDataFreetextTmp.getFreetextDetail().getType();
                            if("7".equals(contactType) || "5".equals(contactType) || "4".equals(contactType) || "3".equals(contactType)){
                                if(null == dataElementsIndiv.getReferenceForDataElement()){
                                    ContactPoint mainTmp = makeContactPoint(contactType, otherDataFreetextTmp.getLongFreetext());
                                    contactPointList.add(mainTmp);
                                } else {
                                    ContactPoint paxTmp = makeContactPoint(contactType, otherDataFreetextTmp.getLongFreetext());
                                    contactPointList.add(paxTmp);
                                }
                            }

                            if("P02".equals(otherDataFreetextTmp.getFreetextDetail().getType()) && null != otherDataFreetextTmp.getLongFreetext() ){

                            }
                        }
                    }//for


                    //티켓번호 추출, EMD, FH(재발행하기전에 원래 티켓번호) 제외...
                    if (CollectionUtils.isNotEmpty(dataElementsIndiv.getOtherDataFreetext())) {
                        String segmentName = dataElementsIndiv.getElementManagementData().getSegmentName();
                        if ("FA".equals(segmentName) || "FHE".equals(segmentName)) {
                            String freeTextDetailType = dataElementsIndiv.getOtherDataFreetext().get(0).getFreetextDetail().getType();
                            if ("P06".equals(freeTextDetailType) || "P15".equals(freeTextDetailType)) {

                                String[] tempArray = dataElementsIndiv.getOtherDataFreetext().get(0).getLongFreetext().split(" ");
                                String[] tempArray2 = tempArray[1].split("/");
                                if (tempArray2.length < 2) {
                                    continue;
                                }
                                String tktNo = tempArray2[0].replace("-", "").substring(0, 13);
                                String tktType = tempArray2[1];
                                //티켓만 뽑는 리스트
                                if (("FA".equals(segmentName) && "ET".equals(tktType.substring(0, 2))) ||
                                        "FHE".equals(segmentName)) {
                                    TicketInformation tktinfo = new TicketInformation();
                                    tktinfo.setOtNumber(otNumber);
                                    tktinfo.setTicketNumber(tktNo);
                                    tktinfo.setOfficeId(output.getSecurityInformation().getResponsibilityInformation().getOfficeId());
                                    tktinfo.setIataNumber(output.getSecurityInformation().getResponsibilityInformation().getIataCode().toString());
                                    tktinfo.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                                    ticketInfoList.add(tktinfo);

                                }
                                if (("FA".equals(segmentName) && "DT".equals(tktType.substring(0, 2))) ||
                                        "FHE".equals(segmentName)) {
                                    TicketInformation emdticket = new TicketInformation();
                                    emdticket.setOtNumber(otNumber);
                                    emdticket.setTicketNumber(tktNo);
                                    emdticket.setOfficeId(output.getSecurityInformation().getResponsibilityInformation().getOfficeId());
                                    emdticket.setIataNumber(output.getSecurityInformation().getResponsibilityInformation().getIataCode().toString());
                                    emdticket.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                                    emdTicketInfoList.add(emdticket);
                                    List<ReferenceCode>referenceCodeList = referenceCodeList(dataElementsIndiv);
                                }

                            }
                        }

                    }

                    //GTR항공권 체크 종료
                    if ("RM".equals(dataElementsIndiv.getElementManagementData().getSegmentName())) {
                        FreeText freetext = new FreeText();
                        if ("RM".equals(dataElementsIndiv.getMiscellaneousRemarks().getRemarks().getType())) {
                            if (null != dataElementsIndiv.getMiscellaneousRemarks().getRemarks().getFreetext()) {
                                freetext.setOtNumber(otNumber);
                                freetext.setCode(dataElementsIndiv.getElementManagementData().getSegmentName());
                                freetext.setFreeText(dataElementsIndiv.getMiscellaneousRemarks().getRemarks().getFreetext());
                                freetext.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                                freeTextList.add(freetext);
                            }
                        }
                    }

                    if ("SSR".equals(dataElementsIndiv.getElementManagementData().getSegmentName())) {
                        Service ssr = new Service();
                        if(null!=dataElementsIndiv.getServiceRequest()
                                &&null!=dataElementsIndiv.getServiceRequest().getSsr()
                                &&null!=dataElementsIndiv.getServiceRequest().getSsr().getType()
                        ){
                            ssr.setOtNumber(otNumber);
                            ssr.setSsrCode(dataElementsIndiv.getServiceRequest().getSsr().getType());
                            ssr.setQuantity(dataElementsIndiv.getServiceRequest().getSsr().getQuantity().toString());
                            ssr.setSsrStatus(dataElementsIndiv.getServiceRequest().getSsr().getStatus());
                            if(CollectionUtils.isNotEmpty(dataElementsIndiv.getServiceRequest().getSsr().getFreeText())){
                                ssr.setFreetext(dataElementsIndiv.getServiceRequest().getSsr().getFreeText().get(0));
                            }
                            if("RQST".equalsIgnoreCase(dataElementsIndiv.getServiceRequest().getSsr().getType())){
                                if(CollectionUtils.isNotEmpty(dataElementsIndiv.getServiceRequest().getSsrb())){
                                    for(SpecialRequirementsDataDetailsTypeI64826C ssrb : dataElementsIndiv.getServiceRequest().getSsrb()){
                                        ssr.setData(ssrb.getData());
                                    }
                                }
                            }
                            ssr.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                            serviceList.add(ssr);
                        }
                    }

                    if("FP".equals(dataElementsIndiv.getElementManagementData().getSegmentName())){
                        for(LongFreeTextType dataFreeText : dataElementsIndiv.getOtherDataFreetext()){
                            String freetext = dataFreeText.getLongFreetext();
                            String paymentType = dataFreeText.getLongFreetext().substring(0,2).toUpperCase();
                            if("CC".equals(paymentType)){
                                String cardcompany = dataFreeText.getLongFreetext().substring(2,4).toUpperCase();
                                PaymentInformation paymentInfo = new PaymentInformation();
                                paymentInfo.setPaymentTypeCode(paymentType);
                                String[]temp = null;
                                try{
                                    temp = dataFreeText.getLongFreetext().split("/G");
                                }catch(Exception e){

                                }
                                if(temp.length==1){
                                    temp = dataFreeText.getLongFreetext().split("/N");
                                }
                                String[]temp2 = dataFreeText.getLongFreetext().split("\\*");
                                String salesIndicator = temp2[1].substring(0,3);

                                //PLUAT-1885 20151019 승인번호 추출하는 부분 수정
                                String approvalCode = temp[1];

                                paymentInfo.setApprovalCode(approvalCode+"||"+salesIndicator);
                                paymentInfo.setCardCompany(cardcompany);
                                paymentInfo.setAccountNumber(freetext.substring(5, freetext.indexOf("/")).replaceAll("[^\\d]", ""));
                                paymentInfo.setFreeText(freetext);
                                String[] temp1  = freetext.split("\\*");
                                String tempmcp = temp1[1].substring(0,1);
                                //mcp여부 판단
                                if("I".equals(tempmcp)){
                                    paymentInfo.setMcp("NOMCP");
                                }else{
                                    paymentInfo.setMcp("MCP");
                                }
                                paymentInformationList.add(paymentInfo);
                            }else if("BA".equals(paymentType)){
                                PaymentInformation paymentInfo = new PaymentInformation();
                                paymentInfo.setPaymentTypeCode(paymentType);
                                String[]temp = dataFreeText.getLongFreetext().split("\\*");
                                String approvalCode = temp[1].substring(0,7);
                                paymentInfo.setApprovalCode(approvalCode);
                                paymentInfo.setFreeText(freetext);
                                paymentInfo.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                                paymentInformationList.add(paymentInfo);
                            }else if("PA".equals(paymentType)){
                                PaymentInformation paymentInfo = new PaymentInformation();
                                if(dataFreeText.getLongFreetext().indexOf("BANKT") > -1){
                                    paymentInfo.setPaymentTypeCode("BA");
                                    String[]temp = dataFreeText.getLongFreetext().split("\\*");
                                    String approvalCode = temp[1].substring(0,temp[1].length());
                                    paymentInfo.setApprovalCode(approvalCode);
                                    paymentInfo.setFreeText(freetext);
                                    paymentInfo.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                                    paymentInformationList.add(paymentInfo);

                                }else if(dataFreeText.getLongFreetext().indexOf("CC") > -1){
                                    paymentInfo.setPaymentTypeCode("CC");
                                    //1911
                                    String cardCompany = dataFreeText.getLongFreetext().
                                            substring(dataFreeText.getLongFreetext().indexOf("CC")+2,dataFreeText.getLongFreetext().indexOf("CC")+4);
                                    String[]temp = null;

                                    try{
                                        temp = dataFreeText.getLongFreetext().split("/G");
                                    }catch(Exception e){

                                    }
                                    if(temp.length==1){
                                        temp = dataFreeText.getLongFreetext().split("/N");
                                    }
                                    String[]temp2 = dataFreeText.getLongFreetext().split("\\*");
                                    String salesIndicator = temp2[1].substring(0,3);

                                    //PLUAT-1991 20151026 쿠폰과 같이 결제된 경우, 승인번호 추출하는 부분 수정
                                    String approvalCode = temp[1];
                                    String [] proTemp = temp[1].split("\\+");
                                    approvalCode = proTemp[0];
                                    approvalCode = approvalCode.split("\\/")[0];

                                    //LoggingUtil.doMessageLogging("pa cc approvalCode : ", approvalCode);
                                    paymentInfo.setApprovalCode(approvalCode+"||"+salesIndicator);
                                    paymentInfo.setCardCompany(cardCompany);
                                    paymentInfo.setFreeText(freetext);
                                    paymentInfo.setAccountNumber(freetext.substring(5, freetext.indexOf("/")).replaceAll("[^\\d]", ""));
                                    String[] temp1  = freetext.split("\\*");
                                    String tempmcp = temp1[1].substring(0,1);
                                    //mcp여부 판단
                                    if("I".equals(tempmcp)){
                                        paymentInfo.setMcp("NOMCP");
                                    }else{
                                        paymentInfo.setMcp("MCP");
                                    }
                                    paymentInfo.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                                    paymentInformationList.add(paymentInfo);
                                }
                                //간편결제 or 유아
                            }else if("IN".equals(paymentType)){
                                PaymentInformation paymentInfo = new PaymentInformation();
                                //dataFreeText.getLongFreetext().split("INV\\*")
                                String[]temp = dataFreeText.getLongFreetext().split("INV\\*");
                                String paymentDetailType = "";
                                if(temp.length>2){
                                    if(temp[1].length()>2){
                                        paymentDetailType  = temp[1].substring(0,2);
                                        paymentInfo.setPaymentTypeCode("INV"+" "+paymentDetailType);
                                    }
                                    if("AP".equals(paymentDetailType)){
                                        String[] temp2 = temp[1].split("AP\\*");
                                        String[] temp3 = temp2[1].split("\\*");
                                        paymentInfo.setApprovalCode(temp3[0]);
                                    }else if("PC".equals(paymentDetailType)){
                                        String[] temp2 = temp[1].split("PC\\*");
                                        String[] temp3 = temp2[1].split("\\*");
                                        paymentInfo.setApprovalCode(temp3[0]);
                                    }else if("PP".equals(paymentDetailType)){
                                        String[] temp2 = temp[1].split("PP\\*");
                                        String[] temp3 = temp2[1].split("\\*");
                                        paymentInfo.setApprovalCode(temp3[0]);
                                    }else{
                                        String[] temp2 = temp[1].split("CP\\*");
                                        String[] temp3 = temp2[1].split("\\*");
                                        paymentInfo.setApprovalCode(temp3[0]);
                                    }
                                    paymentInfo.setFreeText(freetext);
                                    paymentInfo.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                                    paymentInformationList.add(paymentInfo);
                                }else{
                                    //유아 BANKT
                                    if(dataFreeText.getLongFreetext().indexOf("BANKT") > -1){
                                        paymentInfo.setPaymentTypeCode("BA");
                                        String[]temp2 = dataFreeText.getLongFreetext().split("\\*");
                                        String approvalCode = temp2[1].substring(0,temp2[1].length());
                                        paymentInfo.setApprovalCode(approvalCode);
                                        paymentInfo.setFreeText(freetext);
                                        paymentInformationList.add(paymentInfo);
                                        //유아 CC
                                    }else if(dataFreeText.getLongFreetext().indexOf("CC") > -1){
                                        paymentInfo.setPaymentTypeCode("CC");
                                        //1911
                                        String cardCompany = dataFreeText.getLongFreetext().
                                                substring(dataFreeText.getLongFreetext().indexOf("CC")+2,dataFreeText.getLongFreetext().indexOf("CC")+4);
                                        String[]temp2 = null;

                                        try{
                                            temp2 = dataFreeText.getLongFreetext().split("/G");
                                        }catch(Exception e){

                                        }
                                        if(temp2.length==1){
                                            temp2 = dataFreeText.getLongFreetext().split("/N");
                                        }
                                        String[]temp3 = dataFreeText.getLongFreetext().split("\\*");
                                        String salesIndicator = temp3[1].substring(0,3);

                                        //PLUAT-1991 20151026 쿠폰과 같이 결제된 경우, 승인번호 추출하는 부분 수정
                                        String approvalCode = temp2[1];
                                        String [] proTemp = temp2[1].split("\\+");
                                        approvalCode = proTemp[0];
                                        approvalCode = approvalCode.split("\\/")[0];

                                        //LoggingUtil.doMessageLogging("pa cc approvalCode : ", approvalCode);
                                        paymentInfo.setApprovalCode(approvalCode+"||"+salesIndicator);
                                        paymentInfo.setCardCompany(cardCompany);
                                        paymentInfo.setFreeText(freetext);
                                        paymentInfo.setAccountNumber(freetext.substring(5, freetext.indexOf("/")).replaceAll("[^\\d]", ""));
                                        String[] temp1  = freetext.split("\\*");
                                        String tempmcp = temp1[1].substring(0,1);
                                        //mcp여부 판단
                                        if("I".equals(tempmcp)){
                                            paymentInfo.setMcp("NOMCP");
                                        }else{
                                            paymentInfo.setMcp("MCP");
                                        }
                                        paymentInfo.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                                        paymentInformationList.add(paymentInfo);
                                    }else{
                                        //konvni void 배치 처리를 위한 로직
                                        if(temp.length>1){
                                            if(temp[1].contains("CP")){
                                                String[] temp2 = temp[1].split("CP\\*");
                                                String[] temp3 = temp2[1].split("\\*");
                                                paymentInfo.setApprovalCode(temp3[0]);
                                            }
                                            paymentInfo.setReferenceCodeList(referenceCodeList(dataElementsIndiv));
                                            paymentInformationList.add(paymentInfo);
                                        }
                                    }
                                }
                            }

                        }
                    }

                }
            }
            reply.setServiceList(serviceList);
            reply.setEmdTicketInformationList(emdTicketInfoList);
            reply.setItineraryList(itineraryList);
            reply.setFreeTextList(freeTextList);
            reply.setContactPointList(contactPointList);
            reply.setTicketInformationList(ticketInfoList);
            reply.setPaymentInformationList(paymentInformationList);
            reply.setOfficeId(output.getSecurityInformation().getResponsibilityInformation().getOfficeId());
        }
        return reply;
    }

    private ArrayList<ReferenceCode> referenceCodeList(PNRReply.DataElementsMaster.DataElementsIndiv dataElementsIndiv) {
        ArrayList<ReferenceCode> referenceCodeList = new ArrayList<>();
        if(null!=dataElementsIndiv.getReferenceForDataElement()
                &&CollectionUtils.isNotEmpty(dataElementsIndiv.getReferenceForDataElement().getReference())
        ) {
            for(ReferencingDetailsType111975C reference : dataElementsIndiv.getReferenceForDataElement().getReference()){
                ReferenceCode rf = new ReferenceCode();
                rf.setReferenceCode(reference.getQualifier());
                rf.setReferenceNumber(reference.getNumber());
                referenceCodeList.add(rf);
            }
        }
        return referenceCodeList;
    }

    private static ContactPoint makeContactPoint(String type, String number){
        ContactPoint result = new ContactPoint();
        if("5".equals(type)){
            if(number.length() >1){
                String code = number.substring(number.length() -1);
                if("M".equals(code)){
                    result.setPhoneCode("M1");
                }else if("H".equals(code)){
                    result.setPhoneCode("H1");
                }else if("B".equals(code)){
                    result.setPhoneCode("B1");
                }
            }
        }else if("7".equals(type)){
            result.setPhoneCode("M1");
        }else if("4".equals(type)){
            result.setPhoneCode("H1");
        }else if("3".equals(type)){
            result.setPhoneCode("B1");
        }
        result.setPhoneNumber(number);
        return result;
    }

    public static void main(String[] args)throws Exception {
        /*
        PnrRetrieveHelper pnrRetrieveHelper = new PnrRetrieveHelper();
        AlteaInputVo alteainput = new AlteaInputVo();
        PNRRetrieve pnrinput =  pnrRetrieveHelper.makeRetrievePNRInput("K2MLCB");
        alteainput.setInputBody(pnrinput);
        alteainput.setOperationName("PNR_Retrieve");
        AlteaConnector adapter = new AlteaConnector();

        System.out.println(result);
        PNRReply reply = JAXBFactory.unmarshal(result,PNRReply.class);
        CommonPnrReply output = pnrRetrieveHelper.makeRetrievePNROutput(reply);
        ObjectSerializeUtil.getObjectToJson(output);
        System.out.println(ObjectSerializeUtil.getObjectToJson(output));
        */
    }
}
