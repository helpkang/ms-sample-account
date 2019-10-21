package com.koreanair.common_adapter.altea.helper.ticket_processedoc_12_2_1a;

import com.koreanair.common_adapter.common.vo.*;

import com.koreanair.common_adapter.utils.BookingUtil;
import com.koreanair.common_adapter.utils.DateUtil;
import com.koreanair.external.altea.vo.ticket_processedocreply_12_1_1a.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Component
public class TicketProcessEdocReplyHelper {

    public CommonTicketReply makeTicketProcessEDocOutput(TicketProcessEDocReply ticketReply) throws Exception {
        CommonTicketReply output = new CommonTicketReply();
        if (null != ticketReply && !"".equals(ticketReply)) {
            //에러메세지가 있는지 체크
            if (null != ticketReply.getError()) {
                String errorCode = ticketReply.getError().getErrorDetails().getErrorCode();
                /*
                ExceptionVo vo = new ExceptionVo();
                vo.setBlocking(true);
                vo.setWebService(true);
                vo.setType("BIZ");
                vo.setCode(errorCode);
                vo.setMessage(tikOutput.getTextInfo().get(0).getFreeText().get(0));
                throw BizRuntimeException.create(errorCode,new Object[]{vo});

                 */
            }
            ArrayList<TicketInformation> ticketInformationList = new ArrayList<TicketInformation>();
            ArrayList<Coupons> itineraryInfoList = new ArrayList<>();
            if (CollectionUtils.isNotEmpty(ticketReply.getDocGroup())) {
                for (int i = 0; i < ticketReply.getDocGroup().size(); i++) {
                    ArrayList<DeductedAmountsVo> deductedAmountsList = new ArrayList<>();
                    ArrayList<String> childTicketNumberList = new ArrayList<String>();
                    TicketInformation ticketInfo = new TicketInformation();
                    TicketProcessEDocReply.DocGroup docGroup = ticketReply.getDocGroup().get(i);
                    DeductedAmountsVo deductedAmountsVo = new DeductedAmountsVo();

                    //PNR 번호 찾기
                    if (null != docGroup.getReferenceInfo() && !"".equals(docGroup.getReferenceInfo())) {
                        if (null != docGroup.getReferenceInfo().getReservation() && 0 < docGroup.getReferenceInfo().getReservation().size()) {
                            for (int j = 0; j < docGroup.getReferenceInfo().getReservation().size(); j++) {
                                com.koreanair.external.altea.vo.ticket_processedocreply_12_1_1a.ReservationControlInformationDetailsTypeI reservation = docGroup.getReferenceInfo().getReservation().get(j);
                                if (null != reservation.getCompanyId() && !"".equals(reservation.getCompanyId())) {
                                    // KE 임에고 불구하고 RECLOC로 되어 있어서 Input 값으로 대체.
                                    if (!"1A".equals(reservation.getCompanyId())) {
                                        ticketInfo.setGdsTicket(true);
                                    } else {
                                        ticketInfo.setReservationRecLoc(reservation.getControlNumber());
                                    }
                                }//if
                            }//for
                        }//if
                    }//if PNR 번호 찾기

                    //발권날짜
                    if (null != docGroup.getProductInfo()
                            && null != docGroup.getProductInfo().getProductDateTimeDetails()
                            && null != docGroup.getProductInfo().getProductDateTimeDetails().getDepartureDate()) {
                        ticketInfo.setTicketingDate(docGroup.getProductInfo().getProductDateTimeDetails().getDepartureDate());
                    }

                    //결재 정보
                    if (null != docGroup.getFop()) {
                        ArrayList<PaymentInformation> paymentInformationList = new ArrayList<>();
                        if (CollectionUtils.isNotEmpty(docGroup.getFop().getFormOfPayment())) {
                            for (int j = 0; j < docGroup.getFop().getFormOfPayment().size(); j++) {
                                PaymentInformation payment = new PaymentInformation();
                                FormOfPaymentDetailsTypeI formOfPayment = docGroup.getFop().getFormOfPayment().get(j);

                                String paymentType = formOfPayment.getType();
                                if (null != paymentType && !"".equals(paymentType)) {

                                    if ("CC".equals(paymentType)) {//신용카드정보를 뽑는다.
                                        payment.setPaymentTypeCode(paymentType);
                                        /*신용카드번호*/
                                        if (null != formOfPayment.getCreditCardNumber() && !"".equals(formOfPayment.getCreditCardNumber())) {
                                            payment.setAccountNumber(formOfPayment.getCreditCardNumber());    //카드 번호
                                        }
                                        if (null != formOfPayment.getVendorCode() && !"".equals(formOfPayment.getVendorCode())) {
                                            payment.setCardCompany(formOfPayment.getVendorCode());            //카드 회사
                                        }
                                        if (null != formOfPayment.getExpiryDate() && !"".equals(formOfPayment.getExpiryDate())) {
                                            SimpleDateFormat sdf = new SimpleDateFormat("MMyy", Locale.US);
                                            SimpleDateFormat sdf2 = new SimpleDateFormat("yyMM");
                                            Date date = null;
                                            try {
                                                date = sdf.parse(formOfPayment.getExpiryDate());
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                            String convertDate = sdf2.format(date);
                                            payment.setExpiryDate(convertDate);            //카드 유효일 yyMM
                                        }


                                        //PLUAT-1901 승인번호 안나와서 gwp default error 나는 문제
                                        if (null == payment.getApprovalCode()) {
                                            if (null != formOfPayment.getApprovalCode()) {
                                                payment.setApprovalCode(formOfPayment.getApprovalCode());
                                            }
                                        }
                                        //티켓마저도 승인번호가 없는 케이스가 존재하니 공백으로라도 채워서 진행
                                        if (null == payment.getApprovalCode()) {
                                            payment.setApprovalCode("");
                                        }
                                        paymentInformationList.add(payment);
                                    }
                                    if ("MS".equals(paymentType)) {//BANKT정보를 뽑는다.
                                        if (null != formOfPayment.getFopFreeText() && !"".equals(formOfPayment.getFopFreeText())) {
                                            if (0 <= formOfPayment.getFopFreeText().indexOf("BANKT")) {
                                                payment.setPaymentTypeCode(paymentType);
                                                payment.setFreeText(formOfPayment.getFopFreeText());
                                                String[] temp = formOfPayment.getFopFreeText().split("\\*");
                                                if (null != temp && 0 < temp.length) {
                                                    payment.setApprovalCode(temp[1]);
                                                }
                                                paymentInformationList.add(payment);
                                            }
                                            if (0 <= formOfPayment.getFopFreeText().indexOf("INV*KP")) {
                                                payment.setPaymentTypeCode("KAKAO");
                                                payment.setFreeText(formOfPayment.getFopFreeText());
                                                String[] temp = formOfPayment.getFopFreeText().split("\\*");
                                                if (null != temp && 0 < temp.length) {
                                                    payment.setApprovalCode(temp[1] + temp[2]);
                                                }
                                                paymentInformationList.add(payment);
                                            }
                                            if (0 <= formOfPayment.getFopFreeText().indexOf("INV*PC")) {
                                                payment.setPaymentTypeCode("PAYCO");
                                                payment.setFreeText(formOfPayment.getFopFreeText());
                                                String[] temp = formOfPayment.getFopFreeText().split("\\*");
                                                if (null != temp && 0 < temp.length) {
                                                    payment.setApprovalCode(temp[1] + temp[2]);
                                                }
                                                paymentInformationList.add(payment);
                                            }
                                            if (0 <= formOfPayment.getFopFreeText().indexOf("INV*CP")) {
                                                payment.setPaymentTypeCode("KONBINI");
                                                payment.setFreeText(formOfPayment.getFopFreeText());
                                                String[] temp = formOfPayment.getFopFreeText().split("\\*");
                                                if (null != temp && 0 < temp.length) {
                                                    payment.setApprovalCode(temp[1] + temp[2]);
                                                }
                                                paymentInformationList.add(payment);
                                            }
                                            if (0 <= formOfPayment.getFopFreeText().indexOf("INV*PP")) {
                                                payment.setPaymentTypeCode("PAYPAL");
                                                payment.setFreeText(formOfPayment.getFopFreeText());
                                                String[] temp = formOfPayment.getFopFreeText().split("\\*");
                                                if (null != temp && 0 < temp.length) {
                                                    payment.setApprovalCode(temp[1] + temp[2]);
                                                }
                                                paymentInformationList.add(payment);
                                            }
                                            if (0 <= formOfPayment.getFopFreeText().indexOf("FFRKE")) {
                                                if (null != formOfPayment.getTransactionInfo()) {
                                                    deductedAmountsVo.setAuthNo(formOfPayment.getTransactionInfo());
                                                }
                                            }
                                            //유아의 경우 ffp만 있는 경우가 있다. 이 경우에는
                                            if (docGroup.getFop().getFormOfPayment().size() == 1) {
                                                if (formOfPayment.getAmount() != null && "0".equals(String.valueOf(formOfPayment.getAmount()))) {
                                                    if (formOfPayment.getFopFreeText().contains("FFR")) {
                                                        payment.setPaymentTypeCode("FFR");
                                                        payment.setFreeText(formOfPayment.getFopFreeText());
                                                        payment.setAccountNumber("");
                                                        paymentInformationList.add(payment);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                            }//for
                        }//if
                        ticketInfo.setPaymentInformationList(paymentInformationList);
                    }//if 결재 정보


                    //currency추출
                    if (null != docGroup.getFareInfo() && !"".equals(docGroup.getFareInfo())) {
                        if (null != docGroup.getFareInfo().getMonetaryDetails() && 0 < docGroup.getFareInfo().getMonetaryDetails().size()) {
                            for (int j = 0; j < docGroup.getFareInfo().getMonetaryDetails().size(); j++) {
                                MonetaryInformationDetailsTypeI monetaryDetails = docGroup.getFareInfo().getMonetaryDetails().get(j);
                                if ("T".equals(monetaryDetails.getTypeQualifier())) {
                                    ticketInfo.setCurrency(monetaryDetails.getCurrency());
                                }
                            }//for
                        }//if
                    }//if currency추출


                    //IATA넘버추출
                    String iataNumber = "";
                    if (null != docGroup.getOriginatorInfo() && !"".equals(docGroup.getOriginatorInfo())) {
                        if (null != docGroup.getOriginatorInfo().getOriginIdentification() && !"".equals(docGroup.getOriginatorInfo().getOriginIdentification())) {
                            if (null != docGroup.getOriginatorInfo().getOriginIdentification().getOriginatorId() && !"".equals(docGroup.getOriginatorInfo().getOriginIdentification().getOriginatorId())) {
                                iataNumber = docGroup.getOriginatorInfo().getOriginIdentification().getOriginatorId();
                                ticketInfo.setIataNumber(iataNumber);
                            }
                        }
                    }

                    //CommandCryptic Output 에서 officeid를 추출 한다.
                    if (null != iataNumber && !"".equals(iataNumber)) {
                        //iata번호를 officeId로 바꾸는 함수 필요.
                        //String officeId = refundCommonService.iataNumberToOfficeId(iataNumber);
                        //ticketInfo.setOfficeId(officeId);
                    }

                    //승객 이름 추출
                    if (null != docGroup.getPaxInfo() && !"".equals(docGroup.getPaxInfo())) {
                        if (null != docGroup.getPaxInfo().getPaxDetails() && !"".equals(docGroup.getPaxInfo().getPaxDetails())) {
                            if (null != docGroup.getPaxInfo().getPaxDetails().getSurname() && !"".equals(docGroup.getPaxInfo().getPaxDetails().getSurname())) {
                                ticketInfo.setPassengerLastName(docGroup.getPaxInfo().getPaxDetails().getSurname());
                                String type = docGroup.getPaxInfo().getPaxDetails().getType();
                                if ("A".equals(type)) {
                                    ticketInfo.setPassengerTypeCode("ADT");
                                } else if ("C".equals(type)) {
                                    ticketInfo.setPassengerTypeCode("CHD");
                                } else if ("IN".equals(type)) {
                                    ticketInfo.setPassengerTypeCode("INF");
                                } else {
                                    ticketInfo.setPassengerTypeCode("ADT");
                                }
                            }
                        }
                        if (null != docGroup.getPaxInfo().getOtherPaxDetails() && !"".equals(docGroup.getPaxInfo().getOtherPaxDetails())) {
                            if (CollectionUtils.isNotEmpty(docGroup.getPaxInfo().getOtherPaxDetails())) {
                                if (null != docGroup.getPaxInfo().getOtherPaxDetails().get(0).getGivenName() && !"".equals(docGroup.getPaxInfo().getOtherPaxDetails().get(0).getGivenName())) {
                                    String[] temp = docGroup.getPaxInfo().getOtherPaxDetails().get(0).getGivenName().split(" ");
                                    ticketInfo.setPassengerFirstName(temp[0]);
                                }
                            }
                        }
                    }

                    //비행기 출발했는데 안타고 환불 할라고 한다.
                    if (null != docGroup.getProductInfo() && !"".equals(docGroup.getProductInfo())) {
                        if (null != docGroup.getProductInfo().getPriceTicketDetails() && !"".equals(docGroup.getProductInfo().getPriceTicketDetails())) {
                            if (null != docGroup.getProductInfo().getPriceTicketDetails().getTicketingModeIndicator() && !"".equals(docGroup.getProductInfo().getPriceTicketDetails().getTicketingModeIndicator())) {
                                if ("N".equals(docGroup.getProductInfo().getPriceTicketDetails().getTicketingModeIndicator())) {
                                    ticketInfo.setNoShow(true);
                                }
                            }
                        }
                    }


                    //flight가 4개이상인 경우는 티켓번호가 2개이상이기 때문에 DocDetailsGroup이 여러개 생성된다. 쿠폰의 상태값을 추출한다.
                    ArrayList<Coupons> couponTotalList = new ArrayList<Coupons>();
                    if (null != docGroup.getDocDetailsGroup() && 0 < docGroup.getDocDetailsGroup().size()) {

                        for (int j = 0; j < docGroup.getDocDetailsGroup().size(); j++) {
                            TicketProcessEDocReply.DocGroup.DocDetailsGroup docDetailsGroup = docGroup.getDocDetailsGroup().get(j);

                            if (null != docDetailsGroup.getDocInfo() && null != docDetailsGroup.getDocInfo().getDocumentDetails() && null != docDetailsGroup.getDocInfo().getDocumentDetails().getInConnectionWith()) {
                                continue;
                            }

                            if (null != docDetailsGroup.getDocInfo() && !"".equals(docDetailsGroup.getDocInfo())) {
                                if (null != docDetailsGroup.getDocInfo().getDocumentDetails() && !"".equals(docDetailsGroup.getDocInfo().getDocumentDetails())) {

                                    //티켓 번호
                                    if (j == 0) {
                                        if (null != docDetailsGroup.getDocInfo().getDocumentDetails().getNumber() && !"".equals(docDetailsGroup.getDocInfo().getDocumentDetails().getNumber())) {
                                            ticketInfo.setTicketNumber(docDetailsGroup.getDocInfo().getDocumentDetails().getNumber());
                                            deductedAmountsVo.setTicketNumber(docDetailsGroup.getDocInfo().getDocumentDetails().getNumber());
                                        }
                                    }

                                    //재발행여부 체크
                                    if (null != docDetailsGroup.getDocInfo().getDocumentDetails().getDataIndicator() && !"".equals(docDetailsGroup.getDocInfo().getDocumentDetails().getDataIndicator())) {
                                        if ("2".equals(docDetailsGroup.getDocInfo().getDocumentDetails().getDataIndicator())) {
                                            ticketInfo.setReIssue(true);
                                        }
                                    }
                                }
                            }


                            //쿠폰(항공편) 정보
                            List<Coupons> couponList = new ArrayList<Coupons>();

                            for (int c = 1; c < 5; c++) {
                                Coupons coupon = new Coupons();
                                coupon.setCouponIndex(c);
                                couponList.add(coupon);
                            }

                            //쿠폰(항공편) 정보
                            for (Coupons coupon : couponList) {
                                if (null != docDetailsGroup.getCouponGroup() && 0 < docDetailsGroup.getCouponGroup().size()) {
                                    for (int k = 0; k < docDetailsGroup.getCouponGroup().size(); k++) {
                                        TicketProcessEDocReply.DocGroup.DocDetailsGroup.CouponGroup couponGroup = docDetailsGroup.getCouponGroup().get(k);

                                        if (coupon.getCouponIndex() == Integer.parseInt(couponGroup.getCouponInfo().getCouponDetails().get(0).getCpnNumber())) {
                                            if (couponGroup.getLeg().size() > 0) {
                                                //상태값을 바꾸는 공통util필요
                                                //coupon.setCouponStatus(BookingUtil.amadeusCouponCodeTobizCouponCode(couponGroup.getCouponInfo().getCouponDetails().get(0).getCpnStatus()));
                                                coupon.setDepartureLocationCode(couponGroup.getLeg().get(0).getBoardPointDetails().getTrueLocationId());
                                                coupon.setArrivalLocationCode(couponGroup.getLeg().get(0).getOffpointDetails().getTrueLocationId());
                                                coupon.setAirLineCode(couponGroup.getLeg().get(0).getCompanyDetails().getMarketingCompany());
                                                coupon.setFlightNumber(couponGroup.getLeg().get(0).getFlightIdentification().getFlightNumber());

                                                //PLUAT-1887 flown seg정보 안나오는 문제 수정. 20151019
                                                if (null != couponGroup.getLeg().get(0).getFlightDate().getArrivalDate()) {
                                                    coupon.setArrivalDate(DateUtil.alteaDateToDate(couponGroup.getLeg().get(0).getFlightDate().getArrivalDate()));
                                                }
                                                if (null != couponGroup.getLeg().get(0).getFlightDate().getArrivalTime()) {
                                                    coupon.setArrivalTime(couponGroup.getLeg().get(0).getFlightDate().getArrivalTime());
                                                }
                                                if (null != couponGroup.getLeg().get(0).getFlightDate().getDepartureDate()) {
                                                    coupon.setDepartureDate(DateUtil.alteaDateToDate(couponGroup.getLeg().get(0).getFlightDate().getDepartureDate()));
                                                }
                                                if (null != couponGroup.getLeg().get(0).getFlightDate().getDepartureTime()) {
                                                    coupon.setDepartureTime(couponGroup.getLeg().get(0).getFlightDate().getDepartureTime());
                                                }

                                            }
                                            if (null != couponGroup.getPricingInfo()) {
                                                if (couponGroup.getPricingInfo().getFareBasisDetails().getRateTariffClass().indexOf("/") == -1) {
                                                    coupon.setFareBasisCode(couponGroup.getPricingInfo().getFareBasisDetails().getRateTariffClass());
                                                } else {
                                                    String[] str = couponGroup.getPricingInfo().getFareBasisDetails().getRateTariffClass().split("/");
                                                    coupon.setFareBasisCode(str[0]);
                                                    //소아, 유아, 장애인, STCR, CBBG 등의 데이터가 들어간다.
                                                    coupon.setFareBasisAnotherCode(str[1]);
                                                }
                                            }
                                        }
                                        //pluat-3203 티켓 환불가능한 날짜를 지났으면, 당일까지는 가능.날짜가 지나면 불가처리
                                        //List<DateAndTimeDetailsTypeI> dateAndTimeDetails = couponGroup.getValidityDates().getDateAndTimeDetails();
                                        if (null != couponGroup.getValidityDates()
                                                && CollectionUtils.isNotEmpty(couponGroup.getValidityDates().getDateAndTimeDetails())) {
                                            couponGroup.getValidityDates().getDateAndTimeDetails();
                                            for (DateAndTimeDetailsTypeI validateDate : couponGroup.getValidityDates().getDateAndTimeDetails()) {
                                                if ("A".equals(validateDate.getQualifier())) {
                                                    String validDate = validateDate.getDate();
                                                    coupon.setValidateDate(validDate);
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            //비행 정보 출력
                            if (null != docDetailsGroup.getCouponGroup() && 0 < docDetailsGroup.getCouponGroup().size()) {
                                for (int k = 0; k < docDetailsGroup.getCouponGroup().size(); k++) {
                                    TicketProcessEDocReply.DocGroup.DocDetailsGroup.CouponGroup couponGroup = docDetailsGroup.getCouponGroup().get(k);
                                    //모든 같은 거라 처음 비행편만 체크 한다.
                                    if (i == 0) {
                                        Coupons itineraryInfo = new Coupons();    //비행편 출력
                                        //쿠폰 상태
                                        itineraryInfo.setCouponStatus(BookingUtil.amadeusCouponCodeTobizCouponCode(couponGroup.getCouponInfo().getCouponDetails().get(0).getCpnStatus()));

                                        //비행기 번호
                                        if (CollectionUtils.isEmpty(couponGroup.getLeg())) {
                                            continue;
                                        }
                                        itineraryInfo.setAirLineCode(couponGroup.getLeg().get(0).getCompanyDetails().getMarketingCompany());
                                        itineraryInfo.setFlightNumber(BookingUtil.getFlightNumberFormat(couponGroup.getLeg().get(0).getFlightIdentification().getFlightNumber()));

                                        //출도착 정보
                                        itineraryInfo.setDepartureDate(couponGroup.getLeg().get(0).getFlightDate().getDepartureDate());
                                        itineraryInfo.setDepartureTime(couponGroup.getLeg().get(0).getFlightDate().getDepartureTime());
                                        itineraryInfo.setArrivalDate(couponGroup.getLeg().get(0).getFlightDate().getArrivalDate());
                                        itineraryInfo.setArrivalTime(couponGroup.getLeg().get(0).getFlightDate().getArrivalTime());

                                        itineraryInfo.setDepartureLocationCode(couponGroup.getLeg().get(0).getBoardPointDetails().getTrueLocationId());
                                        itineraryInfo.setArrivalLocationCode(couponGroup.getLeg().get(0).getOffpointDetails().getTrueLocationId());
                                        itineraryInfoList.add(itineraryInfo);
                                    }//if
                                }
                            }
                            //티켓이 1개(쿠폰4개)이상인 경우를 체크한다.
                            couponTotalList.addAll(couponList);
                            if (j == 0) {
                                continue;
                            } else {
                                String childTicket = docDetailsGroup.getDocInfo().getDocumentDetails().getNumber();
                                childTicketNumberList.add(childTicket.substring(0, 3) + "-" + childTicket.substring(3, childTicket.length()));
                            }

                        }//for
                        for (int k = 1; k <= couponTotalList.size(); k++) {
                            couponTotalList.get(k - 1).setCouponIndex(k);
                        }
                    }//if
                    ticketInfo.setCouponList(couponTotalList);
                    ticketInfo.setChildTicketNumberList(childTicketNumberList);
                    ticketInformationList.add(ticketInfo);
                    //환불금 정보 담기
                    if (null != docGroup.getDocDetailsGroup() && 0 < docGroup.getDocDetailsGroup().size()) {
                        for (int j = 0; j < docGroup.getDocDetailsGroup().size(); j++) {
                            if (null != docGroup.getPaxInfo() && !"".equals(docGroup.getPaxInfo())) {
                                if (null != docGroup.getPaxInfo().getPaxDetails() && !"".equals(docGroup.getPaxInfo().getPaxDetails())) {
                                    if (null != docGroup.getPaxInfo().getPaxDetails().getSurname() && !"".equals(docGroup.getPaxInfo().getPaxDetails().getSurname())) {
                                        deductedAmountsVo.setPassengerLastName(docGroup.getPaxInfo().getPaxDetails().getSurname());
                                    }//if
                                }//if
                            }//PaxInfo
                        }//for DocDetailsGroup
                    }//if DocDetailsGroup

                    //승객 이름
                    if (null != docGroup.getPaxInfo()) {
                        if (null != docGroup.getPaxInfo().getPaxDetails()) {
                            if (StringUtils.isNotEmpty(docGroup.getPaxInfo().getPaxDetails().getSurname())) {
                                deductedAmountsVo.setPassengerLastName(docGroup.getPaxInfo().getPaxDetails().getSurname());
                            }//if
                            if (null != docGroup.getPaxInfo().getPaxDetails().getType() && !"".equals(docGroup.getPaxInfo().getPaxDetails().getType())) {
                                String type = docGroup.getPaxInfo().getPaxDetails().getType();
                                if ("A".equals(type)) {
                                    deductedAmountsVo.setPassengerTypeCode("ADT");
                                } else if ("C".equals(type)) {
                                    deductedAmountsVo.setPassengerTypeCode("CHD");
                                } else if ("IN".equals(type)) {
                                    deductedAmountsVo.setPassengerTypeCode("INF");
                                } else {
                                    deductedAmountsVo.setPassengerTypeCode("ADT");
                                }
                            }//if
                        }//if
                        if (null != docGroup.getPaxInfo().getOtherPaxDetails() && 0 < docGroup.getPaxInfo().getOtherPaxDetails().size()) {
                            if (null != docGroup.getPaxInfo().getOtherPaxDetails().get(0).getGivenName() && !"".equals(docGroup.getPaxInfo().getOtherPaxDetails().get(0).getGivenName())) {
                                String[] temp = docGroup.getPaxInfo().getOtherPaxDetails().get(0).getGivenName().split(" ");
                                deductedAmountsVo.setPassengerFirstName(temp[0]);
                            }//if
                        }//if


                    }//PaxInfo

                    //환불 금액
                    if (null != docGroup.getFareInfo() && !"".equals(docGroup.getFareInfo())) {
                        if (null != docGroup.getFareInfo().getMonetaryDetails() && 0 < docGroup.getFareInfo().getMonetaryDetails().size()) {
                            for (int j = 0; j < docGroup.getFareInfo().getMonetaryDetails().size(); j++) {
                                MonetaryInformationDetailsTypeI monetaryDetails = docGroup.getFareInfo().getMonetaryDetails().get(j);
                                if (null != monetaryDetails.getTypeQualifier() && "T".equals(monetaryDetails.getTypeQualifier())) {
                                    if (null != monetaryDetails.getAmount() && !"".equals(monetaryDetails.getAmount())) {
                                        if ("NO ADC".equals(monetaryDetails.getAmount())) {
                                            deductedAmountsVo.setRefundAmount("0");
                                            //totalRefundAmount = totalRefundAmount.add(new BigDecimal("0"));
                                        } else {
                                            String amt = monetaryDetails.getAmount().replaceAll("[^\\d.]", "");
                                            deductedAmountsVo.setRefundAmount(amt);
                                            //totalRefundAmount = totalRefundAmount.add(new BigDecimal(amt));
                                        }
                                    }
                                }//if
                            }//for
                        }//if
                    }//if

                    //결제 및 환불 마일
                    if (null != docGroup.getTextInfo() && 0 < docGroup.getTextInfo().size()) {
                        for (int j = 0; j < docGroup.getTextInfo().size(); j++) {
                            InteractiveFreeTextTypeI textInfo = docGroup.getTextInfo().get(j);
                            if (null != textInfo.getFreeTextQualification() && !"".equals(textInfo.getFreeTextQualification())) {
                                if (null != textInfo.getFreeTextQualification().getInformationType() && "MFC".equals(textInfo.getFreeTextQualification().getInformationType())) {
                                    if (null != textInfo.getFreeText() && 0 < textInfo.getFreeText().size()) {
                                        for (int k = 0; k < textInfo.getFreeText().size(); k++) {
                                            String freeText = textInfo.getFreeText().get(k);
                                            int textLength = freeText.indexOf("TOTAL");
                                            if (0 <= textLength) {
                                                String miles = freeText.substring(textLength);
                                                miles = miles.replaceAll("TOTAL", "");

                                                if (null != miles && !"".equals(miles)) {
                                                    String penaltyMiles = "0";

                                                    String convertDate = DateUtil.alteaDateToDate(docGroup.getProductInfo().getProductDateTimeDetails().getDepartureDate());
                                                    SimpleDateFormat sdfmt = new SimpleDateFormat("yyyyMMdd");
                                                    Date beginDate = sdfmt.parse(convertDate);
                                                    Date standardDate = null;
                                                    //System.out.println("2222222222222============="+convertDate);
                                                    standardDate = sdfmt.parse("20170801");
                                                    long diff = beginDate.getTime() - standardDate.getTime();
                                                    diff = diff / (24 * 60 * 60 * 1000);
                                                    //System.out.println(diff);
                                                    if (diff >= 0) {
                                                        if (!"INF".equals(deductedAmountsVo.getPassengerTypeCode())) {
                                                            penaltyMiles = "3000";
                                                        }
                                                    }
                                                    deductedAmountsVo.setPaidAmountInMiles(miles);
                                                    int refundMiles = Integer.parseInt(miles) - Integer.parseInt(penaltyMiles);
                                                    deductedAmountsVo.setRefundMilesAmount(String.valueOf(refundMiles));
                                                    deductedAmountsVo.setRefundPenaltyMiles(penaltyMiles);
                                                    deductedAmountsVo.setPaidAmountInMiles(miles);
                                                    deductedAmountsVo.setRefundMilesAmount(miles);
                                                }
                                            }
                                        }//for
                                    }
                                }
                            }
                            deductedAmountsList.add(deductedAmountsVo);
                        }//for
                    }//if
                    output.setDeductedAmountsList(deductedAmountsList);
                }//for DocGroup
                output.setItineraryList(itineraryInfoList);
            }//if DocGroup
            output.setTicketInformationList(ticketInformationList);
        }//if tikOutput


        return output;
    }
}
