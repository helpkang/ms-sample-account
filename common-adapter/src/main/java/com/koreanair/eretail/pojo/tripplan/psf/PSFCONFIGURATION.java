
package com.koreanair.eretail.pojo.tripplan.psf;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;
import com.koreanair.eretail.pojo.specialservices.commonservices.PsfDiscountAmountType;


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
 *         &lt;element name="LIST_GROUP" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="GROUP_SETTINGS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TARGETED_REPOSITORY" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="AMADEUS"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMMERCIAL_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="START_DATE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="EXPIRY_DATE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PASSENGER_ASSOCIATION" type="{}PAX_ASSOCIATION_ENUM" minOccurs="0"/&gt;
 *                             &lt;element name="SEGMENT_ASSOCIATION" type="{}AIR_ASSOCIATION_ENUM" minOccurs="0"/&gt;
 *                             &lt;element name="GROUP_DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="ELEMENT_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="LIST_GROUP_ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="GROUP_ELEMENT_SETTINGS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MINIMUM_CARDINALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MAXIMUM_CARDINALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IS_ACTIVE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IS_DELETION_FORBIDDEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IS_IMMUTABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IS_HIDDEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="ELEMENT_DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="PARAMETER_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PACK_SETTINGS" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="HAS_SEAT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                       &lt;element name="LIST_SUBSERVICE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;element name="PACK_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
 *         &lt;element name="LIST_ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CODE" type="{}ITEM_TYPE_ENUM" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ELEMENT_SETTINGS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="KEYWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMBER_IN_PARTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RFIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ELEMENT_FORMAT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LIST_FORMAT_PARAMETER" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FORMAT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PARAMETER_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="IS_HIDDEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
 *         &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CATALOGUE" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MAX_LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="POSITION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PARAMETER_SETTINGS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DETAILED_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FIXED_VALUE_LIST_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DEFAULT_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RANGE_DETAILS" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="MINIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="MAXIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
 *         &lt;element name="LIST_FIXED_VALUE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="VALUES" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="LIST_QUOTA_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REFERENCE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="GROUP"/&gt;
 *                                   &lt;enumeration value="ELEMENT"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_PRICE_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REFERENCE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="GROUP"/&gt;
 *                                   &lt;enumeration value="ELEMENT"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="LIST_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_AMOUNT" type="{}psfDiscountAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RANGE_DETAILS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MINIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="MAXIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "listgroup",
    "listgroupelement",
    "listelement",
    "listelementformat",
    "listparameter",
    "listfixedvalue",
    "listquotainformation",
    "listpriceinformation"
})
@XmlRootElement(name = "PSF_CONFIGURATION")
public class PSFCONFIGURATION
    implements Serializable
{

    @XmlElement(name = "LIST_GROUP")
    protected List<PSFCONFIGURATION.LISTGROUP> listgroup;
    @XmlElement(name = "LIST_GROUP_ELEMENT")
    protected List<PSFCONFIGURATION.LISTGROUPELEMENT> listgroupelement;
    @XmlElement(name = "LIST_ELEMENT")
    protected List<PSFCONFIGURATION.LISTELEMENT> listelement;
    @XmlElement(name = "LIST_ELEMENT_FORMAT")
    protected List<PSFCONFIGURATION.LISTELEMENTFORMAT> listelementformat;
    @XmlElement(name = "LIST_PARAMETER")
    protected List<PSFCONFIGURATION.LISTPARAMETER> listparameter;
    @XmlElement(name = "LIST_FIXED_VALUE")
    protected List<PSFCONFIGURATION.LISTFIXEDVALUE> listfixedvalue;
    @XmlElement(name = "LIST_QUOTA_INFORMATION")
    protected List<PSFCONFIGURATION.LISTQUOTAINFORMATION> listquotainformation;
    @XmlElement(name = "LIST_PRICE_INFORMATION")
    protected List<PSFCONFIGURATION.LISTPRICEINFORMATION> listpriceinformation;

    /**
     * Gets the value of the listgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSFCONFIGURATION.LISTGROUP }
     * 
     * 
     */
    public List<PSFCONFIGURATION.LISTGROUP> getLISTGROUP() {
        if (listgroup == null) {
            listgroup = new ArrayList<PSFCONFIGURATION.LISTGROUP>();
        }
        return this.listgroup;
    }

    /**
     * Gets the value of the listgroupelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listgroupelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTGROUPELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSFCONFIGURATION.LISTGROUPELEMENT }
     * 
     * 
     */
    public List<PSFCONFIGURATION.LISTGROUPELEMENT> getLISTGROUPELEMENT() {
        if (listgroupelement == null) {
            listgroupelement = new ArrayList<PSFCONFIGURATION.LISTGROUPELEMENT>();
        }
        return this.listgroupelement;
    }

    /**
     * Gets the value of the listelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSFCONFIGURATION.LISTELEMENT }
     * 
     * 
     */
    public List<PSFCONFIGURATION.LISTELEMENT> getLISTELEMENT() {
        if (listelement == null) {
            listelement = new ArrayList<PSFCONFIGURATION.LISTELEMENT>();
        }
        return this.listelement;
    }

    /**
     * Gets the value of the listelementformat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementformat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTFORMAT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSFCONFIGURATION.LISTELEMENTFORMAT }
     * 
     * 
     */
    public List<PSFCONFIGURATION.LISTELEMENTFORMAT> getLISTELEMENTFORMAT() {
        if (listelementformat == null) {
            listelementformat = new ArrayList<PSFCONFIGURATION.LISTELEMENTFORMAT>();
        }
        return this.listelementformat;
    }

    /**
     * Gets the value of the listparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSFCONFIGURATION.LISTPARAMETER }
     * 
     * 
     */
    public List<PSFCONFIGURATION.LISTPARAMETER> getLISTPARAMETER() {
        if (listparameter == null) {
            listparameter = new ArrayList<PSFCONFIGURATION.LISTPARAMETER>();
        }
        return this.listparameter;
    }

    /**
     * Gets the value of the listfixedvalue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfixedvalue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFIXEDVALUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSFCONFIGURATION.LISTFIXEDVALUE }
     * 
     * 
     */
    public List<PSFCONFIGURATION.LISTFIXEDVALUE> getLISTFIXEDVALUE() {
        if (listfixedvalue == null) {
            listfixedvalue = new ArrayList<PSFCONFIGURATION.LISTFIXEDVALUE>();
        }
        return this.listfixedvalue;
    }

    /**
     * Gets the value of the listquotainformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listquotainformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTQUOTAINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSFCONFIGURATION.LISTQUOTAINFORMATION }
     * 
     * 
     */
    public List<PSFCONFIGURATION.LISTQUOTAINFORMATION> getLISTQUOTAINFORMATION() {
        if (listquotainformation == null) {
            listquotainformation = new ArrayList<PSFCONFIGURATION.LISTQUOTAINFORMATION>();
        }
        return this.listquotainformation;
    }

    /**
     * Gets the value of the listpriceinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpriceinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICEINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSFCONFIGURATION.LISTPRICEINFORMATION }
     * 
     * 
     */
    public List<PSFCONFIGURATION.LISTPRICEINFORMATION> getLISTPRICEINFORMATION() {
        if (listpriceinformation == null) {
            listpriceinformation = new ArrayList<PSFCONFIGURATION.LISTPRICEINFORMATION>();
        }
        return this.listpriceinformation;
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
     *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CODE" type="{}ITEM_TYPE_ENUM" minOccurs="0"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ELEMENT_SETTINGS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="KEYWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMBER_IN_PARTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RFIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RFISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "code",
        "type",
        "subtype",
        "format",
        "description",
        "elementsettings",
        "rfic",
        "rfisc"
    })
    public static class LISTELEMENT
        implements Serializable
    {

        @XmlElement(name = "ELEMENT_ID", required = true)
        protected String elementid;
        @XmlElement(name = "CODE")
        @XmlSchemaType(name = "string")
        protected ITEMTYPEENUM code;
        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "SUB_TYPE")
        protected String subtype;
        @XmlElement(name = "FORMAT")
        protected String format;
        @XmlElement(name = "DESCRIPTION")
        protected String description;
        @XmlElement(name = "ELEMENT_SETTINGS")
        protected PSFCONFIGURATION.LISTELEMENT.ELEMENTSETTINGS elementsettings;
        @XmlElement(name = "RFIC")
        protected String rfic;
        @XmlElement(name = "RFISC")
        protected String rfisc;

        /**
         * Gets the value of the elementid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getELEMENTID() {
            return elementid;
        }

        /**
         * Sets the value of the elementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setELEMENTID(String value) {
            this.elementid = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link ITEMTYPEENUM }
         *     
         */
        public ITEMTYPEENUM getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link ITEMTYPEENUM }
         *     
         */
        public void setCODE(ITEMTYPEENUM value) {
            this.code = value;
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

        /**
         * Gets the value of the format property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFORMAT() {
            return format;
        }

        /**
         * Sets the value of the format property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFORMAT(String value) {
            this.format = value;
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
         * Gets the value of the elementsettings property.
         * 
         * @return
         *     possible object is
         *     {@link PSFCONFIGURATION.LISTELEMENT.ELEMENTSETTINGS }
         *     
         */
        public PSFCONFIGURATION.LISTELEMENT.ELEMENTSETTINGS getELEMENTSETTINGS() {
            return elementsettings;
        }

        /**
         * Sets the value of the elementsettings property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSFCONFIGURATION.LISTELEMENT.ELEMENTSETTINGS }
         *     
         */
        public void setELEMENTSETTINGS(PSFCONFIGURATION.LISTELEMENT.ELEMENTSETTINGS value) {
            this.elementsettings = value;
        }

        /**
         * Gets the value of the rfic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRFIC() {
            return rfic;
        }

        /**
         * Sets the value of the rfic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRFIC(String value) {
            this.rfic = value;
        }

        /**
         * Gets the value of the rfisc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRFISC() {
            return rfisc;
        }

        /**
         * Sets the value of the rfisc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRFISC(String value) {
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
         *         &lt;element name="KEYWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMBER_IN_PARTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "keyword",
            "statuscode",
            "numberinparty",
            "date",
            "carriercode",
            "officeid",
            "queuecategory",
            "queuenumber",
            "origin",
            "destination"
        })
        public static class ELEMENTSETTINGS
            implements Serializable
        {

            @XmlElement(name = "KEYWORD")
            protected String keyword;
            @XmlElement(name = "STATUS_CODE")
            protected String statuscode;
            @XmlElement(name = "NUMBER_IN_PARTY")
            protected String numberinparty;
            @XmlElement(name = "DATE")
            protected String date;
            @XmlElement(name = "CARRIER_CODE")
            protected String carriercode;
            @XmlElement(name = "OFFICE_ID")
            protected String officeid;
            @XmlElement(name = "QUEUE_CATEGORY")
            protected BigInteger queuecategory;
            @XmlElement(name = "QUEUE_NUMBER")
            protected BigInteger queuenumber;
            @XmlElement(name = "ORIGIN")
            protected String origin;
            @XmlElement(name = "DESTINATION")
            protected String destination;

            /**
             * Gets the value of the keyword property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKEYWORD() {
                return keyword;
            }

            /**
             * Sets the value of the keyword property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKEYWORD(String value) {
                this.keyword = value;
            }

            /**
             * Gets the value of the statuscode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATUSCODE() {
                return statuscode;
            }

            /**
             * Sets the value of the statuscode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATUSCODE(String value) {
                this.statuscode = value;
            }

            /**
             * Gets the value of the numberinparty property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMBERINPARTY() {
                return numberinparty;
            }

            /**
             * Sets the value of the numberinparty property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMBERINPARTY(String value) {
                this.numberinparty = value;
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
     *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LIST_FORMAT_PARAMETER" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FORMAT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PARAMETER_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IS_HIDDEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "listformatparameter"
    })
    public static class LISTELEMENTFORMAT
        implements Serializable
    {

        @XmlElement(name = "ELEMENT_ID", required = true)
        protected String elementid;
        @XmlElement(name = "LIST_FORMAT_PARAMETER", required = true)
        protected List<PSFCONFIGURATION.LISTELEMENTFORMAT.LISTFORMATPARAMETER> listformatparameter;

        /**
         * Gets the value of the elementid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getELEMENTID() {
            return elementid;
        }

        /**
         * Sets the value of the elementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setELEMENTID(String value) {
            this.elementid = value;
        }

        /**
         * Gets the value of the listformatparameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listformatparameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFORMATPARAMETER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PSFCONFIGURATION.LISTELEMENTFORMAT.LISTFORMATPARAMETER }
         * 
         * 
         */
        public List<PSFCONFIGURATION.LISTELEMENTFORMAT.LISTFORMATPARAMETER> getLISTFORMATPARAMETER() {
            if (listformatparameter == null) {
                listformatparameter = new ArrayList<PSFCONFIGURATION.LISTELEMENTFORMAT.LISTFORMATPARAMETER>();
            }
            return this.listformatparameter;
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
         *         &lt;element name="FORMAT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PARAMETER_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_HIDDEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "formatcode",
            "parametercode",
            "ismandatory",
            "ishidden"
        })
        public static class LISTFORMATPARAMETER
            implements Serializable
        {

            @XmlElement(name = "FORMAT_CODE", required = true)
            protected String formatcode;
            @XmlElement(name = "PARAMETER_CODE", required = true)
            protected String parametercode;
            @XmlElement(name = "IS_MANDATORY")
            protected Boolean ismandatory;
            @XmlElement(name = "IS_HIDDEN")
            protected Boolean ishidden;

            /**
             * Gets the value of the formatcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFORMATCODE() {
                return formatcode;
            }

            /**
             * Sets the value of the formatcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFORMATCODE(String value) {
                this.formatcode = value;
            }

            /**
             * Gets the value of the parametercode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPARAMETERCODE() {
                return parametercode;
            }

            /**
             * Sets the value of the parametercode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPARAMETERCODE(String value) {
                this.parametercode = value;
            }

            /**
             * Gets the value of the ismandatory property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISMANDATORY() {
                return ismandatory;
            }

            /**
             * Sets the value of the ismandatory property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISMANDATORY(Boolean value) {
                this.ismandatory = value;
            }

            /**
             * Gets the value of the ishidden property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISHIDDEN() {
                return ishidden;
            }

            /**
             * Sets the value of the ishidden property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISHIDDEN(Boolean value) {
                this.ishidden = value;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="VALUES" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "values"
    })
    public static class LISTFIXEDVALUE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "VALUES")
        protected List<PSFCONFIGURATION.LISTFIXEDVALUE.VALUES> values;

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
         * Gets the value of the values property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the values property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVALUES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PSFCONFIGURATION.LISTFIXEDVALUE.VALUES }
         * 
         * 
         */
        public List<PSFCONFIGURATION.LISTFIXEDVALUE.VALUES> getVALUES() {
            if (values == null) {
                values = new ArrayList<PSFCONFIGURATION.LISTFIXEDVALUE.VALUES>();
            }
            return this.values;
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
         *         &lt;element name="DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "displayorder",
            "value"
        })
        public static class VALUES
            implements Serializable
        {

            @XmlElement(name = "DISPLAY_ORDER")
            protected BigInteger displayorder;
            @XmlElement(name = "VALUE", required = true)
            protected String value;

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
     *         &lt;element name="GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="GROUP_SETTINGS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TARGETED_REPOSITORY" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="AMADEUS"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMMERCIAL_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="START_DATE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="EXPIRY_DATE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PASSENGER_ASSOCIATION" type="{}PAX_ASSOCIATION_ENUM" minOccurs="0"/&gt;
     *                   &lt;element name="SEGMENT_ASSOCIATION" type="{}AIR_ASSOCIATION_ENUM" minOccurs="0"/&gt;
     *                   &lt;element name="GROUP_DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="ELEMENT_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "groupid",
        "groupsettings"
    })
    public static class LISTGROUP
        implements Serializable
    {

        @XmlElement(name = "GROUP_ID", required = true)
        protected Object groupid;
        @XmlElement(name = "GROUP_SETTINGS")
        protected PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS groupsettings;

        /**
         * Gets the value of the groupid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getGROUPID() {
            return groupid;
        }

        /**
         * Sets the value of the groupid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setGROUPID(Object value) {
            this.groupid = value;
        }

        /**
         * Gets the value of the groupsettings property.
         * 
         * @return
         *     possible object is
         *     {@link PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS }
         *     
         */
        public PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS getGROUPSETTINGS() {
            return groupsettings;
        }

        /**
         * Sets the value of the groupsettings property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS }
         *     
         */
        public void setGROUPSETTINGS(PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS value) {
            this.groupsettings = value;
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
         *         &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TARGETED_REPOSITORY" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="AMADEUS"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMMERCIAL_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="START_DATE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="EXPIRY_DATE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PASSENGER_ASSOCIATION" type="{}PAX_ASSOCIATION_ENUM" minOccurs="0"/&gt;
         *         &lt;element name="SEGMENT_ASSOCIATION" type="{}AIR_ASSOCIATION_ENUM" minOccurs="0"/&gt;
         *         &lt;element name="GROUP_DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="ELEMENT_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "type",
            "subtype",
            "targetedrepository",
            "description",
            "commercialdescription",
            "airlinecode",
            "priority",
            "startdate",
            "expirydate",
            "passengerassociation",
            "segmentassociation",
            "groupdisplayorder",
            "elementdisplay"
        })
        public static class GROUPSETTINGS
            implements Serializable
        {

            @XmlElement(name = "PROVIDER", required = true)
            protected Object provider;
            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "SUB_TYPE")
            protected String subtype;
            @XmlElement(name = "TARGETED_REPOSITORY")
            protected String targetedrepository;
            @XmlElement(name = "DESCRIPTION")
            protected String description;
            @XmlElement(name = "COMMERCIAL_DESCRIPTION")
            protected String commercialdescription;
            @XmlElement(name = "AIRLINE_CODE")
            protected String airlinecode;
            @XmlElement(name = "PRIORITY")
            protected BigInteger priority;
            @XmlElement(name = "START_DATE")
            protected PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.STARTDATE startdate;
            @XmlElement(name = "EXPIRY_DATE")
            protected PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.EXPIRYDATE expirydate;
            @XmlElement(name = "PASSENGER_ASSOCIATION")
            @XmlSchemaType(name = "string")
            protected PAXASSOCIATIONENUM passengerassociation;
            @XmlElement(name = "SEGMENT_ASSOCIATION")
            @XmlSchemaType(name = "string")
            protected AIRASSOCIATIONENUM segmentassociation;
            @XmlElement(name = "GROUP_DISPLAY_ORDER")
            protected BigInteger groupdisplayorder;
            @XmlElement(name = "ELEMENT_DISPLAY")
            protected String elementdisplay;

            /**
             * Gets the value of the provider property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPROVIDER() {
                return provider;
            }

            /**
             * Sets the value of the provider property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPROVIDER(Object value) {
                this.provider = value;
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

            /**
             * Gets the value of the targetedrepository property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTARGETEDREPOSITORY() {
                return targetedrepository;
            }

            /**
             * Sets the value of the targetedrepository property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTARGETEDREPOSITORY(String value) {
                this.targetedrepository = value;
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
             * Gets the value of the commercialdescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMERCIALDESCRIPTION() {
                return commercialdescription;
            }

            /**
             * Sets the value of the commercialdescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMERCIALDESCRIPTION(String value) {
                this.commercialdescription = value;
            }

            /**
             * Gets the value of the airlinecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAIRLINECODE() {
                return airlinecode;
            }

            /**
             * Sets the value of the airlinecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAIRLINECODE(String value) {
                this.airlinecode = value;
            }

            /**
             * Gets the value of the priority property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPRIORITY() {
                return priority;
            }

            /**
             * Sets the value of the priority property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPRIORITY(BigInteger value) {
                this.priority = value;
            }

            /**
             * Gets the value of the startdate property.
             * 
             * @return
             *     possible object is
             *     {@link PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.STARTDATE }
             *     
             */
            public PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.STARTDATE getSTARTDATE() {
                return startdate;
            }

            /**
             * Sets the value of the startdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.STARTDATE }
             *     
             */
            public void setSTARTDATE(PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.STARTDATE value) {
                this.startdate = value;
            }

            /**
             * Gets the value of the expirydate property.
             * 
             * @return
             *     possible object is
             *     {@link PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.EXPIRYDATE }
             *     
             */
            public PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.EXPIRYDATE getEXPIRYDATE() {
                return expirydate;
            }

            /**
             * Sets the value of the expirydate property.
             * 
             * @param value
             *     allowed object is
             *     {@link PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.EXPIRYDATE }
             *     
             */
            public void setEXPIRYDATE(PSFCONFIGURATION.LISTGROUP.GROUPSETTINGS.EXPIRYDATE value) {
                this.expirydate = value;
            }

            /**
             * Gets the value of the passengerassociation property.
             * 
             * @return
             *     possible object is
             *     {@link PAXASSOCIATIONENUM }
             *     
             */
            public PAXASSOCIATIONENUM getPASSENGERASSOCIATION() {
                return passengerassociation;
            }

            /**
             * Sets the value of the passengerassociation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PAXASSOCIATIONENUM }
             *     
             */
            public void setPASSENGERASSOCIATION(PAXASSOCIATIONENUM value) {
                this.passengerassociation = value;
            }

            /**
             * Gets the value of the segmentassociation property.
             * 
             * @return
             *     possible object is
             *     {@link AIRASSOCIATIONENUM }
             *     
             */
            public AIRASSOCIATIONENUM getSEGMENTASSOCIATION() {
                return segmentassociation;
            }

            /**
             * Sets the value of the segmentassociation property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIRASSOCIATIONENUM }
             *     
             */
            public void setSEGMENTASSOCIATION(AIRASSOCIATIONENUM value) {
                this.segmentassociation = value;
            }

            /**
             * Gets the value of the groupdisplayorder property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getGROUPDISPLAYORDER() {
                return groupdisplayorder;
            }

            /**
             * Sets the value of the groupdisplayorder property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setGROUPDISPLAYORDER(BigInteger value) {
                this.groupdisplayorder = value;
            }

            /**
             * Gets the value of the elementdisplay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getELEMENTDISPLAY() {
                return elementdisplay;
            }

            /**
             * Sets the value of the elementdisplay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setELEMENTDISPLAY(String value) {
                this.elementdisplay = value;
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
            public static class EXPIRYDATE
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
            public static class STARTDATE
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
     *         &lt;element name="GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="GROUP_ELEMENT_SETTINGS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MINIMUM_CARDINALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MAXIMUM_CARDINALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IS_ACTIVE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IS_DELETION_FORBIDDEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IS_IMMUTABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="IS_HIDDEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="ELEMENT_DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="PARAMETER_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PACK_SETTINGS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="HAS_SEAT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_SUBSERVICE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="PACK_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "groupid",
        "elementid",
        "groupelementsettings"
    })
    public static class LISTGROUPELEMENT
        implements Serializable
    {

        @XmlElement(name = "GROUP_ID", required = true)
        protected String groupid;
        @XmlElement(name = "ELEMENT_ID", required = true)
        protected String elementid;
        @XmlElement(name = "GROUP_ELEMENT_SETTINGS")
        protected PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS groupelementsettings;

        /**
         * Gets the value of the groupid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGROUPID() {
            return groupid;
        }

        /**
         * Sets the value of the groupid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGROUPID(String value) {
            this.groupid = value;
        }

        /**
         * Gets the value of the elementid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getELEMENTID() {
            return elementid;
        }

        /**
         * Sets the value of the elementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setELEMENTID(String value) {
            this.elementid = value;
        }

        /**
         * Gets the value of the groupelementsettings property.
         * 
         * @return
         *     possible object is
         *     {@link PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS }
         *     
         */
        public PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS getGROUPELEMENTSETTINGS() {
            return groupelementsettings;
        }

        /**
         * Sets the value of the groupelementsettings property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS }
         *     
         */
        public void setGROUPELEMENTSETTINGS(PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS value) {
            this.groupelementsettings = value;
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
         *         &lt;element name="MINIMUM_CARDINALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MAXIMUM_CARDINALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_ACTIVE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_DELETION_FORBIDDEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_IMMUTABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_HIDDEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="ELEMENT_DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="PARAMETER_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PACK_SETTINGS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="HAS_SEAT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_SUBSERVICE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="PACK_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "minimumcardinality",
            "maximumcardinality",
            "ismandatory",
            "isactive",
            "isdeletionforbidden",
            "isimmutable",
            "ishidden",
            "elementdisplayorder",
            "parameterdisplay",
            "packsettings"
        })
        public static class GROUPELEMENTSETTINGS
            implements Serializable
        {

            @XmlElement(name = "MINIMUM_CARDINALITY")
            protected String minimumcardinality;
            @XmlElement(name = "MAXIMUM_CARDINALITY")
            protected String maximumcardinality;
            @XmlElement(name = "IS_MANDATORY")
            protected Boolean ismandatory;
            @XmlElement(name = "IS_ACTIVE")
            protected Boolean isactive;
            @XmlElement(name = "IS_DELETION_FORBIDDEN")
            protected Boolean isdeletionforbidden;
            @XmlElement(name = "IS_IMMUTABLE")
            protected Boolean isimmutable;
            @XmlElement(name = "IS_HIDDEN")
            protected Boolean ishidden;
            @XmlElement(name = "ELEMENT_DISPLAY_ORDER")
            protected BigInteger elementdisplayorder;
            @XmlElement(name = "PARAMETER_DISPLAY")
            protected String parameterdisplay;
            @XmlElement(name = "PACK_SETTINGS")
            protected PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS.PACKSETTINGS packsettings;

            /**
             * Gets the value of the minimumcardinality property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMINIMUMCARDINALITY() {
                return minimumcardinality;
            }

            /**
             * Sets the value of the minimumcardinality property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMINIMUMCARDINALITY(String value) {
                this.minimumcardinality = value;
            }

            /**
             * Gets the value of the maximumcardinality property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMAXIMUMCARDINALITY() {
                return maximumcardinality;
            }

            /**
             * Sets the value of the maximumcardinality property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMAXIMUMCARDINALITY(String value) {
                this.maximumcardinality = value;
            }

            /**
             * Gets the value of the ismandatory property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISMANDATORY() {
                return ismandatory;
            }

            /**
             * Sets the value of the ismandatory property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISMANDATORY(Boolean value) {
                this.ismandatory = value;
            }

            /**
             * Gets the value of the isactive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISACTIVE() {
                return isactive;
            }

            /**
             * Sets the value of the isactive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISACTIVE(Boolean value) {
                this.isactive = value;
            }

            /**
             * Gets the value of the isdeletionforbidden property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISDELETIONFORBIDDEN() {
                return isdeletionforbidden;
            }

            /**
             * Sets the value of the isdeletionforbidden property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISDELETIONFORBIDDEN(Boolean value) {
                this.isdeletionforbidden = value;
            }

            /**
             * Gets the value of the isimmutable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISIMMUTABLE() {
                return isimmutable;
            }

            /**
             * Sets the value of the isimmutable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISIMMUTABLE(Boolean value) {
                this.isimmutable = value;
            }

            /**
             * Gets the value of the ishidden property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISHIDDEN() {
                return ishidden;
            }

            /**
             * Sets the value of the ishidden property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISHIDDEN(Boolean value) {
                this.ishidden = value;
            }

            /**
             * Gets the value of the elementdisplayorder property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getELEMENTDISPLAYORDER() {
                return elementdisplayorder;
            }

            /**
             * Sets the value of the elementdisplayorder property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setELEMENTDISPLAYORDER(BigInteger value) {
                this.elementdisplayorder = value;
            }

            /**
             * Gets the value of the parameterdisplay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPARAMETERDISPLAY() {
                return parameterdisplay;
            }

            /**
             * Sets the value of the parameterdisplay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPARAMETERDISPLAY(String value) {
                this.parameterdisplay = value;
            }

            /**
             * Gets the value of the packsettings property.
             * 
             * @return
             *     possible object is
             *     {@link PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS.PACKSETTINGS }
             *     
             */
            public PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS.PACKSETTINGS getPACKSETTINGS() {
                return packsettings;
            }

            /**
             * Sets the value of the packsettings property.
             * 
             * @param value
             *     allowed object is
             *     {@link PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS.PACKSETTINGS }
             *     
             */
            public void setPACKSETTINGS(PSFCONFIGURATION.LISTGROUPELEMENT.GROUPELEMENTSETTINGS.PACKSETTINGS value) {
                this.packsettings = value;
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
             *         &lt;element name="HAS_SEAT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *         &lt;element name="LIST_SUBSERVICE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="PACK_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                "hasseat",
                "listsubserviceid",
                "packid"
            })
            public static class PACKSETTINGS
                implements Serializable
            {

                @XmlElement(name = "HAS_SEAT")
                protected Object hasseat;
                @XmlElement(name = "LIST_SUBSERVICE_ID")
                protected List<Object> listsubserviceid;
                @XmlElement(name = "PACK_ID")
                protected Object packid;

                /**
                 * Gets the value of the hasseat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getHASSEAT() {
                    return hasseat;
                }

                /**
                 * Sets the value of the hasseat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setHASSEAT(Object value) {
                    this.hasseat = value;
                }

                /**
                 * Gets the value of the listsubserviceid property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listsubserviceid property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTSUBSERVICEID().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getLISTSUBSERVICEID() {
                    if (listsubserviceid == null) {
                        listsubserviceid = new ArrayList<Object>();
                    }
                    return this.listsubserviceid;
                }

                /**
                 * Gets the value of the packid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getPACKID() {
                    return packid;
                }

                /**
                 * Sets the value of the packid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setPACKID(Object value) {
                    this.packid = value;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CATALOGUE" type="{}CodeDescriptorType" minOccurs="0"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MAX_LENGTH" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="POSITION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PARAMETER_SETTINGS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DETAILED_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FIXED_VALUE_LIST_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DEFAULT_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RANGE_DETAILS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="MINIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="MAXIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "code",
        "catalogue",
        "type",
        "maxlength",
        "ismandatory",
        "positionlevel",
        "parametersettings"
    })
    public static class LISTPARAMETER
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "CATALOGUE")
        protected CodeDescriptorType catalogue;
        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "MAX_LENGTH")
        protected BigInteger maxlength;
        @XmlElement(name = "IS_MANDATORY")
        protected Boolean ismandatory;
        @XmlElement(name = "POSITION_LEVEL")
        protected String positionlevel;
        @XmlElement(name = "PARAMETER_SETTINGS")
        protected PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS parametersettings;

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
         * Gets the value of the catalogue property.
         * 
         * @return
         *     possible object is
         *     {@link CodeDescriptorType }
         *     
         */
        public CodeDescriptorType getCATALOGUE() {
            return catalogue;
        }

        /**
         * Sets the value of the catalogue property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeDescriptorType }
         *     
         */
        public void setCATALOGUE(CodeDescriptorType value) {
            this.catalogue = value;
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
         * Gets the value of the maxlength property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMAXLENGTH() {
            return maxlength;
        }

        /**
         * Sets the value of the maxlength property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMAXLENGTH(BigInteger value) {
            this.maxlength = value;
        }

        /**
         * Gets the value of the ismandatory property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISMANDATORY() {
            return ismandatory;
        }

        /**
         * Sets the value of the ismandatory property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISMANDATORY(Boolean value) {
            this.ismandatory = value;
        }

        /**
         * Gets the value of the positionlevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOSITIONLEVEL() {
            return positionlevel;
        }

        /**
         * Sets the value of the positionlevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOSITIONLEVEL(String value) {
            this.positionlevel = value;
        }

        /**
         * Gets the value of the parametersettings property.
         * 
         * @return
         *     possible object is
         *     {@link PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS }
         *     
         */
        public PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS getPARAMETERSETTINGS() {
            return parametersettings;
        }

        /**
         * Sets the value of the parametersettings property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS }
         *     
         */
        public void setPARAMETERSETTINGS(PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS value) {
            this.parametersettings = value;
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
         *         &lt;element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DETAILED_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FIXED_VALUE_LIST_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DEFAULT_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RANGE_DETAILS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="MINIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="MAXIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            "format",
            "detailedformat",
            "fixedvaluelistcode",
            "defaultvalue",
            "rangedetails"
        })
        public static class PARAMETERSETTINGS
            implements Serializable
        {

            @XmlElement(name = "FORMAT")
            protected String format;
            @XmlElement(name = "DETAILED_FORMAT")
            protected String detailedformat;
            @XmlElement(name = "FIXED_VALUE_LIST_CODE")
            protected String fixedvaluelistcode;
            @XmlElement(name = "DEFAULT_VALUE")
            protected String defaultvalue;
            @XmlElement(name = "RANGE_DETAILS")
            protected PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS.RANGEDETAILS rangedetails;

            /**
             * Gets the value of the format property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFORMAT() {
                return format;
            }

            /**
             * Sets the value of the format property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFORMAT(String value) {
                this.format = value;
            }

            /**
             * Gets the value of the detailedformat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDETAILEDFORMAT() {
                return detailedformat;
            }

            /**
             * Sets the value of the detailedformat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDETAILEDFORMAT(String value) {
                this.detailedformat = value;
            }

            /**
             * Gets the value of the fixedvaluelistcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFIXEDVALUELISTCODE() {
                return fixedvaluelistcode;
            }

            /**
             * Sets the value of the fixedvaluelistcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFIXEDVALUELISTCODE(String value) {
                this.fixedvaluelistcode = value;
            }

            /**
             * Gets the value of the defaultvalue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEFAULTVALUE() {
                return defaultvalue;
            }

            /**
             * Sets the value of the defaultvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEFAULTVALUE(String value) {
                this.defaultvalue = value;
            }

            /**
             * Gets the value of the rangedetails property.
             * 
             * @return
             *     possible object is
             *     {@link PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS.RANGEDETAILS }
             *     
             */
            public PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS.RANGEDETAILS getRANGEDETAILS() {
                return rangedetails;
            }

            /**
             * Sets the value of the rangedetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS.RANGEDETAILS }
             *     
             */
            public void setRANGEDETAILS(PSFCONFIGURATION.LISTPARAMETER.PARAMETERSETTINGS.RANGEDETAILS value) {
                this.rangedetails = value;
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
             *         &lt;element name="MINIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="MAXIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
                "minimumvalue",
                "maximumvalue"
            })
            public static class RANGEDETAILS
                implements Serializable
            {

                @XmlElement(name = "MINIMUM_VALUE")
                protected int minimumvalue;
                @XmlElement(name = "MAXIMUM_VALUE")
                protected int maximumvalue;

                /**
                 * Gets the value of the minimumvalue property.
                 * 
                 */
                public int getMINIMUMVALUE() {
                    return minimumvalue;
                }

                /**
                 * Sets the value of the minimumvalue property.
                 * 
                 */
                public void setMINIMUMVALUE(int value) {
                    this.minimumvalue = value;
                }

                /**
                 * Gets the value of the maximumvalue property.
                 * 
                 */
                public int getMAXIMUMVALUE() {
                    return maximumvalue;
                }

                /**
                 * Sets the value of the maximumvalue property.
                 * 
                 */
                public void setMAXIMUMVALUE(int value) {
                    this.maximumvalue = value;
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
     *         &lt;element name="REFERENCE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="GROUP"/&gt;
     *                         &lt;enumeration value="ELEMENT"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *         &lt;element name="LIST_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_AMOUNT" type="{}psfDiscountAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RANGE_DETAILS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MINIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="MAXIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "reference",
        "listpassengerid",
        "listsegmentid",
        "listamount",
        "rangedetails"
    })
    public static class LISTPRICEINFORMATION
        implements Serializable
    {

        @XmlElement(name = "REFERENCE", required = true)
        protected PSFCONFIGURATION.LISTPRICEINFORMATION.REFERENCE reference;
        @XmlElement(name = "LIST_PASSENGER_ID", required = true)
        protected List<String> listpassengerid;
        @XmlElement(name = "LIST_SEGMENT_ID")
        protected List<String> listsegmentid;
        @XmlElement(name = "LIST_AMOUNT")
        protected List<PsfDiscountAmountType> listamount;
        @XmlElement(name = "RANGE_DETAILS")
        protected PSFCONFIGURATION.LISTPRICEINFORMATION.RANGEDETAILS rangedetails;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link PSFCONFIGURATION.LISTPRICEINFORMATION.REFERENCE }
         *     
         */
        public PSFCONFIGURATION.LISTPRICEINFORMATION.REFERENCE getREFERENCE() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSFCONFIGURATION.LISTPRICEINFORMATION.REFERENCE }
         *     
         */
        public void setREFERENCE(PSFCONFIGURATION.LISTPRICEINFORMATION.REFERENCE value) {
            this.reference = value;
        }

        /**
         * Gets the value of the listpassengerid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpassengerid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPASSENGERID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTPASSENGERID() {
            if (listpassengerid == null) {
                listpassengerid = new ArrayList<String>();
            }
            return this.listpassengerid;
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
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTSEGMENTID() {
            if (listsegmentid == null) {
                listsegmentid = new ArrayList<String>();
            }
            return this.listsegmentid;
        }

        /**
         * Gets the value of the listamount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listamount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTAMOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PsfDiscountAmountType }
         * 
         * 
         */
        public List<PsfDiscountAmountType> getLISTAMOUNT() {
            if (listamount == null) {
                listamount = new ArrayList<PsfDiscountAmountType>();
            }
            return this.listamount;
        }

        /**
         * Gets the value of the rangedetails property.
         * 
         * @return
         *     possible object is
         *     {@link PSFCONFIGURATION.LISTPRICEINFORMATION.RANGEDETAILS }
         *     
         */
        public PSFCONFIGURATION.LISTPRICEINFORMATION.RANGEDETAILS getRANGEDETAILS() {
            return rangedetails;
        }

        /**
         * Sets the value of the rangedetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSFCONFIGURATION.LISTPRICEINFORMATION.RANGEDETAILS }
         *     
         */
        public void setRANGEDETAILS(PSFCONFIGURATION.LISTPRICEINFORMATION.RANGEDETAILS value) {
            this.rangedetails = value;
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
         *         &lt;element name="MINIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="MAXIMUM_VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "minimumvalue",
            "maximumvalue",
            "unit"
        })
        public static class RANGEDETAILS
            implements Serializable
        {

            @XmlElement(name = "MINIMUM_VALUE")
            protected int minimumvalue;
            @XmlElement(name = "MAXIMUM_VALUE")
            protected int maximumvalue;
            @XmlElement(name = "UNIT", required = true)
            protected String unit;

            /**
             * Gets the value of the minimumvalue property.
             * 
             */
            public int getMINIMUMVALUE() {
                return minimumvalue;
            }

            /**
             * Sets the value of the minimumvalue property.
             * 
             */
            public void setMINIMUMVALUE(int value) {
                this.minimumvalue = value;
            }

            /**
             * Gets the value of the maximumvalue property.
             * 
             */
            public int getMAXIMUMVALUE() {
                return maximumvalue;
            }

            /**
             * Sets the value of the maximumvalue property.
             * 
             */
            public void setMAXIMUMVALUE(int value) {
                this.maximumvalue = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUNIT() {
                return unit;
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUNIT(String value) {
                this.unit = value;
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
         *         &lt;element name="TYPE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="GROUP"/&gt;
         *               &lt;enumeration value="ELEMENT"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "id"
        })
        public static class REFERENCE
            implements Serializable
        {

            @XmlElement(name = "TYPE", required = true)
            protected String type;
            @XmlElement(name = "ID", required = true)
            protected String id;

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
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
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
            public void setID(String value) {
                this.id = value;
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
     *         &lt;element name="REFERENCE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="GROUP"/&gt;
     *                         &lt;enumeration value="ELEMENT"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "reference",
        "segmentid",
        "number",
        "status"
    })
    public static class LISTQUOTAINFORMATION
        implements Serializable
    {

        @XmlElement(name = "REFERENCE", required = true)
        protected PSFCONFIGURATION.LISTQUOTAINFORMATION.REFERENCE reference;
        @XmlElement(name = "SEGMENT_ID", required = true)
        protected String segmentid;
        @XmlElement(name = "NUMBER")
        protected String number;
        @XmlElement(name = "STATUS")
        protected String status;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link PSFCONFIGURATION.LISTQUOTAINFORMATION.REFERENCE }
         *     
         */
        public PSFCONFIGURATION.LISTQUOTAINFORMATION.REFERENCE getREFERENCE() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSFCONFIGURATION.LISTQUOTAINFORMATION.REFERENCE }
         *     
         */
        public void setREFERENCE(PSFCONFIGURATION.LISTQUOTAINFORMATION.REFERENCE value) {
            this.reference = value;
        }

        /**
         * Gets the value of the segmentid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEGMENTID() {
            return segmentid;
        }

        /**
         * Sets the value of the segmentid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEGMENTID(String value) {
            this.segmentid = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TYPE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="GROUP"/&gt;
         *               &lt;enumeration value="ELEMENT"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "id"
        })
        public static class REFERENCE
            implements Serializable
        {

            @XmlElement(name = "TYPE", required = true)
            protected String type;
            @XmlElement(name = "ID", required = true)
            protected String id;

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
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
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
            public void setID(String value) {
                this.id = value;
            }

        }

    }

}
