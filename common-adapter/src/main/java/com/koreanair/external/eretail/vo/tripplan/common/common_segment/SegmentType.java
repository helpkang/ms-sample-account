
package com.koreanair.external.eretail.vo.tripplan.common.common_segment;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;


/**
 * <p>Java class for segmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_ID" type="{}SEGMENT_ID"/&gt;
 *         &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_TATTOO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="E_LOCATION" type="{}SEGMENT_LOCATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="B_LOCATION" type="{}SEGMENT_LOCATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABLE_CABIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="E_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="B_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="B_DAY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="E_DAY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="B_TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="E_TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="DAY_OF_WEEK" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_NUMBER" type="{}SEGMENT_FLIGHT_NUMBER" minOccurs="0"/&gt;
 *         &lt;element name="AIRLINE" type="{}AIRLINE_Type" minOccurs="0"/&gt;
 *         &lt;element name="OTHER_AIRLINE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{}SEGMENT_AIRLINE_NAME" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CHECK_IN_TIME" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAFFIC_RESTRICTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ON_TIME_PERFORMANCE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IRREGULARITY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OP_FLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ACCESS_LEVEL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="E_TICKETING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_TICKETLESSACCESS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER_OF_STOPS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_TIME" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_LEG" type="{}LIST_LEG_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_STATUS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="STATUS" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MEAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MEAL" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MEAL_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MILEAGE_INFORMATION" type="{}MILEAGE_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DISRUPTION_ASSOCIATION_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ENTERTAINMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENT_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TIME_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LAST_SEAT_AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CODE_SHARE_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SHUTTLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENT" minOccurs="0"&gt;
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
 *         &lt;element name="FARE_FAMILY" minOccurs="0"&gt;
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
 *         &lt;element name="LIST_CABIN" maxOccurs="4" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CABIN" type="{}SEGMENT_CABIN" minOccurs="0"/&gt;
 *                   &lt;element name="FARE_FAMILY" minOccurs="0"&gt;
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
 *                   &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="WAITLISTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_RBD" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RBD" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="AVAILABILITY_STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
 *         &lt;element name="SHOW_ECONOMY_RESTRICTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_FIRST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_BUSINESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_ECONOMY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_ECONOMY_RESTRICTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_FLOWN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BOOL_FLOWN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FLOWN_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ELIGIBILITY_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IS_ELIGIBLE_FOR_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_ELIGIBLE_FOR_REBOOK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="REASON_FOR_NON_EGIBILITY_FOR_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RBD_REQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CABIN_REQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SEGMENT_AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IS_FEEDER_FLIGHT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PRICE_FOR_UPGRADE_FOR_ALL_PAX_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="PRICE_FOR_UPGRADE_FOR_ALL_PAX_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_PRICE_FOR_UPGRADE_PER_TYPE_OF_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_PRICE_FOR_UPGRADE_PER_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
 *         &lt;element name="SELECTION_INFO_FOR_UPGRADE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IS_PRICE_SELECTED_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_PRICE_SELECTED_IN_EVOUCHERS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UPGRADE_CONF_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICES" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="SUBCODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMENT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TAX" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="APPLY_TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_PRICES" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="CURENCY" minOccurs="0"&gt;
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
 *                   &lt;element name="RULE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
 *         &lt;element name="AVAIL_DATA_SOURCE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="AIP"/&gt;
 *               &lt;enumeration value="AVD"/&gt;
 *               &lt;enumeration value="AVR"/&gt;
 *               &lt;enumeration value="IAC"/&gt;
 *               &lt;enumeration value="LCA"/&gt;
 *               &lt;enumeration value="NDR"/&gt;
 *               &lt;enumeration value="XXX"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FARE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEAT_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_IN_PROPERTIES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CHECK_IN"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ACCEPTANCE_PERIOD" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="BEGIN"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="END"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_PASSENGER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
 *         &lt;element name="LIST_CHECK_IN_PROPERTIES" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CHANNEL_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHECK_IN"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ACCEPTANCE_PERIOD" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="BEGIN"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="END"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="FLIGHT_ELIGIBILITY_STATUS" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                   &lt;element name="LIST_PASSENGER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHECK_IN_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="NB_SEATS" type="{}SEGMENT_NB_SEATS" minOccurs="0"/&gt;
 *         &lt;element name="PASSENGER_TICKETED_STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="IS_MARRIED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MARRIED_INFO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="IS_INFORMATIONAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INFORMATIVE_PRICE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="CURENCY" minOccurs="0"&gt;
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
 *         &lt;element name="IS_DIRECT_ACCESS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ASSOCIATED_PAX" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UPGRADE_STATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="UPGRADE"/&gt;
 *               &lt;enumeration value="NOT_UPGRADEABLE"/&gt;
 *               &lt;enumeration value="ALREADY_UPGRADED"/&gt;
 *               &lt;enumeration value="REVENUE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_FREE_TEXT" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ACTIVE_GDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_CONFIGURATION" type="{}FLIGHT_CONFIGURATION_type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FLIGHT_FACT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="FREETEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_INFLIGHT_SERVICES" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HAS_GOVT_APPROVAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_SEATMAP_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentType", propOrder = {
    "segmentid",
    "linenumber",
    "segmenttattoo",
    "elocation",
    "blocation",
    "availablecabin",
    "edate",
    "etime",
    "bdate",
    "btime",
    "bdayindicator",
    "edayindicator",
    "bterminal",
    "eterminal",
    "dayofweek",
    "flightnumber",
    "airline",
    "otherairline",
    "checkintime",
    "trafficrestriction",
    "ontimeperformance",
    "irregularity",
    "opflag",
    "accesslevel",
    "eticketing",
    "isticketlessaccess",
    "numberofstops",
    "flighttime",
    "listleg",
    "status",
    "liststatus",
    "meal",
    "listmeal",
    "mileageinformation",
    "listdisruptionassociationsegmentid",
    "entertainment",
    "equipmentchange",
    "timechange",
    "lastseatavailability",
    "codeshareindicator",
    "shuttle",
    "equipment",
    "farefamily",
    "listcabin",
    "showeconomyrestricted",
    "availabilityfirst",
    "availabilitybusiness",
    "availabilityeconomy",
    "availabilityeconomyrestricted",
    "segmentflown",
    "boolflown",
    "flownindicator",
    "eligibilityinformation",
    "selectioninfoforupgrade",
    "upgradeconfstatus",
    "services",
    "availdatasource",
    "farebasis",
    "faretype",
    "seatclass",
    "checkinproperties",
    "listcheckinproperties",
    "nbseats",
    "passengerticketedstatus",
    "ismarried",
    "marriedinfo",
    "isinformational",
    "recloc",
    "informativeprice",
    "isdirectaccess",
    "listassociatedpax",
    "upgradestate",
    "listfreetext",
    "activegds",
    "flightconfiguration",
    "listflightfact",
    "listinflightservices",
    "hasgovtapproval",
    "isseatmapavailable"
})
public class SegmentType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID", required = true)
    protected BigInteger segmentid;
    @XmlElement(name = "LINE_NUMBER")
    protected BigInteger linenumber;
    @XmlElement(name = "SEGMENT_TATTOO")
    protected BigInteger segmenttattoo;
    @XmlElement(name = "E_LOCATION")
    protected SEGMENTLOCATIONType elocation;
    @XmlElement(name = "B_LOCATION")
    protected SEGMENTLOCATIONType blocation;
    @XmlElement(name = "AVAILABLE_CABIN")
    protected String availablecabin;
    @XmlElement(name = "E_DATE")
    protected SegmentType.EDATE edate;
    @XmlElement(name = "E_TIME")
    protected String etime;
    @XmlElement(name = "B_DATE")
    protected SegmentType.BDATE bdate;
    @XmlElement(name = "B_TIME")
    protected String btime;
    @XmlElement(name = "B_DAY_INDICATOR")
    protected BigInteger bdayindicator;
    @XmlElement(name = "E_DAY_INDICATOR")
    protected BigInteger edayindicator;
    @XmlElement(name = "B_TERMINAL")
    protected String bterminal;
    @XmlElement(name = "E_TERMINAL")
    protected String eterminal;
    @XmlElement(name = "DAY_OF_WEEK")
    protected BigInteger dayofweek;
    @XmlElement(name = "FLIGHT_NUMBER")
    protected String flightnumber;
    @XmlElement(name = "AIRLINE")
    protected AIRLINEType airline;
    @XmlElement(name = "OTHER_AIRLINE")
    protected SegmentType.OTHERAIRLINE otherairline;
    @XmlElement(name = "CHECK_IN_TIME")
    protected SegmentType.CHECKINTIME checkintime;
    @XmlElement(name = "TRAFFIC_RESTRICTION")
    protected Boolean trafficrestriction;
    @XmlElement(name = "ON_TIME_PERFORMANCE")
    protected BigInteger ontimeperformance;
    @XmlElement(name = "IRREGULARITY")
    protected Boolean irregularity;
    @XmlElement(name = "OP_FLAG")
    protected Boolean opflag;
    @XmlElement(name = "ACCESS_LEVEL")
    protected String accesslevel;
    @XmlElement(name = "E_TICKETING")
    protected Boolean eticketing;
    @XmlElement(name = "IS_TICKETLESSACCESS")
    protected Boolean isticketlessaccess;
    @XmlElement(name = "NUMBER_OF_STOPS")
    protected BigInteger numberofstops;
    @XmlElement(name = "FLIGHT_TIME")
    protected BigInteger flighttime;
    @XmlElement(name = "LIST_LEG")
    protected List<LISTLEGType> listleg;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "LIST_STATUS")
    protected List<SegmentType.LISTSTATUS> liststatus;
    @XmlElement(name = "MEAL")
    protected Boolean meal;
    @XmlElement(name = "LIST_MEAL")
    protected List<SegmentType.LISTMEAL> listmeal;
    @XmlElement(name = "MILEAGE_INFORMATION")
    protected MILEAGEINFORMATIONType mileageinformation;
    @XmlElement(name = "LIST_DISRUPTION_ASSOCIATION_SEGMENT_ID")
    protected List<BigInteger> listdisruptionassociationsegmentid;
    @XmlElement(name = "ENTERTAINMENT")
    protected Boolean entertainment;
    @XmlElement(name = "EQUIPMENT_CHANGE")
    protected Boolean equipmentchange;
    @XmlElement(name = "TIME_CHANGE")
    protected Boolean timechange;
    @XmlElement(name = "LAST_SEAT_AVAILABILITY")
    protected Boolean lastseatavailability;
    @XmlElement(name = "CODE_SHARE_INDICATOR")
    protected String codeshareindicator;
    @XmlElement(name = "SHUTTLE")
    protected Boolean shuttle;
    @XmlElement(name = "EQUIPMENT")
    protected SegmentType.EQUIPMENT equipment;
    @XmlElement(name = "FARE_FAMILY")
    protected SegmentType.FAREFAMILY farefamily;
    @XmlElement(name = "LIST_CABIN")
    protected List<SegmentType.LISTCABIN> listcabin;
    @XmlElement(name = "SHOW_ECONOMY_RESTRICTED")
    protected String showeconomyrestricted;
    @XmlElement(name = "AVAILABILITY_FIRST")
    protected String availabilityfirst;
    @XmlElement(name = "AVAILABILITY_BUSINESS")
    protected String availabilitybusiness;
    @XmlElement(name = "AVAILABILITY_ECONOMY")
    protected String availabilityeconomy;
    @XmlElement(name = "AVAILABILITY_ECONOMY_RESTRICTED")
    protected String availabilityeconomyrestricted;
    @XmlElement(name = "SEGMENT_FLOWN")
    protected Boolean segmentflown;
    @XmlElement(name = "BOOL_FLOWN")
    protected Boolean boolflown;
    @XmlElement(name = "FLOWN_INDICATOR")
    protected Boolean flownindicator;
    @XmlElement(name = "ELIGIBILITY_INFORMATION")
    protected SegmentType.ELIGIBILITYINFORMATION eligibilityinformation;
    @XmlElement(name = "SELECTION_INFO_FOR_UPGRADE")
    protected SegmentType.SELECTIONINFOFORUPGRADE selectioninfoforupgrade;
    @XmlElement(name = "UPGRADE_CONF_STATUS")
    protected String upgradeconfstatus;
    @XmlElement(name = "SERVICES")
    protected List<SegmentType.SERVICES> services;
    @XmlElement(name = "AVAIL_DATA_SOURCE")
    protected String availdatasource;
    @XmlElement(name = "FARE_BASIS")
    protected String farebasis;
    @XmlElement(name = "FARE_TYPE")
    protected String faretype;
    @XmlElement(name = "SEAT_CLASS")
    protected String seatclass;
    @XmlElement(name = "CHECK_IN_PROPERTIES")
    protected SegmentType.CHECKINPROPERTIES checkinproperties;
    @XmlElement(name = "LIST_CHECK_IN_PROPERTIES")
    protected List<SegmentType.LISTCHECKINPROPERTIES> listcheckinproperties;
    @XmlElement(name = "NB_SEATS")
    protected BigInteger nbseats;
    @XmlElement(name = "PASSENGER_TICKETED_STATUS")
    protected String passengerticketedstatus;
    @XmlElement(name = "IS_MARRIED")
    protected Boolean ismarried;
    @XmlElement(name = "MARRIED_INFO")
    protected String marriedinfo;
    @XmlElement(name = "IS_INFORMATIONAL")
    protected Boolean isinformational;
    @XmlElement(name = "REC_LOC")
    protected String recloc;
    @XmlElement(name = "INFORMATIVE_PRICE")
    protected SegmentType.INFORMATIVEPRICE informativeprice;
    @XmlElement(name = "IS_DIRECT_ACCESS")
    protected Boolean isdirectaccess;
    @XmlElement(name = "LIST_ASSOCIATED_PAX")
    protected List<Object> listassociatedpax;
    @XmlElement(name = "UPGRADE_STATE")
    protected String upgradestate;
    @XmlElement(name = "LIST_FREE_TEXT")
    protected List<String> listfreetext;
    @XmlElement(name = "ACTIVE_GDS")
    protected String activegds;
    @XmlElement(name = "FLIGHT_CONFIGURATION")
    protected FLIGHTCONFIGURATIONType flightconfiguration;
    @XmlElement(name = "LIST_FLIGHT_FACT")
    protected List<SegmentType.LISTFLIGHTFACT> listflightfact;
    @XmlElement(name = "LIST_INFLIGHT_SERVICES")
    protected List<CodeDescriptorType> listinflightservices;
    @XmlElement(name = "HAS_GOVT_APPROVAL")
    protected Boolean hasgovtapproval;
    @XmlElement(name = "IS_SEATMAP_AVAILABLE")
    protected Boolean isseatmapavailable;

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTID(BigInteger value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLINENUMBER(BigInteger value) {
        this.linenumber = value;
    }

    /**
     * Gets the value of the segmenttattoo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTTATTOO() {
        return segmenttattoo;
    }

    /**
     * Sets the value of the segmenttattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTTATTOO(BigInteger value) {
        this.segmenttattoo = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link SEGMENTLOCATIONType }
     *     
     */
    public SEGMENTLOCATIONType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEGMENTLOCATIONType }
     *     
     */
    public void setELOCATION(SEGMENTLOCATIONType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link SEGMENTLOCATIONType }
     *     
     */
    public SEGMENTLOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEGMENTLOCATIONType }
     *     
     */
    public void setBLOCATION(SEGMENTLOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the availablecabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABLECABIN() {
        return availablecabin;
    }

    /**
     * Sets the value of the availablecabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABLECABIN(String value) {
        this.availablecabin = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.EDATE }
     *     
     */
    public SegmentType.EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.EDATE }
     *     
     */
    public void setEDATE(SegmentType.EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the etime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETIME() {
        return etime;
    }

    /**
     * Sets the value of the etime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETIME(String value) {
        this.etime = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.BDATE }
     *     
     */
    public SegmentType.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.BDATE }
     *     
     */
    public void setBDATE(SegmentType.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the btime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTIME() {
        return btime;
    }

    /**
     * Sets the value of the btime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTIME(String value) {
        this.btime = value;
    }

    /**
     * Gets the value of the bdayindicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBDAYINDICATOR() {
        return bdayindicator;
    }

    /**
     * Sets the value of the bdayindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBDAYINDICATOR(BigInteger value) {
        this.bdayindicator = value;
    }

    /**
     * Gets the value of the edayindicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEDAYINDICATOR() {
        return edayindicator;
    }

    /**
     * Sets the value of the edayindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEDAYINDICATOR(BigInteger value) {
        this.edayindicator = value;
    }

    /**
     * Gets the value of the bterminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTERMINAL() {
        return bterminal;
    }

    /**
     * Sets the value of the bterminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTERMINAL(String value) {
        this.bterminal = value;
    }

    /**
     * Gets the value of the eterminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETERMINAL() {
        return eterminal;
    }

    /**
     * Sets the value of the eterminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETERMINAL(String value) {
        this.eterminal = value;
    }

    /**
     * Gets the value of the dayofweek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDAYOFWEEK() {
        return dayofweek;
    }

    /**
     * Sets the value of the dayofweek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDAYOFWEEK(BigInteger value) {
        this.dayofweek = value;
    }

    /**
     * Gets the value of the flightnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTNUMBER() {
        return flightnumber;
    }

    /**
     * Sets the value of the flightnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTNUMBER(String value) {
        this.flightnumber = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link AIRLINEType }
     *     
     */
    public AIRLINEType getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRLINEType }
     *     
     */
    public void setAIRLINE(AIRLINEType value) {
        this.airline = value;
    }

    /**
     * Gets the value of the otherairline property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.OTHERAIRLINE }
     *     
     */
    public SegmentType.OTHERAIRLINE getOTHERAIRLINE() {
        return otherairline;
    }

    /**
     * Sets the value of the otherairline property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.OTHERAIRLINE }
     *     
     */
    public void setOTHERAIRLINE(SegmentType.OTHERAIRLINE value) {
        this.otherairline = value;
    }

    /**
     * Gets the value of the checkintime property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.CHECKINTIME }
     *     
     */
    public SegmentType.CHECKINTIME getCHECKINTIME() {
        return checkintime;
    }

    /**
     * Sets the value of the checkintime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.CHECKINTIME }
     *     
     */
    public void setCHECKINTIME(SegmentType.CHECKINTIME value) {
        this.checkintime = value;
    }

    /**
     * Gets the value of the trafficrestriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTRAFFICRESTRICTION() {
        return trafficrestriction;
    }

    /**
     * Sets the value of the trafficrestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTRAFFICRESTRICTION(Boolean value) {
        this.trafficrestriction = value;
    }

    /**
     * Gets the value of the ontimeperformance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getONTIMEPERFORMANCE() {
        return ontimeperformance;
    }

    /**
     * Sets the value of the ontimeperformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setONTIMEPERFORMANCE(BigInteger value) {
        this.ontimeperformance = value;
    }

    /**
     * Gets the value of the irregularity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIRREGULARITY() {
        return irregularity;
    }

    /**
     * Sets the value of the irregularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIRREGULARITY(Boolean value) {
        this.irregularity = value;
    }

    /**
     * Gets the value of the opflag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOPFLAG() {
        return opflag;
    }

    /**
     * Sets the value of the opflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOPFLAG(Boolean value) {
        this.opflag = value;
    }

    /**
     * Gets the value of the accesslevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSLEVEL() {
        return accesslevel;
    }

    /**
     * Sets the value of the accesslevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCESSLEVEL(String value) {
        this.accesslevel = value;
    }

    /**
     * Gets the value of the eticketing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isETICKETING() {
        return eticketing;
    }

    /**
     * Sets the value of the eticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETICKETING(Boolean value) {
        this.eticketing = value;
    }

    /**
     * Gets the value of the isticketlessaccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISTICKETLESSACCESS() {
        return isticketlessaccess;
    }

    /**
     * Sets the value of the isticketlessaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISTICKETLESSACCESS(Boolean value) {
        this.isticketlessaccess = value;
    }

    /**
     * Gets the value of the numberofstops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFSTOPS() {
        return numberofstops;
    }

    /**
     * Sets the value of the numberofstops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFSTOPS(BigInteger value) {
        this.numberofstops = value;
    }

    /**
     * Gets the value of the flighttime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFLIGHTTIME() {
        return flighttime;
    }

    /**
     * Sets the value of the flighttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFLIGHTTIME(BigInteger value) {
        this.flighttime = value;
    }

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
     * {@link LISTLEGType }
     * 
     * 
     */
    public List<LISTLEGType> getLISTLEG() {
        if (listleg == null) {
            listleg = new ArrayList<LISTLEGType>();
        }
        return this.listleg;
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
     * Gets the value of the liststatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTATUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentType.LISTSTATUS }
     * 
     * 
     */
    public List<SegmentType.LISTSTATUS> getLISTSTATUS() {
        if (liststatus == null) {
            liststatus = new ArrayList<SegmentType.LISTSTATUS>();
        }
        return this.liststatus;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMEAL() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMEAL(Boolean value) {
        this.meal = value;
    }

    /**
     * Gets the value of the listmeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMEAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentType.LISTMEAL }
     * 
     * 
     */
    public List<SegmentType.LISTMEAL> getLISTMEAL() {
        if (listmeal == null) {
            listmeal = new ArrayList<SegmentType.LISTMEAL>();
        }
        return this.listmeal;
    }

    /**
     * Gets the value of the mileageinformation property.
     * 
     * @return
     *     possible object is
     *     {@link MILEAGEINFORMATIONType }
     *     
     */
    public MILEAGEINFORMATIONType getMILEAGEINFORMATION() {
        return mileageinformation;
    }

    /**
     * Sets the value of the mileageinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILEAGEINFORMATIONType }
     *     
     */
    public void setMILEAGEINFORMATION(MILEAGEINFORMATIONType value) {
        this.mileageinformation = value;
    }

    /**
     * Gets the value of the listdisruptionassociationsegmentid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdisruptionassociationsegmentid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISRUPTIONASSOCIATIONSEGMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTDISRUPTIONASSOCIATIONSEGMENTID() {
        if (listdisruptionassociationsegmentid == null) {
            listdisruptionassociationsegmentid = new ArrayList<BigInteger>();
        }
        return this.listdisruptionassociationsegmentid;
    }

    /**
     * Gets the value of the entertainment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isENTERTAINMENT() {
        return entertainment;
    }

    /**
     * Sets the value of the entertainment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setENTERTAINMENT(Boolean value) {
        this.entertainment = value;
    }

    /**
     * Gets the value of the equipmentchange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEQUIPMENTCHANGE() {
        return equipmentchange;
    }

    /**
     * Sets the value of the equipmentchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEQUIPMENTCHANGE(Boolean value) {
        this.equipmentchange = value;
    }

    /**
     * Gets the value of the timechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTIMECHANGE() {
        return timechange;
    }

    /**
     * Sets the value of the timechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTIMECHANGE(Boolean value) {
        this.timechange = value;
    }

    /**
     * Gets the value of the lastseatavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLASTSEATAVAILABILITY() {
        return lastseatavailability;
    }

    /**
     * Sets the value of the lastseatavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLASTSEATAVAILABILITY(Boolean value) {
        this.lastseatavailability = value;
    }

    /**
     * Gets the value of the codeshareindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESHAREINDICATOR() {
        return codeshareindicator;
    }

    /**
     * Sets the value of the codeshareindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESHAREINDICATOR(String value) {
        this.codeshareindicator = value;
    }

    /**
     * Gets the value of the shuttle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSHUTTLE() {
        return shuttle;
    }

    /**
     * Sets the value of the shuttle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSHUTTLE(Boolean value) {
        this.shuttle = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.EQUIPMENT }
     *     
     */
    public SegmentType.EQUIPMENT getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.EQUIPMENT }
     *     
     */
    public void setEQUIPMENT(SegmentType.EQUIPMENT value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.FAREFAMILY }
     *     
     */
    public SegmentType.FAREFAMILY getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.FAREFAMILY }
     *     
     */
    public void setFAREFAMILY(SegmentType.FAREFAMILY value) {
        this.farefamily = value;
    }

    /**
     * Gets the value of the listcabin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcabin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCABIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentType.LISTCABIN }
     * 
     * 
     */
    public List<SegmentType.LISTCABIN> getLISTCABIN() {
        if (listcabin == null) {
            listcabin = new ArrayList<SegmentType.LISTCABIN>();
        }
        return this.listcabin;
    }

    /**
     * Gets the value of the showeconomyrestricted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHOWECONOMYRESTRICTED() {
        return showeconomyrestricted;
    }

    /**
     * Sets the value of the showeconomyrestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHOWECONOMYRESTRICTED(String value) {
        this.showeconomyrestricted = value;
    }

    /**
     * Gets the value of the availabilityfirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYFIRST() {
        return availabilityfirst;
    }

    /**
     * Sets the value of the availabilityfirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYFIRST(String value) {
        this.availabilityfirst = value;
    }

    /**
     * Gets the value of the availabilitybusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYBUSINESS() {
        return availabilitybusiness;
    }

    /**
     * Sets the value of the availabilitybusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYBUSINESS(String value) {
        this.availabilitybusiness = value;
    }

    /**
     * Gets the value of the availabilityeconomy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYECONOMY() {
        return availabilityeconomy;
    }

    /**
     * Sets the value of the availabilityeconomy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYECONOMY(String value) {
        this.availabilityeconomy = value;
    }

    /**
     * Gets the value of the availabilityeconomyrestricted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYECONOMYRESTRICTED() {
        return availabilityeconomyrestricted;
    }

    /**
     * Sets the value of the availabilityeconomyrestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYECONOMYRESTRICTED(String value) {
        this.availabilityeconomyrestricted = value;
    }

    /**
     * Gets the value of the segmentflown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSEGMENTFLOWN() {
        return segmentflown;
    }

    /**
     * Sets the value of the segmentflown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSEGMENTFLOWN(Boolean value) {
        this.segmentflown = value;
    }

    /**
     * Gets the value of the boolflown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLFLOWN() {
        return boolflown;
    }

    /**
     * Sets the value of the boolflown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLFLOWN(Boolean value) {
        this.boolflown = value;
    }

    /**
     * Gets the value of the flownindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFLOWNINDICATOR() {
        return flownindicator;
    }

    /**
     * Sets the value of the flownindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFLOWNINDICATOR(Boolean value) {
        this.flownindicator = value;
    }

    /**
     * Gets the value of the eligibilityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.ELIGIBILITYINFORMATION }
     *     
     */
    public SegmentType.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
        return eligibilityinformation;
    }

    /**
     * Sets the value of the eligibilityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.ELIGIBILITYINFORMATION }
     *     
     */
    public void setELIGIBILITYINFORMATION(SegmentType.ELIGIBILITYINFORMATION value) {
        this.eligibilityinformation = value;
    }

    /**
     * Gets the value of the selectioninfoforupgrade property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.SELECTIONINFOFORUPGRADE }
     *     
     */
    public SegmentType.SELECTIONINFOFORUPGRADE getSELECTIONINFOFORUPGRADE() {
        return selectioninfoforupgrade;
    }

    /**
     * Sets the value of the selectioninfoforupgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.SELECTIONINFOFORUPGRADE }
     *     
     */
    public void setSELECTIONINFOFORUPGRADE(SegmentType.SELECTIONINFOFORUPGRADE value) {
        this.selectioninfoforupgrade = value;
    }

    /**
     * Gets the value of the upgradeconfstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPGRADECONFSTATUS() {
        return upgradeconfstatus;
    }

    /**
     * Sets the value of the upgradeconfstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPGRADECONFSTATUS(String value) {
        this.upgradeconfstatus = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSERVICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentType.SERVICES }
     * 
     * 
     */
    public List<SegmentType.SERVICES> getSERVICES() {
        if (services == null) {
            services = new ArrayList<SegmentType.SERVICES>();
        }
        return this.services;
    }

    /**
     * Gets the value of the availdatasource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILDATASOURCE() {
        return availdatasource;
    }

    /**
     * Sets the value of the availdatasource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILDATASOURCE(String value) {
        this.availdatasource = value;
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
     * Gets the value of the faretype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARETYPE() {
        return faretype;
    }

    /**
     * Sets the value of the faretype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARETYPE(String value) {
        this.faretype = value;
    }

    /**
     * Gets the value of the seatclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEATCLASS() {
        return seatclass;
    }

    /**
     * Sets the value of the seatclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEATCLASS(String value) {
        this.seatclass = value;
    }

    /**
     * Gets the value of the checkinproperties property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.CHECKINPROPERTIES }
     *     
     */
    public SegmentType.CHECKINPROPERTIES getCHECKINPROPERTIES() {
        return checkinproperties;
    }

    /**
     * Sets the value of the checkinproperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.CHECKINPROPERTIES }
     *     
     */
    public void setCHECKINPROPERTIES(SegmentType.CHECKINPROPERTIES value) {
        this.checkinproperties = value;
    }

    /**
     * Gets the value of the listcheckinproperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcheckinproperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCHECKINPROPERTIES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentType.LISTCHECKINPROPERTIES }
     * 
     * 
     */
    public List<SegmentType.LISTCHECKINPROPERTIES> getLISTCHECKINPROPERTIES() {
        if (listcheckinproperties == null) {
            listcheckinproperties = new ArrayList<SegmentType.LISTCHECKINPROPERTIES>();
        }
        return this.listcheckinproperties;
    }

    /**
     * Gets the value of the nbseats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBSEATS() {
        return nbseats;
    }

    /**
     * Sets the value of the nbseats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBSEATS(BigInteger value) {
        this.nbseats = value;
    }

    /**
     * Gets the value of the passengerticketedstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSENGERTICKETEDSTATUS() {
        return passengerticketedstatus;
    }

    /**
     * Sets the value of the passengerticketedstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSENGERTICKETEDSTATUS(String value) {
        this.passengerticketedstatus = value;
    }

    /**
     * Gets the value of the ismarried property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISMARRIED() {
        return ismarried;
    }

    /**
     * Sets the value of the ismarried property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISMARRIED(Boolean value) {
        this.ismarried = value;
    }

    /**
     * Gets the value of the marriedinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARRIEDINFO() {
        return marriedinfo;
    }

    /**
     * Sets the value of the marriedinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARRIEDINFO(String value) {
        this.marriedinfo = value;
    }

    /**
     * Gets the value of the isinformational property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISINFORMATIONAL() {
        return isinformational;
    }

    /**
     * Sets the value of the isinformational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISINFORMATIONAL(Boolean value) {
        this.isinformational = value;
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
     * Gets the value of the informativeprice property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.INFORMATIVEPRICE }
     *     
     */
    public SegmentType.INFORMATIVEPRICE getINFORMATIVEPRICE() {
        return informativeprice;
    }

    /**
     * Sets the value of the informativeprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.INFORMATIVEPRICE }
     *     
     */
    public void setINFORMATIVEPRICE(SegmentType.INFORMATIVEPRICE value) {
        this.informativeprice = value;
    }

    /**
     * Gets the value of the isdirectaccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISDIRECTACCESS() {
        return isdirectaccess;
    }

    /**
     * Sets the value of the isdirectaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISDIRECTACCESS(Boolean value) {
        this.isdirectaccess = value;
    }

    /**
     * Gets the value of the listassociatedpax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listassociatedpax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTASSOCIATEDPAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLISTASSOCIATEDPAX() {
        if (listassociatedpax == null) {
            listassociatedpax = new ArrayList<Object>();
        }
        return this.listassociatedpax;
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
     * Gets the value of the listfreetext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfreetext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFREETEXT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFREETEXT() {
        if (listfreetext == null) {
            listfreetext = new ArrayList<String>();
        }
        return this.listfreetext;
    }

    /**
     * Gets the value of the activegds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVEGDS() {
        return activegds;
    }

    /**
     * Sets the value of the activegds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVEGDS(String value) {
        this.activegds = value;
    }

    /**
     * Gets the value of the flightconfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link FLIGHTCONFIGURATIONType }
     *     
     */
    public FLIGHTCONFIGURATIONType getFLIGHTCONFIGURATION() {
        return flightconfiguration;
    }

    /**
     * Sets the value of the flightconfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLIGHTCONFIGURATIONType }
     *     
     */
    public void setFLIGHTCONFIGURATION(FLIGHTCONFIGURATIONType value) {
        this.flightconfiguration = value;
    }

    /**
     * Gets the value of the listflightfact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflightfact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHTFACT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentType.LISTFLIGHTFACT }
     * 
     * 
     */
    public List<SegmentType.LISTFLIGHTFACT> getLISTFLIGHTFACT() {
        if (listflightfact == null) {
            listflightfact = new ArrayList<SegmentType.LISTFLIGHTFACT>();
        }
        return this.listflightfact;
    }

    /**
     * Gets the value of the listinflightservices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listinflightservices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINFLIGHTSERVICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescriptorType }
     * 
     * 
     */
    public List<CodeDescriptorType> getLISTINFLIGHTSERVICES() {
        if (listinflightservices == null) {
            listinflightservices = new ArrayList<CodeDescriptorType>();
        }
        return this.listinflightservices;
    }

    /**
     * Gets the value of the hasgovtapproval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHASGOVTAPPROVAL() {
        return hasgovtapproval;
    }

    /**
     * Sets the value of the hasgovtapproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHASGOVTAPPROVAL(Boolean value) {
        this.hasgovtapproval = value;
    }

    /**
     * Gets the value of the isseatmapavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISSEATMAPAVAILABLE() {
        return isseatmapavailable;
    }

    /**
     * Sets the value of the isseatmapavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISSEATMAPAVAILABLE(Boolean value) {
        this.isseatmapavailable = value;
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
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
        @XmlAttribute(name = "code")
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
     *         &lt;element name="CHECK_IN"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACCEPTANCE_PERIOD" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="BEGIN"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="END"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_PASSENGER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "checkin",
        "listpassenger"
    })
    public static class CHECKINPROPERTIES
        implements Serializable
    {

        @XmlElement(name = "CHECK_IN", required = true)
        protected SegmentType.CHECKINPROPERTIES.CHECKIN checkin;
        @XmlElement(name = "LIST_PASSENGER")
        protected List<SegmentType.CHECKINPROPERTIES.LISTPASSENGER> listpassenger;

        /**
         * Gets the value of the checkin property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentType.CHECKINPROPERTIES.CHECKIN }
         *     
         */
        public SegmentType.CHECKINPROPERTIES.CHECKIN getCHECKIN() {
            return checkin;
        }

        /**
         * Sets the value of the checkin property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentType.CHECKINPROPERTIES.CHECKIN }
         *     
         */
        public void setCHECKIN(SegmentType.CHECKINPROPERTIES.CHECKIN value) {
            this.checkin = value;
        }

        /**
         * Gets the value of the listpassenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpassenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPASSENGER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentType.CHECKINPROPERTIES.LISTPASSENGER }
         * 
         * 
         */
        public List<SegmentType.CHECKINPROPERTIES.LISTPASSENGER> getLISTPASSENGER() {
            if (listpassenger == null) {
                listpassenger = new ArrayList<SegmentType.CHECKINPROPERTIES.LISTPASSENGER>();
            }
            return this.listpassenger;
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
         *         &lt;element name="ACCEPTANCE_PERIOD" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="BEGIN"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="END"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
            "acceptanceperiod",
            "statuscode"
        })
        public static class CHECKIN
            implements Serializable
        {

            @XmlElement(name = "ACCEPTANCE_PERIOD")
            protected SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD acceptanceperiod;
            @XmlElement(name = "STATUS_CODE", required = true)
            protected BigInteger statuscode;

            /**
             * Gets the value of the acceptanceperiod property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD }
             *     
             */
            public SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD getACCEPTANCEPERIOD() {
                return acceptanceperiod;
            }

            /**
             * Sets the value of the acceptanceperiod property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD }
             *     
             */
            public void setACCEPTANCEPERIOD(SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD value) {
                this.acceptanceperiod = value;
            }

            /**
             * Gets the value of the statuscode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSTATUSCODE() {
                return statuscode;
            }

            /**
             * Sets the value of the statuscode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSTATUSCODE(BigInteger value) {
                this.statuscode = value;
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
             *         &lt;element name="BEGIN"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="END"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
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
                "begin",
                "end"
            })
            public static class ACCEPTANCEPERIOD
                implements Serializable
            {

                @XmlElement(name = "BEGIN", required = true)
                protected SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN begin;
                @XmlElement(name = "END", required = true)
                protected SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END end;

                /**
                 * Gets the value of the begin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN }
                 *     
                 */
                public SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN getBEGIN() {
                    return begin;
                }

                /**
                 * Sets the value of the begin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN }
                 *     
                 */
                public void setBEGIN(SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN value) {
                    this.begin = value;
                }

                /**
                 * Gets the value of the end property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END }
                 *     
                 */
                public SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END getEND() {
                    return end;
                }

                /**
                 * Sets the value of the end property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END }
                 *     
                 */
                public void setEND(SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END value) {
                    this.end = value;
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
                public static class BEGIN
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
                public static class END
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
         *         &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
            "eligibilitystatus"
        })
        public static class LISTPASSENGER
            implements Serializable
        {

            @XmlElement(name = "TRAVELER_ID", required = true)
            protected BigInteger travelerid;
            @XmlElement(name = "ELIGIBILITY_STATUS", required = true)
            protected BigInteger eligibilitystatus;

            /**
             * Gets the value of the travelerid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTRAVELERID() {
                return travelerid;
            }

            /**
             * Sets the value of the travelerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTRAVELERID(BigInteger value) {
                this.travelerid = value;
            }

            /**
             * Gets the value of the eligibilitystatus property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getELIGIBILITYSTATUS() {
                return eligibilitystatus;
            }

            /**
             * Sets the value of the eligibilitystatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setELIGIBILITYSTATUS(BigInteger value) {
                this.eligibilitystatus = value;
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
    public static class CHECKINTIME
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
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
        @XmlAttribute(name = "code")
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
     *         &lt;element name="IS_ELIGIBLE_FOR_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_ELIGIBLE_FOR_REBOOK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="REASON_FOR_NON_EGIBILITY_FOR_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RBD_REQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CABIN_REQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SEGMENT_AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IS_FEEDER_FLIGHT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PRICE_FOR_UPGRADE_FOR_ALL_PAX_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="PRICE_FOR_UPGRADE_FOR_ALL_PAX_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LIST_PRICE_FOR_UPGRADE_PER_TYPE_OF_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_PRICE_FOR_UPGRADE_PER_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "iseligibleforupgrade",
        "iseligibleforrebook",
        "reasonfornonegibilityforupgrade",
        "rbdreq",
        "cabinreq",
        "segmentarea",
        "isfeederflight",
        "priceforupgradeforallpaxinvouchers",
        "priceforupgradeforallpaxinmiles",
        "listpriceforupgradepertypeofpax",
        "listpriceforupgradeperpax"
    })
    public static class ELIGIBILITYINFORMATION
        implements Serializable
    {

        @XmlElement(name = "IS_ELIGIBLE_FOR_UPGRADE")
        protected Boolean iseligibleforupgrade;
        @XmlElement(name = "IS_ELIGIBLE_FOR_REBOOK")
        protected Boolean iseligibleforrebook;
        @XmlElement(name = "REASON_FOR_NON_EGIBILITY_FOR_UPGRADE")
        protected String reasonfornonegibilityforupgrade;
        @XmlElement(name = "RBD_REQ")
        protected String rbdreq;
        @XmlElement(name = "CABIN_REQ")
        protected String cabinreq;
        @XmlElement(name = "SEGMENT_AREA")
        protected String segmentarea;
        @XmlElement(name = "IS_FEEDER_FLIGHT")
        protected Boolean isfeederflight;
        @XmlElement(name = "PRICE_FOR_UPGRADE_FOR_ALL_PAX_IN_VOUCHERS")
        protected BigInteger priceforupgradeforallpaxinvouchers;
        @XmlElement(name = "PRICE_FOR_UPGRADE_FOR_ALL_PAX_IN_MILES")
        protected BigInteger priceforupgradeforallpaxinmiles;
        @XmlElement(name = "LIST_PRICE_FOR_UPGRADE_PER_TYPE_OF_PAX")
        protected List<SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERTYPEOFPAX> listpriceforupgradepertypeofpax;
        @XmlElement(name = "LIST_PRICE_FOR_UPGRADE_PER_PAX")
        protected List<SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERPAX> listpriceforupgradeperpax;

        /**
         * Gets the value of the iseligibleforupgrade property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISELIGIBLEFORUPGRADE() {
            return iseligibleforupgrade;
        }

        /**
         * Sets the value of the iseligibleforupgrade property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISELIGIBLEFORUPGRADE(Boolean value) {
            this.iseligibleforupgrade = value;
        }

        /**
         * Gets the value of the iseligibleforrebook property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISELIGIBLEFORREBOOK() {
            return iseligibleforrebook;
        }

        /**
         * Sets the value of the iseligibleforrebook property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISELIGIBLEFORREBOOK(Boolean value) {
            this.iseligibleforrebook = value;
        }

        /**
         * Gets the value of the reasonfornonegibilityforupgrade property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREASONFORNONEGIBILITYFORUPGRADE() {
            return reasonfornonegibilityforupgrade;
        }

        /**
         * Sets the value of the reasonfornonegibilityforupgrade property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREASONFORNONEGIBILITYFORUPGRADE(String value) {
            this.reasonfornonegibilityforupgrade = value;
        }

        /**
         * Gets the value of the rbdreq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRBDREQ() {
            return rbdreq;
        }

        /**
         * Sets the value of the rbdreq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRBDREQ(String value) {
            this.rbdreq = value;
        }

        /**
         * Gets the value of the cabinreq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCABINREQ() {
            return cabinreq;
        }

        /**
         * Sets the value of the cabinreq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCABINREQ(String value) {
            this.cabinreq = value;
        }

        /**
         * Gets the value of the segmentarea property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEGMENTAREA() {
            return segmentarea;
        }

        /**
         * Sets the value of the segmentarea property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEGMENTAREA(String value) {
            this.segmentarea = value;
        }

        /**
         * Gets the value of the isfeederflight property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISFEEDERFLIGHT() {
            return isfeederflight;
        }

        /**
         * Sets the value of the isfeederflight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISFEEDERFLIGHT(Boolean value) {
            this.isfeederflight = value;
        }

        /**
         * Gets the value of the priceforupgradeforallpaxinvouchers property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPRICEFORUPGRADEFORALLPAXINVOUCHERS() {
            return priceforupgradeforallpaxinvouchers;
        }

        /**
         * Sets the value of the priceforupgradeforallpaxinvouchers property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPRICEFORUPGRADEFORALLPAXINVOUCHERS(BigInteger value) {
            this.priceforupgradeforallpaxinvouchers = value;
        }

        /**
         * Gets the value of the priceforupgradeforallpaxinmiles property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPRICEFORUPGRADEFORALLPAXINMILES() {
            return priceforupgradeforallpaxinmiles;
        }

        /**
         * Sets the value of the priceforupgradeforallpaxinmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPRICEFORUPGRADEFORALLPAXINMILES(BigInteger value) {
            this.priceforupgradeforallpaxinmiles = value;
        }

        /**
         * Gets the value of the listpriceforupgradepertypeofpax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpriceforupgradepertypeofpax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPRICEFORUPGRADEPERTYPEOFPAX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERTYPEOFPAX }
         * 
         * 
         */
        public List<SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERTYPEOFPAX> getLISTPRICEFORUPGRADEPERTYPEOFPAX() {
            if (listpriceforupgradepertypeofpax == null) {
                listpriceforupgradepertypeofpax = new ArrayList<SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERTYPEOFPAX>();
            }
            return this.listpriceforupgradepertypeofpax;
        }

        /**
         * Gets the value of the listpriceforupgradeperpax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpriceforupgradeperpax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPRICEFORUPGRADEPERPAX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERPAX }
         * 
         * 
         */
        public List<SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERPAX> getLISTPRICEFORUPGRADEPERPAX() {
            if (listpriceforupgradeperpax == null) {
                listpriceforupgradeperpax = new ArrayList<SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERPAX>();
            }
            return this.listpriceforupgradeperpax;
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
         *         &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
            "travellertype",
            "priceforupgradeinvouchers",
            "priceforupgradeinmiles"
        })
        public static class LISTPRICEFORUPGRADEPERPAX
            implements Serializable
        {

            @XmlElement(name = "TRAVELLER_ID", required = true)
            protected BigInteger travellerid;
            @XmlElement(name = "TRAVELLER_TYPE", required = true)
            protected String travellertype;
            @XmlElement(name = "PRICE_FOR_UPGRADE_IN_VOUCHERS")
            protected BigInteger priceforupgradeinvouchers;
            @XmlElement(name = "PRICE_FOR_UPGRADE_IN_MILES")
            protected BigInteger priceforupgradeinmiles;

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
             * Gets the value of the priceforupgradeinvouchers property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPRICEFORUPGRADEINVOUCHERS() {
                return priceforupgradeinvouchers;
            }

            /**
             * Sets the value of the priceforupgradeinvouchers property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPRICEFORUPGRADEINVOUCHERS(BigInteger value) {
                this.priceforupgradeinvouchers = value;
            }

            /**
             * Gets the value of the priceforupgradeinmiles property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPRICEFORUPGRADEINMILES() {
                return priceforupgradeinmiles;
            }

            /**
             * Sets the value of the priceforupgradeinmiles property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPRICEFORUPGRADEINMILES(BigInteger value) {
                this.priceforupgradeinmiles = value;
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
         *         &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
            "travellertype",
            "priceforupgradeinvouchers",
            "priceforupgradeinmiles"
        })
        public static class LISTPRICEFORUPGRADEPERTYPEOFPAX
            implements Serializable
        {

            @XmlElement(name = "TRAVELLER_TYPE", required = true)
            protected String travellertype;
            @XmlElement(name = "PRICE_FOR_UPGRADE_IN_VOUCHERS")
            protected BigInteger priceforupgradeinvouchers;
            @XmlElement(name = "PRICE_FOR_UPGRADE_IN_MILES")
            protected BigInteger priceforupgradeinmiles;

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
             * Gets the value of the priceforupgradeinvouchers property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPRICEFORUPGRADEINVOUCHERS() {
                return priceforupgradeinvouchers;
            }

            /**
             * Sets the value of the priceforupgradeinvouchers property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPRICEFORUPGRADEINVOUCHERS(BigInteger value) {
                this.priceforupgradeinvouchers = value;
            }

            /**
             * Gets the value of the priceforupgradeinmiles property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPRICEFORUPGRADEINMILES() {
                return priceforupgradeinmiles;
            }

            /**
             * Sets the value of the priceforupgradeinmiles property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPRICEFORUPGRADEINMILES(BigInteger value) {
                this.priceforupgradeinmiles = value;
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
    public static class EQUIPMENT
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
    public static class FAREFAMILY
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
     *         &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="CURENCY" minOccurs="0"&gt;
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
        "amount",
        "curency"
    })
    public static class INFORMATIVEPRICE
        implements Serializable
    {

        @XmlElement(name = "AMOUNT")
        protected String amount;
        @XmlElement(name = "CURENCY")
        protected SegmentType.INFORMATIVEPRICE.CURENCY curency;

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
         * Gets the value of the curency property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentType.INFORMATIVEPRICE.CURENCY }
         *     
         */
        public SegmentType.INFORMATIVEPRICE.CURENCY getCURENCY() {
            return curency;
        }

        /**
         * Sets the value of the curency property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentType.INFORMATIVEPRICE.CURENCY }
         *     
         */
        public void setCURENCY(SegmentType.INFORMATIVEPRICE.CURENCY value) {
            this.curency = value;
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
        public static class CURENCY
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
     *         &lt;element name="CABIN" type="{}SEGMENT_CABIN" minOccurs="0"/&gt;
     *         &lt;element name="FARE_FAMILY" minOccurs="0"&gt;
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
     *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="WAITLISTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="LIST_RBD" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RBD" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="AVAILABILITY_STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "cabin",
        "farefamily",
        "status",
        "waitlisted",
        "listrbd"
    })
    public static class LISTCABIN
        implements Serializable
    {

        @XmlElement(name = "CABIN")
        protected String cabin;
        @XmlElement(name = "FARE_FAMILY")
        protected SegmentType.LISTCABIN.FAREFAMILY farefamily;
        @XmlElement(name = "STATUS")
        protected String status;
        @XmlElement(name = "WAITLISTED")
        protected Boolean waitlisted;
        @XmlElement(name = "LIST_RBD")
        protected List<SegmentType.LISTCABIN.LISTRBD> listrbd;

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
         *     {@link SegmentType.LISTCABIN.FAREFAMILY }
         *     
         */
        public SegmentType.LISTCABIN.FAREFAMILY getFAREFAMILY() {
            return farefamily;
        }

        /**
         * Sets the value of the farefamily property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentType.LISTCABIN.FAREFAMILY }
         *     
         */
        public void setFAREFAMILY(SegmentType.LISTCABIN.FAREFAMILY value) {
            this.farefamily = value;
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
         * Gets the value of the waitlisted property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWAITLISTED() {
            return waitlisted;
        }

        /**
         * Sets the value of the waitlisted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWAITLISTED(Boolean value) {
            this.waitlisted = value;
        }

        /**
         * Gets the value of the listrbd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listrbd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTRBD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentType.LISTCABIN.LISTRBD }
         * 
         * 
         */
        public List<SegmentType.LISTCABIN.LISTRBD> getLISTRBD() {
            if (listrbd == null) {
                listrbd = new ArrayList<SegmentType.LISTCABIN.LISTRBD>();
            }
            return this.listrbd;
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
        public static class FAREFAMILY
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
         *         &lt;element name="RBD" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="AVAILABILITY_STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "rbd",
            "status",
            "availabilitystatus"
        })
        public static class LISTRBD
            implements Serializable
        {

            @XmlElement(name = "RBD", required = true)
            protected String rbd;
            @XmlElement(name = "STATUS")
            protected String status;
            @XmlElement(name = "AVAILABILITY_STATUS")
            protected String availabilitystatus;

            /**
             * Gets the value of the rbd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRBD() {
                return rbd;
            }

            /**
             * Sets the value of the rbd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRBD(String value) {
                this.rbd = value;
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
             * Gets the value of the availabilitystatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAVAILABILITYSTATUS() {
                return availabilitystatus;
            }

            /**
             * Sets the value of the availabilitystatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAVAILABILITYSTATUS(String value) {
                this.availabilitystatus = value;
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
     *         &lt;element name="CHANNEL_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHECK_IN"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACCEPTANCE_PERIOD" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="BEGIN"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="END"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="FLIGHT_ELIGIBILITY_STATUS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     *         &lt;element name="LIST_PASSENGER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHECK_IN_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "channelmode",
        "checkin",
        "listpassenger"
    })
    public static class LISTCHECKINPROPERTIES
        implements Serializable
    {

        @XmlElement(name = "CHANNEL_MODE")
        protected String channelmode;
        @XmlElement(name = "CHECK_IN", required = true)
        protected SegmentType.LISTCHECKINPROPERTIES.CHECKIN checkin;
        @XmlElement(name = "LIST_PASSENGER")
        protected List<SegmentType.LISTCHECKINPROPERTIES.LISTPASSENGER> listpassenger;

        /**
         * Gets the value of the channelmode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHANNELMODE() {
            return channelmode;
        }

        /**
         * Sets the value of the channelmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHANNELMODE(String value) {
            this.channelmode = value;
        }

        /**
         * Gets the value of the checkin property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN }
         *     
         */
        public SegmentType.LISTCHECKINPROPERTIES.CHECKIN getCHECKIN() {
            return checkin;
        }

        /**
         * Sets the value of the checkin property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN }
         *     
         */
        public void setCHECKIN(SegmentType.LISTCHECKINPROPERTIES.CHECKIN value) {
            this.checkin = value;
        }

        /**
         * Gets the value of the listpassenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpassenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPASSENGER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentType.LISTCHECKINPROPERTIES.LISTPASSENGER }
         * 
         * 
         */
        public List<SegmentType.LISTCHECKINPROPERTIES.LISTPASSENGER> getLISTPASSENGER() {
            if (listpassenger == null) {
                listpassenger = new ArrayList<SegmentType.LISTCHECKINPROPERTIES.LISTPASSENGER>();
            }
            return this.listpassenger;
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
         *         &lt;element name="ACCEPTANCE_PERIOD" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="BEGIN"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="END"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="FLIGHT_ELIGIBILITY_STATUS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "acceptanceperiod",
            "statuscode",
            "flighteligibilitystatus"
        })
        public static class CHECKIN
            implements Serializable
        {

            @XmlElement(name = "ACCEPTANCE_PERIOD")
            protected SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD acceptanceperiod;
            @XmlElement(name = "STATUS_CODE", required = true)
            protected BigInteger statuscode;
            @XmlElement(name = "FLIGHT_ELIGIBILITY_STATUS")
            protected SegmentType.LISTCHECKINPROPERTIES.CHECKIN.FLIGHTELIGIBILITYSTATUS flighteligibilitystatus;

            /**
             * Gets the value of the acceptanceperiod property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD }
             *     
             */
            public SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD getACCEPTANCEPERIOD() {
                return acceptanceperiod;
            }

            /**
             * Sets the value of the acceptanceperiod property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD }
             *     
             */
            public void setACCEPTANCEPERIOD(SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD value) {
                this.acceptanceperiod = value;
            }

            /**
             * Gets the value of the statuscode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSTATUSCODE() {
                return statuscode;
            }

            /**
             * Sets the value of the statuscode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSTATUSCODE(BigInteger value) {
                this.statuscode = value;
            }

            /**
             * Gets the value of the flighteligibilitystatus property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.FLIGHTELIGIBILITYSTATUS }
             *     
             */
            public SegmentType.LISTCHECKINPROPERTIES.CHECKIN.FLIGHTELIGIBILITYSTATUS getFLIGHTELIGIBILITYSTATUS() {
                return flighteligibilitystatus;
            }

            /**
             * Sets the value of the flighteligibilitystatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.FLIGHTELIGIBILITYSTATUS }
             *     
             */
            public void setFLIGHTELIGIBILITYSTATUS(SegmentType.LISTCHECKINPROPERTIES.CHECKIN.FLIGHTELIGIBILITYSTATUS value) {
                this.flighteligibilitystatus = value;
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
             *         &lt;element name="BEGIN"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="END"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
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
                "begin",
                "end"
            })
            public static class ACCEPTANCEPERIOD
                implements Serializable
            {

                @XmlElement(name = "BEGIN", required = true)
                protected SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN begin;
                @XmlElement(name = "END", required = true)
                protected SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END end;

                /**
                 * Gets the value of the begin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN }
                 *     
                 */
                public SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN getBEGIN() {
                    return begin;
                }

                /**
                 * Sets the value of the begin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN }
                 *     
                 */
                public void setBEGIN(SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN value) {
                    this.begin = value;
                }

                /**
                 * Gets the value of the end property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END }
                 *     
                 */
                public SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END getEND() {
                    return end;
                }

                /**
                 * Sets the value of the end property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END }
                 *     
                 */
                public void setEND(SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END value) {
                    this.end = value;
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
                public static class BEGIN
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
                public static class END
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
             *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "noneligibilityreason",
                "eligibilitystatus"
            })
            public static class FLIGHTELIGIBILITYSTATUS
                implements Serializable
            {

                @XmlElement(name = "NON_ELIGIBILITY_REASON")
                protected String noneligibilityreason;
                @XmlElement(name = "ELIGIBILITY_STATUS")
                protected String eligibilitystatus;

                /**
                 * Gets the value of the noneligibilityreason property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNONELIGIBILITYREASON() {
                    return noneligibilityreason;
                }

                /**
                 * Sets the value of the noneligibilityreason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNONELIGIBILITYREASON(String value) {
                    this.noneligibilityreason = value;
                }

                /**
                 * Gets the value of the eligibilitystatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getELIGIBILITYSTATUS() {
                    return eligibilitystatus;
                }

                /**
                 * Sets the value of the eligibilitystatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setELIGIBILITYSTATUS(String value) {
                    this.eligibilitystatus = value;
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
         *         &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="ELIGIBILITY_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHECK_IN_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "eligibilitystatus",
            "noneligibilityreason",
            "checkinurl"
        })
        public static class LISTPASSENGER
            implements Serializable
        {

            @XmlElement(name = "TRAVELER_ID", required = true)
            protected BigInteger travelerid;
            @XmlElement(name = "ELIGIBILITY_STATUS", required = true)
            protected String eligibilitystatus;
            @XmlElement(name = "NON_ELIGIBILITY_REASON")
            protected String noneligibilityreason;
            @XmlElement(name = "CHECK_IN_URL")
            protected String checkinurl;

            /**
             * Gets the value of the travelerid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTRAVELERID() {
                return travelerid;
            }

            /**
             * Sets the value of the travelerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTRAVELERID(BigInteger value) {
                this.travelerid = value;
            }

            /**
             * Gets the value of the eligibilitystatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getELIGIBILITYSTATUS() {
                return eligibilitystatus;
            }

            /**
             * Sets the value of the eligibilitystatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setELIGIBILITYSTATUS(String value) {
                this.eligibilitystatus = value;
            }

            /**
             * Gets the value of the noneligibilityreason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNONELIGIBILITYREASON() {
                return noneligibilityreason;
            }

            /**
             * Sets the value of the noneligibilityreason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNONELIGIBILITYREASON(String value) {
                this.noneligibilityreason = value;
            }

            /**
             * Gets the value of the checkinurl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHECKINURL() {
                return checkinurl;
            }

            /**
             * Sets the value of the checkinurl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHECKINURL(String value) {
                this.checkinurl = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="FREETEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "freetext"
    })
    public static class LISTFLIGHTFACT
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "FREETEXT")
        protected String freetext;

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
     *         &lt;element name="MEAL_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType"/&gt;
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
        "mealcode",
        "description"
    })
    public static class LISTMEAL
        implements Serializable
    {

        @XmlElement(name = "MEAL_CODE", required = true)
        protected String mealcode;
        @XmlElement(name = "DESCRIPTION", required = true)
        protected String description;

        /**
         * Gets the value of the mealcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMEALCODE() {
            return mealcode;
        }

        /**
         * Sets the value of the mealcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMEALCODE(String value) {
            this.mealcode = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
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
     *         &lt;element name="STATUS" type="{}unprotectedStringType"/&gt;
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
        "status"
    })
    public static class LISTSTATUS
        implements Serializable
    {

        @XmlElement(name = "STATUS", required = true)
        protected String status;

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
     *         &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{}SEGMENT_AIRLINE_NAME" minOccurs="0"/&gt;
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
    public static class OTHERAIRLINE
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
     *         &lt;element name="IS_PRICE_SELECTED_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_PRICE_SELECTED_IN_EVOUCHERS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "ispriceselectedinmiles",
        "ispriceselectedinevouchers"
    })
    public static class SELECTIONINFOFORUPGRADE
        implements Serializable
    {

        @XmlElement(name = "IS_PRICE_SELECTED_IN_MILES")
        protected Boolean ispriceselectedinmiles;
        @XmlElement(name = "IS_PRICE_SELECTED_IN_EVOUCHERS")
        protected Boolean ispriceselectedinevouchers;

        /**
         * Gets the value of the ispriceselectedinmiles property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISPRICESELECTEDINMILES() {
            return ispriceselectedinmiles;
        }

        /**
         * Sets the value of the ispriceselectedinmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISPRICESELECTEDINMILES(Boolean value) {
            this.ispriceselectedinmiles = value;
        }

        /**
         * Gets the value of the ispriceselectedinevouchers property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISPRICESELECTEDINEVOUCHERS() {
            return ispriceselectedinevouchers;
        }

        /**
         * Sets the value of the ispriceselectedinevouchers property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISPRICESELECTEDINEVOUCHERS(Boolean value) {
            this.ispriceselectedinevouchers = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="SUBCODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PAYMENT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TAX" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="APPLY_TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_PRICES" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="CURENCY" minOccurs="0"&gt;
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
     *         &lt;element name="RULE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "code",
        "subcode",
        "name",
        "payment",
        "listprices",
        "rule"
    })
    public static class SERVICES
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "SUBCODE")
        protected String subcode;
        @XmlElement(name = "NAME")
        protected String name;
        @XmlElement(name = "PAYMENT")
        protected SegmentType.SERVICES.PAYMENT payment;
        @XmlElement(name = "LIST_PRICES")
        protected List<SegmentType.SERVICES.LISTPRICES> listprices;
        @XmlElement(name = "RULE")
        protected SegmentType.SERVICES.RULE rule;

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
         * Gets the value of the subcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUBCODE() {
            return subcode;
        }

        /**
         * Sets the value of the subcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUBCODE(String value) {
            this.subcode = value;
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

        /**
         * Gets the value of the payment property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentType.SERVICES.PAYMENT }
         *     
         */
        public SegmentType.SERVICES.PAYMENT getPAYMENT() {
            return payment;
        }

        /**
         * Sets the value of the payment property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentType.SERVICES.PAYMENT }
         *     
         */
        public void setPAYMENT(SegmentType.SERVICES.PAYMENT value) {
            this.payment = value;
        }

        /**
         * Gets the value of the listprices property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listprices property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPRICES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentType.SERVICES.LISTPRICES }
         * 
         * 
         */
        public List<SegmentType.SERVICES.LISTPRICES> getLISTPRICES() {
            if (listprices == null) {
                listprices = new ArrayList<SegmentType.SERVICES.LISTPRICES>();
            }
            return this.listprices;
        }

        /**
         * Gets the value of the rule property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentType.SERVICES.RULE }
         *     
         */
        public SegmentType.SERVICES.RULE getRULE() {
            return rule;
        }

        /**
         * Sets the value of the rule property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentType.SERVICES.RULE }
         *     
         */
        public void setRULE(SegmentType.SERVICES.RULE value) {
            this.rule = value;
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
         *         &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="CURENCY" minOccurs="0"&gt;
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
            "amount",
            "curency"
        })
        public static class LISTPRICES
            implements Serializable
        {

            @XmlElement(name = "AMOUNT")
            protected String amount;
            @XmlElement(name = "CURENCY")
            protected SegmentType.SERVICES.LISTPRICES.CURENCY curency;

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
             * Gets the value of the curency property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentType.SERVICES.LISTPRICES.CURENCY }
             *     
             */
            public SegmentType.SERVICES.LISTPRICES.CURENCY getCURENCY() {
                return curency;
            }

            /**
             * Sets the value of the curency property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentType.SERVICES.LISTPRICES.CURENCY }
             *     
             */
            public void setCURENCY(SegmentType.SERVICES.LISTPRICES.CURENCY value) {
                this.curency = value;
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
            public static class CURENCY
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
         *         &lt;element name="TAX" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="APPLY_TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "tax",
            "applyto"
        })
        public static class PAYMENT
            implements Serializable
        {

            @XmlElement(name = "TAX")
            protected String tax;
            @XmlElement(name = "APPLY_TO")
            protected String applyto;

            /**
             * Gets the value of the tax property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAX() {
                return tax;
            }

            /**
             * Sets the value of the tax property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAX(String value) {
                this.tax = value;
            }

            /**
             * Gets the value of the applyto property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAPPLYTO() {
                return applyto;
            }

            /**
             * Sets the value of the applyto property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAPPLYTO(String value) {
                this.applyto = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        public static class RULE
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected Object code;
            @XmlElement(name = "NAME")
            protected Object name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCODE(Object value) {
                this.code = value;
            }

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

        }

    }

}
