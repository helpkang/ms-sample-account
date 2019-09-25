
package com.koreanair.external.eretail.vo.tripplan.common.common_air_pricing;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CurrencyType;


/**
 * <p>Java class for ticketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticketType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INITIAL_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NEWLY_BOOKED_ELEMENT_IN_FLOW" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="GENERAL_DATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TST_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MANUAL_AUTOMATIC_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERNATIONAL_SALE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LAST_TKT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FCMI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CREATION_INFO" type="{}UpdateInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="MODIFICATION_INFO" type="{}UpdateInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="IS_INTERNATIONAL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="IS_CHANGE_FLAG" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="IS_CONFIDENTIAL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="TICKET_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_PRICING_USE_CASE" type="{}pricingUseCaseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_REDEMPTION_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FARE_DATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MAX_REFUNDABLE_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FARE_CALCULATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BASE_FARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BASE_CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REFUNDABLE_TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REFUNDABLE_BF_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT_TYPE" type="{}amount_type" minOccurs="0"/&gt;
 *                   &lt;element name="ISSUE_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INVOLUNTARY_REISSUE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="EQUIV_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EQUIV_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TAX" type="{}taxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_SEGMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FARE_FAMILY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRIMARY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NVB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BAGGAGE_ALLOWANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DISCOUNT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="TICKETING_STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="ROUTING" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="CONNECTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="COUPON_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INVOLUNTARY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="SEQUENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="PNR_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_AIRLINE_FEE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}feeType"&gt;
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TOTAL_AIRLINE_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="SERVICE_FEE" type="{}taxType" minOccurs="0"/&gt;
 *                   &lt;element name="ADDITIONAL_FEE" type="{}taxType" minOccurs="0"/&gt;
 *                   &lt;element name="TOUR_INFORMATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TOUR_CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NET_FARE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="NET_FARE_CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PUBLISHED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PUBLISHED_CURENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="BANKERS_RATE_1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="BANKERS_RATE_2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="TRANSITIONAL_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="EQUIV_NET_FARE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="GRAND_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="TOTAL_TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="TOTAL_TAX_TO_BE_PAID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TAX_TOTAL_BY_CURRENCY" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;group ref="{}taxTotalGroup"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MILES_COST" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="MILES_CALCULATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PUBLISHED_FARE_FROM_FILING" type="{}amountType" minOccurs="0"/&gt;
 *                   &lt;element name="DISCOUNT_DATA" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DISCOUNT" type="{}amountType" minOccurs="0"/&gt;
 *                             &lt;element name="DISCOUNT_BALANCE" type="{}amountType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NOT_TICKETABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="REDEMPTION_CONVERSION_INFO" type="{}REDEMPTION_CONVERSION_INFO_Type" minOccurs="0"/&gt;
 *                   &lt;element name="ACCRUED_POINTS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PNR_DATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PASSENGERS" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="IS_TICKETED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="PNR_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ENDORSEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RESTRICTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="VALIDATING_CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COMMISSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_LINKED_FARE_ELEMENT" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_LINKED_FAFH" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_LINKED_TSM" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_LINKED_FO" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LINKED_PAYMENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OVERRIDE_REASON" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_REASON" type="{}reasonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TICKET_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_TATTOO" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CORRELATION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="REISSUE_AMOUNTS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OLD_AMOUNTS"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BASE_FARE" type="{}amountType"/&gt;
 *                             &lt;element name="PUBLISHED_FARE" type="{}amountType" minOccurs="0"/&gt;
 *                             &lt;element name="NET_FARE" type="{}amountType" minOccurs="0"/&gt;
 *                             &lt;element name="DISCOUNT" type="{}amountType" minOccurs="0"/&gt;
 *                             &lt;element name="TAX" type="{}amountType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NEW_AMOUNTS"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BASE_FARE" type="{}amountType"/&gt;
 *                             &lt;element name="PUBLISHED_FARE" type="{}amountType" minOccurs="0"/&gt;
 *                             &lt;element name="NET_FARE" type="{}amountType" minOccurs="0"/&gt;
 *                             &lt;element name="DISCOUNT" type="{}amountType" minOccurs="0"/&gt;
 *                             &lt;element name="TAX" type="{}amountType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FARE_BALANCE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BASE_FARE_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="PUBLISHED_FARE_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="NET_FARE_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="DISCOUNT_AMOUNT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="TAX_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="TOTAL_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="REFUND_INFO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="REFUND" type="{}amountType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PENALTIES" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="REBOOKING_PENALTY" type="{}amountType" minOccurs="0"/&gt;
 *                             &lt;element name="NO_SHOW_FEE" type="{}amountType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TST_ADDITIONAL_COLLECTION" type="{}amountType"/&gt;
 *                   &lt;element name="TOTAL_ADDITIONAL_COLLECTION" type="{}amountType"/&gt;
 *                   &lt;element name="TOTAL" type="{}amountType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticketType", propOrder = {
    "initialelement",
    "newlybookedelementinflow",
    "generaldata",
    "faredata",
    "pnrdata",
    "overridereason",
    "ticketid",
    "tickettattoo",
    "correlationid",
    "reissueamounts"
})
public class TicketType
    implements Serializable
{

    @XmlElement(name = "INITIAL_ELEMENT")
    protected Boolean initialelement;
    @XmlElement(name = "NEWLY_BOOKED_ELEMENT_IN_FLOW")
    protected Object newlybookedelementinflow;
    @XmlElement(name = "GENERAL_DATA")
    protected TicketType.GENERALDATA generaldata;
    @XmlElement(name = "FARE_DATA")
    protected TicketType.FAREDATA faredata;
    @XmlElement(name = "PNR_DATA")
    protected TicketType.PNRDATA pnrdata;
    @XmlElement(name = "OVERRIDE_REASON")
    protected TicketType.OVERRIDEREASON overridereason;
    @XmlElement(name = "TICKET_ID")
    protected Object ticketid;
    @XmlElement(name = "TICKET_TATTOO")
    protected Object tickettattoo;
    @XmlElement(name = "CORRELATION_ID")
    protected Object correlationid;
    @XmlElement(name = "REISSUE_AMOUNTS")
    protected TicketType.REISSUEAMOUNTS reissueamounts;

    /**
     * Gets the value of the initialelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINITIALELEMENT() {
        return initialelement;
    }

    /**
     * Sets the value of the initialelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINITIALELEMENT(Boolean value) {
        this.initialelement = value;
    }

    /**
     * Gets the value of the newlybookedelementinflow property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNEWLYBOOKEDELEMENTINFLOW() {
        return newlybookedelementinflow;
    }

    /**
     * Sets the value of the newlybookedelementinflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNEWLYBOOKEDELEMENTINFLOW(Object value) {
        this.newlybookedelementinflow = value;
    }

    /**
     * Gets the value of the generaldata property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType.GENERALDATA }
     *     
     */
    public TicketType.GENERALDATA getGENERALDATA() {
        return generaldata;
    }

    /**
     * Sets the value of the generaldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType.GENERALDATA }
     *     
     */
    public void setGENERALDATA(TicketType.GENERALDATA value) {
        this.generaldata = value;
    }

    /**
     * Gets the value of the faredata property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType.FAREDATA }
     *     
     */
    public TicketType.FAREDATA getFAREDATA() {
        return faredata;
    }

    /**
     * Sets the value of the faredata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType.FAREDATA }
     *     
     */
    public void setFAREDATA(TicketType.FAREDATA value) {
        this.faredata = value;
    }

    /**
     * Gets the value of the pnrdata property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType.PNRDATA }
     *     
     */
    public TicketType.PNRDATA getPNRDATA() {
        return pnrdata;
    }

    /**
     * Sets the value of the pnrdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType.PNRDATA }
     *     
     */
    public void setPNRDATA(TicketType.PNRDATA value) {
        this.pnrdata = value;
    }

    /**
     * Gets the value of the overridereason property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType.OVERRIDEREASON }
     *     
     */
    public TicketType.OVERRIDEREASON getOVERRIDEREASON() {
        return overridereason;
    }

    /**
     * Sets the value of the overridereason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType.OVERRIDEREASON }
     *     
     */
    public void setOVERRIDEREASON(TicketType.OVERRIDEREASON value) {
        this.overridereason = value;
    }

    /**
     * Gets the value of the ticketid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTICKETID() {
        return ticketid;
    }

    /**
     * Sets the value of the ticketid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTICKETID(Object value) {
        this.ticketid = value;
    }

    /**
     * Gets the value of the tickettattoo property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTICKETTATTOO() {
        return tickettattoo;
    }

    /**
     * Sets the value of the tickettattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTICKETTATTOO(Object value) {
        this.tickettattoo = value;
    }

    /**
     * Gets the value of the correlationid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCORRELATIONID() {
        return correlationid;
    }

    /**
     * Sets the value of the correlationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCORRELATIONID(Object value) {
        this.correlationid = value;
    }

    /**
     * Gets the value of the reissueamounts property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType.REISSUEAMOUNTS }
     *     
     */
    public TicketType.REISSUEAMOUNTS getREISSUEAMOUNTS() {
        return reissueamounts;
    }

    /**
     * Sets the value of the reissueamounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType.REISSUEAMOUNTS }
     *     
     */
    public void setREISSUEAMOUNTS(TicketType.REISSUEAMOUNTS value) {
        this.reissueamounts = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="MAX_REFUNDABLE_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FARE_CALCULATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BASE_FARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BASE_CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REFUNDABLE_TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REFUNDABLE_BF_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT_TYPE" type="{}amount_type" minOccurs="0"/&gt;
     *         &lt;element name="ISSUE_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INVOLUNTARY_REISSUE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="EQUIV_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EQUIV_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TAX" type="{}taxType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FARE_FAMILY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRIMARY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NVB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BAGGAGE_ALLOWANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DISCOUNT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="TICKETING_STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="ROUTING" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="CONNECTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="COUPON_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INVOLUNTARY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="SEQUENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="PNR_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_AIRLINE_FEE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}feeType"&gt;
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TOTAL_AIRLINE_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="SERVICE_FEE" type="{}taxType" minOccurs="0"/&gt;
     *         &lt;element name="ADDITIONAL_FEE" type="{}taxType" minOccurs="0"/&gt;
     *         &lt;element name="TOUR_INFORMATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TOUR_CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NET_FARE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="NET_FARE_CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PUBLISHED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PUBLISHED_CURENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="BANKERS_RATE_1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="BANKERS_RATE_2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="TRANSITIONAL_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="EQUIV_NET_FARE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="GRAND_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_TAX_TO_BE_PAID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TAX_TOTAL_BY_CURRENCY" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;group ref="{}taxTotalGroup"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MILES_COST" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="MILES_CALCULATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PUBLISHED_FARE_FROM_FILING" type="{}amountType" minOccurs="0"/&gt;
     *         &lt;element name="DISCOUNT_DATA" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DISCOUNT" type="{}amountType" minOccurs="0"/&gt;
     *                   &lt;element name="DISCOUNT_BALANCE" type="{}amountType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NOT_TICKETABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="REDEMPTION_CONVERSION_INFO" type="{}REDEMPTION_CONVERSION_INFO_Type" minOccurs="0"/&gt;
     *         &lt;element name="ACCRUED_POINTS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "maxrefundablefeeamount",
        "farecalculation",
        "basefare",
        "basecurrencycode",
        "totalamount",
        "currencycode",
        "refundabletaxamount",
        "refundablebfamount",
        "amounttype",
        "issueidentifier",
        "involuntaryreissueindicator",
        "equivamount",
        "equivcurrency",
        "listtax",
        "listsegment",
        "listairlinefee",
        "totalairlinefeeamount",
        "servicefee",
        "additionalfee",
        "tourinformation",
        "netfareamount",
        "netfarecurrencycode",
        "publishedamount",
        "publishedcurencycode",
        "bankersrate1",
        "bankersrate2",
        "transitionalcurrency",
        "equivnetfareamount",
        "grandtotalamount",
        "totaltaxamount",
        "totaltaxtobepaid",
        "listtaxtotalbycurrency",
        "milescost",
        "milescalculation",
        "publishedfarefromfiling",
        "discountdata",
        "notticketable",
        "redemptionconversioninfo",
        "accruedpoints"
    })
    public static class FAREDATA
        implements Serializable
    {

        @XmlElement(name = "MAX_REFUNDABLE_FEE_AMOUNT")
        protected String maxrefundablefeeamount;
        @XmlElement(name = "FARE_CALCULATION")
        protected String farecalculation;
        @XmlElement(name = "BASE_FARE")
        protected String basefare;
        @XmlElement(name = "BASE_CURRENCY_CODE")
        protected Object basecurrencycode;
        @XmlElement(name = "TOTAL_AMOUNT")
        protected String totalamount;
        @XmlElement(name = "CURRENCY_CODE")
        protected String currencycode;
        @XmlElement(name = "REFUNDABLE_TAX_AMOUNT")
        protected String refundabletaxamount;
        @XmlElement(name = "REFUNDABLE_BF_AMOUNT")
        protected String refundablebfamount;
        @XmlElement(name = "AMOUNT_TYPE")
        @XmlSchemaType(name = "string")
        protected com.koreanair.external.eretail.vo.tripplan.common.common_price.AmountType amounttype;
        @XmlElement(name = "ISSUE_IDENTIFIER")
        protected String issueidentifier;
        @XmlElement(name = "INVOLUNTARY_REISSUE_INDICATOR")
        protected Object involuntaryreissueindicator;
        @XmlElement(name = "EQUIV_AMOUNT")
        protected String equivamount;
        @XmlElement(name = "EQUIV_CURRENCY")
        protected String equivcurrency;
        @XmlElement(name = "LIST_TAX")
        protected List<TaxType> listtax;
        @XmlElement(name = "LIST_SEGMENT")
        protected List<TicketType.FAREDATA.LISTSEGMENT> listsegment;
        @XmlElement(name = "LIST_AIRLINE_FEE")
        protected List<TicketType.FAREDATA.LISTAIRLINEFEE> listairlinefee;
        @XmlElement(name = "TOTAL_AIRLINE_FEE_AMOUNT")
        protected Object totalairlinefeeamount;
        @XmlElement(name = "SERVICE_FEE")
        protected TaxType servicefee;
        @XmlElement(name = "ADDITIONAL_FEE")
        protected TaxType additionalfee;
        @XmlElement(name = "TOUR_INFORMATION")
        protected TicketType.FAREDATA.TOURINFORMATION tourinformation;
        @XmlElement(name = "NET_FARE_AMOUNT")
        protected Object netfareamount;
        @XmlElement(name = "NET_FARE_CURRENCY_CODE")
        protected Object netfarecurrencycode;
        @XmlElement(name = "PUBLISHED_AMOUNT")
        protected Object publishedamount;
        @XmlElement(name = "PUBLISHED_CURENCY_CODE")
        protected Object publishedcurencycode;
        @XmlElement(name = "BANKERS_RATE_1")
        protected Object bankersrate1;
        @XmlElement(name = "BANKERS_RATE_2")
        protected Object bankersrate2;
        @XmlElement(name = "TRANSITIONAL_CURRENCY")
        protected Object transitionalcurrency;
        @XmlElement(name = "EQUIV_NET_FARE_AMOUNT")
        protected Object equivnetfareamount;
        @XmlElement(name = "GRAND_TOTAL_AMOUNT")
        protected Object grandtotalamount;
        @XmlElement(name = "TOTAL_TAX_AMOUNT")
        protected Object totaltaxamount;
        @XmlElement(name = "TOTAL_TAX_TO_BE_PAID")
        protected Object totaltaxtobepaid;
        @XmlElement(name = "LIST_TAX_TOTAL_BY_CURRENCY")
        protected List<TicketType.FAREDATA.LISTTAXTOTALBYCURRENCY> listtaxtotalbycurrency;
        @XmlElement(name = "MILES_COST")
        protected Integer milescost;
        @XmlElement(name = "MILES_CALCULATION")
        protected String milescalculation;
        @XmlElement(name = "PUBLISHED_FARE_FROM_FILING")
        protected com.koreanair.external.eretail.vo.common.common.AmountType publishedfarefromfiling;
        @XmlElement(name = "DISCOUNT_DATA")
        protected TicketType.FAREDATA.DISCOUNTDATA discountdata;
        @XmlElement(name = "NOT_TICKETABLE", defaultValue = "false")
        protected Boolean notticketable;
        @XmlElement(name = "REDEMPTION_CONVERSION_INFO")
        protected REDEMPTIONCONVERSIONINFOType redemptionconversioninfo;
        @XmlElement(name = "ACCRUED_POINTS")
        protected BigDecimal accruedpoints;

        /**
         * Gets the value of the maxrefundablefeeamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAXREFUNDABLEFEEAMOUNT() {
            return maxrefundablefeeamount;
        }

        /**
         * Sets the value of the maxrefundablefeeamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAXREFUNDABLEFEEAMOUNT(String value) {
            this.maxrefundablefeeamount = value;
        }

        /**
         * Gets the value of the farecalculation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFARECALCULATION() {
            return farecalculation;
        }

        /**
         * Sets the value of the farecalculation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFARECALCULATION(String value) {
            this.farecalculation = value;
        }

        /**
         * Gets the value of the basefare property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBASEFARE() {
            return basefare;
        }

        /**
         * Sets the value of the basefare property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBASEFARE(String value) {
            this.basefare = value;
        }

        /**
         * Gets the value of the basecurrencycode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getBASECURRENCYCODE() {
            return basecurrencycode;
        }

        /**
         * Sets the value of the basecurrencycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setBASECURRENCYCODE(Object value) {
            this.basecurrencycode = value;
        }

        /**
         * Gets the value of the totalamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOTALAMOUNT() {
            return totalamount;
        }

        /**
         * Sets the value of the totalamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOTALAMOUNT(String value) {
            this.totalamount = value;
        }

        /**
         * Gets the value of the currencycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCURRENCYCODE() {
            return currencycode;
        }

        /**
         * Sets the value of the currencycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCURRENCYCODE(String value) {
            this.currencycode = value;
        }

        /**
         * Gets the value of the refundabletaxamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFUNDABLETAXAMOUNT() {
            return refundabletaxamount;
        }

        /**
         * Sets the value of the refundabletaxamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFUNDABLETAXAMOUNT(String value) {
            this.refundabletaxamount = value;
        }

        /**
         * Gets the value of the refundablebfamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFUNDABLEBFAMOUNT() {
            return refundablebfamount;
        }

        /**
         * Sets the value of the refundablebfamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFUNDABLEBFAMOUNT(String value) {
            this.refundablebfamount = value;
        }

        /**
         * Gets the value of the amounttype property.
         * 
         * @return
         *     possible object is
         *     {@link com.koreanair.external.eretail.vo.tripplan.common.common_price.AmountType }
         *     
         */
        public com.koreanair.external.eretail.vo.tripplan.common.common_price.AmountType getAMOUNTTYPE() {
            return amounttype;
        }

        /**
         * Sets the value of the amounttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.koreanair.external.eretail.vo.tripplan.common.common_price.AmountType }
         *     
         */
        public void setAMOUNTTYPE(com.koreanair.external.eretail.vo.tripplan.common.common_price.AmountType value) {
            this.amounttype = value;
        }

        /**
         * Gets the value of the issueidentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISSUEIDENTIFIER() {
            return issueidentifier;
        }

        /**
         * Sets the value of the issueidentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISSUEIDENTIFIER(String value) {
            this.issueidentifier = value;
        }

        /**
         * Gets the value of the involuntaryreissueindicator property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getINVOLUNTARYREISSUEINDICATOR() {
            return involuntaryreissueindicator;
        }

        /**
         * Sets the value of the involuntaryreissueindicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setINVOLUNTARYREISSUEINDICATOR(Object value) {
            this.involuntaryreissueindicator = value;
        }

        /**
         * Gets the value of the equivamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEQUIVAMOUNT() {
            return equivamount;
        }

        /**
         * Sets the value of the equivamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEQUIVAMOUNT(String value) {
            this.equivamount = value;
        }

        /**
         * Gets the value of the equivcurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEQUIVCURRENCY() {
            return equivcurrency;
        }

        /**
         * Sets the value of the equivcurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEQUIVCURRENCY(String value) {
            this.equivcurrency = value;
        }

        /**
         * Gets the value of the listtax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTAX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxType }
         * 
         * 
         */
        public List<TaxType> getLISTTAX() {
            if (listtax == null) {
                listtax = new ArrayList<TaxType>();
            }
            return this.listtax;
        }

        /**
         * Gets the value of the listsegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEGMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketType.FAREDATA.LISTSEGMENT }
         * 
         * 
         */
        public List<TicketType.FAREDATA.LISTSEGMENT> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<TicketType.FAREDATA.LISTSEGMENT>();
            }
            return this.listsegment;
        }

        /**
         * Gets the value of the listairlinefee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listairlinefee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTAIRLINEFEE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketType.FAREDATA.LISTAIRLINEFEE }
         * 
         * 
         */
        public List<TicketType.FAREDATA.LISTAIRLINEFEE> getLISTAIRLINEFEE() {
            if (listairlinefee == null) {
                listairlinefee = new ArrayList<TicketType.FAREDATA.LISTAIRLINEFEE>();
            }
            return this.listairlinefee;
        }

        /**
         * Gets the value of the totalairlinefeeamount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTOTALAIRLINEFEEAMOUNT() {
            return totalairlinefeeamount;
        }

        /**
         * Sets the value of the totalairlinefeeamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTOTALAIRLINEFEEAMOUNT(Object value) {
            this.totalairlinefeeamount = value;
        }

        /**
         * Gets the value of the servicefee property.
         * 
         * @return
         *     possible object is
         *     {@link TaxType }
         *     
         */
        public TaxType getSERVICEFEE() {
            return servicefee;
        }

        /**
         * Sets the value of the servicefee property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxType }
         *     
         */
        public void setSERVICEFEE(TaxType value) {
            this.servicefee = value;
        }

        /**
         * Gets the value of the additionalfee property.
         * 
         * @return
         *     possible object is
         *     {@link TaxType }
         *     
         */
        public TaxType getADDITIONALFEE() {
            return additionalfee;
        }

        /**
         * Sets the value of the additionalfee property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxType }
         *     
         */
        public void setADDITIONALFEE(TaxType value) {
            this.additionalfee = value;
        }

        /**
         * Gets the value of the tourinformation property.
         * 
         * @return
         *     possible object is
         *     {@link TicketType.FAREDATA.TOURINFORMATION }
         *     
         */
        public TicketType.FAREDATA.TOURINFORMATION getTOURINFORMATION() {
            return tourinformation;
        }

        /**
         * Sets the value of the tourinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketType.FAREDATA.TOURINFORMATION }
         *     
         */
        public void setTOURINFORMATION(TicketType.FAREDATA.TOURINFORMATION value) {
            this.tourinformation = value;
        }

        /**
         * Gets the value of the netfareamount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNETFAREAMOUNT() {
            return netfareamount;
        }

        /**
         * Sets the value of the netfareamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNETFAREAMOUNT(Object value) {
            this.netfareamount = value;
        }

        /**
         * Gets the value of the netfarecurrencycode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNETFARECURRENCYCODE() {
            return netfarecurrencycode;
        }

        /**
         * Sets the value of the netfarecurrencycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNETFARECURRENCYCODE(Object value) {
            this.netfarecurrencycode = value;
        }

        /**
         * Gets the value of the publishedamount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPUBLISHEDAMOUNT() {
            return publishedamount;
        }

        /**
         * Sets the value of the publishedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPUBLISHEDAMOUNT(Object value) {
            this.publishedamount = value;
        }

        /**
         * Gets the value of the publishedcurencycode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPUBLISHEDCURENCYCODE() {
            return publishedcurencycode;
        }

        /**
         * Sets the value of the publishedcurencycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPUBLISHEDCURENCYCODE(Object value) {
            this.publishedcurencycode = value;
        }

        /**
         * Gets the value of the bankersrate1 property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getBANKERSRATE1() {
            return bankersrate1;
        }

        /**
         * Sets the value of the bankersrate1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setBANKERSRATE1(Object value) {
            this.bankersrate1 = value;
        }

        /**
         * Gets the value of the bankersrate2 property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getBANKERSRATE2() {
            return bankersrate2;
        }

        /**
         * Sets the value of the bankersrate2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setBANKERSRATE2(Object value) {
            this.bankersrate2 = value;
        }

        /**
         * Gets the value of the transitionalcurrency property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRANSITIONALCURRENCY() {
            return transitionalcurrency;
        }

        /**
         * Sets the value of the transitionalcurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRANSITIONALCURRENCY(Object value) {
            this.transitionalcurrency = value;
        }

        /**
         * Gets the value of the equivnetfareamount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEQUIVNETFAREAMOUNT() {
            return equivnetfareamount;
        }

        /**
         * Sets the value of the equivnetfareamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEQUIVNETFAREAMOUNT(Object value) {
            this.equivnetfareamount = value;
        }

        /**
         * Gets the value of the grandtotalamount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getGRANDTOTALAMOUNT() {
            return grandtotalamount;
        }

        /**
         * Sets the value of the grandtotalamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setGRANDTOTALAMOUNT(Object value) {
            this.grandtotalamount = value;
        }

        /**
         * Gets the value of the totaltaxamount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTOTALTAXAMOUNT() {
            return totaltaxamount;
        }

        /**
         * Sets the value of the totaltaxamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTOTALTAXAMOUNT(Object value) {
            this.totaltaxamount = value;
        }

        /**
         * Gets the value of the totaltaxtobepaid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTOTALTAXTOBEPAID() {
            return totaltaxtobepaid;
        }

        /**
         * Sets the value of the totaltaxtobepaid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTOTALTAXTOBEPAID(Object value) {
            this.totaltaxtobepaid = value;
        }

        /**
         * Gets the value of the listtaxtotalbycurrency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtaxtotalbycurrency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTAXTOTALBYCURRENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketType.FAREDATA.LISTTAXTOTALBYCURRENCY }
         * 
         * 
         */
        public List<TicketType.FAREDATA.LISTTAXTOTALBYCURRENCY> getLISTTAXTOTALBYCURRENCY() {
            if (listtaxtotalbycurrency == null) {
                listtaxtotalbycurrency = new ArrayList<TicketType.FAREDATA.LISTTAXTOTALBYCURRENCY>();
            }
            return this.listtaxtotalbycurrency;
        }

        /**
         * Gets the value of the milescost property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMILESCOST() {
            return milescost;
        }

        /**
         * Sets the value of the milescost property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMILESCOST(Integer value) {
            this.milescost = value;
        }

        /**
         * Gets the value of the milescalculation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMILESCALCULATION() {
            return milescalculation;
        }

        /**
         * Sets the value of the milescalculation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMILESCALCULATION(String value) {
            this.milescalculation = value;
        }

        /**
         * Gets the value of the publishedfarefromfiling property.
         * 
         * @return
         *     possible object is
         *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
         *     
         */
        public com.koreanair.external.eretail.vo.common.common.AmountType getPUBLISHEDFAREFROMFILING() {
            return publishedfarefromfiling;
        }

        /**
         * Sets the value of the publishedfarefromfiling property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
         *     
         */
        public void setPUBLISHEDFAREFROMFILING(com.koreanair.external.eretail.vo.common.common.AmountType value) {
            this.publishedfarefromfiling = value;
        }

        /**
         * Gets the value of the discountdata property.
         * 
         * @return
         *     possible object is
         *     {@link TicketType.FAREDATA.DISCOUNTDATA }
         *     
         */
        public TicketType.FAREDATA.DISCOUNTDATA getDISCOUNTDATA() {
            return discountdata;
        }

        /**
         * Sets the value of the discountdata property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketType.FAREDATA.DISCOUNTDATA }
         *     
         */
        public void setDISCOUNTDATA(TicketType.FAREDATA.DISCOUNTDATA value) {
            this.discountdata = value;
        }

        /**
         * Gets the value of the notticketable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNOTTICKETABLE() {
            return notticketable;
        }

        /**
         * Sets the value of the notticketable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNOTTICKETABLE(Boolean value) {
            this.notticketable = value;
        }

        /**
         * Gets the value of the redemptionconversioninfo property.
         * 
         * @return
         *     possible object is
         *     {@link REDEMPTIONCONVERSIONINFOType }
         *     
         */
        public REDEMPTIONCONVERSIONINFOType getREDEMPTIONCONVERSIONINFO() {
            return redemptionconversioninfo;
        }

        /**
         * Sets the value of the redemptionconversioninfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link REDEMPTIONCONVERSIONINFOType }
         *     
         */
        public void setREDEMPTIONCONVERSIONINFO(REDEMPTIONCONVERSIONINFOType value) {
            this.redemptionconversioninfo = value;
        }

        /**
         * Gets the value of the accruedpoints property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACCRUEDPOINTS() {
            return accruedpoints;
        }

        /**
         * Sets the value of the accruedpoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACCRUEDPOINTS(BigDecimal value) {
            this.accruedpoints = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="DISCOUNT" type="{}amountType" minOccurs="0"/&gt;
         *         &lt;element name="DISCOUNT_BALANCE" type="{}amountType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "discount",
            "discountbalance"
        })
        public static class DISCOUNTDATA
            implements Serializable
        {

            @XmlElement(name = "DISCOUNT")
            protected com.koreanair.external.eretail.vo.common.common.AmountType discount;
            @XmlElement(name = "DISCOUNT_BALANCE")
            protected com.koreanair.external.eretail.vo.common.common.AmountType discountbalance;

            /**
             * Gets the value of the discount property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getDISCOUNT() {
                return discount;
            }

            /**
             * Sets the value of the discount property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setDISCOUNT(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.discount = value;
            }

            /**
             * Gets the value of the discountbalance property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getDISCOUNTBALANCE() {
                return discountbalance;
            }

            /**
             * Sets the value of the discountbalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setDISCOUNTBALANCE(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.discountbalance = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}feeType"&gt;
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LISTAIRLINEFEE
            extends FeeType
            implements Serializable
        {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "isDeleted")
            protected Boolean isDeleted;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the isDeleted property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsDeleted() {
                return isDeleted;
            }

            /**
             * Sets the value of the isDeleted property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsDeleted(Boolean value) {
                this.isDeleted = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FARE_FAMILY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRIMARY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NVB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BAGGAGE_ALLOWANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DISCOUNT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="TICKETING_STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="ROUTING" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="CONNECTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="COUPON_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INVOLUNTARY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="SEQUENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="PNR_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "number",
            "farefamily",
            "primarycode",
            "amount",
            "currency",
            "nva",
            "nvb",
            "farebasis",
            "baggageallowance",
            "discountindicator",
            "ticketingstatus",
            "routing",
            "connectiontype",
            "couponstatus",
            "involuntaryindicator",
            "segmentid",
            "sequencenumber",
            "pnrsegmentid"
        })
        public static class LISTSEGMENT
            implements Serializable
        {

            @XmlElement(name = "NUMBER")
            protected String number;
            @XmlElement(name = "FARE_FAMILY")
            protected String farefamily;
            @XmlElement(name = "PRIMARY_CODE")
            protected String primarycode;
            @XmlElement(name = "AMOUNT")
            protected String amount;
            @XmlElement(name = "CURRENCY")
            protected String currency;
            @XmlElement(name = "NVA")
            protected String nva;
            @XmlElement(name = "NVB")
            protected String nvb;
            @XmlElement(name = "FARE_BASIS")
            protected String farebasis;
            @XmlElement(name = "BAGGAGE_ALLOWANCE")
            protected String baggageallowance;
            @XmlElement(name = "DISCOUNT_INDICATOR")
            protected Object discountindicator;
            @XmlElement(name = "TICKETING_STATUS")
            protected Object ticketingstatus;
            @XmlElement(name = "ROUTING")
            protected Object routing;
            @XmlElement(name = "CONNECTION_TYPE")
            protected Object connectiontype;
            @XmlElement(name = "COUPON_STATUS")
            protected String couponstatus;
            @XmlElement(name = "INVOLUNTARY_INDICATOR")
            protected String involuntaryindicator;
            @XmlElement(name = "SEGMENT_ID")
            protected Object segmentid;
            @XmlElement(name = "SEQUENCE_NUMBER")
            protected BigInteger sequencenumber;
            @XmlElement(name = "PNR_SEGMENT_ID")
            protected Object pnrsegmentid;
            @XmlAttribute(name = "isDeleted")
            protected String isDeleted;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMBER() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMBER(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the farefamily property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAREFAMILY() {
                return farefamily;
            }

            /**
             * Sets the value of the farefamily property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAREFAMILY(String value) {
                this.farefamily = value;
            }

            /**
             * Gets the value of the primarycode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRIMARYCODE() {
                return primarycode;
            }

            /**
             * Sets the value of the primarycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRIMARYCODE(String value) {
                this.primarycode = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMOUNT() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMOUNT(String value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURRENCY(String value) {
                this.currency = value;
            }

            /**
             * Gets the value of the nva property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNVA() {
                return nva;
            }

            /**
             * Sets the value of the nva property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNVA(String value) {
                this.nva = value;
            }

            /**
             * Gets the value of the nvb property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNVB() {
                return nvb;
            }

            /**
             * Sets the value of the nvb property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNVB(String value) {
                this.nvb = value;
            }

            /**
             * Gets the value of the farebasis property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAREBASIS() {
                return farebasis;
            }

            /**
             * Sets the value of the farebasis property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAREBASIS(String value) {
                this.farebasis = value;
            }

            /**
             * Gets the value of the baggageallowance property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBAGGAGEALLOWANCE() {
                return baggageallowance;
            }

            /**
             * Sets the value of the baggageallowance property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBAGGAGEALLOWANCE(String value) {
                this.baggageallowance = value;
            }

            /**
             * Gets the value of the discountindicator property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getDISCOUNTINDICATOR() {
                return discountindicator;
            }

            /**
             * Sets the value of the discountindicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setDISCOUNTINDICATOR(Object value) {
                this.discountindicator = value;
            }

            /**
             * Gets the value of the ticketingstatus property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTICKETINGSTATUS() {
                return ticketingstatus;
            }

            /**
             * Sets the value of the ticketingstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTICKETINGSTATUS(Object value) {
                this.ticketingstatus = value;
            }

            /**
             * Gets the value of the routing property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getROUTING() {
                return routing;
            }

            /**
             * Sets the value of the routing property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setROUTING(Object value) {
                this.routing = value;
            }

            /**
             * Gets the value of the connectiontype property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCONNECTIONTYPE() {
                return connectiontype;
            }

            /**
             * Sets the value of the connectiontype property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCONNECTIONTYPE(Object value) {
                this.connectiontype = value;
            }

            /**
             * Gets the value of the couponstatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUPONSTATUS() {
                return couponstatus;
            }

            /**
             * Sets the value of the couponstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUPONSTATUS(String value) {
                this.couponstatus = value;
            }

            /**
             * Gets the value of the involuntaryindicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINVOLUNTARYINDICATOR() {
                return involuntaryindicator;
            }

            /**
             * Sets the value of the involuntaryindicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINVOLUNTARYINDICATOR(String value) {
                this.involuntaryindicator = value;
            }

            /**
             * Gets the value of the segmentid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSEGMENTID() {
                return segmentid;
            }

            /**
             * Sets the value of the segmentid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSEGMENTID(Object value) {
                this.segmentid = value;
            }

            /**
             * Gets the value of the sequencenumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSEQUENCENUMBER() {
                return sequencenumber;
            }

            /**
             * Sets the value of the sequencenumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSEQUENCENUMBER(BigInteger value) {
                this.sequencenumber = value;
            }

            /**
             * Gets the value of the pnrsegmentid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPNRSEGMENTID() {
                return pnrsegmentid;
            }

            /**
             * Sets the value of the pnrsegmentid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPNRSEGMENTID(Object value) {
                this.pnrsegmentid = value;
            }

            /**
             * Gets the value of the isDeleted property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsDeleted() {
                return isDeleted;
            }

            /**
             * Sets the value of the isDeleted property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsDeleted(String value) {
                this.isDeleted = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;group ref="{}taxTotalGroup"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "currency",
            "totaltaxpaid",
            "totaltaxcredit",
            "totaltaxamount"
        })
        public static class LISTTAXTOTALBYCURRENCY
            implements Serializable
        {

            @XmlElement(name = "CURRENCY", required = true)
            protected Object currency;
            @XmlElement(name = "TOTAL_TAX_PAID")
            protected Object totaltaxpaid;
            @XmlElement(name = "TOTAL_TAX_CREDIT")
            protected Object totaltaxcredit;
            @XmlElement(name = "TOTAL_TAX_AMOUNT")
            protected Object totaltaxamount;

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCURRENCY(Object value) {
                this.currency = value;
            }

            /**
             * Gets the value of the totaltaxpaid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTOTALTAXPAID() {
                return totaltaxpaid;
            }

            /**
             * Sets the value of the totaltaxpaid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTOTALTAXPAID(Object value) {
                this.totaltaxpaid = value;
            }

            /**
             * Gets the value of the totaltaxcredit property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTOTALTAXCREDIT() {
                return totaltaxcredit;
            }

            /**
             * Sets the value of the totaltaxcredit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTOTALTAXCREDIT(Object value) {
                this.totaltaxcredit = value;
            }

            /**
             * Gets the value of the totaltaxamount property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTOTALTAXAMOUNT() {
                return totaltaxamount;
            }

            /**
             * Sets the value of the totaltaxamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTOTALTAXAMOUNT(Object value) {
                this.totaltaxamount = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TOUR_CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tourcode",
            "indicator"
        })
        public static class TOURINFORMATION
            implements Serializable
        {

            @XmlElement(name = "TOUR_CODE", required = true)
            protected String tourcode;
            @XmlElement(name = "INDICATOR")
            protected String indicator;

            /**
             * Gets the value of the tourcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOURCODE() {
                return tourcode;
            }

            /**
             * Sets the value of the tourcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOURCODE(String value) {
                this.tourcode = value;
            }

            /**
             * Gets the value of the indicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINDICATOR() {
                return indicator;
            }

            /**
             * Sets the value of the indicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINDICATOR(String value) {
                this.indicator = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TST_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MANUAL_AUTOMATIC_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERNATIONAL_SALE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LAST_TKT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FCMI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CREATION_INFO" type="{}UpdateInfoType" minOccurs="0"/&gt;
     *         &lt;element name="MODIFICATION_INFO" type="{}UpdateInfoType" minOccurs="0"/&gt;
     *         &lt;element name="IS_INTERNATIONAL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="IS_CHANGE_FLAG" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="IS_CONFIDENTIAL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="TICKET_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_PRICING_USE_CASE" type="{}pricingUseCaseType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_REDEMPTION_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tstnumber",
        "origin",
        "destination",
        "manualautomaticflag",
        "internationalsaleindicator",
        "lasttktdate",
        "fcmi",
        "creationinfo",
        "modificationinfo",
        "isinternational",
        "ischangeflag",
        "isconfidential",
        "tickettype",
        "listpricingusecase",
        "listredemptioninfo"
    })
    public static class GENERALDATA
        implements Serializable
    {

        @XmlElement(name = "TST_NUMBER")
        protected String tstnumber;
        @XmlElement(name = "ORIGIN")
        protected String origin;
        @XmlElement(name = "DESTINATION")
        protected String destination;
        @XmlElement(name = "MANUAL_AUTOMATIC_FLAG")
        protected String manualautomaticflag;
        @XmlElement(name = "INTERNATIONAL_SALE_INDICATOR")
        protected String internationalsaleindicator;
        @XmlElement(name = "LAST_TKT_DATE")
        protected String lasttktdate;
        @XmlElement(name = "FCMI")
        protected String fcmi;
        @XmlElement(name = "CREATION_INFO")
        protected UpdateInfoType creationinfo;
        @XmlElement(name = "MODIFICATION_INFO")
        protected UpdateInfoType modificationinfo;
        @XmlElement(name = "IS_INTERNATIONAL")
        protected Object isinternational;
        @XmlElement(name = "IS_CHANGE_FLAG")
        protected Object ischangeflag;
        @XmlElement(name = "IS_CONFIDENTIAL")
        protected Object isconfidential;
        @XmlElement(name = "TICKET_TYPE")
        protected Object tickettype;
        @XmlElement(name = "LIST_PRICING_USE_CASE")
        protected List<PricingUseCaseType> listpricingusecase;
        @XmlElement(name = "LIST_REDEMPTION_INFO")
        protected List<TicketType.GENERALDATA.LISTREDEMPTIONINFO> listredemptioninfo;

        /**
         * Gets the value of the tstnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTSTNUMBER() {
            return tstnumber;
        }

        /**
         * Sets the value of the tstnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTSTNUMBER(String value) {
            this.tstnumber = value;
        }

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORIGIN() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORIGIN(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESTINATION() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESTINATION(String value) {
            this.destination = value;
        }

        /**
         * Gets the value of the manualautomaticflag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMANUALAUTOMATICFLAG() {
            return manualautomaticflag;
        }

        /**
         * Sets the value of the manualautomaticflag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMANUALAUTOMATICFLAG(String value) {
            this.manualautomaticflag = value;
        }

        /**
         * Gets the value of the internationalsaleindicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERNATIONALSALEINDICATOR() {
            return internationalsaleindicator;
        }

        /**
         * Sets the value of the internationalsaleindicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERNATIONALSALEINDICATOR(String value) {
            this.internationalsaleindicator = value;
        }

        /**
         * Gets the value of the lasttktdate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTTKTDATE() {
            return lasttktdate;
        }

        /**
         * Sets the value of the lasttktdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTTKTDATE(String value) {
            this.lasttktdate = value;
        }

        /**
         * Gets the value of the fcmi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFCMI() {
            return fcmi;
        }

        /**
         * Sets the value of the fcmi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFCMI(String value) {
            this.fcmi = value;
        }

        /**
         * Gets the value of the creationinfo property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateInfoType }
         *     
         */
        public UpdateInfoType getCREATIONINFO() {
            return creationinfo;
        }

        /**
         * Sets the value of the creationinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateInfoType }
         *     
         */
        public void setCREATIONINFO(UpdateInfoType value) {
            this.creationinfo = value;
        }

        /**
         * Gets the value of the modificationinfo property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateInfoType }
         *     
         */
        public UpdateInfoType getMODIFICATIONINFO() {
            return modificationinfo;
        }

        /**
         * Sets the value of the modificationinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateInfoType }
         *     
         */
        public void setMODIFICATIONINFO(UpdateInfoType value) {
            this.modificationinfo = value;
        }

        /**
         * Gets the value of the isinternational property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getISINTERNATIONAL() {
            return isinternational;
        }

        /**
         * Sets the value of the isinternational property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setISINTERNATIONAL(Object value) {
            this.isinternational = value;
        }

        /**
         * Gets the value of the ischangeflag property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getISCHANGEFLAG() {
            return ischangeflag;
        }

        /**
         * Sets the value of the ischangeflag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setISCHANGEFLAG(Object value) {
            this.ischangeflag = value;
        }

        /**
         * Gets the value of the isconfidential property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getISCONFIDENTIAL() {
            return isconfidential;
        }

        /**
         * Sets the value of the isconfidential property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setISCONFIDENTIAL(Object value) {
            this.isconfidential = value;
        }

        /**
         * Gets the value of the tickettype property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTICKETTYPE() {
            return tickettype;
        }

        /**
         * Sets the value of the tickettype property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTICKETTYPE(Object value) {
            this.tickettype = value;
        }

        /**
         * Gets the value of the listpricingusecase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpricingusecase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPRICINGUSECASE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PricingUseCaseType }
         * 
         * 
         */
        public List<PricingUseCaseType> getLISTPRICINGUSECASE() {
            if (listpricingusecase == null) {
                listpricingusecase = new ArrayList<PricingUseCaseType>();
            }
            return this.listpricingusecase;
        }

        /**
         * Gets the value of the listredemptioninfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listredemptioninfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTREDEMPTIONINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketType.GENERALDATA.LISTREDEMPTIONINFO }
         * 
         * 
         */
        public List<TicketType.GENERALDATA.LISTREDEMPTIONINFO> getLISTREDEMPTIONINFO() {
            if (listredemptioninfo == null) {
                listredemptioninfo = new ArrayList<TicketType.GENERALDATA.LISTREDEMPTIONINFO>();
            }
            return this.listredemptioninfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type"
        })
        public static class LISTREDEMPTIONINFO
            implements Serializable
        {

            @XmlElement(name = "TYPE")
            protected String type;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LIST_REASON" type="{}reasonType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listreason"
    })
    public static class OVERRIDEREASON
        implements Serializable
    {

        @XmlElement(name = "LIST_REASON")
        protected List<ReasonType> listreason;

        /**
         * Gets the value of the listreason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listreason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTREASON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReasonType }
         * 
         * 
         */
        public List<ReasonType> getLISTREASON() {
            if (listreason == null) {
                listreason = new ArrayList<ReasonType>();
            }
            return this.listreason;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PASSENGERS" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="IS_TICKETED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="PNR_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ENDORSEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RESTRICTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="VALIDATING_CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COMMISSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_LINKED_FARE_ELEMENT" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_LINKED_FAFH" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_LINKED_TSM" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_LINKED_FO" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LINKED_PAYMENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passengers",
        "endorsement",
        "restrictions",
        "validatingcarrier",
        "commission",
        "listlinkedfareelement",
        "listlinkedfafh",
        "listlinkedtsm",
        "listlinkedfo",
        "linkedpayment"
    })
    public static class PNRDATA
        implements Serializable
    {

        @XmlElement(name = "PASSENGERS")
        protected List<TicketType.PNRDATA.PASSENGERS> passengers;
        @XmlElement(name = "ENDORSEMENT")
        protected String endorsement;
        @XmlElement(name = "RESTRICTIONS")
        protected String restrictions;
        @XmlElement(name = "VALIDATING_CARRIER")
        protected String validatingcarrier;
        @XmlElement(name = "COMMISSION")
        protected String commission;
        @XmlElement(name = "LIST_LINKED_FARE_ELEMENT")
        protected List<String> listlinkedfareelement;
        @XmlElement(name = "LIST_LINKED_FAFH")
        protected List<String> listlinkedfafh;
        @XmlElement(name = "LIST_LINKED_TSM")
        protected List<String> listlinkedtsm;
        @XmlElement(name = "LIST_LINKED_FO")
        protected List<Object> listlinkedfo;
        @XmlElement(name = "LINKED_PAYMENT")
        protected String linkedpayment;

        /**
         * Gets the value of the passengers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPASSENGERS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketType.PNRDATA.PASSENGERS }
         * 
         * 
         */
        public List<TicketType.PNRDATA.PASSENGERS> getPASSENGERS() {
            if (passengers == null) {
                passengers = new ArrayList<TicketType.PNRDATA.PASSENGERS>();
            }
            return this.passengers;
        }

        /**
         * Gets the value of the endorsement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getENDORSEMENT() {
            return endorsement;
        }

        /**
         * Sets the value of the endorsement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setENDORSEMENT(String value) {
            this.endorsement = value;
        }

        /**
         * Gets the value of the restrictions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRESTRICTIONS() {
            return restrictions;
        }

        /**
         * Sets the value of the restrictions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRESTRICTIONS(String value) {
            this.restrictions = value;
        }

        /**
         * Gets the value of the validatingcarrier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALIDATINGCARRIER() {
            return validatingcarrier;
        }

        /**
         * Sets the value of the validatingcarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVALIDATINGCARRIER(String value) {
            this.validatingcarrier = value;
        }

        /**
         * Gets the value of the commission property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMMISSION() {
            return commission;
        }

        /**
         * Sets the value of the commission property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMMISSION(String value) {
            this.commission = value;
        }

        /**
         * Gets the value of the listlinkedfareelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listlinkedfareelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTLINKEDFAREELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTLINKEDFAREELEMENT() {
            if (listlinkedfareelement == null) {
                listlinkedfareelement = new ArrayList<String>();
            }
            return this.listlinkedfareelement;
        }

        /**
         * Gets the value of the listlinkedfafh property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listlinkedfafh property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTLINKEDFAFH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTLINKEDFAFH() {
            if (listlinkedfafh == null) {
                listlinkedfafh = new ArrayList<String>();
            }
            return this.listlinkedfafh;
        }

        /**
         * Gets the value of the listlinkedtsm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listlinkedtsm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTLINKEDTSM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTLINKEDTSM() {
            if (listlinkedtsm == null) {
                listlinkedtsm = new ArrayList<String>();
            }
            return this.listlinkedtsm;
        }

        /**
         * Gets the value of the listlinkedfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listlinkedfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTLINKEDFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getLISTLINKEDFO() {
            if (listlinkedfo == null) {
                listlinkedfo = new ArrayList<Object>();
            }
            return this.listlinkedfo;
        }

        /**
         * Gets the value of the linkedpayment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKEDPAYMENT() {
            return linkedpayment;
        }

        /**
         * Sets the value of the linkedpayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKEDPAYMENT(String value) {
            this.linkedpayment = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="IS_TICKETED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="PNR_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type",
            "number",
            "passengerid",
            "isticketed",
            "pnrtravellerid"
        })
        public static class PASSENGERS
            implements Serializable
        {

            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "NUMBER")
            protected String number;
            @XmlElement(name = "PASSENGER_ID")
            protected BigInteger passengerid;
            @XmlElement(name = "IS_TICKETED")
            protected Object isticketed;
            @XmlElement(name = "PNR_TRAVELLER_ID")
            protected Object pnrtravellerid;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMBER() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMBER(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the passengerid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPASSENGERID() {
                return passengerid;
            }

            /**
             * Sets the value of the passengerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPASSENGERID(BigInteger value) {
                this.passengerid = value;
            }

            /**
             * Gets the value of the isticketed property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getISTICKETED() {
                return isticketed;
            }

            /**
             * Sets the value of the isticketed property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setISTICKETED(Object value) {
                this.isticketed = value;
            }

            /**
             * Gets the value of the pnrtravellerid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPNRTRAVELLERID() {
                return pnrtravellerid;
            }

            /**
             * Sets the value of the pnrtravellerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPNRTRAVELLERID(Object value) {
                this.pnrtravellerid = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OLD_AMOUNTS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BASE_FARE" type="{}amountType"/&gt;
     *                   &lt;element name="PUBLISHED_FARE" type="{}amountType" minOccurs="0"/&gt;
     *                   &lt;element name="NET_FARE" type="{}amountType" minOccurs="0"/&gt;
     *                   &lt;element name="DISCOUNT" type="{}amountType" minOccurs="0"/&gt;
     *                   &lt;element name="TAX" type="{}amountType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NEW_AMOUNTS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BASE_FARE" type="{}amountType"/&gt;
     *                   &lt;element name="PUBLISHED_FARE" type="{}amountType" minOccurs="0"/&gt;
     *                   &lt;element name="NET_FARE" type="{}amountType" minOccurs="0"/&gt;
     *                   &lt;element name="DISCOUNT" type="{}amountType" minOccurs="0"/&gt;
     *                   &lt;element name="TAX" type="{}amountType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FARE_BALANCE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BASE_FARE_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="PUBLISHED_FARE_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="NET_FARE_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="DISCOUNT_AMOUNT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="TAX_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="TOTAL_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="REFUND_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="REFUND" type="{}amountType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PENALTIES" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="REBOOKING_PENALTY" type="{}amountType" minOccurs="0"/&gt;
     *                   &lt;element name="NO_SHOW_FEE" type="{}amountType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TST_ADDITIONAL_COLLECTION" type="{}amountType"/&gt;
     *         &lt;element name="TOTAL_ADDITIONAL_COLLECTION" type="{}amountType"/&gt;
     *         &lt;element name="TOTAL" type="{}amountType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oldamounts",
        "newamounts",
        "farebalance",
        "refundinfo",
        "penalties",
        "tstadditionalcollection",
        "totaladditionalcollection",
        "total"
    })
    public static class REISSUEAMOUNTS
        implements Serializable
    {

        @XmlElement(name = "OLD_AMOUNTS", required = true)
        protected TicketType.REISSUEAMOUNTS.OLDAMOUNTS oldamounts;
        @XmlElement(name = "NEW_AMOUNTS", required = true)
        protected TicketType.REISSUEAMOUNTS.NEWAMOUNTS newamounts;
        @XmlElement(name = "FARE_BALANCE", required = true)
        protected TicketType.REISSUEAMOUNTS.FAREBALANCE farebalance;
        @XmlElement(name = "REFUND_INFO")
        protected TicketType.REISSUEAMOUNTS.REFUNDINFO refundinfo;
        @XmlElement(name = "PENALTIES")
        protected TicketType.REISSUEAMOUNTS.PENALTIES penalties;
        @XmlElement(name = "TST_ADDITIONAL_COLLECTION", required = true)
        protected com.koreanair.external.eretail.vo.common.common.AmountType tstadditionalcollection;
        @XmlElement(name = "TOTAL_ADDITIONAL_COLLECTION", required = true)
        protected com.koreanair.external.eretail.vo.common.common.AmountType totaladditionalcollection;
        @XmlElement(name = "TOTAL", required = true)
        protected com.koreanair.external.eretail.vo.common.common.AmountType total;

        /**
         * Gets the value of the oldamounts property.
         * 
         * @return
         *     possible object is
         *     {@link TicketType.REISSUEAMOUNTS.OLDAMOUNTS }
         *     
         */
        public TicketType.REISSUEAMOUNTS.OLDAMOUNTS getOLDAMOUNTS() {
            return oldamounts;
        }

        /**
         * Sets the value of the oldamounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketType.REISSUEAMOUNTS.OLDAMOUNTS }
         *     
         */
        public void setOLDAMOUNTS(TicketType.REISSUEAMOUNTS.OLDAMOUNTS value) {
            this.oldamounts = value;
        }

        /**
         * Gets the value of the newamounts property.
         * 
         * @return
         *     possible object is
         *     {@link TicketType.REISSUEAMOUNTS.NEWAMOUNTS }
         *     
         */
        public TicketType.REISSUEAMOUNTS.NEWAMOUNTS getNEWAMOUNTS() {
            return newamounts;
        }

        /**
         * Sets the value of the newamounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketType.REISSUEAMOUNTS.NEWAMOUNTS }
         *     
         */
        public void setNEWAMOUNTS(TicketType.REISSUEAMOUNTS.NEWAMOUNTS value) {
            this.newamounts = value;
        }

        /**
         * Gets the value of the farebalance property.
         * 
         * @return
         *     possible object is
         *     {@link TicketType.REISSUEAMOUNTS.FAREBALANCE }
         *     
         */
        public TicketType.REISSUEAMOUNTS.FAREBALANCE getFAREBALANCE() {
            return farebalance;
        }

        /**
         * Sets the value of the farebalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketType.REISSUEAMOUNTS.FAREBALANCE }
         *     
         */
        public void setFAREBALANCE(TicketType.REISSUEAMOUNTS.FAREBALANCE value) {
            this.farebalance = value;
        }

        /**
         * Gets the value of the refundinfo property.
         * 
         * @return
         *     possible object is
         *     {@link TicketType.REISSUEAMOUNTS.REFUNDINFO }
         *     
         */
        public TicketType.REISSUEAMOUNTS.REFUNDINFO getREFUNDINFO() {
            return refundinfo;
        }

        /**
         * Sets the value of the refundinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketType.REISSUEAMOUNTS.REFUNDINFO }
         *     
         */
        public void setREFUNDINFO(TicketType.REISSUEAMOUNTS.REFUNDINFO value) {
            this.refundinfo = value;
        }

        /**
         * Gets the value of the penalties property.
         * 
         * @return
         *     possible object is
         *     {@link TicketType.REISSUEAMOUNTS.PENALTIES }
         *     
         */
        public TicketType.REISSUEAMOUNTS.PENALTIES getPENALTIES() {
            return penalties;
        }

        /**
         * Sets the value of the penalties property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketType.REISSUEAMOUNTS.PENALTIES }
         *     
         */
        public void setPENALTIES(TicketType.REISSUEAMOUNTS.PENALTIES value) {
            this.penalties = value;
        }

        /**
         * Gets the value of the tstadditionalcollection property.
         * 
         * @return
         *     possible object is
         *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
         *     
         */
        public com.koreanair.external.eretail.vo.common.common.AmountType getTSTADDITIONALCOLLECTION() {
            return tstadditionalcollection;
        }

        /**
         * Sets the value of the tstadditionalcollection property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
         *     
         */
        public void setTSTADDITIONALCOLLECTION(com.koreanair.external.eretail.vo.common.common.AmountType value) {
            this.tstadditionalcollection = value;
        }

        /**
         * Gets the value of the totaladditionalcollection property.
         * 
         * @return
         *     possible object is
         *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
         *     
         */
        public com.koreanair.external.eretail.vo.common.common.AmountType getTOTALADDITIONALCOLLECTION() {
            return totaladditionalcollection;
        }

        /**
         * Sets the value of the totaladditionalcollection property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
         *     
         */
        public void setTOTALADDITIONALCOLLECTION(com.koreanair.external.eretail.vo.common.common.AmountType value) {
            this.totaladditionalcollection = value;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
         *     
         */
        public com.koreanair.external.eretail.vo.common.common.AmountType getTOTAL() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
         *     
         */
        public void setTOTAL(com.koreanair.external.eretail.vo.common.common.AmountType value) {
            this.total = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BASE_FARE_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *         &lt;element name="PUBLISHED_FARE_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="NET_FARE_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="DISCOUNT_AMOUNT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="TAX_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *         &lt;element name="TOTAL_BALANCE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "basefarebalance",
            "publishedfarebalance",
            "netfarebalance",
            "discountamountbalance",
            "taxbalance",
            "totalbalance",
            "currency"
        })
        public static class FAREBALANCE
            implements Serializable
        {

            @XmlElement(name = "BASE_FARE_BALANCE")
            protected double basefarebalance;
            @XmlElement(name = "PUBLISHED_FARE_BALANCE")
            protected Double publishedfarebalance;
            @XmlElement(name = "NET_FARE_BALANCE")
            protected Double netfarebalance;
            @XmlElement(name = "DISCOUNT_AMOUNT_BALANCE")
            protected Double discountamountbalance;
            @XmlElement(name = "TAX_BALANCE")
            protected double taxbalance;
            @XmlElement(name = "TOTAL_BALANCE")
            protected double totalbalance;
            @XmlElement(name = "CURRENCY", required = true)
            protected CurrencyType currency;

            /**
             * Gets the value of the basefarebalance property.
             * 
             */
            public double getBASEFAREBALANCE() {
                return basefarebalance;
            }

            /**
             * Sets the value of the basefarebalance property.
             * 
             */
            public void setBASEFAREBALANCE(double value) {
                this.basefarebalance = value;
            }

            /**
             * Gets the value of the publishedfarebalance property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getPUBLISHEDFAREBALANCE() {
                return publishedfarebalance;
            }

            /**
             * Sets the value of the publishedfarebalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setPUBLISHEDFAREBALANCE(Double value) {
                this.publishedfarebalance = value;
            }

            /**
             * Gets the value of the netfarebalance property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getNETFAREBALANCE() {
                return netfarebalance;
            }

            /**
             * Sets the value of the netfarebalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setNETFAREBALANCE(Double value) {
                this.netfarebalance = value;
            }

            /**
             * Gets the value of the discountamountbalance property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getDISCOUNTAMOUNTBALANCE() {
                return discountamountbalance;
            }

            /**
             * Sets the value of the discountamountbalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setDISCOUNTAMOUNTBALANCE(Double value) {
                this.discountamountbalance = value;
            }

            /**
             * Gets the value of the taxbalance property.
             * 
             */
            public double getTAXBALANCE() {
                return taxbalance;
            }

            /**
             * Sets the value of the taxbalance property.
             * 
             */
            public void setTAXBALANCE(double value) {
                this.taxbalance = value;
            }

            /**
             * Gets the value of the totalbalance property.
             * 
             */
            public double getTOTALBALANCE() {
                return totalbalance;
            }

            /**
             * Sets the value of the totalbalance property.
             * 
             */
            public void setTOTALBALANCE(double value) {
                this.totalbalance = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyType }
             *     
             */
            public CurrencyType getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyType }
             *     
             */
            public void setCURRENCY(CurrencyType value) {
                this.currency = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BASE_FARE" type="{}amountType"/&gt;
         *         &lt;element name="PUBLISHED_FARE" type="{}amountType" minOccurs="0"/&gt;
         *         &lt;element name="NET_FARE" type="{}amountType" minOccurs="0"/&gt;
         *         &lt;element name="DISCOUNT" type="{}amountType" minOccurs="0"/&gt;
         *         &lt;element name="TAX" type="{}amountType"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "basefare",
            "publishedfare",
            "netfare",
            "discount",
            "tax"
        })
        public static class NEWAMOUNTS
            implements Serializable
        {

            @XmlElement(name = "BASE_FARE", required = true)
            protected com.koreanair.external.eretail.vo.common.common.AmountType basefare;
            @XmlElement(name = "PUBLISHED_FARE")
            protected com.koreanair.external.eretail.vo.common.common.AmountType publishedfare;
            @XmlElement(name = "NET_FARE")
            protected com.koreanair.external.eretail.vo.common.common.AmountType netfare;
            @XmlElement(name = "DISCOUNT")
            protected com.koreanair.external.eretail.vo.common.common.AmountType discount;
            @XmlElement(name = "TAX", required = true)
            protected com.koreanair.external.eretail.vo.common.common.AmountType tax;

            /**
             * Gets the value of the basefare property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getBASEFARE() {
                return basefare;
            }

            /**
             * Sets the value of the basefare property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setBASEFARE(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.basefare = value;
            }

            /**
             * Gets the value of the publishedfare property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getPUBLISHEDFARE() {
                return publishedfare;
            }

            /**
             * Sets the value of the publishedfare property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setPUBLISHEDFARE(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.publishedfare = value;
            }

            /**
             * Gets the value of the netfare property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getNETFARE() {
                return netfare;
            }

            /**
             * Sets the value of the netfare property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setNETFARE(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.netfare = value;
            }

            /**
             * Gets the value of the discount property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getDISCOUNT() {
                return discount;
            }

            /**
             * Sets the value of the discount property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setDISCOUNT(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.discount = value;
            }

            /**
             * Gets the value of the tax property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getTAX() {
                return tax;
            }

            /**
             * Sets the value of the tax property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setTAX(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.tax = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BASE_FARE" type="{}amountType"/&gt;
         *         &lt;element name="PUBLISHED_FARE" type="{}amountType" minOccurs="0"/&gt;
         *         &lt;element name="NET_FARE" type="{}amountType" minOccurs="0"/&gt;
         *         &lt;element name="DISCOUNT" type="{}amountType" minOccurs="0"/&gt;
         *         &lt;element name="TAX" type="{}amountType"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "basefare",
            "publishedfare",
            "netfare",
            "discount",
            "tax"
        })
        public static class OLDAMOUNTS
            implements Serializable
        {

            @XmlElement(name = "BASE_FARE", required = true)
            protected com.koreanair.external.eretail.vo.common.common.AmountType basefare;
            @XmlElement(name = "PUBLISHED_FARE")
            protected com.koreanair.external.eretail.vo.common.common.AmountType publishedfare;
            @XmlElement(name = "NET_FARE")
            protected com.koreanair.external.eretail.vo.common.common.AmountType netfare;
            @XmlElement(name = "DISCOUNT")
            protected com.koreanair.external.eretail.vo.common.common.AmountType discount;
            @XmlElement(name = "TAX", required = true)
            protected com.koreanair.external.eretail.vo.common.common.AmountType tax;

            /**
             * Gets the value of the basefare property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getBASEFARE() {
                return basefare;
            }

            /**
             * Sets the value of the basefare property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setBASEFARE(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.basefare = value;
            }

            /**
             * Gets the value of the publishedfare property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getPUBLISHEDFARE() {
                return publishedfare;
            }

            /**
             * Sets the value of the publishedfare property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setPUBLISHEDFARE(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.publishedfare = value;
            }

            /**
             * Gets the value of the netfare property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getNETFARE() {
                return netfare;
            }

            /**
             * Sets the value of the netfare property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setNETFARE(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.netfare = value;
            }

            /**
             * Gets the value of the discount property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getDISCOUNT() {
                return discount;
            }

            /**
             * Sets the value of the discount property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setDISCOUNT(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.discount = value;
            }

            /**
             * Gets the value of the tax property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getTAX() {
                return tax;
            }

            /**
             * Sets the value of the tax property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setTAX(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.tax = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="REBOOKING_PENALTY" type="{}amountType" minOccurs="0"/&gt;
         *         &lt;element name="NO_SHOW_FEE" type="{}amountType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rebookingpenalty",
            "noshowfee"
        })
        public static class PENALTIES
            implements Serializable
        {

            @XmlElement(name = "REBOOKING_PENALTY")
            protected com.koreanair.external.eretail.vo.common.common.AmountType rebookingpenalty;
            @XmlElement(name = "NO_SHOW_FEE")
            protected com.koreanair.external.eretail.vo.common.common.AmountType noshowfee;

            /**
             * Gets the value of the rebookingpenalty property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getREBOOKINGPENALTY() {
                return rebookingpenalty;
            }

            /**
             * Sets the value of the rebookingpenalty property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setREBOOKINGPENALTY(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.rebookingpenalty = value;
            }

            /**
             * Gets the value of the noshowfee property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getNOSHOWFEE() {
                return noshowfee;
            }

            /**
             * Sets the value of the noshowfee property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setNOSHOWFEE(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.noshowfee = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="REFUND" type="{}amountType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "refund"
        })
        public static class REFUNDINFO
            implements Serializable
        {

            @XmlElement(name = "REFUND")
            protected com.koreanair.external.eretail.vo.common.common.AmountType refund;

            /**
             * Gets the value of the refund property.
             * 
             * @return
             *     possible object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public com.koreanair.external.eretail.vo.common.common.AmountType getREFUND() {
                return refund;
            }

            /**
             * Sets the value of the refund property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.koreanair.external.eretail.vo.common.common.AmountType }
             *     
             */
            public void setREFUND(com.koreanair.external.eretail.vo.common.common.AmountType value) {
                this.refund = value;
            }

        }

    }

}
