
package com.koreanair.external.eretail.vo.fareshopper.farerulesoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;


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
 *         &lt;group ref="{}CommonActionOutputGroup"/&gt;
 *         &lt;element name="LIST_FARE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FARE_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="LIST_FARE_COMPONENT" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FARE_COMPONENT_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="FARE_ATTRIBUTES" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="BOOKING_CLASS" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="FARE_TYPE" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TARIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="REQUESTED_PASSENGER_TYPE" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="LIST_REQUESTED_DISCOUNTS" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;element name="PASSENGER_TYPE" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PRICING_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="FLIGHT_INFO" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="DESTINATION" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                                           &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="AIRLINE" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                                           &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="ORIGIN" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                                           &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_CATEGORY" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{}RULE_CATEGORY_CODE"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="LIST_CONTENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CONTENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="INDENTATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
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
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pageticket",
    "listmsg",
    "listfielderror",
    "listfare"
})
@XmlRootElement(name = "FareRulesOutput")
public class FareRulesOutput
    implements Serializable
{

    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_FIELD_ERROR")
    protected List<String> listfielderror;
    @XmlElement(name = "LIST_FARE")
    protected List<FareRulesOutput.LISTFARE> listfare;
    @XmlAttribute(name = "version")
    protected String version;

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
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }

    /**
     * Gets the value of the listfielderror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfielderror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFIELDERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFIELDERROR() {
        if (listfielderror == null) {
            listfielderror = new ArrayList<String>();
        }
        return this.listfielderror;
    }

    /**
     * Gets the value of the listfare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRulesOutput.LISTFARE }
     * 
     * 
     */
    public List<FareRulesOutput.LISTFARE> getLISTFARE() {
        if (listfare == null) {
            listfare = new ArrayList<FareRulesOutput.LISTFARE>();
        }
        return this.listfare;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="FARE_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="LIST_FARE_COMPONENT" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FARE_COMPONENT_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="FARE_ATTRIBUTES" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="BOOKING_CLASS" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="FARE_TYPE" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TARIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="REQUESTED_PASSENGER_TYPE" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="LIST_REQUESTED_DISCOUNTS" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="PASSENGER_TYPE" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PRICING_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="FLIGHT_INFO" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="DESTINATION" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="AIRLINE" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="ORIGIN" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
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
     *                   &lt;element name="LIST_CATEGORY" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{}RULE_CATEGORY_CODE"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="LIST_CONTENT" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CONTENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="INDENTATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "fareid",
        "listfarecomponent"
    })
    public static class LISTFARE
        implements Serializable
    {

        @XmlElement(name = "FARE_ID")
        protected int fareid;
        @XmlElement(name = "LIST_FARE_COMPONENT", required = true)
        protected List<FareRulesOutput.LISTFARE.LISTFARECOMPONENT> listfarecomponent;

        /**
         * Gets the value of the fareid property.
         * 
         */
        public int getFAREID() {
            return fareid;
        }

        /**
         * Sets the value of the fareid property.
         * 
         */
        public void setFAREID(int value) {
            this.fareid = value;
        }

        /**
         * Gets the value of the listfarecomponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfarecomponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFARECOMPONENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT }
         * 
         * 
         */
        public List<FareRulesOutput.LISTFARE.LISTFARECOMPONENT> getLISTFARECOMPONENT() {
            if (listfarecomponent == null) {
                listfarecomponent = new ArrayList<FareRulesOutput.LISTFARE.LISTFARECOMPONENT>();
            }
            return this.listfarecomponent;
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
         *         &lt;element name="FARE_COMPONENT_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="FARE_ATTRIBUTES" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="BOOKING_CLASS" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="FARE_TYPE" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TARIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="REQUESTED_PASSENGER_TYPE" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="LIST_REQUESTED_DISCOUNTS" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="PASSENGER_TYPE" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PRICING_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="FLIGHT_INFO" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="DESTINATION" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="AIRLINE" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="ORIGIN" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_CATEGORY" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{}RULE_CATEGORY_CODE"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="LIST_CONTENT" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CONTENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="INDENTATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
            "farecomponentid",
            "fareattributes",
            "listcategory"
        })
        public static class LISTFARECOMPONENT
            implements Serializable
        {

            @XmlElement(name = "FARE_COMPONENT_ID")
            protected int farecomponentid;
            @XmlElement(name = "FARE_ATTRIBUTES")
            protected FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES fareattributes;
            @XmlElement(name = "LIST_CATEGORY")
            protected List<FareRulesOutput.LISTFARE.LISTFARECOMPONENT.LISTCATEGORY> listcategory;

            /**
             * Gets the value of the farecomponentid property.
             * 
             */
            public int getFARECOMPONENTID() {
                return farecomponentid;
            }

            /**
             * Sets the value of the farecomponentid property.
             * 
             */
            public void setFARECOMPONENTID(int value) {
                this.farecomponentid = value;
            }

            /**
             * Gets the value of the fareattributes property.
             * 
             * @return
             *     possible object is
             *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES }
             *     
             */
            public FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES getFAREATTRIBUTES() {
                return fareattributes;
            }

            /**
             * Sets the value of the fareattributes property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES }
             *     
             */
            public void setFAREATTRIBUTES(FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES value) {
                this.fareattributes = value;
            }

            /**
             * Gets the value of the listcategory property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listcategory property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCATEGORY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.LISTCATEGORY }
             * 
             * 
             */
            public List<FareRulesOutput.LISTFARE.LISTFARECOMPONENT.LISTCATEGORY> getLISTCATEGORY() {
                if (listcategory == null) {
                    listcategory = new ArrayList<FareRulesOutput.LISTFARE.LISTFARECOMPONENT.LISTCATEGORY>();
                }
                return this.listcategory;
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
             *         &lt;element name="BOOKING_CLASS" minOccurs="0"&gt;
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
             *         &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="FARE_TYPE" minOccurs="0"&gt;
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
             *         &lt;element name="TARIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="REQUESTED_PASSENGER_TYPE" minOccurs="0"&gt;
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
             *         &lt;element name="LIST_REQUESTED_DISCOUNTS" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="PASSENGER_TYPE" minOccurs="0"&gt;
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
             *         &lt;element name="PRICING_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="FLIGHT_INFO" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="DESTINATION" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="AIRLINE" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="ORIGIN" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
                "bookingclass",
                "farebasis",
                "faretype",
                "tarif",
                "rule",
                "requestedpassengertype",
                "listrequesteddiscounts",
                "passengertype",
                "pricingunit",
                "flightinfo"
            })
            public static class FAREATTRIBUTES
                implements Serializable
            {

                @XmlElement(name = "BOOKING_CLASS")
                protected FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.BOOKINGCLASS bookingclass;
                @XmlElement(name = "FARE_BASIS")
                protected String farebasis;
                @XmlElement(name = "FARE_TYPE")
                protected FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FARETYPE faretype;
                @XmlElement(name = "TARIF")
                protected String tarif;
                @XmlElement(name = "RULE")
                protected String rule;
                @XmlElement(name = "REQUESTED_PASSENGER_TYPE")
                protected FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.REQUESTEDPASSENGERTYPE requestedpassengertype;
                @XmlElement(name = "LIST_REQUESTED_DISCOUNTS")
                protected List<CodeDescriptorType> listrequesteddiscounts;
                @XmlElement(name = "PASSENGER_TYPE")
                protected FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.PASSENGERTYPE passengertype;
                @XmlElement(name = "PRICING_UNIT")
                protected String pricingunit;
                @XmlElement(name = "FLIGHT_INFO")
                protected FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO flightinfo;

                /**
                 * Gets the value of the bookingclass property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.BOOKINGCLASS }
                 *     
                 */
                public FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.BOOKINGCLASS getBOOKINGCLASS() {
                    return bookingclass;
                }

                /**
                 * Sets the value of the bookingclass property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.BOOKINGCLASS }
                 *     
                 */
                public void setBOOKINGCLASS(FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.BOOKINGCLASS value) {
                    this.bookingclass = value;
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
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FARETYPE }
                 *     
                 */
                public FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FARETYPE getFARETYPE() {
                    return faretype;
                }

                /**
                 * Sets the value of the faretype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FARETYPE }
                 *     
                 */
                public void setFARETYPE(FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FARETYPE value) {
                    this.faretype = value;
                }

                /**
                 * Gets the value of the tarif property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTARIF() {
                    return tarif;
                }

                /**
                 * Sets the value of the tarif property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTARIF(String value) {
                    this.tarif = value;
                }

                /**
                 * Gets the value of the rule property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRULE() {
                    return rule;
                }

                /**
                 * Sets the value of the rule property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRULE(String value) {
                    this.rule = value;
                }

                /**
                 * Gets the value of the requestedpassengertype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.REQUESTEDPASSENGERTYPE }
                 *     
                 */
                public FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.REQUESTEDPASSENGERTYPE getREQUESTEDPASSENGERTYPE() {
                    return requestedpassengertype;
                }

                /**
                 * Sets the value of the requestedpassengertype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.REQUESTEDPASSENGERTYPE }
                 *     
                 */
                public void setREQUESTEDPASSENGERTYPE(FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.REQUESTEDPASSENGERTYPE value) {
                    this.requestedpassengertype = value;
                }

                /**
                 * Gets the value of the listrequesteddiscounts property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listrequesteddiscounts property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTREQUESTEDDISCOUNTS().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CodeDescriptorType }
                 * 
                 * 
                 */
                public List<CodeDescriptorType> getLISTREQUESTEDDISCOUNTS() {
                    if (listrequesteddiscounts == null) {
                        listrequesteddiscounts = new ArrayList<CodeDescriptorType>();
                    }
                    return this.listrequesteddiscounts;
                }

                /**
                 * Gets the value of the passengertype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.PASSENGERTYPE }
                 *     
                 */
                public FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.PASSENGERTYPE getPASSENGERTYPE() {
                    return passengertype;
                }

                /**
                 * Sets the value of the passengertype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.PASSENGERTYPE }
                 *     
                 */
                public void setPASSENGERTYPE(FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.PASSENGERTYPE value) {
                    this.passengertype = value;
                }

                /**
                 * Gets the value of the pricingunit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRICINGUNIT() {
                    return pricingunit;
                }

                /**
                 * Sets the value of the pricingunit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRICINGUNIT(String value) {
                    this.pricingunit = value;
                }

                /**
                 * Gets the value of the flightinfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO }
                 *     
                 */
                public FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO getFLIGHTINFO() {
                    return flightinfo;
                }

                /**
                 * Sets the value of the flightinfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO }
                 *     
                 */
                public void setFLIGHTINFO(FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO value) {
                    this.flightinfo = value;
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
                public static class BOOKINGCLASS
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
                public static class FARETYPE
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
                 *         &lt;element name="DESTINATION" minOccurs="0"&gt;
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
                 *         &lt;element name="AIRLINE" minOccurs="0"&gt;
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
                 *         &lt;element name="ORIGIN" minOccurs="0"&gt;
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
                    "destination",
                    "airline",
                    "origin"
                })
                public static class FLIGHTINFO
                    implements Serializable
                {

                    @XmlElement(name = "DESTINATION")
                    protected FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.DESTINATION destination;
                    @XmlElement(name = "AIRLINE")
                    protected FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.AIRLINE airline;
                    @XmlElement(name = "ORIGIN")
                    protected FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.ORIGIN origin;

                    /**
                     * Gets the value of the destination property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.DESTINATION }
                     *     
                     */
                    public FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.DESTINATION getDESTINATION() {
                        return destination;
                    }

                    /**
                     * Sets the value of the destination property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.DESTINATION }
                     *     
                     */
                    public void setDESTINATION(FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.DESTINATION value) {
                        this.destination = value;
                    }

                    /**
                     * Gets the value of the airline property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.AIRLINE }
                     *     
                     */
                    public FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.AIRLINE getAIRLINE() {
                        return airline;
                    }

                    /**
                     * Sets the value of the airline property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.AIRLINE }
                     *     
                     */
                    public void setAIRLINE(FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.AIRLINE value) {
                        this.airline = value;
                    }

                    /**
                     * Gets the value of the origin property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.ORIGIN }
                     *     
                     */
                    public FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.ORIGIN getORIGIN() {
                        return origin;
                    }

                    /**
                     * Sets the value of the origin property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.ORIGIN }
                     *     
                     */
                    public void setORIGIN(FareRulesOutput.LISTFARE.LISTFARECOMPONENT.FAREATTRIBUTES.FLIGHTINFO.ORIGIN value) {
                        this.origin = value;
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
                    public static class AIRLINE
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
                    public static class DESTINATION
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
                    public static class ORIGIN
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
                public static class PASSENGERTYPE
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
                public static class REQUESTEDPASSENGERTYPE
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
             *         &lt;element ref="{}RULE_CATEGORY_CODE"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="LIST_CONTENT" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CONTENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="INDENTATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
                "rulecategorycode",
                "name",
                "listcontent"
            })
            public static class LISTCATEGORY
                implements Serializable
            {

                @XmlElement(name = "RULE_CATEGORY_CODE", required = true)
                protected String rulecategorycode;
                @XmlElement(name = "NAME", required = true)
                protected String name;
                @XmlElement(name = "LIST_CONTENT")
                protected List<FareRulesOutput.LISTFARE.LISTFARECOMPONENT.LISTCATEGORY.LISTCONTENT> listcontent;

                /**
                 * Gets the value of the rulecategorycode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRULECATEGORYCODE() {
                    return rulecategorycode;
                }

                /**
                 * Sets the value of the rulecategorycode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRULECATEGORYCODE(String value) {
                    this.rulecategorycode = value;
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
                 * Gets the value of the listcontent property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listcontent property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTCONTENT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareRulesOutput.LISTFARE.LISTFARECOMPONENT.LISTCATEGORY.LISTCONTENT }
                 * 
                 * 
                 */
                public List<FareRulesOutput.LISTFARE.LISTFARECOMPONENT.LISTCATEGORY.LISTCONTENT> getLISTCONTENT() {
                    if (listcontent == null) {
                        listcontent = new ArrayList<FareRulesOutput.LISTFARE.LISTFARECOMPONENT.LISTCATEGORY.LISTCONTENT>();
                    }
                    return this.listcontent;
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
                 *         &lt;element name="CONTENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="INDENTATION_LEVEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
                    "content",
                    "indentationlevel"
                })
                public static class LISTCONTENT
                    implements Serializable
                {

                    @XmlElement(name = "CONTENT", required = true)
                    protected String content;
                    @XmlElement(name = "INDENTATION_LEVEL")
                    protected Integer indentationlevel;

                    /**
                     * Gets the value of the content property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCONTENT() {
                        return content;
                    }

                    /**
                     * Sets the value of the content property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCONTENT(String value) {
                        this.content = value;
                    }

                    /**
                     * Gets the value of the indentationlevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getINDENTATIONLEVEL() {
                        return indentationlevel;
                    }

                    /**
                     * Sets the value of the indentationlevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setINDENTATIONLEVEL(Integer value) {
                        this.indentationlevel = value;
                    }

                }

            }

        }

    }

}
