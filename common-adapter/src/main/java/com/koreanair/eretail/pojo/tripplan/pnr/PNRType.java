
package com.koreanair.eretail.pojo.tripplan.pnr;

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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.CurrencyType;
import com.koreanair.eretail.pojo.farecommon.farecommon.FEEType;
import com.koreanair.eretail.pojo.tripplan.common.common_air_pricing.TicketType;
import com.koreanair.eretail.pojo.tripplan.common.common_document.FAFHType;
import com.koreanair.eretail.pojo.tripplan.common.common_document.FOType;
import com.koreanair.eretail.pojo.tripplan.common.common_document.ListETicketRecord;
import com.koreanair.eretail.pojo.tripplan.common.common_document.ListMiscDocument;
import com.koreanair.eretail.pojo.tripplan.common.common_document.ListMiscDocumentGroup;
import com.koreanair.eretail.pojo.tripplan.common.common_document.MiscPricingRecordType;
import com.koreanair.eretail.pojo.tripplan.common.common_fare.FareType;
import com.koreanair.eretail.pojo.tripplan.common.common_fare.FareTypeBreakDown;
import com.koreanair.eretail.pojo.tripplan.common.common_pnr.ListArrivalUnknownSegment;
import com.koreanair.eretail.pojo.tripplan.rail_data.RAILDATA;
import com.koreanair.eretail.pojo.tripplan.traveller_information.TRAVELLERINFORMATION;
import org.w3c.dom.Element;


/**
 * PNRs created for this Trip Plan 
 * 
 * <p>Java class for PNR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNR_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="TYPE_ELEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRODUCT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_HOMOGENEOUS_CHECK" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IS_HOMOGENEOUS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRIMARY_REC_LOC" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;group ref="{}ReservationIdGroup"/&gt;
 *         &lt;element name="B_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="B_LOCATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CITY_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_LOCATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CITY_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAN_BE_DELETED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AIRLINE_REC_LOC" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AIRLINE_REC_LOC" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AIRLINE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AIRLINE_REC_LOC" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APPLICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NICKNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HEADER_TST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TICKET" type="{}ticketType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_REMARKS" type="{}FareRemarkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ISSUING_OFFICE_COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ISSUING_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FO" type="{}FO_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}TicketPNR" minOccurs="0"/&gt;
 *         &lt;element name="IS_REPRICED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_RE_ISSUED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_REFUNDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_REQUESTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="INITIAL_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RESPONSIBLE_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="POS_DETAILS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OWNER" type="{}posType" minOccurs="0"/&gt;
 *                   &lt;element name="CREATOR" type="{}posType" minOccurs="0"/&gt;
 *                   &lt;element name="LAST_UPDATOR" type="{}posType" minOccurs="0"/&gt;
 *                   &lt;element name="ONLINE" type="{}posType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEFAULT_QUEUING_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QUEUES" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="QUEUE_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_ACTION_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_AUTHORIZE_OFFICES" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QUEUE_MODE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="QUEUE_DATE_RANGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBER_OF_ITEMS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="IS_LAST_ITEM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FARE_ELEMENT" type="{}fareType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUES_MGDS" type="{}QUEUES_MGDS_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IS_TEST_PNR_ON_PRODUCTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}RAIL_DATA" minOccurs="0"/&gt;
 *         &lt;element name="CREATION_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXPIRE_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXPIRE_DATE_GMT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TICKET_STATUS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="END_TRANSACT_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CARD_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CABIN" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_FAMILY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CREATION_MODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TRIP_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="REDEMPTION_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RESTRICTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PREVIOUS_FARE_ELEMENT" type="{}fareType" minOccurs="0"/&gt;
 *         &lt;element name="PREVIOUS_MILES_COST" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_INFORMATION" type="{}TRAVELLER_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IS_ON_WAITLIST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BOOL_REFUNDABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonPnr" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_PNR_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{}PriceWithFeesGroup"/&gt;
 *                   &lt;element name="TOTAL_REBOOK_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_FARE_ELEMENT_BREAKDOWN" type="{}fareTypeBreakDown" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ARRIVAL_UNKNOWN_SEGMENT" type="{}listArrivalUnknownSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MISC_DOCUMENT" type="{}listMiscDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MISC_DOCUMENT_GROUP" type="{}listMiscDocumentGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MCO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TEXT_INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TAX" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TAX_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCY" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MCO_TKT_NB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MCO_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IS_OLD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FARE_AMOUNT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CURRENCY" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="REISSUE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_MISC_PRICING_RECORD" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}miscPricingRecordType"&gt;
 *                 &lt;attribute name="technicalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_TASF" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}miscPricingRecordType"&gt;
 *                 &lt;attribute name="technicalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INVOICE_DATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AIR_FARE_FROM_REMARKS" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SEGMENT_ASSOCIATION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element name="LIST_EXPIRE_DATE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOUR_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PREFERRED_FARE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CREATOR_AGENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAST_USER_AGENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPDATE_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEFAULT_QUEUE_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="DEFAULT_TICKETING_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="DEFAULT_OPTION_ELEMENT_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="HEADER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IS_RLR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_AXR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_PTA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_TPM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_HFR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_MSC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_RLP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_CPC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_CLM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_TST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_NHP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_NCP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_DCS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_DTA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_TSM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_CTT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_TC_BIZ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_CC_BOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_CC_SVC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_OFR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_ETR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_DOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_INT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_TIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_NDT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_OBD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_OBS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_OPD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_OPE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IS_GROUP_PNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GROUP_PNR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GROUP_PNR_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="NB_TOTAL_SEATS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="NB_ASSIGNED_SEATS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="GROUP_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="NB_ORIGINAL_NAMES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="NB_CANCELLED_NAMES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="NB_SPLIT_NAMES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_TICKETING_ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ARRANGEMENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="DATE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TICKETING_OFFICE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="IS_ETICKETED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="AIRLINE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
 *         &lt;element name="LIST_SERVICE_REQUEST" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SERVICE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="SERVICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="SERVICE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="AIRLINE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="CHARGEABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PACK_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="IS_PACK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_ADDITIONAL_SEAT_LINKED" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ADDITIONAL_SEAT_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="E_LOCATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="B_LOCATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BOOKING_ACTION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="NVA" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="DETAILS" type="{}ServiceRequestDetailsType" minOccurs="0"/&gt;
 *                   &lt;element name="RFIC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="RFISC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_BALANCE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IS_APU_PERFORMED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_ASSOCIATED_PNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TPOS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AWARD_CODE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UPGRADE_STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENT_SECURITY" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="RECEIVER_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_RECEIVER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RECEIVER_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="ACCESS_RIGHTS" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
 *         &lt;element name="LIST_PROGRAM_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PROGRAM_TYPE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="PAF"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_COMMAND_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DCS_DATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_LEG" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LEG_POSITION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="PAX_INFO"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PAX_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="PAX_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CHECK_IN_INFO"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="IS_CHECKED_IN" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BAGGAGE_INFO"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="IS_DROPPED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BOARDING_INFO"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="IS_BOARDED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="REGRADE_INFO" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="IS_INVOLUNTARY_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                       &lt;element name="IS_INVOLUNTARY_DOWNGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                       &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
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
 *         &lt;element name="PNR_OPTIONS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IS_SSR_AUTO_PRICING_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="DYNAMIC_WAIVER_ELIGIBILITY" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="WAIVER_APPLIES"/&gt;
 *                         &lt;enumeration value="NO_WAIVER_APPLIES"/&gt;
 *                         &lt;enumeration value="UNKNOWN"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AIR_PNR_MARKET" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="AIR_MARKET_POS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="AIR_MARKET_POT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PNR_IN_MODIFICATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SIMULTANEOUS_CHANGE_DETECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_READ_ONLY_PNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "PNR_Type", propOrder = {
    "type",
    "typeelem",
    "listproduct",
    "listhomogeneouscheck",
    "primaryrecloc",
    "recloc",
    "numericrecloc",
    "listreservationnumber",
    "bdate",
    "edate",
    "blocation",
    "elocation",
    "notes",
    "canbedeleted",
    "airlinerecloc",
    "listairlinerecloc",
    "application",
    "nickname",
    "headertst",
    "listticket",
    "listfareremarks",
    "issuingofficecountrycode",
    "issuingofficeid",
    "listfo",
    "ticketingmethod",
    "ticketed",
    "ticketedandnopnrdiscrepancy",
    "ticketingerror",
    "listeticketrecord",
    "listfafh",
    "isrepriced",
    "isreissued",
    "isrefunded",
    "paymentrequested",
    "officeid",
    "initialofficeid",
    "responsibleofficeid",
    "posdetails",
    "defaultqueuingofficeid",
    "queuedate",
    "queues",
    "queuemode",
    "fareelement",
    "queuesmgds",
    "istestpnronproduction",
    "raildata",
    "creationdate",
    "expiredate",
    "expiredategmt",
    "bs",
    "ticketstatus",
    "endtransactdate",
    "cardnumber",
    "cabin",
    "farefamily",
    "creationmode",
    "triptype",
    "bookingtype",
    "redemptiontype",
    "restriction",
    "previousfareelement",
    "previousmilescost",
    "listtravellerinformation",
    "isonwaitlist",
    "boolrefundable",
    "gds",
    "passgds",
    "pnrid",
    "deletedelement",
    "initialelement",
    "segmenttatoo",
    "tatooother",
    "externaldependencies",
    "tickettype",
    "listpnrprice",
    "listfareelementbreakdown",
    "listarrivalunknownsegment",
    "listmiscdocument",
    "listmiscdocumentgroup",
    "listmco",
    "listmiscpricingrecord",
    "listtasf",
    "invoicedata",
    "listexpiredate",
    "tourcode",
    "preferredfare",
    "creatoragentid",
    "lastuseragentid",
    "updatedate",
    "defaultqueueofficeid",
    "defaultticketingofficeid",
    "defaultoptionelementofficeid",
    "header",
    "isgrouppnr",
    "grouppnr",
    "listticketingelement",
    "listservicerequest",
    "totalbalance",
    "isapuperformed",
    "isassociatedpnr",
    "tpos",
    "awardcode",
    "upgradestate",
    "listelementsecurity",
    "listprograminformation",
    "listcommandinfo",
    "dcsdata",
    "pnroptions",
    "pnrinmodification",
    "simultaneouschangedetected",
    "isreadonlypnr"
})
public class PNRType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "TYPE_ELEM")
    protected String typeelem;
    @XmlElement(name = "LIST_PRODUCT")
    protected List<PNRType.LISTPRODUCT> listproduct;
    @XmlElement(name = "LIST_HOMOGENEOUS_CHECK")
    protected List<PNRType.LISTHOMOGENEOUSCHECK> listhomogeneouscheck;
    @XmlElement(name = "PRIMARY_REC_LOC")
    protected String primaryrecloc;
    @XmlElement(name = "REC_LOC")
    protected String recloc;
    @XmlElement(name = "NUMERIC_REC_LOC")
    protected String numericrecloc;
    @XmlElement(name = "LIST_RESERVATION_NUMBER")
    protected List<PNRType.LISTRESERVATIONNUMBER> listreservationnumber;
    @XmlElement(name = "B_DATE")
    protected PNRType.BDATE bdate;
    @XmlElement(name = "E_DATE")
    protected PNRType.EDATE edate;
    @XmlElement(name = "B_LOCATION")
    protected PNRType.BLOCATION blocation;
    @XmlElement(name = "E_LOCATION")
    protected PNRType.ELOCATION elocation;
    @XmlElement(name = "NOTES")
    protected String notes;
    @XmlElement(name = "CAN_BE_DELETED")
    protected Boolean canbedeleted;
    @XmlElement(name = "AIRLINE_REC_LOC")
    protected String airlinerecloc;
    @XmlElement(name = "LIST_AIRLINE_REC_LOC")
    protected List<PNRType.LISTAIRLINERECLOC> listairlinerecloc;
    @XmlElement(name = "APPLICATION")
    protected String application;
    @XmlElement(name = "NICKNAME")
    protected String nickname;
    @XmlElement(name = "HEADER_TST")
    protected Boolean headertst;
    @XmlElement(name = "LIST_TICKET")
    protected List<TicketType> listticket;
    @XmlElement(name = "LIST_FARE_REMARKS")
    protected List<FareRemarkType> listfareremarks;
    @XmlElement(name = "ISSUING_OFFICE_COUNTRY_CODE")
    protected String issuingofficecountrycode;
    @XmlElement(name = "ISSUING_OFFICE_ID")
    protected String issuingofficeid;
    @XmlElement(name = "LIST_FO")
    protected List<FOType> listfo;
    @XmlElement(name = "TICKETING_METHOD")
    protected String ticketingmethod;
    @XmlElement(name = "TICKETED")
    protected Boolean ticketed;
    @XmlElement(name = "TICKETED_AND_NO_PNR_DISCREPANCY")
    protected Boolean ticketedandnopnrdiscrepancy;
    @XmlElement(name = "TICKETING_ERROR")
    protected String ticketingerror;
    @XmlElement(name = "LIST_ETICKET_RECORD")
    protected List<ListETicketRecord> listeticketrecord;
    @XmlElement(name = "LIST_FAFH")
    protected List<FAFHType> listfafh;
    @XmlElement(name = "IS_REPRICED")
    protected Boolean isrepriced;
    @XmlElement(name = "IS_RE_ISSUED")
    protected Boolean isreissued;
    @XmlElement(name = "IS_REFUNDED")
    protected Boolean isrefunded;
    @XmlElement(name = "PAYMENT_REQUESTED")
    protected Boolean paymentrequested;
    @XmlElement(name = "OFFICE_ID")
    protected String officeid;
    @XmlElement(name = "INITIAL_OFFICE_ID")
    protected String initialofficeid;
    @XmlElement(name = "RESPONSIBLE_OFFICE_ID")
    protected String responsibleofficeid;
    @XmlElement(name = "POS_DETAILS")
    protected PNRType.POSDETAILS posdetails;
    @XmlElement(name = "DEFAULT_QUEUING_OFFICE_ID")
    protected String defaultqueuingofficeid;
    @XmlElement(name = "QUEUE_DATE")
    protected PNRType.QUEUEDATE queuedate;
    @XmlElement(name = "QUEUES")
    protected List<PNRType.QUEUES> queues;
    @XmlElement(name = "QUEUE_MODE")
    protected PNRType.QUEUEMODE queuemode;
    @XmlElement(name = "FARE_ELEMENT")
    protected FareType fareelement;
    @XmlElement(name = "QUEUES_MGDS")
    protected List<QUEUESMGDSTYPE> queuesmgds;
    @XmlElement(name = "IS_TEST_PNR_ON_PRODUCTION")
    protected Boolean istestpnronproduction;
    @XmlElement(name = "RAIL_DATA")
    protected RAILDATA raildata;
    @XmlElement(name = "CREATION_DATE")
    protected PNRType.CREATIONDATE creationdate;
    @XmlElement(name = "EXPIRE_DATE")
    protected PNRType.EXPIREDATE expiredate;
    @XmlElement(name = "EXPIRE_DATE_GMT")
    protected PNRType.EXPIREDATEGMT expiredategmt;
    @XmlElement(name = "BS")
    protected PNRType.BS bs;
    @XmlElement(name = "TICKET_STATUS")
    protected PNRType.TICKETSTATUS ticketstatus;
    @XmlElement(name = "END_TRANSACT_DATE")
    protected PNRType.ENDTRANSACTDATE endtransactdate;
    @XmlElement(name = "CARD_NUMBER")
    protected String cardnumber;
    @XmlElement(name = "CABIN")
    protected String cabin;
    @XmlElement(name = "FARE_FAMILY")
    protected String farefamily;
    @XmlElement(name = "CREATION_MODE")
    protected String creationmode;
    @XmlElement(name = "TRIP_TYPE")
    protected String triptype;
    @XmlElement(name = "BOOKING_TYPE")
    protected String bookingtype;
    @XmlElement(name = "REDEMPTION_TYPE")
    protected String redemptiontype;
    @XmlElement(name = "RESTRICTION")
    protected Boolean restriction;
    @XmlElement(name = "PREVIOUS_FARE_ELEMENT")
    protected FareType previousfareelement;
    @XmlElement(name = "PREVIOUS_MILES_COST")
    protected BigInteger previousmilescost;
    @XmlElement(name = "LIST_TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> listtravellerinformation;
    @XmlElement(name = "IS_ON_WAITLIST")
    protected Boolean isonwaitlist;
    @XmlElement(name = "BOOL_REFUNDABLE")
    protected Boolean boolrefundable;
    @XmlElement(name = "GDS")
    protected String gds;
    @XmlElement(name = "PASS_GDS")
    protected String passgds;
    @XmlElement(name = "PNR_ID")
    protected BigInteger pnrid;
    @XmlElement(name = "DELETED_ELEMENT")
    protected Boolean deletedelement;
    @XmlElement(name = "INITIAL_ELEMENT")
    protected Boolean initialelement;
    @XmlElement(name = "SEGMENT_TATOO")
    protected BigInteger segmenttatoo;
    @XmlElement(name = "TATOO_OTHER")
    protected BigInteger tatooother;
    @XmlElement(name = "EXTERNAL_DEPENDENCIES")
    protected PNRType.EXTERNALDEPENDENCIES externaldependencies;
    @XmlElement(name = "TICKET_TYPE")
    protected PNRType.TICKETTYPE tickettype;
    @XmlElement(name = "LIST_PNR_PRICE")
    protected List<PNRType.LISTPNRPRICE> listpnrprice;
    @XmlElement(name = "LIST_FARE_ELEMENT_BREAKDOWN")
    protected List<FareTypeBreakDown> listfareelementbreakdown;
    @XmlElement(name = "LIST_ARRIVAL_UNKNOWN_SEGMENT")
    protected List<ListArrivalUnknownSegment> listarrivalunknownsegment;
    @XmlElement(name = "LIST_MISC_DOCUMENT")
    protected List<ListMiscDocument> listmiscdocument;
    @XmlElement(name = "LIST_MISC_DOCUMENT_GROUP")
    protected List<ListMiscDocumentGroup> listmiscdocumentgroup;
    @XmlElement(name = "LIST_MCO")
    protected List<PNRType.LISTMCO> listmco;
    @XmlElement(name = "LIST_MISC_PRICING_RECORD")
    protected List<PNRType.LISTMISCPRICINGRECORD> listmiscpricingrecord;
    @XmlElement(name = "LIST_TASF")
    protected List<PNRType.LISTTASF> listtasf;
    @XmlElement(name = "INVOICE_DATA")
    protected PNRType.INVOICEDATA invoicedata;
    @XmlElement(name = "LIST_EXPIRE_DATE")
    protected List<PNRType.LISTEXPIREDATE> listexpiredate;
    @XmlElement(name = "TOUR_CODE")
    protected String tourcode;
    @XmlElement(name = "PREFERRED_FARE")
    protected Boolean preferredfare;
    @XmlElement(name = "CREATOR_AGENT_ID")
    protected String creatoragentid;
    @XmlElement(name = "LAST_USER_AGENT_ID")
    protected String lastuseragentid;
    @XmlElement(name = "UPDATE_DATE")
    protected PNRType.UPDATEDATE updatedate;
    @XmlElement(name = "DEFAULT_QUEUE_OFFICE_ID")
    protected String defaultqueueofficeid;
    @XmlElement(name = "DEFAULT_TICKETING_OFFICE_ID")
    protected String defaultticketingofficeid;
    @XmlElement(name = "DEFAULT_OPTION_ELEMENT_OFFICE_ID")
    protected String defaultoptionelementofficeid;
    @XmlElement(name = "HEADER")
    protected PNRType.HEADER header;
    @XmlElement(name = "IS_GROUP_PNR")
    protected Boolean isgrouppnr;
    @XmlElement(name = "GROUP_PNR")
    protected PNRType.GROUPPNR grouppnr;
    @XmlElement(name = "LIST_TICKETING_ELEMENT")
    protected List<PNRType.LISTTICKETINGELEMENT> listticketingelement;
    @XmlElement(name = "LIST_SERVICE_REQUEST")
    protected List<PNRType.LISTSERVICEREQUEST> listservicerequest;
    @XmlElement(name = "TOTAL_BALANCE")
    protected PNRType.TOTALBALANCE totalbalance;
    @XmlElement(name = "IS_APU_PERFORMED")
    protected Boolean isapuperformed;
    @XmlElement(name = "IS_ASSOCIATED_PNR")
    protected Boolean isassociatedpnr;
    @XmlElement(name = "TPOS")
    protected PNRType.TPOS tpos;
    @XmlElement(name = "AWARD_CODE")
    protected PNRType.AWARDCODE awardcode;
    @XmlElement(name = "UPGRADE_STATE")
    protected String upgradestate;
    @XmlElement(name = "LIST_ELEMENT_SECURITY")
    protected List<PNRType.LISTELEMENTSECURITY> listelementsecurity;
    @XmlElement(name = "LIST_PROGRAM_INFORMATION")
    protected List<PNRType.LISTPROGRAMINFORMATION> listprograminformation;
    @XmlElement(name = "LIST_COMMAND_INFO")
    protected List<PNRType.LISTCOMMANDINFO> listcommandinfo;
    @XmlElement(name = "DCS_DATA")
    protected PNRType.DCSDATA dcsdata;
    @XmlElement(name = "PNR_OPTIONS")
    protected PNRType.PNROPTIONS pnroptions;
    @XmlElement(name = "PNR_IN_MODIFICATION")
    protected Boolean pnrinmodification;
    @XmlElement(name = "SIMULTANEOUS_CHANGE_DETECTED")
    protected Boolean simultaneouschangedetected;
    @XmlElement(name = "IS_READ_ONLY_PNR")
    protected Boolean isreadonlypnr;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the typeelem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEELEM() {
        return typeelem;
    }

    /**
     * Sets the value of the typeelem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEELEM(String value) {
        this.typeelem = value;
    }

    /**
     * Gets the value of the listproduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRODUCT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTPRODUCT }
     * 
     * 
     */
    public List<PNRType.LISTPRODUCT> getLISTPRODUCT() {
        if (listproduct == null) {
            listproduct = new ArrayList<PNRType.LISTPRODUCT>();
        }
        return this.listproduct;
    }

    /**
     * Gets the value of the listhomogeneouscheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listhomogeneouscheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTHOMOGENEOUSCHECK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTHOMOGENEOUSCHECK }
     * 
     * 
     */
    public List<PNRType.LISTHOMOGENEOUSCHECK> getLISTHOMOGENEOUSCHECK() {
        if (listhomogeneouscheck == null) {
            listhomogeneouscheck = new ArrayList<PNRType.LISTHOMOGENEOUSCHECK>();
        }
        return this.listhomogeneouscheck;
    }

    /**
     * Gets the value of the primaryrecloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMARYRECLOC() {
        return primaryrecloc;
    }

    /**
     * Sets the value of the primaryrecloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMARYRECLOC(String value) {
        this.primaryrecloc = value;
    }

    /**
     * Gets the value of the recloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECLOC() {
        return recloc;
    }

    /**
     * Sets the value of the recloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECLOC(String value) {
        this.recloc = value;
    }

    /**
     * Gets the value of the numericrecloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERICRECLOC() {
        return numericrecloc;
    }

    /**
     * Sets the value of the numericrecloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERICRECLOC(String value) {
        this.numericrecloc = value;
    }

    /**
     * Gets the value of the listreservationnumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listreservationnumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRESERVATIONNUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTRESERVATIONNUMBER }
     * 
     * 
     */
    public List<PNRType.LISTRESERVATIONNUMBER> getLISTRESERVATIONNUMBER() {
        if (listreservationnumber == null) {
            listreservationnumber = new ArrayList<PNRType.LISTRESERVATIONNUMBER>();
        }
        return this.listreservationnumber;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.BDATE }
     *     
     */
    public PNRType.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.BDATE }
     *     
     */
    public void setBDATE(PNRType.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.EDATE }
     *     
     */
    public PNRType.EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.EDATE }
     *     
     */
    public void setEDATE(PNRType.EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.BLOCATION }
     *     
     */
    public PNRType.BLOCATION getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.BLOCATION }
     *     
     */
    public void setBLOCATION(PNRType.BLOCATION value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.ELOCATION }
     *     
     */
    public PNRType.ELOCATION getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.ELOCATION }
     *     
     */
    public void setELOCATION(PNRType.ELOCATION value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTES() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTES(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the canbedeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCANBEDELETED() {
        return canbedeleted;
    }

    /**
     * Sets the value of the canbedeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCANBEDELETED(Boolean value) {
        this.canbedeleted = value;
    }

    /**
     * Gets the value of the airlinerecloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINERECLOC() {
        return airlinerecloc;
    }

    /**
     * Sets the value of the airlinerecloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINERECLOC(String value) {
        this.airlinerecloc = value;
    }

    /**
     * Gets the value of the listairlinerecloc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listairlinerecloc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAIRLINERECLOC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTAIRLINERECLOC }
     * 
     * 
     */
    public List<PNRType.LISTAIRLINERECLOC> getLISTAIRLINERECLOC() {
        if (listairlinerecloc == null) {
            listairlinerecloc = new ArrayList<PNRType.LISTAIRLINERECLOC>();
        }
        return this.listairlinerecloc;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICATION() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICATION(String value) {
        this.application = value;
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
     * Gets the value of the headertst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHEADERTST() {
        return headertst;
    }

    /**
     * Sets the value of the headertst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHEADERTST(Boolean value) {
        this.headertst = value;
    }

    /**
     * Gets the value of the listticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketType }
     * 
     * 
     */
    public List<TicketType> getLISTTICKET() {
        if (listticket == null) {
            listticket = new ArrayList<TicketType>();
        }
        return this.listticket;
    }

    /**
     * Gets the value of the listfareremarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareremarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREREMARKS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRemarkType }
     * 
     * 
     */
    public List<FareRemarkType> getLISTFAREREMARKS() {
        if (listfareremarks == null) {
            listfareremarks = new ArrayList<FareRemarkType>();
        }
        return this.listfareremarks;
    }

    /**
     * Gets the value of the issuingofficecountrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUINGOFFICECOUNTRYCODE() {
        return issuingofficecountrycode;
    }

    /**
     * Sets the value of the issuingofficecountrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUINGOFFICECOUNTRYCODE(String value) {
        this.issuingofficecountrycode = value;
    }

    /**
     * Gets the value of the issuingofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUINGOFFICEID() {
        return issuingofficeid;
    }

    /**
     * Sets the value of the issuingofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUINGOFFICEID(String value) {
        this.issuingofficeid = value;
    }

    /**
     * Gets the value of the listfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOType }
     * 
     * 
     */
    public List<FOType> getLISTFO() {
        if (listfo == null) {
            listfo = new ArrayList<FOType>();
        }
        return this.listfo;
    }

    /**
     * Gets the value of the ticketingmethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETINGMETHOD() {
        return ticketingmethod;
    }

    /**
     * Sets the value of the ticketingmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETINGMETHOD(String value) {
        this.ticketingmethod = value;
    }

    /**
     * Gets the value of the ticketed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTICKETED() {
        return ticketed;
    }

    /**
     * Sets the value of the ticketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTICKETED(Boolean value) {
        this.ticketed = value;
    }

    /**
     * Gets the value of the ticketedandnopnrdiscrepancy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTICKETEDANDNOPNRDISCREPANCY() {
        return ticketedandnopnrdiscrepancy;
    }

    /**
     * Sets the value of the ticketedandnopnrdiscrepancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTICKETEDANDNOPNRDISCREPANCY(Boolean value) {
        this.ticketedandnopnrdiscrepancy = value;
    }

    /**
     * Gets the value of the ticketingerror property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETINGERROR() {
        return ticketingerror;
    }

    /**
     * Sets the value of the ticketingerror property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETINGERROR(String value) {
        this.ticketingerror = value;
    }

    /**
     * Gets the value of the listeticketrecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeticketrecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTETICKETRECORD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListETicketRecord }
     * 
     * 
     */
    public List<ListETicketRecord> getLISTETICKETRECORD() {
        if (listeticketrecord == null) {
            listeticketrecord = new ArrayList<ListETicketRecord>();
        }
        return this.listeticketrecord;
    }

    /**
     * Gets the value of the listfafh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfafh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAFH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAFHType }
     * 
     * 
     */
    public List<FAFHType> getLISTFAFH() {
        if (listfafh == null) {
            listfafh = new ArrayList<FAFHType>();
        }
        return this.listfafh;
    }

    /**
     * Gets the value of the isrepriced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREPRICED() {
        return isrepriced;
    }

    /**
     * Sets the value of the isrepriced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREPRICED(Boolean value) {
        this.isrepriced = value;
    }

    /**
     * Gets the value of the isreissued property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREISSUED() {
        return isreissued;
    }

    /**
     * Sets the value of the isreissued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREISSUED(Boolean value) {
        this.isreissued = value;
    }

    /**
     * Gets the value of the isrefunded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREFUNDED() {
        return isrefunded;
    }

    /**
     * Sets the value of the isrefunded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREFUNDED(Boolean value) {
        this.isrefunded = value;
    }

    /**
     * Gets the value of the paymentrequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPAYMENTREQUESTED() {
        return paymentrequested;
    }

    /**
     * Sets the value of the paymentrequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPAYMENTREQUESTED(Boolean value) {
        this.paymentrequested = value;
    }

    /**
     * Gets the value of the officeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFICEID() {
        return officeid;
    }

    /**
     * Sets the value of the officeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFICEID(String value) {
        this.officeid = value;
    }

    /**
     * Gets the value of the initialofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINITIALOFFICEID() {
        return initialofficeid;
    }

    /**
     * Sets the value of the initialofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINITIALOFFICEID(String value) {
        this.initialofficeid = value;
    }

    /**
     * Gets the value of the responsibleofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEOFFICEID() {
        return responsibleofficeid;
    }

    /**
     * Sets the value of the responsibleofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEOFFICEID(String value) {
        this.responsibleofficeid = value;
    }

    /**
     * Gets the value of the posdetails property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.POSDETAILS }
     *     
     */
    public PNRType.POSDETAILS getPOSDETAILS() {
        return posdetails;
    }

    /**
     * Sets the value of the posdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.POSDETAILS }
     *     
     */
    public void setPOSDETAILS(PNRType.POSDETAILS value) {
        this.posdetails = value;
    }

    /**
     * Gets the value of the defaultqueuingofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTQUEUINGOFFICEID() {
        return defaultqueuingofficeid;
    }

    /**
     * Sets the value of the defaultqueuingofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTQUEUINGOFFICEID(String value) {
        this.defaultqueuingofficeid = value;
    }

    /**
     * Gets the value of the queuedate property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.QUEUEDATE }
     *     
     */
    public PNRType.QUEUEDATE getQUEUEDATE() {
        return queuedate;
    }

    /**
     * Sets the value of the queuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.QUEUEDATE }
     *     
     */
    public void setQUEUEDATE(PNRType.QUEUEDATE value) {
        this.queuedate = value;
    }

    /**
     * Gets the value of the queues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQUEUES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.QUEUES }
     * 
     * 
     */
    public List<PNRType.QUEUES> getQUEUES() {
        if (queues == null) {
            queues = new ArrayList<PNRType.QUEUES>();
        }
        return this.queues;
    }

    /**
     * Gets the value of the queuemode property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.QUEUEMODE }
     *     
     */
    public PNRType.QUEUEMODE getQUEUEMODE() {
        return queuemode;
    }

    /**
     * Sets the value of the queuemode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.QUEUEMODE }
     *     
     */
    public void setQUEUEMODE(PNRType.QUEUEMODE value) {
        this.queuemode = value;
    }

    /**
     * Gets the value of the fareelement property.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getFAREELEMENT() {
        return fareelement;
    }

    /**
     * Sets the value of the fareelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setFAREELEMENT(FareType value) {
        this.fareelement = value;
    }

    /**
     * Gets the value of the queuesmgds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queuesmgds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQUEUESMGDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QUEUESMGDSTYPE }
     * 
     * 
     */
    public List<QUEUESMGDSTYPE> getQUEUESMGDS() {
        if (queuesmgds == null) {
            queuesmgds = new ArrayList<QUEUESMGDSTYPE>();
        }
        return this.queuesmgds;
    }

    /**
     * Gets the value of the istestpnronproduction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISTESTPNRONPRODUCTION() {
        return istestpnronproduction;
    }

    /**
     * Sets the value of the istestpnronproduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISTESTPNRONPRODUCTION(Boolean value) {
        this.istestpnronproduction = value;
    }

    /**
     * Gets the value of the raildata property.
     * 
     * @return
     *     possible object is
     *     {@link RAILDATA }
     *     
     */
    public RAILDATA getRAILDATA() {
        return raildata;
    }

    /**
     * Sets the value of the raildata property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILDATA }
     *     
     */
    public void setRAILDATA(RAILDATA value) {
        this.raildata = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.CREATIONDATE }
     *     
     */
    public PNRType.CREATIONDATE getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.CREATIONDATE }
     *     
     */
    public void setCREATIONDATE(PNRType.CREATIONDATE value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the expiredate property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.EXPIREDATE }
     *     
     */
    public PNRType.EXPIREDATE getEXPIREDATE() {
        return expiredate;
    }

    /**
     * Sets the value of the expiredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.EXPIREDATE }
     *     
     */
    public void setEXPIREDATE(PNRType.EXPIREDATE value) {
        this.expiredate = value;
    }

    /**
     * Gets the value of the expiredategmt property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.EXPIREDATEGMT }
     *     
     */
    public PNRType.EXPIREDATEGMT getEXPIREDATEGMT() {
        return expiredategmt;
    }

    /**
     * Sets the value of the expiredategmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.EXPIREDATEGMT }
     *     
     */
    public void setEXPIREDATEGMT(PNRType.EXPIREDATEGMT value) {
        this.expiredategmt = value;
    }

    /**
     * Gets the value of the bs property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.BS }
     *     
     */
    public PNRType.BS getBS() {
        return bs;
    }

    /**
     * Sets the value of the bs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.BS }
     *     
     */
    public void setBS(PNRType.BS value) {
        this.bs = value;
    }

    /**
     * Gets the value of the ticketstatus property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.TICKETSTATUS }
     *     
     */
    public PNRType.TICKETSTATUS getTICKETSTATUS() {
        return ticketstatus;
    }

    /**
     * Sets the value of the ticketstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.TICKETSTATUS }
     *     
     */
    public void setTICKETSTATUS(PNRType.TICKETSTATUS value) {
        this.ticketstatus = value;
    }

    /**
     * Gets the value of the endtransactdate property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.ENDTRANSACTDATE }
     *     
     */
    public PNRType.ENDTRANSACTDATE getENDTRANSACTDATE() {
        return endtransactdate;
    }

    /**
     * Sets the value of the endtransactdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.ENDTRANSACTDATE }
     *     
     */
    public void setENDTRANSACTDATE(PNRType.ENDTRANSACTDATE value) {
        this.endtransactdate = value;
    }

    /**
     * Gets the value of the cardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNUMBER() {
        return cardnumber;
    }

    /**
     * Sets the value of the cardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNUMBER(String value) {
        this.cardnumber = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCABIN() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCABIN(String value) {
        this.cabin = value;
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
     * Gets the value of the creationmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATIONMODE() {
        return creationmode;
    }

    /**
     * Sets the value of the creationmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATIONMODE(String value) {
        this.creationmode = value;
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
     * Gets the value of the bookingtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGTYPE() {
        return bookingtype;
    }

    /**
     * Sets the value of the bookingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGTYPE(String value) {
        this.bookingtype = value;
    }

    /**
     * Gets the value of the redemptiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREDEMPTIONTYPE() {
        return redemptiontype;
    }

    /**
     * Sets the value of the redemptiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREDEMPTIONTYPE(String value) {
        this.redemptiontype = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRESTRICTION() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRESTRICTION(Boolean value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the previousfareelement property.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getPREVIOUSFAREELEMENT() {
        return previousfareelement;
    }

    /**
     * Sets the value of the previousfareelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setPREVIOUSFAREELEMENT(FareType value) {
        this.previousfareelement = value;
    }

    /**
     * Gets the value of the previousmilescost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPREVIOUSMILESCOST() {
        return previousmilescost;
    }

    /**
     * Sets the value of the previousmilescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPREVIOUSMILESCOST(BigInteger value) {
        this.previousmilescost = value;
    }

    /**
     * Gets the value of the listtravellerinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERINFORMATION }
     * 
     * 
     */
    public List<TRAVELLERINFORMATION> getLISTTRAVELLERINFORMATION() {
        if (listtravellerinformation == null) {
            listtravellerinformation = new ArrayList<TRAVELLERINFORMATION>();
        }
        return this.listtravellerinformation;
    }

    /**
     * Gets the value of the isonwaitlist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISONWAITLIST() {
        return isonwaitlist;
    }

    /**
     * Sets the value of the isonwaitlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISONWAITLIST(Boolean value) {
        this.isonwaitlist = value;
    }

    /**
     * Gets the value of the boolrefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLREFUNDABLE() {
        return boolrefundable;
    }

    /**
     * Sets the value of the boolrefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLREFUNDABLE(Boolean value) {
        this.boolrefundable = value;
    }

    /**
     * Gets the value of the gds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDS() {
        return gds;
    }

    /**
     * Sets the value of the gds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDS(String value) {
        this.gds = value;
    }

    /**
     * Gets the value of the passgds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSGDS() {
        return passgds;
    }

    /**
     * Sets the value of the passgds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSGDS(String value) {
        this.passgds = value;
    }

    /**
     * Gets the value of the pnrid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPNRID() {
        return pnrid;
    }

    /**
     * Sets the value of the pnrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPNRID(BigInteger value) {
        this.pnrid = value;
    }

    /**
     * Gets the value of the deletedelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDELETEDELEMENT() {
        return deletedelement;
    }

    /**
     * Sets the value of the deletedelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDELETEDELEMENT(Boolean value) {
        this.deletedelement = value;
    }

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
     * Gets the value of the segmenttatoo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTTATOO() {
        return segmenttatoo;
    }

    /**
     * Sets the value of the segmenttatoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTTATOO(BigInteger value) {
        this.segmenttatoo = value;
    }

    /**
     * Gets the value of the tatooother property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTATOOOTHER() {
        return tatooother;
    }

    /**
     * Sets the value of the tatooother property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTATOOOTHER(BigInteger value) {
        this.tatooother = value;
    }

    /**
     * Gets the value of the externaldependencies property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.EXTERNALDEPENDENCIES }
     *     
     */
    public PNRType.EXTERNALDEPENDENCIES getEXTERNALDEPENDENCIES() {
        return externaldependencies;
    }

    /**
     * Sets the value of the externaldependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.EXTERNALDEPENDENCIES }
     *     
     */
    public void setEXTERNALDEPENDENCIES(PNRType.EXTERNALDEPENDENCIES value) {
        this.externaldependencies = value;
    }

    /**
     * Gets the value of the tickettype property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.TICKETTYPE }
     *     
     */
    public PNRType.TICKETTYPE getTICKETTYPE() {
        return tickettype;
    }

    /**
     * Sets the value of the tickettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.TICKETTYPE }
     *     
     */
    public void setTICKETTYPE(PNRType.TICKETTYPE value) {
        this.tickettype = value;
    }

    /**
     * Gets the value of the listpnrprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpnrprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPNRPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTPNRPRICE }
     * 
     * 
     */
    public List<PNRType.LISTPNRPRICE> getLISTPNRPRICE() {
        if (listpnrprice == null) {
            listpnrprice = new ArrayList<PNRType.LISTPNRPRICE>();
        }
        return this.listpnrprice;
    }

    /**
     * Gets the value of the listfareelementbreakdown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareelementbreakdown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREELEMENTBREAKDOWN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareTypeBreakDown }
     * 
     * 
     */
    public List<FareTypeBreakDown> getLISTFAREELEMENTBREAKDOWN() {
        if (listfareelementbreakdown == null) {
            listfareelementbreakdown = new ArrayList<FareTypeBreakDown>();
        }
        return this.listfareelementbreakdown;
    }

    /**
     * Gets the value of the listarrivalunknownsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listarrivalunknownsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTARRIVALUNKNOWNSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListArrivalUnknownSegment }
     * 
     * 
     */
    public List<ListArrivalUnknownSegment> getLISTARRIVALUNKNOWNSEGMENT() {
        if (listarrivalunknownsegment == null) {
            listarrivalunknownsegment = new ArrayList<ListArrivalUnknownSegment>();
        }
        return this.listarrivalunknownsegment;
    }

    /**
     * Gets the value of the listmiscdocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmiscdocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMISCDOCUMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListMiscDocument }
     * 
     * 
     */
    public List<ListMiscDocument> getLISTMISCDOCUMENT() {
        if (listmiscdocument == null) {
            listmiscdocument = new ArrayList<ListMiscDocument>();
        }
        return this.listmiscdocument;
    }

    /**
     * Gets the value of the listmiscdocumentgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmiscdocumentgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMISCDOCUMENTGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListMiscDocumentGroup }
     * 
     * 
     */
    public List<ListMiscDocumentGroup> getLISTMISCDOCUMENTGROUP() {
        if (listmiscdocumentgroup == null) {
            listmiscdocumentgroup = new ArrayList<ListMiscDocumentGroup>();
        }
        return this.listmiscdocumentgroup;
    }

    /**
     * Gets the value of the listmco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMCO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTMCO }
     * 
     * 
     */
    public List<PNRType.LISTMCO> getLISTMCO() {
        if (listmco == null) {
            listmco = new ArrayList<PNRType.LISTMCO>();
        }
        return this.listmco;
    }

    /**
     * Gets the value of the listmiscpricingrecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmiscpricingrecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMISCPRICINGRECORD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTMISCPRICINGRECORD }
     * 
     * 
     */
    public List<PNRType.LISTMISCPRICINGRECORD> getLISTMISCPRICINGRECORD() {
        if (listmiscpricingrecord == null) {
            listmiscpricingrecord = new ArrayList<PNRType.LISTMISCPRICINGRECORD>();
        }
        return this.listmiscpricingrecord;
    }

    /**
     * Gets the value of the listtasf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtasf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTASF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTTASF }
     * 
     * 
     */
    public List<PNRType.LISTTASF> getLISTTASF() {
        if (listtasf == null) {
            listtasf = new ArrayList<PNRType.LISTTASF>();
        }
        return this.listtasf;
    }

    /**
     * Gets the value of the invoicedata property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.INVOICEDATA }
     *     
     */
    public PNRType.INVOICEDATA getINVOICEDATA() {
        return invoicedata;
    }

    /**
     * Sets the value of the invoicedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.INVOICEDATA }
     *     
     */
    public void setINVOICEDATA(PNRType.INVOICEDATA value) {
        this.invoicedata = value;
    }

    /**
     * Gets the value of the listexpiredate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexpiredate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXPIREDATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTEXPIREDATE }
     * 
     * 
     */
    public List<PNRType.LISTEXPIREDATE> getLISTEXPIREDATE() {
        if (listexpiredate == null) {
            listexpiredate = new ArrayList<PNRType.LISTEXPIREDATE>();
        }
        return this.listexpiredate;
    }

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
     * Gets the value of the preferredfare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPREFERREDFARE() {
        return preferredfare;
    }

    /**
     * Sets the value of the preferredfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPREFERREDFARE(Boolean value) {
        this.preferredfare = value;
    }

    /**
     * Gets the value of the creatoragentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATORAGENTID() {
        return creatoragentid;
    }

    /**
     * Sets the value of the creatoragentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATORAGENTID(String value) {
        this.creatoragentid = value;
    }

    /**
     * Gets the value of the lastuseragentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTUSERAGENTID() {
        return lastuseragentid;
    }

    /**
     * Sets the value of the lastuseragentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTUSERAGENTID(String value) {
        this.lastuseragentid = value;
    }

    /**
     * Gets the value of the updatedate property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.UPDATEDATE }
     *     
     */
    public PNRType.UPDATEDATE getUPDATEDATE() {
        return updatedate;
    }

    /**
     * Sets the value of the updatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.UPDATEDATE }
     *     
     */
    public void setUPDATEDATE(PNRType.UPDATEDATE value) {
        this.updatedate = value;
    }

    /**
     * Gets the value of the defaultqueueofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTQUEUEOFFICEID() {
        return defaultqueueofficeid;
    }

    /**
     * Sets the value of the defaultqueueofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTQUEUEOFFICEID(String value) {
        this.defaultqueueofficeid = value;
    }

    /**
     * Gets the value of the defaultticketingofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTTICKETINGOFFICEID() {
        return defaultticketingofficeid;
    }

    /**
     * Sets the value of the defaultticketingofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTTICKETINGOFFICEID(String value) {
        this.defaultticketingofficeid = value;
    }

    /**
     * Gets the value of the defaultoptionelementofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTOPTIONELEMENTOFFICEID() {
        return defaultoptionelementofficeid;
    }

    /**
     * Sets the value of the defaultoptionelementofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTOPTIONELEMENTOFFICEID(String value) {
        this.defaultoptionelementofficeid = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.HEADER }
     *     
     */
    public PNRType.HEADER getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.HEADER }
     *     
     */
    public void setHEADER(PNRType.HEADER value) {
        this.header = value;
    }

    /**
     * Gets the value of the isgrouppnr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISGROUPPNR() {
        return isgrouppnr;
    }

    /**
     * Sets the value of the isgrouppnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISGROUPPNR(Boolean value) {
        this.isgrouppnr = value;
    }

    /**
     * Gets the value of the grouppnr property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.GROUPPNR }
     *     
     */
    public PNRType.GROUPPNR getGROUPPNR() {
        return grouppnr;
    }

    /**
     * Sets the value of the grouppnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.GROUPPNR }
     *     
     */
    public void setGROUPPNR(PNRType.GROUPPNR value) {
        this.grouppnr = value;
    }

    /**
     * Gets the value of the listticketingelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listticketingelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKETINGELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTTICKETINGELEMENT }
     * 
     * 
     */
    public List<PNRType.LISTTICKETINGELEMENT> getLISTTICKETINGELEMENT() {
        if (listticketingelement == null) {
            listticketingelement = new ArrayList<PNRType.LISTTICKETINGELEMENT>();
        }
        return this.listticketingelement;
    }

    /**
     * Gets the value of the listservicerequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicerequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEREQUEST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTSERVICEREQUEST }
     * 
     * 
     */
    public List<PNRType.LISTSERVICEREQUEST> getLISTSERVICEREQUEST() {
        if (listservicerequest == null) {
            listservicerequest = new ArrayList<PNRType.LISTSERVICEREQUEST>();
        }
        return this.listservicerequest;
    }

    /**
     * Gets the value of the totalbalance property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.TOTALBALANCE }
     *     
     */
    public PNRType.TOTALBALANCE getTOTALBALANCE() {
        return totalbalance;
    }

    /**
     * Sets the value of the totalbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.TOTALBALANCE }
     *     
     */
    public void setTOTALBALANCE(PNRType.TOTALBALANCE value) {
        this.totalbalance = value;
    }

    /**
     * Gets the value of the isapuperformed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISAPUPERFORMED() {
        return isapuperformed;
    }

    /**
     * Sets the value of the isapuperformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISAPUPERFORMED(Boolean value) {
        this.isapuperformed = value;
    }

    /**
     * Gets the value of the isassociatedpnr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISASSOCIATEDPNR() {
        return isassociatedpnr;
    }

    /**
     * Sets the value of the isassociatedpnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISASSOCIATEDPNR(Boolean value) {
        this.isassociatedpnr = value;
    }

    /**
     * Gets the value of the tpos property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.TPOS }
     *     
     */
    public PNRType.TPOS getTPOS() {
        return tpos;
    }

    /**
     * Sets the value of the tpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.TPOS }
     *     
     */
    public void setTPOS(PNRType.TPOS value) {
        this.tpos = value;
    }

    /**
     * Gets the value of the awardcode property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.AWARDCODE }
     *     
     */
    public PNRType.AWARDCODE getAWARDCODE() {
        return awardcode;
    }

    /**
     * Sets the value of the awardcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.AWARDCODE }
     *     
     */
    public void setAWARDCODE(PNRType.AWARDCODE value) {
        this.awardcode = value;
    }

    /**
     * Gets the value of the upgradestate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPGRADESTATE() {
        return upgradestate;
    }

    /**
     * Sets the value of the upgradestate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPGRADESTATE(String value) {
        this.upgradestate = value;
    }

    /**
     * Gets the value of the listelementsecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementsecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTSECURITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTELEMENTSECURITY }
     * 
     * 
     */
    public List<PNRType.LISTELEMENTSECURITY> getLISTELEMENTSECURITY() {
        if (listelementsecurity == null) {
            listelementsecurity = new ArrayList<PNRType.LISTELEMENTSECURITY>();
        }
        return this.listelementsecurity;
    }

    /**
     * Gets the value of the listprograminformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprograminformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROGRAMINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTPROGRAMINFORMATION }
     * 
     * 
     */
    public List<PNRType.LISTPROGRAMINFORMATION> getLISTPROGRAMINFORMATION() {
        if (listprograminformation == null) {
            listprograminformation = new ArrayList<PNRType.LISTPROGRAMINFORMATION>();
        }
        return this.listprograminformation;
    }

    /**
     * Gets the value of the listcommandinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcommandinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMANDINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType.LISTCOMMANDINFO }
     * 
     * 
     */
    public List<PNRType.LISTCOMMANDINFO> getLISTCOMMANDINFO() {
        if (listcommandinfo == null) {
            listcommandinfo = new ArrayList<PNRType.LISTCOMMANDINFO>();
        }
        return this.listcommandinfo;
    }

    /**
     * Gets the value of the dcsdata property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.DCSDATA }
     *     
     */
    public PNRType.DCSDATA getDCSDATA() {
        return dcsdata;
    }

    /**
     * Sets the value of the dcsdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.DCSDATA }
     *     
     */
    public void setDCSDATA(PNRType.DCSDATA value) {
        this.dcsdata = value;
    }

    /**
     * Gets the value of the pnroptions property.
     * 
     * @return
     *     possible object is
     *     {@link PNRType.PNROPTIONS }
     *     
     */
    public PNRType.PNROPTIONS getPNROPTIONS() {
        return pnroptions;
    }

    /**
     * Sets the value of the pnroptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType.PNROPTIONS }
     *     
     */
    public void setPNROPTIONS(PNRType.PNROPTIONS value) {
        this.pnroptions = value;
    }

    /**
     * Gets the value of the pnrinmodification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPNRINMODIFICATION() {
        return pnrinmodification;
    }

    /**
     * Sets the value of the pnrinmodification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPNRINMODIFICATION(Boolean value) {
        this.pnrinmodification = value;
    }

    /**
     * Gets the value of the simultaneouschangedetected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSIMULTANEOUSCHANGEDETECTED() {
        return simultaneouschangedetected;
    }

    /**
     * Sets the value of the simultaneouschangedetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSIMULTANEOUSCHANGEDETECTED(Boolean value) {
        this.simultaneouschangedetected = value;
    }

    /**
     * Gets the value of the isreadonlypnr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREADONLYPNR() {
        return isreadonlypnr;
    }

    /**
     * Sets the value of the isreadonlypnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREADONLYPNR(Boolean value) {
        this.isreadonlypnr = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
    public static class AWARDCODE
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class BDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
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
     *         &lt;element name="CITY_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "citycode",
        "cityname",
        "locationcode",
        "locationname",
        "statecode",
        "statename",
        "countrycode",
        "countryname"
    })
    public static class BLOCATION
        implements Serializable
    {

        @XmlElement(name = "CITY_CODE", required = true)
        protected String citycode;
        @XmlElement(name = "CITY_NAME", required = true)
        protected String cityname;
        @XmlElement(name = "LOCATION_CODE", required = true)
        protected String locationcode;
        @XmlElement(name = "LOCATION_NAME", required = true)
        protected String locationname;
        @XmlElement(name = "STATE_CODE")
        protected String statecode;
        @XmlElement(name = "STATE_NAME")
        protected String statename;
        @XmlElement(name = "COUNTRY_CODE")
        protected String countrycode;
        @XmlElement(name = "COUNTRY_NAME")
        protected String countryname;

        /**
         * Gets the value of the citycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYCODE() {
            return citycode;
        }

        /**
         * Sets the value of the citycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYCODE(String value) {
            this.citycode = value;
        }

        /**
         * Gets the value of the cityname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYNAME() {
            return cityname;
        }

        /**
         * Sets the value of the cityname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYNAME(String value) {
            this.cityname = value;
        }

        /**
         * Gets the value of the locationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODE() {
            return locationcode;
        }

        /**
         * Sets the value of the locationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODE(String value) {
            this.locationcode = value;
        }

        /**
         * Gets the value of the locationname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONNAME() {
            return locationname;
        }

        /**
         * Sets the value of the locationname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONNAME(String value) {
            this.locationname = value;
        }

        /**
         * Gets the value of the statecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATECODE() {
            return statecode;
        }

        /**
         * Sets the value of the statecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATECODE(String value) {
            this.statecode = value;
        }

        /**
         * Gets the value of the statename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATENAME() {
            return statename;
        }

        /**
         * Sets the value of the statename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATENAME(String value) {
            this.statename = value;
        }

        /**
         * Gets the value of the countrycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYCODE() {
            return countrycode;
        }

        /**
         * Sets the value of the countrycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYCODE(String value) {
            this.countrycode = value;
        }

        /**
         * Gets the value of the countryname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYNAME() {
            return countryname;
        }

        /**
         * Sets the value of the countryname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYNAME(String value) {
            this.countryname = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class BS
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CREATIONDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
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
     *         &lt;element name="LIST_LEG" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LEG_POSITION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="PAX_INFO"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PAX_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="PAX_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CHECK_IN_INFO"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="IS_CHECKED_IN" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="BAGGAGE_INFO"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="IS_DROPPED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="BOARDING_INFO"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="IS_BOARDED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="REGRADE_INFO" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="IS_INVOLUNTARY_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                             &lt;element name="IS_INVOLUNTARY_DOWNGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                             &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "listleg"
    })
    public static class DCSDATA
        implements Serializable
    {

        @XmlElement(name = "LIST_LEG", required = true)
        protected List<PNRType.DCSDATA.LISTLEG> listleg;

        /**
         * Gets the value of the listleg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listleg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTLEG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRType.DCSDATA.LISTLEG }
         * 
         * 
         */
        public List<PNRType.DCSDATA.LISTLEG> getLISTLEG() {
            if (listleg == null) {
                listleg = new ArrayList<PNRType.DCSDATA.LISTLEG>();
            }
            return this.listleg;
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
         *         &lt;element name="LEG_POSITION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="PAX_INFO"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PAX_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="PAX_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CHECK_IN_INFO"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="IS_CHECKED_IN" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="BAGGAGE_INFO"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="IS_DROPPED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="BOARDING_INFO"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="IS_BOARDED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="REGRADE_INFO" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="IS_INVOLUNTARY_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                   &lt;element name="IS_INVOLUNTARY_DOWNGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                   &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "legposition",
            "segmentid",
            "paxinfo",
            "checkininfo",
            "baggageinfo",
            "boardinginfo",
            "regradeinfo"
        })
        public static class LISTLEG
            implements Serializable
        {

            @XmlElement(name = "LEG_POSITION")
            protected Object legposition;
            @XmlElement(name = "SEGMENT_ID", required = true)
            protected Object segmentid;
            @XmlElement(name = "PAX_INFO", required = true)
            protected PNRType.DCSDATA.LISTLEG.PAXINFO paxinfo;
            @XmlElement(name = "CHECK_IN_INFO", required = true)
            protected PNRType.DCSDATA.LISTLEG.CHECKININFO checkininfo;
            @XmlElement(name = "BAGGAGE_INFO", required = true)
            protected PNRType.DCSDATA.LISTLEG.BAGGAGEINFO baggageinfo;
            @XmlElement(name = "BOARDING_INFO", required = true)
            protected PNRType.DCSDATA.LISTLEG.BOARDINGINFO boardinginfo;
            @XmlElement(name = "REGRADE_INFO")
            protected PNRType.DCSDATA.LISTLEG.REGRADEINFO regradeinfo;

            /**
             * Gets the value of the legposition property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getLEGPOSITION() {
                return legposition;
            }

            /**
             * Sets the value of the legposition property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setLEGPOSITION(Object value) {
                this.legposition = value;
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
             * Gets the value of the paxinfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRType.DCSDATA.LISTLEG.PAXINFO }
             *     
             */
            public PNRType.DCSDATA.LISTLEG.PAXINFO getPAXINFO() {
                return paxinfo;
            }

            /**
             * Sets the value of the paxinfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRType.DCSDATA.LISTLEG.PAXINFO }
             *     
             */
            public void setPAXINFO(PNRType.DCSDATA.LISTLEG.PAXINFO value) {
                this.paxinfo = value;
            }

            /**
             * Gets the value of the checkininfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRType.DCSDATA.LISTLEG.CHECKININFO }
             *     
             */
            public PNRType.DCSDATA.LISTLEG.CHECKININFO getCHECKININFO() {
                return checkininfo;
            }

            /**
             * Sets the value of the checkininfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRType.DCSDATA.LISTLEG.CHECKININFO }
             *     
             */
            public void setCHECKININFO(PNRType.DCSDATA.LISTLEG.CHECKININFO value) {
                this.checkininfo = value;
            }

            /**
             * Gets the value of the baggageinfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRType.DCSDATA.LISTLEG.BAGGAGEINFO }
             *     
             */
            public PNRType.DCSDATA.LISTLEG.BAGGAGEINFO getBAGGAGEINFO() {
                return baggageinfo;
            }

            /**
             * Sets the value of the baggageinfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRType.DCSDATA.LISTLEG.BAGGAGEINFO }
             *     
             */
            public void setBAGGAGEINFO(PNRType.DCSDATA.LISTLEG.BAGGAGEINFO value) {
                this.baggageinfo = value;
            }

            /**
             * Gets the value of the boardinginfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRType.DCSDATA.LISTLEG.BOARDINGINFO }
             *     
             */
            public PNRType.DCSDATA.LISTLEG.BOARDINGINFO getBOARDINGINFO() {
                return boardinginfo;
            }

            /**
             * Sets the value of the boardinginfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRType.DCSDATA.LISTLEG.BOARDINGINFO }
             *     
             */
            public void setBOARDINGINFO(PNRType.DCSDATA.LISTLEG.BOARDINGINFO value) {
                this.boardinginfo = value;
            }

            /**
             * Gets the value of the regradeinfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRType.DCSDATA.LISTLEG.REGRADEINFO }
             *     
             */
            public PNRType.DCSDATA.LISTLEG.REGRADEINFO getREGRADEINFO() {
                return regradeinfo;
            }

            /**
             * Sets the value of the regradeinfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRType.DCSDATA.LISTLEG.REGRADEINFO }
             *     
             */
            public void setREGRADEINFO(PNRType.DCSDATA.LISTLEG.REGRADEINFO value) {
                this.regradeinfo = value;
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
             *         &lt;element name="IS_DROPPED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
                "isdropped"
            })
            public static class BAGGAGEINFO
                implements Serializable
            {

                @XmlElement(name = "IS_DROPPED")
                protected boolean isdropped;

                /**
                 * Gets the value of the isdropped property.
                 * 
                 */
                public boolean isISDROPPED() {
                    return isdropped;
                }

                /**
                 * Sets the value of the isdropped property.
                 * 
                 */
                public void setISDROPPED(boolean value) {
                    this.isdropped = value;
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
             *         &lt;element name="IS_BOARDED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
                "isboarded"
            })
            public static class BOARDINGINFO
                implements Serializable
            {

                @XmlElement(name = "IS_BOARDED")
                protected boolean isboarded;

                /**
                 * Gets the value of the isboarded property.
                 * 
                 */
                public boolean isISBOARDED() {
                    return isboarded;
                }

                /**
                 * Sets the value of the isboarded property.
                 * 
                 */
                public void setISBOARDED(boolean value) {
                    this.isboarded = value;
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
             *         &lt;element name="IS_CHECKED_IN" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
                "ischeckedin"
            })
            public static class CHECKININFO
                implements Serializable
            {

                @XmlElement(name = "IS_CHECKED_IN")
                protected boolean ischeckedin;

                /**
                 * Gets the value of the ischeckedin property.
                 * 
                 */
                public boolean isISCHECKEDIN() {
                    return ischeckedin;
                }

                /**
                 * Sets the value of the ischeckedin property.
                 * 
                 */
                public void setISCHECKEDIN(boolean value) {
                    this.ischeckedin = value;
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
             *         &lt;element name="PAX_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="PAX_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "paxid",
                "paxtype"
            })
            public static class PAXINFO
                implements Serializable
            {

                @XmlElement(name = "PAX_ID", required = true)
                protected Object paxid;
                @XmlElement(name = "PAX_TYPE", required = true)
                protected String paxtype;

                /**
                 * Gets the value of the paxid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getPAXID() {
                    return paxid;
                }

                /**
                 * Sets the value of the paxid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setPAXID(Object value) {
                    this.paxid = value;
                }

                /**
                 * Gets the value of the paxtype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAXTYPE() {
                    return paxtype;
                }

                /**
                 * Sets the value of the paxtype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAXTYPE(String value) {
                    this.paxtype = value;
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
             *         &lt;element name="IS_INVOLUNTARY_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *         &lt;element name="IS_INVOLUNTARY_DOWNGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *         &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "isinvoluntaryupgrade",
                "isinvoluntarydowngrade",
                "cabin"
            })
            public static class REGRADEINFO
                implements Serializable
            {

                @XmlElement(name = "IS_INVOLUNTARY_UPGRADE")
                protected boolean isinvoluntaryupgrade;
                @XmlElement(name = "IS_INVOLUNTARY_DOWNGRADE")
                protected boolean isinvoluntarydowngrade;
                @XmlElement(name = "CABIN", required = true)
                protected String cabin;

                /**
                 * Gets the value of the isinvoluntaryupgrade property.
                 * 
                 */
                public boolean isISINVOLUNTARYUPGRADE() {
                    return isinvoluntaryupgrade;
                }

                /**
                 * Sets the value of the isinvoluntaryupgrade property.
                 * 
                 */
                public void setISINVOLUNTARYUPGRADE(boolean value) {
                    this.isinvoluntaryupgrade = value;
                }

                /**
                 * Gets the value of the isinvoluntarydowngrade property.
                 * 
                 */
                public boolean isISINVOLUNTARYDOWNGRADE() {
                    return isinvoluntarydowngrade;
                }

                /**
                 * Sets the value of the isinvoluntarydowngrade property.
                 * 
                 */
                public void setISINVOLUNTARYDOWNGRADE(boolean value) {
                    this.isinvoluntarydowngrade = value;
                }

                /**
                 * Gets the value of the cabin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCABIN() {
                    return cabin;
                }

                /**
                 * Sets the value of the cabin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCABIN(String value) {
                    this.cabin = value;
                }

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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
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
     *         &lt;element name="CITY_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "citycode",
        "cityname",
        "locationcode",
        "locationname",
        "statecode",
        "statename",
        "countrycode",
        "countryname"
    })
    public static class ELOCATION
        implements Serializable
    {

        @XmlElement(name = "CITY_CODE", required = true)
        protected String citycode;
        @XmlElement(name = "CITY_NAME", required = true)
        protected String cityname;
        @XmlElement(name = "LOCATION_CODE", required = true)
        protected String locationcode;
        @XmlElement(name = "LOCATION_NAME", required = true)
        protected String locationname;
        @XmlElement(name = "STATE_CODE")
        protected String statecode;
        @XmlElement(name = "STATE_NAME")
        protected String statename;
        @XmlElement(name = "COUNTRY_CODE")
        protected String countrycode;
        @XmlElement(name = "COUNTRY_NAME")
        protected String countryname;

        /**
         * Gets the value of the citycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYCODE() {
            return citycode;
        }

        /**
         * Sets the value of the citycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYCODE(String value) {
            this.citycode = value;
        }

        /**
         * Gets the value of the cityname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYNAME() {
            return cityname;
        }

        /**
         * Sets the value of the cityname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYNAME(String value) {
            this.cityname = value;
        }

        /**
         * Gets the value of the locationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODE() {
            return locationcode;
        }

        /**
         * Sets the value of the locationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODE(String value) {
            this.locationcode = value;
        }

        /**
         * Gets the value of the locationname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONNAME() {
            return locationname;
        }

        /**
         * Sets the value of the locationname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONNAME(String value) {
            this.locationname = value;
        }

        /**
         * Gets the value of the statecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATECODE() {
            return statecode;
        }

        /**
         * Sets the value of the statecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATECODE(String value) {
            this.statecode = value;
        }

        /**
         * Gets the value of the statename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATENAME() {
            return statename;
        }

        /**
         * Sets the value of the statename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATENAME(String value) {
            this.statename = value;
        }

        /**
         * Gets the value of the countrycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYCODE() {
            return countrycode;
        }

        /**
         * Sets the value of the countrycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYCODE(String value) {
            this.countrycode = value;
        }

        /**
         * Gets the value of the countryname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYNAME() {
            return countryname;
        }

        /**
         * Sets the value of the countryname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYNAME(String value) {
            this.countryname = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ENDTRANSACTDATE
        implements Serializable
    {

        @XmlValue
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EXPIREDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EXPIREDATEGMT
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
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
     *         &lt;element name="PARENT_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LIST_PARENT_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OTHER_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="THIRD_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IS_MAIN_PNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_OTHER_PNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_THIRD_PNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DATABASE_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="DATABASE_SRV_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IS_RECORD_IN_SESSION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="API_CONNECTIVITY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DCX_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="API_SETTINGS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;any processContents='lax'/&gt;
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
        "parentpnrid",
        "listparentpnrid",
        "otherpnrid",
        "thirdpnrid",
        "ismainpnr",
        "isotherpnr",
        "isthirdpnr",
        "databasepnrid",
        "databasesrvid",
        "isrecordinsession",
        "apiconnectivity"
    })
    public static class EXTERNALDEPENDENCIES
        implements Serializable
    {

        @XmlElement(name = "PARENT_PNR_ID")
        protected BigInteger parentpnrid;
        @XmlElement(name = "LIST_PARENT_PNR_ID")
        protected List<BigInteger> listparentpnrid;
        @XmlElement(name = "OTHER_PNR_ID")
        protected List<BigInteger> otherpnrid;
        @XmlElement(name = "THIRD_PNR_ID")
        protected List<BigInteger> thirdpnrid;
        @XmlElement(name = "IS_MAIN_PNR")
        protected Boolean ismainpnr;
        @XmlElement(name = "IS_OTHER_PNR")
        protected Boolean isotherpnr;
        @XmlElement(name = "IS_THIRD_PNR")
        protected Boolean isthirdpnr;
        @XmlElement(name = "DATABASE_PNR_ID")
        protected BigInteger databasepnrid;
        @XmlElement(name = "DATABASE_SRV_ID")
        protected String databasesrvid;
        @XmlElement(name = "IS_RECORD_IN_SESSION")
        protected Boolean isrecordinsession;
        @XmlElement(name = "API_CONNECTIVITY")
        protected PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY apiconnectivity;

        /**
         * Gets the value of the parentpnrid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPARENTPNRID() {
            return parentpnrid;
        }

        /**
         * Sets the value of the parentpnrid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPARENTPNRID(BigInteger value) {
            this.parentpnrid = value;
        }

        /**
         * Gets the value of the listparentpnrid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listparentpnrid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPARENTPNRID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTPARENTPNRID() {
            if (listparentpnrid == null) {
                listparentpnrid = new ArrayList<BigInteger>();
            }
            return this.listparentpnrid;
        }

        /**
         * Gets the value of the otherpnrid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherpnrid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOTHERPNRID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getOTHERPNRID() {
            if (otherpnrid == null) {
                otherpnrid = new ArrayList<BigInteger>();
            }
            return this.otherpnrid;
        }

        /**
         * Gets the value of the thirdpnrid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the thirdpnrid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTHIRDPNRID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getTHIRDPNRID() {
            if (thirdpnrid == null) {
                thirdpnrid = new ArrayList<BigInteger>();
            }
            return this.thirdpnrid;
        }

        /**
         * Gets the value of the ismainpnr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISMAINPNR() {
            return ismainpnr;
        }

        /**
         * Sets the value of the ismainpnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISMAINPNR(Boolean value) {
            this.ismainpnr = value;
        }

        /**
         * Gets the value of the isotherpnr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISOTHERPNR() {
            return isotherpnr;
        }

        /**
         * Sets the value of the isotherpnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISOTHERPNR(Boolean value) {
            this.isotherpnr = value;
        }

        /**
         * Gets the value of the isthirdpnr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISTHIRDPNR() {
            return isthirdpnr;
        }

        /**
         * Sets the value of the isthirdpnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISTHIRDPNR(Boolean value) {
            this.isthirdpnr = value;
        }

        /**
         * Gets the value of the databasepnrid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDATABASEPNRID() {
            return databasepnrid;
        }

        /**
         * Sets the value of the databasepnrid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDATABASEPNRID(BigInteger value) {
            this.databasepnrid = value;
        }

        /**
         * Gets the value of the databasesrvid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATABASESRVID() {
            return databasesrvid;
        }

        /**
         * Sets the value of the databasesrvid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATABASESRVID(String value) {
            this.databasesrvid = value;
        }

        /**
         * Gets the value of the isrecordinsession property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISRECORDINSESSION() {
            return isrecordinsession;
        }

        /**
         * Sets the value of the isrecordinsession property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISRECORDINSESSION(Boolean value) {
            this.isrecordinsession = value;
        }

        /**
         * Gets the value of the apiconnectivity property.
         * 
         * @return
         *     possible object is
         *     {@link PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY }
         *     
         */
        public PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY getAPICONNECTIVITY() {
            return apiconnectivity;
        }

        /**
         * Sets the value of the apiconnectivity property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY }
         *     
         */
        public void setAPICONNECTIVITY(PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY value) {
            this.apiconnectivity = value;
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
         *         &lt;element name="DCX_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="API_SETTINGS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;any processContents='lax'/&gt;
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
            "dcxid",
            "apisettings"
        })
        public static class APICONNECTIVITY
            implements Serializable
        {

            @XmlElement(name = "DCX_ID")
            protected String dcxid;
            @XmlElement(name = "API_SETTINGS")
            protected PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY.APISETTINGS apisettings;

            /**
             * Gets the value of the dcxid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDCXID() {
                return dcxid;
            }

            /**
             * Sets the value of the dcxid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDCXID(String value) {
                this.dcxid = value;
            }

            /**
             * Gets the value of the apisettings property.
             * 
             * @return
             *     possible object is
             *     {@link PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY.APISETTINGS }
             *     
             */
            public PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY.APISETTINGS getAPISETTINGS() {
                return apisettings;
            }

            /**
             * Sets the value of the apisettings property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY.APISETTINGS }
             *     
             */
            public void setAPISETTINGS(PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY.APISETTINGS value) {
                this.apisettings = value;
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
             *         &lt;any processContents='lax'/&gt;
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
                "any"
            })
            public static class APISETTINGS
                implements Serializable
            {

                @XmlAnyElement(lax = true)
                protected Object any;

                /**
                 * Gets the value of the any property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Element }
                 *     {@link Object }
                 *     
                 */
                public Object getAny() {
                    return any;
                }

                /**
                 * Sets the value of the any property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Element }
                 *     {@link Object }
                 *     
                 */
                public void setAny(Object value) {
                    this.any = value;
                }

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
     *         &lt;element name="GROUP_PNR_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="NB_TOTAL_SEATS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="NB_ASSIGNED_SEATS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="GROUP_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="NB_ORIGINAL_NAMES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="NB_CANCELLED_NAMES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="NB_SPLIT_NAMES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "grouppnrname",
        "nbtotalseats",
        "nbassignedseats",
        "grouppnrid",
        "nboriginalnames",
        "nbcancellednames",
        "nbsplitnames"
    })
    public static class GROUPPNR
        implements Serializable
    {

        @XmlElement(name = "GROUP_PNR_NAME")
        protected String grouppnrname;
        @XmlElement(name = "NB_TOTAL_SEATS")
        protected BigInteger nbtotalseats;
        @XmlElement(name = "NB_ASSIGNED_SEATS")
        protected BigInteger nbassignedseats;
        @XmlElement(name = "GROUP_PNR_ID", required = true)
        protected BigInteger grouppnrid;
        @XmlElement(name = "NB_ORIGINAL_NAMES")
        protected BigInteger nboriginalnames;
        @XmlElement(name = "NB_CANCELLED_NAMES")
        protected BigInteger nbcancellednames;
        @XmlElement(name = "NB_SPLIT_NAMES")
        protected BigInteger nbsplitnames;

        /**
         * Gets the value of the grouppnrname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGROUPPNRNAME() {
            return grouppnrname;
        }

        /**
         * Sets the value of the grouppnrname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGROUPPNRNAME(String value) {
            this.grouppnrname = value;
        }

        /**
         * Gets the value of the nbtotalseats property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNBTOTALSEATS() {
            return nbtotalseats;
        }

        /**
         * Sets the value of the nbtotalseats property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNBTOTALSEATS(BigInteger value) {
            this.nbtotalseats = value;
        }

        /**
         * Gets the value of the nbassignedseats property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNBASSIGNEDSEATS() {
            return nbassignedseats;
        }

        /**
         * Sets the value of the nbassignedseats property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNBASSIGNEDSEATS(BigInteger value) {
            this.nbassignedseats = value;
        }

        /**
         * Gets the value of the grouppnrid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGROUPPNRID() {
            return grouppnrid;
        }

        /**
         * Sets the value of the grouppnrid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGROUPPNRID(BigInteger value) {
            this.grouppnrid = value;
        }

        /**
         * Gets the value of the nboriginalnames property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNBORIGINALNAMES() {
            return nboriginalnames;
        }

        /**
         * Sets the value of the nboriginalnames property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNBORIGINALNAMES(BigInteger value) {
            this.nboriginalnames = value;
        }

        /**
         * Gets the value of the nbcancellednames property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNBCANCELLEDNAMES() {
            return nbcancellednames;
        }

        /**
         * Sets the value of the nbcancellednames property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNBCANCELLEDNAMES(BigInteger value) {
            this.nbcancellednames = value;
        }

        /**
         * Gets the value of the nbsplitnames property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNBSPLITNAMES() {
            return nbsplitnames;
        }

        /**
         * Sets the value of the nbsplitnames property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNBSPLITNAMES(BigInteger value) {
            this.nbsplitnames = value;
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
     *         &lt;element name="IS_RLR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_AXR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_PTA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_TPM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_HFR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_MSC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_RLP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_CPC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_CLM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_TST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_NHP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_NCP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_DCS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_DTA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_TSM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_CTT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_TC_BIZ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_CC_BOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_CC_SVC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_OFR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_ETR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_DOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_INT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_TIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_NDT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_OBD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_OBS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_OPD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_OPE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "isrlr",
        "isaxr",
        "ispta",
        "istpm",
        "ishfr",
        "ismsc",
        "isrlp",
        "iscpc",
        "isclm",
        "istst",
        "isnhp",
        "isncp",
        "isdcs",
        "isdta",
        "istsm",
        "isctt",
        "istcbiz",
        "isccbor",
        "isccsvc",
        "isofr",
        "isetr",
        "isdom",
        "isint",
        "istin",
        "isndt",
        "isobd",
        "isobs",
        "isopd",
        "isope"
    })
    public static class HEADER
        implements Serializable
    {

        @XmlElement(name = "IS_RLR")
        protected Boolean isrlr;
        @XmlElement(name = "IS_AXR")
        protected Boolean isaxr;
        @XmlElement(name = "IS_PTA")
        protected Boolean ispta;
        @XmlElement(name = "IS_TPM")
        protected Boolean istpm;
        @XmlElement(name = "IS_HFR")
        protected Boolean ishfr;
        @XmlElement(name = "IS_MSC")
        protected Boolean ismsc;
        @XmlElement(name = "IS_RLP")
        protected Boolean isrlp;
        @XmlElement(name = "IS_CPC")
        protected Boolean iscpc;
        @XmlElement(name = "IS_CLM")
        protected Boolean isclm;
        @XmlElement(name = "IS_TST")
        protected Boolean istst;
        @XmlElement(name = "IS_NHP")
        protected Boolean isnhp;
        @XmlElement(name = "IS_NCP")
        protected Boolean isncp;
        @XmlElement(name = "IS_DCS")
        protected Boolean isdcs;
        @XmlElement(name = "IS_DTA")
        protected Boolean isdta;
        @XmlElement(name = "IS_TSM")
        protected Boolean istsm;
        @XmlElement(name = "IS_CTT")
        protected Boolean isctt;
        @XmlElement(name = "IS_TC_BIZ")
        protected Boolean istcbiz;
        @XmlElement(name = "IS_CC_BOR")
        protected Boolean isccbor;
        @XmlElement(name = "IS_CC_SVC")
        protected Boolean isccsvc;
        @XmlElement(name = "IS_OFR")
        protected Boolean isofr;
        @XmlElement(name = "IS_ETR")
        protected Boolean isetr;
        @XmlElement(name = "IS_DOM")
        protected Boolean isdom;
        @XmlElement(name = "IS_INT")
        protected Boolean isint;
        @XmlElement(name = "IS_TIN")
        protected Boolean istin;
        @XmlElement(name = "IS_NDT")
        protected Boolean isndt;
        @XmlElement(name = "IS_OBD")
        protected Boolean isobd;
        @XmlElement(name = "IS_OBS")
        protected Boolean isobs;
        @XmlElement(name = "IS_OPD")
        protected Boolean isopd;
        @XmlElement(name = "IS_OPE")
        protected Boolean isope;

        /**
         * Gets the value of the isrlr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISRLR() {
            return isrlr;
        }

        /**
         * Sets the value of the isrlr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISRLR(Boolean value) {
            this.isrlr = value;
        }

        /**
         * Gets the value of the isaxr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISAXR() {
            return isaxr;
        }

        /**
         * Sets the value of the isaxr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISAXR(Boolean value) {
            this.isaxr = value;
        }

        /**
         * Gets the value of the ispta property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISPTA() {
            return ispta;
        }

        /**
         * Sets the value of the ispta property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISPTA(Boolean value) {
            this.ispta = value;
        }

        /**
         * Gets the value of the istpm property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISTPM() {
            return istpm;
        }

        /**
         * Sets the value of the istpm property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISTPM(Boolean value) {
            this.istpm = value;
        }

        /**
         * Gets the value of the ishfr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISHFR() {
            return ishfr;
        }

        /**
         * Sets the value of the ishfr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISHFR(Boolean value) {
            this.ishfr = value;
        }

        /**
         * Gets the value of the ismsc property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISMSC() {
            return ismsc;
        }

        /**
         * Sets the value of the ismsc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISMSC(Boolean value) {
            this.ismsc = value;
        }

        /**
         * Gets the value of the isrlp property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISRLP() {
            return isrlp;
        }

        /**
         * Sets the value of the isrlp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISRLP(Boolean value) {
            this.isrlp = value;
        }

        /**
         * Gets the value of the iscpc property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISCPC() {
            return iscpc;
        }

        /**
         * Sets the value of the iscpc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISCPC(Boolean value) {
            this.iscpc = value;
        }

        /**
         * Gets the value of the isclm property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISCLM() {
            return isclm;
        }

        /**
         * Sets the value of the isclm property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISCLM(Boolean value) {
            this.isclm = value;
        }

        /**
         * Gets the value of the istst property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISTST() {
            return istst;
        }

        /**
         * Sets the value of the istst property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISTST(Boolean value) {
            this.istst = value;
        }

        /**
         * Gets the value of the isnhp property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISNHP() {
            return isnhp;
        }

        /**
         * Sets the value of the isnhp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISNHP(Boolean value) {
            this.isnhp = value;
        }

        /**
         * Gets the value of the isncp property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISNCP() {
            return isncp;
        }

        /**
         * Sets the value of the isncp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISNCP(Boolean value) {
            this.isncp = value;
        }

        /**
         * Gets the value of the isdcs property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISDCS() {
            return isdcs;
        }

        /**
         * Sets the value of the isdcs property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISDCS(Boolean value) {
            this.isdcs = value;
        }

        /**
         * Gets the value of the isdta property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISDTA() {
            return isdta;
        }

        /**
         * Sets the value of the isdta property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISDTA(Boolean value) {
            this.isdta = value;
        }

        /**
         * Gets the value of the istsm property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISTSM() {
            return istsm;
        }

        /**
         * Sets the value of the istsm property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISTSM(Boolean value) {
            this.istsm = value;
        }

        /**
         * Gets the value of the isctt property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISCTT() {
            return isctt;
        }

        /**
         * Sets the value of the isctt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISCTT(Boolean value) {
            this.isctt = value;
        }

        /**
         * Gets the value of the istcbiz property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISTCBIZ() {
            return istcbiz;
        }

        /**
         * Sets the value of the istcbiz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISTCBIZ(Boolean value) {
            this.istcbiz = value;
        }

        /**
         * Gets the value of the isccbor property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISCCBOR() {
            return isccbor;
        }

        /**
         * Sets the value of the isccbor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISCCBOR(Boolean value) {
            this.isccbor = value;
        }

        /**
         * Gets the value of the isccsvc property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISCCSVC() {
            return isccsvc;
        }

        /**
         * Sets the value of the isccsvc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISCCSVC(Boolean value) {
            this.isccsvc = value;
        }

        /**
         * Gets the value of the isofr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISOFR() {
            return isofr;
        }

        /**
         * Sets the value of the isofr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISOFR(Boolean value) {
            this.isofr = value;
        }

        /**
         * Gets the value of the isetr property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISETR() {
            return isetr;
        }

        /**
         * Sets the value of the isetr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISETR(Boolean value) {
            this.isetr = value;
        }

        /**
         * Gets the value of the isdom property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISDOM() {
            return isdom;
        }

        /**
         * Sets the value of the isdom property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISDOM(Boolean value) {
            this.isdom = value;
        }

        /**
         * Gets the value of the isint property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISINT() {
            return isint;
        }

        /**
         * Sets the value of the isint property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISINT(Boolean value) {
            this.isint = value;
        }

        /**
         * Gets the value of the istin property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISTIN() {
            return istin;
        }

        /**
         * Sets the value of the istin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISTIN(Boolean value) {
            this.istin = value;
        }

        /**
         * Gets the value of the isndt property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISNDT() {
            return isndt;
        }

        /**
         * Sets the value of the isndt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISNDT(Boolean value) {
            this.isndt = value;
        }

        /**
         * Gets the value of the isobd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISOBD() {
            return isobd;
        }

        /**
         * Sets the value of the isobd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISOBD(Boolean value) {
            this.isobd = value;
        }

        /**
         * Gets the value of the isobs property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISOBS() {
            return isobs;
        }

        /**
         * Sets the value of the isobs property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISOBS(Boolean value) {
            this.isobs = value;
        }

        /**
         * Gets the value of the isopd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISOPD() {
            return isopd;
        }

        /**
         * Sets the value of the isopd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISOPD(Boolean value) {
            this.isopd = value;
        }

        /**
         * Gets the value of the isope property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISOPE() {
            return isope;
        }

        /**
         * Sets the value of the isope property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISOPE(Boolean value) {
            this.isope = value;
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
     *         &lt;element name="AIR_FARE_FROM_REMARKS" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SEGMENT_ASSOCIATION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "airfarefromremarks"
    })
    public static class INVOICEDATA
        implements Serializable
    {

        @XmlElement(name = "AIR_FARE_FROM_REMARKS")
        protected List<PNRType.INVOICEDATA.AIRFAREFROMREMARKS> airfarefromremarks;

        /**
         * Gets the value of the airfarefromremarks property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airfarefromremarks property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAIRFAREFROMREMARKS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRType.INVOICEDATA.AIRFAREFROMREMARKS }
         * 
         * 
         */
        public List<PNRType.INVOICEDATA.AIRFAREFROMREMARKS> getAIRFAREFROMREMARKS() {
            if (airfarefromremarks == null) {
                airfarefromremarks = new ArrayList<PNRType.INVOICEDATA.AIRFAREFROMREMARKS>();
            }
            return this.airfarefromremarks;
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
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SEGMENT_ASSOCIATION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "amount",
            "currency",
            "segmentassociation"
        })
        public static class AIRFAREFROMREMARKS
            implements Serializable
        {

            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "AMOUNT")
            protected String amount;
            @XmlElement(name = "CURRENCY")
            protected String currency;
            @XmlElement(name = "SEGMENT_ASSOCIATION")
            protected List<String> segmentassociation;

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
             * Gets the value of the segmentassociation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the segmentassociation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSEGMENTASSOCIATION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSEGMENTASSOCIATION() {
                if (segmentassociation == null) {
                    segmentassociation = new ArrayList<String>();
                }
                return this.segmentassociation;
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
     *         &lt;element name="AIRLINE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AIRLINE_REC_LOC" type="{}unprotectedStringType"/&gt;
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
        "airline",
        "airlinerecloc"
    })
    public static class LISTAIRLINERECLOC
        implements Serializable
    {

        @XmlElement(name = "AIRLINE", required = true)
        protected PNRType.LISTAIRLINERECLOC.AIRLINE airline;
        @XmlElement(name = "AIRLINE_REC_LOC", required = true)
        protected String airlinerecloc;

        /**
         * Gets the value of the airline property.
         * 
         * @return
         *     possible object is
         *     {@link PNRType.LISTAIRLINERECLOC.AIRLINE }
         *     
         */
        public PNRType.LISTAIRLINERECLOC.AIRLINE getAIRLINE() {
            return airline;
        }

        /**
         * Sets the value of the airline property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRType.LISTAIRLINERECLOC.AIRLINE }
         *     
         */
        public void setAIRLINE(PNRType.LISTAIRLINERECLOC.AIRLINE value) {
            this.airline = value;
        }

        /**
         * Gets the value of the airlinerecloc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRLINERECLOC() {
            return airlinerecloc;
        }

        /**
         * Sets the value of the airlinerecloc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRLINERECLOC(String value) {
            this.airlinerecloc = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        public static class AIRLINE
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "NAME", required = true)
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
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "name",
        "status"
    })
    public static class LISTCOMMANDINFO
        implements Serializable
    {

        @XmlElement(name = "NAME", required = true)
        protected Object name;
        @XmlElement(name = "STATUS", required = true)
        protected String status;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNAME(Object value) {
            this.name = value;
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
     *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="RECEIVER_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_RECEIVER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RECEIVER_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="ACCESS_RIGHTS" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "elementid",
        "receivertype",
        "listreceiver"
    })
    public static class LISTELEMENTSECURITY
        implements Serializable
    {

        @XmlElement(name = "ELEMENT_ID")
        protected BigInteger elementid;
        @XmlElement(name = "RECEIVER_TYPE")
        protected String receivertype;
        @XmlElement(name = "LIST_RECEIVER")
        protected List<PNRType.LISTELEMENTSECURITY.LISTRECEIVER> listreceiver;

        /**
         * Gets the value of the elementid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getELEMENTID() {
            return elementid;
        }

        /**
         * Sets the value of the elementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setELEMENTID(BigInteger value) {
            this.elementid = value;
        }

        /**
         * Gets the value of the receivertype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECEIVERTYPE() {
            return receivertype;
        }

        /**
         * Sets the value of the receivertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECEIVERTYPE(String value) {
            this.receivertype = value;
        }

        /**
         * Gets the value of the listreceiver property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listreceiver property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTRECEIVER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRType.LISTELEMENTSECURITY.LISTRECEIVER }
         * 
         * 
         */
        public List<PNRType.LISTELEMENTSECURITY.LISTRECEIVER> getLISTRECEIVER() {
            if (listreceiver == null) {
                listreceiver = new ArrayList<PNRType.LISTELEMENTSECURITY.LISTRECEIVER>();
            }
            return this.listreceiver;
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
         *         &lt;element name="RECEIVER_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="ACCESS_RIGHTS" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "receiverid",
            "accessrights"
        })
        public static class LISTRECEIVER
            implements Serializable
        {

            @XmlElement(name = "RECEIVER_ID")
            protected String receiverid;
            @XmlElement(name = "ACCESS_RIGHTS")
            protected String accessrights;

            /**
             * Gets the value of the receiverid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRECEIVERID() {
                return receiverid;
            }

            /**
             * Sets the value of the receiverid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRECEIVERID(String value) {
                this.receiverid = value;
            }

            /**
             * Gets the value of the accessrights property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCESSRIGHTS() {
                return accessrights;
            }

            /**
             * Sets the value of the accessrights property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCESSRIGHTS(String value) {
                this.accessrights = value;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "cityreference",
        "date"
    })
    public static class LISTEXPIREDATE
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected Object type;
        @XmlElement(name = "CITY_REFERENCE", required = true)
        protected Object cityreference;
        @XmlElement(name = "DATE", required = true)
        protected Object date;

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
         * Gets the value of the cityreference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCITYREFERENCE() {
            return cityreference;
        }

        /**
         * Sets the value of the cityreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCITYREFERENCE(Object value) {
            this.cityreference = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDATE(Object value) {
            this.date = value;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IS_HOMOGENEOUS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "ishomogeneous"
    })
    public static class LISTHOMOGENEOUSCHECK
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "IS_HOMOGENEOUS")
        protected boolean ishomogeneous;

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
         * Gets the value of the ishomogeneous property.
         * 
         */
        public boolean isISHOMOGENEOUS() {
            return ishomogeneous;
        }

        /**
         * Sets the value of the ishomogeneous property.
         * 
         */
        public void setISHOMOGENEOUS(boolean value) {
            this.ishomogeneous = value;
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
     *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TEXT_INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TAX" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TAX_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     *         &lt;element name="MCO_TKT_NB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MCO_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IS_OLD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FARE_AMOUNT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="REISSUE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "city",
        "date",
        "surname",
        "passengerid",
        "textinfo",
        "listtax",
        "mcotktnb",
        "mcotype",
        "linenumber",
        "isold",
        "currency",
        "amount",
        "fareamount",
        "reissueindicator"
    })
    public static class LISTMCO
        implements Serializable
    {

        @XmlElement(name = "CITY")
        protected String city;
        @XmlElement(name = "DATE")
        protected String date;
        @XmlElement(name = "SURNAME")
        protected String surname;
        @XmlElement(name = "PASSENGER_ID")
        protected String passengerid;
        @XmlElement(name = "TEXT_INFO")
        protected String textinfo;
        @XmlElement(name = "LIST_TAX")
        protected List<PNRType.LISTMCO.LISTTAX> listtax;
        @XmlElement(name = "MCO_TKT_NB")
        protected String mcotktnb;
        @XmlElement(name = "MCO_TYPE")
        protected String mcotype;
        @XmlElement(name = "LINE_NUMBER")
        protected String linenumber;
        @XmlElement(name = "IS_OLD")
        protected Boolean isold;
        @XmlElement(name = "CURRENCY")
        protected PNRType.LISTMCO.CURRENCY currency;
        @XmlElement(name = "AMOUNT")
        protected String amount;
        @XmlElement(name = "FARE_AMOUNT")
        protected PNRType.LISTMCO.FAREAMOUNT fareamount;
        @XmlElement(name = "REISSUE_INDICATOR")
        protected Boolean reissueindicator;

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITY() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITY(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATE(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the surname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSURNAME() {
            return surname;
        }

        /**
         * Sets the value of the surname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSURNAME(String value) {
            this.surname = value;
        }

        /**
         * Gets the value of the passengerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSENGERID() {
            return passengerid;
        }

        /**
         * Sets the value of the passengerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSENGERID(String value) {
            this.passengerid = value;
        }

        /**
         * Gets the value of the textinfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTEXTINFO() {
            return textinfo;
        }

        /**
         * Sets the value of the textinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTEXTINFO(String value) {
            this.textinfo = value;
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
         * {@link PNRType.LISTMCO.LISTTAX }
         * 
         * 
         */
        public List<PNRType.LISTMCO.LISTTAX> getLISTTAX() {
            if (listtax == null) {
                listtax = new ArrayList<PNRType.LISTMCO.LISTTAX>();
            }
            return this.listtax;
        }

        /**
         * Gets the value of the mcotktnb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMCOTKTNB() {
            return mcotktnb;
        }

        /**
         * Sets the value of the mcotktnb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMCOTKTNB(String value) {
            this.mcotktnb = value;
        }

        /**
         * Gets the value of the mcotype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMCOTYPE() {
            return mcotype;
        }

        /**
         * Sets the value of the mcotype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMCOTYPE(String value) {
            this.mcotype = value;
        }

        /**
         * Gets the value of the linenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINENUMBER() {
            return linenumber;
        }

        /**
         * Sets the value of the linenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINENUMBER(String value) {
            this.linenumber = value;
        }

        /**
         * Gets the value of the isold property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISOLD() {
            return isold;
        }

        /**
         * Sets the value of the isold property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISOLD(Boolean value) {
            this.isold = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link PNRType.LISTMCO.CURRENCY }
         *     
         */
        public PNRType.LISTMCO.CURRENCY getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRType.LISTMCO.CURRENCY }
         *     
         */
        public void setCURRENCY(PNRType.LISTMCO.CURRENCY value) {
            this.currency = value;
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
         * Gets the value of the fareamount property.
         * 
         * @return
         *     possible object is
         *     {@link PNRType.LISTMCO.FAREAMOUNT }
         *     
         */
        public PNRType.LISTMCO.FAREAMOUNT getFAREAMOUNT() {
            return fareamount;
        }

        /**
         * Sets the value of the fareamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRType.LISTMCO.FAREAMOUNT }
         *     
         */
        public void setFAREAMOUNT(PNRType.LISTMCO.FAREAMOUNT value) {
            this.fareamount = value;
        }

        /**
         * Gets the value of the reissueindicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isREISSUEINDICATOR() {
            return reissueindicator;
        }

        /**
         * Sets the value of the reissueindicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setREISSUEINDICATOR(Boolean value) {
            this.reissueindicator = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
         *         &lt;element name="CURRENCY" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "amount"
        })
        public static class FAREAMOUNT
            implements Serializable
        {

            @XmlElement(name = "CURRENCY")
            protected PNRType.LISTMCO.FAREAMOUNT.CURRENCY currency;
            @XmlElement(name = "AMOUNT")
            protected String amount;

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link PNRType.LISTMCO.FAREAMOUNT.CURRENCY }
             *     
             */
            public PNRType.LISTMCO.FAREAMOUNT.CURRENCY getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRType.LISTMCO.FAREAMOUNT.CURRENCY }
             *     
             */
            public void setCURRENCY(PNRType.LISTMCO.FAREAMOUNT.CURRENCY value) {
                this.currency = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
         *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TAX_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "category",
            "amount",
            "taxcode",
            "currency"
        })
        public static class LISTTAX
            implements Serializable
        {

            @XmlElement(name = "CATEGORY")
            protected String category;
            @XmlElement(name = "AMOUNT")
            protected String amount;
            @XmlElement(name = "TAX_CODE")
            protected String taxcode;
            @XmlElement(name = "CURRENCY")
            protected PNRType.LISTMCO.LISTTAX.CURRENCY currency;

            /**
             * Gets the value of the category property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCATEGORY() {
                return category;
            }

            /**
             * Sets the value of the category property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCATEGORY(String value) {
                this.category = value;
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
             * Gets the value of the taxcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAXCODE() {
                return taxcode;
            }

            /**
             * Sets the value of the taxcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAXCODE(String value) {
                this.taxcode = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link PNRType.LISTMCO.LISTTAX.CURRENCY }
             *     
             */
            public PNRType.LISTMCO.LISTTAX.CURRENCY getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRType.LISTMCO.LISTTAX.CURRENCY }
             *     
             */
            public void setCURRENCY(PNRType.LISTMCO.LISTTAX.CURRENCY value) {
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
             *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
     *     &lt;extension base="{}miscPricingRecordType"&gt;
     *       &lt;attribute name="technicalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LISTMISCPRICINGRECORD
        extends MiscPricingRecordType
        implements Serializable
    {

        @XmlAttribute(name = "technicalId")
        protected String technicalId;

        /**
         * Gets the value of the technicalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicalId() {
            return technicalId;
        }

        /**
         * Sets the value of the technicalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnicalId(String value) {
            this.technicalId = value;
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
     *         &lt;group ref="{}PriceWithFeesGroup"/&gt;
     *         &lt;element name="TOTAL_REBOOK_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "amount",
        "currency",
        "servicefeeamount",
        "listfee",
        "totalamount",
        "totalrebookbalance"
    })
    public static class LISTPNRPRICE
        implements Serializable
    {

        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;
        @XmlElement(name = "SERVICE_FEE_AMOUNT")
        protected BigDecimal servicefeeamount;
        @XmlElement(name = "LIST_FEE")
        protected List<FEEType> listfee;
        @XmlElement(name = "TOTAL_AMOUNT", required = true)
        protected BigDecimal totalamount;
        @XmlElement(name = "TOTAL_REBOOK_BALANCE")
        protected BigDecimal totalrebookbalance;

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
         * Gets the value of the servicefeeamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSERVICEFEEAMOUNT() {
            return servicefeeamount;
        }

        /**
         * Sets the value of the servicefeeamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSERVICEFEEAMOUNT(BigDecimal value) {
            this.servicefeeamount = value;
        }

        /**
         * Gets the value of the listfee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFEE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FEEType }
         * 
         * 
         */
        public List<FEEType> getLISTFEE() {
            if (listfee == null) {
                listfee = new ArrayList<FEEType>();
            }
            return this.listfee;
        }

        /**
         * Gets the value of the totalamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALAMOUNT() {
            return totalamount;
        }

        /**
         * Sets the value of the totalamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALAMOUNT(BigDecimal value) {
            this.totalamount = value;
        }

        /**
         * Gets the value of the totalrebookbalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALREBOOKBALANCE() {
            return totalrebookbalance;
        }

        /**
         * Sets the value of the totalrebookbalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALREBOOKBALANCE(BigDecimal value) {
            this.totalrebookbalance = value;
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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "id",
        "type"
    })
    public static class LISTPRODUCT
        implements Serializable
    {

        @XmlElement(name = "ID", required = true)
        protected BigInteger id;
        @XmlElement(name = "TYPE", required = true)
        protected String type;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setID(BigInteger value) {
            this.id = value;
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
     *         &lt;element name="PROGRAM_TYPE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="PAF"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
        "programtype"
    })
    public static class LISTPROGRAMINFORMATION
        implements Serializable
    {

        @XmlElement(name = "PROGRAM_TYPE", required = true)
        protected String programtype;

        /**
         * Gets the value of the programtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROGRAMTYPE() {
            return programtype;
        }

        /**
         * Sets the value of the programtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROGRAMTYPE(String value) {
            this.programtype = value;
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
     *         &lt;element name="CONTROL_NUMBER" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IS_PREFERRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "controlnumber",
        "carriercode",
        "ispreferred"
    })
    public static class LISTRESERVATIONNUMBER
        implements Serializable
    {

        @XmlElement(name = "CONTROL_NUMBER", required = true)
        protected String controlnumber;
        @XmlElement(name = "CARRIER_CODE")
        protected String carriercode;
        @XmlElement(name = "IS_PREFERRED")
        protected Boolean ispreferred;

        /**
         * Gets the value of the controlnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTROLNUMBER() {
            return controlnumber;
        }

        /**
         * Sets the value of the controlnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTROLNUMBER(String value) {
            this.controlnumber = value;
        }

        /**
         * Gets the value of the carriercode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARRIERCODE() {
            return carriercode;
        }

        /**
         * Sets the value of the carriercode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARRIERCODE(String value) {
            this.carriercode = value;
        }

        /**
         * Gets the value of the ispreferred property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISPREFERRED() {
            return ispreferred;
        }

        /**
         * Sets the value of the ispreferred property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISPREFERRED(Boolean value) {
            this.ispreferred = value;
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
     *         &lt;element name="SERVICE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="SERVICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="SERVICE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="AIRLINE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="CHARGEABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PACK_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="IS_PACK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="LIST_ADDITIONAL_SEAT_LINKED" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ADDITIONAL_SEAT_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="E_LOCATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="B_LOCATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BOOKING_ACTION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="NVA" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="DETAILS" type="{}ServiceRequestDetailsType" minOccurs="0"/&gt;
     *         &lt;element name="RFIC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="RFISC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "servicetype",
        "serviceid",
        "index",
        "number",
        "servicecode",
        "status",
        "airline",
        "freetext",
        "chargeable",
        "listtravellerid",
        "listsegmentid",
        "packid",
        "ispack",
        "listadditionalseatlinked",
        "elocation",
        "blocation",
        "bookingactioncode",
        "nva",
        "details",
        "rfic",
        "rfisc"
    })
    public static class LISTSERVICEREQUEST
        implements Serializable
    {

        @XmlElement(name = "SERVICE_TYPE")
        protected String servicetype;
        @XmlElement(name = "SERVICE_ID")
        protected String serviceid;
        @XmlElement(name = "INDEX")
        protected BigInteger index;
        @XmlElement(name = "NUMBER")
        protected BigInteger number;
        @XmlElement(name = "SERVICE_CODE")
        protected String servicecode;
        @XmlElement(name = "STATUS")
        protected String status;
        @XmlElement(name = "AIRLINE")
        protected PNRType.LISTSERVICEREQUEST.AIRLINE airline;
        @XmlElement(name = "FREE_TEXT")
        protected String freetext;
        @XmlElement(name = "CHARGEABLE")
        protected Boolean chargeable;
        @XmlElement(name = "LIST_TRAVELLER_ID")
        protected List<BigInteger> listtravellerid;
        @XmlElement(name = "LIST_SEGMENT_ID")
        protected List<BigInteger> listsegmentid;
        @XmlElement(name = "PACK_ID")
        protected String packid;
        @XmlElement(name = "IS_PACK")
        protected Boolean ispack;
        @XmlElement(name = "LIST_ADDITIONAL_SEAT_LINKED")
        protected List<PNRType.LISTSERVICEREQUEST.LISTADDITIONALSEATLINKED> listadditionalseatlinked;
        @XmlElement(name = "E_LOCATION")
        protected PNRType.LISTSERVICEREQUEST.ELOCATION elocation;
        @XmlElement(name = "B_LOCATION")
        protected PNRType.LISTSERVICEREQUEST.BLOCATION blocation;
        @XmlElement(name = "BOOKING_ACTION_CODE")
        protected String bookingactioncode;
        @XmlElement(name = "NVA")
        protected String nva;
        @XmlElement(name = "DETAILS")
        protected ServiceRequestDetailsType details;
        @XmlElement(name = "RFIC")
        protected Object rfic;
        @XmlElement(name = "RFISC")
        protected Object rfisc;

        /**
         * Gets the value of the servicetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSERVICETYPE() {
            return servicetype;
        }

        /**
         * Sets the value of the servicetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSERVICETYPE(String value) {
            this.servicetype = value;
        }

        /**
         * Gets the value of the serviceid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSERVICEID() {
            return serviceid;
        }

        /**
         * Sets the value of the serviceid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSERVICEID(String value) {
            this.serviceid = value;
        }

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getINDEX() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setINDEX(BigInteger value) {
            this.index = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMBER(BigInteger value) {
            this.number = value;
        }

        /**
         * Gets the value of the servicecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSERVICECODE() {
            return servicecode;
        }

        /**
         * Sets the value of the servicecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSERVICECODE(String value) {
            this.servicecode = value;
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
         * Gets the value of the airline property.
         * 
         * @return
         *     possible object is
         *     {@link PNRType.LISTSERVICEREQUEST.AIRLINE }
         *     
         */
        public PNRType.LISTSERVICEREQUEST.AIRLINE getAIRLINE() {
            return airline;
        }

        /**
         * Sets the value of the airline property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRType.LISTSERVICEREQUEST.AIRLINE }
         *     
         */
        public void setAIRLINE(PNRType.LISTSERVICEREQUEST.AIRLINE value) {
            this.airline = value;
        }

        /**
         * Gets the value of the freetext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFREETEXT() {
            return freetext;
        }

        /**
         * Sets the value of the freetext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFREETEXT(String value) {
            this.freetext = value;
        }

        /**
         * Gets the value of the chargeable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCHARGEABLE() {
            return chargeable;
        }

        /**
         * Sets the value of the chargeable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCHARGEABLE(Boolean value) {
            this.chargeable = value;
        }

        /**
         * Gets the value of the listtravellerid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTTRAVELLERID() {
            if (listtravellerid == null) {
                listtravellerid = new ArrayList<BigInteger>();
            }
            return this.listtravellerid;
        }

        /**
         * Gets the value of the listsegmentid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsegmentid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEGMENTID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTSEGMENTID() {
            if (listsegmentid == null) {
                listsegmentid = new ArrayList<BigInteger>();
            }
            return this.listsegmentid;
        }

        /**
         * Gets the value of the packid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPACKID() {
            return packid;
        }

        /**
         * Sets the value of the packid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPACKID(String value) {
            this.packid = value;
        }

        /**
         * Gets the value of the ispack property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISPACK() {
            return ispack;
        }

        /**
         * Sets the value of the ispack property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISPACK(Boolean value) {
            this.ispack = value;
        }

        /**
         * Gets the value of the listadditionalseatlinked property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listadditionalseatlinked property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTADDITIONALSEATLINKED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRType.LISTSERVICEREQUEST.LISTADDITIONALSEATLINKED }
         * 
         * 
         */
        public List<PNRType.LISTSERVICEREQUEST.LISTADDITIONALSEATLINKED> getLISTADDITIONALSEATLINKED() {
            if (listadditionalseatlinked == null) {
                listadditionalseatlinked = new ArrayList<PNRType.LISTSERVICEREQUEST.LISTADDITIONALSEATLINKED>();
            }
            return this.listadditionalseatlinked;
        }

        /**
         * Gets the value of the elocation property.
         * 
         * @return
         *     possible object is
         *     {@link PNRType.LISTSERVICEREQUEST.ELOCATION }
         *     
         */
        public PNRType.LISTSERVICEREQUEST.ELOCATION getELOCATION() {
            return elocation;
        }

        /**
         * Sets the value of the elocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRType.LISTSERVICEREQUEST.ELOCATION }
         *     
         */
        public void setELOCATION(PNRType.LISTSERVICEREQUEST.ELOCATION value) {
            this.elocation = value;
        }

        /**
         * Gets the value of the blocation property.
         * 
         * @return
         *     possible object is
         *     {@link PNRType.LISTSERVICEREQUEST.BLOCATION }
         *     
         */
        public PNRType.LISTSERVICEREQUEST.BLOCATION getBLOCATION() {
            return blocation;
        }

        /**
         * Sets the value of the blocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRType.LISTSERVICEREQUEST.BLOCATION }
         *     
         */
        public void setBLOCATION(PNRType.LISTSERVICEREQUEST.BLOCATION value) {
            this.blocation = value;
        }

        /**
         * Gets the value of the bookingactioncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOOKINGACTIONCODE() {
            return bookingactioncode;
        }

        /**
         * Sets the value of the bookingactioncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOOKINGACTIONCODE(String value) {
            this.bookingactioncode = value;
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
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceRequestDetailsType }
         *     
         */
        public ServiceRequestDetailsType getDETAILS() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceRequestDetailsType }
         *     
         */
        public void setDETAILS(ServiceRequestDetailsType value) {
            this.details = value;
        }

        /**
         * Gets the value of the rfic property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRFIC() {
            return rfic;
        }

        /**
         * Sets the value of the rfic property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRFIC(Object value) {
            this.rfic = value;
        }

        /**
         * Gets the value of the rfisc property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRFISC() {
            return rfisc;
        }

        /**
         * Sets the value of the rfisc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRFISC(Object value) {
            this.rfisc = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        public static class AIRLINE
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
         *         &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "citycode",
            "cityname",
            "locationcode",
            "locationname",
            "statecode",
            "statename",
            "countrycode",
            "countryname"
        })
        public static class BLOCATION
            implements Serializable
        {

            @XmlElement(name = "CITY_CODE")
            protected String citycode;
            @XmlElement(name = "CITY_NAME")
            protected String cityname;
            @XmlElement(name = "LOCATION_CODE")
            protected String locationcode;
            @XmlElement(name = "LOCATION_NAME")
            protected String locationname;
            @XmlElement(name = "STATE_CODE")
            protected String statecode;
            @XmlElement(name = "STATE_NAME")
            protected String statename;
            @XmlElement(name = "COUNTRY_CODE")
            protected String countrycode;
            @XmlElement(name = "COUNTRY_NAME")
            protected String countryname;

            /**
             * Gets the value of the citycode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCITYCODE() {
                return citycode;
            }

            /**
             * Sets the value of the citycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCITYCODE(String value) {
                this.citycode = value;
            }

            /**
             * Gets the value of the cityname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCITYNAME() {
                return cityname;
            }

            /**
             * Sets the value of the cityname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCITYNAME(String value) {
                this.cityname = value;
            }

            /**
             * Gets the value of the locationcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOCATIONCODE() {
                return locationcode;
            }

            /**
             * Sets the value of the locationcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOCATIONCODE(String value) {
                this.locationcode = value;
            }

            /**
             * Gets the value of the locationname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOCATIONNAME() {
                return locationname;
            }

            /**
             * Sets the value of the locationname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOCATIONNAME(String value) {
                this.locationname = value;
            }

            /**
             * Gets the value of the statecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATECODE() {
                return statecode;
            }

            /**
             * Sets the value of the statecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATECODE(String value) {
                this.statecode = value;
            }

            /**
             * Gets the value of the statename property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATENAME() {
                return statename;
            }

            /**
             * Sets the value of the statename property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATENAME(String value) {
                this.statename = value;
            }

            /**
             * Gets the value of the countrycode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRYCODE() {
                return countrycode;
            }

            /**
             * Sets the value of the countrycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRYCODE(String value) {
                this.countrycode = value;
            }

            /**
             * Gets the value of the countryname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRYNAME() {
                return countryname;
            }

            /**
             * Sets the value of the countryname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRYNAME(String value) {
                this.countryname = value;
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
         *         &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "citycode",
            "cityname",
            "locationcode",
            "locationname",
            "statecode",
            "statename",
            "countrycode",
            "countryname"
        })
        public static class ELOCATION
            implements Serializable
        {

            @XmlElement(name = "CITY_CODE")
            protected String citycode;
            @XmlElement(name = "CITY_NAME")
            protected String cityname;
            @XmlElement(name = "LOCATION_CODE")
            protected String locationcode;
            @XmlElement(name = "LOCATION_NAME")
            protected String locationname;
            @XmlElement(name = "STATE_CODE")
            protected String statecode;
            @XmlElement(name = "STATE_NAME")
            protected String statename;
            @XmlElement(name = "COUNTRY_CODE")
            protected String countrycode;
            @XmlElement(name = "COUNTRY_NAME")
            protected String countryname;

            /**
             * Gets the value of the citycode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCITYCODE() {
                return citycode;
            }

            /**
             * Sets the value of the citycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCITYCODE(String value) {
                this.citycode = value;
            }

            /**
             * Gets the value of the cityname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCITYNAME() {
                return cityname;
            }

            /**
             * Sets the value of the cityname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCITYNAME(String value) {
                this.cityname = value;
            }

            /**
             * Gets the value of the locationcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOCATIONCODE() {
                return locationcode;
            }

            /**
             * Sets the value of the locationcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOCATIONCODE(String value) {
                this.locationcode = value;
            }

            /**
             * Gets the value of the locationname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOCATIONNAME() {
                return locationname;
            }

            /**
             * Sets the value of the locationname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOCATIONNAME(String value) {
                this.locationname = value;
            }

            /**
             * Gets the value of the statecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATECODE() {
                return statecode;
            }

            /**
             * Sets the value of the statecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATECODE(String value) {
                this.statecode = value;
            }

            /**
             * Gets the value of the statename property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATENAME() {
                return statename;
            }

            /**
             * Sets the value of the statename property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATENAME(String value) {
                this.statename = value;
            }

            /**
             * Gets the value of the countrycode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRYCODE() {
                return countrycode;
            }

            /**
             * Sets the value of the countrycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRYCODE(String value) {
                this.countrycode = value;
            }

            /**
             * Gets the value of the countryname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRYNAME() {
                return countryname;
            }

            /**
             * Sets the value of the countryname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRYNAME(String value) {
                this.countryname = value;
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
         *         &lt;element name="ADDITIONAL_SEAT_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "additionalseatid",
            "code",
            "name"
        })
        public static class LISTADDITIONALSEATLINKED
            implements Serializable
        {

            @XmlElement(name = "ADDITIONAL_SEAT_ID")
            protected String additionalseatid;
            @XmlElement(name = "CODE")
            protected String code;
            @XmlElement(name = "NAME")
            protected String name;

            /**
             * Gets the value of the additionalseatid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDITIONALSEATID() {
                return additionalseatid;
            }

            /**
             * Sets the value of the additionalseatid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDITIONALSEATID(String value) {
                this.additionalseatid = value;
            }

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
     *     &lt;extension base="{}miscPricingRecordType"&gt;
     *       &lt;attribute name="technicalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LISTTASF
        extends MiscPricingRecordType
        implements Serializable
    {

        @XmlAttribute(name = "technicalId")
        protected String technicalId;

        /**
         * Gets the value of the technicalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicalId() {
            return technicalId;
        }

        /**
         * Sets the value of the technicalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnicalId(String value) {
            this.technicalId = value;
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
     *         &lt;element name="ARRANGEMENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="DATE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TICKETING_OFFICE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IS_ETICKETED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="AIRLINE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "arrangement",
        "date",
        "ticketingoffice",
        "freetext",
        "travellertype",
        "listtravellerid",
        "listsegmentid",
        "iseticketed",
        "airline"
    })
    public static class LISTTICKETINGELEMENT
        implements Serializable
    {

        @XmlElement(name = "ARRANGEMENT")
        protected String arrangement;
        @XmlElement(name = "DATE")
        protected PNRType.LISTTICKETINGELEMENT.DATE date;
        @XmlElement(name = "TICKETING_OFFICE")
        protected String ticketingoffice;
        @XmlElement(name = "FREE_TEXT")
        protected String freetext;
        @XmlElement(name = "TRAVELLER_TYPE")
        protected String travellertype;
        @XmlElement(name = "LIST_TRAVELLER_ID")
        protected List<BigInteger> listtravellerid;
        @XmlElement(name = "LIST_SEGMENT_ID")
        protected List<BigInteger> listsegmentid;
        @XmlElement(name = "IS_ETICKETED")
        protected Boolean iseticketed;
        @XmlElement(name = "AIRLINE")
        protected PNRType.LISTTICKETINGELEMENT.AIRLINE airline;

        /**
         * Gets the value of the arrangement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getARRANGEMENT() {
            return arrangement;
        }

        /**
         * Sets the value of the arrangement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setARRANGEMENT(String value) {
            this.arrangement = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link PNRType.LISTTICKETINGELEMENT.DATE }
         *     
         */
        public PNRType.LISTTICKETINGELEMENT.DATE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRType.LISTTICKETINGELEMENT.DATE }
         *     
         */
        public void setDATE(PNRType.LISTTICKETINGELEMENT.DATE value) {
            this.date = value;
        }

        /**
         * Gets the value of the ticketingoffice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETINGOFFICE() {
            return ticketingoffice;
        }

        /**
         * Sets the value of the ticketingoffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETINGOFFICE(String value) {
            this.ticketingoffice = value;
        }

        /**
         * Gets the value of the freetext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFREETEXT() {
            return freetext;
        }

        /**
         * Sets the value of the freetext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFREETEXT(String value) {
            this.freetext = value;
        }

        /**
         * Gets the value of the travellertype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAVELLERTYPE() {
            return travellertype;
        }

        /**
         * Sets the value of the travellertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAVELLERTYPE(String value) {
            this.travellertype = value;
        }

        /**
         * Gets the value of the listtravellerid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTTRAVELLERID() {
            if (listtravellerid == null) {
                listtravellerid = new ArrayList<BigInteger>();
            }
            return this.listtravellerid;
        }

        /**
         * Gets the value of the listsegmentid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsegmentid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEGMENTID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTSEGMENTID() {
            if (listsegmentid == null) {
                listsegmentid = new ArrayList<BigInteger>();
            }
            return this.listsegmentid;
        }

        /**
         * Gets the value of the iseticketed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISETICKETED() {
            return iseticketed;
        }

        /**
         * Sets the value of the iseticketed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISETICKETED(Boolean value) {
            this.iseticketed = value;
        }

        /**
         * Gets the value of the airline property.
         * 
         * @return
         *     possible object is
         *     {@link PNRType.LISTTICKETINGELEMENT.AIRLINE }
         *     
         */
        public PNRType.LISTTICKETINGELEMENT.AIRLINE getAIRLINE() {
            return airline;
        }

        /**
         * Sets the value of the airline property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRType.LISTTICKETINGELEMENT.AIRLINE }
         *     
         */
        public void setAIRLINE(PNRType.LISTTICKETINGELEMENT.AIRLINE value) {
            this.airline = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        public static class AIRLINE
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
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DATE
            implements Serializable
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar code;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCode(XMLGregorianCalendar value) {
                this.code = value;
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
     *         &lt;element name="IS_SSR_AUTO_PRICING_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DYNAMIC_WAIVER_ELIGIBILITY" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="WAIVER_APPLIES"/&gt;
     *               &lt;enumeration value="NO_WAIVER_APPLIES"/&gt;
     *               &lt;enumeration value="UNKNOWN"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AIR_PNR_MARKET" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="AIR_MARKET_POS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="AIR_MARKET_POT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "isssrautopricingneeded",
        "dynamicwaivereligibility",
        "airpnrmarket",
        "airmarketpos",
        "airmarketpot"
    })
    public static class PNROPTIONS
        implements Serializable
    {

        @XmlElement(name = "IS_SSR_AUTO_PRICING_NEEDED")
        protected Boolean isssrautopricingneeded;
        @XmlElement(name = "DYNAMIC_WAIVER_ELIGIBILITY")
        protected String dynamicwaivereligibility;
        @XmlElement(name = "AIR_PNR_MARKET")
        protected String airpnrmarket;
        @XmlElement(name = "AIR_MARKET_POS")
        protected String airmarketpos;
        @XmlElement(name = "AIR_MARKET_POT")
        protected String airmarketpot;

        /**
         * Gets the value of the isssrautopricingneeded property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISSSRAUTOPRICINGNEEDED() {
            return isssrautopricingneeded;
        }

        /**
         * Sets the value of the isssrautopricingneeded property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISSSRAUTOPRICINGNEEDED(Boolean value) {
            this.isssrautopricingneeded = value;
        }

        /**
         * Gets the value of the dynamicwaivereligibility property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDYNAMICWAIVERELIGIBILITY() {
            return dynamicwaivereligibility;
        }

        /**
         * Sets the value of the dynamicwaivereligibility property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDYNAMICWAIVERELIGIBILITY(String value) {
            this.dynamicwaivereligibility = value;
        }

        /**
         * Gets the value of the airpnrmarket property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRPNRMARKET() {
            return airpnrmarket;
        }

        /**
         * Sets the value of the airpnrmarket property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRPNRMARKET(String value) {
            this.airpnrmarket = value;
        }

        /**
         * Gets the value of the airmarketpos property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRMARKETPOS() {
            return airmarketpos;
        }

        /**
         * Sets the value of the airmarketpos property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRMARKETPOS(String value) {
            this.airmarketpos = value;
        }

        /**
         * Gets the value of the airmarketpot property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRMARKETPOT() {
            return airmarketpot;
        }

        /**
         * Sets the value of the airmarketpot property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRMARKETPOT(String value) {
            this.airmarketpot = value;
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
     *         &lt;element name="OWNER" type="{}posType" minOccurs="0"/&gt;
     *         &lt;element name="CREATOR" type="{}posType" minOccurs="0"/&gt;
     *         &lt;element name="LAST_UPDATOR" type="{}posType" minOccurs="0"/&gt;
     *         &lt;element name="ONLINE" type="{}posType" minOccurs="0"/&gt;
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
        "owner",
        "creator",
        "lastupdator",
        "online"
    })
    public static class POSDETAILS
        implements Serializable
    {

        @XmlElement(name = "OWNER")
        protected PosType owner;
        @XmlElement(name = "CREATOR")
        protected PosType creator;
        @XmlElement(name = "LAST_UPDATOR")
        protected PosType lastupdator;
        @XmlElement(name = "ONLINE")
        protected PosType online;

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link PosType }
         *     
         */
        public PosType getOWNER() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link PosType }
         *     
         */
        public void setOWNER(PosType value) {
            this.owner = value;
        }

        /**
         * Gets the value of the creator property.
         * 
         * @return
         *     possible object is
         *     {@link PosType }
         *     
         */
        public PosType getCREATOR() {
            return creator;
        }

        /**
         * Sets the value of the creator property.
         * 
         * @param value
         *     allowed object is
         *     {@link PosType }
         *     
         */
        public void setCREATOR(PosType value) {
            this.creator = value;
        }

        /**
         * Gets the value of the lastupdator property.
         * 
         * @return
         *     possible object is
         *     {@link PosType }
         *     
         */
        public PosType getLASTUPDATOR() {
            return lastupdator;
        }

        /**
         * Sets the value of the lastupdator property.
         * 
         * @param value
         *     allowed object is
         *     {@link PosType }
         *     
         */
        public void setLASTUPDATOR(PosType value) {
            this.lastupdator = value;
        }

        /**
         * Gets the value of the online property.
         * 
         * @return
         *     possible object is
         *     {@link PosType }
         *     
         */
        public PosType getONLINE() {
            return online;
        }

        /**
         * Sets the value of the online property.
         * 
         * @param value
         *     allowed object is
         *     {@link PosType }
         *     
         */
        public void setONLINE(PosType value) {
            this.online = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class QUEUEDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
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
     *         &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_DATE_RANGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER_OF_ITEMS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="IS_LAST_ITEM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "recloc",
        "queuenumber",
        "queuecategory",
        "queuedaterange",
        "numberofitems",
        "islastitem",
        "officeid"
    })
    public static class QUEUEMODE
        implements Serializable
    {

        @XmlElement(name = "REC_LOC")
        protected String recloc;
        @XmlElement(name = "QUEUE_NUMBER")
        protected BigInteger queuenumber;
        @XmlElement(name = "QUEUE_CATEGORY")
        protected BigInteger queuecategory;
        @XmlElement(name = "QUEUE_DATE_RANGE")
        protected BigInteger queuedaterange;
        @XmlElement(name = "NUMBER_OF_ITEMS")
        protected BigInteger numberofitems;
        @XmlElement(name = "IS_LAST_ITEM")
        protected Boolean islastitem;
        @XmlElement(name = "OFFICE_ID")
        protected String officeid;

        /**
         * Gets the value of the recloc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECLOC() {
            return recloc;
        }

        /**
         * Sets the value of the recloc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECLOC(String value) {
            this.recloc = value;
        }

        /**
         * Gets the value of the queuenumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQUEUENUMBER() {
            return queuenumber;
        }

        /**
         * Sets the value of the queuenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQUEUENUMBER(BigInteger value) {
            this.queuenumber = value;
        }

        /**
         * Gets the value of the queuecategory property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQUEUECATEGORY() {
            return queuecategory;
        }

        /**
         * Sets the value of the queuecategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQUEUECATEGORY(BigInteger value) {
            this.queuecategory = value;
        }

        /**
         * Gets the value of the queuedaterange property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQUEUEDATERANGE() {
            return queuedaterange;
        }

        /**
         * Sets the value of the queuedaterange property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQUEUEDATERANGE(BigInteger value) {
            this.queuedaterange = value;
        }

        /**
         * Gets the value of the numberofitems property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMBEROFITEMS() {
            return numberofitems;
        }

        /**
         * Sets the value of the numberofitems property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMBEROFITEMS(BigInteger value) {
            this.numberofitems = value;
        }

        /**
         * Gets the value of the islastitem property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISLASTITEM() {
            return islastitem;
        }

        /**
         * Sets the value of the islastitem property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISLASTITEM(Boolean value) {
            this.islastitem = value;
        }

        /**
         * Gets the value of the officeid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFICEID() {
            return officeid;
        }

        /**
         * Sets the value of the officeid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFICEID(String value) {
            this.officeid = value;
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
     *         &lt;element name="QUEUE_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_ACTION_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="QUEUE_AUTHORIZE_OFFICES" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "queueofficeid",
        "queuenumber",
        "queuecategory",
        "queueid",
        "queuedescription",
        "queuedate",
        "queueactiontype",
        "queueauthorizeoffices",
        "listtravellerid"
    })
    public static class QUEUES
        implements Serializable
    {

        @XmlElement(name = "QUEUE_OFFICE_ID")
        protected String queueofficeid;
        @XmlElement(name = "QUEUE_NUMBER")
        protected BigInteger queuenumber;
        @XmlElement(name = "QUEUE_CATEGORY")
        protected String queuecategory;
        @XmlElement(name = "QUEUE_ID")
        protected BigInteger queueid;
        @XmlElement(name = "QUEUE_DESCRIPTION")
        protected String queuedescription;
        @XmlElement(name = "QUEUE_DATE")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar queuedate;
        @XmlElement(name = "QUEUE_ACTION_TYPE")
        protected String queueactiontype;
        @XmlElement(name = "QUEUE_AUTHORIZE_OFFICES")
        protected String queueauthorizeoffices;
        @XmlElement(name = "LIST_TRAVELLER_ID")
        protected List<BigInteger> listtravellerid;

        /**
         * Gets the value of the queueofficeid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUEUEOFFICEID() {
            return queueofficeid;
        }

        /**
         * Sets the value of the queueofficeid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUEUEOFFICEID(String value) {
            this.queueofficeid = value;
        }

        /**
         * Gets the value of the queuenumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQUEUENUMBER() {
            return queuenumber;
        }

        /**
         * Sets the value of the queuenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQUEUENUMBER(BigInteger value) {
            this.queuenumber = value;
        }

        /**
         * Gets the value of the queuecategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUEUECATEGORY() {
            return queuecategory;
        }

        /**
         * Sets the value of the queuecategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUEUECATEGORY(String value) {
            this.queuecategory = value;
        }

        /**
         * Gets the value of the queueid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQUEUEID() {
            return queueid;
        }

        /**
         * Sets the value of the queueid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQUEUEID(BigInteger value) {
            this.queueid = value;
        }

        /**
         * Gets the value of the queuedescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUEUEDESCRIPTION() {
            return queuedescription;
        }

        /**
         * Sets the value of the queuedescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUEUEDESCRIPTION(String value) {
            this.queuedescription = value;
        }

        /**
         * Gets the value of the queuedate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getQUEUEDATE() {
            return queuedate;
        }

        /**
         * Sets the value of the queuedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setQUEUEDATE(XMLGregorianCalendar value) {
            this.queuedate = value;
        }

        /**
         * Gets the value of the queueactiontype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUEUEACTIONTYPE() {
            return queueactiontype;
        }

        /**
         * Sets the value of the queueactiontype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUEUEACTIONTYPE(String value) {
            this.queueactiontype = value;
        }

        /**
         * Gets the value of the queueauthorizeoffices property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUEUEAUTHORIZEOFFICES() {
            return queueauthorizeoffices;
        }

        /**
         * Sets the value of the queueauthorizeoffices property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUEUEAUTHORIZEOFFICES(String value) {
            this.queueauthorizeoffices = value;
        }

        /**
         * Gets the value of the listtravellerid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTTRAVELLERID() {
            if (listtravellerid == null) {
                listtravellerid = new ArrayList<BigInteger>();
            }
            return this.listtravellerid;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class TICKETSTATUS
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
    public static class TICKETTYPE
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
     *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
        "value"
    })
    public static class TOTALBALANCE
        implements Serializable
    {

        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;
        @XmlElement(name = "VALUE")
        protected double value;

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
         * Gets the value of the value property.
         * 
         */
        public double getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setVALUE(double value) {
            this.value = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
    public static class TPOS
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class UPDATEDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
        }

    }

}
