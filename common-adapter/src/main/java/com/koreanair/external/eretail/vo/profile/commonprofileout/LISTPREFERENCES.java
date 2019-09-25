
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="LANGUAGE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="EMAIL_LANGUAGE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="DELETED_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FAVOURITE_DESTINATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AIR_PREFERENCES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HOME_AIRPORT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SEAT_FLIGHT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SMOKING" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="00"/&gt;
 *                                   &lt;enumeration value="NS"/&gt;
 *                                   &lt;enumeration value="SM"/&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SEAT_LOCATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="ST"/&gt;
 *                                   &lt;enumeration value="SA"/&gt;
 *                                   &lt;enumeration value="SC"/&gt;
 *                                   &lt;enumeration value="SW"/&gt;
 *                                   &lt;enumeration value="SB"/&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_SEAT_CHARACTERISTIC" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SEAT_ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OLD_SEAT_ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IS_EXEMPTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="BABY_SEAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="MILES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SEAT_STATUS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CABIN" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="F"/&gt;
 *                                   &lt;enumeration value="B"/&gt;
 *                                   &lt;enumeration value="E"/&gt;
 *                                   &lt;enumeration value="R"/&gt;
 *                                   &lt;enumeration value="M"/&gt;
 *                                   &lt;enumeration value="X"/&gt;
 *                                   &lt;enumeration value="S"/&gt;
 *                                   &lt;enumeration value="N"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MEAL" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="AVML"/&gt;
 *                                   &lt;enumeration value="AHML"/&gt;
 *                                   &lt;enumeration value="ALAB"/&gt;
 *                                   &lt;enumeration value="BBML"/&gt;
 *                                   &lt;enumeration value="BLML"/&gt;
 *                                   &lt;enumeration value="CHML"/&gt;
 *                                   &lt;enumeration value="CHKN"/&gt;
 *                                   &lt;enumeration value="CKML"/&gt;
 *                                   &lt;enumeration value="DBML"/&gt;
 *                                   &lt;enumeration value="DLFR"/&gt;
 *                                   &lt;enumeration value="FPML"/&gt;
 *                                   &lt;enumeration value="FRNK"/&gt;
 *                                   &lt;enumeration value="GAHB"/&gt;
 *                                   &lt;enumeration value="GFML"/&gt;
 *                                   &lt;enumeration value="HBGR"/&gt;
 *                                   &lt;enumeration value="HFML"/&gt;
 *                                   &lt;enumeration value="HNML"/&gt;
 *                                   &lt;enumeration value="IVML"/&gt;
 *                                   &lt;enumeration value="KSML"/&gt;
 *                                   &lt;enumeration value="LCML"/&gt;
 *                                   &lt;enumeration value="LCRB"/&gt;
 *                                   &lt;enumeration value="LDML"/&gt;
 *                                   &lt;enumeration value="LFML"/&gt;
 *                                   &lt;enumeration value="LPML"/&gt;
 *                                   &lt;enumeration value="LSML"/&gt;
 *                                   &lt;enumeration value="MOML"/&gt;
 *                                   &lt;enumeration value="NLML"/&gt;
 *                                   &lt;enumeration value="NSML"/&gt;
 *                                   &lt;enumeration value="ORML"/&gt;
 *                                   &lt;enumeration value="PBJS"/&gt;
 *                                   &lt;enumeration value="PFML"/&gt;
 *                                   &lt;enumeration value="PRML"/&gt;
 *                                   &lt;enumeration value="PWML"/&gt;
 *                                   &lt;enumeration value="RFML"/&gt;
 *                                   &lt;enumeration value="RVML"/&gt;
 *                                   &lt;enumeration value="SAML"/&gt;
 *                                   &lt;enumeration value="SFPL"/&gt;
 *                                   &lt;enumeration value="SHML"/&gt;
 *                                   &lt;enumeration value="SFML"/&gt;
 *                                   &lt;enumeration value="SPML"/&gt;
 *                                   &lt;enumeration value="STRD"/&gt;
 *                                   &lt;enumeration value="TDML"/&gt;
 *                                   &lt;enumeration value="TFML"/&gt;
 *                                   &lt;enumeration value="VGML"/&gt;
 *                                   &lt;enumeration value="VLML"/&gt;
 *                                   &lt;enumeration value="VOML"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MEAL_STATUS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;length value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MEAL_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_FREQUENT_FLYER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE"&gt;
 *                           &lt;attribute name="isValid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_TRAVELLER_CLID" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="CLID_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_DISCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="DISCOUNT_CARD_TYPE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="OWNER_FIRSTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="OWNER_LASTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="DISCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *                             &lt;element name="COMPANY_INFORMATION"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_ACCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="ACCOUNT_CARD_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNT_CARD_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNT_CARD_STATUS" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NAME" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="20"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="DETAILS" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="20"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ACCOUNT_CARD_INFORMATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="CFF_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="FARE_RULES" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="START_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *                             &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *                             &lt;element name="IS_PHYSIC_CARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_CORPORATE_NUMBER" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_ADDITIONAL_SEAT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ADDITIONAL_SEAT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="IS_ONE_TICKET_PRICING_MODE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IS_TWO_TICKET_PRICING_MODE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="SEAT_ASSIGNMENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_SEAT_CHARACTERISTIC" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="40"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
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
 *                   &lt;element name="LIST_MILES_ACCOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MILES_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="FREQUENT_FLYER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element ref="{}LIST_STATUS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FUNCTIONAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_REDEMPTION_ACCOUNT" type="{}LIST_REDEMPTION_ACCOUNTType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_UPGRADE_ACCOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}LIST_REDEMPTION_ACCOUNTType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ORIGINAL_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="BOOKING_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_FREQUENT_FLYER_PRODUCT_ASSOCIATION" type="{}FREQUENT_FLYER_REFERENCE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_SERVICING_ACCOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SERVICING_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="FREQUENT_FLYER_ID" type="{}unprotectedStringType"/&gt;
 *                             &lt;element ref="{}LIST_STATUS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FUNCTIONAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DCS_SEAT_ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DISCREPANCY_IN_SEAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CAR_PREFERENCES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SMOKING" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WHEELCHAIR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="MILES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_FREQUENT_CAR_RENTER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_CAR_FREQUENT_FLYER" type="{}LIST_FREQUENT_FLYER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_CORPORATE_COMPANY_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_CAR_ACCREDITIVE_CARDS" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="ACCREDITIVE_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
 *                             &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE"/&gt;
 *                             &lt;element name="DISCOUNT_CARD_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
 *         &lt;element name="HOTEL_PREFERENCES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CATEGORY" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="F"/&gt;
 *                                   &lt;enumeration value="S"/&gt;
 *                                   &lt;enumeration value="L"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SORTING_CRITERIA" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ROOM_PREFERENCES" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="ROOM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BED_TYPE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;enumeration value="0"/&gt;
 *                                             &lt;enumeration value="D"/&gt;
 *                                             &lt;enumeration value="K"/&gt;
 *                                             &lt;enumeration value="P"/&gt;
 *                                             &lt;enumeration value="Q"/&gt;
 *                                             &lt;enumeration value="S"/&gt;
 *                                             &lt;enumeration value="T"/&gt;
 *                                             &lt;enumeration value="W"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NAME" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="40"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SMOKING" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;enumeration value="ST"/&gt;
 *                                             &lt;enumeration value="NS"/&gt;
 *                                             &lt;enumeration value="00"/&gt;
 *                                             &lt;enumeration value="SM"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CRIB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="WHEELCHAIR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_CORPORATE_GUEST" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CORPORATE_GUEST" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="COMPANY"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="CODE"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{}unprotectedStringType"&gt;
 *                                                       &lt;length value="2"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="NAME" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;minLength value="1"/&gt;
 *                                                       &lt;maxLength value="40"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/all&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PER_PAGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_FREQUENT_GUEST" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="COMPANY"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="40"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CHECKIN" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CHECKOUT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_SPECIAL_SERVICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="CHAMP"/&gt;
 *                                   &lt;enumeration value="CRIB"/&gt;
 *                                   &lt;enumeration value="NEWS"/&gt;
 *                                   &lt;enumeration value="DISABLE"/&gt;
 *                                   &lt;enumeration value="PET"/&gt;
 *                                   &lt;enumeration value="BED"/&gt;
 *                                   &lt;enumeration value="PERSON"/&gt;
 *                                   &lt;enumeration value="FLOWER"/&gt;
 *                                   &lt;enumeration value="FREQ"/&gt;
 *                                   &lt;enumeration value="GMEMBER"/&gt;
 *                                   &lt;enumeration value="WWW"/&gt;
 *                                   &lt;enumeration value="MOON"/&gt;
 *                                   &lt;enumeration value="UNDER4"/&gt;
 *                                   &lt;enumeration value="UNDER12"/&gt;
 *                                   &lt;enumeration value="UNDER16"/&gt;
 *                                   &lt;enumeration value="KING"/&gt;
 *                                   &lt;enumeration value="QUIET"/&gt;
 *                                   &lt;enumeration value="TWIN"/&gt;
 *                                   &lt;enumeration value="WIFI"/&gt;
 *                                   &lt;enumeration value="OTHER"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="250"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
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
 *         &lt;element name="RAIL_PREFERENCES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CLASS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="PR"/&gt;
 *                                   &lt;enumeration value="FR"/&gt;
 *                                   &lt;enumeration value="SD"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DEPARTURE_STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SMOKING" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="ST"/&gt;
 *                                   &lt;enumeration value="NS"/&gt;
 *                                   &lt;enumeration value="00"/&gt;
 *                                   &lt;enumeration value="SM"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CAR_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="SC"/&gt;
 *                                   &lt;enumeration value="CC"/&gt;
 *                                   &lt;enumeration value="TB"/&gt;
 *                                   &lt;enumeration value="NONE"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LOCATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="AS"/&gt;
 *                                   &lt;enumeration value="WD "/&gt;
 *                                   &lt;enumeration value="NONE"/&gt;
 *                                   &lt;enumeration value="00"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ICE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="MZ"/&gt;
 *                                   &lt;enumeration value="QZ"/&gt;
 *                                   &lt;enumeration value="NONE"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_FREQUENT_RAIL_CARD" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="COMPANY"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;enumeration value="00"/&gt;
 *                                             &lt;enumeration value="B25N"/&gt;
 *                                             &lt;enumeration value="B25F"/&gt;
 *                                             &lt;enumeration value="B50N"/&gt;
 *                                             &lt;enumeration value="B50F"/&gt;
 *                                             &lt;enumeration value="BB"/&gt;
 *                                             &lt;enumeration value="BBC"/&gt;
 *                                             &lt;enumeration value="BBI"/&gt;
 *                                             &lt;enumeration value="BC"/&gt;
 *                                             &lt;enumeration value="BCB"/&gt;
 *                                             &lt;enumeration value="BCC"/&gt;
 *                                             &lt;enumeration value="BCI"/&gt;
 *                                             &lt;enumeration value="CFE"/&gt;
 *                                             &lt;enumeration value="CYB"/&gt;
 *                                             &lt;enumeration value="DB25"/&gt;
 *                                             &lt;enumeration value="DB25B"/&gt;
 *                                             &lt;enumeration value="DB25F"/&gt;
 *                                             &lt;enumeration value="DB25FB"/&gt;
 *                                             &lt;enumeration value="DB50"/&gt;
 *                                             &lt;enumeration value="DB50B"/&gt;
 *                                             &lt;enumeration value="DB50F"/&gt;
 *                                             &lt;enumeration value="DB50FB"/&gt;
 *                                             &lt;enumeration value="EFT"/&gt;
 *                                             &lt;enumeration value="ES"/&gt;
 *                                             &lt;enumeration value="F"/&gt;
 *                                             &lt;enumeration value="FID_SNCF"/&gt;
 *                                             &lt;enumeration value="GV"/&gt;
 *                                             &lt;enumeration value="GVC"/&gt;
 *                                             &lt;enumeration value="K"/&gt;
 *                                             &lt;enumeration value="RENFE"/&gt;
 *                                             &lt;enumeration value="SNCF"/&gt;
 *                                             &lt;enumeration value="TH"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NAME" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNT_EXPIRATIONDATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_ACCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ACCOUNT_CARD_TYPE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="ACCOUNT_CARD_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="ACCOUNT_CARD_NUMBER" type="{}unprotectedStringType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_DISCOUNT_RAIL_CARD" type="{}DISCOUNT_CARD_COMPLEX_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FORCE_SMOKING_PREF" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CAMPAIGN_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="ACCOMMODATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ZONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STATUS" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_OPTIONS" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                   &lt;element name="LIST_NEGOCIATED_FARES" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="NEGOCIATED_FARE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NEGOCIATED_FARE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="COMMON_PREFERENCES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MEMBERSHIP_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LEISURE_PREFERENCES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_CHARACTERISTICS" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CHARACTERISTIC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_HOBBIES" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="HOBBIE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
 *         &lt;element name="LEG_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IDENTIFICATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
    "language",
    "emaillanguage",
    "deletedelement",
    "currency",
    "favouritedestination",
    "segmentid",
    "airpreferences",
    "carpreferences",
    "hotelpreferences",
    "railpreferences",
    "commonpreferences",
    "leisurepreferences",
    "legid",
    "identificationnumber"
})
@XmlRootElement(name = "LIST_PREFERENCES")
public class LISTPREFERENCES
    implements Serializable
{

    @XmlElement(name = "LANGUAGE")
    protected String language;
    @XmlElement(name = "EMAIL_LANGUAGE")
    protected String emaillanguage;
    @XmlElement(name = "DELETED_ELEMENT")
    protected Boolean deletedelement;
    @XmlElement(name = "CURRENCY")
    protected LISTPREFERENCES.CURRENCY currency;
    @XmlElement(name = "FAVOURITE_DESTINATION")
    protected LISTPREFERENCES.FAVOURITEDESTINATION favouritedestination;
    @XmlElement(name = "SEGMENT_ID")
    protected BigInteger segmentid;
    @XmlElement(name = "AIR_PREFERENCES")
    protected LISTPREFERENCES.AIRPREFERENCES airpreferences;
    @XmlElement(name = "CAR_PREFERENCES")
    protected LISTPREFERENCES.CARPREFERENCES carpreferences;
    @XmlElement(name = "HOTEL_PREFERENCES")
    protected LISTPREFERENCES.HOTELPREFERENCES hotelpreferences;
    @XmlElement(name = "RAIL_PREFERENCES")
    protected LISTPREFERENCES.RAILPREFERENCES railpreferences;
    @XmlElement(name = "COMMON_PREFERENCES")
    protected LISTPREFERENCES.COMMONPREFERENCES commonpreferences;
    @XmlElement(name = "LEISURE_PREFERENCES")
    protected LISTPREFERENCES.LEISUREPREFERENCES leisurepreferences;
    @XmlElement(name = "LEG_ID")
    protected BigInteger legid;
    @XmlElement(name = "IDENTIFICATION_NUMBER")
    protected BigInteger identificationnumber;

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
     * Gets the value of the emaillanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAILLANGUAGE() {
        return emaillanguage;
    }

    /**
     * Sets the value of the emaillanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAILLANGUAGE(String value) {
        this.emaillanguage = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPREFERENCES.CURRENCY }
     *     
     */
    public LISTPREFERENCES.CURRENCY getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPREFERENCES.CURRENCY }
     *     
     */
    public void setCURRENCY(LISTPREFERENCES.CURRENCY value) {
        this.currency = value;
    }

    /**
     * Gets the value of the favouritedestination property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPREFERENCES.FAVOURITEDESTINATION }
     *     
     */
    public LISTPREFERENCES.FAVOURITEDESTINATION getFAVOURITEDESTINATION() {
        return favouritedestination;
    }

    /**
     * Sets the value of the favouritedestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPREFERENCES.FAVOURITEDESTINATION }
     *     
     */
    public void setFAVOURITEDESTINATION(LISTPREFERENCES.FAVOURITEDESTINATION value) {
        this.favouritedestination = value;
    }

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
     * Gets the value of the airpreferences property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPREFERENCES.AIRPREFERENCES }
     *     
     */
    public LISTPREFERENCES.AIRPREFERENCES getAIRPREFERENCES() {
        return airpreferences;
    }

    /**
     * Sets the value of the airpreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPREFERENCES.AIRPREFERENCES }
     *     
     */
    public void setAIRPREFERENCES(LISTPREFERENCES.AIRPREFERENCES value) {
        this.airpreferences = value;
    }

    /**
     * Gets the value of the carpreferences property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPREFERENCES.CARPREFERENCES }
     *     
     */
    public LISTPREFERENCES.CARPREFERENCES getCARPREFERENCES() {
        return carpreferences;
    }

    /**
     * Sets the value of the carpreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPREFERENCES.CARPREFERENCES }
     *     
     */
    public void setCARPREFERENCES(LISTPREFERENCES.CARPREFERENCES value) {
        this.carpreferences = value;
    }

    /**
     * Gets the value of the hotelpreferences property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPREFERENCES.HOTELPREFERENCES }
     *     
     */
    public LISTPREFERENCES.HOTELPREFERENCES getHOTELPREFERENCES() {
        return hotelpreferences;
    }

    /**
     * Sets the value of the hotelpreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPREFERENCES.HOTELPREFERENCES }
     *     
     */
    public void setHOTELPREFERENCES(LISTPREFERENCES.HOTELPREFERENCES value) {
        this.hotelpreferences = value;
    }

    /**
     * Gets the value of the railpreferences property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPREFERENCES.RAILPREFERENCES }
     *     
     */
    public LISTPREFERENCES.RAILPREFERENCES getRAILPREFERENCES() {
        return railpreferences;
    }

    /**
     * Sets the value of the railpreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPREFERENCES.RAILPREFERENCES }
     *     
     */
    public void setRAILPREFERENCES(LISTPREFERENCES.RAILPREFERENCES value) {
        this.railpreferences = value;
    }

    /**
     * Gets the value of the commonpreferences property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPREFERENCES.COMMONPREFERENCES }
     *     
     */
    public LISTPREFERENCES.COMMONPREFERENCES getCOMMONPREFERENCES() {
        return commonpreferences;
    }

    /**
     * Sets the value of the commonpreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPREFERENCES.COMMONPREFERENCES }
     *     
     */
    public void setCOMMONPREFERENCES(LISTPREFERENCES.COMMONPREFERENCES value) {
        this.commonpreferences = value;
    }

    /**
     * Gets the value of the leisurepreferences property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPREFERENCES.LEISUREPREFERENCES }
     *     
     */
    public LISTPREFERENCES.LEISUREPREFERENCES getLEISUREPREFERENCES() {
        return leisurepreferences;
    }

    /**
     * Sets the value of the leisurepreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPREFERENCES.LEISUREPREFERENCES }
     *     
     */
    public void setLEISUREPREFERENCES(LISTPREFERENCES.LEISUREPREFERENCES value) {
        this.leisurepreferences = value;
    }

    /**
     * Gets the value of the legid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLEGID() {
        return legid;
    }

    /**
     * Sets the value of the legid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLEGID(BigInteger value) {
        this.legid = value;
    }

    /**
     * Gets the value of the identificationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDENTIFICATIONNUMBER() {
        return identificationnumber;
    }

    /**
     * Sets the value of the identificationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDENTIFICATIONNUMBER(BigInteger value) {
        this.identificationnumber = value;
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
     *         &lt;element name="HOME_AIRPORT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SEAT_FLIGHT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SMOKING" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="00"/&gt;
     *                         &lt;enumeration value="NS"/&gt;
     *                         &lt;enumeration value="SM"/&gt;
     *                         &lt;enumeration value=""/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SEAT_LOCATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="ST"/&gt;
     *                         &lt;enumeration value="SA"/&gt;
     *                         &lt;enumeration value="SC"/&gt;
     *                         &lt;enumeration value="SW"/&gt;
     *                         &lt;enumeration value="SB"/&gt;
     *                         &lt;enumeration value=""/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_SEAT_CHARACTERISTIC" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SEAT_ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OLD_SEAT_ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IS_EXEMPTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="BABY_SEAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="MILES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SEAT_STATUS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CABIN" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="F"/&gt;
     *                         &lt;enumeration value="B"/&gt;
     *                         &lt;enumeration value="E"/&gt;
     *                         &lt;enumeration value="R"/&gt;
     *                         &lt;enumeration value="M"/&gt;
     *                         &lt;enumeration value="X"/&gt;
     *                         &lt;enumeration value="S"/&gt;
     *                         &lt;enumeration value="N"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MEAL" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="AVML"/&gt;
     *                         &lt;enumeration value="AHML"/&gt;
     *                         &lt;enumeration value="ALAB"/&gt;
     *                         &lt;enumeration value="BBML"/&gt;
     *                         &lt;enumeration value="BLML"/&gt;
     *                         &lt;enumeration value="CHML"/&gt;
     *                         &lt;enumeration value="CHKN"/&gt;
     *                         &lt;enumeration value="CKML"/&gt;
     *                         &lt;enumeration value="DBML"/&gt;
     *                         &lt;enumeration value="DLFR"/&gt;
     *                         &lt;enumeration value="FPML"/&gt;
     *                         &lt;enumeration value="FRNK"/&gt;
     *                         &lt;enumeration value="GAHB"/&gt;
     *                         &lt;enumeration value="GFML"/&gt;
     *                         &lt;enumeration value="HBGR"/&gt;
     *                         &lt;enumeration value="HFML"/&gt;
     *                         &lt;enumeration value="HNML"/&gt;
     *                         &lt;enumeration value="IVML"/&gt;
     *                         &lt;enumeration value="KSML"/&gt;
     *                         &lt;enumeration value="LCML"/&gt;
     *                         &lt;enumeration value="LCRB"/&gt;
     *                         &lt;enumeration value="LDML"/&gt;
     *                         &lt;enumeration value="LFML"/&gt;
     *                         &lt;enumeration value="LPML"/&gt;
     *                         &lt;enumeration value="LSML"/&gt;
     *                         &lt;enumeration value="MOML"/&gt;
     *                         &lt;enumeration value="NLML"/&gt;
     *                         &lt;enumeration value="NSML"/&gt;
     *                         &lt;enumeration value="ORML"/&gt;
     *                         &lt;enumeration value="PBJS"/&gt;
     *                         &lt;enumeration value="PFML"/&gt;
     *                         &lt;enumeration value="PRML"/&gt;
     *                         &lt;enumeration value="PWML"/&gt;
     *                         &lt;enumeration value="RFML"/&gt;
     *                         &lt;enumeration value="RVML"/&gt;
     *                         &lt;enumeration value="SAML"/&gt;
     *                         &lt;enumeration value="SFPL"/&gt;
     *                         &lt;enumeration value="SHML"/&gt;
     *                         &lt;enumeration value="SFML"/&gt;
     *                         &lt;enumeration value="SPML"/&gt;
     *                         &lt;enumeration value="STRD"/&gt;
     *                         &lt;enumeration value="TDML"/&gt;
     *                         &lt;enumeration value="TFML"/&gt;
     *                         &lt;enumeration value="VGML"/&gt;
     *                         &lt;enumeration value="VLML"/&gt;
     *                         &lt;enumeration value="VOML"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MEAL_STATUS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;length value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MEAL_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_FREQUENT_FLYER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE"&gt;
     *                 &lt;attribute name="isValid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_TRAVELLER_CLID" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="CLID_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_DISCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="DISCOUNT_CARD_TYPE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="OWNER_FIRSTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="OWNER_LASTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="DISCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
     *                   &lt;element name="COMPANY_INFORMATION"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_ACCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="ACCOUNT_CARD_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNT_CARD_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNT_CARD_STATUS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NAME" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="20"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="DETAILS" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="20"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ACCOUNT_CARD_INFORMATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="CFF_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="FARE_RULES" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="START_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
     *                   &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
     *                   &lt;element name="IS_PHYSIC_CARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_CORPORATE_NUMBER" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_ADDITIONAL_SEAT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ADDITIONAL_SEAT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="IS_ONE_TICKET_PRICING_MODE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IS_TWO_TICKET_PRICING_MODE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="SEAT_ASSIGNMENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_SEAT_CHARACTERISTIC" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="40"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
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
     *         &lt;element name="LIST_MILES_ACCOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MILES_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="FREQUENT_FLYER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element ref="{}LIST_STATUS" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FUNCTIONAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_REDEMPTION_ACCOUNT" type="{}LIST_REDEMPTION_ACCOUNTType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_UPGRADE_ACCOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}LIST_REDEMPTION_ACCOUNTType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ORIGINAL_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="BOOKING_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_FREQUENT_FLYER_PRODUCT_ASSOCIATION" type="{}FREQUENT_FLYER_REFERENCE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_SERVICING_ACCOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SERVICING_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="FREQUENT_FLYER_ID" type="{}unprotectedStringType"/&gt;
     *                   &lt;element ref="{}LIST_STATUS" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FUNCTIONAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DCS_SEAT_ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DISCREPANCY_IN_SEAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "homeairport",
        "seatflightindicator",
        "smoking",
        "seatlocation",
        "listseatcharacteristic",
        "seatassignment",
        "oldseatassignment",
        "isexempted",
        "babyseat",
        "miles",
        "seatstatus",
        "cabin",
        "meal",
        "mealstatus",
        "mealdescription",
        "listfrequentflyer",
        "listtravellerclid",
        "listdiscountcard",
        "listaccountcard",
        "listadditionalseat",
        "listmilesaccount",
        "listredemptionaccount",
        "listupgradeaccount",
        "listfrequentflyerproductassociation",
        "listservicingaccount",
        "dcsseatassignment",
        "discrepancyinseat"
    })
    public static class AIRPREFERENCES
        implements Serializable
    {

        @XmlElement(name = "HOME_AIRPORT")
        protected LISTPREFERENCES.AIRPREFERENCES.HOMEAIRPORT homeairport;
        @XmlElement(name = "SEAT_FLIGHT_INDICATOR")
        protected String seatflightindicator;
        @XmlElement(name = "SMOKING")
        protected LISTPREFERENCES.AIRPREFERENCES.SMOKING smoking;
        @XmlElement(name = "SEAT_LOCATION")
        protected LISTPREFERENCES.AIRPREFERENCES.SEATLOCATION seatlocation;
        @XmlElement(name = "LIST_SEAT_CHARACTERISTIC")
        protected List<LISTPREFERENCES.AIRPREFERENCES.LISTSEATCHARACTERISTIC> listseatcharacteristic;
        @XmlElement(name = "SEAT_ASSIGNMENT")
        protected String seatassignment;
        @XmlElement(name = "OLD_SEAT_ASSIGNMENT")
        protected String oldseatassignment;
        @XmlElement(name = "IS_EXEMPTED")
        protected Boolean isexempted;
        @XmlElement(name = "BABY_SEAT")
        protected Boolean babyseat;
        @XmlElement(name = "MILES")
        protected String miles;
        @XmlElement(name = "SEAT_STATUS")
        protected LISTPREFERENCES.AIRPREFERENCES.SEATSTATUS seatstatus;
        @XmlElement(name = "CABIN")
        protected LISTPREFERENCES.AIRPREFERENCES.CABIN cabin;
        @XmlElement(name = "MEAL")
        protected LISTPREFERENCES.AIRPREFERENCES.MEAL meal;
        @XmlElement(name = "MEAL_STATUS")
        protected LISTPREFERENCES.AIRPREFERENCES.MEALSTATUS mealstatus;
        @XmlElement(name = "MEAL_DESCRIPTION")
        protected Object mealdescription;
        @XmlElement(name = "LIST_FREQUENT_FLYER")
        protected List<LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER> listfrequentflyer;
        @XmlElement(name = "LIST_TRAVELLER_CLID")
        protected List<LISTPREFERENCES.AIRPREFERENCES.LISTTRAVELLERCLID> listtravellerclid;
        @XmlElement(name = "LIST_DISCOUNT_CARD")
        protected List<LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD> listdiscountcard;
        @XmlElement(name = "LIST_ACCOUNT_CARD")
        protected List<LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD> listaccountcard;
        @XmlElement(name = "LIST_ADDITIONAL_SEAT")
        protected List<LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT> listadditionalseat;
        @XmlElement(name = "LIST_MILES_ACCOUNT")
        protected List<LISTPREFERENCES.AIRPREFERENCES.LISTMILESACCOUNT> listmilesaccount;
        @XmlElement(name = "LIST_REDEMPTION_ACCOUNT")
        protected List<LISTREDEMPTIONACCOUNTType> listredemptionaccount;
        @XmlElement(name = "LIST_UPGRADE_ACCOUNT")
        protected List<LISTPREFERENCES.AIRPREFERENCES.LISTUPGRADEACCOUNT> listupgradeaccount;
        @XmlElement(name = "LIST_FREQUENT_FLYER_PRODUCT_ASSOCIATION")
        protected List<FREQUENTFLYERREFERENCETYPE> listfrequentflyerproductassociation;
        @XmlElement(name = "LIST_SERVICING_ACCOUNT")
        protected List<LISTPREFERENCES.AIRPREFERENCES.LISTSERVICINGACCOUNT> listservicingaccount;
        @XmlElement(name = "DCS_SEAT_ASSIGNMENT")
        protected String dcsseatassignment;
        @XmlElement(name = "DISCREPANCY_IN_SEAT")
        protected Boolean discrepancyinseat;

        /**
         * Gets the value of the homeairport property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.HOMEAIRPORT }
         *     
         */
        public LISTPREFERENCES.AIRPREFERENCES.HOMEAIRPORT getHOMEAIRPORT() {
            return homeairport;
        }

        /**
         * Sets the value of the homeairport property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.HOMEAIRPORT }
         *     
         */
        public void setHOMEAIRPORT(LISTPREFERENCES.AIRPREFERENCES.HOMEAIRPORT value) {
            this.homeairport = value;
        }

        /**
         * Gets the value of the seatflightindicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEATFLIGHTINDICATOR() {
            return seatflightindicator;
        }

        /**
         * Sets the value of the seatflightindicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEATFLIGHTINDICATOR(String value) {
            this.seatflightindicator = value;
        }

        /**
         * Gets the value of the smoking property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.SMOKING }
         *     
         */
        public LISTPREFERENCES.AIRPREFERENCES.SMOKING getSMOKING() {
            return smoking;
        }

        /**
         * Sets the value of the smoking property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.SMOKING }
         *     
         */
        public void setSMOKING(LISTPREFERENCES.AIRPREFERENCES.SMOKING value) {
            this.smoking = value;
        }

        /**
         * Gets the value of the seatlocation property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.SEATLOCATION }
         *     
         */
        public LISTPREFERENCES.AIRPREFERENCES.SEATLOCATION getSEATLOCATION() {
            return seatlocation;
        }

        /**
         * Sets the value of the seatlocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.SEATLOCATION }
         *     
         */
        public void setSEATLOCATION(LISTPREFERENCES.AIRPREFERENCES.SEATLOCATION value) {
            this.seatlocation = value;
        }

        /**
         * Gets the value of the listseatcharacteristic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listseatcharacteristic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEATCHARACTERISTIC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.AIRPREFERENCES.LISTSEATCHARACTERISTIC }
         * 
         * 
         */
        public List<LISTPREFERENCES.AIRPREFERENCES.LISTSEATCHARACTERISTIC> getLISTSEATCHARACTERISTIC() {
            if (listseatcharacteristic == null) {
                listseatcharacteristic = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTSEATCHARACTERISTIC>();
            }
            return this.listseatcharacteristic;
        }

        /**
         * Gets the value of the seatassignment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEATASSIGNMENT() {
            return seatassignment;
        }

        /**
         * Sets the value of the seatassignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEATASSIGNMENT(String value) {
            this.seatassignment = value;
        }

        /**
         * Gets the value of the oldseatassignment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOLDSEATASSIGNMENT() {
            return oldseatassignment;
        }

        /**
         * Sets the value of the oldseatassignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOLDSEATASSIGNMENT(String value) {
            this.oldseatassignment = value;
        }

        /**
         * Gets the value of the isexempted property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISEXEMPTED() {
            return isexempted;
        }

        /**
         * Sets the value of the isexempted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISEXEMPTED(Boolean value) {
            this.isexempted = value;
        }

        /**
         * Gets the value of the babyseat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBABYSEAT() {
            return babyseat;
        }

        /**
         * Sets the value of the babyseat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBABYSEAT(Boolean value) {
            this.babyseat = value;
        }

        /**
         * Gets the value of the miles property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMILES() {
            return miles;
        }

        /**
         * Sets the value of the miles property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMILES(String value) {
            this.miles = value;
        }

        /**
         * Gets the value of the seatstatus property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.SEATSTATUS }
         *     
         */
        public LISTPREFERENCES.AIRPREFERENCES.SEATSTATUS getSEATSTATUS() {
            return seatstatus;
        }

        /**
         * Sets the value of the seatstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.SEATSTATUS }
         *     
         */
        public void setSEATSTATUS(LISTPREFERENCES.AIRPREFERENCES.SEATSTATUS value) {
            this.seatstatus = value;
        }

        /**
         * Gets the value of the cabin property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.CABIN }
         *     
         */
        public LISTPREFERENCES.AIRPREFERENCES.CABIN getCABIN() {
            return cabin;
        }

        /**
         * Sets the value of the cabin property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.CABIN }
         *     
         */
        public void setCABIN(LISTPREFERENCES.AIRPREFERENCES.CABIN value) {
            this.cabin = value;
        }

        /**
         * Gets the value of the meal property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.MEAL }
         *     
         */
        public LISTPREFERENCES.AIRPREFERENCES.MEAL getMEAL() {
            return meal;
        }

        /**
         * Sets the value of the meal property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.MEAL }
         *     
         */
        public void setMEAL(LISTPREFERENCES.AIRPREFERENCES.MEAL value) {
            this.meal = value;
        }

        /**
         * Gets the value of the mealstatus property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.MEALSTATUS }
         *     
         */
        public LISTPREFERENCES.AIRPREFERENCES.MEALSTATUS getMEALSTATUS() {
            return mealstatus;
        }

        /**
         * Sets the value of the mealstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.AIRPREFERENCES.MEALSTATUS }
         *     
         */
        public void setMEALSTATUS(LISTPREFERENCES.AIRPREFERENCES.MEALSTATUS value) {
            this.mealstatus = value;
        }

        /**
         * Gets the value of the mealdescription property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMEALDESCRIPTION() {
            return mealdescription;
        }

        /**
         * Sets the value of the mealdescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMEALDESCRIPTION(Object value) {
            this.mealdescription = value;
        }

        /**
         * Gets the value of the listfrequentflyer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfrequentflyer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFREQUENTFLYER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER }
         * 
         * 
         */
        public List<LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER> getLISTFREQUENTFLYER() {
            if (listfrequentflyer == null) {
                listfrequentflyer = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER>();
            }
            return this.listfrequentflyer;
        }

        /**
         * Gets the value of the listtravellerclid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellerclid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERCLID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.AIRPREFERENCES.LISTTRAVELLERCLID }
         * 
         * 
         */
        public List<LISTPREFERENCES.AIRPREFERENCES.LISTTRAVELLERCLID> getLISTTRAVELLERCLID() {
            if (listtravellerclid == null) {
                listtravellerclid = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTTRAVELLERCLID>();
            }
            return this.listtravellerclid;
        }

        /**
         * Gets the value of the listdiscountcard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listdiscountcard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTDISCOUNTCARD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD }
         * 
         * 
         */
        public List<LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD> getLISTDISCOUNTCARD() {
            if (listdiscountcard == null) {
                listdiscountcard = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD>();
            }
            return this.listdiscountcard;
        }

        /**
         * Gets the value of the listaccountcard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listaccountcard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTACCOUNTCARD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD }
         * 
         * 
         */
        public List<LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD> getLISTACCOUNTCARD() {
            if (listaccountcard == null) {
                listaccountcard = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD>();
            }
            return this.listaccountcard;
        }

        /**
         * Gets the value of the listadditionalseat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listadditionalseat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTADDITIONALSEAT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT }
         * 
         * 
         */
        public List<LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT> getLISTADDITIONALSEAT() {
            if (listadditionalseat == null) {
                listadditionalseat = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT>();
            }
            return this.listadditionalseat;
        }

        /**
         * Gets the value of the listmilesaccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listmilesaccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTMILESACCOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.AIRPREFERENCES.LISTMILESACCOUNT }
         * 
         * 
         */
        public List<LISTPREFERENCES.AIRPREFERENCES.LISTMILESACCOUNT> getLISTMILESACCOUNT() {
            if (listmilesaccount == null) {
                listmilesaccount = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTMILESACCOUNT>();
            }
            return this.listmilesaccount;
        }

        /**
         * Gets the value of the listredemptionaccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listredemptionaccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTREDEMPTIONACCOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTREDEMPTIONACCOUNTType }
         * 
         * 
         */
        public List<LISTREDEMPTIONACCOUNTType> getLISTREDEMPTIONACCOUNT() {
            if (listredemptionaccount == null) {
                listredemptionaccount = new ArrayList<LISTREDEMPTIONACCOUNTType>();
            }
            return this.listredemptionaccount;
        }

        /**
         * Gets the value of the listupgradeaccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listupgradeaccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTUPGRADEACCOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.AIRPREFERENCES.LISTUPGRADEACCOUNT }
         * 
         * 
         */
        public List<LISTPREFERENCES.AIRPREFERENCES.LISTUPGRADEACCOUNT> getLISTUPGRADEACCOUNT() {
            if (listupgradeaccount == null) {
                listupgradeaccount = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTUPGRADEACCOUNT>();
            }
            return this.listupgradeaccount;
        }

        /**
         * Gets the value of the listfrequentflyerproductassociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfrequentflyerproductassociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFREQUENTFLYERPRODUCTASSOCIATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FREQUENTFLYERREFERENCETYPE }
         * 
         * 
         */
        public List<FREQUENTFLYERREFERENCETYPE> getLISTFREQUENTFLYERPRODUCTASSOCIATION() {
            if (listfrequentflyerproductassociation == null) {
                listfrequentflyerproductassociation = new ArrayList<FREQUENTFLYERREFERENCETYPE>();
            }
            return this.listfrequentflyerproductassociation;
        }

        /**
         * Gets the value of the listservicingaccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listservicingaccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSERVICINGACCOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.AIRPREFERENCES.LISTSERVICINGACCOUNT }
         * 
         * 
         */
        public List<LISTPREFERENCES.AIRPREFERENCES.LISTSERVICINGACCOUNT> getLISTSERVICINGACCOUNT() {
            if (listservicingaccount == null) {
                listservicingaccount = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTSERVICINGACCOUNT>();
            }
            return this.listservicingaccount;
        }

        /**
         * Gets the value of the dcsseatassignment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCSSEATASSIGNMENT() {
            return dcsseatassignment;
        }

        /**
         * Sets the value of the dcsseatassignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCSSEATASSIGNMENT(String value) {
            this.dcsseatassignment = value;
        }

        /**
         * Gets the value of the discrepancyinseat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDISCREPANCYINSEAT() {
            return discrepancyinseat;
        }

        /**
         * Sets the value of the discrepancyinseat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDISCREPANCYINSEAT(Boolean value) {
            this.discrepancyinseat = value;
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
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="F"/&gt;
         *               &lt;enumeration value="B"/&gt;
         *               &lt;enumeration value="E"/&gt;
         *               &lt;enumeration value="R"/&gt;
         *               &lt;enumeration value="M"/&gt;
         *               &lt;enumeration value="X"/&gt;
         *               &lt;enumeration value="S"/&gt;
         *               &lt;enumeration value="N"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class CABIN
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class HOMEAIRPORT
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
         *       &lt;all&gt;
         *         &lt;element name="ACCOUNT_CARD_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNT_CARD_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNT_CARD_STATUS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NAME" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="20"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="DETAILS" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="20"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ACCOUNT_CARD_INFORMATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="CFF_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="FARE_RULES" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="START_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
         *         &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
         *         &lt;element name="IS_PHYSIC_CARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="LIST_CORPORATE_NUMBER" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
        public static class LISTACCOUNTCARD
            implements Serializable
        {

            @XmlElement(name = "ACCOUNT_CARD_TYPE")
            protected String accountcardtype;
            @XmlElement(name = "IS_SELECTED")
            protected Boolean isselected;
            @XmlElement(name = "ACCOUNT_CARD_ID")
            protected BigInteger accountcardid;
            @XmlElement(name = "ACCOUNT_CARD_NUMBER")
            protected String accountcardnumber;
            @XmlElement(name = "ACCOUNT_CARD_STATUS")
            protected LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.ACCOUNTCARDSTATUS accountcardstatus;
            @XmlElement(name = "ACCOUNT_CARD_INFORMATION")
            protected String accountcardinformation;
            @XmlElement(name = "CFF_CODE")
            protected String cffcode;
            @XmlElement(name = "FARE_RULES")
            protected String farerules;
            @XmlElement(name = "START_DATE")
            protected DATETYPEPROFILE startdate;
            @XmlElement(name = "EXPIRY_DATE")
            protected DATETYPEPROFILE expirydate;
            @XmlElement(name = "IS_PHYSIC_CARD")
            protected Boolean isphysiccard;
            @XmlElement(name = "LIST_CORPORATE_NUMBER")
            protected LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.LISTCORPORATENUMBER listcorporatenumber;

            /**
             * Gets the value of the accountcardtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTCARDTYPE() {
                return accountcardtype;
            }

            /**
             * Sets the value of the accountcardtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTCARDTYPE(String value) {
                this.accountcardtype = value;
            }

            /**
             * Gets the value of the isselected property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISSELECTED() {
                return isselected;
            }

            /**
             * Sets the value of the isselected property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISSELECTED(Boolean value) {
                this.isselected = value;
            }

            /**
             * Gets the value of the accountcardid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getACCOUNTCARDID() {
                return accountcardid;
            }

            /**
             * Sets the value of the accountcardid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setACCOUNTCARDID(BigInteger value) {
                this.accountcardid = value;
            }

            /**
             * Gets the value of the accountcardnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTCARDNUMBER() {
                return accountcardnumber;
            }

            /**
             * Sets the value of the accountcardnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTCARDNUMBER(String value) {
                this.accountcardnumber = value;
            }

            /**
             * Gets the value of the accountcardstatus property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.ACCOUNTCARDSTATUS }
             *     
             */
            public LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.ACCOUNTCARDSTATUS getACCOUNTCARDSTATUS() {
                return accountcardstatus;
            }

            /**
             * Sets the value of the accountcardstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.ACCOUNTCARDSTATUS }
             *     
             */
            public void setACCOUNTCARDSTATUS(LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.ACCOUNTCARDSTATUS value) {
                this.accountcardstatus = value;
            }

            /**
             * Gets the value of the accountcardinformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTCARDINFORMATION() {
                return accountcardinformation;
            }

            /**
             * Sets the value of the accountcardinformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTCARDINFORMATION(String value) {
                this.accountcardinformation = value;
            }

            /**
             * Gets the value of the cffcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCFFCODE() {
                return cffcode;
            }

            /**
             * Sets the value of the cffcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCFFCODE(String value) {
                this.cffcode = value;
            }

            /**
             * Gets the value of the farerules property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFARERULES() {
                return farerules;
            }

            /**
             * Sets the value of the farerules property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFARERULES(String value) {
                this.farerules = value;
            }

            /**
             * Gets the value of the startdate property.
             * 
             * @return
             *     possible object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public DATETYPEPROFILE getSTARTDATE() {
                return startdate;
            }

            /**
             * Sets the value of the startdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public void setSTARTDATE(DATETYPEPROFILE value) {
                this.startdate = value;
            }

            /**
             * Gets the value of the expirydate property.
             * 
             * @return
             *     possible object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public DATETYPEPROFILE getEXPIRYDATE() {
                return expirydate;
            }

            /**
             * Sets the value of the expirydate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public void setEXPIRYDATE(DATETYPEPROFILE value) {
                this.expirydate = value;
            }

            /**
             * Gets the value of the isphysiccard property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISPHYSICCARD() {
                return isphysiccard;
            }

            /**
             * Sets the value of the isphysiccard property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISPHYSICCARD(Boolean value) {
                this.isphysiccard = value;
            }

            /**
             * Gets the value of the listcorporatenumber property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.LISTCORPORATENUMBER }
             *     
             */
            public LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.LISTCORPORATENUMBER getLISTCORPORATENUMBER() {
                return listcorporatenumber;
            }

            /**
             * Sets the value of the listcorporatenumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.LISTCORPORATENUMBER }
             *     
             */
            public void setLISTCORPORATENUMBER(LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.LISTCORPORATENUMBER value) {
                this.listcorporatenumber = value;
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
             *         &lt;element name="CODE"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;maxLength value="2"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NAME" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="20"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="DETAILS" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="20"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
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
            public static class ACCOUNTCARDSTATUS
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;
                @XmlElement(name = "DETAILS")
                protected String details;

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

                /**
                 * Gets the value of the details property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDETAILS() {
                    return details;
                }

                /**
                 * Sets the value of the details property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDETAILS(String value) {
                    this.details = value;
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
             *         &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
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
                "corporatenumber"
            })
            public static class LISTCORPORATENUMBER
                implements Serializable
            {

                @XmlElement(name = "CORPORATE_NUMBER", required = true)
                protected String corporatenumber;

                /**
                 * Gets the value of the corporatenumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCORPORATENUMBER() {
                    return corporatenumber;
                }

                /**
                 * Sets the value of the corporatenumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCORPORATENUMBER(String value) {
                    this.corporatenumber = value;
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
         *         &lt;element name="ADDITIONAL_SEAT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="IS_ONE_TICKET_PRICING_MODE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_TWO_TICKET_PRICING_MODE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="SEAT_ASSIGNMENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="LIST_SEAT_CHARACTERISTIC" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="40"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
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
            "additionalseatid",
            "code",
            "name",
            "isoneticketpricingmode",
            "istwoticketpricingmode",
            "seatassignment",
            "listseatcharacteristic"
        })
        public static class LISTADDITIONALSEAT
            implements Serializable
        {

            @XmlElement(name = "ADDITIONAL_SEAT_ID", required = true)
            protected Object additionalseatid;
            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "NAME")
            protected String name;
            @XmlElement(name = "IS_ONE_TICKET_PRICING_MODE")
            protected Boolean isoneticketpricingmode;
            @XmlElement(name = "IS_TWO_TICKET_PRICING_MODE")
            protected Boolean istwoticketpricingmode;
            @XmlElement(name = "SEAT_ASSIGNMENT")
            protected String seatassignment;
            @XmlElement(name = "LIST_SEAT_CHARACTERISTIC")
            protected List<LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT.LISTSEATCHARACTERISTIC> listseatcharacteristic;

            /**
             * Gets the value of the additionalseatid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getADDITIONALSEATID() {
                return additionalseatid;
            }

            /**
             * Sets the value of the additionalseatid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setADDITIONALSEATID(Object value) {
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

            /**
             * Gets the value of the isoneticketpricingmode property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISONETICKETPRICINGMODE() {
                return isoneticketpricingmode;
            }

            /**
             * Sets the value of the isoneticketpricingmode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISONETICKETPRICINGMODE(Boolean value) {
                this.isoneticketpricingmode = value;
            }

            /**
             * Gets the value of the istwoticketpricingmode property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISTWOTICKETPRICINGMODE() {
                return istwoticketpricingmode;
            }

            /**
             * Sets the value of the istwoticketpricingmode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISTWOTICKETPRICINGMODE(Boolean value) {
                this.istwoticketpricingmode = value;
            }

            /**
             * Gets the value of the seatassignment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEATASSIGNMENT() {
                return seatassignment;
            }

            /**
             * Sets the value of the seatassignment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEATASSIGNMENT(String value) {
                this.seatassignment = value;
            }

            /**
             * Gets the value of the listseatcharacteristic property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listseatcharacteristic property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTSEATCHARACTERISTIC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT.LISTSEATCHARACTERISTIC }
             * 
             * 
             */
            public List<LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT.LISTSEATCHARACTERISTIC> getLISTSEATCHARACTERISTIC() {
                if (listseatcharacteristic == null) {
                    listseatcharacteristic = new ArrayList<LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT.LISTSEATCHARACTERISTIC>();
                }
                return this.listseatcharacteristic;
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
             *         &lt;element name="NAME" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="40"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
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
            public static class LISTSEATCHARACTERISTIC
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
         *       &lt;all&gt;
         *         &lt;element name="DISCOUNT_CARD_TYPE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="OWNER_FIRSTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="OWNER_LASTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="DISCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
         *         &lt;element name="COMPANY_INFORMATION"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
        public static class LISTDISCOUNTCARD
            implements Serializable
        {

            @XmlElement(name = "DISCOUNT_CARD_TYPE", required = true)
            protected String discountcardtype;
            @XmlElement(name = "OWNER_FIRSTNAME")
            protected Object ownerfirstname;
            @XmlElement(name = "OWNER_LASTNAME")
            protected Object ownerlastname;
            @XmlElement(name = "IS_SELECTED")
            protected Boolean isselected;
            @XmlElement(name = "DISCOUNT_CARD_ID", required = true)
            protected BigInteger discountcardid;
            @XmlElement(name = "EXPIRY_DATE")
            protected DATETYPEPROFILE expirydate;
            @XmlElement(name = "COMPANY_INFORMATION", required = true)
            protected LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD.COMPANYINFORMATION companyinformation;

            /**
             * Gets the value of the discountcardtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISCOUNTCARDTYPE() {
                return discountcardtype;
            }

            /**
             * Sets the value of the discountcardtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISCOUNTCARDTYPE(String value) {
                this.discountcardtype = value;
            }

            /**
             * Gets the value of the ownerfirstname property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getOWNERFIRSTNAME() {
                return ownerfirstname;
            }

            /**
             * Sets the value of the ownerfirstname property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setOWNERFIRSTNAME(Object value) {
                this.ownerfirstname = value;
            }

            /**
             * Gets the value of the ownerlastname property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getOWNERLASTNAME() {
                return ownerlastname;
            }

            /**
             * Sets the value of the ownerlastname property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setOWNERLASTNAME(Object value) {
                this.ownerlastname = value;
            }

            /**
             * Gets the value of the isselected property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISSELECTED() {
                return isselected;
            }

            /**
             * Sets the value of the isselected property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISSELECTED(Boolean value) {
                this.isselected = value;
            }

            /**
             * Gets the value of the discountcardid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDISCOUNTCARDID() {
                return discountcardid;
            }

            /**
             * Sets the value of the discountcardid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDISCOUNTCARDID(BigInteger value) {
                this.discountcardid = value;
            }

            /**
             * Gets the value of the expirydate property.
             * 
             * @return
             *     possible object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public DATETYPEPROFILE getEXPIRYDATE() {
                return expirydate;
            }

            /**
             * Sets the value of the expirydate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public void setEXPIRYDATE(DATETYPEPROFILE value) {
                this.expirydate = value;
            }

            /**
             * Gets the value of the companyinformation property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD.COMPANYINFORMATION }
             *     
             */
            public LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD.COMPANYINFORMATION getCOMPANYINFORMATION() {
                return companyinformation;
            }

            /**
             * Sets the value of the companyinformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD.COMPANYINFORMATION }
             *     
             */
            public void setCOMPANYINFORMATION(LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD.COMPANYINFORMATION value) {
                this.companyinformation = value;
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
             *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
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
            public static class COMPANYINFORMATION
                implements Serializable
            {

                @XmlElement(name = "COMPANY_ACCOUNT_ID", required = true)
                protected BigInteger companyaccountid;
                @XmlElement(name = "ACCOUNT_NUMBER", required = true)
                protected String accountnumber;
                @XmlElement(name = "COMPANY", required = true)
                protected CODENAMEPAIRTYPE company;

                /**
                 * Gets the value of the companyaccountid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCOMPANYACCOUNTID() {
                    return companyaccountid;
                }

                /**
                 * Sets the value of the companyaccountid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCOMPANYACCOUNTID(BigInteger value) {
                    this.companyaccountid = value;
                }

                /**
                 * Gets the value of the accountnumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getACCOUNTNUMBER() {
                    return accountnumber;
                }

                /**
                 * Sets the value of the accountnumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setACCOUNTNUMBER(String value) {
                    this.accountnumber = value;
                }

                /**
                 * Gets the value of the company property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CODENAMEPAIRTYPE }
                 *     
                 */
                public CODENAMEPAIRTYPE getCOMPANY() {
                    return company;
                }

                /**
                 * Sets the value of the company property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CODENAMEPAIRTYPE }
                 *     
                 */
                public void setCOMPANY(CODENAMEPAIRTYPE value) {
                    this.company = value;
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
         *     &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE"&gt;
         *       &lt;attribute name="isValid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LISTFREQUENTFLYER
            extends LISTFREQUENTFLYERTYPE
            implements Serializable
        {

            @XmlAttribute(name = "isValid")
            protected String isValid;

            /**
             * Gets the value of the isValid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsValid() {
                return isValid;
            }

            /**
             * Sets the value of the isValid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsValid(String value) {
                this.isValid = value;
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
         *         &lt;element name="MILES_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="FREQUENT_FLYER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element ref="{}LIST_STATUS" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FUNCTIONAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "milesaccountid",
            "frequentflyerid",
            "liststatus",
            "comment",
            "functionalid"
        })
        public static class LISTMILESACCOUNT
            implements Serializable
        {

            @XmlElement(name = "MILES_ACCOUNT_ID")
            protected BigInteger milesaccountid;
            @XmlElement(name = "FREQUENT_FLYER_ID", required = true)
            protected BigInteger frequentflyerid;
            @XmlElement(name = "LIST_STATUS")
            protected List<LISTSTATUS> liststatus;
            @XmlElement(name = "COMMENT")
            protected String comment;
            @XmlElement(name = "FUNCTIONAL_ID")
            protected String functionalid;

            /**
             * Gets the value of the milesaccountid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMILESACCOUNTID() {
                return milesaccountid;
            }

            /**
             * Sets the value of the milesaccountid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMILESACCOUNTID(BigInteger value) {
                this.milesaccountid = value;
            }

            /**
             * Gets the value of the frequentflyerid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFREQUENTFLYERID() {
                return frequentflyerid;
            }

            /**
             * Sets the value of the frequentflyerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFREQUENTFLYERID(BigInteger value) {
                this.frequentflyerid = value;
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
             * {@link LISTSTATUS }
             * 
             * 
             */
            public List<LISTSTATUS> getLISTSTATUS() {
                if (liststatus == null) {
                    liststatus = new ArrayList<LISTSTATUS>();
                }
                return this.liststatus;
            }

            /**
             * Gets the value of the comment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMENT() {
                return comment;
            }

            /**
             * Sets the value of the comment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMENT(String value) {
                this.comment = value;
            }

            /**
             * Gets the value of the functionalid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFUNCTIONALID() {
                return functionalid;
            }

            /**
             * Sets the value of the functionalid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFUNCTIONALID(String value) {
                this.functionalid = value;
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
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class LISTSEATCHARACTERISTIC
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
         *         &lt;element name="SERVICING_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="FREQUENT_FLYER_ID" type="{}unprotectedStringType"/&gt;
         *         &lt;element ref="{}LIST_STATUS" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FUNCTIONAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "servicingaccountid",
            "frequentflyerid",
            "liststatus",
            "comment",
            "functionalid"
        })
        public static class LISTSERVICINGACCOUNT
            implements Serializable
        {

            @XmlElement(name = "SERVICING_ACCOUNT_ID", required = true)
            protected BigInteger servicingaccountid;
            @XmlElement(name = "FREQUENT_FLYER_ID", required = true)
            protected String frequentflyerid;
            @XmlElement(name = "LIST_STATUS")
            protected List<LISTSTATUS> liststatus;
            @XmlElement(name = "COMMENT")
            protected String comment;
            @XmlElement(name = "FUNCTIONAL_ID")
            protected String functionalid;

            /**
             * Gets the value of the servicingaccountid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSERVICINGACCOUNTID() {
                return servicingaccountid;
            }

            /**
             * Sets the value of the servicingaccountid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSERVICINGACCOUNTID(BigInteger value) {
                this.servicingaccountid = value;
            }

            /**
             * Gets the value of the frequentflyerid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFREQUENTFLYERID() {
                return frequentflyerid;
            }

            /**
             * Sets the value of the frequentflyerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFREQUENTFLYERID(String value) {
                this.frequentflyerid = value;
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
             * {@link LISTSTATUS }
             * 
             * 
             */
            public List<LISTSTATUS> getLISTSTATUS() {
                if (liststatus == null) {
                    liststatus = new ArrayList<LISTSTATUS>();
                }
                return this.liststatus;
            }

            /**
             * Gets the value of the comment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMENT() {
                return comment;
            }

            /**
             * Sets the value of the comment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMENT(String value) {
                this.comment = value;
            }

            /**
             * Gets the value of the functionalid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFUNCTIONALID() {
                return functionalid;
            }

            /**
             * Sets the value of the functionalid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFUNCTIONALID(String value) {
                this.functionalid = value;
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
         *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="CLID_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "index",
            "carriercode",
            "clididentifier"
        })
        public static class LISTTRAVELLERCLID
            implements Serializable
        {

            @XmlElement(name = "INDEX", required = true)
            protected BigInteger index;
            @XmlElement(name = "CARRIER_CODE", required = true)
            protected Object carriercode;
            @XmlElement(name = "CLID_IDENTIFIER", required = true)
            protected Object clididentifier;

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
             * Gets the value of the carriercode property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCARRIERCODE() {
                return carriercode;
            }

            /**
             * Sets the value of the carriercode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCARRIERCODE(Object value) {
                this.carriercode = value;
            }

            /**
             * Gets the value of the clididentifier property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCLIDIDENTIFIER() {
                return clididentifier;
            }

            /**
             * Sets the value of the clididentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCLIDIDENTIFIER(Object value) {
                this.clididentifier = value;
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
         *     &lt;extension base="{}LIST_REDEMPTION_ACCOUNTType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ORIGINAL_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="BOOKING_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "originalclass",
            "bookingclass"
        })
        public static class LISTUPGRADEACCOUNT
            extends LISTREDEMPTIONACCOUNTType
            implements Serializable
        {

            @XmlElement(name = "ORIGINAL_CLASS")
            protected String originalclass;
            @XmlElement(name = "BOOKING_CLASS")
            protected String bookingclass;

            /**
             * Gets the value of the originalclass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getORIGINALCLASS() {
                return originalclass;
            }

            /**
             * Sets the value of the originalclass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setORIGINALCLASS(String value) {
                this.originalclass = value;
            }

            /**
             * Gets the value of the bookingclass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBOOKINGCLASS() {
                return bookingclass;
            }

            /**
             * Sets the value of the bookingclass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBOOKINGCLASS(String value) {
                this.bookingclass = value;
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
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="AVML"/&gt;
         *               &lt;enumeration value="AHML"/&gt;
         *               &lt;enumeration value="ALAB"/&gt;
         *               &lt;enumeration value="BBML"/&gt;
         *               &lt;enumeration value="BLML"/&gt;
         *               &lt;enumeration value="CHML"/&gt;
         *               &lt;enumeration value="CHKN"/&gt;
         *               &lt;enumeration value="CKML"/&gt;
         *               &lt;enumeration value="DBML"/&gt;
         *               &lt;enumeration value="DLFR"/&gt;
         *               &lt;enumeration value="FPML"/&gt;
         *               &lt;enumeration value="FRNK"/&gt;
         *               &lt;enumeration value="GAHB"/&gt;
         *               &lt;enumeration value="GFML"/&gt;
         *               &lt;enumeration value="HBGR"/&gt;
         *               &lt;enumeration value="HFML"/&gt;
         *               &lt;enumeration value="HNML"/&gt;
         *               &lt;enumeration value="IVML"/&gt;
         *               &lt;enumeration value="KSML"/&gt;
         *               &lt;enumeration value="LCML"/&gt;
         *               &lt;enumeration value="LCRB"/&gt;
         *               &lt;enumeration value="LDML"/&gt;
         *               &lt;enumeration value="LFML"/&gt;
         *               &lt;enumeration value="LPML"/&gt;
         *               &lt;enumeration value="LSML"/&gt;
         *               &lt;enumeration value="MOML"/&gt;
         *               &lt;enumeration value="NLML"/&gt;
         *               &lt;enumeration value="NSML"/&gt;
         *               &lt;enumeration value="ORML"/&gt;
         *               &lt;enumeration value="PBJS"/&gt;
         *               &lt;enumeration value="PFML"/&gt;
         *               &lt;enumeration value="PRML"/&gt;
         *               &lt;enumeration value="PWML"/&gt;
         *               &lt;enumeration value="RFML"/&gt;
         *               &lt;enumeration value="RVML"/&gt;
         *               &lt;enumeration value="SAML"/&gt;
         *               &lt;enumeration value="SFPL"/&gt;
         *               &lt;enumeration value="SHML"/&gt;
         *               &lt;enumeration value="SFML"/&gt;
         *               &lt;enumeration value="SPML"/&gt;
         *               &lt;enumeration value="STRD"/&gt;
         *               &lt;enumeration value="TDML"/&gt;
         *               &lt;enumeration value="TFML"/&gt;
         *               &lt;enumeration value="VGML"/&gt;
         *               &lt;enumeration value="VLML"/&gt;
         *               &lt;enumeration value="VOML"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class MEAL
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;length value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="20"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class MEALSTATUS
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
         *       &lt;all&gt;
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="ST"/&gt;
         *               &lt;enumeration value="SA"/&gt;
         *               &lt;enumeration value="SC"/&gt;
         *               &lt;enumeration value="SW"/&gt;
         *               &lt;enumeration value="SB"/&gt;
         *               &lt;enumeration value=""/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class SEATLOCATION
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;maxLength value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="50"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class SEATSTATUS
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="00"/&gt;
         *               &lt;enumeration value="NS"/&gt;
         *               &lt;enumeration value="SM"/&gt;
         *               &lt;enumeration value=""/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class SMOKING
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
     *         &lt;element name="SMOKING" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WHEELCHAIR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="MILES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="LIST_FREQUENT_CAR_RENTER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_CAR_FREQUENT_FLYER" type="{}LIST_FREQUENT_FLYER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CORPORATE_COMPANY_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_CAR_ACCREDITIVE_CARDS" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="ACCREDITIVE_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
     *                   &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE"/&gt;
     *                   &lt;element name="DISCOUNT_CARD_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "smoking",
        "wheelchair",
        "miles",
        "listfrequentcarrenter",
        "listcarfrequentflyer",
        "listcorporatecompanyinformation",
        "listcaraccreditivecards"
    })
    public static class CARPREFERENCES
        implements Serializable
    {

        @XmlElement(name = "SMOKING")
        protected LISTPREFERENCES.CARPREFERENCES.SMOKING smoking;
        @XmlElement(name = "WHEELCHAIR")
        protected Boolean wheelchair;
        @XmlElement(name = "MILES")
        protected Boolean miles;
        @XmlElement(name = "LIST_FREQUENT_CAR_RENTER")
        protected List<LISTPREFERENCES.CARPREFERENCES.LISTFREQUENTCARRENTER> listfrequentcarrenter;
        @XmlElement(name = "LIST_CAR_FREQUENT_FLYER")
        protected List<LISTFREQUENTFLYERTYPE> listcarfrequentflyer;
        @XmlElement(name = "LIST_CORPORATE_COMPANY_INFORMATION")
        protected List<LISTPREFERENCES.CARPREFERENCES.LISTCORPORATECOMPANYINFORMATION> listcorporatecompanyinformation;
        @XmlElement(name = "LIST_CAR_ACCREDITIVE_CARDS")
        protected List<LISTPREFERENCES.CARPREFERENCES.LISTCARACCREDITIVECARDS> listcaraccreditivecards;

        /**
         * Gets the value of the smoking property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.CARPREFERENCES.SMOKING }
         *     
         */
        public LISTPREFERENCES.CARPREFERENCES.SMOKING getSMOKING() {
            return smoking;
        }

        /**
         * Sets the value of the smoking property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.CARPREFERENCES.SMOKING }
         *     
         */
        public void setSMOKING(LISTPREFERENCES.CARPREFERENCES.SMOKING value) {
            this.smoking = value;
        }

        /**
         * Gets the value of the wheelchair property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWHEELCHAIR() {
            return wheelchair;
        }

        /**
         * Sets the value of the wheelchair property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWHEELCHAIR(Boolean value) {
            this.wheelchair = value;
        }

        /**
         * Gets the value of the miles property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMILES() {
            return miles;
        }

        /**
         * Sets the value of the miles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMILES(Boolean value) {
            this.miles = value;
        }

        /**
         * Gets the value of the listfrequentcarrenter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfrequentcarrenter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFREQUENTCARRENTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.CARPREFERENCES.LISTFREQUENTCARRENTER }
         * 
         * 
         */
        public List<LISTPREFERENCES.CARPREFERENCES.LISTFREQUENTCARRENTER> getLISTFREQUENTCARRENTER() {
            if (listfrequentcarrenter == null) {
                listfrequentcarrenter = new ArrayList<LISTPREFERENCES.CARPREFERENCES.LISTFREQUENTCARRENTER>();
            }
            return this.listfrequentcarrenter;
        }

        /**
         * Gets the value of the listcarfrequentflyer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcarfrequentflyer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCARFREQUENTFLYER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTFREQUENTFLYERTYPE }
         * 
         * 
         */
        public List<LISTFREQUENTFLYERTYPE> getLISTCARFREQUENTFLYER() {
            if (listcarfrequentflyer == null) {
                listcarfrequentflyer = new ArrayList<LISTFREQUENTFLYERTYPE>();
            }
            return this.listcarfrequentflyer;
        }

        /**
         * Gets the value of the listcorporatecompanyinformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcorporatecompanyinformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCORPORATECOMPANYINFORMATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.CARPREFERENCES.LISTCORPORATECOMPANYINFORMATION }
         * 
         * 
         */
        public List<LISTPREFERENCES.CARPREFERENCES.LISTCORPORATECOMPANYINFORMATION> getLISTCORPORATECOMPANYINFORMATION() {
            if (listcorporatecompanyinformation == null) {
                listcorporatecompanyinformation = new ArrayList<LISTPREFERENCES.CARPREFERENCES.LISTCORPORATECOMPANYINFORMATION>();
            }
            return this.listcorporatecompanyinformation;
        }

        /**
         * Gets the value of the listcaraccreditivecards property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcaraccreditivecards property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCARACCREDITIVECARDS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.CARPREFERENCES.LISTCARACCREDITIVECARDS }
         * 
         * 
         */
        public List<LISTPREFERENCES.CARPREFERENCES.LISTCARACCREDITIVECARDS> getLISTCARACCREDITIVECARDS() {
            if (listcaraccreditivecards == null) {
                listcaraccreditivecards = new ArrayList<LISTPREFERENCES.CARPREFERENCES.LISTCARACCREDITIVECARDS>();
            }
            return this.listcaraccreditivecards;
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
         *         &lt;element name="ACCREDITIVE_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
         *         &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE"/&gt;
         *         &lt;element name="DISCOUNT_CARD_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        public static class LISTCARACCREDITIVECARDS
            implements Serializable
        {

            @XmlElement(name = "ACCREDITIVE_CARD_ID", required = true)
            protected BigInteger accreditivecardid;
            @XmlElement(name = "ACCOUNT_NUMBER", required = true)
            protected String accountnumber;
            @XmlElement(name = "COMPANY", required = true)
            protected CODENAMEPAIRTYPE company;
            @XmlElement(name = "EXPIRY_DATE", required = true)
            protected DATETYPEPROFILE expirydate;
            @XmlElement(name = "DISCOUNT_CARD_TYPE")
            protected String discountcardtype;

            /**
             * Gets the value of the accreditivecardid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getACCREDITIVECARDID() {
                return accreditivecardid;
            }

            /**
             * Sets the value of the accreditivecardid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setACCREDITIVECARDID(BigInteger value) {
                this.accreditivecardid = value;
            }

            /**
             * Gets the value of the accountnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTNUMBER() {
                return accountnumber;
            }

            /**
             * Sets the value of the accountnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTNUMBER(String value) {
                this.accountnumber = value;
            }

            /**
             * Gets the value of the company property.
             * 
             * @return
             *     possible object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public CODENAMEPAIRTYPE getCOMPANY() {
                return company;
            }

            /**
             * Sets the value of the company property.
             * 
             * @param value
             *     allowed object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public void setCOMPANY(CODENAMEPAIRTYPE value) {
                this.company = value;
            }

            /**
             * Gets the value of the expirydate property.
             * 
             * @return
             *     possible object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public DATETYPEPROFILE getEXPIRYDATE() {
                return expirydate;
            }

            /**
             * Sets the value of the expirydate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public void setEXPIRYDATE(DATETYPEPROFILE value) {
                this.expirydate = value;
            }

            /**
             * Gets the value of the discountcardtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISCOUNTCARDTYPE() {
                return discountcardtype;
            }

            /**
             * Sets the value of the discountcardtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISCOUNTCARDTYPE(String value) {
                this.discountcardtype = value;
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
         *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
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
        public static class LISTCORPORATECOMPANYINFORMATION
            implements Serializable
        {

            @XmlElement(name = "COMPANY_ACCOUNT_ID", required = true)
            protected BigInteger companyaccountid;
            @XmlElement(name = "ACCOUNT_NUMBER", required = true)
            protected String accountnumber;
            @XmlElement(name = "COMPANY", required = true)
            protected CODENAMEPAIRTYPE company;

            /**
             * Gets the value of the companyaccountid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCOMPANYACCOUNTID() {
                return companyaccountid;
            }

            /**
             * Sets the value of the companyaccountid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCOMPANYACCOUNTID(BigInteger value) {
                this.companyaccountid = value;
            }

            /**
             * Gets the value of the accountnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTNUMBER() {
                return accountnumber;
            }

            /**
             * Sets the value of the accountnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTNUMBER(String value) {
                this.accountnumber = value;
            }

            /**
             * Gets the value of the company property.
             * 
             * @return
             *     possible object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public CODENAMEPAIRTYPE getCOMPANY() {
                return company;
            }

            /**
             * Sets the value of the company property.
             * 
             * @param value
             *     allowed object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public void setCOMPANY(CODENAMEPAIRTYPE value) {
                this.company = value;
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
         *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
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
        public static class LISTFREQUENTCARRENTER
            implements Serializable
        {

            @XmlElement(name = "COMPANY_ACCOUNT_ID", required = true)
            protected BigInteger companyaccountid;
            @XmlElement(name = "ACCOUNT_NUMBER", required = true)
            protected String accountnumber;
            @XmlElement(name = "COMPANY", required = true)
            protected CODENAMEPAIRTYPE company;

            /**
             * Gets the value of the companyaccountid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCOMPANYACCOUNTID() {
                return companyaccountid;
            }

            /**
             * Sets the value of the companyaccountid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCOMPANYACCOUNTID(BigInteger value) {
                this.companyaccountid = value;
            }

            /**
             * Gets the value of the accountnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTNUMBER() {
                return accountnumber;
            }

            /**
             * Sets the value of the accountnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTNUMBER(String value) {
                this.accountnumber = value;
            }

            /**
             * Gets the value of the company property.
             * 
             * @return
             *     possible object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public CODENAMEPAIRTYPE getCOMPANY() {
                return company;
            }

            /**
             * Sets the value of the company property.
             * 
             * @param value
             *     allowed object is
             *     {@link CODENAMEPAIRTYPE }
             *     
             */
            public void setCOMPANY(CODENAMEPAIRTYPE value) {
                this.company = value;
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
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class SMOKING
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
     *         &lt;element name="MEMBERSHIP_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "membershipnumber"
    })
    public static class COMMONPREFERENCES
        implements Serializable
    {

        @XmlElement(name = "MEMBERSHIP_NUMBER")
        protected Object membershipnumber;

        /**
         * Gets the value of the membershipnumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMEMBERSHIPNUMBER() {
            return membershipnumber;
        }

        /**
         * Sets the value of the membershipnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMEMBERSHIPNUMBER(Object value) {
            this.membershipnumber = value;
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
     *         &lt;element name="CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="3"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     *       &lt;all&gt;
     *         &lt;element name="CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="3"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="40"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
    public static class FAVOURITEDESTINATION
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
     *         &lt;element name="CATEGORY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="F"/&gt;
     *                         &lt;enumeration value="S"/&gt;
     *                         &lt;enumeration value="L"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SORTING_CRITERIA" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ROOM_PREFERENCES" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="ROOM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BED_TYPE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;enumeration value="0"/&gt;
     *                                   &lt;enumeration value="D"/&gt;
     *                                   &lt;enumeration value="K"/&gt;
     *                                   &lt;enumeration value="P"/&gt;
     *                                   &lt;enumeration value="Q"/&gt;
     *                                   &lt;enumeration value="S"/&gt;
     *                                   &lt;enumeration value="T"/&gt;
     *                                   &lt;enumeration value="W"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NAME" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="40"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SMOKING" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;enumeration value="ST"/&gt;
     *                                   &lt;enumeration value="NS"/&gt;
     *                                   &lt;enumeration value="00"/&gt;
     *                                   &lt;enumeration value="SM"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CRIB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="WHEELCHAIR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_CORPORATE_GUEST" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CORPORATE_GUEST" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="COMPANY"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="CODE"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{}unprotectedStringType"&gt;
     *                                             &lt;length value="2"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="NAME" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;minLength value="1"/&gt;
     *                                             &lt;maxLength value="40"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/all&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PER_PAGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LIST_FREQUENT_GUEST" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="COMPANY"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="40"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CHECKIN" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CHECKOUT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_SPECIAL_SERVICE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="CHAMP"/&gt;
     *                         &lt;enumeration value="CRIB"/&gt;
     *                         &lt;enumeration value="NEWS"/&gt;
     *                         &lt;enumeration value="DISABLE"/&gt;
     *                         &lt;enumeration value="PET"/&gt;
     *                         &lt;enumeration value="BED"/&gt;
     *                         &lt;enumeration value="PERSON"/&gt;
     *                         &lt;enumeration value="FLOWER"/&gt;
     *                         &lt;enumeration value="FREQ"/&gt;
     *                         &lt;enumeration value="GMEMBER"/&gt;
     *                         &lt;enumeration value="WWW"/&gt;
     *                         &lt;enumeration value="MOON"/&gt;
     *                         &lt;enumeration value="UNDER4"/&gt;
     *                         &lt;enumeration value="UNDER12"/&gt;
     *                         &lt;enumeration value="UNDER16"/&gt;
     *                         &lt;enumeration value="KING"/&gt;
     *                         &lt;enumeration value="QUIET"/&gt;
     *                         &lt;enumeration value="TWIN"/&gt;
     *                         &lt;enumeration value="WIFI"/&gt;
     *                         &lt;enumeration value="OTHER"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="250"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
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
        "category",
        "sortingcriteria",
        "roompreferences",
        "listcorporateguest",
        "perpage",
        "listfrequentguest",
        "checkin",
        "checkout",
        "listspecialservice"
    })
    public static class HOTELPREFERENCES
        implements Serializable
    {

        @XmlElement(name = "CATEGORY")
        protected LISTPREFERENCES.HOTELPREFERENCES.CATEGORY category;
        @XmlElement(name = "SORTING_CRITERIA")
        protected String sortingcriteria;
        @XmlElement(name = "ROOM_PREFERENCES")
        protected LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES roompreferences;
        @XmlElement(name = "LIST_CORPORATE_GUEST")
        protected List<LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST> listcorporateguest;
        @XmlElement(name = "PER_PAGE")
        protected BigInteger perpage;
        @XmlElement(name = "LIST_FREQUENT_GUEST")
        protected List<LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST> listfrequentguest;
        @XmlElement(name = "CHECKIN")
        protected LISTPREFERENCES.HOTELPREFERENCES.CHECKIN checkin;
        @XmlElement(name = "CHECKOUT")
        protected LISTPREFERENCES.HOTELPREFERENCES.CHECKOUT checkout;
        @XmlElement(name = "LIST_SPECIAL_SERVICE")
        protected List<LISTPREFERENCES.HOTELPREFERENCES.LISTSPECIALSERVICE> listspecialservice;

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.HOTELPREFERENCES.CATEGORY }
         *     
         */
        public LISTPREFERENCES.HOTELPREFERENCES.CATEGORY getCATEGORY() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.HOTELPREFERENCES.CATEGORY }
         *     
         */
        public void setCATEGORY(LISTPREFERENCES.HOTELPREFERENCES.CATEGORY value) {
            this.category = value;
        }

        /**
         * Gets the value of the sortingcriteria property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSORTINGCRITERIA() {
            return sortingcriteria;
        }

        /**
         * Sets the value of the sortingcriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSORTINGCRITERIA(String value) {
            this.sortingcriteria = value;
        }

        /**
         * Gets the value of the roompreferences property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES }
         *     
         */
        public LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES getROOMPREFERENCES() {
            return roompreferences;
        }

        /**
         * Sets the value of the roompreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES }
         *     
         */
        public void setROOMPREFERENCES(LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES value) {
            this.roompreferences = value;
        }

        /**
         * Gets the value of the listcorporateguest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcorporateguest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCORPORATEGUEST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST }
         * 
         * 
         */
        public List<LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST> getLISTCORPORATEGUEST() {
            if (listcorporateguest == null) {
                listcorporateguest = new ArrayList<LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST>();
            }
            return this.listcorporateguest;
        }

        /**
         * Gets the value of the perpage property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPERPAGE() {
            return perpage;
        }

        /**
         * Sets the value of the perpage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPERPAGE(BigInteger value) {
            this.perpage = value;
        }

        /**
         * Gets the value of the listfrequentguest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfrequentguest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFREQUENTGUEST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST }
         * 
         * 
         */
        public List<LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST> getLISTFREQUENTGUEST() {
            if (listfrequentguest == null) {
                listfrequentguest = new ArrayList<LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST>();
            }
            return this.listfrequentguest;
        }

        /**
         * Gets the value of the checkin property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.HOTELPREFERENCES.CHECKIN }
         *     
         */
        public LISTPREFERENCES.HOTELPREFERENCES.CHECKIN getCHECKIN() {
            return checkin;
        }

        /**
         * Sets the value of the checkin property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.HOTELPREFERENCES.CHECKIN }
         *     
         */
        public void setCHECKIN(LISTPREFERENCES.HOTELPREFERENCES.CHECKIN value) {
            this.checkin = value;
        }

        /**
         * Gets the value of the checkout property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.HOTELPREFERENCES.CHECKOUT }
         *     
         */
        public LISTPREFERENCES.HOTELPREFERENCES.CHECKOUT getCHECKOUT() {
            return checkout;
        }

        /**
         * Sets the value of the checkout property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.HOTELPREFERENCES.CHECKOUT }
         *     
         */
        public void setCHECKOUT(LISTPREFERENCES.HOTELPREFERENCES.CHECKOUT value) {
            this.checkout = value;
        }

        /**
         * Gets the value of the listspecialservice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listspecialservice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSPECIALSERVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.HOTELPREFERENCES.LISTSPECIALSERVICE }
         * 
         * 
         */
        public List<LISTPREFERENCES.HOTELPREFERENCES.LISTSPECIALSERVICE> getLISTSPECIALSERVICE() {
            if (listspecialservice == null) {
                listspecialservice = new ArrayList<LISTPREFERENCES.HOTELPREFERENCES.LISTSPECIALSERVICE>();
            }
            return this.listspecialservice;
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
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="F"/&gt;
         *               &lt;enumeration value="S"/&gt;
         *               &lt;enumeration value="L"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class CATEGORY
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
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "value",
            "time"
        })
        public static class CHECKIN
            implements Serializable
        {

            @XmlElement(name = "VALUE", required = true)
            protected String value;
            @XmlElement(name = "TIME")
            protected String time;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUE() {
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
            public void setVALUE(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTIME() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTIME(String value) {
                this.time = value;
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
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "value",
            "time"
        })
        public static class CHECKOUT
            implements Serializable
        {

            @XmlElement(name = "VALUE", required = true)
            protected String value;
            @XmlElement(name = "TIME")
            protected String time;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUE() {
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
            public void setVALUE(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTIME() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTIME(String value) {
                this.time = value;
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
         *         &lt;element name="RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CORPORATE_GUEST" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="COMPANY"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="CODE"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{}unprotectedStringType"&gt;
         *                                   &lt;length value="2"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="NAME" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;minLength value="1"/&gt;
         *                                   &lt;maxLength value="40"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/all&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
        public static class LISTCORPORATEGUEST
            implements Serializable
        {

            @XmlElement(name = "RATE", required = true)
            protected String rate;
            @XmlElement(name = "CORPORATE_GUEST")
            protected LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST corporateguest;

            /**
             * Gets the value of the rate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRATE() {
                return rate;
            }

            /**
             * Sets the value of the rate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRATE(String value) {
                this.rate = value;
            }

            /**
             * Gets the value of the corporateguest property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST }
             *     
             */
            public LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST getCORPORATEGUEST() {
                return corporateguest;
            }

            /**
             * Sets the value of the corporateguest property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST }
             *     
             */
            public void setCORPORATEGUEST(LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST value) {
                this.corporateguest = value;
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
             *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="COMPANY"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="CODE"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{}unprotectedStringType"&gt;
             *                         &lt;length value="2"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="NAME" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;minLength value="1"/&gt;
             *                         &lt;maxLength value="40"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/all&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
            public static class CORPORATEGUEST
                implements Serializable
            {

                @XmlElement(name = "COMPANY_ACCOUNT_ID", required = true)
                protected BigInteger companyaccountid;
                @XmlElement(name = "ACCOUNT_NUMBER", required = true)
                protected String accountnumber;
                @XmlElement(name = "COMPANY", required = true)
                protected LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST.COMPANY company;

                /**
                 * Gets the value of the companyaccountid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCOMPANYACCOUNTID() {
                    return companyaccountid;
                }

                /**
                 * Sets the value of the companyaccountid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCOMPANYACCOUNTID(BigInteger value) {
                    this.companyaccountid = value;
                }

                /**
                 * Gets the value of the accountnumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getACCOUNTNUMBER() {
                    return accountnumber;
                }

                /**
                 * Sets the value of the accountnumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setACCOUNTNUMBER(String value) {
                    this.accountnumber = value;
                }

                /**
                 * Gets the value of the company property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST.COMPANY }
                 *     
                 */
                public LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST.COMPANY getCOMPANY() {
                    return company;
                }

                /**
                 * Sets the value of the company property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST.COMPANY }
                 *     
                 */
                public void setCOMPANY(LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST.COMPANY value) {
                    this.company = value;
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
                 *         &lt;element name="CODE"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{}unprotectedStringType"&gt;
                 *               &lt;length value="2"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="NAME" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;minLength value="1"/&gt;
                 *               &lt;maxLength value="40"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
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
                public static class COMPANY
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
         *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="COMPANY"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="40"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
        public static class LISTFREQUENTGUEST
            implements Serializable
        {

            @XmlElement(name = "COMPANY_ACCOUNT_ID", required = true)
            protected BigInteger companyaccountid;
            @XmlElement(name = "ACCOUNT_NUMBER", required = true)
            protected String accountnumber;
            @XmlElement(name = "COMPANY", required = true)
            protected LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST.COMPANY company;

            /**
             * Gets the value of the companyaccountid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCOMPANYACCOUNTID() {
                return companyaccountid;
            }

            /**
             * Sets the value of the companyaccountid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCOMPANYACCOUNTID(BigInteger value) {
                this.companyaccountid = value;
            }

            /**
             * Gets the value of the accountnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTNUMBER() {
                return accountnumber;
            }

            /**
             * Sets the value of the accountnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTNUMBER(String value) {
                this.accountnumber = value;
            }

            /**
             * Gets the value of the company property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST.COMPANY }
             *     
             */
            public LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST.COMPANY getCOMPANY() {
                return company;
            }

            /**
             * Sets the value of the company property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST.COMPANY }
             *     
             */
            public void setCOMPANY(LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST.COMPANY value) {
                this.company = value;
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
             *         &lt;element name="NAME" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="40"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
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
            public static class COMPANY
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
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="CHAMP"/&gt;
         *               &lt;enumeration value="CRIB"/&gt;
         *               &lt;enumeration value="NEWS"/&gt;
         *               &lt;enumeration value="DISABLE"/&gt;
         *               &lt;enumeration value="PET"/&gt;
         *               &lt;enumeration value="BED"/&gt;
         *               &lt;enumeration value="PERSON"/&gt;
         *               &lt;enumeration value="FLOWER"/&gt;
         *               &lt;enumeration value="FREQ"/&gt;
         *               &lt;enumeration value="GMEMBER"/&gt;
         *               &lt;enumeration value="WWW"/&gt;
         *               &lt;enumeration value="MOON"/&gt;
         *               &lt;enumeration value="UNDER4"/&gt;
         *               &lt;enumeration value="UNDER12"/&gt;
         *               &lt;enumeration value="UNDER16"/&gt;
         *               &lt;enumeration value="KING"/&gt;
         *               &lt;enumeration value="QUIET"/&gt;
         *               &lt;enumeration value="TWIN"/&gt;
         *               &lt;enumeration value="WIFI"/&gt;
         *               &lt;enumeration value="OTHER"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="250"/&gt;
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
            "code",
            "name"
        })
        public static class LISTSPECIALSERVICE
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
         *       &lt;all&gt;
         *         &lt;element name="ROOM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BED_TYPE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;enumeration value="0"/&gt;
         *                         &lt;enumeration value="D"/&gt;
         *                         &lt;enumeration value="K"/&gt;
         *                         &lt;enumeration value="P"/&gt;
         *                         &lt;enumeration value="Q"/&gt;
         *                         &lt;enumeration value="S"/&gt;
         *                         &lt;enumeration value="T"/&gt;
         *                         &lt;enumeration value="W"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NAME" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="40"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SMOKING" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;enumeration value="ST"/&gt;
         *                         &lt;enumeration value="NS"/&gt;
         *                         &lt;enumeration value="00"/&gt;
         *                         &lt;enumeration value="SM"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CRIB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="WHEELCHAIR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        public static class ROOMPREFERENCES
            implements Serializable
        {

            @XmlElement(name = "ROOM_TYPE")
            protected String roomtype;
            @XmlElement(name = "BED_TYPE")
            protected LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.BEDTYPE bedtype;
            @XmlElement(name = "SMOKING")
            protected LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.SMOKING smoking;
            @XmlElement(name = "CRIB")
            protected Boolean crib;
            @XmlElement(name = "WHEELCHAIR")
            protected Boolean wheelchair;

            /**
             * Gets the value of the roomtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getROOMTYPE() {
                return roomtype;
            }

            /**
             * Sets the value of the roomtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setROOMTYPE(String value) {
                this.roomtype = value;
            }

            /**
             * Gets the value of the bedtype property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.BEDTYPE }
             *     
             */
            public LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.BEDTYPE getBEDTYPE() {
                return bedtype;
            }

            /**
             * Sets the value of the bedtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.BEDTYPE }
             *     
             */
            public void setBEDTYPE(LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.BEDTYPE value) {
                this.bedtype = value;
            }

            /**
             * Gets the value of the smoking property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.SMOKING }
             *     
             */
            public LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.SMOKING getSMOKING() {
                return smoking;
            }

            /**
             * Sets the value of the smoking property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.SMOKING }
             *     
             */
            public void setSMOKING(LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.SMOKING value) {
                this.smoking = value;
            }

            /**
             * Gets the value of the crib property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCRIB() {
                return crib;
            }

            /**
             * Sets the value of the crib property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCRIB(Boolean value) {
                this.crib = value;
            }

            /**
             * Gets the value of the wheelchair property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isWHEELCHAIR() {
                return wheelchair;
            }

            /**
             * Sets the value of the wheelchair property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setWHEELCHAIR(Boolean value) {
                this.wheelchair = value;
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
             *         &lt;element name="CODE"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;enumeration value="0"/&gt;
             *               &lt;enumeration value="D"/&gt;
             *               &lt;enumeration value="K"/&gt;
             *               &lt;enumeration value="P"/&gt;
             *               &lt;enumeration value="Q"/&gt;
             *               &lt;enumeration value="S"/&gt;
             *               &lt;enumeration value="T"/&gt;
             *               &lt;enumeration value="W"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NAME" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="40"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
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
            public static class BEDTYPE
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
             *       &lt;all&gt;
             *         &lt;element name="CODE" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;enumeration value="ST"/&gt;
             *               &lt;enumeration value="NS"/&gt;
             *               &lt;enumeration value="00"/&gt;
             *               &lt;enumeration value="SM"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class SMOKING
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LIST_CHARACTERISTICS" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CHARACTERISTIC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_HOBBIES" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="HOBBIE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "listcharacteristics",
        "listhobbies"
    })
    public static class LEISUREPREFERENCES
        implements Serializable
    {

        @XmlElement(name = "LIST_CHARACTERISTICS")
        protected List<LISTPREFERENCES.LEISUREPREFERENCES.LISTCHARACTERISTICS> listcharacteristics;
        @XmlElement(name = "LIST_HOBBIES")
        protected List<LISTPREFERENCES.LEISUREPREFERENCES.LISTHOBBIES> listhobbies;

        /**
         * Gets the value of the listcharacteristics property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcharacteristics property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCHARACTERISTICS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.LEISUREPREFERENCES.LISTCHARACTERISTICS }
         * 
         * 
         */
        public List<LISTPREFERENCES.LEISUREPREFERENCES.LISTCHARACTERISTICS> getLISTCHARACTERISTICS() {
            if (listcharacteristics == null) {
                listcharacteristics = new ArrayList<LISTPREFERENCES.LEISUREPREFERENCES.LISTCHARACTERISTICS>();
            }
            return this.listcharacteristics;
        }

        /**
         * Gets the value of the listhobbies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listhobbies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTHOBBIES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.LEISUREPREFERENCES.LISTHOBBIES }
         * 
         * 
         */
        public List<LISTPREFERENCES.LEISUREPREFERENCES.LISTHOBBIES> getLISTHOBBIES() {
            if (listhobbies == null) {
                listhobbies = new ArrayList<LISTPREFERENCES.LEISUREPREFERENCES.LISTHOBBIES>();
            }
            return this.listhobbies;
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
         *         &lt;element name="CHARACTERISTIC" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "characteristic"
        })
        public static class LISTCHARACTERISTICS
            implements Serializable
        {

            @XmlElement(name = "CHARACTERISTIC")
            protected Object characteristic;

            /**
             * Gets the value of the characteristic property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCHARACTERISTIC() {
                return characteristic;
            }

            /**
             * Sets the value of the characteristic property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCHARACTERISTIC(Object value) {
                this.characteristic = value;
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
         *         &lt;element name="HOBBIE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "hobbie"
        })
        public static class LISTHOBBIES
            implements Serializable
        {

            @XmlElement(name = "HOBBIE")
            protected Object hobbie;

            /**
             * Gets the value of the hobbie property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getHOBBIE() {
                return hobbie;
            }

            /**
             * Sets the value of the hobbie property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setHOBBIE(Object value) {
                this.hobbie = value;
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
     *         &lt;element name="CLASS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="PR"/&gt;
     *                         &lt;enumeration value="FR"/&gt;
     *                         &lt;enumeration value="SD"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DEPARTURE_STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SMOKING" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="ST"/&gt;
     *                         &lt;enumeration value="NS"/&gt;
     *                         &lt;enumeration value="00"/&gt;
     *                         &lt;enumeration value="SM"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CAR_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="SC"/&gt;
     *                         &lt;enumeration value="CC"/&gt;
     *                         &lt;enumeration value="TB"/&gt;
     *                         &lt;enumeration value="NONE"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LOCATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="AS"/&gt;
     *                         &lt;enumeration value="WD "/&gt;
     *                         &lt;enumeration value="NONE"/&gt;
     *                         &lt;enumeration value="00"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ICE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="MZ"/&gt;
     *                         &lt;enumeration value="QZ"/&gt;
     *                         &lt;enumeration value="NONE"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_FREQUENT_RAIL_CARD" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="COMPANY"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;enumeration value="00"/&gt;
     *                                   &lt;enumeration value="B25N"/&gt;
     *                                   &lt;enumeration value="B25F"/&gt;
     *                                   &lt;enumeration value="B50N"/&gt;
     *                                   &lt;enumeration value="B50F"/&gt;
     *                                   &lt;enumeration value="BB"/&gt;
     *                                   &lt;enumeration value="BBC"/&gt;
     *                                   &lt;enumeration value="BBI"/&gt;
     *                                   &lt;enumeration value="BC"/&gt;
     *                                   &lt;enumeration value="BCB"/&gt;
     *                                   &lt;enumeration value="BCC"/&gt;
     *                                   &lt;enumeration value="BCI"/&gt;
     *                                   &lt;enumeration value="CFE"/&gt;
     *                                   &lt;enumeration value="CYB"/&gt;
     *                                   &lt;enumeration value="DB25"/&gt;
     *                                   &lt;enumeration value="DB25B"/&gt;
     *                                   &lt;enumeration value="DB25F"/&gt;
     *                                   &lt;enumeration value="DB25FB"/&gt;
     *                                   &lt;enumeration value="DB50"/&gt;
     *                                   &lt;enumeration value="DB50B"/&gt;
     *                                   &lt;enumeration value="DB50F"/&gt;
     *                                   &lt;enumeration value="DB50FB"/&gt;
     *                                   &lt;enumeration value="EFT"/&gt;
     *                                   &lt;enumeration value="ES"/&gt;
     *                                   &lt;enumeration value="F"/&gt;
     *                                   &lt;enumeration value="FID_SNCF"/&gt;
     *                                   &lt;enumeration value="GV"/&gt;
     *                                   &lt;enumeration value="GVC"/&gt;
     *                                   &lt;enumeration value="K"/&gt;
     *                                   &lt;enumeration value="RENFE"/&gt;
     *                                   &lt;enumeration value="SNCF"/&gt;
     *                                   &lt;enumeration value="TH"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NAME" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNT_EXPIRATIONDATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_ACCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACCOUNT_CARD_TYPE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="ACCOUNT_CARD_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="ACCOUNT_CARD_NUMBER" type="{}unprotectedStringType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_DISCOUNT_RAIL_CARD" type="{}DISCOUNT_CARD_COMPLEX_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FORCE_SMOKING_PREF" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CAMPAIGN_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ACCOMMODATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ZONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STATUS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_OPTIONS" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     *         &lt;element name="LIST_NEGOCIATED_FARES" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="NEGOCIATED_FARE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NEGOCIATED_FARE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "_class",
        "departurestation",
        "smoking",
        "cartype",
        "location",
        "ice",
        "listfrequentrailcard",
        "listaccountcard",
        "listdiscountrailcard",
        "forcesmokingpref",
        "campaigncode",
        "accommodation",
        "listnegociatedfares"
    })
    public static class RAILPREFERENCES
        implements Serializable
    {

        @XmlElement(name = "CLASS")
        protected LISTPREFERENCES.RAILPREFERENCES.CLASS _class;
        @XmlElement(name = "DEPARTURE_STATION")
        protected String departurestation;
        @XmlElement(name = "SMOKING")
        protected LISTPREFERENCES.RAILPREFERENCES.SMOKING smoking;
        @XmlElement(name = "CAR_TYPE")
        protected LISTPREFERENCES.RAILPREFERENCES.CARTYPE cartype;
        @XmlElement(name = "LOCATION")
        protected LISTPREFERENCES.RAILPREFERENCES.LOCATION location;
        @XmlElement(name = "ICE")
        protected LISTPREFERENCES.RAILPREFERENCES.ICE ice;
        @XmlElement(name = "LIST_FREQUENT_RAIL_CARD")
        protected List<LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD> listfrequentrailcard;
        @XmlElement(name = "LIST_ACCOUNT_CARD")
        protected List<LISTPREFERENCES.RAILPREFERENCES.LISTACCOUNTCARD> listaccountcard;
        @XmlElement(name = "LIST_DISCOUNT_RAIL_CARD")
        protected List<DISCOUNTCARDCOMPLEXTYPE> listdiscountrailcard;
        @XmlElement(name = "FORCE_SMOKING_PREF")
        protected Object forcesmokingpref;
        @XmlElement(name = "CAMPAIGN_CODE")
        protected String campaigncode;
        @XmlElement(name = "ACCOMMODATION")
        protected LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION accommodation;
        @XmlElement(name = "LIST_NEGOCIATED_FARES")
        protected List<LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES> listnegociatedfares;

        /**
         * Gets the value of the class property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.CLASS }
         *     
         */
        public LISTPREFERENCES.RAILPREFERENCES.CLASS getCLASS() {
            return _class;
        }

        /**
         * Sets the value of the class property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.CLASS }
         *     
         */
        public void setCLASS(LISTPREFERENCES.RAILPREFERENCES.CLASS value) {
            this._class = value;
        }

        /**
         * Gets the value of the departurestation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPARTURESTATION() {
            return departurestation;
        }

        /**
         * Sets the value of the departurestation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPARTURESTATION(String value) {
            this.departurestation = value;
        }

        /**
         * Gets the value of the smoking property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.SMOKING }
         *     
         */
        public LISTPREFERENCES.RAILPREFERENCES.SMOKING getSMOKING() {
            return smoking;
        }

        /**
         * Sets the value of the smoking property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.SMOKING }
         *     
         */
        public void setSMOKING(LISTPREFERENCES.RAILPREFERENCES.SMOKING value) {
            this.smoking = value;
        }

        /**
         * Gets the value of the cartype property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.CARTYPE }
         *     
         */
        public LISTPREFERENCES.RAILPREFERENCES.CARTYPE getCARTYPE() {
            return cartype;
        }

        /**
         * Sets the value of the cartype property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.CARTYPE }
         *     
         */
        public void setCARTYPE(LISTPREFERENCES.RAILPREFERENCES.CARTYPE value) {
            this.cartype = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.LOCATION }
         *     
         */
        public LISTPREFERENCES.RAILPREFERENCES.LOCATION getLOCATION() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.LOCATION }
         *     
         */
        public void setLOCATION(LISTPREFERENCES.RAILPREFERENCES.LOCATION value) {
            this.location = value;
        }

        /**
         * Gets the value of the ice property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.ICE }
         *     
         */
        public LISTPREFERENCES.RAILPREFERENCES.ICE getICE() {
            return ice;
        }

        /**
         * Sets the value of the ice property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.ICE }
         *     
         */
        public void setICE(LISTPREFERENCES.RAILPREFERENCES.ICE value) {
            this.ice = value;
        }

        /**
         * Gets the value of the listfrequentrailcard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfrequentrailcard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFREQUENTRAILCARD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD }
         * 
         * 
         */
        public List<LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD> getLISTFREQUENTRAILCARD() {
            if (listfrequentrailcard == null) {
                listfrequentrailcard = new ArrayList<LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD>();
            }
            return this.listfrequentrailcard;
        }

        /**
         * Gets the value of the listaccountcard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listaccountcard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTACCOUNTCARD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.RAILPREFERENCES.LISTACCOUNTCARD }
         * 
         * 
         */
        public List<LISTPREFERENCES.RAILPREFERENCES.LISTACCOUNTCARD> getLISTACCOUNTCARD() {
            if (listaccountcard == null) {
                listaccountcard = new ArrayList<LISTPREFERENCES.RAILPREFERENCES.LISTACCOUNTCARD>();
            }
            return this.listaccountcard;
        }

        /**
         * Gets the value of the listdiscountrailcard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listdiscountrailcard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTDISCOUNTRAILCARD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DISCOUNTCARDCOMPLEXTYPE }
         * 
         * 
         */
        public List<DISCOUNTCARDCOMPLEXTYPE> getLISTDISCOUNTRAILCARD() {
            if (listdiscountrailcard == null) {
                listdiscountrailcard = new ArrayList<DISCOUNTCARDCOMPLEXTYPE>();
            }
            return this.listdiscountrailcard;
        }

        /**
         * Gets the value of the forcesmokingpref property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getFORCESMOKINGPREF() {
            return forcesmokingpref;
        }

        /**
         * Sets the value of the forcesmokingpref property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setFORCESMOKINGPREF(Object value) {
            this.forcesmokingpref = value;
        }

        /**
         * Gets the value of the campaigncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCAMPAIGNCODE() {
            return campaigncode;
        }

        /**
         * Sets the value of the campaigncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCAMPAIGNCODE(String value) {
            this.campaigncode = value;
        }

        /**
         * Gets the value of the accommodation property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION }
         *     
         */
        public LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION getACCOMMODATION() {
            return accommodation;
        }

        /**
         * Sets the value of the accommodation property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION }
         *     
         */
        public void setACCOMMODATION(LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION value) {
            this.accommodation = value;
        }

        /**
         * Gets the value of the listnegociatedfares property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listnegociatedfares property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTNEGOCIATEDFARES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES }
         * 
         * 
         */
        public List<LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES> getLISTNEGOCIATEDFARES() {
            if (listnegociatedfares == null) {
                listnegociatedfares = new ArrayList<LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES>();
            }
            return this.listnegociatedfares;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ZONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STATUS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_OPTIONS" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "code",
            "description",
            "assignment",
            "category",
            "type",
            "position",
            "zone",
            "place",
            "level",
            "status",
            "listoptions"
        })
        public static class ACCOMMODATION
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "DESCRIPTION")
            protected String description;
            @XmlElement(name = "ASSIGNMENT")
            protected String assignment;
            @XmlElement(name = "CATEGORY")
            protected String category;
            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "POSITION")
            protected String position;
            @XmlElement(name = "ZONE")
            protected String zone;
            @XmlElement(name = "PLACE")
            protected String place;
            @XmlElement(name = "LEVEL")
            protected String level;
            @XmlElement(name = "STATUS")
            protected LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.STATUS status;
            @XmlElement(name = "LIST_OPTIONS")
            protected List<LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.LISTOPTIONS> listoptions;

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

            /**
             * Gets the value of the assignment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASSIGNMENT() {
                return assignment;
            }

            /**
             * Sets the value of the assignment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASSIGNMENT(String value) {
                this.assignment = value;
            }

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
             * Gets the value of the position property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOSITION() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOSITION(String value) {
                this.position = value;
            }

            /**
             * Gets the value of the zone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZONE() {
                return zone;
            }

            /**
             * Sets the value of the zone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZONE(String value) {
                this.zone = value;
            }

            /**
             * Gets the value of the place property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLACE() {
                return place;
            }

            /**
             * Sets the value of the place property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLACE(String value) {
                this.place = value;
            }

            /**
             * Gets the value of the level property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEVEL() {
                return level;
            }

            /**
             * Sets the value of the level property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEVEL(String value) {
                this.level = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.STATUS }
             *     
             */
            public LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.STATUS getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.STATUS }
             *     
             */
            public void setSTATUS(LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.STATUS value) {
                this.status = value;
            }

            /**
             * Gets the value of the listoptions property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listoptions property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTOPTIONS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.LISTOPTIONS }
             * 
             * 
             */
            public List<LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.LISTOPTIONS> getLISTOPTIONS() {
                if (listoptions == null) {
                    listoptions = new ArrayList<LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.LISTOPTIONS>();
                }
                return this.listoptions;
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class LISTOPTIONS
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
             *       &lt;all&gt;
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class STATUS
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="SC"/&gt;
         *               &lt;enumeration value="CC"/&gt;
         *               &lt;enumeration value="TB"/&gt;
         *               &lt;enumeration value="NONE"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class CARTYPE
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="PR"/&gt;
         *               &lt;enumeration value="FR"/&gt;
         *               &lt;enumeration value="SD"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class CLASS
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="MZ"/&gt;
         *               &lt;enumeration value="QZ"/&gt;
         *               &lt;enumeration value="NONE"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class ICE
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
         *         &lt;element name="ACCOUNT_CARD_TYPE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="ACCOUNT_CARD_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="ACCOUNT_CARD_NUMBER" type="{}unprotectedStringType"/&gt;
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
            "accountcardtype",
            "accountcardname",
            "isselected",
            "accountcardid",
            "accountcardnumber"
        })
        public static class LISTACCOUNTCARD
            implements Serializable
        {

            @XmlElement(name = "ACCOUNT_CARD_TYPE", required = true)
            protected String accountcardtype;
            @XmlElement(name = "ACCOUNT_CARD_NAME")
            protected String accountcardname;
            @XmlElement(name = "IS_SELECTED")
            protected Boolean isselected;
            @XmlElement(name = "ACCOUNT_CARD_ID", required = true)
            protected BigInteger accountcardid;
            @XmlElement(name = "ACCOUNT_CARD_NUMBER", required = true)
            protected String accountcardnumber;

            /**
             * Gets the value of the accountcardtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTCARDTYPE() {
                return accountcardtype;
            }

            /**
             * Sets the value of the accountcardtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTCARDTYPE(String value) {
                this.accountcardtype = value;
            }

            /**
             * Gets the value of the accountcardname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTCARDNAME() {
                return accountcardname;
            }

            /**
             * Sets the value of the accountcardname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTCARDNAME(String value) {
                this.accountcardname = value;
            }

            /**
             * Gets the value of the isselected property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISSELECTED() {
                return isselected;
            }

            /**
             * Sets the value of the isselected property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISSELECTED(Boolean value) {
                this.isselected = value;
            }

            /**
             * Gets the value of the accountcardid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getACCOUNTCARDID() {
                return accountcardid;
            }

            /**
             * Sets the value of the accountcardid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setACCOUNTCARDID(BigInteger value) {
                this.accountcardid = value;
            }

            /**
             * Gets the value of the accountcardnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTCARDNUMBER() {
                return accountcardnumber;
            }

            /**
             * Sets the value of the accountcardnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTCARDNUMBER(String value) {
                this.accountcardnumber = value;
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
         *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="COMPANY"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;enumeration value="00"/&gt;
         *                         &lt;enumeration value="B25N"/&gt;
         *                         &lt;enumeration value="B25F"/&gt;
         *                         &lt;enumeration value="B50N"/&gt;
         *                         &lt;enumeration value="B50F"/&gt;
         *                         &lt;enumeration value="BB"/&gt;
         *                         &lt;enumeration value="BBC"/&gt;
         *                         &lt;enumeration value="BBI"/&gt;
         *                         &lt;enumeration value="BC"/&gt;
         *                         &lt;enumeration value="BCB"/&gt;
         *                         &lt;enumeration value="BCC"/&gt;
         *                         &lt;enumeration value="BCI"/&gt;
         *                         &lt;enumeration value="CFE"/&gt;
         *                         &lt;enumeration value="CYB"/&gt;
         *                         &lt;enumeration value="DB25"/&gt;
         *                         &lt;enumeration value="DB25B"/&gt;
         *                         &lt;enumeration value="DB25F"/&gt;
         *                         &lt;enumeration value="DB25FB"/&gt;
         *                         &lt;enumeration value="DB50"/&gt;
         *                         &lt;enumeration value="DB50B"/&gt;
         *                         &lt;enumeration value="DB50F"/&gt;
         *                         &lt;enumeration value="DB50FB"/&gt;
         *                         &lt;enumeration value="EFT"/&gt;
         *                         &lt;enumeration value="ES"/&gt;
         *                         &lt;enumeration value="F"/&gt;
         *                         &lt;enumeration value="FID_SNCF"/&gt;
         *                         &lt;enumeration value="GV"/&gt;
         *                         &lt;enumeration value="GVC"/&gt;
         *                         &lt;enumeration value="K"/&gt;
         *                         &lt;enumeration value="RENFE"/&gt;
         *                         &lt;enumeration value="SNCF"/&gt;
         *                         &lt;enumeration value="TH"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NAME" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNT_EXPIRATIONDATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
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
        public static class LISTFREQUENTRAILCARD
            implements Serializable
        {

            @XmlElement(name = "COMPANY_ACCOUNT_ID", required = true)
            protected BigInteger companyaccountid;
            @XmlElement(name = "ACCOUNT_NUMBER", required = true)
            protected String accountnumber;
            @XmlElement(name = "COMPANY", required = true)
            protected LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD.COMPANY company;
            @XmlElement(name = "DESCRIPTION")
            protected Object description;
            @XmlElement(name = "ACCOUNT_EXPIRATIONDATE")
            protected DATETYPEPROFILE accountexpirationdate;

            /**
             * Gets the value of the companyaccountid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCOMPANYACCOUNTID() {
                return companyaccountid;
            }

            /**
             * Sets the value of the companyaccountid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCOMPANYACCOUNTID(BigInteger value) {
                this.companyaccountid = value;
            }

            /**
             * Gets the value of the accountnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTNUMBER() {
                return accountnumber;
            }

            /**
             * Sets the value of the accountnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTNUMBER(String value) {
                this.accountnumber = value;
            }

            /**
             * Gets the value of the company property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD.COMPANY }
             *     
             */
            public LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD.COMPANY getCOMPANY() {
                return company;
            }

            /**
             * Sets the value of the company property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD.COMPANY }
             *     
             */
            public void setCOMPANY(LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD.COMPANY value) {
                this.company = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getDESCRIPTION() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setDESCRIPTION(Object value) {
                this.description = value;
            }

            /**
             * Gets the value of the accountexpirationdate property.
             * 
             * @return
             *     possible object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public DATETYPEPROFILE getACCOUNTEXPIRATIONDATE() {
                return accountexpirationdate;
            }

            /**
             * Sets the value of the accountexpirationdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DATETYPEPROFILE }
             *     
             */
            public void setACCOUNTEXPIRATIONDATE(DATETYPEPROFILE value) {
                this.accountexpirationdate = value;
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
             *         &lt;element name="CODE"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;enumeration value="00"/&gt;
             *               &lt;enumeration value="B25N"/&gt;
             *               &lt;enumeration value="B25F"/&gt;
             *               &lt;enumeration value="B50N"/&gt;
             *               &lt;enumeration value="B50F"/&gt;
             *               &lt;enumeration value="BB"/&gt;
             *               &lt;enumeration value="BBC"/&gt;
             *               &lt;enumeration value="BBI"/&gt;
             *               &lt;enumeration value="BC"/&gt;
             *               &lt;enumeration value="BCB"/&gt;
             *               &lt;enumeration value="BCC"/&gt;
             *               &lt;enumeration value="BCI"/&gt;
             *               &lt;enumeration value="CFE"/&gt;
             *               &lt;enumeration value="CYB"/&gt;
             *               &lt;enumeration value="DB25"/&gt;
             *               &lt;enumeration value="DB25B"/&gt;
             *               &lt;enumeration value="DB25F"/&gt;
             *               &lt;enumeration value="DB25FB"/&gt;
             *               &lt;enumeration value="DB50"/&gt;
             *               &lt;enumeration value="DB50B"/&gt;
             *               &lt;enumeration value="DB50F"/&gt;
             *               &lt;enumeration value="DB50FB"/&gt;
             *               &lt;enumeration value="EFT"/&gt;
             *               &lt;enumeration value="ES"/&gt;
             *               &lt;enumeration value="F"/&gt;
             *               &lt;enumeration value="FID_SNCF"/&gt;
             *               &lt;enumeration value="GV"/&gt;
             *               &lt;enumeration value="GVC"/&gt;
             *               &lt;enumeration value="K"/&gt;
             *               &lt;enumeration value="RENFE"/&gt;
             *               &lt;enumeration value="SNCF"/&gt;
             *               &lt;enumeration value="TH"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NAME" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
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
            public static class COMPANY
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
         *       &lt;all&gt;
         *         &lt;element name="NEGOCIATED_FARE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NEGOCIATED_FARE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class LISTNEGOCIATEDFARES
            implements Serializable
        {

            @XmlElement(name = "NEGOCIATED_FARE_ID")
            protected String negociatedfareid;
            @XmlElement(name = "NEGOCIATED_FARE")
            protected LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES.NEGOCIATEDFARE negociatedfare;
            @XmlElement(name = "CARRIER_CODE")
            protected String carriercode;

            /**
             * Gets the value of the negociatedfareid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNEGOCIATEDFAREID() {
                return negociatedfareid;
            }

            /**
             * Sets the value of the negociatedfareid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNEGOCIATEDFAREID(String value) {
                this.negociatedfareid = value;
            }

            /**
             * Gets the value of the negociatedfare property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES.NEGOCIATEDFARE }
             *     
             */
            public LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES.NEGOCIATEDFARE getNEGOCIATEDFARE() {
                return negociatedfare;
            }

            /**
             * Sets the value of the negociatedfare property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES.NEGOCIATEDFARE }
             *     
             */
            public void setNEGOCIATEDFARE(LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES.NEGOCIATEDFARE value) {
                this.negociatedfare = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class NEGOCIATEDFARE
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="AS"/&gt;
         *               &lt;enumeration value="WD "/&gt;
         *               &lt;enumeration value="NONE"/&gt;
         *               &lt;enumeration value="00"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class LOCATION
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="ST"/&gt;
         *               &lt;enumeration value="NS"/&gt;
         *               &lt;enumeration value="00"/&gt;
         *               &lt;enumeration value="SM"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class SMOKING
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
