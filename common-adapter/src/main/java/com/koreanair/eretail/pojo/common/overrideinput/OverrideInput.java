
package com.koreanair.eretail.pojo.common.overrideinput;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.GLOBALLISTType;
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
 *         &lt;element name="TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SITE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SO_SITE_MAX_CITY_SAME_DATE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MAX_NUM_DIFF_CITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MAX_NUM_DESTINATIONS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MULTI_DEST_ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_COMPLEX_ITINERARY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_ONEWAY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_RETURN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_WEBFARES_PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_FARE_DRIVEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FARE_DRIVEN_CHOICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TIMERANGE_MORNING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TIMERANGE_AFTERNOON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TIMERANGE_EVENING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TIMERANGE_EARLY_MORN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TIMERANGE_LATE_MORN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_MIN_AVAIL_DATE_SPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_MAX_AIR_DATE_SPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_LANG_SERVICE_FEE_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PROMPT_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_LANG_SITE_AGENCY_LINE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_LANG_SITE_AGENCY_LINE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_LANG_SITE_AGENCY_LINE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_LANG_SITE_AGENCY_LINE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_LANG_SITE_AGENCY_LINE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_LANG_SITE_AGENCY_LINE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_LANG_SITE_EMAIL_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETICKET_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PARTIAL_MATCH_ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PARTIAL_MATCH_ADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SEND_OFFI_ID_WITH_RF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MOD_PICKUP_OFFICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_QUEUE_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_QUEUE_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SP_QUEUE_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SP_QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETKT_Q_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETKT_Q_AND_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_FAILURE_QUEUE_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_FAILURE_QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_FAILURE_QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SEND_MAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MAIL_REPLY_TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PNR_ADD_EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PNR_ADD_EMAIL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_BOOL_ABONNES_SITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MIN_AVAIL_DATE_SPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MAX_AIR_DATE_SPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MIN_PASSWORD_LENGTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MAX_PASSWORD_LENGTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_DOT_FIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SPECIFIC_CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_BOOL_ALTERNATE_AVAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_OVERRIDE_AIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_NB_FLIGHTS_AVAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_BOOKING_CLASS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_DISPLAY_SHUTTLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_DISPLAY_TR_FLIGHTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ARRANGE_BY_INCLUDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_USE_PAXNUM_OPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_REST_AIRLINES_LST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_POINT_OF_SALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_POINT_OF_TICKETING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_FIRST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_BUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_ECO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FARE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FD_UP_SELL_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PRICE_ALT_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_DOWN_SELL_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MAX_FARECHOICE_COUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_INCLUDE_FARE_CHOICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PREFERRED_CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_LOW_COST_CARRIER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MINIMAL_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MAXIMAL_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_OTHER_AIRLINES_REC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FR_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_AIR_MAND_IF_HOTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_HOTEL_MIN_AVL_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_HOTEL_MAX_AVL_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RATE_CHANGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ACCESS_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_OVERRIDE_HOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_HOTEL_BALANCE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_USE_STD_RATE_AS_NEGO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_BURSTING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_BURSTED_HOTEL_NBR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_REBURST_WHEN_RESORT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_NEGO_BURST_POLICY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_BURSTED_ROOM_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_BURSTED_ROOM_POLICY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_BURSTED_NEGO_ROOM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_HOT_MULTIMEDIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_HOT_THUMBNAIL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_HOT_MARK_TEXT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PREFERRED_CHAIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_CHAIN_EXCLUDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RATE_FILTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_NEGOTIATED_RATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TRUE_RATE_RANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_HTL_MOVE_DOWN_TUNER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PRIMARY_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FORCE_GUARANTEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_IATA_NB_AS_GUARANTEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MINIMAL_TIME_MODIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_UM_LSS_ORGANISATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_AIR_MAND_IF_CAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_CAR_MINIMAL_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_CAR_MAXIMUM_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_DISPLAY_STD_ACCESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_OVERRIDE_CAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MIN_TIME_BK_CAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MAX_TIME_BK_CAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PENDING_TIME_LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ET_OVERRIDES_MINTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FORCE_TICKET_BY_MAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_VALIDATING_AIRLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_CC_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_MCO_CC_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_CC_FORMAT_VERIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_APPROVAL_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PNR_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_IGNORE_IF_FARE_FAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_IGNORE_IF_SELL_FAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_IG_SEG_IF_SELL_FAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RECEIVED_FROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ET_MAX_AIR_SEGMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ET_ALLOW_INFANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ET_AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ET_CODE_SHARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_CC_MANDATORY_FOR_ET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_BOOL_SEND_SRBSCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_PNR_NICKNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_TKT_PNR_MODIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_PNR_MODIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_PARTIAL_CANCEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_INCLUDE_CANCEL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_INCLUDE_CANCEL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TKT_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TKT_ETICKET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TKT_EXP_MAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TKT_HAND_DELIV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TKT_NONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TKT_PICK_UP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TKT_PICKUP_AIRL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TKT_PICKUP_ARPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_EXP_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TICKETING_TIME_LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TK_ARRANGEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TK_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TK_DATE_TRANSACTION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TK_TIME_PERIOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_AVAIL_DIRECT_ACCESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_DIRECT_ACCESS_AIRLIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_HOTEL_AVAIL_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_DEPOSIT_EXCLUDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_POI_IATA_TYPE_FILTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FC_INCLUDE_AIRLINES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FC_EXCLUDE_AIRLINES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_PNR_RECONF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ADDR_BILLING_FMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_EXCLUDE_AIRLINES_LST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_PREF_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_USER_CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_ALLOW_RETURN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_ALLOW_ONEWAY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_WITHHOLD_TAXES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_WITHHOLD_SURCHARG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_BACKUP_TO_CAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_CAL_BCKUP_C" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_OBFCA_FROM_AVAIL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SD_OBFCA_FROM_FAR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_CAL_BCKUP_I" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_PREF_CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_DIRECT_NON_STOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_SERVICE_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SERVICE_FEE_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_USE_SITE_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_MKP_DISCNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_APPLIC_DISC_ON_FARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FEE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FEE_PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FEE_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_TRACES_ON" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_VERIFY_FF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETIX_ALLOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TBM_ALLOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TOD_ALLOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETIX_PLUS_TBM_ALLOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TBM_MIN_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TOD_MIN_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TOD_MAX_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETIX_MIN_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MOD_TYPE_FILTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETIX_FLIGHT_FILTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETIX_AGR_FILTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_AWARD_FLOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETIX_MIN_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TBM_MIN_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_EXP_TBM_MIN_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_EXP_TBM_FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_EXP_TBM_FEE_CURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MIN_REBOOK_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MAX_REBOOK_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_AVERAGE_REBOOK_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_CURRENCY_REBOOK_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_APIV2_SERVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_APIV2_SERVER_USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_APIV2_SERVER_PWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ZAMBAS_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_DISABLE_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_POJO_ACTIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_SO_CAL_MAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_WEBFARES_PLISTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_WEBFARES_SLISTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_GL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GLOBAL_LIST" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}GLOBAL_LIST_Type"&gt;
 *                           &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" default="complete" /&gt;
 *                           &lt;attribute name="nbKey" type="{http://www.w3.org/2001/XMLSchema}int" default="1" /&gt;
 *                           &lt;attribute name="keyIndex" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SO_SITE_IATA_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SS_OPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FARE_SOLD_OUT_FLIGHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ADDR_DELIVERY_FMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MANDATORY_D_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MOP_DD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_MOP_DD_BOOKING_TIME" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_AGT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_COUNTRY_OF_RESIDENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SPECIAL_OFFER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ONLINE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETIX_QUEUE_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TBM_QUEUE_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TOD_QUEUE_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETIX_QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TBM_QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TOD_QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ETIX_QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TBM_QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TOD_QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_PROFILELESS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PAX_DISPLAY_RULE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SUPPLY_FARE_CALC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_USE_SITE_RBK_FEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RBK_FEE_TYPE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RBK_FEE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RBK_ADD_FEE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RBK_FEE_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RBK_USE_DEDUCED_CFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RM_DISCOUNT_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RM_MARKUP_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SERVICE_FEE_WF_AMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SERVICE_FEE_WF_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_REDEM_BOOKING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_DISP_REDEM_COST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_REDEM_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FAR_DISP_REDEM_COST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FARING_REDEM_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FAR_VALID_REDEM_COST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FAR_VALID_REDEM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_REDEM_FB_INDEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_REDEM_FB_DIGIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_REDEM_FB_COEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PATHEO_SERVER_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PATHEO_LOGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PATHEO_PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_GDS_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PASS_GDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PASS_PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PASS_PROVIDER_CFG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_PASS_XX_TRACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ITA_PRECHECK_USE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_FP_SAR_FROM_EXTERN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_EBMS_API_SERVERURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_EBMS_API_SERVICEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_DWM_ENC_ENABLED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SEND_FF_BEFORE_PRICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_IS_PSF_ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SE_XML_CONFIG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_TD_ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_LN_MERGE_LOGIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_USE_CASA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_CAR_MNDTRY_PICTURES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_CAR_MNDTRY_MODEL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_RAIL_PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_NON_REVENUE_WS_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_SWA_PASSBUR_VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO_SITE_ALLOW_CTG_OUT_OF_FSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonInputGroup"/&gt;
 *         &lt;group ref="{}ServletChainingGroup" minOccurs="0"/&gt;
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
    "transactionid",
    "site",
    "language",
    "sositemaxcitysamedate",
    "sositemaxnumdiffcity",
    "sositemaxnumdestinations",
    "sositemultidestenabled",
    "sositecomplexitinerary",
    "sositeallowoneway",
    "sositeallowreturn",
    "sositewebfaresprovider",
    "sositeallowfaredriven",
    "sositefaredrivenchoice",
    "sositetimerangemorning",
    "sositetimerangeafternoon",
    "sositetimerangeevening",
    "sositetimerangeearlymorn",
    "sositetimerangelatemorn",
    "sominavaildatespan",
    "somaxairdatespan",
    "solangservicefeecharge",
    "sositepromptfee",
    "solangsiteagencyline1",
    "solangsiteagencyline2",
    "solangsiteagencyline3",
    "solangsiteagencyline4",
    "solangsiteagencyline5",
    "solangsiteagencyline6",
    "solangsiteemailaddress",
    "sositeeticketdiscount",
    "sositepartialmatchzip",
    "sositepartialmatchaddr",
    "sositeofficeid",
    "sositesendoffiidwithrf",
    "sositemodpickupoffice",
    "soqueueofficeid",
    "soqueuenumber",
    "soqueuecategory",
    "sositequeueofficeid",
    "sositequeuecategory",
    "sositespqueueofficeid",
    "sositespqueuecategory",
    "sositeetktqofficeid",
    "sositeetktqandcat",
    "sofailurequeueofficeid",
    "sofailurequeuenumber",
    "sofailurequeuecategory",
    "sositesendmail",
    "sositemailreplyto",
    "sositepnraddemail1",
    "sositepnraddemail2",
    "sositeboolabonnessite",
    "sositeminavaildatespan",
    "sositemaxairdatespan",
    "sositeminpasswordlength",
    "sositemaxpasswordlength",
    "sositedotfield",
    "sositespecificcarrier",
    "sositeboolalternateavail",
    "sositeallowoverrideair",
    "sositenbflightsavail",
    "sositebookingclasscode",
    "sositedisplayshuttle",
    "sositedisplaytrflights",
    "sositearrangebyinclude",
    "sositeusepaxnumoption",
    "sositerestairlineslst",
    "sositepointofsale",
    "sositepointofticketing",
    "sositeallowfirst",
    "sositeallowbus",
    "sositealloweco",
    "sositefaretype",
    "sositefdupsellallowed",
    "sositepricealtclass",
    "sositedownsellallowed",
    "sositemaxfarechoicecount",
    "sositeincludefarechoice",
    "sositepreferredcarrier",
    "sositelowcostcarrier",
    "sositeminimaltime",
    "sositemaximaltime",
    "sositeotherairlinesrec",
    "sositefrtext",
    "sositeairmandifhotel",
    "sositehotelminavldate",
    "sositehotelmaxavldate",
    "sositeratechange",
    "sositeaccesslevel",
    "sositeallowoverridehot",
    "sositestatus",
    "sositehotelbalance",
    "sositeusestdrateasnego",
    "sositeallowbursting",
    "sositeburstedhotelnbr",
    "sositereburstwhenresort",
    "sositenegoburstpolicy",
    "sositeburstedroomnumber",
    "sositeburstedroompolicy",
    "sositeburstednegoroom",
    "sositehotmultimedia",
    "sositeallowhotthumbnail",
    "sositeallowhotmarktext",
    "sositepreferredchain",
    "sositechainexclude",
    "sositeratefilter",
    "sositenegotiatedrate",
    "sositetrueraterange",
    "sositehtlmovedowntuner",
    "sositeprimarycurrency",
    "sositeforceguarantee",
    "sositeiatanbasguarantee",
    "sositeminimaltimemodif",
    "sositeumlssorganisation",
    "sositeairmandifcar",
    "sositecarminimaltime",
    "sositecarmaximumtime",
    "sositedisplaystdaccess",
    "sositeallowoverridecar",
    "sositemintimebkcar",
    "sositemaxtimebkcar",
    "sositependingtimelimit",
    "sositeetoverridesmintime",
    "sositeforceticketbymail",
    "sositevalidatingairline",
    "sositefpccformat",
    "sositefpmcoccformat",
    "sositefpccformatverif",
    "sositefpapprovalformat",
    "sositepnrformat",
    "sositeignoreiffarefails",
    "sositeignoreifsellfails",
    "sositeigsegifsellfails",
    "sositereceivedfrom",
    "sositeetmaxairsegments",
    "sositeetallowinfant",
    "sositeetairlinecode",
    "sositeetcodeshare",
    "sositeccmandatoryforet",
    "soboolsendsrbsct",
    "sositeallowpnrnickname",
    "sositeallowtktpnrmodif",
    "sositeallowpnrmodif",
    "sositeallowpartialcancel",
    "sositeincludecancel1",
    "sositeincludecancel2",
    "sositetktaccount",
    "sositetkteticket",
    "sositetktexpmail",
    "sositetkthanddeliv",
    "sositetktnone",
    "sositetktpickup",
    "sositetktpickupairl",
    "sositetktpickuparpt",
    "sositeexpofficeid",
    "sositeticketingtimelimit",
    "sositetkarrangement",
    "sositetkofficeid",
    "sositetkdatetransaction",
    "sositetktimeperiod",
    "sositeavaildirectaccess",
    "sositedirectaccessairlin",
    "sositehotelavailstatus",
    "sositedepositexclude",
    "sositepoiiatatypefilter",
    "sositefcincludeairlines",
    "sositefcexcludeairlines",
    "sositeallowpnrreconf",
    "sositeaddrbillingfmt",
    "sositeexcludeairlineslst",
    "sositeallowprefcurrency",
    "sositeusercurrencycode",
    "sositefpallowreturn",
    "sositefpallowoneway",
    "sositefpwithholdtaxes",
    "sositefpwithholdsurcharg",
    "sositefpbackuptocal",
    "sositefpcalbckupc",
    "sositefpobfcafromavail",
    "sositesdobfcafromfar",
    "sositefpcalbckupi",
    "sositefpprefcarrier",
    "sositefpdirectnonstop",
    "sositeallowservicefee",
    "sositeservicefeemode",
    "sositeusesitefee",
    "sositeallowmkpdiscnt",
    "sositeapplicdisconfare",
    "sositefeetype",
    "sositefeeamount",
    "sositefeepercentage",
    "sositefeecurrency",
    "sositefptraceson",
    "sositeverifyff1",
    "sositeetixallow",
    "sositetbmallow",
    "sositetodallow",
    "sositeetixplustbmallow",
    "sositetbmmintime",
    "sositetodmintime",
    "sositetodmaxtime",
    "sositeetixmintime",
    "sositemodtypefilter",
    "sositeetixflightfilter",
    "sositeetixagrfilter",
    "sositeawardflow",
    "sositeetixmindate",
    "sositetbmmindate",
    "sositeexptbmmindate",
    "sositeexptbmfeeamount",
    "sositeexptbmfeecurr",
    "sositeminrebookfee",
    "sositemaxrebookfee",
    "sositeaveragerebookfee",
    "sositecurrencyrebookfee",
    "sositeapiv2SERVER",
    "sositeapiv2SERVERUSERID",
    "sositeapiv2SERVERPWD",
    "sositezambasurl",
    "sositedisablediscount",
    "sositefppojoactive",
    "sositefpsocalmax",
    "sositewebfaresplisttype",
    "sositewebfaresslisttype",
    "sogl",
    "sositeiatanumber",
    "sositessoption",
    "sositefaresoldoutflight",
    "sositeaddrdeliveryfmt",
    "sositemandatorydaddress",
    "sositemopdd",
    "sositemopddbookingtime",
    "sositefpagtnumber",
    "sositecountryofresidence",
    "sositespecialoffer",
    "sositeonlineindicator",
    "sositeetixqueueofficeid",
    "sositetbmqueueofficeid",
    "sositetodqueueofficeid",
    "sositeetixqueuecategory",
    "sositetbmqueuecategory",
    "sositetodqueuecategory",
    "sositeetixqueueid",
    "sositetbmqueueid",
    "sositetodqueueid",
    "sositeallowprofileless",
    "sositepaxdisplayrule",
    "sositesupplyfarecalc",
    "sositeusesiterbkfee",
    "sositerbkfeetype",
    "sositerbkfee",
    "sositerbkaddfee",
    "sositerbkfeecurrency",
    "sositerbkusededucedcff",
    "sositermdiscounttext",
    "sositermmarkuptext",
    "sositeservicefeewfamnt",
    "sositeservicefeewfccy",
    "sositeallowredembooking",
    "sositefpdispredemcost",
    "sositefpredemmode",
    "sositefardispredemcost",
    "sositefaringredemmode",
    "sositefarvalidredemcost",
    "sositefarvalidredemtype",
    "sositeredemfbindex",
    "sositeredemfbdigit",
    "sositeredemfbcoef",
    "sositepatheoserverurl",
    "sositepatheologin",
    "sositepatheopassword",
    "sositegdsused",
    "sositepassgds",
    "sositepassprovider",
    "sositepassprovidercfg",
    "sositepassxxtrace",
    "sositeitaprecheckuse",
    "sositefpsarfromextern",
    "sositeebmsapiserverurl",
    "sositeebmsapiserviceid",
    "sositedwmencenabled",
    "sositesendffbeforeprice",
    "sositeispsfenabled",
    "sositesexmlconfig",
    "sositetdenabled",
    "sositelnmergelogic",
    "sositeusecasa",
    "sositecarmndtrypictures",
    "sositecarmndtrymodel",
    "sositerailprovider",
    "sositenonrevenuewsurl",
    "sositeswapassburversion",
    "sositeallowctgoutoffsr",
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
    "embeddedtransaction",
    "any"
})
@XmlRootElement(name = "OverrideInput")
public class OverrideInput
    implements Serializable
{

    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "SO_SITE_MAX_CITY_SAME_DATE")
    protected BigInteger sositemaxcitysamedate;
    @XmlElement(name = "SO_SITE_MAX_NUM_DIFF_CITY")
    protected BigInteger sositemaxnumdiffcity;
    @XmlElement(name = "SO_SITE_MAX_NUM_DESTINATIONS")
    protected BigInteger sositemaxnumdestinations;
    @XmlElement(name = "SO_SITE_MULTI_DEST_ENABLED")
    protected Boolean sositemultidestenabled;
    @XmlElement(name = "SO_SITE_COMPLEX_ITINERARY")
    protected Boolean sositecomplexitinerary;
    @XmlElement(name = "SO_SITE_ALLOW_ONEWAY")
    protected Boolean sositeallowoneway;
    @XmlElement(name = "SO_SITE_ALLOW_RETURN")
    protected Boolean sositeallowreturn;
    @XmlElement(name = "SO_SITE_WEBFARES_PROVIDER")
    protected String sositewebfaresprovider;
    @XmlElement(name = "SO_SITE_ALLOW_FARE_DRIVEN")
    protected Boolean sositeallowfaredriven;
    @XmlElement(name = "SO_SITE_FARE_DRIVEN_CHOICE")
    protected String sositefaredrivenchoice;
    @XmlElement(name = "SO_SITE_TIMERANGE_MORNING")
    protected String sositetimerangemorning;
    @XmlElement(name = "SO_SITE_TIMERANGE_AFTERNOON")
    protected String sositetimerangeafternoon;
    @XmlElement(name = "SO_SITE_TIMERANGE_EVENING")
    protected String sositetimerangeevening;
    @XmlElement(name = "SO_SITE_TIMERANGE_EARLY_MORN")
    protected String sositetimerangeearlymorn;
    @XmlElement(name = "SO_SITE_TIMERANGE_LATE_MORN")
    protected String sositetimerangelatemorn;
    @XmlElement(name = "SO_MIN_AVAIL_DATE_SPAN")
    protected String sominavaildatespan;
    @XmlElement(name = "SO_MAX_AIR_DATE_SPAN")
    protected String somaxairdatespan;
    @XmlElement(name = "SO_LANG_SERVICE_FEE_CHARGE")
    protected String solangservicefeecharge;
    @XmlElement(name = "SO_SITE_PROMPT_FEE")
    protected String sositepromptfee;
    @XmlElement(name = "SO_LANG_SITE_AGENCY_LINE1")
    protected String solangsiteagencyline1;
    @XmlElement(name = "SO_LANG_SITE_AGENCY_LINE2")
    protected String solangsiteagencyline2;
    @XmlElement(name = "SO_LANG_SITE_AGENCY_LINE3")
    protected String solangsiteagencyline3;
    @XmlElement(name = "SO_LANG_SITE_AGENCY_LINE4")
    protected String solangsiteagencyline4;
    @XmlElement(name = "SO_LANG_SITE_AGENCY_LINE5")
    protected String solangsiteagencyline5;
    @XmlElement(name = "SO_LANG_SITE_AGENCY_LINE6")
    protected String solangsiteagencyline6;
    @XmlElement(name = "SO_LANG_SITE_EMAIL_ADDRESS")
    protected String solangsiteemailaddress;
    @XmlElement(name = "SO_SITE_ETICKET_DISCOUNT")
    protected String sositeeticketdiscount;
    @XmlElement(name = "SO_SITE_PARTIAL_MATCH_ZIP")
    protected String sositepartialmatchzip;
    @XmlElement(name = "SO_SITE_PARTIAL_MATCH_ADDR")
    protected String sositepartialmatchaddr;
    @XmlElement(name = "SO_SITE_OFFICE_ID")
    protected String sositeofficeid;
    @XmlElement(name = "SO_SITE_SEND_OFFI_ID_WITH_RF")
    protected String sositesendoffiidwithrf;
    @XmlElement(name = "SO_SITE_MOD_PICKUP_OFFICE")
    protected String sositemodpickupoffice;
    @XmlElement(name = "SO_QUEUE_OFFICE_ID")
    protected String soqueueofficeid;
    @XmlElement(name = "SO_QUEUE_NUMBER")
    protected String soqueuenumber;
    @XmlElement(name = "SO_QUEUE_CATEGORY")
    protected String soqueuecategory;
    @XmlElement(name = "SO_SITE_QUEUE_OFFICE_ID")
    protected String sositequeueofficeid;
    @XmlElement(name = "SO_SITE_QUEUE_CATEGORY")
    protected String sositequeuecategory;
    @XmlElement(name = "SO_SITE_SP_QUEUE_OFFICE_ID")
    protected String sositespqueueofficeid;
    @XmlElement(name = "SO_SITE_SP_QUEUE_CATEGORY")
    protected String sositespqueuecategory;
    @XmlElement(name = "SO_SITE_ETKT_Q_OFFICE_ID")
    protected String sositeetktqofficeid;
    @XmlElement(name = "SO_SITE_ETKT_Q_AND_CAT")
    protected String sositeetktqandcat;
    @XmlElement(name = "SO_FAILURE_QUEUE_OFFICE_ID")
    protected String sofailurequeueofficeid;
    @XmlElement(name = "SO_FAILURE_QUEUE_NUMBER")
    protected String sofailurequeuenumber;
    @XmlElement(name = "SO_FAILURE_QUEUE_CATEGORY")
    protected String sofailurequeuecategory;
    @XmlElement(name = "SO_SITE_SEND_MAIL")
    protected String sositesendmail;
    @XmlElement(name = "SO_SITE_MAIL_REPLY_TO")
    protected String sositemailreplyto;
    @XmlElement(name = "SO_SITE_PNR_ADD_EMAIL1")
    protected String sositepnraddemail1;
    @XmlElement(name = "SO_SITE_PNR_ADD_EMAIL2")
    protected String sositepnraddemail2;
    @XmlElement(name = "SO_SITE_BOOL_ABONNES_SITE")
    protected String sositeboolabonnessite;
    @XmlElement(name = "SO_SITE_MIN_AVAIL_DATE_SPAN")
    protected String sositeminavaildatespan;
    @XmlElement(name = "SO_SITE_MAX_AIR_DATE_SPAN")
    protected String sositemaxairdatespan;
    @XmlElement(name = "SO_SITE_MIN_PASSWORD_LENGTH")
    protected String sositeminpasswordlength;
    @XmlElement(name = "SO_SITE_MAX_PASSWORD_LENGTH")
    protected String sositemaxpasswordlength;
    @XmlElement(name = "SO_SITE_DOT_FIELD")
    protected String sositedotfield;
    @XmlElement(name = "SO_SITE_SPECIFIC_CARRIER")
    protected String sositespecificcarrier;
    @XmlElement(name = "SO_SITE_BOOL_ALTERNATE_AVAIL")
    protected String sositeboolalternateavail;
    @XmlElement(name = "SO_SITE_ALLOW_OVERRIDE_AIR")
    protected String sositeallowoverrideair;
    @XmlElement(name = "SO_SITE_NB_FLIGHTS_AVAIL")
    protected String sositenbflightsavail;
    @XmlElement(name = "SO_SITE_BOOKING_CLASS_CODE")
    protected String sositebookingclasscode;
    @XmlElement(name = "SO_SITE_DISPLAY_SHUTTLE")
    protected String sositedisplayshuttle;
    @XmlElement(name = "SO_SITE_DISPLAY_TR_FLIGHTS")
    protected String sositedisplaytrflights;
    @XmlElement(name = "SO_SITE_ARRANGE_BY_INCLUDE")
    protected String sositearrangebyinclude;
    @XmlElement(name = "SO_SITE_USE_PAXNUM_OPTION")
    protected String sositeusepaxnumoption;
    @XmlElement(name = "SO_SITE_REST_AIRLINES_LST")
    protected String sositerestairlineslst;
    @XmlElement(name = "SO_SITE_POINT_OF_SALE")
    protected String sositepointofsale;
    @XmlElement(name = "SO_SITE_POINT_OF_TICKETING")
    protected String sositepointofticketing;
    @XmlElement(name = "SO_SITE_ALLOW_FIRST")
    protected String sositeallowfirst;
    @XmlElement(name = "SO_SITE_ALLOW_BUS")
    protected String sositeallowbus;
    @XmlElement(name = "SO_SITE_ALLOW_ECO")
    protected String sositealloweco;
    @XmlElement(name = "SO_SITE_FARE_TYPE")
    protected String sositefaretype;
    @XmlElement(name = "SO_SITE_FD_UP_SELL_ALLOWED")
    protected String sositefdupsellallowed;
    @XmlElement(name = "SO_SITE_PRICE_ALT_CLASS")
    protected String sositepricealtclass;
    @XmlElement(name = "SO_SITE_DOWN_SELL_ALLOWED")
    protected String sositedownsellallowed;
    @XmlElement(name = "SO_SITE_MAX_FARECHOICE_COUNT")
    protected String sositemaxfarechoicecount;
    @XmlElement(name = "SO_SITE_INCLUDE_FARE_CHOICE")
    protected String sositeincludefarechoice;
    @XmlElement(name = "SO_SITE_PREFERRED_CARRIER")
    protected String sositepreferredcarrier;
    @XmlElement(name = "SO_SITE_LOW_COST_CARRIER")
    protected Boolean sositelowcostcarrier;
    @XmlElement(name = "SO_SITE_MINIMAL_TIME")
    protected String sositeminimaltime;
    @XmlElement(name = "SO_SITE_MAXIMAL_TIME")
    protected String sositemaximaltime;
    @XmlElement(name = "SO_SITE_OTHER_AIRLINES_REC")
    protected String sositeotherairlinesrec;
    @XmlElement(name = "SO_SITE_FR_TEXT")
    protected String sositefrtext;
    @XmlElement(name = "SO_SITE_AIR_MAND_IF_HOTEL")
    protected String sositeairmandifhotel;
    @XmlElement(name = "SO_SITE_HOTEL_MIN_AVL_DATE")
    protected String sositehotelminavldate;
    @XmlElement(name = "SO_SITE_HOTEL_MAX_AVL_DATE")
    protected String sositehotelmaxavldate;
    @XmlElement(name = "SO_SITE_RATE_CHANGE")
    protected String sositeratechange;
    @XmlElement(name = "SO_SITE_ACCESS_LEVEL")
    protected String sositeaccesslevel;
    @XmlElement(name = "SO_SITE_ALLOW_OVERRIDE_HOT")
    protected String sositeallowoverridehot;
    @XmlElement(name = "SO_SITE_STATUS")
    protected String sositestatus;
    @XmlElement(name = "SO_SITE_HOTEL_BALANCE")
    protected BigInteger sositehotelbalance;
    @XmlElement(name = "SO_SITE_USE_STD_RATE_AS_NEGO")
    protected Boolean sositeusestdrateasnego;
    @XmlElement(name = "SO_SITE_ALLOW_BURSTING")
    protected Boolean sositeallowbursting;
    @XmlElement(name = "SO_SITE_BURSTED_HOTEL_NBR")
    protected BigInteger sositeburstedhotelnbr;
    @XmlElement(name = "SO_SITE_REBURST_WHEN_RESORT")
    protected Boolean sositereburstwhenresort;
    @XmlElement(name = "SO_SITE_NEGO_BURST_POLICY")
    protected String sositenegoburstpolicy;
    @XmlElement(name = "SO_SITE_BURSTED_ROOM_NUMBER")
    protected BigInteger sositeburstedroomnumber;
    @XmlElement(name = "SO_SITE_BURSTED_ROOM_POLICY")
    protected String sositeburstedroompolicy;
    @XmlElement(name = "SO_SITE_BURSTED_NEGO_ROOM")
    protected BigInteger sositeburstednegoroom;
    @XmlElement(name = "SO_SITE_HOT_MULTIMEDIA")
    protected String sositehotmultimedia;
    @XmlElement(name = "SO_SITE_ALLOW_HOT_THUMBNAIL")
    protected Boolean sositeallowhotthumbnail;
    @XmlElement(name = "SO_SITE_ALLOW_HOT_MARK_TEXT")
    protected Boolean sositeallowhotmarktext;
    @XmlElement(name = "SO_SITE_PREFERRED_CHAIN")
    protected String sositepreferredchain;
    @XmlElement(name = "SO_SITE_CHAIN_EXCLUDE")
    protected String sositechainexclude;
    @XmlElement(name = "SO_SITE_RATE_FILTER")
    protected String sositeratefilter;
    @XmlElement(name = "SO_SITE_NEGOTIATED_RATE")
    protected String sositenegotiatedrate;
    @XmlElement(name = "SO_SITE_TRUE_RATE_RANGE")
    protected Boolean sositetrueraterange;
    @XmlElement(name = "SO_SITE_HTL_MOVE_DOWN_TUNER")
    protected BigInteger sositehtlmovedowntuner;
    @XmlElement(name = "SO_SITE_PRIMARY_CURRENCY")
    protected String sositeprimarycurrency;
    @XmlElement(name = "SO_SITE_FORCE_GUARANTEE")
    protected String sositeforceguarantee;
    @XmlElement(name = "SO_SITE_IATA_NB_AS_GUARANTEE")
    protected String sositeiatanbasguarantee;
    @XmlElement(name = "SO_SITE_MINIMAL_TIME_MODIF")
    protected String sositeminimaltimemodif;
    @XmlElement(name = "SO_SITE_UM_LSS_ORGANISATION")
    protected String sositeumlssorganisation;
    @XmlElement(name = "SO_SITE_AIR_MAND_IF_CAR")
    protected String sositeairmandifcar;
    @XmlElement(name = "SO_SITE_CAR_MINIMAL_TIME")
    protected String sositecarminimaltime;
    @XmlElement(name = "SO_SITE_CAR_MAXIMUM_TIME")
    protected String sositecarmaximumtime;
    @XmlElement(name = "SO_SITE_DISPLAY_STD_ACCESS")
    protected String sositedisplaystdaccess;
    @XmlElement(name = "SO_SITE_ALLOW_OVERRIDE_CAR")
    protected String sositeallowoverridecar;
    @XmlElement(name = "SO_SITE_MIN_TIME_BK_CAR")
    protected String sositemintimebkcar;
    @XmlElement(name = "SO_SITE_MAX_TIME_BK_CAR")
    protected String sositemaxtimebkcar;
    @XmlElement(name = "SO_SITE_PENDING_TIME_LIMIT")
    protected String sositependingtimelimit;
    @XmlElement(name = "SO_SITE_ET_OVERRIDES_MINTIME")
    protected String sositeetoverridesmintime;
    @XmlElement(name = "SO_SITE_FORCE_TICKET_BY_MAIL")
    protected String sositeforceticketbymail;
    @XmlElement(name = "SO_SITE_VALIDATING_AIRLINE")
    protected String sositevalidatingairline;
    @XmlElement(name = "SO_SITE_FP_CC_FORMAT")
    protected String sositefpccformat;
    @XmlElement(name = "SO_SITE_FP_MCO_CC_FORMAT")
    protected String sositefpmcoccformat;
    @XmlElement(name = "SO_SITE_FP_CC_FORMAT_VERIF")
    protected String sositefpccformatverif;
    @XmlElement(name = "SO_SITE_FP_APPROVAL_FORMAT")
    protected String sositefpapprovalformat;
    @XmlElement(name = "SO_SITE_PNR_FORMAT")
    protected String sositepnrformat;
    @XmlElement(name = "SO_SITE_IGNORE_IF_FARE_FAILS")
    protected String sositeignoreiffarefails;
    @XmlElement(name = "SO_SITE_IGNORE_IF_SELL_FAILS")
    protected String sositeignoreifsellfails;
    @XmlElement(name = "SO_SITE_IG_SEG_IF_SELL_FAILS")
    protected String sositeigsegifsellfails;
    @XmlElement(name = "SO_SITE_RECEIVED_FROM")
    protected String sositereceivedfrom;
    @XmlElement(name = "SO_SITE_ET_MAX_AIR_SEGMENTS")
    protected String sositeetmaxairsegments;
    @XmlElement(name = "SO_SITE_ET_ALLOW_INFANT")
    protected String sositeetallowinfant;
    @XmlElement(name = "SO_SITE_ET_AIRLINE_CODE")
    protected String sositeetairlinecode;
    @XmlElement(name = "SO_SITE_ET_CODE_SHARE")
    protected String sositeetcodeshare;
    @XmlElement(name = "SO_SITE_CC_MANDATORY_FOR_ET")
    protected String sositeccmandatoryforet;
    @XmlElement(name = "SO_BOOL_SEND_SRBSCT")
    protected String soboolsendsrbsct;
    @XmlElement(name = "SO_SITE_ALLOW_PNR_NICKNAME")
    protected String sositeallowpnrnickname;
    @XmlElement(name = "SO_SITE_ALLOW_TKT_PNR_MODIF")
    protected String sositeallowtktpnrmodif;
    @XmlElement(name = "SO_SITE_ALLOW_PNR_MODIF")
    protected String sositeallowpnrmodif;
    @XmlElement(name = "SO_SITE_ALLOW_PARTIAL_CANCEL")
    protected String sositeallowpartialcancel;
    @XmlElement(name = "SO_SITE_INCLUDE_CANCEL1")
    protected String sositeincludecancel1;
    @XmlElement(name = "SO_SITE_INCLUDE_CANCEL2")
    protected String sositeincludecancel2;
    @XmlElement(name = "SO_SITE_TKT_ACCOUNT")
    protected String sositetktaccount;
    @XmlElement(name = "SO_SITE_TKT_ETICKET")
    protected String sositetkteticket;
    @XmlElement(name = "SO_SITE_TKT_EXP_MAIL")
    protected String sositetktexpmail;
    @XmlElement(name = "SO_SITE_TKT_HAND_DELIV")
    protected String sositetkthanddeliv;
    @XmlElement(name = "SO_SITE_TKT_NONE")
    protected String sositetktnone;
    @XmlElement(name = "SO_SITE_TKT_PICK_UP")
    protected String sositetktpickup;
    @XmlElement(name = "SO_SITE_TKT_PICKUP_AIRL")
    protected String sositetktpickupairl;
    @XmlElement(name = "SO_SITE_TKT_PICKUP_ARPT")
    protected String sositetktpickuparpt;
    @XmlElement(name = "SO_SITE_EXP_OFFICE_ID")
    protected String sositeexpofficeid;
    @XmlElement(name = "SO_SITE_TICKETING_TIME_LIMIT")
    protected String sositeticketingtimelimit;
    @XmlElement(name = "SO_SITE_TK_ARRANGEMENT")
    protected String sositetkarrangement;
    @XmlElement(name = "SO_SITE_TK_OFFICE_ID")
    protected String sositetkofficeid;
    @XmlElement(name = "SO_SITE_TK_DATE_TRANSACTION")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sositetkdatetransaction;
    @XmlElement(name = "SO_SITE_TK_TIME_PERIOD")
    protected String sositetktimeperiod;
    @XmlElement(name = "SO_SITE_AVAIL_DIRECT_ACCESS")
    protected String sositeavaildirectaccess;
    @XmlElement(name = "SO_SITE_DIRECT_ACCESS_AIRLIN")
    protected String sositedirectaccessairlin;
    @XmlElement(name = "SO_SITE_HOTEL_AVAIL_STATUS")
    protected String sositehotelavailstatus;
    @XmlElement(name = "SO_SITE_DEPOSIT_EXCLUDE")
    protected String sositedepositexclude;
    @XmlElement(name = "SO_SITE_POI_IATA_TYPE_FILTER")
    protected String sositepoiiatatypefilter;
    @XmlElement(name = "SO_SITE_FC_INCLUDE_AIRLINES")
    protected String sositefcincludeairlines;
    @XmlElement(name = "SO_SITE_FC_EXCLUDE_AIRLINES")
    protected String sositefcexcludeairlines;
    @XmlElement(name = "SO_SITE_ALLOW_PNR_RECONF")
    protected String sositeallowpnrreconf;
    @XmlElement(name = "SO_SITE_ADDR_BILLING_FMT")
    protected String sositeaddrbillingfmt;
    @XmlElement(name = "SO_SITE_EXCLUDE_AIRLINES_LST")
    protected String sositeexcludeairlineslst;
    @XmlElement(name = "SO_SITE_ALLOW_PREF_CURRENCY")
    protected String sositeallowprefcurrency;
    @XmlElement(name = "SO_SITE_USER_CURRENCY_CODE")
    protected String sositeusercurrencycode;
    @XmlElement(name = "SO_SITE_FP_ALLOW_RETURN")
    protected Boolean sositefpallowreturn;
    @XmlElement(name = "SO_SITE_FP_ALLOW_ONEWAY")
    protected Boolean sositefpallowoneway;
    @XmlElement(name = "SO_SITE_FP_WITHHOLD_TAXES")
    protected Boolean sositefpwithholdtaxes;
    @XmlElement(name = "SO_SITE_FP_WITHHOLD_SURCHARG")
    protected Boolean sositefpwithholdsurcharg;
    @XmlElement(name = "SO_SITE_FP_BACKUP_TO_CAL")
    protected Boolean sositefpbackuptocal;
    @XmlElement(name = "SO_SITE_FP_CAL_BCKUP_C")
    protected Integer sositefpcalbckupc;
    @XmlElement(name = "SO_SITE_FP_OBFCA_FROM_AVAIL")
    protected Integer sositefpobfcafromavail;
    @XmlElement(name = "SO_SITE_SD_OBFCA_FROM_FAR")
    protected Integer sositesdobfcafromfar;
    @XmlElement(name = "SO_SITE_FP_CAL_BCKUP_I")
    protected Integer sositefpcalbckupi;
    @XmlElement(name = "SO_SITE_FP_PREF_CARRIER")
    protected String sositefpprefcarrier;
    @XmlElement(name = "SO_SITE_FP_DIRECT_NON_STOP")
    protected Boolean sositefpdirectnonstop;
    @XmlElement(name = "SO_SITE_ALLOW_SERVICE_FEE")
    protected String sositeallowservicefee;
    @XmlElement(name = "SO_SITE_SERVICE_FEE_MODE")
    protected String sositeservicefeemode;
    @XmlElement(name = "SO_SITE_USE_SITE_FEE")
    protected String sositeusesitefee;
    @XmlElement(name = "SO_SITE_ALLOW_MKP_DISCNT")
    protected String sositeallowmkpdiscnt;
    @XmlElement(name = "SO_SITE_APPLIC_DISC_ON_FARE")
    protected String sositeapplicdisconfare;
    @XmlElement(name = "SO_SITE_FEE_TYPE")
    protected String sositefeetype;
    @XmlElement(name = "SO_SITE_FEE_AMOUNT")
    protected String sositefeeamount;
    @XmlElement(name = "SO_SITE_FEE_PERCENTAGE")
    protected String sositefeepercentage;
    @XmlElement(name = "SO_SITE_FEE_CURRENCY")
    protected String sositefeecurrency;
    @XmlElement(name = "SO_SITE_FP_TRACES_ON")
    protected Boolean sositefptraceson;
    @XmlElement(name = "SO_SITE_VERIFY_FF1")
    protected String sositeverifyff1;
    @XmlElement(name = "SO_SITE_ETIX_ALLOW")
    protected Boolean sositeetixallow;
    @XmlElement(name = "SO_SITE_TBM_ALLOW")
    protected Boolean sositetbmallow;
    @XmlElement(name = "SO_SITE_TOD_ALLOW")
    protected Boolean sositetodallow;
    @XmlElement(name = "SO_SITE_ETIX_PLUS_TBM_ALLOW")
    protected Boolean sositeetixplustbmallow;
    @XmlElement(name = "SO_SITE_TBM_MIN_TIME")
    protected String sositetbmmintime;
    @XmlElement(name = "SO_SITE_TOD_MIN_TIME")
    protected String sositetodmintime;
    @XmlElement(name = "SO_SITE_TOD_MAX_TIME")
    protected String sositetodmaxtime;
    @XmlElement(name = "SO_SITE_ETIX_MIN_TIME")
    protected String sositeetixmintime;
    @XmlElement(name = "SO_SITE_MOD_TYPE_FILTER")
    protected String sositemodtypefilter;
    @XmlElement(name = "SO_SITE_ETIX_FLIGHT_FILTER")
    protected String sositeetixflightfilter;
    @XmlElement(name = "SO_SITE_ETIX_AGR_FILTER")
    protected String sositeetixagrfilter;
    @XmlElement(name = "SO_SITE_AWARD_FLOW")
    protected String sositeawardflow;
    @XmlElement(name = "SO_SITE_ETIX_MIN_DATE")
    protected String sositeetixmindate;
    @XmlElement(name = "SO_SITE_TBM_MIN_DATE")
    protected String sositetbmmindate;
    @XmlElement(name = "SO_SITE_EXP_TBM_MIN_DATE")
    protected String sositeexptbmmindate;
    @XmlElement(name = "SO_SITE_EXP_TBM_FEE_AMOUNT")
    protected String sositeexptbmfeeamount;
    @XmlElement(name = "SO_SITE_EXP_TBM_FEE_CURR")
    protected String sositeexptbmfeecurr;
    @XmlElement(name = "SO_SITE_MIN_REBOOK_FEE")
    protected String sositeminrebookfee;
    @XmlElement(name = "SO_SITE_MAX_REBOOK_FEE")
    protected String sositemaxrebookfee;
    @XmlElement(name = "SO_SITE_AVERAGE_REBOOK_FEE")
    protected String sositeaveragerebookfee;
    @XmlElement(name = "SO_SITE_CURRENCY_REBOOK_FEE")
    protected String sositecurrencyrebookfee;
    @XmlElement(name = "SO_SITE_APIV2_SERVER")
    protected String sositeapiv2SERVER;
    @XmlElement(name = "SO_SITE_APIV2_SERVER_USER_ID")
    protected String sositeapiv2SERVERUSERID;
    @XmlElement(name = "SO_SITE_APIV2_SERVER_PWD")
    protected String sositeapiv2SERVERPWD;
    @XmlElement(name = "SO_SITE_ZAMBAS_URL")
    protected String sositezambasurl;
    @XmlElement(name = "SO_SITE_DISABLE_DISCOUNT")
    protected String sositedisablediscount;
    @XmlElement(name = "SO_SITE_FP_POJO_ACTIVE")
    protected String sositefppojoactive;
    @XmlElement(name = "SO_SITE_FP_SO_CAL_MAX")
    protected String sositefpsocalmax;
    @XmlElement(name = "SO_SITE_WEBFARES_PLISTTYPE")
    protected String sositewebfaresplisttype;
    @XmlElement(name = "SO_SITE_WEBFARES_SLISTTYPE")
    protected String sositewebfaresslisttype;
    @XmlElement(name = "SO_GL")
    protected OverrideInput.SOGL sogl;
    @XmlElement(name = "SO_SITE_IATA_NUMBER")
    protected String sositeiatanumber;
    @XmlElement(name = "SO_SITE_SS_OPTION")
    protected String sositessoption;
    @XmlElement(name = "SO_SITE_FARE_SOLD_OUT_FLIGHT")
    protected String sositefaresoldoutflight;
    @XmlElement(name = "SO_SITE_ADDR_DELIVERY_FMT")
    protected String sositeaddrdeliveryfmt;
    @XmlElement(name = "SO_SITE_MANDATORY_D_ADDRESS")
    protected String sositemandatorydaddress;
    @XmlElement(name = "SO_SITE_MOP_DD")
    protected Boolean sositemopdd;
    @XmlElement(name = "SO_SITE_MOP_DD_BOOKING_TIME")
    protected Boolean sositemopddbookingtime;
    @XmlElement(name = "SO_SITE_FP_AGT_NUMBER")
    protected String sositefpagtnumber;
    @XmlElement(name = "SO_SITE_COUNTRY_OF_RESIDENCE")
    protected String sositecountryofresidence;
    @XmlElement(name = "SO_SITE_SPECIAL_OFFER")
    protected Boolean sositespecialoffer;
    @XmlElement(name = "SO_SITE_ONLINE_INDICATOR")
    protected Boolean sositeonlineindicator;
    @XmlElement(name = "SO_SITE_ETIX_QUEUE_OFFICE_ID")
    protected String sositeetixqueueofficeid;
    @XmlElement(name = "SO_SITE_TBM_QUEUE_OFFICE_ID")
    protected String sositetbmqueueofficeid;
    @XmlElement(name = "SO_SITE_TOD_QUEUE_OFFICE_ID")
    protected String sositetodqueueofficeid;
    @XmlElement(name = "SO_SITE_ETIX_QUEUE_CATEGORY")
    protected String sositeetixqueuecategory;
    @XmlElement(name = "SO_SITE_TBM_QUEUE_CATEGORY")
    protected String sositetbmqueuecategory;
    @XmlElement(name = "SO_SITE_TOD_QUEUE_CATEGORY")
    protected String sositetodqueuecategory;
    @XmlElement(name = "SO_SITE_ETIX_QUEUE_ID")
    protected String sositeetixqueueid;
    @XmlElement(name = "SO_SITE_TBM_QUEUE_ID")
    protected String sositetbmqueueid;
    @XmlElement(name = "SO_SITE_TOD_QUEUE_ID")
    protected String sositetodqueueid;
    @XmlElement(name = "SO_SITE_ALLOW_PROFILELESS")
    protected Object sositeallowprofileless;
    @XmlElement(name = "SO_SITE_PAX_DISPLAY_RULE")
    protected Object sositepaxdisplayrule;
    @XmlElement(name = "SO_SITE_SUPPLY_FARE_CALC")
    protected String sositesupplyfarecalc;
    @XmlElement(name = "SO_SITE_USE_SITE_RBK_FEE")
    protected String sositeusesiterbkfee;
    @XmlElement(name = "SO_SITE_RBK_FEE_TYPE")
    protected BigInteger sositerbkfeetype;
    @XmlElement(name = "SO_SITE_RBK_FEE")
    protected Float sositerbkfee;
    @XmlElement(name = "SO_SITE_RBK_ADD_FEE")
    protected Float sositerbkaddfee;
    @XmlElement(name = "SO_SITE_RBK_FEE_CURRENCY")
    protected String sositerbkfeecurrency;
    @XmlElement(name = "SO_SITE_RBK_USE_DEDUCED_CFF")
    protected String sositerbkusededucedcff;
    @XmlElement(name = "SO_SITE_RM_DISCOUNT_TEXT")
    protected String sositermdiscounttext;
    @XmlElement(name = "SO_SITE_RM_MARKUP_TEXT")
    protected String sositermmarkuptext;
    @XmlElement(name = "SO_SITE_SERVICE_FEE_WF_AMNT")
    protected String sositeservicefeewfamnt;
    @XmlElement(name = "SO_SITE_SERVICE_FEE_WF_CCY")
    protected String sositeservicefeewfccy;
    @XmlElement(name = "SO_SITE_ALLOW_REDEM_BOOKING")
    protected String sositeallowredembooking;
    @XmlElement(name = "SO_SITE_FP_DISP_REDEM_COST")
    protected String sositefpdispredemcost;
    @XmlElement(name = "SO_SITE_FP_REDEM_MODE")
    protected String sositefpredemmode;
    @XmlElement(name = "SO_SITE_FAR_DISP_REDEM_COST")
    protected String sositefardispredemcost;
    @XmlElement(name = "SO_SITE_FARING_REDEM_MODE")
    protected String sositefaringredemmode;
    @XmlElement(name = "SO_SITE_FAR_VALID_REDEM_COST")
    protected String sositefarvalidredemcost;
    @XmlElement(name = "SO_SITE_FAR_VALID_REDEM_TYPE")
    protected String sositefarvalidredemtype;
    @XmlElement(name = "SO_SITE_REDEM_FB_INDEX")
    protected String sositeredemfbindex;
    @XmlElement(name = "SO_SITE_REDEM_FB_DIGIT")
    protected String sositeredemfbdigit;
    @XmlElement(name = "SO_SITE_REDEM_FB_COEF")
    protected String sositeredemfbcoef;
    @XmlElement(name = "SO_SITE_PATHEO_SERVER_URL")
    protected String sositepatheoserverurl;
    @XmlElement(name = "SO_SITE_PATHEO_LOGIN")
    protected String sositepatheologin;
    @XmlElement(name = "SO_SITE_PATHEO_PASSWORD")
    protected String sositepatheopassword;
    @XmlElement(name = "SO_SITE_GDS_USED")
    protected String sositegdsused;
    @XmlElement(name = "SO_SITE_PASS_GDS")
    protected String sositepassgds;
    @XmlElement(name = "SO_SITE_PASS_PROVIDER")
    protected String sositepassprovider;
    @XmlElement(name = "SO_SITE_PASS_PROVIDER_CFG")
    protected String sositepassprovidercfg;
    @XmlElement(name = "SO_SITE_PASS_XX_TRACE")
    protected String sositepassxxtrace;
    @XmlElement(name = "SO_SITE_ITA_PRECHECK_USE")
    protected String sositeitaprecheckuse;
    @XmlElement(name = "SO_SITE_FP_SAR_FROM_EXTERN")
    protected String sositefpsarfromextern;
    @XmlElement(name = "SO_SITE_EBMS_API_SERVERURL")
    protected String sositeebmsapiserverurl;
    @XmlElement(name = "SO_SITE_EBMS_API_SERVICEID")
    protected String sositeebmsapiserviceid;
    @XmlElement(name = "SO_SITE_DWM_ENC_ENABLED")
    protected String sositedwmencenabled;
    @XmlElement(name = "SO_SITE_SEND_FF_BEFORE_PRICE")
    protected String sositesendffbeforeprice;
    @XmlElement(name = "SO_SITE_IS_PSF_ENABLED")
    protected Boolean sositeispsfenabled;
    @XmlElement(name = "SO_SITE_SE_XML_CONFIG")
    protected Boolean sositesexmlconfig;
    @XmlElement(name = "SO_SITE_TD_ENABLED")
    protected Boolean sositetdenabled;
    @XmlElement(name = "SO_SITE_LN_MERGE_LOGIC")
    protected String sositelnmergelogic;
    @XmlElement(name = "SO_SITE_USE_CASA")
    protected String sositeusecasa;
    @XmlElement(name = "SO_SITE_CAR_MNDTRY_PICTURES")
    protected Boolean sositecarmndtrypictures;
    @XmlElement(name = "SO_SITE_CAR_MNDTRY_MODEL")
    protected Boolean sositecarmndtrymodel;
    @XmlElement(name = "SO_SITE_RAIL_PROVIDER")
    protected String sositerailprovider;
    @XmlElement(name = "SO_SITE_NON_REVENUE_WS_URL")
    protected String sositenonrevenuewsurl;
    @XmlElement(name = "SO_SITE_SWA_PASSBUR_VERSION")
    protected String sositeswapassburversion;
    @XmlElement(name = "SO_SITE_ALLOW_CTG_OUT_OF_FSR")
    protected String sositeallowctgoutoffsr;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected OverrideInput.REQUESTINFO requestinfo;
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
    protected List<OverrideInput.APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
    @XmlElement(name = "EMBEDDED_TRANSACTION")
    protected OverrideInput.EMBEDDEDTRANSACTION embeddedtransaction;
    @XmlAnyElement
    protected List<Element> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the sositemaxcitysamedate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOSITEMAXCITYSAMEDATE() {
        return sositemaxcitysamedate;
    }

    /**
     * Sets the value of the sositemaxcitysamedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOSITEMAXCITYSAMEDATE(BigInteger value) {
        this.sositemaxcitysamedate = value;
    }

    /**
     * Gets the value of the sositemaxnumdiffcity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOSITEMAXNUMDIFFCITY() {
        return sositemaxnumdiffcity;
    }

    /**
     * Sets the value of the sositemaxnumdiffcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOSITEMAXNUMDIFFCITY(BigInteger value) {
        this.sositemaxnumdiffcity = value;
    }

    /**
     * Gets the value of the sositemaxnumdestinations property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOSITEMAXNUMDESTINATIONS() {
        return sositemaxnumdestinations;
    }

    /**
     * Sets the value of the sositemaxnumdestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOSITEMAXNUMDESTINATIONS(BigInteger value) {
        this.sositemaxnumdestinations = value;
    }

    /**
     * Gets the value of the sositemultidestenabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEMULTIDESTENABLED() {
        return sositemultidestenabled;
    }

    /**
     * Sets the value of the sositemultidestenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEMULTIDESTENABLED(Boolean value) {
        this.sositemultidestenabled = value;
    }

    /**
     * Gets the value of the sositecomplexitinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITECOMPLEXITINERARY() {
        return sositecomplexitinerary;
    }

    /**
     * Sets the value of the sositecomplexitinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITECOMPLEXITINERARY(Boolean value) {
        this.sositecomplexitinerary = value;
    }

    /**
     * Gets the value of the sositeallowoneway property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEALLOWONEWAY() {
        return sositeallowoneway;
    }

    /**
     * Sets the value of the sositeallowoneway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEALLOWONEWAY(Boolean value) {
        this.sositeallowoneway = value;
    }

    /**
     * Gets the value of the sositeallowreturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEALLOWRETURN() {
        return sositeallowreturn;
    }

    /**
     * Sets the value of the sositeallowreturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEALLOWRETURN(Boolean value) {
        this.sositeallowreturn = value;
    }

    /**
     * Gets the value of the sositewebfaresprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEWEBFARESPROVIDER() {
        return sositewebfaresprovider;
    }

    /**
     * Sets the value of the sositewebfaresprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEWEBFARESPROVIDER(String value) {
        this.sositewebfaresprovider = value;
    }

    /**
     * Gets the value of the sositeallowfaredriven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEALLOWFAREDRIVEN() {
        return sositeallowfaredriven;
    }

    /**
     * Sets the value of the sositeallowfaredriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEALLOWFAREDRIVEN(Boolean value) {
        this.sositeallowfaredriven = value;
    }

    /**
     * Gets the value of the sositefaredrivenchoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFAREDRIVENCHOICE() {
        return sositefaredrivenchoice;
    }

    /**
     * Sets the value of the sositefaredrivenchoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFAREDRIVENCHOICE(String value) {
        this.sositefaredrivenchoice = value;
    }

    /**
     * Gets the value of the sositetimerangemorning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETIMERANGEMORNING() {
        return sositetimerangemorning;
    }

    /**
     * Sets the value of the sositetimerangemorning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETIMERANGEMORNING(String value) {
        this.sositetimerangemorning = value;
    }

    /**
     * Gets the value of the sositetimerangeafternoon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETIMERANGEAFTERNOON() {
        return sositetimerangeafternoon;
    }

    /**
     * Sets the value of the sositetimerangeafternoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETIMERANGEAFTERNOON(String value) {
        this.sositetimerangeafternoon = value;
    }

    /**
     * Gets the value of the sositetimerangeevening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETIMERANGEEVENING() {
        return sositetimerangeevening;
    }

    /**
     * Sets the value of the sositetimerangeevening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETIMERANGEEVENING(String value) {
        this.sositetimerangeevening = value;
    }

    /**
     * Gets the value of the sositetimerangeearlymorn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETIMERANGEEARLYMORN() {
        return sositetimerangeearlymorn;
    }

    /**
     * Sets the value of the sositetimerangeearlymorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETIMERANGEEARLYMORN(String value) {
        this.sositetimerangeearlymorn = value;
    }

    /**
     * Gets the value of the sositetimerangelatemorn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETIMERANGELATEMORN() {
        return sositetimerangelatemorn;
    }

    /**
     * Sets the value of the sositetimerangelatemorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETIMERANGELATEMORN(String value) {
        this.sositetimerangelatemorn = value;
    }

    /**
     * Gets the value of the sominavaildatespan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOMINAVAILDATESPAN() {
        return sominavaildatespan;
    }

    /**
     * Sets the value of the sominavaildatespan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOMINAVAILDATESPAN(String value) {
        this.sominavaildatespan = value;
    }

    /**
     * Gets the value of the somaxairdatespan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOMAXAIRDATESPAN() {
        return somaxairdatespan;
    }

    /**
     * Sets the value of the somaxairdatespan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOMAXAIRDATESPAN(String value) {
        this.somaxairdatespan = value;
    }

    /**
     * Gets the value of the solangservicefeecharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLANGSERVICEFEECHARGE() {
        return solangservicefeecharge;
    }

    /**
     * Sets the value of the solangservicefeecharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLANGSERVICEFEECHARGE(String value) {
        this.solangservicefeecharge = value;
    }

    /**
     * Gets the value of the sositepromptfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPROMPTFEE() {
        return sositepromptfee;
    }

    /**
     * Sets the value of the sositepromptfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPROMPTFEE(String value) {
        this.sositepromptfee = value;
    }

    /**
     * Gets the value of the solangsiteagencyline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLANGSITEAGENCYLINE1() {
        return solangsiteagencyline1;
    }

    /**
     * Sets the value of the solangsiteagencyline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLANGSITEAGENCYLINE1(String value) {
        this.solangsiteagencyline1 = value;
    }

    /**
     * Gets the value of the solangsiteagencyline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLANGSITEAGENCYLINE2() {
        return solangsiteagencyline2;
    }

    /**
     * Sets the value of the solangsiteagencyline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLANGSITEAGENCYLINE2(String value) {
        this.solangsiteagencyline2 = value;
    }

    /**
     * Gets the value of the solangsiteagencyline3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLANGSITEAGENCYLINE3() {
        return solangsiteagencyline3;
    }

    /**
     * Sets the value of the solangsiteagencyline3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLANGSITEAGENCYLINE3(String value) {
        this.solangsiteagencyline3 = value;
    }

    /**
     * Gets the value of the solangsiteagencyline4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLANGSITEAGENCYLINE4() {
        return solangsiteagencyline4;
    }

    /**
     * Sets the value of the solangsiteagencyline4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLANGSITEAGENCYLINE4(String value) {
        this.solangsiteagencyline4 = value;
    }

    /**
     * Gets the value of the solangsiteagencyline5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLANGSITEAGENCYLINE5() {
        return solangsiteagencyline5;
    }

    /**
     * Sets the value of the solangsiteagencyline5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLANGSITEAGENCYLINE5(String value) {
        this.solangsiteagencyline5 = value;
    }

    /**
     * Gets the value of the solangsiteagencyline6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLANGSITEAGENCYLINE6() {
        return solangsiteagencyline6;
    }

    /**
     * Sets the value of the solangsiteagencyline6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLANGSITEAGENCYLINE6(String value) {
        this.solangsiteagencyline6 = value;
    }

    /**
     * Gets the value of the solangsiteemailaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLANGSITEEMAILADDRESS() {
        return solangsiteemailaddress;
    }

    /**
     * Sets the value of the solangsiteemailaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLANGSITEEMAILADDRESS(String value) {
        this.solangsiteemailaddress = value;
    }

    /**
     * Gets the value of the sositeeticketdiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETICKETDISCOUNT() {
        return sositeeticketdiscount;
    }

    /**
     * Sets the value of the sositeeticketdiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETICKETDISCOUNT(String value) {
        this.sositeeticketdiscount = value;
    }

    /**
     * Gets the value of the sositepartialmatchzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPARTIALMATCHZIP() {
        return sositepartialmatchzip;
    }

    /**
     * Sets the value of the sositepartialmatchzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPARTIALMATCHZIP(String value) {
        this.sositepartialmatchzip = value;
    }

    /**
     * Gets the value of the sositepartialmatchaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPARTIALMATCHADDR() {
        return sositepartialmatchaddr;
    }

    /**
     * Sets the value of the sositepartialmatchaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPARTIALMATCHADDR(String value) {
        this.sositepartialmatchaddr = value;
    }

    /**
     * Gets the value of the sositeofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEOFFICEID() {
        return sositeofficeid;
    }

    /**
     * Sets the value of the sositeofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEOFFICEID(String value) {
        this.sositeofficeid = value;
    }

    /**
     * Gets the value of the sositesendoffiidwithrf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESENDOFFIIDWITHRF() {
        return sositesendoffiidwithrf;
    }

    /**
     * Sets the value of the sositesendoffiidwithrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESENDOFFIIDWITHRF(String value) {
        this.sositesendoffiidwithrf = value;
    }

    /**
     * Gets the value of the sositemodpickupoffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMODPICKUPOFFICE() {
        return sositemodpickupoffice;
    }

    /**
     * Sets the value of the sositemodpickupoffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMODPICKUPOFFICE(String value) {
        this.sositemodpickupoffice = value;
    }

    /**
     * Gets the value of the soqueueofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOQUEUEOFFICEID() {
        return soqueueofficeid;
    }

    /**
     * Sets the value of the soqueueofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOQUEUEOFFICEID(String value) {
        this.soqueueofficeid = value;
    }

    /**
     * Gets the value of the soqueuenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOQUEUENUMBER() {
        return soqueuenumber;
    }

    /**
     * Sets the value of the soqueuenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOQUEUENUMBER(String value) {
        this.soqueuenumber = value;
    }

    /**
     * Gets the value of the soqueuecategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOQUEUECATEGORY() {
        return soqueuecategory;
    }

    /**
     * Sets the value of the soqueuecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOQUEUECATEGORY(String value) {
        this.soqueuecategory = value;
    }

    /**
     * Gets the value of the sositequeueofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEQUEUEOFFICEID() {
        return sositequeueofficeid;
    }

    /**
     * Sets the value of the sositequeueofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEQUEUEOFFICEID(String value) {
        this.sositequeueofficeid = value;
    }

    /**
     * Gets the value of the sositequeuecategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEQUEUECATEGORY() {
        return sositequeuecategory;
    }

    /**
     * Sets the value of the sositequeuecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEQUEUECATEGORY(String value) {
        this.sositequeuecategory = value;
    }

    /**
     * Gets the value of the sositespqueueofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESPQUEUEOFFICEID() {
        return sositespqueueofficeid;
    }

    /**
     * Sets the value of the sositespqueueofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESPQUEUEOFFICEID(String value) {
        this.sositespqueueofficeid = value;
    }

    /**
     * Gets the value of the sositespqueuecategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESPQUEUECATEGORY() {
        return sositespqueuecategory;
    }

    /**
     * Sets the value of the sositespqueuecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESPQUEUECATEGORY(String value) {
        this.sositespqueuecategory = value;
    }

    /**
     * Gets the value of the sositeetktqofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETKTQOFFICEID() {
        return sositeetktqofficeid;
    }

    /**
     * Sets the value of the sositeetktqofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETKTQOFFICEID(String value) {
        this.sositeetktqofficeid = value;
    }

    /**
     * Gets the value of the sositeetktqandcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETKTQANDCAT() {
        return sositeetktqandcat;
    }

    /**
     * Sets the value of the sositeetktqandcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETKTQANDCAT(String value) {
        this.sositeetktqandcat = value;
    }

    /**
     * Gets the value of the sofailurequeueofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOFAILUREQUEUEOFFICEID() {
        return sofailurequeueofficeid;
    }

    /**
     * Sets the value of the sofailurequeueofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOFAILUREQUEUEOFFICEID(String value) {
        this.sofailurequeueofficeid = value;
    }

    /**
     * Gets the value of the sofailurequeuenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOFAILUREQUEUENUMBER() {
        return sofailurequeuenumber;
    }

    /**
     * Sets the value of the sofailurequeuenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOFAILUREQUEUENUMBER(String value) {
        this.sofailurequeuenumber = value;
    }

    /**
     * Gets the value of the sofailurequeuecategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOFAILUREQUEUECATEGORY() {
        return sofailurequeuecategory;
    }

    /**
     * Sets the value of the sofailurequeuecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOFAILUREQUEUECATEGORY(String value) {
        this.sofailurequeuecategory = value;
    }

    /**
     * Gets the value of the sositesendmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESENDMAIL() {
        return sositesendmail;
    }

    /**
     * Sets the value of the sositesendmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESENDMAIL(String value) {
        this.sositesendmail = value;
    }

    /**
     * Gets the value of the sositemailreplyto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMAILREPLYTO() {
        return sositemailreplyto;
    }

    /**
     * Sets the value of the sositemailreplyto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMAILREPLYTO(String value) {
        this.sositemailreplyto = value;
    }

    /**
     * Gets the value of the sositepnraddemail1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPNRADDEMAIL1() {
        return sositepnraddemail1;
    }

    /**
     * Sets the value of the sositepnraddemail1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPNRADDEMAIL1(String value) {
        this.sositepnraddemail1 = value;
    }

    /**
     * Gets the value of the sositepnraddemail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPNRADDEMAIL2() {
        return sositepnraddemail2;
    }

    /**
     * Sets the value of the sositepnraddemail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPNRADDEMAIL2(String value) {
        this.sositepnraddemail2 = value;
    }

    /**
     * Gets the value of the sositeboolabonnessite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEBOOLABONNESSITE() {
        return sositeboolabonnessite;
    }

    /**
     * Sets the value of the sositeboolabonnessite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEBOOLABONNESSITE(String value) {
        this.sositeboolabonnessite = value;
    }

    /**
     * Gets the value of the sositeminavaildatespan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMINAVAILDATESPAN() {
        return sositeminavaildatespan;
    }

    /**
     * Sets the value of the sositeminavaildatespan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMINAVAILDATESPAN(String value) {
        this.sositeminavaildatespan = value;
    }

    /**
     * Gets the value of the sositemaxairdatespan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMAXAIRDATESPAN() {
        return sositemaxairdatespan;
    }

    /**
     * Sets the value of the sositemaxairdatespan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMAXAIRDATESPAN(String value) {
        this.sositemaxairdatespan = value;
    }

    /**
     * Gets the value of the sositeminpasswordlength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMINPASSWORDLENGTH() {
        return sositeminpasswordlength;
    }

    /**
     * Sets the value of the sositeminpasswordlength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMINPASSWORDLENGTH(String value) {
        this.sositeminpasswordlength = value;
    }

    /**
     * Gets the value of the sositemaxpasswordlength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMAXPASSWORDLENGTH() {
        return sositemaxpasswordlength;
    }

    /**
     * Sets the value of the sositemaxpasswordlength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMAXPASSWORDLENGTH(String value) {
        this.sositemaxpasswordlength = value;
    }

    /**
     * Gets the value of the sositedotfield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEDOTFIELD() {
        return sositedotfield;
    }

    /**
     * Sets the value of the sositedotfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEDOTFIELD(String value) {
        this.sositedotfield = value;
    }

    /**
     * Gets the value of the sositespecificcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESPECIFICCARRIER() {
        return sositespecificcarrier;
    }

    /**
     * Sets the value of the sositespecificcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESPECIFICCARRIER(String value) {
        this.sositespecificcarrier = value;
    }

    /**
     * Gets the value of the sositeboolalternateavail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEBOOLALTERNATEAVAIL() {
        return sositeboolalternateavail;
    }

    /**
     * Sets the value of the sositeboolalternateavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEBOOLALTERNATEAVAIL(String value) {
        this.sositeboolalternateavail = value;
    }

    /**
     * Gets the value of the sositeallowoverrideair property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWOVERRIDEAIR() {
        return sositeallowoverrideair;
    }

    /**
     * Sets the value of the sositeallowoverrideair property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWOVERRIDEAIR(String value) {
        this.sositeallowoverrideair = value;
    }

    /**
     * Gets the value of the sositenbflightsavail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITENBFLIGHTSAVAIL() {
        return sositenbflightsavail;
    }

    /**
     * Sets the value of the sositenbflightsavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITENBFLIGHTSAVAIL(String value) {
        this.sositenbflightsavail = value;
    }

    /**
     * Gets the value of the sositebookingclasscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEBOOKINGCLASSCODE() {
        return sositebookingclasscode;
    }

    /**
     * Sets the value of the sositebookingclasscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEBOOKINGCLASSCODE(String value) {
        this.sositebookingclasscode = value;
    }

    /**
     * Gets the value of the sositedisplayshuttle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEDISPLAYSHUTTLE() {
        return sositedisplayshuttle;
    }

    /**
     * Sets the value of the sositedisplayshuttle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEDISPLAYSHUTTLE(String value) {
        this.sositedisplayshuttle = value;
    }

    /**
     * Gets the value of the sositedisplaytrflights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEDISPLAYTRFLIGHTS() {
        return sositedisplaytrflights;
    }

    /**
     * Sets the value of the sositedisplaytrflights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEDISPLAYTRFLIGHTS(String value) {
        this.sositedisplaytrflights = value;
    }

    /**
     * Gets the value of the sositearrangebyinclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEARRANGEBYINCLUDE() {
        return sositearrangebyinclude;
    }

    /**
     * Sets the value of the sositearrangebyinclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEARRANGEBYINCLUDE(String value) {
        this.sositearrangebyinclude = value;
    }

    /**
     * Gets the value of the sositeusepaxnumoption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEUSEPAXNUMOPTION() {
        return sositeusepaxnumoption;
    }

    /**
     * Sets the value of the sositeusepaxnumoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEUSEPAXNUMOPTION(String value) {
        this.sositeusepaxnumoption = value;
    }

    /**
     * Gets the value of the sositerestairlineslst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITERESTAIRLINESLST() {
        return sositerestairlineslst;
    }

    /**
     * Sets the value of the sositerestairlineslst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITERESTAIRLINESLST(String value) {
        this.sositerestairlineslst = value;
    }

    /**
     * Gets the value of the sositepointofsale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPOINTOFSALE() {
        return sositepointofsale;
    }

    /**
     * Sets the value of the sositepointofsale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPOINTOFSALE(String value) {
        this.sositepointofsale = value;
    }

    /**
     * Gets the value of the sositepointofticketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPOINTOFTICKETING() {
        return sositepointofticketing;
    }

    /**
     * Sets the value of the sositepointofticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPOINTOFTICKETING(String value) {
        this.sositepointofticketing = value;
    }

    /**
     * Gets the value of the sositeallowfirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWFIRST() {
        return sositeallowfirst;
    }

    /**
     * Sets the value of the sositeallowfirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWFIRST(String value) {
        this.sositeallowfirst = value;
    }

    /**
     * Gets the value of the sositeallowbus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWBUS() {
        return sositeallowbus;
    }

    /**
     * Sets the value of the sositeallowbus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWBUS(String value) {
        this.sositeallowbus = value;
    }

    /**
     * Gets the value of the sositealloweco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWECO() {
        return sositealloweco;
    }

    /**
     * Sets the value of the sositealloweco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWECO(String value) {
        this.sositealloweco = value;
    }

    /**
     * Gets the value of the sositefaretype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFARETYPE() {
        return sositefaretype;
    }

    /**
     * Sets the value of the sositefaretype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFARETYPE(String value) {
        this.sositefaretype = value;
    }

    /**
     * Gets the value of the sositefdupsellallowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFDUPSELLALLOWED() {
        return sositefdupsellallowed;
    }

    /**
     * Sets the value of the sositefdupsellallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFDUPSELLALLOWED(String value) {
        this.sositefdupsellallowed = value;
    }

    /**
     * Gets the value of the sositepricealtclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPRICEALTCLASS() {
        return sositepricealtclass;
    }

    /**
     * Sets the value of the sositepricealtclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPRICEALTCLASS(String value) {
        this.sositepricealtclass = value;
    }

    /**
     * Gets the value of the sositedownsellallowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEDOWNSELLALLOWED() {
        return sositedownsellallowed;
    }

    /**
     * Sets the value of the sositedownsellallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEDOWNSELLALLOWED(String value) {
        this.sositedownsellallowed = value;
    }

    /**
     * Gets the value of the sositemaxfarechoicecount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMAXFARECHOICECOUNT() {
        return sositemaxfarechoicecount;
    }

    /**
     * Sets the value of the sositemaxfarechoicecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMAXFARECHOICECOUNT(String value) {
        this.sositemaxfarechoicecount = value;
    }

    /**
     * Gets the value of the sositeincludefarechoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEINCLUDEFARECHOICE() {
        return sositeincludefarechoice;
    }

    /**
     * Sets the value of the sositeincludefarechoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEINCLUDEFARECHOICE(String value) {
        this.sositeincludefarechoice = value;
    }

    /**
     * Gets the value of the sositepreferredcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPREFERREDCARRIER() {
        return sositepreferredcarrier;
    }

    /**
     * Sets the value of the sositepreferredcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPREFERREDCARRIER(String value) {
        this.sositepreferredcarrier = value;
    }

    /**
     * Gets the value of the sositelowcostcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITELOWCOSTCARRIER() {
        return sositelowcostcarrier;
    }

    /**
     * Sets the value of the sositelowcostcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITELOWCOSTCARRIER(Boolean value) {
        this.sositelowcostcarrier = value;
    }

    /**
     * Gets the value of the sositeminimaltime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMINIMALTIME() {
        return sositeminimaltime;
    }

    /**
     * Sets the value of the sositeminimaltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMINIMALTIME(String value) {
        this.sositeminimaltime = value;
    }

    /**
     * Gets the value of the sositemaximaltime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMAXIMALTIME() {
        return sositemaximaltime;
    }

    /**
     * Sets the value of the sositemaximaltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMAXIMALTIME(String value) {
        this.sositemaximaltime = value;
    }

    /**
     * Gets the value of the sositeotherairlinesrec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEOTHERAIRLINESREC() {
        return sositeotherairlinesrec;
    }

    /**
     * Sets the value of the sositeotherairlinesrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEOTHERAIRLINESREC(String value) {
        this.sositeotherairlinesrec = value;
    }

    /**
     * Gets the value of the sositefrtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFRTEXT() {
        return sositefrtext;
    }

    /**
     * Sets the value of the sositefrtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFRTEXT(String value) {
        this.sositefrtext = value;
    }

    /**
     * Gets the value of the sositeairmandifhotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEAIRMANDIFHOTEL() {
        return sositeairmandifhotel;
    }

    /**
     * Sets the value of the sositeairmandifhotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEAIRMANDIFHOTEL(String value) {
        this.sositeairmandifhotel = value;
    }

    /**
     * Gets the value of the sositehotelminavldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEHOTELMINAVLDATE() {
        return sositehotelminavldate;
    }

    /**
     * Sets the value of the sositehotelminavldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEHOTELMINAVLDATE(String value) {
        this.sositehotelminavldate = value;
    }

    /**
     * Gets the value of the sositehotelmaxavldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEHOTELMAXAVLDATE() {
        return sositehotelmaxavldate;
    }

    /**
     * Sets the value of the sositehotelmaxavldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEHOTELMAXAVLDATE(String value) {
        this.sositehotelmaxavldate = value;
    }

    /**
     * Gets the value of the sositeratechange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITERATECHANGE() {
        return sositeratechange;
    }

    /**
     * Sets the value of the sositeratechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITERATECHANGE(String value) {
        this.sositeratechange = value;
    }

    /**
     * Gets the value of the sositeaccesslevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEACCESSLEVEL() {
        return sositeaccesslevel;
    }

    /**
     * Sets the value of the sositeaccesslevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEACCESSLEVEL(String value) {
        this.sositeaccesslevel = value;
    }

    /**
     * Gets the value of the sositeallowoverridehot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWOVERRIDEHOT() {
        return sositeallowoverridehot;
    }

    /**
     * Sets the value of the sositeallowoverridehot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWOVERRIDEHOT(String value) {
        this.sositeallowoverridehot = value;
    }

    /**
     * Gets the value of the sositestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESTATUS() {
        return sositestatus;
    }

    /**
     * Sets the value of the sositestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESTATUS(String value) {
        this.sositestatus = value;
    }

    /**
     * Gets the value of the sositehotelbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOSITEHOTELBALANCE() {
        return sositehotelbalance;
    }

    /**
     * Sets the value of the sositehotelbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOSITEHOTELBALANCE(BigInteger value) {
        this.sositehotelbalance = value;
    }

    /**
     * Gets the value of the sositeusestdrateasnego property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEUSESTDRATEASNEGO() {
        return sositeusestdrateasnego;
    }

    /**
     * Sets the value of the sositeusestdrateasnego property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEUSESTDRATEASNEGO(Boolean value) {
        this.sositeusestdrateasnego = value;
    }

    /**
     * Gets the value of the sositeallowbursting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEALLOWBURSTING() {
        return sositeallowbursting;
    }

    /**
     * Sets the value of the sositeallowbursting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEALLOWBURSTING(Boolean value) {
        this.sositeallowbursting = value;
    }

    /**
     * Gets the value of the sositeburstedhotelnbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOSITEBURSTEDHOTELNBR() {
        return sositeburstedhotelnbr;
    }

    /**
     * Sets the value of the sositeburstedhotelnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOSITEBURSTEDHOTELNBR(BigInteger value) {
        this.sositeburstedhotelnbr = value;
    }

    /**
     * Gets the value of the sositereburstwhenresort property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEREBURSTWHENRESORT() {
        return sositereburstwhenresort;
    }

    /**
     * Sets the value of the sositereburstwhenresort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEREBURSTWHENRESORT(Boolean value) {
        this.sositereburstwhenresort = value;
    }

    /**
     * Gets the value of the sositenegoburstpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITENEGOBURSTPOLICY() {
        return sositenegoburstpolicy;
    }

    /**
     * Sets the value of the sositenegoburstpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITENEGOBURSTPOLICY(String value) {
        this.sositenegoburstpolicy = value;
    }

    /**
     * Gets the value of the sositeburstedroomnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOSITEBURSTEDROOMNUMBER() {
        return sositeburstedroomnumber;
    }

    /**
     * Sets the value of the sositeburstedroomnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOSITEBURSTEDROOMNUMBER(BigInteger value) {
        this.sositeburstedroomnumber = value;
    }

    /**
     * Gets the value of the sositeburstedroompolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEBURSTEDROOMPOLICY() {
        return sositeburstedroompolicy;
    }

    /**
     * Sets the value of the sositeburstedroompolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEBURSTEDROOMPOLICY(String value) {
        this.sositeburstedroompolicy = value;
    }

    /**
     * Gets the value of the sositeburstednegoroom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOSITEBURSTEDNEGOROOM() {
        return sositeburstednegoroom;
    }

    /**
     * Sets the value of the sositeburstednegoroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOSITEBURSTEDNEGOROOM(BigInteger value) {
        this.sositeburstednegoroom = value;
    }

    /**
     * Gets the value of the sositehotmultimedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEHOTMULTIMEDIA() {
        return sositehotmultimedia;
    }

    /**
     * Sets the value of the sositehotmultimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEHOTMULTIMEDIA(String value) {
        this.sositehotmultimedia = value;
    }

    /**
     * Gets the value of the sositeallowhotthumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEALLOWHOTTHUMBNAIL() {
        return sositeallowhotthumbnail;
    }

    /**
     * Sets the value of the sositeallowhotthumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEALLOWHOTTHUMBNAIL(Boolean value) {
        this.sositeallowhotthumbnail = value;
    }

    /**
     * Gets the value of the sositeallowhotmarktext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEALLOWHOTMARKTEXT() {
        return sositeallowhotmarktext;
    }

    /**
     * Sets the value of the sositeallowhotmarktext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEALLOWHOTMARKTEXT(Boolean value) {
        this.sositeallowhotmarktext = value;
    }

    /**
     * Gets the value of the sositepreferredchain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPREFERREDCHAIN() {
        return sositepreferredchain;
    }

    /**
     * Sets the value of the sositepreferredchain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPREFERREDCHAIN(String value) {
        this.sositepreferredchain = value;
    }

    /**
     * Gets the value of the sositechainexclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITECHAINEXCLUDE() {
        return sositechainexclude;
    }

    /**
     * Sets the value of the sositechainexclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITECHAINEXCLUDE(String value) {
        this.sositechainexclude = value;
    }

    /**
     * Gets the value of the sositeratefilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITERATEFILTER() {
        return sositeratefilter;
    }

    /**
     * Sets the value of the sositeratefilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITERATEFILTER(String value) {
        this.sositeratefilter = value;
    }

    /**
     * Gets the value of the sositenegotiatedrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITENEGOTIATEDRATE() {
        return sositenegotiatedrate;
    }

    /**
     * Sets the value of the sositenegotiatedrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITENEGOTIATEDRATE(String value) {
        this.sositenegotiatedrate = value;
    }

    /**
     * Gets the value of the sositetrueraterange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITETRUERATERANGE() {
        return sositetrueraterange;
    }

    /**
     * Sets the value of the sositetrueraterange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITETRUERATERANGE(Boolean value) {
        this.sositetrueraterange = value;
    }

    /**
     * Gets the value of the sositehtlmovedowntuner property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOSITEHTLMOVEDOWNTUNER() {
        return sositehtlmovedowntuner;
    }

    /**
     * Sets the value of the sositehtlmovedowntuner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOSITEHTLMOVEDOWNTUNER(BigInteger value) {
        this.sositehtlmovedowntuner = value;
    }

    /**
     * Gets the value of the sositeprimarycurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPRIMARYCURRENCY() {
        return sositeprimarycurrency;
    }

    /**
     * Sets the value of the sositeprimarycurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPRIMARYCURRENCY(String value) {
        this.sositeprimarycurrency = value;
    }

    /**
     * Gets the value of the sositeforceguarantee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFORCEGUARANTEE() {
        return sositeforceguarantee;
    }

    /**
     * Sets the value of the sositeforceguarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFORCEGUARANTEE(String value) {
        this.sositeforceguarantee = value;
    }

    /**
     * Gets the value of the sositeiatanbasguarantee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEIATANBASGUARANTEE() {
        return sositeiatanbasguarantee;
    }

    /**
     * Sets the value of the sositeiatanbasguarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEIATANBASGUARANTEE(String value) {
        this.sositeiatanbasguarantee = value;
    }

    /**
     * Gets the value of the sositeminimaltimemodif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMINIMALTIMEMODIF() {
        return sositeminimaltimemodif;
    }

    /**
     * Sets the value of the sositeminimaltimemodif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMINIMALTIMEMODIF(String value) {
        this.sositeminimaltimemodif = value;
    }

    /**
     * Gets the value of the sositeumlssorganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEUMLSSORGANISATION() {
        return sositeumlssorganisation;
    }

    /**
     * Sets the value of the sositeumlssorganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEUMLSSORGANISATION(String value) {
        this.sositeumlssorganisation = value;
    }

    /**
     * Gets the value of the sositeairmandifcar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEAIRMANDIFCAR() {
        return sositeairmandifcar;
    }

    /**
     * Sets the value of the sositeairmandifcar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEAIRMANDIFCAR(String value) {
        this.sositeairmandifcar = value;
    }

    /**
     * Gets the value of the sositecarminimaltime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITECARMINIMALTIME() {
        return sositecarminimaltime;
    }

    /**
     * Sets the value of the sositecarminimaltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITECARMINIMALTIME(String value) {
        this.sositecarminimaltime = value;
    }

    /**
     * Gets the value of the sositecarmaximumtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITECARMAXIMUMTIME() {
        return sositecarmaximumtime;
    }

    /**
     * Sets the value of the sositecarmaximumtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITECARMAXIMUMTIME(String value) {
        this.sositecarmaximumtime = value;
    }

    /**
     * Gets the value of the sositedisplaystdaccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEDISPLAYSTDACCESS() {
        return sositedisplaystdaccess;
    }

    /**
     * Sets the value of the sositedisplaystdaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEDISPLAYSTDACCESS(String value) {
        this.sositedisplaystdaccess = value;
    }

    /**
     * Gets the value of the sositeallowoverridecar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWOVERRIDECAR() {
        return sositeallowoverridecar;
    }

    /**
     * Sets the value of the sositeallowoverridecar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWOVERRIDECAR(String value) {
        this.sositeallowoverridecar = value;
    }

    /**
     * Gets the value of the sositemintimebkcar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMINTIMEBKCAR() {
        return sositemintimebkcar;
    }

    /**
     * Sets the value of the sositemintimebkcar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMINTIMEBKCAR(String value) {
        this.sositemintimebkcar = value;
    }

    /**
     * Gets the value of the sositemaxtimebkcar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMAXTIMEBKCAR() {
        return sositemaxtimebkcar;
    }

    /**
     * Sets the value of the sositemaxtimebkcar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMAXTIMEBKCAR(String value) {
        this.sositemaxtimebkcar = value;
    }

    /**
     * Gets the value of the sositependingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPENDINGTIMELIMIT() {
        return sositependingtimelimit;
    }

    /**
     * Sets the value of the sositependingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPENDINGTIMELIMIT(String value) {
        this.sositependingtimelimit = value;
    }

    /**
     * Gets the value of the sositeetoverridesmintime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETOVERRIDESMINTIME() {
        return sositeetoverridesmintime;
    }

    /**
     * Sets the value of the sositeetoverridesmintime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETOVERRIDESMINTIME(String value) {
        this.sositeetoverridesmintime = value;
    }

    /**
     * Gets the value of the sositeforceticketbymail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFORCETICKETBYMAIL() {
        return sositeforceticketbymail;
    }

    /**
     * Sets the value of the sositeforceticketbymail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFORCETICKETBYMAIL(String value) {
        this.sositeforceticketbymail = value;
    }

    /**
     * Gets the value of the sositevalidatingairline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEVALIDATINGAIRLINE() {
        return sositevalidatingairline;
    }

    /**
     * Sets the value of the sositevalidatingairline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEVALIDATINGAIRLINE(String value) {
        this.sositevalidatingairline = value;
    }

    /**
     * Gets the value of the sositefpccformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPCCFORMAT() {
        return sositefpccformat;
    }

    /**
     * Sets the value of the sositefpccformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPCCFORMAT(String value) {
        this.sositefpccformat = value;
    }

    /**
     * Gets the value of the sositefpmcoccformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPMCOCCFORMAT() {
        return sositefpmcoccformat;
    }

    /**
     * Sets the value of the sositefpmcoccformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPMCOCCFORMAT(String value) {
        this.sositefpmcoccformat = value;
    }

    /**
     * Gets the value of the sositefpccformatverif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPCCFORMATVERIF() {
        return sositefpccformatverif;
    }

    /**
     * Sets the value of the sositefpccformatverif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPCCFORMATVERIF(String value) {
        this.sositefpccformatverif = value;
    }

    /**
     * Gets the value of the sositefpapprovalformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPAPPROVALFORMAT() {
        return sositefpapprovalformat;
    }

    /**
     * Sets the value of the sositefpapprovalformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPAPPROVALFORMAT(String value) {
        this.sositefpapprovalformat = value;
    }

    /**
     * Gets the value of the sositepnrformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPNRFORMAT() {
        return sositepnrformat;
    }

    /**
     * Sets the value of the sositepnrformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPNRFORMAT(String value) {
        this.sositepnrformat = value;
    }

    /**
     * Gets the value of the sositeignoreiffarefails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEIGNOREIFFAREFAILS() {
        return sositeignoreiffarefails;
    }

    /**
     * Sets the value of the sositeignoreiffarefails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEIGNOREIFFAREFAILS(String value) {
        this.sositeignoreiffarefails = value;
    }

    /**
     * Gets the value of the sositeignoreifsellfails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEIGNOREIFSELLFAILS() {
        return sositeignoreifsellfails;
    }

    /**
     * Sets the value of the sositeignoreifsellfails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEIGNOREIFSELLFAILS(String value) {
        this.sositeignoreifsellfails = value;
    }

    /**
     * Gets the value of the sositeigsegifsellfails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEIGSEGIFSELLFAILS() {
        return sositeigsegifsellfails;
    }

    /**
     * Sets the value of the sositeigsegifsellfails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEIGSEGIFSELLFAILS(String value) {
        this.sositeigsegifsellfails = value;
    }

    /**
     * Gets the value of the sositereceivedfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITERECEIVEDFROM() {
        return sositereceivedfrom;
    }

    /**
     * Sets the value of the sositereceivedfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITERECEIVEDFROM(String value) {
        this.sositereceivedfrom = value;
    }

    /**
     * Gets the value of the sositeetmaxairsegments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETMAXAIRSEGMENTS() {
        return sositeetmaxairsegments;
    }

    /**
     * Sets the value of the sositeetmaxairsegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETMAXAIRSEGMENTS(String value) {
        this.sositeetmaxairsegments = value;
    }

    /**
     * Gets the value of the sositeetallowinfant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETALLOWINFANT() {
        return sositeetallowinfant;
    }

    /**
     * Sets the value of the sositeetallowinfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETALLOWINFANT(String value) {
        this.sositeetallowinfant = value;
    }

    /**
     * Gets the value of the sositeetairlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETAIRLINECODE() {
        return sositeetairlinecode;
    }

    /**
     * Sets the value of the sositeetairlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETAIRLINECODE(String value) {
        this.sositeetairlinecode = value;
    }

    /**
     * Gets the value of the sositeetcodeshare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETCODESHARE() {
        return sositeetcodeshare;
    }

    /**
     * Sets the value of the sositeetcodeshare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETCODESHARE(String value) {
        this.sositeetcodeshare = value;
    }

    /**
     * Gets the value of the sositeccmandatoryforet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITECCMANDATORYFORET() {
        return sositeccmandatoryforet;
    }

    /**
     * Sets the value of the sositeccmandatoryforet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITECCMANDATORYFORET(String value) {
        this.sositeccmandatoryforet = value;
    }

    /**
     * Gets the value of the soboolsendsrbsct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOBOOLSENDSRBSCT() {
        return soboolsendsrbsct;
    }

    /**
     * Sets the value of the soboolsendsrbsct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOBOOLSENDSRBSCT(String value) {
        this.soboolsendsrbsct = value;
    }

    /**
     * Gets the value of the sositeallowpnrnickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWPNRNICKNAME() {
        return sositeallowpnrnickname;
    }

    /**
     * Sets the value of the sositeallowpnrnickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWPNRNICKNAME(String value) {
        this.sositeallowpnrnickname = value;
    }

    /**
     * Gets the value of the sositeallowtktpnrmodif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWTKTPNRMODIF() {
        return sositeallowtktpnrmodif;
    }

    /**
     * Sets the value of the sositeallowtktpnrmodif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWTKTPNRMODIF(String value) {
        this.sositeallowtktpnrmodif = value;
    }

    /**
     * Gets the value of the sositeallowpnrmodif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWPNRMODIF() {
        return sositeallowpnrmodif;
    }

    /**
     * Sets the value of the sositeallowpnrmodif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWPNRMODIF(String value) {
        this.sositeallowpnrmodif = value;
    }

    /**
     * Gets the value of the sositeallowpartialcancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWPARTIALCANCEL() {
        return sositeallowpartialcancel;
    }

    /**
     * Sets the value of the sositeallowpartialcancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWPARTIALCANCEL(String value) {
        this.sositeallowpartialcancel = value;
    }

    /**
     * Gets the value of the sositeincludecancel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEINCLUDECANCEL1() {
        return sositeincludecancel1;
    }

    /**
     * Sets the value of the sositeincludecancel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEINCLUDECANCEL1(String value) {
        this.sositeincludecancel1 = value;
    }

    /**
     * Gets the value of the sositeincludecancel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEINCLUDECANCEL2() {
        return sositeincludecancel2;
    }

    /**
     * Sets the value of the sositeincludecancel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEINCLUDECANCEL2(String value) {
        this.sositeincludecancel2 = value;
    }

    /**
     * Gets the value of the sositetktaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKTACCOUNT() {
        return sositetktaccount;
    }

    /**
     * Sets the value of the sositetktaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKTACCOUNT(String value) {
        this.sositetktaccount = value;
    }

    /**
     * Gets the value of the sositetkteticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKTETICKET() {
        return sositetkteticket;
    }

    /**
     * Sets the value of the sositetkteticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKTETICKET(String value) {
        this.sositetkteticket = value;
    }

    /**
     * Gets the value of the sositetktexpmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKTEXPMAIL() {
        return sositetktexpmail;
    }

    /**
     * Sets the value of the sositetktexpmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKTEXPMAIL(String value) {
        this.sositetktexpmail = value;
    }

    /**
     * Gets the value of the sositetkthanddeliv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKTHANDDELIV() {
        return sositetkthanddeliv;
    }

    /**
     * Sets the value of the sositetkthanddeliv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKTHANDDELIV(String value) {
        this.sositetkthanddeliv = value;
    }

    /**
     * Gets the value of the sositetktnone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKTNONE() {
        return sositetktnone;
    }

    /**
     * Sets the value of the sositetktnone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKTNONE(String value) {
        this.sositetktnone = value;
    }

    /**
     * Gets the value of the sositetktpickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKTPICKUP() {
        return sositetktpickup;
    }

    /**
     * Sets the value of the sositetktpickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKTPICKUP(String value) {
        this.sositetktpickup = value;
    }

    /**
     * Gets the value of the sositetktpickupairl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKTPICKUPAIRL() {
        return sositetktpickupairl;
    }

    /**
     * Sets the value of the sositetktpickupairl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKTPICKUPAIRL(String value) {
        this.sositetktpickupairl = value;
    }

    /**
     * Gets the value of the sositetktpickuparpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKTPICKUPARPT() {
        return sositetktpickuparpt;
    }

    /**
     * Sets the value of the sositetktpickuparpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKTPICKUPARPT(String value) {
        this.sositetktpickuparpt = value;
    }

    /**
     * Gets the value of the sositeexpofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEEXPOFFICEID() {
        return sositeexpofficeid;
    }

    /**
     * Sets the value of the sositeexpofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEEXPOFFICEID(String value) {
        this.sositeexpofficeid = value;
    }

    /**
     * Gets the value of the sositeticketingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETICKETINGTIMELIMIT() {
        return sositeticketingtimelimit;
    }

    /**
     * Sets the value of the sositeticketingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETICKETINGTIMELIMIT(String value) {
        this.sositeticketingtimelimit = value;
    }

    /**
     * Gets the value of the sositetkarrangement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKARRANGEMENT() {
        return sositetkarrangement;
    }

    /**
     * Sets the value of the sositetkarrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKARRANGEMENT(String value) {
        this.sositetkarrangement = value;
    }

    /**
     * Gets the value of the sositetkofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKOFFICEID() {
        return sositetkofficeid;
    }

    /**
     * Sets the value of the sositetkofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKOFFICEID(String value) {
        this.sositetkofficeid = value;
    }

    /**
     * Gets the value of the sositetkdatetransaction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSOSITETKDATETRANSACTION() {
        return sositetkdatetransaction;
    }

    /**
     * Sets the value of the sositetkdatetransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSOSITETKDATETRANSACTION(XMLGregorianCalendar value) {
        this.sositetkdatetransaction = value;
    }

    /**
     * Gets the value of the sositetktimeperiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETKTIMEPERIOD() {
        return sositetktimeperiod;
    }

    /**
     * Sets the value of the sositetktimeperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETKTIMEPERIOD(String value) {
        this.sositetktimeperiod = value;
    }

    /**
     * Gets the value of the sositeavaildirectaccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEAVAILDIRECTACCESS() {
        return sositeavaildirectaccess;
    }

    /**
     * Sets the value of the sositeavaildirectaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEAVAILDIRECTACCESS(String value) {
        this.sositeavaildirectaccess = value;
    }

    /**
     * Gets the value of the sositedirectaccessairlin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEDIRECTACCESSAIRLIN() {
        return sositedirectaccessairlin;
    }

    /**
     * Sets the value of the sositedirectaccessairlin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEDIRECTACCESSAIRLIN(String value) {
        this.sositedirectaccessairlin = value;
    }

    /**
     * Gets the value of the sositehotelavailstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEHOTELAVAILSTATUS() {
        return sositehotelavailstatus;
    }

    /**
     * Sets the value of the sositehotelavailstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEHOTELAVAILSTATUS(String value) {
        this.sositehotelavailstatus = value;
    }

    /**
     * Gets the value of the sositedepositexclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEDEPOSITEXCLUDE() {
        return sositedepositexclude;
    }

    /**
     * Sets the value of the sositedepositexclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEDEPOSITEXCLUDE(String value) {
        this.sositedepositexclude = value;
    }

    /**
     * Gets the value of the sositepoiiatatypefilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPOIIATATYPEFILTER() {
        return sositepoiiatatypefilter;
    }

    /**
     * Sets the value of the sositepoiiatatypefilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPOIIATATYPEFILTER(String value) {
        this.sositepoiiatatypefilter = value;
    }

    /**
     * Gets the value of the sositefcincludeairlines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFCINCLUDEAIRLINES() {
        return sositefcincludeairlines;
    }

    /**
     * Sets the value of the sositefcincludeairlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFCINCLUDEAIRLINES(String value) {
        this.sositefcincludeairlines = value;
    }

    /**
     * Gets the value of the sositefcexcludeairlines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFCEXCLUDEAIRLINES() {
        return sositefcexcludeairlines;
    }

    /**
     * Sets the value of the sositefcexcludeairlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFCEXCLUDEAIRLINES(String value) {
        this.sositefcexcludeairlines = value;
    }

    /**
     * Gets the value of the sositeallowpnrreconf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWPNRRECONF() {
        return sositeallowpnrreconf;
    }

    /**
     * Sets the value of the sositeallowpnrreconf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWPNRRECONF(String value) {
        this.sositeallowpnrreconf = value;
    }

    /**
     * Gets the value of the sositeaddrbillingfmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEADDRBILLINGFMT() {
        return sositeaddrbillingfmt;
    }

    /**
     * Sets the value of the sositeaddrbillingfmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEADDRBILLINGFMT(String value) {
        this.sositeaddrbillingfmt = value;
    }

    /**
     * Gets the value of the sositeexcludeairlineslst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEEXCLUDEAIRLINESLST() {
        return sositeexcludeairlineslst;
    }

    /**
     * Sets the value of the sositeexcludeairlineslst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEEXCLUDEAIRLINESLST(String value) {
        this.sositeexcludeairlineslst = value;
    }

    /**
     * Gets the value of the sositeallowprefcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWPREFCURRENCY() {
        return sositeallowprefcurrency;
    }

    /**
     * Sets the value of the sositeallowprefcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWPREFCURRENCY(String value) {
        this.sositeallowprefcurrency = value;
    }

    /**
     * Gets the value of the sositeusercurrencycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEUSERCURRENCYCODE() {
        return sositeusercurrencycode;
    }

    /**
     * Sets the value of the sositeusercurrencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEUSERCURRENCYCODE(String value) {
        this.sositeusercurrencycode = value;
    }

    /**
     * Gets the value of the sositefpallowreturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEFPALLOWRETURN() {
        return sositefpallowreturn;
    }

    /**
     * Sets the value of the sositefpallowreturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEFPALLOWRETURN(Boolean value) {
        this.sositefpallowreturn = value;
    }

    /**
     * Gets the value of the sositefpallowoneway property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEFPALLOWONEWAY() {
        return sositefpallowoneway;
    }

    /**
     * Sets the value of the sositefpallowoneway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEFPALLOWONEWAY(Boolean value) {
        this.sositefpallowoneway = value;
    }

    /**
     * Gets the value of the sositefpwithholdtaxes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEFPWITHHOLDTAXES() {
        return sositefpwithholdtaxes;
    }

    /**
     * Sets the value of the sositefpwithholdtaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEFPWITHHOLDTAXES(Boolean value) {
        this.sositefpwithholdtaxes = value;
    }

    /**
     * Gets the value of the sositefpwithholdsurcharg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEFPWITHHOLDSURCHARG() {
        return sositefpwithholdsurcharg;
    }

    /**
     * Sets the value of the sositefpwithholdsurcharg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEFPWITHHOLDSURCHARG(Boolean value) {
        this.sositefpwithholdsurcharg = value;
    }

    /**
     * Gets the value of the sositefpbackuptocal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEFPBACKUPTOCAL() {
        return sositefpbackuptocal;
    }

    /**
     * Sets the value of the sositefpbackuptocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEFPBACKUPTOCAL(Boolean value) {
        this.sositefpbackuptocal = value;
    }

    /**
     * Gets the value of the sositefpcalbckupc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSOSITEFPCALBCKUPC() {
        return sositefpcalbckupc;
    }

    /**
     * Sets the value of the sositefpcalbckupc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSOSITEFPCALBCKUPC(Integer value) {
        this.sositefpcalbckupc = value;
    }

    /**
     * Gets the value of the sositefpobfcafromavail property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSOSITEFPOBFCAFROMAVAIL() {
        return sositefpobfcafromavail;
    }

    /**
     * Sets the value of the sositefpobfcafromavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSOSITEFPOBFCAFROMAVAIL(Integer value) {
        this.sositefpobfcafromavail = value;
    }

    /**
     * Gets the value of the sositesdobfcafromfar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSOSITESDOBFCAFROMFAR() {
        return sositesdobfcafromfar;
    }

    /**
     * Sets the value of the sositesdobfcafromfar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSOSITESDOBFCAFROMFAR(Integer value) {
        this.sositesdobfcafromfar = value;
    }

    /**
     * Gets the value of the sositefpcalbckupi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSOSITEFPCALBCKUPI() {
        return sositefpcalbckupi;
    }

    /**
     * Sets the value of the sositefpcalbckupi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSOSITEFPCALBCKUPI(Integer value) {
        this.sositefpcalbckupi = value;
    }

    /**
     * Gets the value of the sositefpprefcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPPREFCARRIER() {
        return sositefpprefcarrier;
    }

    /**
     * Sets the value of the sositefpprefcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPPREFCARRIER(String value) {
        this.sositefpprefcarrier = value;
    }

    /**
     * Gets the value of the sositefpdirectnonstop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEFPDIRECTNONSTOP() {
        return sositefpdirectnonstop;
    }

    /**
     * Sets the value of the sositefpdirectnonstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEFPDIRECTNONSTOP(Boolean value) {
        this.sositefpdirectnonstop = value;
    }

    /**
     * Gets the value of the sositeallowservicefee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWSERVICEFEE() {
        return sositeallowservicefee;
    }

    /**
     * Sets the value of the sositeallowservicefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWSERVICEFEE(String value) {
        this.sositeallowservicefee = value;
    }

    /**
     * Gets the value of the sositeservicefeemode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESERVICEFEEMODE() {
        return sositeservicefeemode;
    }

    /**
     * Sets the value of the sositeservicefeemode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESERVICEFEEMODE(String value) {
        this.sositeservicefeemode = value;
    }

    /**
     * Gets the value of the sositeusesitefee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEUSESITEFEE() {
        return sositeusesitefee;
    }

    /**
     * Sets the value of the sositeusesitefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEUSESITEFEE(String value) {
        this.sositeusesitefee = value;
    }

    /**
     * Gets the value of the sositeallowmkpdiscnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWMKPDISCNT() {
        return sositeallowmkpdiscnt;
    }

    /**
     * Sets the value of the sositeallowmkpdiscnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWMKPDISCNT(String value) {
        this.sositeallowmkpdiscnt = value;
    }

    /**
     * Gets the value of the sositeapplicdisconfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEAPPLICDISCONFARE() {
        return sositeapplicdisconfare;
    }

    /**
     * Sets the value of the sositeapplicdisconfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEAPPLICDISCONFARE(String value) {
        this.sositeapplicdisconfare = value;
    }

    /**
     * Gets the value of the sositefeetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFEETYPE() {
        return sositefeetype;
    }

    /**
     * Sets the value of the sositefeetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFEETYPE(String value) {
        this.sositefeetype = value;
    }

    /**
     * Gets the value of the sositefeeamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFEEAMOUNT() {
        return sositefeeamount;
    }

    /**
     * Sets the value of the sositefeeamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFEEAMOUNT(String value) {
        this.sositefeeamount = value;
    }

    /**
     * Gets the value of the sositefeepercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFEEPERCENTAGE() {
        return sositefeepercentage;
    }

    /**
     * Sets the value of the sositefeepercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFEEPERCENTAGE(String value) {
        this.sositefeepercentage = value;
    }

    /**
     * Gets the value of the sositefeecurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFEECURRENCY() {
        return sositefeecurrency;
    }

    /**
     * Sets the value of the sositefeecurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFEECURRENCY(String value) {
        this.sositefeecurrency = value;
    }

    /**
     * Gets the value of the sositefptraceson property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEFPTRACESON() {
        return sositefptraceson;
    }

    /**
     * Sets the value of the sositefptraceson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEFPTRACESON(Boolean value) {
        this.sositefptraceson = value;
    }

    /**
     * Gets the value of the sositeverifyff1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEVERIFYFF1() {
        return sositeverifyff1;
    }

    /**
     * Sets the value of the sositeverifyff1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEVERIFYFF1(String value) {
        this.sositeverifyff1 = value;
    }

    /**
     * Gets the value of the sositeetixallow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEETIXALLOW() {
        return sositeetixallow;
    }

    /**
     * Sets the value of the sositeetixallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEETIXALLOW(Boolean value) {
        this.sositeetixallow = value;
    }

    /**
     * Gets the value of the sositetbmallow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITETBMALLOW() {
        return sositetbmallow;
    }

    /**
     * Sets the value of the sositetbmallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITETBMALLOW(Boolean value) {
        this.sositetbmallow = value;
    }

    /**
     * Gets the value of the sositetodallow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITETODALLOW() {
        return sositetodallow;
    }

    /**
     * Sets the value of the sositetodallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITETODALLOW(Boolean value) {
        this.sositetodallow = value;
    }

    /**
     * Gets the value of the sositeetixplustbmallow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEETIXPLUSTBMALLOW() {
        return sositeetixplustbmallow;
    }

    /**
     * Sets the value of the sositeetixplustbmallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEETIXPLUSTBMALLOW(Boolean value) {
        this.sositeetixplustbmallow = value;
    }

    /**
     * Gets the value of the sositetbmmintime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETBMMINTIME() {
        return sositetbmmintime;
    }

    /**
     * Sets the value of the sositetbmmintime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETBMMINTIME(String value) {
        this.sositetbmmintime = value;
    }

    /**
     * Gets the value of the sositetodmintime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETODMINTIME() {
        return sositetodmintime;
    }

    /**
     * Sets the value of the sositetodmintime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETODMINTIME(String value) {
        this.sositetodmintime = value;
    }

    /**
     * Gets the value of the sositetodmaxtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETODMAXTIME() {
        return sositetodmaxtime;
    }

    /**
     * Sets the value of the sositetodmaxtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETODMAXTIME(String value) {
        this.sositetodmaxtime = value;
    }

    /**
     * Gets the value of the sositeetixmintime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETIXMINTIME() {
        return sositeetixmintime;
    }

    /**
     * Sets the value of the sositeetixmintime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETIXMINTIME(String value) {
        this.sositeetixmintime = value;
    }

    /**
     * Gets the value of the sositemodtypefilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMODTYPEFILTER() {
        return sositemodtypefilter;
    }

    /**
     * Sets the value of the sositemodtypefilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMODTYPEFILTER(String value) {
        this.sositemodtypefilter = value;
    }

    /**
     * Gets the value of the sositeetixflightfilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETIXFLIGHTFILTER() {
        return sositeetixflightfilter;
    }

    /**
     * Sets the value of the sositeetixflightfilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETIXFLIGHTFILTER(String value) {
        this.sositeetixflightfilter = value;
    }

    /**
     * Gets the value of the sositeetixagrfilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETIXAGRFILTER() {
        return sositeetixagrfilter;
    }

    /**
     * Sets the value of the sositeetixagrfilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETIXAGRFILTER(String value) {
        this.sositeetixagrfilter = value;
    }

    /**
     * Gets the value of the sositeawardflow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEAWARDFLOW() {
        return sositeawardflow;
    }

    /**
     * Sets the value of the sositeawardflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEAWARDFLOW(String value) {
        this.sositeawardflow = value;
    }

    /**
     * Gets the value of the sositeetixmindate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETIXMINDATE() {
        return sositeetixmindate;
    }

    /**
     * Sets the value of the sositeetixmindate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETIXMINDATE(String value) {
        this.sositeetixmindate = value;
    }

    /**
     * Gets the value of the sositetbmmindate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETBMMINDATE() {
        return sositetbmmindate;
    }

    /**
     * Sets the value of the sositetbmmindate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETBMMINDATE(String value) {
        this.sositetbmmindate = value;
    }

    /**
     * Gets the value of the sositeexptbmmindate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEEXPTBMMINDATE() {
        return sositeexptbmmindate;
    }

    /**
     * Sets the value of the sositeexptbmmindate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEEXPTBMMINDATE(String value) {
        this.sositeexptbmmindate = value;
    }

    /**
     * Gets the value of the sositeexptbmfeeamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEEXPTBMFEEAMOUNT() {
        return sositeexptbmfeeamount;
    }

    /**
     * Sets the value of the sositeexptbmfeeamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEEXPTBMFEEAMOUNT(String value) {
        this.sositeexptbmfeeamount = value;
    }

    /**
     * Gets the value of the sositeexptbmfeecurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEEXPTBMFEECURR() {
        return sositeexptbmfeecurr;
    }

    /**
     * Sets the value of the sositeexptbmfeecurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEEXPTBMFEECURR(String value) {
        this.sositeexptbmfeecurr = value;
    }

    /**
     * Gets the value of the sositeminrebookfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMINREBOOKFEE() {
        return sositeminrebookfee;
    }

    /**
     * Sets the value of the sositeminrebookfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMINREBOOKFEE(String value) {
        this.sositeminrebookfee = value;
    }

    /**
     * Gets the value of the sositemaxrebookfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMAXREBOOKFEE() {
        return sositemaxrebookfee;
    }

    /**
     * Sets the value of the sositemaxrebookfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMAXREBOOKFEE(String value) {
        this.sositemaxrebookfee = value;
    }

    /**
     * Gets the value of the sositeaveragerebookfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEAVERAGEREBOOKFEE() {
        return sositeaveragerebookfee;
    }

    /**
     * Sets the value of the sositeaveragerebookfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEAVERAGEREBOOKFEE(String value) {
        this.sositeaveragerebookfee = value;
    }

    /**
     * Gets the value of the sositecurrencyrebookfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITECURRENCYREBOOKFEE() {
        return sositecurrencyrebookfee;
    }

    /**
     * Sets the value of the sositecurrencyrebookfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITECURRENCYREBOOKFEE(String value) {
        this.sositecurrencyrebookfee = value;
    }

    /**
     * Gets the value of the sositeapiv2SERVER property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEAPIV2SERVER() {
        return sositeapiv2SERVER;
    }

    /**
     * Sets the value of the sositeapiv2SERVER property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEAPIV2SERVER(String value) {
        this.sositeapiv2SERVER = value;
    }

    /**
     * Gets the value of the sositeapiv2SERVERUSERID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEAPIV2SERVERUSERID() {
        return sositeapiv2SERVERUSERID;
    }

    /**
     * Sets the value of the sositeapiv2SERVERUSERID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEAPIV2SERVERUSERID(String value) {
        this.sositeapiv2SERVERUSERID = value;
    }

    /**
     * Gets the value of the sositeapiv2SERVERPWD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEAPIV2SERVERPWD() {
        return sositeapiv2SERVERPWD;
    }

    /**
     * Sets the value of the sositeapiv2SERVERPWD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEAPIV2SERVERPWD(String value) {
        this.sositeapiv2SERVERPWD = value;
    }

    /**
     * Gets the value of the sositezambasurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEZAMBASURL() {
        return sositezambasurl;
    }

    /**
     * Sets the value of the sositezambasurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEZAMBASURL(String value) {
        this.sositezambasurl = value;
    }

    /**
     * Gets the value of the sositedisablediscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEDISABLEDISCOUNT() {
        return sositedisablediscount;
    }

    /**
     * Sets the value of the sositedisablediscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEDISABLEDISCOUNT(String value) {
        this.sositedisablediscount = value;
    }

    /**
     * Gets the value of the sositefppojoactive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPPOJOACTIVE() {
        return sositefppojoactive;
    }

    /**
     * Sets the value of the sositefppojoactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPPOJOACTIVE(String value) {
        this.sositefppojoactive = value;
    }

    /**
     * Gets the value of the sositefpsocalmax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPSOCALMAX() {
        return sositefpsocalmax;
    }

    /**
     * Sets the value of the sositefpsocalmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPSOCALMAX(String value) {
        this.sositefpsocalmax = value;
    }

    /**
     * Gets the value of the sositewebfaresplisttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEWEBFARESPLISTTYPE() {
        return sositewebfaresplisttype;
    }

    /**
     * Sets the value of the sositewebfaresplisttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEWEBFARESPLISTTYPE(String value) {
        this.sositewebfaresplisttype = value;
    }

    /**
     * Gets the value of the sositewebfaresslisttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEWEBFARESSLISTTYPE() {
        return sositewebfaresslisttype;
    }

    /**
     * Sets the value of the sositewebfaresslisttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEWEBFARESSLISTTYPE(String value) {
        this.sositewebfaresslisttype = value;
    }

    /**
     * Gets the value of the sogl property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideInput.SOGL }
     *     
     */
    public OverrideInput.SOGL getSOGL() {
        return sogl;
    }

    /**
     * Sets the value of the sogl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideInput.SOGL }
     *     
     */
    public void setSOGL(OverrideInput.SOGL value) {
        this.sogl = value;
    }

    /**
     * Gets the value of the sositeiatanumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEIATANUMBER() {
        return sositeiatanumber;
    }

    /**
     * Sets the value of the sositeiatanumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEIATANUMBER(String value) {
        this.sositeiatanumber = value;
    }

    /**
     * Gets the value of the sositessoption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESSOPTION() {
        return sositessoption;
    }

    /**
     * Sets the value of the sositessoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESSOPTION(String value) {
        this.sositessoption = value;
    }

    /**
     * Gets the value of the sositefaresoldoutflight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFARESOLDOUTFLIGHT() {
        return sositefaresoldoutflight;
    }

    /**
     * Sets the value of the sositefaresoldoutflight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFARESOLDOUTFLIGHT(String value) {
        this.sositefaresoldoutflight = value;
    }

    /**
     * Gets the value of the sositeaddrdeliveryfmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEADDRDELIVERYFMT() {
        return sositeaddrdeliveryfmt;
    }

    /**
     * Sets the value of the sositeaddrdeliveryfmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEADDRDELIVERYFMT(String value) {
        this.sositeaddrdeliveryfmt = value;
    }

    /**
     * Gets the value of the sositemandatorydaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEMANDATORYDADDRESS() {
        return sositemandatorydaddress;
    }

    /**
     * Sets the value of the sositemandatorydaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEMANDATORYDADDRESS(String value) {
        this.sositemandatorydaddress = value;
    }

    /**
     * Gets the value of the sositemopdd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEMOPDD() {
        return sositemopdd;
    }

    /**
     * Sets the value of the sositemopdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEMOPDD(Boolean value) {
        this.sositemopdd = value;
    }

    /**
     * Gets the value of the sositemopddbookingtime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEMOPDDBOOKINGTIME() {
        return sositemopddbookingtime;
    }

    /**
     * Sets the value of the sositemopddbookingtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEMOPDDBOOKINGTIME(Boolean value) {
        this.sositemopddbookingtime = value;
    }

    /**
     * Gets the value of the sositefpagtnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPAGTNUMBER() {
        return sositefpagtnumber;
    }

    /**
     * Sets the value of the sositefpagtnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPAGTNUMBER(String value) {
        this.sositefpagtnumber = value;
    }

    /**
     * Gets the value of the sositecountryofresidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITECOUNTRYOFRESIDENCE() {
        return sositecountryofresidence;
    }

    /**
     * Sets the value of the sositecountryofresidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITECOUNTRYOFRESIDENCE(String value) {
        this.sositecountryofresidence = value;
    }

    /**
     * Gets the value of the sositespecialoffer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITESPECIALOFFER() {
        return sositespecialoffer;
    }

    /**
     * Sets the value of the sositespecialoffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITESPECIALOFFER(Boolean value) {
        this.sositespecialoffer = value;
    }

    /**
     * Gets the value of the sositeonlineindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEONLINEINDICATOR() {
        return sositeonlineindicator;
    }

    /**
     * Sets the value of the sositeonlineindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEONLINEINDICATOR(Boolean value) {
        this.sositeonlineindicator = value;
    }

    /**
     * Gets the value of the sositeetixqueueofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETIXQUEUEOFFICEID() {
        return sositeetixqueueofficeid;
    }

    /**
     * Sets the value of the sositeetixqueueofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETIXQUEUEOFFICEID(String value) {
        this.sositeetixqueueofficeid = value;
    }

    /**
     * Gets the value of the sositetbmqueueofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETBMQUEUEOFFICEID() {
        return sositetbmqueueofficeid;
    }

    /**
     * Sets the value of the sositetbmqueueofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETBMQUEUEOFFICEID(String value) {
        this.sositetbmqueueofficeid = value;
    }

    /**
     * Gets the value of the sositetodqueueofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETODQUEUEOFFICEID() {
        return sositetodqueueofficeid;
    }

    /**
     * Sets the value of the sositetodqueueofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETODQUEUEOFFICEID(String value) {
        this.sositetodqueueofficeid = value;
    }

    /**
     * Gets the value of the sositeetixqueuecategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETIXQUEUECATEGORY() {
        return sositeetixqueuecategory;
    }

    /**
     * Sets the value of the sositeetixqueuecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETIXQUEUECATEGORY(String value) {
        this.sositeetixqueuecategory = value;
    }

    /**
     * Gets the value of the sositetbmqueuecategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETBMQUEUECATEGORY() {
        return sositetbmqueuecategory;
    }

    /**
     * Sets the value of the sositetbmqueuecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETBMQUEUECATEGORY(String value) {
        this.sositetbmqueuecategory = value;
    }

    /**
     * Gets the value of the sositetodqueuecategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETODQUEUECATEGORY() {
        return sositetodqueuecategory;
    }

    /**
     * Sets the value of the sositetodqueuecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETODQUEUECATEGORY(String value) {
        this.sositetodqueuecategory = value;
    }

    /**
     * Gets the value of the sositeetixqueueid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEETIXQUEUEID() {
        return sositeetixqueueid;
    }

    /**
     * Sets the value of the sositeetixqueueid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEETIXQUEUEID(String value) {
        this.sositeetixqueueid = value;
    }

    /**
     * Gets the value of the sositetbmqueueid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETBMQUEUEID() {
        return sositetbmqueueid;
    }

    /**
     * Sets the value of the sositetbmqueueid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETBMQUEUEID(String value) {
        this.sositetbmqueueid = value;
    }

    /**
     * Gets the value of the sositetodqueueid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITETODQUEUEID() {
        return sositetodqueueid;
    }

    /**
     * Sets the value of the sositetodqueueid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITETODQUEUEID(String value) {
        this.sositetodqueueid = value;
    }

    /**
     * Gets the value of the sositeallowprofileless property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSOSITEALLOWPROFILELESS() {
        return sositeallowprofileless;
    }

    /**
     * Sets the value of the sositeallowprofileless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSOSITEALLOWPROFILELESS(Object value) {
        this.sositeallowprofileless = value;
    }

    /**
     * Gets the value of the sositepaxdisplayrule property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSOSITEPAXDISPLAYRULE() {
        return sositepaxdisplayrule;
    }

    /**
     * Sets the value of the sositepaxdisplayrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSOSITEPAXDISPLAYRULE(Object value) {
        this.sositepaxdisplayrule = value;
    }

    /**
     * Gets the value of the sositesupplyfarecalc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESUPPLYFARECALC() {
        return sositesupplyfarecalc;
    }

    /**
     * Sets the value of the sositesupplyfarecalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESUPPLYFARECALC(String value) {
        this.sositesupplyfarecalc = value;
    }

    /**
     * Gets the value of the sositeusesiterbkfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEUSESITERBKFEE() {
        return sositeusesiterbkfee;
    }

    /**
     * Sets the value of the sositeusesiterbkfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEUSESITERBKFEE(String value) {
        this.sositeusesiterbkfee = value;
    }

    /**
     * Gets the value of the sositerbkfeetype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOSITERBKFEETYPE() {
        return sositerbkfeetype;
    }

    /**
     * Sets the value of the sositerbkfeetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOSITERBKFEETYPE(BigInteger value) {
        this.sositerbkfeetype = value;
    }

    /**
     * Gets the value of the sositerbkfee property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSOSITERBKFEE() {
        return sositerbkfee;
    }

    /**
     * Sets the value of the sositerbkfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSOSITERBKFEE(Float value) {
        this.sositerbkfee = value;
    }

    /**
     * Gets the value of the sositerbkaddfee property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSOSITERBKADDFEE() {
        return sositerbkaddfee;
    }

    /**
     * Sets the value of the sositerbkaddfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSOSITERBKADDFEE(Float value) {
        this.sositerbkaddfee = value;
    }

    /**
     * Gets the value of the sositerbkfeecurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITERBKFEECURRENCY() {
        return sositerbkfeecurrency;
    }

    /**
     * Sets the value of the sositerbkfeecurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITERBKFEECURRENCY(String value) {
        this.sositerbkfeecurrency = value;
    }

    /**
     * Gets the value of the sositerbkusededucedcff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITERBKUSEDEDUCEDCFF() {
        return sositerbkusededucedcff;
    }

    /**
     * Sets the value of the sositerbkusededucedcff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITERBKUSEDEDUCEDCFF(String value) {
        this.sositerbkusededucedcff = value;
    }

    /**
     * Gets the value of the sositermdiscounttext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITERMDISCOUNTTEXT() {
        return sositermdiscounttext;
    }

    /**
     * Sets the value of the sositermdiscounttext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITERMDISCOUNTTEXT(String value) {
        this.sositermdiscounttext = value;
    }

    /**
     * Gets the value of the sositermmarkuptext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITERMMARKUPTEXT() {
        return sositermmarkuptext;
    }

    /**
     * Sets the value of the sositermmarkuptext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITERMMARKUPTEXT(String value) {
        this.sositermmarkuptext = value;
    }

    /**
     * Gets the value of the sositeservicefeewfamnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESERVICEFEEWFAMNT() {
        return sositeservicefeewfamnt;
    }

    /**
     * Sets the value of the sositeservicefeewfamnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESERVICEFEEWFAMNT(String value) {
        this.sositeservicefeewfamnt = value;
    }

    /**
     * Gets the value of the sositeservicefeewfccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESERVICEFEEWFCCY() {
        return sositeservicefeewfccy;
    }

    /**
     * Sets the value of the sositeservicefeewfccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESERVICEFEEWFCCY(String value) {
        this.sositeservicefeewfccy = value;
    }

    /**
     * Gets the value of the sositeallowredembooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWREDEMBOOKING() {
        return sositeallowredembooking;
    }

    /**
     * Sets the value of the sositeallowredembooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWREDEMBOOKING(String value) {
        this.sositeallowredembooking = value;
    }

    /**
     * Gets the value of the sositefpdispredemcost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPDISPREDEMCOST() {
        return sositefpdispredemcost;
    }

    /**
     * Sets the value of the sositefpdispredemcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPDISPREDEMCOST(String value) {
        this.sositefpdispredemcost = value;
    }

    /**
     * Gets the value of the sositefpredemmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPREDEMMODE() {
        return sositefpredemmode;
    }

    /**
     * Sets the value of the sositefpredemmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPREDEMMODE(String value) {
        this.sositefpredemmode = value;
    }

    /**
     * Gets the value of the sositefardispredemcost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFARDISPREDEMCOST() {
        return sositefardispredemcost;
    }

    /**
     * Sets the value of the sositefardispredemcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFARDISPREDEMCOST(String value) {
        this.sositefardispredemcost = value;
    }

    /**
     * Gets the value of the sositefaringredemmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFARINGREDEMMODE() {
        return sositefaringredemmode;
    }

    /**
     * Sets the value of the sositefaringredemmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFARINGREDEMMODE(String value) {
        this.sositefaringredemmode = value;
    }

    /**
     * Gets the value of the sositefarvalidredemcost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFARVALIDREDEMCOST() {
        return sositefarvalidredemcost;
    }

    /**
     * Sets the value of the sositefarvalidredemcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFARVALIDREDEMCOST(String value) {
        this.sositefarvalidredemcost = value;
    }

    /**
     * Gets the value of the sositefarvalidredemtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFARVALIDREDEMTYPE() {
        return sositefarvalidredemtype;
    }

    /**
     * Sets the value of the sositefarvalidredemtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFARVALIDREDEMTYPE(String value) {
        this.sositefarvalidredemtype = value;
    }

    /**
     * Gets the value of the sositeredemfbindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEREDEMFBINDEX() {
        return sositeredemfbindex;
    }

    /**
     * Sets the value of the sositeredemfbindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEREDEMFBINDEX(String value) {
        this.sositeredemfbindex = value;
    }

    /**
     * Gets the value of the sositeredemfbdigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEREDEMFBDIGIT() {
        return sositeredemfbdigit;
    }

    /**
     * Sets the value of the sositeredemfbdigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEREDEMFBDIGIT(String value) {
        this.sositeredemfbdigit = value;
    }

    /**
     * Gets the value of the sositeredemfbcoef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEREDEMFBCOEF() {
        return sositeredemfbcoef;
    }

    /**
     * Sets the value of the sositeredemfbcoef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEREDEMFBCOEF(String value) {
        this.sositeredemfbcoef = value;
    }

    /**
     * Gets the value of the sositepatheoserverurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPATHEOSERVERURL() {
        return sositepatheoserverurl;
    }

    /**
     * Sets the value of the sositepatheoserverurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPATHEOSERVERURL(String value) {
        this.sositepatheoserverurl = value;
    }

    /**
     * Gets the value of the sositepatheologin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPATHEOLOGIN() {
        return sositepatheologin;
    }

    /**
     * Sets the value of the sositepatheologin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPATHEOLOGIN(String value) {
        this.sositepatheologin = value;
    }

    /**
     * Gets the value of the sositepatheopassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPATHEOPASSWORD() {
        return sositepatheopassword;
    }

    /**
     * Sets the value of the sositepatheopassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPATHEOPASSWORD(String value) {
        this.sositepatheopassword = value;
    }

    /**
     * Gets the value of the sositegdsused property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEGDSUSED() {
        return sositegdsused;
    }

    /**
     * Sets the value of the sositegdsused property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEGDSUSED(String value) {
        this.sositegdsused = value;
    }

    /**
     * Gets the value of the sositepassgds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPASSGDS() {
        return sositepassgds;
    }

    /**
     * Sets the value of the sositepassgds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPASSGDS(String value) {
        this.sositepassgds = value;
    }

    /**
     * Gets the value of the sositepassprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPASSPROVIDER() {
        return sositepassprovider;
    }

    /**
     * Sets the value of the sositepassprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPASSPROVIDER(String value) {
        this.sositepassprovider = value;
    }

    /**
     * Gets the value of the sositepassprovidercfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPASSPROVIDERCFG() {
        return sositepassprovidercfg;
    }

    /**
     * Sets the value of the sositepassprovidercfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPASSPROVIDERCFG(String value) {
        this.sositepassprovidercfg = value;
    }

    /**
     * Gets the value of the sositepassxxtrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEPASSXXTRACE() {
        return sositepassxxtrace;
    }

    /**
     * Sets the value of the sositepassxxtrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEPASSXXTRACE(String value) {
        this.sositepassxxtrace = value;
    }

    /**
     * Gets the value of the sositeitaprecheckuse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEITAPRECHECKUSE() {
        return sositeitaprecheckuse;
    }

    /**
     * Sets the value of the sositeitaprecheckuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEITAPRECHECKUSE(String value) {
        this.sositeitaprecheckuse = value;
    }

    /**
     * Gets the value of the sositefpsarfromextern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEFPSARFROMEXTERN() {
        return sositefpsarfromextern;
    }

    /**
     * Sets the value of the sositefpsarfromextern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEFPSARFROMEXTERN(String value) {
        this.sositefpsarfromextern = value;
    }

    /**
     * Gets the value of the sositeebmsapiserverurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEEBMSAPISERVERURL() {
        return sositeebmsapiserverurl;
    }

    /**
     * Sets the value of the sositeebmsapiserverurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEEBMSAPISERVERURL(String value) {
        this.sositeebmsapiserverurl = value;
    }

    /**
     * Gets the value of the sositeebmsapiserviceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEEBMSAPISERVICEID() {
        return sositeebmsapiserviceid;
    }

    /**
     * Sets the value of the sositeebmsapiserviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEEBMSAPISERVICEID(String value) {
        this.sositeebmsapiserviceid = value;
    }

    /**
     * Gets the value of the sositedwmencenabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEDWMENCENABLED() {
        return sositedwmencenabled;
    }

    /**
     * Sets the value of the sositedwmencenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEDWMENCENABLED(String value) {
        this.sositedwmencenabled = value;
    }

    /**
     * Gets the value of the sositesendffbeforeprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESENDFFBEFOREPRICE() {
        return sositesendffbeforeprice;
    }

    /**
     * Sets the value of the sositesendffbeforeprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESENDFFBEFOREPRICE(String value) {
        this.sositesendffbeforeprice = value;
    }

    /**
     * Gets the value of the sositeispsfenabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITEISPSFENABLED() {
        return sositeispsfenabled;
    }

    /**
     * Sets the value of the sositeispsfenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITEISPSFENABLED(Boolean value) {
        this.sositeispsfenabled = value;
    }

    /**
     * Gets the value of the sositesexmlconfig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITESEXMLCONFIG() {
        return sositesexmlconfig;
    }

    /**
     * Sets the value of the sositesexmlconfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITESEXMLCONFIG(Boolean value) {
        this.sositesexmlconfig = value;
    }

    /**
     * Gets the value of the sositetdenabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITETDENABLED() {
        return sositetdenabled;
    }

    /**
     * Sets the value of the sositetdenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITETDENABLED(Boolean value) {
        this.sositetdenabled = value;
    }

    /**
     * Gets the value of the sositelnmergelogic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITELNMERGELOGIC() {
        return sositelnmergelogic;
    }

    /**
     * Sets the value of the sositelnmergelogic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITELNMERGELOGIC(String value) {
        this.sositelnmergelogic = value;
    }

    /**
     * Gets the value of the sositeusecasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEUSECASA() {
        return sositeusecasa;
    }

    /**
     * Sets the value of the sositeusecasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEUSECASA(String value) {
        this.sositeusecasa = value;
    }

    /**
     * Gets the value of the sositecarmndtrypictures property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITECARMNDTRYPICTURES() {
        return sositecarmndtrypictures;
    }

    /**
     * Sets the value of the sositecarmndtrypictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITECARMNDTRYPICTURES(Boolean value) {
        this.sositecarmndtrypictures = value;
    }

    /**
     * Gets the value of the sositecarmndtrymodel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOSITECARMNDTRYMODEL() {
        return sositecarmndtrymodel;
    }

    /**
     * Sets the value of the sositecarmndtrymodel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOSITECARMNDTRYMODEL(Boolean value) {
        this.sositecarmndtrymodel = value;
    }

    /**
     * Gets the value of the sositerailprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITERAILPROVIDER() {
        return sositerailprovider;
    }

    /**
     * Sets the value of the sositerailprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITERAILPROVIDER(String value) {
        this.sositerailprovider = value;
    }

    /**
     * Gets the value of the sositenonrevenuewsurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITENONREVENUEWSURL() {
        return sositenonrevenuewsurl;
    }

    /**
     * Sets the value of the sositenonrevenuewsurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITENONREVENUEWSURL(String value) {
        this.sositenonrevenuewsurl = value;
    }

    /**
     * Gets the value of the sositeswapassburversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITESWAPASSBURVERSION() {
        return sositeswapassburversion;
    }

    /**
     * Sets the value of the sositeswapassburversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITESWAPASSBURVERSION(String value) {
        this.sositeswapassburversion = value;
    }

    /**
     * Gets the value of the sositeallowctgoutoffsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSITEALLOWCTGOUTOFFSR() {
        return sositeallowctgoutoffsr;
    }

    /**
     * Sets the value of the sositeallowctgoutoffsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSITEALLOWCTGOUTOFFSR(String value) {
        this.sositeallowctgoutoffsr = value;
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
     *     {@link OverrideInput.REQUESTINFO }
     *     
     */
    public OverrideInput.REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideInput.REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(OverrideInput.REQUESTINFO value) {
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
     * {@link OverrideInput.APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<OverrideInput.APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<OverrideInput.APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
    }

    /**
     * Gets the value of the embeddedtransaction property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideInput.EMBEDDEDTRANSACTION }
     *     
     */
    public OverrideInput.EMBEDDEDTRANSACTION getEMBEDDEDTRANSACTION() {
        return embeddedtransaction;
    }

    /**
     * Sets the value of the embeddedtransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideInput.EMBEDDEDTRANSACTION }
     *     
     */
    public void setEMBEDDEDTRANSACTION(OverrideInput.EMBEDDEDTRANSACTION value) {
        this.embeddedtransaction = value;
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
     *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="schemaRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class EMBEDDEDTRANSACTION
        implements Serializable
    {

        @XmlMixed
        @XmlAnyElement
        protected List<Object> content;
        @XmlAttribute(name = "schemaRef")
        protected String schemaRef;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link String }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

        /**
         * Gets the value of the schemaRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemaRef() {
            return schemaRef;
        }

        /**
         * Sets the value of the schemaRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemaRef(String value) {
            this.schemaRef = value;
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
     *         &lt;element name="GLOBAL_LIST" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}GLOBAL_LIST_Type"&gt;
     *                 &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" default="complete" /&gt;
     *                 &lt;attribute name="nbKey" type="{http://www.w3.org/2001/XMLSchema}int" default="1" /&gt;
     *                 &lt;attribute name="keyIndex" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
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
        "globallist"
    })
    public static class SOGL
        implements Serializable
    {

        @XmlElement(name = "GLOBAL_LIST", required = true)
        protected List<OverrideInput.SOGL.GLOBALLIST> globallist;

        /**
         * Gets the value of the globallist property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the globallist property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLOBALLIST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OverrideInput.SOGL.GLOBALLIST }
         * 
         * 
         */
        public List<OverrideInput.SOGL.GLOBALLIST> getGLOBALLIST() {
            if (globallist == null) {
                globallist = new ArrayList<OverrideInput.SOGL.GLOBALLIST>();
            }
            return this.globallist;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}GLOBAL_LIST_Type"&gt;
         *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" default="complete" /&gt;
         *       &lt;attribute name="nbKey" type="{http://www.w3.org/2001/XMLSchema}int" default="1" /&gt;
         *       &lt;attribute name="keyIndex" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GLOBALLIST
            extends GLOBALLISTType
            implements Serializable
        {

            @XmlAttribute(name = "mode")
            protected String mode;
            @XmlAttribute(name = "nbKey")
            protected Integer nbKey;
            @XmlAttribute(name = "keyIndex")
            protected String keyIndex;

            /**
             * Gets the value of the mode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMode() {
                if (mode == null) {
                    return "complete";
                } else {
                    return mode;
                }
            }

            /**
             * Sets the value of the mode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMode(String value) {
                this.mode = value;
            }

            /**
             * Gets the value of the nbKey property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getNbKey() {
                if (nbKey == null) {
                    return  1;
                } else {
                    return nbKey;
                }
            }

            /**
             * Sets the value of the nbKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNbKey(Integer value) {
                this.nbKey = value;
            }

            /**
             * Gets the value of the keyIndex property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyIndex() {
                return keyIndex;
            }

            /**
             * Sets the value of the keyIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyIndex(String value) {
                this.keyIndex = value;
            }

        }

    }

}
