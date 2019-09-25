
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="DELIVERY_TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="ETCKT"/&gt;
 *                         &lt;enumeration value="TKTLS"/&gt;
 *                         &lt;enumeration value="PICK"/&gt;
 *                         &lt;enumeration value="ACC"/&gt;
 *                         &lt;enumeration value="MAIL"/&gt;
 *                         &lt;enumeration value="EMAIL"/&gt;
 *                         &lt;enumeration value="EXPML"/&gt;
 *                         &lt;enumeration value="HAND"/&gt;
 *                         &lt;enumeration value="NONE"/&gt;
 *                         &lt;enumeration value="RTIC"/&gt;
 *                         &lt;enumeration value="RPIC"/&gt;
 *                         &lt;enumeration value="EXT"/&gt;
 *                         &lt;enumeration value="RDEL"/&gt;
 *                         &lt;enumeration value="ROTK"/&gt;
 *                         &lt;enumeration value=""/&gt;
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
 *         &lt;element name="PICK_UP_REFERENCE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="PICK_UP_TYPE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="C"/&gt;
 *                                   &lt;enumeration value="A"/&gt;
 *                                   &lt;enumeration value="O"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="QUEUING_OFFICE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="OFFICE_ID"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;minLength value="2"/&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="CATEGORY"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="OFFICE_ID"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;minLength value="2"/&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="CATEGORY"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="10"/&gt;
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
 *         &lt;element name="ACCOUNT_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAIL_REFERENCE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ADDRESS_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SERVICE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="AB1D"/&gt;
 *                                   &lt;enumeration value="AB2D"/&gt;
 *                                   &lt;enumeration value="AI2BOR"/&gt;
 *                                   &lt;enumeration value="AIRBOR"/&gt;
 *                                   &lt;enumeration value="ARGCOR"/&gt;
 *                                   &lt;enumeration value="CHRONO"/&gt;
 *                                   &lt;enumeration value="CISES"/&gt;
 *                                   &lt;enumeration value="DHL"/&gt;
 *                                   &lt;enumeration value="EXP"/&gt;
 *                                   &lt;enumeration value="FEDXPR"/&gt;
 *                                   &lt;enumeration value="JETSVC"/&gt;
 *                                   &lt;enumeration value="NORMAL"/&gt;
 *                                   &lt;enumeration value="OCA"/&gt;
 *                                   &lt;enumeration value="PUROLA"/&gt;
 *                                   &lt;enumeration value="RGL"/&gt;
 *                                   &lt;enumeration value="RMRD"/&gt;
 *                                   &lt;enumeration value="RMSD"/&gt;
 *                                   &lt;enumeration value="SDA"/&gt;
 *                                   &lt;enumeration value="SEDEX"/&gt;
 *                                   &lt;enumeration value="TNT"/&gt;
 *                                   &lt;enumeration value="TRACO"/&gt;
 *                                   &lt;enumeration value="TRACO1"/&gt;
 *                                   &lt;enumeration value="TRACO10"/&gt;
 *                                   &lt;enumeration value="TRAL17"/&gt;
 *                                   &lt;enumeration value="TRAL170"/&gt;
 *                                   &lt;enumeration value="TRAL18"/&gt;
 *                                   &lt;enumeration value="TRAL180"/&gt;
 *                                   &lt;enumeration value="TRAL20"/&gt;
 *                                   &lt;enumeration value="TRAL200"/&gt;
 *                                   &lt;enumeration value="TRALE6"/&gt;
 *                                   &lt;enumeration value="TRALE60"/&gt;
 *                                   &lt;enumeration value="TRALE7"/&gt;
 *                                   &lt;enumeration value="TRALE70"/&gt;
 *                                   &lt;enumeration value="TRALE8"/&gt;
 *                                   &lt;enumeration value="TRALE80"/&gt;
 *                                   &lt;enumeration value="UPS"/&gt;
 *                                   &lt;enumeration value="UPS1D"/&gt;
 *                                   &lt;enumeration value="UPS2D"/&gt;
 *                                   &lt;enumeration value="USMAIL"/&gt;
 *                                   &lt;enumeration value="USPMAI"/&gt;
 *                                   &lt;enumeration value="USPSTL"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="QUEUING_OFFICE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OFFICE_ID"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;minLength value="2"/&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="CATEGORY"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OFFICE_ID"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;minLength value="2"/&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="CATEGORY"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
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
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_TICKET_REFERENCE" type="{}FOID_INFORMATION_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FOID_INFORMATION" type="{}FOID_INFORMATION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EXTERNAL_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="DETAILS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_SPECIAL_PROGRAM" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="SPECIAL_PROGRAM_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="DELIVERY_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
 *         &lt;element name="DELIVERY_IDENTIFIER" type="{}DELIVERY_IDENTIFIER" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ASSOCIATED_DOCUMENT" type="{}LIST_ASSOCIATED_DOCUMENT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    "deliverytype",
    "pickupreference",
    "accountreference",
    "mailreference",
    "eticketreference",
    "listfoidinformation",
    "type",
    "externalinformation",
    "listspecialprogram",
    "deliveryidentifier",
    "listassociateddocument",
    "deliveryid"
})
@XmlRootElement(name = "LIST_DELIVERY_INFORMATION")
public class LISTDELIVERYINFORMATION
    implements Serializable
{

    @XmlElement(name = "DELIVERY_TYPE")
    protected LISTDELIVERYINFORMATION.DELIVERYTYPE deliverytype;
    @XmlElement(name = "PICK_UP_REFERENCE")
    protected LISTDELIVERYINFORMATION.PICKUPREFERENCE pickupreference;
    @XmlElement(name = "ACCOUNT_REFERENCE")
    protected String accountreference;
    @XmlElement(name = "MAIL_REFERENCE")
    protected LISTDELIVERYINFORMATION.MAILREFERENCE mailreference;
    @XmlElement(name = "E_TICKET_REFERENCE")
    protected FOIDINFORMATIONTYPE eticketreference;
    @XmlElement(name = "LIST_FOID_INFORMATION")
    protected List<FOIDINFORMATIONTYPE> listfoidinformation;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "EXTERNAL_INFORMATION")
    protected LISTDELIVERYINFORMATION.EXTERNALINFORMATION externalinformation;
    @XmlElement(name = "LIST_SPECIAL_PROGRAM")
    protected List<LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM> listspecialprogram;
    @XmlElement(name = "DELIVERY_IDENTIFIER")
    protected DELIVERYIDENTIFIER deliveryidentifier;
    @XmlElement(name = "LIST_ASSOCIATED_DOCUMENT")
    protected List<LISTASSOCIATEDDOCUMENT> listassociateddocument;
    @XmlElement(name = "DELIVERY_ID")
    protected Object deliveryid;

    /**
     * Gets the value of the deliverytype property.
     * 
     * @return
     *     possible object is
     *     {@link LISTDELIVERYINFORMATION.DELIVERYTYPE }
     *     
     */
    public LISTDELIVERYINFORMATION.DELIVERYTYPE getDELIVERYTYPE() {
        return deliverytype;
    }

    /**
     * Sets the value of the deliverytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTDELIVERYINFORMATION.DELIVERYTYPE }
     *     
     */
    public void setDELIVERYTYPE(LISTDELIVERYINFORMATION.DELIVERYTYPE value) {
        this.deliverytype = value;
    }

    /**
     * Gets the value of the pickupreference property.
     * 
     * @return
     *     possible object is
     *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE }
     *     
     */
    public LISTDELIVERYINFORMATION.PICKUPREFERENCE getPICKUPREFERENCE() {
        return pickupreference;
    }

    /**
     * Sets the value of the pickupreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE }
     *     
     */
    public void setPICKUPREFERENCE(LISTDELIVERYINFORMATION.PICKUPREFERENCE value) {
        this.pickupreference = value;
    }

    /**
     * Gets the value of the accountreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTREFERENCE() {
        return accountreference;
    }

    /**
     * Sets the value of the accountreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTREFERENCE(String value) {
        this.accountreference = value;
    }

    /**
     * Gets the value of the mailreference property.
     * 
     * @return
     *     possible object is
     *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE }
     *     
     */
    public LISTDELIVERYINFORMATION.MAILREFERENCE getMAILREFERENCE() {
        return mailreference;
    }

    /**
     * Sets the value of the mailreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE }
     *     
     */
    public void setMAILREFERENCE(LISTDELIVERYINFORMATION.MAILREFERENCE value) {
        this.mailreference = value;
    }

    /**
     * Gets the value of the eticketreference property.
     * 
     * @return
     *     possible object is
     *     {@link FOIDINFORMATIONTYPE }
     *     
     */
    public FOIDINFORMATIONTYPE getETICKETREFERENCE() {
        return eticketreference;
    }

    /**
     * Sets the value of the eticketreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOIDINFORMATIONTYPE }
     *     
     */
    public void setETICKETREFERENCE(FOIDINFORMATIONTYPE value) {
        this.eticketreference = value;
    }

    /**
     * Gets the value of the listfoidinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfoidinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFOIDINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOIDINFORMATIONTYPE }
     * 
     * 
     */
    public List<FOIDINFORMATIONTYPE> getLISTFOIDINFORMATION() {
        if (listfoidinformation == null) {
            listfoidinformation = new ArrayList<FOIDINFORMATIONTYPE>();
        }
        return this.listfoidinformation;
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
     * Gets the value of the externalinformation property.
     * 
     * @return
     *     possible object is
     *     {@link LISTDELIVERYINFORMATION.EXTERNALINFORMATION }
     *     
     */
    public LISTDELIVERYINFORMATION.EXTERNALINFORMATION getEXTERNALINFORMATION() {
        return externalinformation;
    }

    /**
     * Sets the value of the externalinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTDELIVERYINFORMATION.EXTERNALINFORMATION }
     *     
     */
    public void setEXTERNALINFORMATION(LISTDELIVERYINFORMATION.EXTERNALINFORMATION value) {
        this.externalinformation = value;
    }

    /**
     * Gets the value of the listspecialprogram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspecialprogram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPECIALPROGRAM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM }
     * 
     * 
     */
    public List<LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM> getLISTSPECIALPROGRAM() {
        if (listspecialprogram == null) {
            listspecialprogram = new ArrayList<LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM>();
        }
        return this.listspecialprogram;
    }

    /**
     * Gets the value of the deliveryidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link DELIVERYIDENTIFIER }
     *     
     */
    public DELIVERYIDENTIFIER getDELIVERYIDENTIFIER() {
        return deliveryidentifier;
    }

    /**
     * Sets the value of the deliveryidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELIVERYIDENTIFIER }
     *     
     */
    public void setDELIVERYIDENTIFIER(DELIVERYIDENTIFIER value) {
        this.deliveryidentifier = value;
    }

    /**
     * Gets the value of the listassociateddocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listassociateddocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTASSOCIATEDDOCUMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTASSOCIATEDDOCUMENT }
     * 
     * 
     */
    public List<LISTASSOCIATEDDOCUMENT> getLISTASSOCIATEDDOCUMENT() {
        if (listassociateddocument == null) {
            listassociateddocument = new ArrayList<LISTASSOCIATEDDOCUMENT>();
        }
        return this.listassociateddocument;
    }

    /**
     * Gets the value of the deliveryid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDELIVERYID() {
        return deliveryid;
    }

    /**
     * Sets the value of the deliveryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDELIVERYID(Object value) {
        this.deliveryid = value;
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
     *               &lt;enumeration value="ETCKT"/&gt;
     *               &lt;enumeration value="TKTLS"/&gt;
     *               &lt;enumeration value="PICK"/&gt;
     *               &lt;enumeration value="ACC"/&gt;
     *               &lt;enumeration value="MAIL"/&gt;
     *               &lt;enumeration value="EMAIL"/&gt;
     *               &lt;enumeration value="EXPML"/&gt;
     *               &lt;enumeration value="HAND"/&gt;
     *               &lt;enumeration value="NONE"/&gt;
     *               &lt;enumeration value="RTIC"/&gt;
     *               &lt;enumeration value="RPIC"/&gt;
     *               &lt;enumeration value="EXT"/&gt;
     *               &lt;enumeration value="RDEL"/&gt;
     *               &lt;enumeration value="ROTK"/&gt;
     *               &lt;enumeration value=""/&gt;
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
    public static class DELIVERYTYPE
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
     *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="DETAILS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    public static class EXTERNALINFORMATION
        implements Serializable
    {

        @XmlElement(name = "LABEL", required = true)
        protected Object label;
        @XmlElement(name = "DETAILS")
        protected Object details;

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLABEL() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLABEL(Object value) {
            this.label = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDETAILS() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDETAILS(Object value) {
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
     *       &lt;all&gt;
     *         &lt;element name="SPECIAL_PROGRAM_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="DELIVERY_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    public static class LISTSPECIALPROGRAM
        implements Serializable
    {

        @XmlElement(name = "SPECIAL_PROGRAM_CODE")
        protected Object specialprogramcode;
        @XmlElement(name = "DELIVERY_TYPE")
        protected LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE deliverytype;

        /**
         * Gets the value of the specialprogramcode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSPECIALPROGRAMCODE() {
            return specialprogramcode;
        }

        /**
         * Sets the value of the specialprogramcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSPECIALPROGRAMCODE(Object value) {
            this.specialprogramcode = value;
        }

        /**
         * Gets the value of the deliverytype property.
         * 
         * @return
         *     possible object is
         *     {@link LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE }
         *     
         */
        public LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE getDELIVERYTYPE() {
            return deliverytype;
        }

        /**
         * Sets the value of the deliverytype property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE }
         *     
         */
        public void setDELIVERYTYPE(LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE value) {
            this.deliverytype = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        public static class DELIVERYTYPE
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
     *         &lt;element name="ADDRESS_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SERVICE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="AB1D"/&gt;
     *                         &lt;enumeration value="AB2D"/&gt;
     *                         &lt;enumeration value="AI2BOR"/&gt;
     *                         &lt;enumeration value="AIRBOR"/&gt;
     *                         &lt;enumeration value="ARGCOR"/&gt;
     *                         &lt;enumeration value="CHRONO"/&gt;
     *                         &lt;enumeration value="CISES"/&gt;
     *                         &lt;enumeration value="DHL"/&gt;
     *                         &lt;enumeration value="EXP"/&gt;
     *                         &lt;enumeration value="FEDXPR"/&gt;
     *                         &lt;enumeration value="JETSVC"/&gt;
     *                         &lt;enumeration value="NORMAL"/&gt;
     *                         &lt;enumeration value="OCA"/&gt;
     *                         &lt;enumeration value="PUROLA"/&gt;
     *                         &lt;enumeration value="RGL"/&gt;
     *                         &lt;enumeration value="RMRD"/&gt;
     *                         &lt;enumeration value="RMSD"/&gt;
     *                         &lt;enumeration value="SDA"/&gt;
     *                         &lt;enumeration value="SEDEX"/&gt;
     *                         &lt;enumeration value="TNT"/&gt;
     *                         &lt;enumeration value="TRACO"/&gt;
     *                         &lt;enumeration value="TRACO1"/&gt;
     *                         &lt;enumeration value="TRACO10"/&gt;
     *                         &lt;enumeration value="TRAL17"/&gt;
     *                         &lt;enumeration value="TRAL170"/&gt;
     *                         &lt;enumeration value="TRAL18"/&gt;
     *                         &lt;enumeration value="TRAL180"/&gt;
     *                         &lt;enumeration value="TRAL20"/&gt;
     *                         &lt;enumeration value="TRAL200"/&gt;
     *                         &lt;enumeration value="TRALE6"/&gt;
     *                         &lt;enumeration value="TRALE60"/&gt;
     *                         &lt;enumeration value="TRALE7"/&gt;
     *                         &lt;enumeration value="TRALE70"/&gt;
     *                         &lt;enumeration value="TRALE8"/&gt;
     *                         &lt;enumeration value="TRALE80"/&gt;
     *                         &lt;enumeration value="UPS"/&gt;
     *                         &lt;enumeration value="UPS1D"/&gt;
     *                         &lt;enumeration value="UPS2D"/&gt;
     *                         &lt;enumeration value="USMAIL"/&gt;
     *                         &lt;enumeration value="USPMAI"/&gt;
     *                         &lt;enumeration value="USPSTL"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="QUEUING_OFFICE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OFFICE_ID"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;minLength value="2"/&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="CATEGORY"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OFFICE_ID"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;minLength value="2"/&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="CATEGORY"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
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
    public static class MAILREFERENCE
        implements Serializable
    {

        @XmlElement(name = "ADDRESS_ID")
        protected String addressid;
        @XmlElement(name = "SERVICE")
        protected LISTDELIVERYINFORMATION.MAILREFERENCE.SERVICE service;
        @XmlElement(name = "QUEUING_OFFICE")
        protected LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE queuingoffice;

        /**
         * Gets the value of the addressid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESSID() {
            return addressid;
        }

        /**
         * Sets the value of the addressid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESSID(String value) {
            this.addressid = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE.SERVICE }
         *     
         */
        public LISTDELIVERYINFORMATION.MAILREFERENCE.SERVICE getSERVICE() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE.SERVICE }
         *     
         */
        public void setSERVICE(LISTDELIVERYINFORMATION.MAILREFERENCE.SERVICE value) {
            this.service = value;
        }

        /**
         * Gets the value of the queuingoffice property.
         * 
         * @return
         *     possible object is
         *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE }
         *     
         */
        public LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE getQUEUINGOFFICE() {
            return queuingoffice;
        }

        /**
         * Sets the value of the queuingoffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE }
         *     
         */
        public void setQUEUINGOFFICE(LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE value) {
            this.queuingoffice = value;
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
         *         &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OFFICE_ID"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;minLength value="2"/&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="CATEGORY"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OFFICE_ID"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;minLength value="2"/&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="CATEGORY"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
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
        public static class QUEUINGOFFICE
            implements Serializable
        {

            @XmlElement(name = "QUEUE_ID")
            protected BigInteger queueid;
            @XmlElement(name = "NORMAL_QUEUE")
            protected LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.NORMALQUEUE normalqueue;
            @XmlElement(name = "FAILURE_QUEUE")
            protected LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.FAILUREQUEUE failurequeue;

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
             * Gets the value of the normalqueue property.
             * 
             * @return
             *     possible object is
             *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.NORMALQUEUE }
             *     
             */
            public LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.NORMALQUEUE getNORMALQUEUE() {
                return normalqueue;
            }

            /**
             * Sets the value of the normalqueue property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.NORMALQUEUE }
             *     
             */
            public void setNORMALQUEUE(LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.NORMALQUEUE value) {
                this.normalqueue = value;
            }

            /**
             * Gets the value of the failurequeue property.
             * 
             * @return
             *     possible object is
             *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.FAILUREQUEUE }
             *     
             */
            public LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.FAILUREQUEUE getFAILUREQUEUE() {
                return failurequeue;
            }

            /**
             * Sets the value of the failurequeue property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.FAILUREQUEUE }
             *     
             */
            public void setFAILUREQUEUE(LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.FAILUREQUEUE value) {
                this.failurequeue = value;
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
             *         &lt;element name="OFFICE_ID"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;minLength value="2"/&gt;
             *               &lt;maxLength value="10"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="CATEGORY"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="10"/&gt;
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
                "officeid",
                "number",
                "category"
            })
            public static class FAILUREQUEUE
                implements Serializable
            {

                @XmlElement(name = "OFFICE_ID", required = true)
                protected String officeid;
                @XmlElement(name = "NUMBER", required = true)
                protected BigInteger number;
                @XmlElement(name = "CATEGORY", required = true)
                protected String category;

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
             *         &lt;element name="OFFICE_ID"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;minLength value="2"/&gt;
             *               &lt;maxLength value="10"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="CATEGORY"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="10"/&gt;
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
                "officeid",
                "number",
                "category"
            })
            public static class NORMALQUEUE
                implements Serializable
            {

                @XmlElement(name = "OFFICE_ID", required = true)
                protected String officeid;
                @XmlElement(name = "NUMBER", required = true)
                protected BigInteger number;
                @XmlElement(name = "CATEGORY", required = true)
                protected String category;

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
         *               &lt;enumeration value="AB1D"/&gt;
         *               &lt;enumeration value="AB2D"/&gt;
         *               &lt;enumeration value="AI2BOR"/&gt;
         *               &lt;enumeration value="AIRBOR"/&gt;
         *               &lt;enumeration value="ARGCOR"/&gt;
         *               &lt;enumeration value="CHRONO"/&gt;
         *               &lt;enumeration value="CISES"/&gt;
         *               &lt;enumeration value="DHL"/&gt;
         *               &lt;enumeration value="EXP"/&gt;
         *               &lt;enumeration value="FEDXPR"/&gt;
         *               &lt;enumeration value="JETSVC"/&gt;
         *               &lt;enumeration value="NORMAL"/&gt;
         *               &lt;enumeration value="OCA"/&gt;
         *               &lt;enumeration value="PUROLA"/&gt;
         *               &lt;enumeration value="RGL"/&gt;
         *               &lt;enumeration value="RMRD"/&gt;
         *               &lt;enumeration value="RMSD"/&gt;
         *               &lt;enumeration value="SDA"/&gt;
         *               &lt;enumeration value="SEDEX"/&gt;
         *               &lt;enumeration value="TNT"/&gt;
         *               &lt;enumeration value="TRACO"/&gt;
         *               &lt;enumeration value="TRACO1"/&gt;
         *               &lt;enumeration value="TRACO10"/&gt;
         *               &lt;enumeration value="TRAL17"/&gt;
         *               &lt;enumeration value="TRAL170"/&gt;
         *               &lt;enumeration value="TRAL18"/&gt;
         *               &lt;enumeration value="TRAL180"/&gt;
         *               &lt;enumeration value="TRAL20"/&gt;
         *               &lt;enumeration value="TRAL200"/&gt;
         *               &lt;enumeration value="TRALE6"/&gt;
         *               &lt;enumeration value="TRALE60"/&gt;
         *               &lt;enumeration value="TRALE7"/&gt;
         *               &lt;enumeration value="TRALE70"/&gt;
         *               &lt;enumeration value="TRALE8"/&gt;
         *               &lt;enumeration value="TRALE80"/&gt;
         *               &lt;enumeration value="UPS"/&gt;
         *               &lt;enumeration value="UPS1D"/&gt;
         *               &lt;enumeration value="UPS2D"/&gt;
         *               &lt;enumeration value="USMAIL"/&gt;
         *               &lt;enumeration value="USPMAI"/&gt;
         *               &lt;enumeration value="USPSTL"/&gt;
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
        public static class SERVICE
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
     *         &lt;element name="PICK_UP_TYPE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="C"/&gt;
     *                         &lt;enumeration value="A"/&gt;
     *                         &lt;enumeration value="O"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="QUEUING_OFFICE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="OFFICE_ID"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;minLength value="2"/&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="CATEGORY"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="OFFICE_ID"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;minLength value="2"/&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="CATEGORY"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="10"/&gt;
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
    public static class PICKUPREFERENCE
        implements Serializable
    {

        @XmlElement(name = "PICK_UP_TYPE", required = true)
        protected LISTDELIVERYINFORMATION.PICKUPREFERENCE.PICKUPTYPE pickuptype;
        @XmlElement(name = "QUEUING_OFFICE")
        protected LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE queuingoffice;

        /**
         * Gets the value of the pickuptype property.
         * 
         * @return
         *     possible object is
         *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.PICKUPTYPE }
         *     
         */
        public LISTDELIVERYINFORMATION.PICKUPREFERENCE.PICKUPTYPE getPICKUPTYPE() {
            return pickuptype;
        }

        /**
         * Sets the value of the pickuptype property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.PICKUPTYPE }
         *     
         */
        public void setPICKUPTYPE(LISTDELIVERYINFORMATION.PICKUPREFERENCE.PICKUPTYPE value) {
            this.pickuptype = value;
        }

        /**
         * Gets the value of the queuingoffice property.
         * 
         * @return
         *     possible object is
         *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE }
         *     
         */
        public LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE getQUEUINGOFFICE() {
            return queuingoffice;
        }

        /**
         * Sets the value of the queuingoffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE }
         *     
         */
        public void setQUEUINGOFFICE(LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE value) {
            this.queuingoffice = value;
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
         *               &lt;enumeration value="C"/&gt;
         *               &lt;enumeration value="A"/&gt;
         *               &lt;enumeration value="O"/&gt;
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
        public static class PICKUPTYPE
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
         *         &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="OFFICE_ID"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;minLength value="2"/&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="CATEGORY"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="OFFICE_ID"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;minLength value="2"/&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="CATEGORY"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="10"/&gt;
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
        public static class QUEUINGOFFICE
            implements Serializable
        {

            @XmlElement(name = "QUEUE_ID")
            protected BigInteger queueid;
            @XmlElement(name = "NORMAL_QUEUE")
            protected LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.NORMALQUEUE normalqueue;
            @XmlElement(name = "FAILURE_QUEUE")
            protected LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.FAILUREQUEUE failurequeue;

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
             * Gets the value of the normalqueue property.
             * 
             * @return
             *     possible object is
             *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.NORMALQUEUE }
             *     
             */
            public LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.NORMALQUEUE getNORMALQUEUE() {
                return normalqueue;
            }

            /**
             * Sets the value of the normalqueue property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.NORMALQUEUE }
             *     
             */
            public void setNORMALQUEUE(LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.NORMALQUEUE value) {
                this.normalqueue = value;
            }

            /**
             * Gets the value of the failurequeue property.
             * 
             * @return
             *     possible object is
             *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.FAILUREQUEUE }
             *     
             */
            public LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.FAILUREQUEUE getFAILUREQUEUE() {
                return failurequeue;
            }

            /**
             * Sets the value of the failurequeue property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.FAILUREQUEUE }
             *     
             */
            public void setFAILUREQUEUE(LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.FAILUREQUEUE value) {
                this.failurequeue = value;
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
             *         &lt;element name="OFFICE_ID"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;minLength value="2"/&gt;
             *               &lt;maxLength value="10"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="CATEGORY"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="10"/&gt;
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
            public static class FAILUREQUEUE
                implements Serializable
            {

                @XmlElement(name = "OFFICE_ID", required = true)
                protected String officeid;
                @XmlElement(name = "NUMBER", required = true)
                protected BigInteger number;
                @XmlElement(name = "CATEGORY", required = true)
                protected String category;

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
             *         &lt;element name="OFFICE_ID"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;minLength value="2"/&gt;
             *               &lt;maxLength value="10"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="CATEGORY"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="10"/&gt;
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
            public static class NORMALQUEUE
                implements Serializable
            {

                @XmlElement(name = "OFFICE_ID", required = true)
                protected String officeid;
                @XmlElement(name = "NUMBER", required = true)
                protected BigInteger number;
                @XmlElement(name = "CATEGORY", required = true)
                protected String category;

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

            }

        }

    }

}
