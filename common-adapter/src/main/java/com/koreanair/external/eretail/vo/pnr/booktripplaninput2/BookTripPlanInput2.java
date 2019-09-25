
package com.koreanair.external.eretail.vo.pnr.booktripplaninput2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.bookinginformation.booking_channel.BOOKINGCHANNELType;
import com.koreanair.external.eretail.vo.common.common.CurrencyType;
import com.koreanair.external.eretail.vo.common.common.ElementType;
import com.koreanair.external.eretail.vo.common.common.TRAVELAPPROVER1;
import com.koreanair.external.eretail.vo.payment.amopconfirmation.AMOPCONFIRMATIONType;
import com.koreanair.external.eretail.vo.payment.frauddatadetails.FRAUDDATAType;
import com.koreanair.external.eretail.vo.pnr.common.PARAMETERIDType;
import com.koreanair.external.eretail.vo.pnr.commonproductselection.SelectInsurancePricingType;
import com.koreanair.external.eretail.vo.pnr.listelementtoadd.ListElementToAddType;
import com.koreanair.external.eretail.vo.tripplan.common.common_price.AMOUNTBREAKDOWN;
import com.koreanair.external.eretail.vo.tripplan.common.common_price.AMOUNTSINTEGERTYPE;
import com.koreanair.external.eretail.vo.tripplan.common.common_price.AMOUNTSTYPE;
import com.koreanair.external.eretail.vo.tripplan.contact.CONTACT;
import com.koreanair.external.eretail.vo.tripplan.loyalty_card.LOYALTYCARD;
import com.koreanair.external.eretail.vo.tripplan.payment_group.PAYMENTGROUPType;
import com.koreanair.external.eretail.vo.tripplan.traveller_information.TRAVELLERINFORMATION;
import org.w3c.dom.Element;


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
 *         &lt;element name="IS_STRUCTURED_XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IS_PREPAYMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANSACTION_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="SITE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LANGUAGE" type="{}unprotectedStringType"/&gt;
 *         &lt;element ref="{}PAGE_TICKET" minOccurs="0"/&gt;
 *         &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PARENT_REC_LOC" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TYPE" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENT_TO_ADD" type="{}ListElementToAddType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENT_TO_REMOVE" type="{}elementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_OF_FARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_OF_BACKUP_FARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_PARAMETER" type="{}PARAMETER_ID_Type" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_BACKUP_PARAMETER" type="{}PARAMETER_ID_Type" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="FARE_COMMAND_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BACKUP_FARE_COMMAND_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FORCE_PTC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ACCEPT_PRICE_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ACCEPT_SERVICE_FEE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BOOL_BOOK_SEATS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TRIP_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_INFORMATION" type="{}TRAVELLER_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="DD_CC_NUMBER_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_EXP_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_TYPE_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_ID_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_NAME_ON_CARD_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_START_DATE_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_ISSUE_NUMBER_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_DATE_OF_BIRTH_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_DIGIT_CODE_CC_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_TOBE_STORED_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_TOBE_DELETED_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_NUMBER_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_EXP_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_TYPE_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_ID_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_NAME_ON_CARD_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_START_DATE_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_ISSUE_NUMBER_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_DATE_OF_BIRTH_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_DIGIT_CODE_CC_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_TOBE_STORED_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_TOBE_DELETED_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_NUMBER_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_EXP_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_TYPE_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_ID_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_NAME_ON_CARD_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_START_DATE_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_ISSUE_NUMBER_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_DATE_OF_BIRTH_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_DIGIT_CODE_CC_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_TOBE_STORED_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DD_CC_TOBE_DELETED_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}PAYMENT_GROUP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="AMOP_CONFIRMATION" type="{}AMOP_CONFIRMATION_Type" minOccurs="0"/&gt;
 *                   &lt;element name="FRAUD_DATA" type="{}FRAUD_DATA_Type" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMENT_PROVIDER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DONATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{}DonationStatusGroup" minOccurs="0"/&gt;
 *                   &lt;group ref="{}DonationGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;group ref="{}OBFEE_SUBTYPES" minOccurs="0"/&gt;
 *         &lt;element ref="{}CONTACT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LOYALTY_CARD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="REGISTER_START_OVER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DISABLE_GETTRIPPLAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_BILLING_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_VOUCHER_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_VOUCHER_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_VOUCHER_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_ISSUE_EVOUCHER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CAR_BOOKING_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_SPECIAL_EQUIPMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="CAR_ACCEPT_ON_REQUEST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CAR_POWERED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NICKNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAVEL_APPROVER" type="{}TRAVEL_APPROVER_1" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_CARD_FEE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="WEB_FARE_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AH_IATA_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AH_SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonInputGroup"/&gt;
 *         &lt;element name="ORIGIN_SITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_INSURANCE_DATE_OF_BIRTH" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="BOOL_IS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_INSURANCE_PRICING_PER_PRODUCT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PROVIDER"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PRODUCT"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="EXTENSION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLAN_COST_INFO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BOOL_IS_DEFAULT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TRAVELLER_PRICE" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LIST_COVERED_TRAVELLER" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                       &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="BASE_URL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DCC_TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCC_SELECTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCC_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCC_CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCC_EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROMOTION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_PROMOTION_CODE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DO_NOT_APPLY_BOOKING_FEE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INS_PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AIR_ASN_BANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AIR_ASN_BANK_PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INS_ASN_BANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INS_ASN_BANK_PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BANK_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_VENDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXT_PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CANCELLATION_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONFIRMATION_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYPALORDERDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AIRLINE_FEE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="SUBTYPE" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KEEPALIVESESSION_URL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AIR_CC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AIR_CC_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AIR_CC_DIGIT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AIR_CC_EXP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AIR_CC_NAME_ON_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaRes" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;group ref="{}XSellDirectAddFromTeaserGroup" minOccurs="0"/&gt;
 *         &lt;group ref="{}TravellerAssociationInput" minOccurs="0"/&gt;
 *         &lt;element name="MILES_AND_CASH_COST" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice minOccurs="0"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;group ref="{}LegacyMilesAndCash"/&gt;
 *                       &lt;group ref="{}AwardMileAndCash"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/choice&gt;
 *                   &lt;group ref="{}Currency"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MILESANDCASH_CONVERTED_CASH_MILES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MILESANDCASH_MINIMUM_MILES_COST" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MILESANDCASH_NON_CONVERTED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="USE_FOP_CATALOG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TIME_TO_THINK_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_CHANNEL" type="{}BOOKING_CHANNELType" minOccurs="0"/&gt;
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isstructuredxml",
    "isprepayment",
    "transactionid",
    "site",
    "language",
    "pageticket",
    "action",
    "parentrecloc",
    "type",
    "listtype",
    "listelementtoadd",
    "listelementtoremove",
    "typeoffare",
    "typeofbackupfare",
    "listfareparameter",
    "listfarebackupparameter",
    "farecommandid",
    "backupfarecommandid",
    "forceptc",
    "acceptpricechange",
    "acceptservicefee",
    "boolbookseats",
    "triptype",
    "travellerinformation",
    "ddccnumber1",
    "ddccexp1",
    "ddcctype1",
    "ddccid1",
    "ddccnameoncard1",
    "ddccstartdate1",
    "ddccissuenumber1",
    "ddccdateofbirth1",
    "ddccdigitcodecc1",
    "ddcctobestored1",
    "ddcctobedeleted1",
    "ddccnumber2",
    "ddccexp2",
    "ddcctype2",
    "ddccid2",
    "ddccnameoncard2",
    "ddccstartdate2",
    "ddccissuenumber2",
    "ddccdateofbirth2",
    "ddccdigitcodecc2",
    "ddcctobestored2",
    "ddcctobedeleted2",
    "ddccnumber3",
    "ddccexp3",
    "ddcctype3",
    "ddccid3",
    "ddccnameoncard3",
    "ddccstartdate3",
    "ddccissuenumber3",
    "ddccdateofbirth3",
    "ddccdigitcodecc3",
    "ddcctobestored3",
    "ddcctobedeleted3",
    "paymentgroup",
    "payment",
    "donation",
    "listincludedsubtypes",
    "listexcludedsubtypes",
    "excludeall",
    "contact",
    "loyaltycard",
    "registerstartover",
    "disablegettripplan",
    "hotelremark",
    "carremark",
    "carairlinecode",
    "carbillingnumber",
    "carvouchervalue",
    "carvoucheramount",
    "carvouchercurrency",
    "carissueevoucher",
    "carbookingsource",
    "carflightnumber",
    "carspecialequipment",
    "caracceptonrequest",
    "carpowered",
    "nickname",
    "travelapprover",
    "paymentcardfee",
    "webfarediscount",
    "ahiatanumber",
    "ahsourcecode",
    "listexternalid",
    "frompage",
    "requestinfo",
    "cleanoverrideonsiteswitch",
    "apischeckview",
    "apischeckcategory",
    "apischeckmandatory",
    "apischeckoptional",
    "apischeckstructure",
    "apischeckstructurepassenger",
    "originsite",
    "listinsurancedateofbirth",
    "listinsurancepricingperproduct",
    "baseurl",
    "dcctransactionid",
    "dccid",
    "dccselected",
    "dccamount",
    "dcccurrencycode",
    "dccexchangerate",
    "promotion",
    "donotapplybookingfee",
    "paymenttype",
    "inspaymenttype",
    "airasnbank",
    "airasnbankprovider",
    "insasnbank",
    "insasnbankprovider",
    "bankaccountid",
    "documenttype",
    "documentvendor",
    "documentnumber",
    "extpaymenttype",
    "cancellationurl",
    "confirmationurl",
    "paypalorderdescription",
    "token",
    "status",
    "listairlinefee",
    "keepalivesessionurl",
    "aircctype",
    "airccnumber",
    "airccdigitcode",
    "airccexp",
    "airccnameoncard",
    "ccid",
    "paRes",
    "crosssellpaneltype",
    "crosssellpanelid",
    "row",
    "subrow",
    "carrequestid",
    "listselectedinsuranceproducts",
    "associatedtravellerfirstname",
    "associatedtravellerlastname",
    "travellerassociation",
    "milesandcashcost",
    "milesandcashconvertedcashmiles",
    "milesandcashminimummilescost",
    "milesandcashnonconvertedamount",
    "usefopcatalog",
    "timetothinkid",
    "bookingchannel",
    "any"
})
@XmlRootElement(name = "BookTripPlanInput2")
public class BookTripPlanInput2
    implements Serializable
{

    @XmlElement(name = "IS_STRUCTURED_XML")
    protected String isstructuredxml;
    @XmlElement(name = "IS_PREPAYMENT")
    protected String isprepayment;
    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "ACTION")
    protected String action;
    @XmlElement(name = "PARENT_REC_LOC")
    protected String parentrecloc;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "LIST_TYPE")
    protected List<String> listtype;
    @XmlElement(name = "LIST_ELEMENT_TO_ADD")
    protected List<ListElementToAddType> listelementtoadd;
    @XmlElement(name = "LIST_ELEMENT_TO_REMOVE")
    protected List<ElementType> listelementtoremove;
    @XmlElement(name = "TYPE_OF_FARE")
    protected String typeoffare;
    @XmlElement(name = "TYPE_OF_BACKUP_FARE")
    protected String typeofbackupfare;
    @XmlElement(name = "LIST_FARE_PARAMETER")
    protected List<PARAMETERIDType> listfareparameter;
    @XmlElement(name = "LIST_FARE_BACKUP_PARAMETER")
    protected List<PARAMETERIDType> listfarebackupparameter;
    @XmlElement(name = "FARE_COMMAND_ID")
    protected String farecommandid;
    @XmlElement(name = "BACKUP_FARE_COMMAND_ID")
    protected String backupfarecommandid;
    @XmlElement(name = "FORCE_PTC")
    protected Boolean forceptc;
    @XmlElement(name = "ACCEPT_PRICE_CHANGE", defaultValue = "true")
    protected Boolean acceptpricechange;
    @XmlElement(name = "ACCEPT_SERVICE_FEE")
    protected Boolean acceptservicefee;
    @XmlElement(name = "BOOL_BOOK_SEATS", defaultValue = "false")
    protected Boolean boolbookseats;
    @XmlElement(name = "TRIP_TYPE")
    protected String triptype;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "DD_CC_NUMBER_1")
    protected String ddccnumber1;
    @XmlElement(name = "DD_CC_EXP_1")
    protected String ddccexp1;
    @XmlElement(name = "DD_CC_TYPE_1")
    protected String ddcctype1;
    @XmlElement(name = "DD_CC_ID_1")
    protected String ddccid1;
    @XmlElement(name = "DD_CC_NAME_ON_CARD_1")
    protected String ddccnameoncard1;
    @XmlElement(name = "DD_CC_START_DATE_1")
    protected String ddccstartdate1;
    @XmlElement(name = "DD_CC_ISSUE_NUMBER_1")
    protected String ddccissuenumber1;
    @XmlElement(name = "DD_CC_DATE_OF_BIRTH_1")
    protected String ddccdateofbirth1;
    @XmlElement(name = "DD_CC_DIGIT_CODE_CC_1")
    protected String ddccdigitcodecc1;
    @XmlElement(name = "DD_CC_TOBE_STORED_1")
    protected String ddcctobestored1;
    @XmlElement(name = "DD_CC_TOBE_DELETED_1")
    protected String ddcctobedeleted1;
    @XmlElement(name = "DD_CC_NUMBER_2")
    protected String ddccnumber2;
    @XmlElement(name = "DD_CC_EXP_2")
    protected String ddccexp2;
    @XmlElement(name = "DD_CC_TYPE_2")
    protected String ddcctype2;
    @XmlElement(name = "DD_CC_ID_2")
    protected String ddccid2;
    @XmlElement(name = "DD_CC_NAME_ON_CARD_2")
    protected String ddccnameoncard2;
    @XmlElement(name = "DD_CC_START_DATE_2")
    protected String ddccstartdate2;
    @XmlElement(name = "DD_CC_ISSUE_NUMBER_2")
    protected String ddccissuenumber2;
    @XmlElement(name = "DD_CC_DATE_OF_BIRTH_2")
    protected String ddccdateofbirth2;
    @XmlElement(name = "DD_CC_DIGIT_CODE_CC_2")
    protected String ddccdigitcodecc2;
    @XmlElement(name = "DD_CC_TOBE_STORED_2")
    protected String ddcctobestored2;
    @XmlElement(name = "DD_CC_TOBE_DELETED_2")
    protected String ddcctobedeleted2;
    @XmlElement(name = "DD_CC_NUMBER_3")
    protected String ddccnumber3;
    @XmlElement(name = "DD_CC_EXP_3")
    protected String ddccexp3;
    @XmlElement(name = "DD_CC_TYPE_3")
    protected String ddcctype3;
    @XmlElement(name = "DD_CC_ID_3")
    protected String ddccid3;
    @XmlElement(name = "DD_CC_NAME_ON_CARD_3")
    protected String ddccnameoncard3;
    @XmlElement(name = "DD_CC_START_DATE_3")
    protected String ddccstartdate3;
    @XmlElement(name = "DD_CC_ISSUE_NUMBER_3")
    protected String ddccissuenumber3;
    @XmlElement(name = "DD_CC_DATE_OF_BIRTH_3")
    protected String ddccdateofbirth3;
    @XmlElement(name = "DD_CC_DIGIT_CODE_CC_3")
    protected String ddccdigitcodecc3;
    @XmlElement(name = "DD_CC_TOBE_STORED_3")
    protected String ddcctobestored3;
    @XmlElement(name = "DD_CC_TOBE_DELETED_3")
    protected String ddcctobedeleted3;
    @XmlElement(name = "PAYMENT_GROUP")
    protected List<PAYMENTGROUPType> paymentgroup;
    @XmlElement(name = "PAYMENT")
    protected BookTripPlanInput2 .PAYMENT payment;
    @XmlElement(name = "DONATION")
    protected List<BookTripPlanInput2 .DONATION> donation;
    @XmlElement(name = "LIST_INCLUDED_SUBTYPES")
    protected List<String> listincludedsubtypes;
    @XmlElement(name = "LIST_EXCLUDED_SUBTYPES")
    protected List<String> listexcludedsubtypes;
    @XmlElement(name = "EXCLUDE_ALL")
    protected Boolean excludeall;
    @XmlElement(name = "CONTACT")
    protected List<CONTACT> contact;
    @XmlElement(name = "LOYALTY_CARD")
    protected List<LOYALTYCARD> loyaltycard;
    @XmlElement(name = "REGISTER_START_OVER")
    protected Boolean registerstartover;
    @XmlElement(name = "DISABLE_GETTRIPPLAN")
    protected Boolean disablegettripplan;
    @XmlElement(name = "HOTEL_REMARK")
    protected String hotelremark;
    @XmlElement(name = "CAR_REMARK")
    protected String carremark;
    @XmlElement(name = "CAR_AIRLINE_CODE")
    protected String carairlinecode;
    @XmlElement(name = "CAR_BILLING_NUMBER")
    protected String carbillingnumber;
    @XmlElement(name = "CAR_VOUCHER_VALUE")
    protected String carvouchervalue;
    @XmlElement(name = "CAR_VOUCHER_AMOUNT")
    protected String carvoucheramount;
    @XmlElement(name = "CAR_VOUCHER_CURRENCY")
    protected String carvouchercurrency;
    @XmlElement(name = "CAR_ISSUE_EVOUCHER")
    protected Boolean carissueevoucher;
    @XmlElement(name = "CAR_BOOKING_SOURCE")
    protected String carbookingsource;
    @XmlElement(name = "CAR_FLIGHT_NUMBER")
    protected String carflightnumber;
    @XmlElement(name = "CAR_SPECIAL_EQUIPMENT")
    protected List<String> carspecialequipment;
    @XmlElement(name = "CAR_ACCEPT_ON_REQUEST")
    protected Boolean caracceptonrequest;
    @XmlElement(name = "CAR_POWERED")
    protected Boolean carpowered;
    @XmlElement(name = "NICKNAME")
    protected String nickname;
    @XmlElement(name = "TRAVEL_APPROVER")
    protected TRAVELAPPROVER1 travelapprover;
    @XmlElement(name = "PAYMENT_CARD_FEE")
    protected Float paymentcardfee;
    @XmlElement(name = "WEB_FARE_DISCOUNT")
    protected Float webfarediscount;
    @XmlElement(name = "AH_IATA_NUMBER")
    protected String ahiatanumber;
    @XmlElement(name = "AH_SOURCE_CODE")
    protected String ahsourcecode;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected BookTripPlanInput2 .REQUESTINFO requestinfo;
    @XmlElement(name = "CLEAN_OVERRIDE_ON_SITE_SWITCH")
    protected Boolean cleanoverrideonsiteswitch;
    @XmlElement(name = "APIS_CHECK_VIEW")
    protected Object apischeckview;
    @XmlElement(name = "APIS_CHECK_CATEGORY")
    protected Object apischeckcategory;
    @XmlElement(name = "APIS_CHECK_MANDATORY")
    protected Object apischeckmandatory;
    @XmlElement(name = "APIS_CHECK_OPTIONAL")
    protected Object apischeckoptional;
    @XmlElement(name = "APIS_CHECK_STRUCTURE")
    protected Object apischeckstructure;
    @XmlElement(name = "APIS_CHECK_STRUCTURE_PASSENGER")
    protected List<BookTripPlanInput2 .APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
    @XmlElement(name = "ORIGIN_SITE")
    protected String originsite;
    @XmlElement(name = "LIST_INSURANCE_DATE_OF_BIRTH")
    protected List<BookTripPlanInput2 .LISTINSURANCEDATEOFBIRTH> listinsurancedateofbirth;
    @XmlElement(name = "LIST_INSURANCE_PRICING_PER_PRODUCT")
    protected List<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT> listinsurancepricingperproduct;
    @XmlElement(name = "BASE_URL")
    protected Object baseurl;
    @XmlElement(name = "DCC_TRANSACTION_ID")
    protected String dcctransactionid;
    @XmlElement(name = "DCC_ID")
    protected String dccid;
    @XmlElement(name = "DCC_SELECTED")
    protected String dccselected;
    @XmlElement(name = "DCC_AMOUNT")
    protected String dccamount;
    @XmlElement(name = "DCC_CURRENCY_CODE")
    protected String dcccurrencycode;
    @XmlElement(name = "DCC_EXCHANGE_RATE")
    protected String dccexchangerate;
    @XmlElement(name = "PROMOTION")
    protected BookTripPlanInput2 .PROMOTION promotion;
    @XmlElement(name = "DO_NOT_APPLY_BOOKING_FEE")
    protected Boolean donotapplybookingfee;
    @XmlElement(name = "PAYMENT_TYPE")
    protected String paymenttype;
    @XmlElement(name = "INS_PAYMENT_TYPE")
    protected String inspaymenttype;
    @XmlElement(name = "AIR_ASN_BANK")
    protected String airasnbank;
    @XmlElement(name = "AIR_ASN_BANK_PROVIDER")
    protected String airasnbankprovider;
    @XmlElement(name = "INS_ASN_BANK")
    protected String insasnbank;
    @XmlElement(name = "INS_ASN_BANK_PROVIDER")
    protected String insasnbankprovider;
    @XmlElement(name = "BANK_ACCOUNT_ID")
    protected String bankaccountid;
    @XmlElement(name = "DOCUMENT_TYPE")
    protected String documenttype;
    @XmlElement(name = "DOCUMENT_VENDOR")
    protected String documentvendor;
    @XmlElement(name = "DOCUMENT_NUMBER")
    protected String documentnumber;
    @XmlElement(name = "EXT_PAYMENT_TYPE")
    protected String extpaymenttype;
    @XmlElement(name = "CANCELLATION_URL")
    protected String cancellationurl;
    @XmlElement(name = "CONFIRMATION_URL")
    protected String confirmationurl;
    @XmlElement(name = "PAYPALORDERDESCRIPTION")
    protected String paypalorderdescription;
    protected String token;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "LIST_AIRLINE_FEE")
    protected List<BookTripPlanInput2 .LISTAIRLINEFEE> listairlinefee;
    @XmlElement(name = "KEEPALIVESESSION_URL")
    protected Object keepalivesessionurl;
    @XmlElement(name = "AIR_CC_TYPE")
    protected String aircctype;
    @XmlElement(name = "AIR_CC_NUMBER")
    protected String airccnumber;
    @XmlElement(name = "AIR_CC_DIGIT_CODE")
    protected String airccdigitcode;
    @XmlElement(name = "AIR_CC_EXP")
    protected String airccexp;
    @XmlElement(name = "AIR_CC_NAME_ON_CARD")
    protected String airccnameoncard;
    @XmlElement(name = "CC_ID")
    protected String ccid;
    @XmlElement(name = "PaRes")
    protected String paRes;
    @XmlElement(name = "CROSS_SELL_PANEL_TYPE")
    protected String crosssellpaneltype;
    @XmlElement(name = "CROSS_SELL_PANEL_ID")
    protected BigInteger crosssellpanelid;
    @XmlElement(name = "ROW")
    protected BigInteger row;
    @XmlElement(name = "SUB_ROW")
    protected BigInteger subrow;
    @XmlElement(name = "CAR_REQUEST_ID")
    protected BigInteger carrequestid;
    @XmlElement(name = "LIST_SELECTED_INSURANCE_PRODUCTS")
    protected List<SelectInsurancePricingType> listselectedinsuranceproducts;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_FIRST_NAME")
    protected String associatedtravellerfirstname;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_LAST_NAME")
    protected String associatedtravellerlastname;
    @XmlElement(name = "TRAVELLER_ASSOCIATION")
    protected List<BookTripPlanInput2 .TRAVELLERASSOCIATION> travellerassociation;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected BookTripPlanInput2 .MILESANDCASHCOST milesandcashcost;
    @XmlElement(name = "MILESANDCASH_CONVERTED_CASH_MILES")
    protected Object milesandcashconvertedcashmiles;
    @XmlElement(name = "MILESANDCASH_MINIMUM_MILES_COST")
    protected Object milesandcashminimummilescost;
    @XmlElement(name = "MILESANDCASH_NON_CONVERTED_AMOUNT")
    protected Object milesandcashnonconvertedamount;
    @XmlElement(name = "USE_FOP_CATALOG")
    protected Boolean usefopcatalog;
    @XmlElement(name = "TIME_TO_THINK_ID")
    protected String timetothinkid;
    @XmlElement(name = "BOOKING_CHANNEL")
    protected BOOKINGCHANNELType bookingchannel;
    @XmlAnyElement
    protected List<Element> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the isstructuredxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSTRUCTUREDXML() {
        return isstructuredxml;
    }

    /**
     * Sets the value of the isstructuredxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSTRUCTUREDXML(String value) {
        this.isstructuredxml = value;
    }

    /**
     * Gets the value of the isprepayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISPREPAYMENT() {
        return isprepayment;
    }

    /**
     * Sets the value of the isprepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISPREPAYMENT(String value) {
        this.isprepayment = value;
    }

    /**
     * Gets the value of the transactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONID() {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONID(String value) {
        this.transactionid = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITE() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITE(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the pageticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGETICKET() {
        return pageticket;
    }

    /**
     * Sets the value of the pageticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGETICKET(String value) {
        this.pageticket = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTION(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the parentrecloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENTRECLOC() {
        return parentrecloc;
    }

    /**
     * Sets the value of the parentrecloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENTRECLOC(String value) {
        this.parentrecloc = value;
    }

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
     * Gets the value of the listtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTTYPE() {
        if (listtype == null) {
            listtype = new ArrayList<String>();
        }
        return this.listtype;
    }

    /**
     * Gets the value of the listelementtoadd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementtoadd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTTOADD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListElementToAddType }
     * 
     * 
     */
    public List<ListElementToAddType> getLISTELEMENTTOADD() {
        if (listelementtoadd == null) {
            listelementtoadd = new ArrayList<ListElementToAddType>();
        }
        return this.listelementtoadd;
    }

    /**
     * Gets the value of the listelementtoremove property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementtoremove property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTTOREMOVE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getLISTELEMENTTOREMOVE() {
        if (listelementtoremove == null) {
            listelementtoremove = new ArrayList<ElementType>();
        }
        return this.listelementtoremove;
    }

    /**
     * Gets the value of the typeoffare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFFARE() {
        return typeoffare;
    }

    /**
     * Sets the value of the typeoffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFFARE(String value) {
        this.typeoffare = value;
    }

    /**
     * Gets the value of the typeofbackupfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFBACKUPFARE() {
        return typeofbackupfare;
    }

    /**
     * Sets the value of the typeofbackupfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFBACKUPFARE(String value) {
        this.typeofbackupfare = value;
    }

    /**
     * Gets the value of the listfareparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREPARAMETER() {
        if (listfareparameter == null) {
            listfareparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfareparameter;
    }

    /**
     * Gets the value of the listfarebackupparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarebackupparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREBACKUPPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREBACKUPPARAMETER() {
        if (listfarebackupparameter == null) {
            listfarebackupparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfarebackupparameter;
    }

    /**
     * Gets the value of the farecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECOMMANDID() {
        return farecommandid;
    }

    /**
     * Sets the value of the farecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECOMMANDID(String value) {
        this.farecommandid = value;
    }

    /**
     * Gets the value of the backupfarecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACKUPFARECOMMANDID() {
        return backupfarecommandid;
    }

    /**
     * Sets the value of the backupfarecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACKUPFARECOMMANDID(String value) {
        this.backupfarecommandid = value;
    }

    /**
     * Gets the value of the forceptc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCEPTC() {
        return forceptc;
    }

    /**
     * Sets the value of the forceptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCEPTC(Boolean value) {
        this.forceptc = value;
    }

    /**
     * Gets the value of the acceptpricechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCEPTPRICECHANGE() {
        return acceptpricechange;
    }

    /**
     * Sets the value of the acceptpricechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCEPTPRICECHANGE(Boolean value) {
        this.acceptpricechange = value;
    }

    /**
     * Gets the value of the acceptservicefee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCEPTSERVICEFEE() {
        return acceptservicefee;
    }

    /**
     * Sets the value of the acceptservicefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCEPTSERVICEFEE(Boolean value) {
        this.acceptservicefee = value;
    }

    /**
     * Gets the value of the boolbookseats property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLBOOKSEATS() {
        return boolbookseats;
    }

    /**
     * Sets the value of the boolbookseats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLBOOKSEATS(Boolean value) {
        this.boolbookseats = value;
    }

    /**
     * Gets the value of the triptype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIPTYPE() {
        return triptype;
    }

    /**
     * Sets the value of the triptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIPTYPE(String value) {
        this.triptype = value;
    }

    /**
     * Gets the value of the travellerinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVELLERINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERINFORMATION }
     * 
     * 
     */
    public List<TRAVELLERINFORMATION> getTRAVELLERINFORMATION() {
        if (travellerinformation == null) {
            travellerinformation = new ArrayList<TRAVELLERINFORMATION>();
        }
        return this.travellerinformation;
    }

    /**
     * Gets the value of the ddccnumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCNUMBER1() {
        return ddccnumber1;
    }

    /**
     * Sets the value of the ddccnumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCNUMBER1(String value) {
        this.ddccnumber1 = value;
    }

    /**
     * Gets the value of the ddccexp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCEXP1() {
        return ddccexp1;
    }

    /**
     * Sets the value of the ddccexp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCEXP1(String value) {
        this.ddccexp1 = value;
    }

    /**
     * Gets the value of the ddcctype1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCTYPE1() {
        return ddcctype1;
    }

    /**
     * Sets the value of the ddcctype1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCTYPE1(String value) {
        this.ddcctype1 = value;
    }

    /**
     * Gets the value of the ddccid1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCID1() {
        return ddccid1;
    }

    /**
     * Sets the value of the ddccid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCID1(String value) {
        this.ddccid1 = value;
    }

    /**
     * Gets the value of the ddccnameoncard1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCNAMEONCARD1() {
        return ddccnameoncard1;
    }

    /**
     * Sets the value of the ddccnameoncard1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCNAMEONCARD1(String value) {
        this.ddccnameoncard1 = value;
    }

    /**
     * Gets the value of the ddccstartdate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCSTARTDATE1() {
        return ddccstartdate1;
    }

    /**
     * Sets the value of the ddccstartdate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCSTARTDATE1(String value) {
        this.ddccstartdate1 = value;
    }

    /**
     * Gets the value of the ddccissuenumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCISSUENUMBER1() {
        return ddccissuenumber1;
    }

    /**
     * Sets the value of the ddccissuenumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCISSUENUMBER1(String value) {
        this.ddccissuenumber1 = value;
    }

    /**
     * Gets the value of the ddccdateofbirth1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCDATEOFBIRTH1() {
        return ddccdateofbirth1;
    }

    /**
     * Sets the value of the ddccdateofbirth1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCDATEOFBIRTH1(String value) {
        this.ddccdateofbirth1 = value;
    }

    /**
     * Gets the value of the ddccdigitcodecc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCDIGITCODECC1() {
        return ddccdigitcodecc1;
    }

    /**
     * Sets the value of the ddccdigitcodecc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCDIGITCODECC1(String value) {
        this.ddccdigitcodecc1 = value;
    }

    /**
     * Gets the value of the ddcctobestored1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCTOBESTORED1() {
        return ddcctobestored1;
    }

    /**
     * Sets the value of the ddcctobestored1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCTOBESTORED1(String value) {
        this.ddcctobestored1 = value;
    }

    /**
     * Gets the value of the ddcctobedeleted1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCTOBEDELETED1() {
        return ddcctobedeleted1;
    }

    /**
     * Sets the value of the ddcctobedeleted1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCTOBEDELETED1(String value) {
        this.ddcctobedeleted1 = value;
    }

    /**
     * Gets the value of the ddccnumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCNUMBER2() {
        return ddccnumber2;
    }

    /**
     * Sets the value of the ddccnumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCNUMBER2(String value) {
        this.ddccnumber2 = value;
    }

    /**
     * Gets the value of the ddccexp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCEXP2() {
        return ddccexp2;
    }

    /**
     * Sets the value of the ddccexp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCEXP2(String value) {
        this.ddccexp2 = value;
    }

    /**
     * Gets the value of the ddcctype2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCTYPE2() {
        return ddcctype2;
    }

    /**
     * Sets the value of the ddcctype2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCTYPE2(String value) {
        this.ddcctype2 = value;
    }

    /**
     * Gets the value of the ddccid2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCID2() {
        return ddccid2;
    }

    /**
     * Sets the value of the ddccid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCID2(String value) {
        this.ddccid2 = value;
    }

    /**
     * Gets the value of the ddccnameoncard2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCNAMEONCARD2() {
        return ddccnameoncard2;
    }

    /**
     * Sets the value of the ddccnameoncard2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCNAMEONCARD2(String value) {
        this.ddccnameoncard2 = value;
    }

    /**
     * Gets the value of the ddccstartdate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCSTARTDATE2() {
        return ddccstartdate2;
    }

    /**
     * Sets the value of the ddccstartdate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCSTARTDATE2(String value) {
        this.ddccstartdate2 = value;
    }

    /**
     * Gets the value of the ddccissuenumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCISSUENUMBER2() {
        return ddccissuenumber2;
    }

    /**
     * Sets the value of the ddccissuenumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCISSUENUMBER2(String value) {
        this.ddccissuenumber2 = value;
    }

    /**
     * Gets the value of the ddccdateofbirth2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCDATEOFBIRTH2() {
        return ddccdateofbirth2;
    }

    /**
     * Sets the value of the ddccdateofbirth2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCDATEOFBIRTH2(String value) {
        this.ddccdateofbirth2 = value;
    }

    /**
     * Gets the value of the ddccdigitcodecc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCDIGITCODECC2() {
        return ddccdigitcodecc2;
    }

    /**
     * Sets the value of the ddccdigitcodecc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCDIGITCODECC2(String value) {
        this.ddccdigitcodecc2 = value;
    }

    /**
     * Gets the value of the ddcctobestored2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCTOBESTORED2() {
        return ddcctobestored2;
    }

    /**
     * Sets the value of the ddcctobestored2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCTOBESTORED2(String value) {
        this.ddcctobestored2 = value;
    }

    /**
     * Gets the value of the ddcctobedeleted2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCTOBEDELETED2() {
        return ddcctobedeleted2;
    }

    /**
     * Sets the value of the ddcctobedeleted2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCTOBEDELETED2(String value) {
        this.ddcctobedeleted2 = value;
    }

    /**
     * Gets the value of the ddccnumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCNUMBER3() {
        return ddccnumber3;
    }

    /**
     * Sets the value of the ddccnumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCNUMBER3(String value) {
        this.ddccnumber3 = value;
    }

    /**
     * Gets the value of the ddccexp3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCEXP3() {
        return ddccexp3;
    }

    /**
     * Sets the value of the ddccexp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCEXP3(String value) {
        this.ddccexp3 = value;
    }

    /**
     * Gets the value of the ddcctype3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCTYPE3() {
        return ddcctype3;
    }

    /**
     * Sets the value of the ddcctype3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCTYPE3(String value) {
        this.ddcctype3 = value;
    }

    /**
     * Gets the value of the ddccid3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCID3() {
        return ddccid3;
    }

    /**
     * Sets the value of the ddccid3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCID3(String value) {
        this.ddccid3 = value;
    }

    /**
     * Gets the value of the ddccnameoncard3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCNAMEONCARD3() {
        return ddccnameoncard3;
    }

    /**
     * Sets the value of the ddccnameoncard3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCNAMEONCARD3(String value) {
        this.ddccnameoncard3 = value;
    }

    /**
     * Gets the value of the ddccstartdate3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCSTARTDATE3() {
        return ddccstartdate3;
    }

    /**
     * Sets the value of the ddccstartdate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCSTARTDATE3(String value) {
        this.ddccstartdate3 = value;
    }

    /**
     * Gets the value of the ddccissuenumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCISSUENUMBER3() {
        return ddccissuenumber3;
    }

    /**
     * Sets the value of the ddccissuenumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCISSUENUMBER3(String value) {
        this.ddccissuenumber3 = value;
    }

    /**
     * Gets the value of the ddccdateofbirth3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCDATEOFBIRTH3() {
        return ddccdateofbirth3;
    }

    /**
     * Sets the value of the ddccdateofbirth3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCDATEOFBIRTH3(String value) {
        this.ddccdateofbirth3 = value;
    }

    /**
     * Gets the value of the ddccdigitcodecc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCDIGITCODECC3() {
        return ddccdigitcodecc3;
    }

    /**
     * Sets the value of the ddccdigitcodecc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCDIGITCODECC3(String value) {
        this.ddccdigitcodecc3 = value;
    }

    /**
     * Gets the value of the ddcctobestored3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCTOBESTORED3() {
        return ddcctobestored3;
    }

    /**
     * Sets the value of the ddcctobestored3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCTOBESTORED3(String value) {
        this.ddcctobestored3 = value;
    }

    /**
     * Gets the value of the ddcctobedeleted3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDCCTOBEDELETED3() {
        return ddcctobedeleted3;
    }

    /**
     * Sets the value of the ddcctobedeleted3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDCCTOBEDELETED3(String value) {
        this.ddcctobedeleted3 = value;
    }

    /**
     * Gets the value of the paymentgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAYMENTGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENTGROUPType }
     * 
     * 
     */
    public List<PAYMENTGROUPType> getPAYMENTGROUP() {
        if (paymentgroup == null) {
            paymentgroup = new ArrayList<PAYMENTGROUPType>();
        }
        return this.paymentgroup;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link BookTripPlanInput2 .PAYMENT }
     *     
     */
    public BookTripPlanInput2 .PAYMENT getPAYMENT() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTripPlanInput2 .PAYMENT }
     *     
     */
    public void setPAYMENT(BookTripPlanInput2 .PAYMENT value) {
        this.payment = value;
    }

    /**
     * Gets the value of the donation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the donation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDONATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanInput2 .DONATION }
     * 
     * 
     */
    public List<BookTripPlanInput2 .DONATION> getDONATION() {
        if (donation == null) {
            donation = new ArrayList<BookTripPlanInput2 .DONATION>();
        }
        return this.donation;
    }

    /**
     * Gets the value of the listincludedsubtypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listincludedsubtypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINCLUDEDSUBTYPES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTINCLUDEDSUBTYPES() {
        if (listincludedsubtypes == null) {
            listincludedsubtypes = new ArrayList<String>();
        }
        return this.listincludedsubtypes;
    }

    /**
     * Gets the value of the listexcludedsubtypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexcludedsubtypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXCLUDEDSUBTYPES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTEXCLUDEDSUBTYPES() {
        if (listexcludedsubtypes == null) {
            listexcludedsubtypes = new ArrayList<String>();
        }
        return this.listexcludedsubtypes;
    }

    /**
     * Gets the value of the excludeall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEXCLUDEALL() {
        return excludeall;
    }

    /**
     * Sets the value of the excludeall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEXCLUDEALL(Boolean value) {
        this.excludeall = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTACT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACT }
     * 
     * 
     */
    public List<CONTACT> getCONTACT() {
        if (contact == null) {
            contact = new ArrayList<CONTACT>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the loyaltycard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltycard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLOYALTYCARD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALTYCARD }
     * 
     * 
     */
    public List<LOYALTYCARD> getLOYALTYCARD() {
        if (loyaltycard == null) {
            loyaltycard = new ArrayList<LOYALTYCARD>();
        }
        return this.loyaltycard;
    }

    /**
     * Gets the value of the registerstartover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREGISTERSTARTOVER() {
        return registerstartover;
    }

    /**
     * Sets the value of the registerstartover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREGISTERSTARTOVER(Boolean value) {
        this.registerstartover = value;
    }

    /**
     * Gets the value of the disablegettripplan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISABLEGETTRIPPLAN() {
        return disablegettripplan;
    }

    /**
     * Sets the value of the disablegettripplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISABLEGETTRIPPLAN(Boolean value) {
        this.disablegettripplan = value;
    }

    /**
     * Gets the value of the hotelremark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELREMARK() {
        return hotelremark;
    }

    /**
     * Sets the value of the hotelremark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELREMARK(String value) {
        this.hotelremark = value;
    }

    /**
     * Gets the value of the carremark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARREMARK() {
        return carremark;
    }

    /**
     * Sets the value of the carremark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARREMARK(String value) {
        this.carremark = value;
    }

    /**
     * Gets the value of the carairlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARAIRLINECODE() {
        return carairlinecode;
    }

    /**
     * Sets the value of the carairlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARAIRLINECODE(String value) {
        this.carairlinecode = value;
    }

    /**
     * Gets the value of the carbillingnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARBILLINGNUMBER() {
        return carbillingnumber;
    }

    /**
     * Sets the value of the carbillingnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARBILLINGNUMBER(String value) {
        this.carbillingnumber = value;
    }

    /**
     * Gets the value of the carvouchervalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARVOUCHERVALUE() {
        return carvouchervalue;
    }

    /**
     * Sets the value of the carvouchervalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARVOUCHERVALUE(String value) {
        this.carvouchervalue = value;
    }

    /**
     * Gets the value of the carvoucheramount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARVOUCHERAMOUNT() {
        return carvoucheramount;
    }

    /**
     * Sets the value of the carvoucheramount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARVOUCHERAMOUNT(String value) {
        this.carvoucheramount = value;
    }

    /**
     * Gets the value of the carvouchercurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARVOUCHERCURRENCY() {
        return carvouchercurrency;
    }

    /**
     * Sets the value of the carvouchercurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARVOUCHERCURRENCY(String value) {
        this.carvouchercurrency = value;
    }

    /**
     * Gets the value of the carissueevoucher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCARISSUEEVOUCHER() {
        return carissueevoucher;
    }

    /**
     * Sets the value of the carissueevoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCARISSUEEVOUCHER(Boolean value) {
        this.carissueevoucher = value;
    }

    /**
     * Gets the value of the carbookingsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARBOOKINGSOURCE() {
        return carbookingsource;
    }

    /**
     * Sets the value of the carbookingsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARBOOKINGSOURCE(String value) {
        this.carbookingsource = value;
    }

    /**
     * Gets the value of the carflightnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARFLIGHTNUMBER() {
        return carflightnumber;
    }

    /**
     * Sets the value of the carflightnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARFLIGHTNUMBER(String value) {
        this.carflightnumber = value;
    }

    /**
     * Gets the value of the carspecialequipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carspecialequipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCARSPECIALEQUIPMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCARSPECIALEQUIPMENT() {
        if (carspecialequipment == null) {
            carspecialequipment = new ArrayList<String>();
        }
        return this.carspecialequipment;
    }

    /**
     * Gets the value of the caracceptonrequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCARACCEPTONREQUEST() {
        return caracceptonrequest;
    }

    /**
     * Sets the value of the caracceptonrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCARACCEPTONREQUEST(Boolean value) {
        this.caracceptonrequest = value;
    }

    /**
     * Gets the value of the carpowered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCARPOWERED() {
        return carpowered;
    }

    /**
     * Sets the value of the carpowered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCARPOWERED(Boolean value) {
        this.carpowered = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICKNAME() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICKNAME(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the travelapprover property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELAPPROVER1 }
     *     
     */
    public TRAVELAPPROVER1 getTRAVELAPPROVER() {
        return travelapprover;
    }

    /**
     * Sets the value of the travelapprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELAPPROVER1 }
     *     
     */
    public void setTRAVELAPPROVER(TRAVELAPPROVER1 value) {
        this.travelapprover = value;
    }

    /**
     * Gets the value of the paymentcardfee property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPAYMENTCARDFEE() {
        return paymentcardfee;
    }

    /**
     * Sets the value of the paymentcardfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPAYMENTCARDFEE(Float value) {
        this.paymentcardfee = value;
    }

    /**
     * Gets the value of the webfarediscount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWEBFAREDISCOUNT() {
        return webfarediscount;
    }

    /**
     * Sets the value of the webfarediscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWEBFAREDISCOUNT(Float value) {
        this.webfarediscount = value;
    }

    /**
     * Gets the value of the ahiatanumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAHIATANUMBER() {
        return ahiatanumber;
    }

    /**
     * Sets the value of the ahiatanumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAHIATANUMBER(String value) {
        this.ahiatanumber = value;
    }

    /**
     * Gets the value of the ahsourcecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAHSOURCECODE() {
        return ahsourcecode;
    }

    /**
     * Sets the value of the ahsourcecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAHSOURCECODE(String value) {
        this.ahsourcecode = value;
    }

    /**
     * Gets the value of the listexternalid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexternalid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTERNALID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTEXTERNALID() {
        if (listexternalid == null) {
            listexternalid = new ArrayList<String>();
        }
        return this.listexternalid;
    }

    /**
     * Gets the value of the frompage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFROMPAGE() {
        return frompage;
    }

    /**
     * Sets the value of the frompage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFROMPAGE(Object value) {
        this.frompage = value;
    }

    /**
     * Gets the value of the requestinfo property.
     * 
     * @return
     *     possible object is
     *     {@link BookTripPlanInput2 .REQUESTINFO }
     *     
     */
    public BookTripPlanInput2 .REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTripPlanInput2 .REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(BookTripPlanInput2 .REQUESTINFO value) {
        this.requestinfo = value;
    }

    /**
     * Gets the value of the cleanoverrideonsiteswitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCLEANOVERRIDEONSITESWITCH() {
        return cleanoverrideonsiteswitch;
    }

    /**
     * Sets the value of the cleanoverrideonsiteswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCLEANOVERRIDEONSITESWITCH(Boolean value) {
        this.cleanoverrideonsiteswitch = value;
    }

    /**
     * Gets the value of the apischeckview property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKVIEW() {
        return apischeckview;
    }

    /**
     * Sets the value of the apischeckview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKVIEW(Object value) {
        this.apischeckview = value;
    }

    /**
     * Gets the value of the apischeckcategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKCATEGORY() {
        return apischeckcategory;
    }

    /**
     * Sets the value of the apischeckcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKCATEGORY(Object value) {
        this.apischeckcategory = value;
    }

    /**
     * Gets the value of the apischeckmandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKMANDATORY() {
        return apischeckmandatory;
    }

    /**
     * Sets the value of the apischeckmandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKMANDATORY(Object value) {
        this.apischeckmandatory = value;
    }

    /**
     * Gets the value of the apischeckoptional property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKOPTIONAL() {
        return apischeckoptional;
    }

    /**
     * Sets the value of the apischeckoptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKOPTIONAL(Object value) {
        this.apischeckoptional = value;
    }

    /**
     * Gets the value of the apischeckstructure property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKSTRUCTURE() {
        return apischeckstructure;
    }

    /**
     * Sets the value of the apischeckstructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKSTRUCTURE(Object value) {
        this.apischeckstructure = value;
    }

    /**
     * Gets the value of the apischeckstructurepassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apischeckstructurepassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPISCHECKSTRUCTUREPASSENGER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanInput2 .APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<BookTripPlanInput2 .APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<BookTripPlanInput2 .APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
    }

    /**
     * Gets the value of the originsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINSITE() {
        return originsite;
    }

    /**
     * Sets the value of the originsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINSITE(String value) {
        this.originsite = value;
    }

    /**
     * Gets the value of the listinsurancedateofbirth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listinsurancedateofbirth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINSURANCEDATEOFBIRTH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanInput2 .LISTINSURANCEDATEOFBIRTH }
     * 
     * 
     */
    public List<BookTripPlanInput2 .LISTINSURANCEDATEOFBIRTH> getLISTINSURANCEDATEOFBIRTH() {
        if (listinsurancedateofbirth == null) {
            listinsurancedateofbirth = new ArrayList<BookTripPlanInput2 .LISTINSURANCEDATEOFBIRTH>();
        }
        return this.listinsurancedateofbirth;
    }

    /**
     * Gets the value of the listinsurancepricingperproduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listinsurancepricingperproduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINSURANCEPRICINGPERPRODUCT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT }
     * 
     * 
     */
    public List<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT> getLISTINSURANCEPRICINGPERPRODUCT() {
        if (listinsurancepricingperproduct == null) {
            listinsurancepricingperproduct = new ArrayList<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT>();
        }
        return this.listinsurancepricingperproduct;
    }

    /**
     * Gets the value of the baseurl property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBASEURL() {
        return baseurl;
    }

    /**
     * Sets the value of the baseurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBASEURL(Object value) {
        this.baseurl = value;
    }

    /**
     * Gets the value of the dcctransactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCTRANSACTIONID() {
        return dcctransactionid;
    }

    /**
     * Sets the value of the dcctransactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCTRANSACTIONID(String value) {
        this.dcctransactionid = value;
    }

    /**
     * Gets the value of the dccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCID() {
        return dccid;
    }

    /**
     * Sets the value of the dccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCID(String value) {
        this.dccid = value;
    }

    /**
     * Gets the value of the dccselected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCSELECTED() {
        return dccselected;
    }

    /**
     * Sets the value of the dccselected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCSELECTED(String value) {
        this.dccselected = value;
    }

    /**
     * Gets the value of the dccamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCAMOUNT() {
        return dccamount;
    }

    /**
     * Sets the value of the dccamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCAMOUNT(String value) {
        this.dccamount = value;
    }

    /**
     * Gets the value of the dcccurrencycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCCURRENCYCODE() {
        return dcccurrencycode;
    }

    /**
     * Sets the value of the dcccurrencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCCURRENCYCODE(String value) {
        this.dcccurrencycode = value;
    }

    /**
     * Gets the value of the dccexchangerate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCEXCHANGERATE() {
        return dccexchangerate;
    }

    /**
     * Sets the value of the dccexchangerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCEXCHANGERATE(String value) {
        this.dccexchangerate = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link BookTripPlanInput2 .PROMOTION }
     *     
     */
    public BookTripPlanInput2 .PROMOTION getPROMOTION() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTripPlanInput2 .PROMOTION }
     *     
     */
    public void setPROMOTION(BookTripPlanInput2 .PROMOTION value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the donotapplybookingfee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDONOTAPPLYBOOKINGFEE() {
        return donotapplybookingfee;
    }

    /**
     * Sets the value of the donotapplybookingfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDONOTAPPLYBOOKINGFEE(Boolean value) {
        this.donotapplybookingfee = value;
    }

    /**
     * Gets the value of the paymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTTYPE() {
        return paymenttype;
    }

    /**
     * Sets the value of the paymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTTYPE(String value) {
        this.paymenttype = value;
    }

    /**
     * Gets the value of the inspaymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPAYMENTTYPE() {
        return inspaymenttype;
    }

    /**
     * Sets the value of the inspaymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPAYMENTTYPE(String value) {
        this.inspaymenttype = value;
    }

    /**
     * Gets the value of the airasnbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRASNBANK() {
        return airasnbank;
    }

    /**
     * Sets the value of the airasnbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRASNBANK(String value) {
        this.airasnbank = value;
    }

    /**
     * Gets the value of the airasnbankprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRASNBANKPROVIDER() {
        return airasnbankprovider;
    }

    /**
     * Sets the value of the airasnbankprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRASNBANKPROVIDER(String value) {
        this.airasnbankprovider = value;
    }

    /**
     * Gets the value of the insasnbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSASNBANK() {
        return insasnbank;
    }

    /**
     * Sets the value of the insasnbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSASNBANK(String value) {
        this.insasnbank = value;
    }

    /**
     * Gets the value of the insasnbankprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSASNBANKPROVIDER() {
        return insasnbankprovider;
    }

    /**
     * Sets the value of the insasnbankprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSASNBANKPROVIDER(String value) {
        this.insasnbankprovider = value;
    }

    /**
     * Gets the value of the bankaccountid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKACCOUNTID() {
        return bankaccountid;
    }

    /**
     * Sets the value of the bankaccountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKACCOUNTID(String value) {
        this.bankaccountid = value;
    }

    /**
     * Gets the value of the documenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTTYPE(String value) {
        this.documenttype = value;
    }

    /**
     * Gets the value of the documentvendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTVENDOR() {
        return documentvendor;
    }

    /**
     * Sets the value of the documentvendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTVENDOR(String value) {
        this.documentvendor = value;
    }

    /**
     * Gets the value of the documentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTNUMBER() {
        return documentnumber;
    }

    /**
     * Sets the value of the documentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTNUMBER(String value) {
        this.documentnumber = value;
    }

    /**
     * Gets the value of the extpaymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTPAYMENTTYPE() {
        return extpaymenttype;
    }

    /**
     * Sets the value of the extpaymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTPAYMENTTYPE(String value) {
        this.extpaymenttype = value;
    }

    /**
     * Gets the value of the cancellationurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELLATIONURL() {
        return cancellationurl;
    }

    /**
     * Sets the value of the cancellationurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELLATIONURL(String value) {
        this.cancellationurl = value;
    }

    /**
     * Gets the value of the confirmationurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMATIONURL() {
        return confirmationurl;
    }

    /**
     * Sets the value of the confirmationurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMATIONURL(String value) {
        this.confirmationurl = value;
    }

    /**
     * Gets the value of the paypalorderdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYPALORDERDESCRIPTION() {
        return paypalorderdescription;
    }

    /**
     * Sets the value of the paypalorderdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYPALORDERDESCRIPTION(String value) {
        this.paypalorderdescription = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
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
     * {@link BookTripPlanInput2 .LISTAIRLINEFEE }
     * 
     * 
     */
    public List<BookTripPlanInput2 .LISTAIRLINEFEE> getLISTAIRLINEFEE() {
        if (listairlinefee == null) {
            listairlinefee = new ArrayList<BookTripPlanInput2 .LISTAIRLINEFEE>();
        }
        return this.listairlinefee;
    }

    /**
     * Gets the value of the keepalivesessionurl property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKEEPALIVESESSIONURL() {
        return keepalivesessionurl;
    }

    /**
     * Sets the value of the keepalivesessionurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKEEPALIVESESSIONURL(Object value) {
        this.keepalivesessionurl = value;
    }

    /**
     * Gets the value of the aircctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRCCTYPE() {
        return aircctype;
    }

    /**
     * Sets the value of the aircctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRCCTYPE(String value) {
        this.aircctype = value;
    }

    /**
     * Gets the value of the airccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRCCNUMBER() {
        return airccnumber;
    }

    /**
     * Sets the value of the airccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRCCNUMBER(String value) {
        this.airccnumber = value;
    }

    /**
     * Gets the value of the airccdigitcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRCCDIGITCODE() {
        return airccdigitcode;
    }

    /**
     * Sets the value of the airccdigitcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRCCDIGITCODE(String value) {
        this.airccdigitcode = value;
    }

    /**
     * Gets the value of the airccexp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRCCEXP() {
        return airccexp;
    }

    /**
     * Sets the value of the airccexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRCCEXP(String value) {
        this.airccexp = value;
    }

    /**
     * Gets the value of the airccnameoncard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRCCNAMEONCARD() {
        return airccnameoncard;
    }

    /**
     * Sets the value of the airccnameoncard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRCCNAMEONCARD(String value) {
        this.airccnameoncard = value;
    }

    /**
     * Gets the value of the ccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCID() {
        return ccid;
    }

    /**
     * Sets the value of the ccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCID(String value) {
        this.ccid = value;
    }

    /**
     * Gets the value of the paRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaRes() {
        return paRes;
    }

    /**
     * Sets the value of the paRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaRes(String value) {
        this.paRes = value;
    }

    /**
     * Gets the value of the crosssellpaneltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCROSSSELLPANELTYPE() {
        return crosssellpaneltype;
    }

    /**
     * Sets the value of the crosssellpaneltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCROSSSELLPANELTYPE(String value) {
        this.crosssellpaneltype = value;
    }

    /**
     * Gets the value of the crosssellpanelid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCROSSSELLPANELID() {
        return crosssellpanelid;
    }

    /**
     * Sets the value of the crosssellpanelid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCROSSSELLPANELID(BigInteger value) {
        this.crosssellpanelid = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getROW() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setROW(BigInteger value) {
        this.row = value;
    }

    /**
     * Gets the value of the subrow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSUBROW() {
        return subrow;
    }

    /**
     * Sets the value of the subrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSUBROW(BigInteger value) {
        this.subrow = value;
    }

    /**
     * Gets the value of the carrequestid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCARREQUESTID() {
        return carrequestid;
    }

    /**
     * Sets the value of the carrequestid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCARREQUESTID(BigInteger value) {
        this.carrequestid = value;
    }

    /**
     * Gets the value of the listselectedinsuranceproducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listselectedinsuranceproducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSELECTEDINSURANCEPRODUCTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectInsurancePricingType }
     * 
     * 
     */
    public List<SelectInsurancePricingType> getLISTSELECTEDINSURANCEPRODUCTS() {
        if (listselectedinsuranceproducts == null) {
            listselectedinsuranceproducts = new ArrayList<SelectInsurancePricingType>();
        }
        return this.listselectedinsuranceproducts;
    }

    /**
     * Gets the value of the associatedtravellerfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSOCIATEDTRAVELLERFIRSTNAME() {
        return associatedtravellerfirstname;
    }

    /**
     * Sets the value of the associatedtravellerfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSOCIATEDTRAVELLERFIRSTNAME(String value) {
        this.associatedtravellerfirstname = value;
    }

    /**
     * Gets the value of the associatedtravellerlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSOCIATEDTRAVELLERLASTNAME() {
        return associatedtravellerlastname;
    }

    /**
     * Sets the value of the associatedtravellerlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSOCIATEDTRAVELLERLASTNAME(String value) {
        this.associatedtravellerlastname = value;
    }

    /**
     * Gets the value of the travellerassociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerassociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVELLERASSOCIATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanInput2 .TRAVELLERASSOCIATION }
     * 
     * 
     */
    public List<BookTripPlanInput2 .TRAVELLERASSOCIATION> getTRAVELLERASSOCIATION() {
        if (travellerassociation == null) {
            travellerassociation = new ArrayList<BookTripPlanInput2 .TRAVELLERASSOCIATION>();
        }
        return this.travellerassociation;
    }

    /**
     * Gets the value of the milesandcashcost property.
     * 
     * @return
     *     possible object is
     *     {@link BookTripPlanInput2 .MILESANDCASHCOST }
     *     
     */
    public BookTripPlanInput2 .MILESANDCASHCOST getMILESANDCASHCOST() {
        return milesandcashcost;
    }

    /**
     * Sets the value of the milesandcashcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTripPlanInput2 .MILESANDCASHCOST }
     *     
     */
    public void setMILESANDCASHCOST(BookTripPlanInput2 .MILESANDCASHCOST value) {
        this.milesandcashcost = value;
    }

    /**
     * Gets the value of the milesandcashconvertedcashmiles property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMILESANDCASHCONVERTEDCASHMILES() {
        return milesandcashconvertedcashmiles;
    }

    /**
     * Sets the value of the milesandcashconvertedcashmiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMILESANDCASHCONVERTEDCASHMILES(Object value) {
        this.milesandcashconvertedcashmiles = value;
    }

    /**
     * Gets the value of the milesandcashminimummilescost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMILESANDCASHMINIMUMMILESCOST() {
        return milesandcashminimummilescost;
    }

    /**
     * Sets the value of the milesandcashminimummilescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMILESANDCASHMINIMUMMILESCOST(Object value) {
        this.milesandcashminimummilescost = value;
    }

    /**
     * Gets the value of the milesandcashnonconvertedamount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMILESANDCASHNONCONVERTEDAMOUNT() {
        return milesandcashnonconvertedamount;
    }

    /**
     * Sets the value of the milesandcashnonconvertedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMILESANDCASHNONCONVERTEDAMOUNT(Object value) {
        this.milesandcashnonconvertedamount = value;
    }

    /**
     * Gets the value of the usefopcatalog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSEFOPCATALOG() {
        return usefopcatalog;
    }

    /**
     * Sets the value of the usefopcatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSEFOPCATALOG(Boolean value) {
        this.usefopcatalog = value;
    }

    /**
     * Gets the value of the timetothinkid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMETOTHINKID() {
        return timetothinkid;
    }

    /**
     * Sets the value of the timetothinkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMETOTHINKID(String value) {
        this.timetothinkid = value;
    }

    /**
     * Gets the value of the bookingchannel property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKINGCHANNELType }
     *     
     */
    public BOOKINGCHANNELType getBOOKINGCHANNEL() {
        return bookingchannel;
    }

    /**
     * Sets the value of the bookingchannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKINGCHANNELType }
     *     
     */
    public void setBOOKINGCHANNEL(BOOKINGCHANNELType value) {
        this.bookingchannel = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
     *         &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_STRUCTURE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "travelerid",
        "liststructure"
    })
    public static class APISCHECKSTRUCTUREPASSENGER
        implements Serializable
    {

        @XmlElement(name = "TRAVELER_ID")
        protected Object travelerid;
        @XmlElement(name = "LIST_STRUCTURE")
        protected Object liststructure;

        /**
         * Gets the value of the travelerid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRAVELERID() {
            return travelerid;
        }

        /**
         * Sets the value of the travelerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRAVELERID(Object value) {
            this.travelerid = value;
        }

        /**
         * Gets the value of the liststructure property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLISTSTRUCTURE() {
            return liststructure;
        }

        /**
         * Sets the value of the liststructure property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLISTSTRUCTURE(Object value) {
            this.liststructure = value;
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
     *         &lt;group ref="{}DonationStatusGroup" minOccurs="0"/&gt;
     *         &lt;group ref="{}DonationGroup"/&gt;
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
        "status",
        "donationid",
        "newsletter",
        "amount",
        "currency",
        "creditcardid",
        "contactid",
        "emailid"
    })
    public static class DONATION
        implements Serializable
    {

        @XmlElement(name = "STATUS")
        protected String status;
        @XmlElement(name = "DONATION_ID")
        protected String donationid;
        @XmlElement(name = "NEWSLETTER")
        protected Boolean newsletter;
        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;
        @XmlElement(name = "CREDIT_CARD_ID", required = true)
        protected BigInteger creditcardid;
        @XmlElement(name = "CONTACT_ID", required = true)
        protected BigInteger contactid;
        @XmlElement(name = "EMAIL_ID", required = true)
        protected BigInteger emailid;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the donationid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDONATIONID() {
            return donationid;
        }

        /**
         * Sets the value of the donationid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDONATIONID(String value) {
            this.donationid = value;
        }

        /**
         * Gets the value of the newsletter property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNEWSLETTER() {
            return newsletter;
        }

        /**
         * Sets the value of the newsletter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNEWSLETTER(Boolean value) {
            this.newsletter = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
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

        /**
         * Gets the value of the creditcardid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCREDITCARDID() {
            return creditcardid;
        }

        /**
         * Sets the value of the creditcardid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCREDITCARDID(BigInteger value) {
            this.creditcardid = value;
        }

        /**
         * Gets the value of the contactid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCONTACTID() {
            return contactid;
        }

        /**
         * Sets the value of the contactid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCONTACTID(BigInteger value) {
            this.contactid = value;
        }

        /**
         * Gets the value of the emailid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEMAILID() {
            return emailid;
        }

        /**
         * Sets the value of the emailid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEMAILID(BigInteger value) {
            this.emailid = value;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="SUBTYPE" type="{}unprotectedStringType"/&gt;
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
        "subtype"
    })
    public static class LISTAIRLINEFEE
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected BigInteger type;
        @XmlElement(name = "SUBTYPE", required = true)
        protected String subtype;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTYPE(BigInteger value) {
            this.type = value;
        }

        /**
         * Gets the value of the subtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUBTYPE() {
            return subtype;
        }

        /**
         * Sets the value of the subtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUBTYPE(String value) {
            this.subtype = value;
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
     *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="BOOL_IS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "travellerid",
        "dateofbirth",
        "boolisinfant"
    })
    public static class LISTINSURANCEDATEOFBIRTH
        implements Serializable
    {

        @XmlElement(name = "TRAVELLER_ID", required = true)
        protected BigInteger travellerid;
        @XmlElement(name = "DATE_OF_BIRTH", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateofbirth;
        @XmlElement(name = "BOOL_IS_INFANT")
        protected boolean boolisinfant;

        /**
         * Gets the value of the travellerid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTRAVELLERID() {
            return travellerid;
        }

        /**
         * Sets the value of the travellerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTRAVELLERID(BigInteger value) {
            this.travellerid = value;
        }

        /**
         * Gets the value of the dateofbirth property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATEOFBIRTH() {
            return dateofbirth;
        }

        /**
         * Sets the value of the dateofbirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATEOFBIRTH(XMLGregorianCalendar value) {
            this.dateofbirth = value;
        }

        /**
         * Gets the value of the boolisinfant property.
         * 
         */
        public boolean isBOOLISINFANT() {
            return boolisinfant;
        }

        /**
         * Sets the value of the boolisinfant property.
         * 
         */
        public void setBOOLISINFANT(boolean value) {
            this.boolisinfant = value;
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
     *         &lt;element name="PROVIDER"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PRODUCT"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="EXTENSION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PLAN_COST_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BOOL_IS_DEFAULT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TRAVELLER_PRICE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LIST_COVERED_TRAVELLER" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                             &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        "provider",
        "product",
        "plancostinfo",
        "boolisdefault",
        "displayorder",
        "listtravellerprice"
    })
    public static class LISTINSURANCEPRICINGPERPRODUCT
        implements Serializable
    {

        @XmlElement(name = "PROVIDER", required = true)
        protected BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER provider;
        @XmlElement(name = "PRODUCT", required = true)
        protected BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT product;
        @XmlElement(name = "PLAN_COST_INFO")
        protected BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO plancostinfo;
        @XmlElement(name = "BOOL_IS_DEFAULT")
        protected Boolean boolisdefault;
        @XmlElement(name = "DISPLAY_ORDER")
        protected BigInteger displayorder;
        @XmlElement(name = "LIST_TRAVELLER_PRICE", required = true)
        protected List<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE> listtravellerprice;

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER }
         *     
         */
        public BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER getPROVIDER() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER }
         *     
         */
        public void setPROVIDER(BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER value) {
            this.provider = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT }
         *     
         */
        public BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT getPRODUCT() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT }
         *     
         */
        public void setPRODUCT(BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT value) {
            this.product = value;
        }

        /**
         * Gets the value of the plancostinfo property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO }
         *     
         */
        public BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO getPLANCOSTINFO() {
            return plancostinfo;
        }

        /**
         * Sets the value of the plancostinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO }
         *     
         */
        public void setPLANCOSTINFO(BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO value) {
            this.plancostinfo = value;
        }

        /**
         * Gets the value of the boolisdefault property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBOOLISDEFAULT() {
            return boolisdefault;
        }

        /**
         * Sets the value of the boolisdefault property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBOOLISDEFAULT(Boolean value) {
            this.boolisdefault = value;
        }

        /**
         * Gets the value of the displayorder property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDISPLAYORDER() {
            return displayorder;
        }

        /**
         * Sets the value of the displayorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDISPLAYORDER(BigInteger value) {
            this.displayorder = value;
        }

        /**
         * Gets the value of the listtravellerprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellerprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE }
         * 
         * 
         */
        public List<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE> getLISTTRAVELLERPRICE() {
            if (listtravellerprice == null) {
                listtravellerprice = new ArrayList<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE>();
            }
            return this.listtravellerprice;
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
         *         &lt;element name="LIST_COVERED_TRAVELLER" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
         *                 &lt;/all&gt;
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
            "listcoveredtraveller",
            "listprice"
        })
        public static class LISTTRAVELLERPRICE
            implements Serializable
        {

            @XmlElement(name = "LIST_COVERED_TRAVELLER", required = true)
            protected List<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER> listcoveredtraveller;
            @XmlElement(name = "LIST_PRICE", required = true)
            protected List<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE> listprice;

            /**
             * Gets the value of the listcoveredtraveller property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listcoveredtraveller property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCOVEREDTRAVELLER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER }
             * 
             * 
             */
            public List<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER> getLISTCOVEREDTRAVELLER() {
                if (listcoveredtraveller == null) {
                    listcoveredtraveller = new ArrayList<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER>();
                }
                return this.listcoveredtraveller;
            }

            /**
             * Gets the value of the listprice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listprice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPRICE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE }
             * 
             * 
             */
            public List<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE> getLISTPRICE() {
                if (listprice == null) {
                    listprice = new ArrayList<BookTripPlanInput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE>();
                }
                return this.listprice;
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
             *       &lt;all&gt;
             *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class LISTCOVEREDTRAVELLER
                implements Serializable
            {

                @XmlElement(name = "TYPE", required = true)
                protected String type;
                @XmlElement(name = "TRAVELLER_ID", required = true)
                protected BigInteger travellerid;

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
                 * Gets the value of the travellerid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTRAVELLERID() {
                    return travellerid;
                }

                /**
                 * Sets the value of the travellerid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTRAVELLERID(BigInteger value) {
                    this.travellerid = value;
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
             *       &lt;all&gt;
             *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
             *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class LISTPRICE
                implements Serializable
            {

                @XmlElement(name = "AMOUNT")
                protected float amount;
                @XmlElement(name = "CURRENCY", required = true)
                protected CurrencyType currency;

                /**
                 * Gets the value of the amount property.
                 * 
                 */
                public float getAMOUNT() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 */
                public void setAMOUNT(float value) {
                    this.amount = value;
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
         *       &lt;all&gt;
         *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class PLANCOSTINFO
            implements Serializable
        {

            @XmlElement(name = "TOTAL_AMOUNT")
            protected float totalamount;
            @XmlElement(name = "CURRENCY", required = true)
            protected CurrencyType currency;

            /**
             * Gets the value of the totalamount property.
             * 
             */
            public float getTOTALAMOUNT() {
                return totalamount;
            }

            /**
             * Sets the value of the totalamount property.
             * 
             */
            public void setTOTALAMOUNT(float value) {
                this.totalamount = value;
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="EXTENSION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class PRODUCT
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "EXTENSION_CODE")
            protected String extensioncode;
            @XmlElement(name = "NAME")
            protected String name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the extensioncode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXTENSIONCODE() {
                return extensioncode;
            }

            /**
             * Sets the value of the extensioncode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXTENSIONCODE(String value) {
                this.extensioncode = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class PROVIDER
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "NAME")
            protected String name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
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
     *         &lt;choice minOccurs="0"&gt;
     *           &lt;sequence&gt;
     *             &lt;group ref="{}LegacyMilesAndCash"/&gt;
     *             &lt;group ref="{}AwardMileAndCash"/&gt;
     *           &lt;/sequence&gt;
     *         &lt;/choice&gt;
     *         &lt;group ref="{}Currency"/&gt;
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
        "listmilesamount",
        "listcashamount",
        "totalcashpaid",
        "resultingmiles",
        "convertedamount",
        "nonconvertedamount",
        "convertedcashmiles",
        "minimummilescost",
        "sliderrankposition",
        "numberofsliderranks",
        "slidertype",
        "listoption",
        "currency"
    })
    public static class MILESANDCASHCOST
        implements Serializable
    {

        @XmlElement(name = "LIST_MILES_AMOUNT")
        protected List<BookTripPlanInput2 .MILESANDCASHCOST.LISTMILESAMOUNT> listmilesamount;
        @XmlElement(name = "LIST_CASH_AMOUNT")
        protected List<BookTripPlanInput2 .MILESANDCASHCOST.LISTCASHAMOUNT> listcashamount;
        @XmlElement(name = "TOTAL_CASH_PAID")
        protected BookTripPlanInput2 .MILESANDCASHCOST.TOTALCASHPAID totalcashpaid;
        @XmlElement(name = "RESULTING_MILES")
        protected AMOUNTSINTEGERTYPE resultingmiles;
        @XmlElement(name = "CONVERTED_AMOUNT")
        protected AMOUNTSTYPE convertedamount;
        @XmlElement(name = "NON_CONVERTED_AMOUNT")
        protected AMOUNTBREAKDOWN nonconvertedamount;
        @XmlElement(name = "CONVERTED_CASH_MILES")
        protected Object convertedcashmiles;
        @XmlElement(name = "MINIMUM_MILES_COST")
        protected Object minimummilescost;
        @XmlElement(name = "SLIDER_RANK_POSITION")
        protected Integer sliderrankposition;
        @XmlElement(name = "NUMBER_OF_SLIDER_RANKS")
        protected Integer numberofsliderranks;
        @XmlElement(name = "SLIDER_TYPE")
        protected String slidertype;
        @XmlElement(name = "LIST_OPTION")
        protected List<String> listoption;
        @XmlElement(name = "CURRENCY")
        protected BookTripPlanInput2 .MILESANDCASHCOST.CURRENCY currency;

        /**
         * Gets the value of the listmilesamount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listmilesamount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTMILESAMOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookTripPlanInput2 .MILESANDCASHCOST.LISTMILESAMOUNT }
         * 
         * 
         */
        public List<BookTripPlanInput2 .MILESANDCASHCOST.LISTMILESAMOUNT> getLISTMILESAMOUNT() {
            if (listmilesamount == null) {
                listmilesamount = new ArrayList<BookTripPlanInput2 .MILESANDCASHCOST.LISTMILESAMOUNT>();
            }
            return this.listmilesamount;
        }

        /**
         * Gets the value of the listcashamount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcashamount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCASHAMOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookTripPlanInput2 .MILESANDCASHCOST.LISTCASHAMOUNT }
         * 
         * 
         */
        public List<BookTripPlanInput2 .MILESANDCASHCOST.LISTCASHAMOUNT> getLISTCASHAMOUNT() {
            if (listcashamount == null) {
                listcashamount = new ArrayList<BookTripPlanInput2 .MILESANDCASHCOST.LISTCASHAMOUNT>();
            }
            return this.listcashamount;
        }

        /**
         * Gets the value of the totalcashpaid property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanInput2 .MILESANDCASHCOST.TOTALCASHPAID }
         *     
         */
        public BookTripPlanInput2 .MILESANDCASHCOST.TOTALCASHPAID getTOTALCASHPAID() {
            return totalcashpaid;
        }

        /**
         * Sets the value of the totalcashpaid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanInput2 .MILESANDCASHCOST.TOTALCASHPAID }
         *     
         */
        public void setTOTALCASHPAID(BookTripPlanInput2 .MILESANDCASHCOST.TOTALCASHPAID value) {
            this.totalcashpaid = value;
        }

        /**
         * Gets the value of the resultingmiles property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTSINTEGERTYPE }
         *     
         */
        public AMOUNTSINTEGERTYPE getRESULTINGMILES() {
            return resultingmiles;
        }

        /**
         * Sets the value of the resultingmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTSINTEGERTYPE }
         *     
         */
        public void setRESULTINGMILES(AMOUNTSINTEGERTYPE value) {
            this.resultingmiles = value;
        }

        /**
         * Gets the value of the convertedamount property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTSTYPE }
         *     
         */
        public AMOUNTSTYPE getCONVERTEDAMOUNT() {
            return convertedamount;
        }

        /**
         * Sets the value of the convertedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTSTYPE }
         *     
         */
        public void setCONVERTEDAMOUNT(AMOUNTSTYPE value) {
            this.convertedamount = value;
        }

        /**
         * Gets the value of the nonconvertedamount property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTBREAKDOWN }
         *     
         */
        public AMOUNTBREAKDOWN getNONCONVERTEDAMOUNT() {
            return nonconvertedamount;
        }

        /**
         * Sets the value of the nonconvertedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTBREAKDOWN }
         *     
         */
        public void setNONCONVERTEDAMOUNT(AMOUNTBREAKDOWN value) {
            this.nonconvertedamount = value;
        }

        /**
         * Gets the value of the convertedcashmiles property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONVERTEDCASHMILES() {
            return convertedcashmiles;
        }

        /**
         * Sets the value of the convertedcashmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONVERTEDCASHMILES(Object value) {
            this.convertedcashmiles = value;
        }

        /**
         * Gets the value of the minimummilescost property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMINIMUMMILESCOST() {
            return minimummilescost;
        }

        /**
         * Sets the value of the minimummilescost property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMINIMUMMILESCOST(Object value) {
            this.minimummilescost = value;
        }

        /**
         * Gets the value of the sliderrankposition property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSLIDERRANKPOSITION() {
            return sliderrankposition;
        }

        /**
         * Sets the value of the sliderrankposition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSLIDERRANKPOSITION(Integer value) {
            this.sliderrankposition = value;
        }

        /**
         * Gets the value of the numberofsliderranks property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNUMBEROFSLIDERRANKS() {
            return numberofsliderranks;
        }

        /**
         * Sets the value of the numberofsliderranks property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNUMBEROFSLIDERRANKS(Integer value) {
            this.numberofsliderranks = value;
        }

        /**
         * Gets the value of the slidertype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSLIDERTYPE() {
            return slidertype;
        }

        /**
         * Sets the value of the slidertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSLIDERTYPE(String value) {
            this.slidertype = value;
        }

        /**
         * Gets the value of the listoption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listoption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTOPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTOPTION() {
            if (listoption == null) {
                listoption = new ArrayList<String>();
            }
            return this.listoption;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanInput2 .MILESANDCASHCOST.CURRENCY }
         *     
         */
        public BookTripPlanInput2 .MILESANDCASHCOST.CURRENCY getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanInput2 .MILESANDCASHCOST.CURRENCY }
         *     
         */
        public void setCURRENCY(BookTripPlanInput2 .MILESANDCASHCOST.CURRENCY value) {
            this.currency = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "code",
            "name"
        })
        public static class CURRENCY
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected String code;
            @XmlElement(name = "NAME")
            protected String name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
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
         *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="SELECTED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
            "boundid",
            "selectedamount"
        })
        public static class LISTCASHAMOUNT
            implements Serializable
        {

            @XmlElement(name = "BOUND_ID", required = true)
            protected BigInteger boundid;
            @XmlElement(name = "SELECTED_AMOUNT")
            protected float selectedamount;

            /**
             * Gets the value of the boundid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBOUNDID() {
                return boundid;
            }

            /**
             * Sets the value of the boundid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBOUNDID(BigInteger value) {
                this.boundid = value;
            }

            /**
             * Gets the value of the selectedamount property.
             * 
             */
            public float getSELECTEDAMOUNT() {
                return selectedamount;
            }

            /**
             * Sets the value of the selectedamount property.
             * 
             */
            public void setSELECTEDAMOUNT(float value) {
                this.selectedamount = value;
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
         *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
            "boundid",
            "amount"
        })
        public static class LISTMILESAMOUNT
            implements Serializable
        {

            @XmlElement(name = "BOUND_ID", required = true)
            protected BigInteger boundid;
            @XmlElement(name = "AMOUNT", required = true)
            protected BigInteger amount;

            /**
             * Gets the value of the boundid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBOUNDID() {
                return boundid;
            }

            /**
             * Sets the value of the boundid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBOUNDID(BigInteger value) {
                this.boundid = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAMOUNT() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAMOUNT(BigInteger value) {
                this.amount = value;
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
         *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
            "totalamount"
        })
        public static class TOTALCASHPAID
            implements Serializable
        {

            @XmlElement(name = "TOTAL_AMOUNT")
            protected float totalamount;

            /**
             * Gets the value of the totalamount property.
             * 
             */
            public float getTOTALAMOUNT() {
                return totalamount;
            }

            /**
             * Sets the value of the totalamount property.
             * 
             */
            public void setTOTALAMOUNT(float value) {
                this.totalamount = value;
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
     *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="AMOP_CONFIRMATION" type="{}AMOP_CONFIRMATION_Type" minOccurs="0"/&gt;
     *         &lt;element name="FRAUD_DATA" type="{}FRAUD_DATA_Type" minOccurs="0"/&gt;
     *         &lt;element name="PAYMENT_PROVIDER" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "amopconfirmation",
        "frauddata",
        "paymentprovider"
    })
    public static class PAYMENT
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "AMOP_CONFIRMATION")
        protected AMOPCONFIRMATIONType amopconfirmation;
        @XmlElement(name = "FRAUD_DATA")
        protected FRAUDDATAType frauddata;
        @XmlElement(name = "PAYMENT_PROVIDER")
        protected String paymentprovider;

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
         * Gets the value of the amopconfirmation property.
         * 
         * @return
         *     possible object is
         *     {@link AMOPCONFIRMATIONType }
         *     
         */
        public AMOPCONFIRMATIONType getAMOPCONFIRMATION() {
            return amopconfirmation;
        }

        /**
         * Sets the value of the amopconfirmation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOPCONFIRMATIONType }
         *     
         */
        public void setAMOPCONFIRMATION(AMOPCONFIRMATIONType value) {
            this.amopconfirmation = value;
        }

        /**
         * Gets the value of the frauddata property.
         * 
         * @return
         *     possible object is
         *     {@link FRAUDDATAType }
         *     
         */
        public FRAUDDATAType getFRAUDDATA() {
            return frauddata;
        }

        /**
         * Sets the value of the frauddata property.
         * 
         * @param value
         *     allowed object is
         *     {@link FRAUDDATAType }
         *     
         */
        public void setFRAUDDATA(FRAUDDATAType value) {
            this.frauddata = value;
        }

        /**
         * Gets the value of the paymentprovider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTPROVIDER() {
            return paymentprovider;
        }

        /**
         * Sets the value of the paymentprovider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTPROVIDER(String value) {
            this.paymentprovider = value;
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
     *         &lt;element name="LIST_PROMOTION_CODE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "listpromotioncode",
        "type"
    })
    public static class PROMOTION
        implements Serializable
    {

        @XmlElement(name = "LIST_PROMOTION_CODE", required = true)
        protected BookTripPlanInput2 .PROMOTION.LISTPROMOTIONCODE listpromotioncode;
        @XmlElement(name = "TYPE", required = true)
        protected Object type;

        /**
         * Gets the value of the listpromotioncode property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanInput2 .PROMOTION.LISTPROMOTIONCODE }
         *     
         */
        public BookTripPlanInput2 .PROMOTION.LISTPROMOTIONCODE getLISTPROMOTIONCODE() {
            return listpromotioncode;
        }

        /**
         * Sets the value of the listpromotioncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanInput2 .PROMOTION.LISTPROMOTIONCODE }
         *     
         */
        public void setLISTPROMOTIONCODE(BookTripPlanInput2 .PROMOTION.LISTPROMOTIONCODE value) {
            this.listpromotioncode = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
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
         *         &lt;element name="CODE_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "codevalue"
        })
        public static class LISTPROMOTIONCODE
            implements Serializable
        {

            @XmlElement(name = "CODE_VALUE", required = true)
            protected Object codevalue;

            /**
             * Gets the value of the codevalue property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCODEVALUE() {
                return codevalue;
            }

            /**
             * Sets the value of the codevalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCODEVALUE(Object value) {
                this.codevalue = value;
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
     *         &lt;element name="REQUEST_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IP_ADDRESSES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IS_SSL_REQUEST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CLIENT_REFERRER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "requesturl",
        "ipaddresses",
        "issslrequest",
        "clientreferrer"
    })
    public static class REQUESTINFO
        implements Serializable
    {

        @XmlElement(name = "REQUEST_URL")
        protected String requesturl;
        @XmlElement(name = "IP_ADDRESSES")
        protected List<String> ipaddresses;
        @XmlElement(name = "IS_SSL_REQUEST")
        protected Boolean issslrequest;
        @XmlElement(name = "CLIENT_REFERRER")
        protected String clientreferrer;

        /**
         * Gets the value of the requesturl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTURL() {
            return requesturl;
        }

        /**
         * Sets the value of the requesturl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTURL(String value) {
            this.requesturl = value;
        }

        /**
         * Gets the value of the ipaddresses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ipaddresses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIPADDRESSES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIPADDRESSES() {
            if (ipaddresses == null) {
                ipaddresses = new ArrayList<String>();
            }
            return this.ipaddresses;
        }

        /**
         * Gets the value of the issslrequest property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISSSLREQUEST() {
            return issslrequest;
        }

        /**
         * Sets the value of the issslrequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISSSLREQUEST(Boolean value) {
            this.issslrequest = value;
        }

        /**
         * Gets the value of the clientreferrer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLIENTREFERRER() {
            return clientreferrer;
        }

        /**
         * Sets the value of the clientreferrer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLIENTREFERRER(String value) {
            this.clientreferrer = value;
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
     *         &lt;element name="TYPE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="HOTEL"/&gt;
     *               &lt;enumeration value="CAR"/&gt;
     *               &lt;enumeration value="EXTERNAL_PROVIDER"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="HOTEL_GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "itemid",
        "travellerid",
        "hotelgroupid"
    })
    public static class TRAVELLERASSOCIATION
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "ITEM_ID")
        protected BigInteger itemid;
        @XmlElement(name = "TRAVELLER_ID")
        protected BigInteger travellerid;
        @XmlElement(name = "HOTEL_GROUP_ID")
        protected BigInteger hotelgroupid;

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
         * Gets the value of the itemid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getITEMID() {
            return itemid;
        }

        /**
         * Sets the value of the itemid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setITEMID(BigInteger value) {
            this.itemid = value;
        }

        /**
         * Gets the value of the travellerid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTRAVELLERID() {
            return travellerid;
        }

        /**
         * Sets the value of the travellerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTRAVELLERID(BigInteger value) {
            this.travellerid = value;
        }

        /**
         * Gets the value of the hotelgroupid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHOTELGROUPID() {
            return hotelgroupid;
        }

        /**
         * Sets the value of the hotelgroupid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHOTELGROUPID(BigInteger value) {
            this.hotelgroupid = value;
        }

    }

}
