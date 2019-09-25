
package com.koreanair.external.eretail.vo.tripplan.insurance;

import java.io.Serializable;
import java.math.BigDecimal;
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
import com.koreanair.external.eretail.vo.common.common.CurrencyType;
import com.koreanair.external.eretail.vo.tripplan.common.common_technical_ids.TechnicalIds;


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
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_INSURANCE_PRODUCT" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EXTENSION_CODE" minOccurs="0"&gt;
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
 *                   &lt;element name="IS_ANNUAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="GENERAL_CONDITION_URL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_INSURANCE_BOOKING" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{}CommonItinerary" minOccurs="0"/&gt;
 *                   &lt;element name="INSURANCE_PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
 *                   &lt;element name="B_DATE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="E_DATE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="CURRENCY"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
 *                   &lt;element name="CONFIRMATION_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMENT_INFORMATION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="PAYMENT_TYPE"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CREDIT_CARD_INFORMATION" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="COMPANY"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                                 &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                                               &lt;/all&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="EXPIRY_DATE"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                                               &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
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
 *                   &lt;element name="PLAN_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LIST_COVERED_COUNTRY" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TRAVEL_VALUE"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TRIP_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLAN_COST_INFO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "type",
    "listinsuranceproduct",
    "listinsurancebooking"
})
@XmlRootElement(name = "INSURANCE")
public class INSURANCE
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "LIST_INSURANCE_PRODUCT", required = true)
    protected List<INSURANCE.LISTINSURANCEPRODUCT> listinsuranceproduct;
    @XmlElement(name = "LIST_INSURANCE_BOOKING")
    protected List<INSURANCE.LISTINSURANCEBOOKING> listinsurancebooking;

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
     * Gets the value of the listinsuranceproduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listinsuranceproduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINSURANCEPRODUCT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INSURANCE.LISTINSURANCEPRODUCT }
     * 
     * 
     */
    public List<INSURANCE.LISTINSURANCEPRODUCT> getLISTINSURANCEPRODUCT() {
        if (listinsuranceproduct == null) {
            listinsuranceproduct = new ArrayList<INSURANCE.LISTINSURANCEPRODUCT>();
        }
        return this.listinsuranceproduct;
    }

    /**
     * Gets the value of the listinsurancebooking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listinsurancebooking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINSURANCEBOOKING().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INSURANCE.LISTINSURANCEBOOKING }
     * 
     * 
     */
    public List<INSURANCE.LISTINSURANCEBOOKING> getLISTINSURANCEBOOKING() {
        if (listinsurancebooking == null) {
            listinsurancebooking = new ArrayList<INSURANCE.LISTINSURANCEBOOKING>();
        }
        return this.listinsurancebooking;
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
     *         &lt;group ref="{}CommonItinerary" minOccurs="0"/&gt;
     *         &lt;element name="INSURANCE_PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
     *         &lt;element name="B_DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="E_DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="CURRENCY"&gt;
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
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CONFIRMATION_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PAYMENT_INFORMATION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="PAYMENT_TYPE"&gt;
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
     *                   &lt;element name="CREDIT_CARD_INFORMATION" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="COMPANY"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                                       &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                                     &lt;/all&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="EXPIRY_DATE"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
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
     *         &lt;element name="PLAN_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LIST_COVERED_COUNTRY" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TRAVEL_VALUE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TRIP_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PLAN_COST_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        "type",
        "itemid",
        "activegds",
        "segmenttatoo",
        "tatooother",
        "status",
        "description",
        "initialelement",
        "deletedelement",
        "isreplacing",
        "tobereplaced",
        "bookedelement",
        "itemidtobereplaced",
        "listtravellerid",
        "permissions",
        "eligibilityinformation",
        "pnrinformation",
        "issuedate",
        "technicalids",
        "actioncode",
        "insuranceproductid",
        "listcoveredtraveller",
        "bdate",
        "edate",
        "listprice",
        "confirmationnumber",
        "paymentinformation",
        "plantype",
        "plancostinfo"
    })
    public static class LISTINSURANCEBOOKING
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "ITEM_ID")
        protected BigInteger itemid;
        @XmlElement(name = "ACTIVE_GDS")
        protected String activegds;
        @XmlElement(name = "SEGMENT_TATOO")
        protected BigInteger segmenttatoo;
        @XmlElement(name = "TATOO_OTHER")
        protected BigInteger tatooother;
        @XmlElement(name = "STATUS")
        protected INSURANCE.LISTINSURANCEBOOKING.STATUS status;
        @XmlElement(name = "DESCRIPTION")
        protected INSURANCE.LISTINSURANCEBOOKING.DESCRIPTION description;
        @XmlElement(name = "INITIAL_ELEMENT")
        protected Boolean initialelement;
        @XmlElement(name = "DELETED_ELEMENT")
        protected Boolean deletedelement;
        @XmlElement(name = "IS_REPLACING")
        protected Boolean isreplacing;
        @XmlElement(name = "TO_BE_REPLACED")
        protected Boolean tobereplaced;
        @XmlElement(name = "BOOKED_ELEMENT")
        protected Boolean bookedelement;
        @XmlElement(name = "ITEM_ID_TO_BE_REPLACED")
        protected BigInteger itemidtobereplaced;
        @XmlElement(name = "LIST_TRAVELLER_ID")
        protected List<BigInteger> listtravellerid;
        @XmlElement(name = "PERMISSIONS")
        protected INSURANCE.LISTINSURANCEBOOKING.PERMISSIONS permissions;
        @XmlElement(name = "ELIGIBILITY_INFORMATION")
        protected INSURANCE.LISTINSURANCEBOOKING.ELIGIBILITYINFORMATION eligibilityinformation;
        @XmlElement(name = "PNR_INFORMATION")
        protected INSURANCE.LISTINSURANCEBOOKING.PNRINFORMATION pnrinformation;
        @XmlElement(name = "ISSUE_DATE")
        protected INSURANCE.LISTINSURANCEBOOKING.ISSUEDATE issuedate;
        @XmlElement(name = "TECHNICAL_IDS")
        protected TechnicalIds technicalids;
        @XmlElement(name = "ACTION_CODE")
        protected String actioncode;
        @XmlElement(name = "INSURANCE_PRODUCT_ID", required = true)
        protected BigInteger insuranceproductid;
        @XmlElement(name = "LIST_COVERED_TRAVELLER", required = true)
        protected List<INSURANCE.LISTINSURANCEBOOKING.LISTCOVEREDTRAVELLER> listcoveredtraveller;
        @XmlElement(name = "B_DATE", required = true)
        protected INSURANCE.LISTINSURANCEBOOKING.BDATE bdate;
        @XmlElement(name = "E_DATE", required = true)
        protected INSURANCE.LISTINSURANCEBOOKING.EDATE edate;
        @XmlElement(name = "LIST_PRICE")
        protected List<INSURANCE.LISTINSURANCEBOOKING.LISTPRICE> listprice;
        @XmlElement(name = "CONFIRMATION_NUMBER")
        protected String confirmationnumber;
        @XmlElement(name = "PAYMENT_INFORMATION")
        protected INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION paymentinformation;
        @XmlElement(name = "PLAN_TYPE")
        protected INSURANCE.LISTINSURANCEBOOKING.PLANTYPE plantype;
        @XmlElement(name = "PLAN_COST_INFO")
        protected INSURANCE.LISTINSURANCEBOOKING.PLANCOSTINFO plancostinfo;

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
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.STATUS }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.STATUS getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.STATUS }
         *     
         */
        public void setSTATUS(INSURANCE.LISTINSURANCEBOOKING.STATUS value) {
            this.status = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.DESCRIPTION }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.DESCRIPTION getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.DESCRIPTION }
         *     
         */
        public void setDESCRIPTION(INSURANCE.LISTINSURANCEBOOKING.DESCRIPTION value) {
            this.description = value;
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
         * Gets the value of the isreplacing property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISREPLACING() {
            return isreplacing;
        }

        /**
         * Sets the value of the isreplacing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISREPLACING(Boolean value) {
            this.isreplacing = value;
        }

        /**
         * Gets the value of the tobereplaced property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTOBEREPLACED() {
            return tobereplaced;
        }

        /**
         * Sets the value of the tobereplaced property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTOBEREPLACED(Boolean value) {
            this.tobereplaced = value;
        }

        /**
         * Gets the value of the bookedelement property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBOOKEDELEMENT() {
            return bookedelement;
        }

        /**
         * Sets the value of the bookedelement property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBOOKEDELEMENT(Boolean value) {
            this.bookedelement = value;
        }

        /**
         * Gets the value of the itemidtobereplaced property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getITEMIDTOBEREPLACED() {
            return itemidtobereplaced;
        }

        /**
         * Sets the value of the itemidtobereplaced property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setITEMIDTOBEREPLACED(BigInteger value) {
            this.itemidtobereplaced = value;
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
         * Gets the value of the permissions property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PERMISSIONS }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.PERMISSIONS getPERMISSIONS() {
            return permissions;
        }

        /**
         * Sets the value of the permissions property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PERMISSIONS }
         *     
         */
        public void setPERMISSIONS(INSURANCE.LISTINSURANCEBOOKING.PERMISSIONS value) {
            this.permissions = value;
        }

        /**
         * Gets the value of the eligibilityinformation property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.ELIGIBILITYINFORMATION }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
            return eligibilityinformation;
        }

        /**
         * Sets the value of the eligibilityinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.ELIGIBILITYINFORMATION }
         *     
         */
        public void setELIGIBILITYINFORMATION(INSURANCE.LISTINSURANCEBOOKING.ELIGIBILITYINFORMATION value) {
            this.eligibilityinformation = value;
        }

        /**
         * Gets the value of the pnrinformation property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PNRINFORMATION }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.PNRINFORMATION getPNRINFORMATION() {
            return pnrinformation;
        }

        /**
         * Sets the value of the pnrinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PNRINFORMATION }
         *     
         */
        public void setPNRINFORMATION(INSURANCE.LISTINSURANCEBOOKING.PNRINFORMATION value) {
            this.pnrinformation = value;
        }

        /**
         * Gets the value of the issuedate property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.ISSUEDATE }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.ISSUEDATE getISSUEDATE() {
            return issuedate;
        }

        /**
         * Sets the value of the issuedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.ISSUEDATE }
         *     
         */
        public void setISSUEDATE(INSURANCE.LISTINSURANCEBOOKING.ISSUEDATE value) {
            this.issuedate = value;
        }

        /**
         * Gets the value of the technicalids property.
         * 
         * @return
         *     possible object is
         *     {@link TechnicalIds }
         *     
         */
        public TechnicalIds getTECHNICALIDS() {
            return technicalids;
        }

        /**
         * Sets the value of the technicalids property.
         * 
         * @param value
         *     allowed object is
         *     {@link TechnicalIds }
         *     
         */
        public void setTECHNICALIDS(TechnicalIds value) {
            this.technicalids = value;
        }

        /**
         * Gets the value of the actioncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACTIONCODE() {
            return actioncode;
        }

        /**
         * Sets the value of the actioncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACTIONCODE(String value) {
            this.actioncode = value;
        }

        /**
         * Gets the value of the insuranceproductid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getINSURANCEPRODUCTID() {
            return insuranceproductid;
        }

        /**
         * Sets the value of the insuranceproductid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setINSURANCEPRODUCTID(BigInteger value) {
            this.insuranceproductid = value;
        }

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
         * {@link INSURANCE.LISTINSURANCEBOOKING.LISTCOVEREDTRAVELLER }
         * 
         * 
         */
        public List<INSURANCE.LISTINSURANCEBOOKING.LISTCOVEREDTRAVELLER> getLISTCOVEREDTRAVELLER() {
            if (listcoveredtraveller == null) {
                listcoveredtraveller = new ArrayList<INSURANCE.LISTINSURANCEBOOKING.LISTCOVEREDTRAVELLER>();
            }
            return this.listcoveredtraveller;
        }

        /**
         * Gets the value of the bdate property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.BDATE }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.BDATE getBDATE() {
            return bdate;
        }

        /**
         * Sets the value of the bdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.BDATE }
         *     
         */
        public void setBDATE(INSURANCE.LISTINSURANCEBOOKING.BDATE value) {
            this.bdate = value;
        }

        /**
         * Gets the value of the edate property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.EDATE }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.EDATE getEDATE() {
            return edate;
        }

        /**
         * Sets the value of the edate property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.EDATE }
         *     
         */
        public void setEDATE(INSURANCE.LISTINSURANCEBOOKING.EDATE value) {
            this.edate = value;
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
         * {@link INSURANCE.LISTINSURANCEBOOKING.LISTPRICE }
         * 
         * 
         */
        public List<INSURANCE.LISTINSURANCEBOOKING.LISTPRICE> getLISTPRICE() {
            if (listprice == null) {
                listprice = new ArrayList<INSURANCE.LISTINSURANCEBOOKING.LISTPRICE>();
            }
            return this.listprice;
        }

        /**
         * Gets the value of the confirmationnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONFIRMATIONNUMBER() {
            return confirmationnumber;
        }

        /**
         * Sets the value of the confirmationnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONFIRMATIONNUMBER(String value) {
            this.confirmationnumber = value;
        }

        /**
         * Gets the value of the paymentinformation property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION getPAYMENTINFORMATION() {
            return paymentinformation;
        }

        /**
         * Sets the value of the paymentinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION }
         *     
         */
        public void setPAYMENTINFORMATION(INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION value) {
            this.paymentinformation = value;
        }

        /**
         * Gets the value of the plantype property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PLANTYPE }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.PLANTYPE getPLANTYPE() {
            return plantype;
        }

        /**
         * Sets the value of the plantype property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PLANTYPE }
         *     
         */
        public void setPLANTYPE(INSURANCE.LISTINSURANCEBOOKING.PLANTYPE value) {
            this.plantype = value;
        }

        /**
         * Gets the value of the plancostinfo property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PLANCOSTINFO }
         *     
         */
        public INSURANCE.LISTINSURANCEBOOKING.PLANCOSTINFO getPLANCOSTINFO() {
            return plancostinfo;
        }

        /**
         * Sets the value of the plancostinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEBOOKING.PLANCOSTINFO }
         *     
         */
        public void setPLANCOSTINFO(INSURANCE.LISTINSURANCEBOOKING.PLANCOSTINFO value) {
            this.plancostinfo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
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
             * String type for value without CDATA
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
        public static class DESCRIPTION
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
         *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
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
             * String type for value without CDATA
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
            "iseligibleforupgrade",
            "iseligibleforrebook",
            "priceforupgradeinvouchers",
            "priceforupgradeinmiles"
        })
        public static class ELIGIBILITYINFORMATION
            implements Serializable
        {

            @XmlElement(name = "IS_ELIGIBLE_FOR_UPGRADE")
            protected Boolean iseligibleforupgrade;
            @XmlElement(name = "IS_ELIGIBLE_FOR_REBOOK")
            protected Boolean iseligibleforrebook;
            @XmlElement(name = "PRICE_FOR_UPGRADE_IN_VOUCHERS")
            protected BigInteger priceforupgradeinvouchers;
            @XmlElement(name = "PRICE_FOR_UPGRADE_IN_MILES")
            protected BigInteger priceforupgradeinmiles;

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
        public static class ISSUEDATE
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
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="CURRENCY"&gt;
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

            @XmlElement(name = "AMOUNT", required = true)
            protected BigDecimal amount;
            @XmlElement(name = "CURRENCY", required = true)
            protected INSURANCE.LISTINSURANCEBOOKING.LISTPRICE.CURRENCY currency;

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
             *     {@link INSURANCE.LISTINSURANCEBOOKING.LISTPRICE.CURRENCY }
             *     
             */
            public INSURANCE.LISTINSURANCEBOOKING.LISTPRICE.CURRENCY getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link INSURANCE.LISTINSURANCEBOOKING.LISTPRICE.CURRENCY }
             *     
             */
            public void setCURRENCY(INSURANCE.LISTINSURANCEBOOKING.LISTPRICE.CURRENCY value) {
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
            public static class CURRENCY
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
         *         &lt;element name="PAYMENT_TYPE"&gt;
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
         *         &lt;element name="CREDIT_CARD_INFORMATION" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="COMPANY"&gt;
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
         *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="EXPIRY_DATE"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
         *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
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
        public static class PAYMENTINFORMATION
            implements Serializable
        {

            @XmlElement(name = "PAYMENT_TYPE", required = true)
            protected INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.PAYMENTTYPE paymenttype;
            @XmlElement(name = "CREDIT_CARD_INFORMATION")
            protected INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION creditcardinformation;

            /**
             * Gets the value of the paymenttype property.
             * 
             * @return
             *     possible object is
             *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.PAYMENTTYPE }
             *     
             */
            public INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.PAYMENTTYPE getPAYMENTTYPE() {
                return paymenttype;
            }

            /**
             * Sets the value of the paymenttype property.
             * 
             * @param value
             *     allowed object is
             *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.PAYMENTTYPE }
             *     
             */
            public void setPAYMENTTYPE(INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.PAYMENTTYPE value) {
                this.paymenttype = value;
            }

            /**
             * Gets the value of the creditcardinformation property.
             * 
             * @return
             *     possible object is
             *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION }
             *     
             */
            public INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION getCREDITCARDINFORMATION() {
                return creditcardinformation;
            }

            /**
             * Sets the value of the creditcardinformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION }
             *     
             */
            public void setCREDITCARDINFORMATION(INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION value) {
                this.creditcardinformation = value;
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
             *         &lt;element name="COMPANY"&gt;
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
             *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="EXPIRY_DATE"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
             *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
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
            public static class CREDITCARDINFORMATION
                implements Serializable
            {

                @XmlElement(name = "COMPANY", required = true)
                protected INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.COMPANY company;
                @XmlElement(name = "ACCOUNT_NUMBER", required = true)
                protected String accountnumber;
                @XmlElement(name = "EXPIRY_DATE", required = true)
                protected INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.EXPIRYDATE expirydate;

                /**
                 * Gets the value of the company property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.COMPANY }
                 *     
                 */
                public INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.COMPANY getCOMPANY() {
                    return company;
                }

                /**
                 * Sets the value of the company property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.COMPANY }
                 *     
                 */
                public void setCOMPANY(INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.COMPANY value) {
                    this.company = value;
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
                 * Gets the value of the expirydate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.EXPIRYDATE }
                 *     
                 */
                public INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.EXPIRYDATE getEXPIRYDATE() {
                    return expirydate;
                }

                /**
                 * Sets the value of the expirydate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.EXPIRYDATE }
                 *     
                 */
                public void setEXPIRYDATE(INSURANCE.LISTINSURANCEBOOKING.PAYMENTINFORMATION.CREDITCARDINFORMATION.EXPIRYDATE value) {
                    this.expirydate = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
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
                     * String type for value without CDATA
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
            public static class PAYMENTTYPE
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
         *         &lt;element name="IS_MODIFICATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_CANCELLATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_DATE_CHANGE_ONLY_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="IS_SCHEDULE_CHANGE_ACK_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "ismodificationallowed",
            "iscancellationallowed",
            "isdatechangeonlyallowed",
            "isschedulechangeackallowed"
        })
        public static class PERMISSIONS
            implements Serializable
        {

            @XmlElement(name = "IS_MODIFICATION_ALLOWED")
            protected Boolean ismodificationallowed;
            @XmlElement(name = "IS_CANCELLATION_ALLOWED")
            protected Boolean iscancellationallowed;
            @XmlElement(name = "IS_DATE_CHANGE_ONLY_ALLOWED")
            protected Boolean isdatechangeonlyallowed;
            @XmlElement(name = "IS_SCHEDULE_CHANGE_ACK_ALLOWED")
            protected Boolean isschedulechangeackallowed;

            /**
             * Gets the value of the ismodificationallowed property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISMODIFICATIONALLOWED() {
                return ismodificationallowed;
            }

            /**
             * Sets the value of the ismodificationallowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISMODIFICATIONALLOWED(Boolean value) {
                this.ismodificationallowed = value;
            }

            /**
             * Gets the value of the iscancellationallowed property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISCANCELLATIONALLOWED() {
                return iscancellationallowed;
            }

            /**
             * Sets the value of the iscancellationallowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISCANCELLATIONALLOWED(Boolean value) {
                this.iscancellationallowed = value;
            }

            /**
             * Gets the value of the isdatechangeonlyallowed property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISDATECHANGEONLYALLOWED() {
                return isdatechangeonlyallowed;
            }

            /**
             * Sets the value of the isdatechangeonlyallowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISDATECHANGEONLYALLOWED(Boolean value) {
                this.isdatechangeonlyallowed = value;
            }

            /**
             * Gets the value of the isschedulechangeackallowed property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISSCHEDULECHANGEACKALLOWED() {
                return isschedulechangeackallowed;
            }

            /**
             * Sets the value of the isschedulechangeackallowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISSCHEDULECHANGEACKALLOWED(Boolean value) {
                this.isschedulechangeackallowed = value;
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
         *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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

            @XmlElement(name = "TOTAL_AMOUNT", required = true)
            protected BigDecimal totalamount;
            @XmlElement(name = "CURRENCY", required = true)
            protected CurrencyType currency;

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
         *         &lt;element name="LIST_COVERED_COUNTRY" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TRAVEL_VALUE"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TRIP_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "listcoveredcountry",
            "travelvalue",
            "triptype"
        })
        public static class PLANTYPE
            implements Serializable
        {

            @XmlElement(name = "LIST_COVERED_COUNTRY", required = true)
            protected List<INSURANCE.LISTINSURANCEBOOKING.PLANTYPE.LISTCOVEREDCOUNTRY> listcoveredcountry;
            @XmlElement(name = "TRAVEL_VALUE", required = true)
            protected INSURANCE.LISTINSURANCEBOOKING.PLANTYPE.TRAVELVALUE travelvalue;
            @XmlElement(name = "TRIP_TYPE")
            protected String triptype;

            /**
             * Gets the value of the listcoveredcountry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listcoveredcountry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCOVEREDCOUNTRY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link INSURANCE.LISTINSURANCEBOOKING.PLANTYPE.LISTCOVEREDCOUNTRY }
             * 
             * 
             */
            public List<INSURANCE.LISTINSURANCEBOOKING.PLANTYPE.LISTCOVEREDCOUNTRY> getLISTCOVEREDCOUNTRY() {
                if (listcoveredcountry == null) {
                    listcoveredcountry = new ArrayList<INSURANCE.LISTINSURANCEBOOKING.PLANTYPE.LISTCOVEREDCOUNTRY>();
                }
                return this.listcoveredcountry;
            }

            /**
             * Gets the value of the travelvalue property.
             * 
             * @return
             *     possible object is
             *     {@link INSURANCE.LISTINSURANCEBOOKING.PLANTYPE.TRAVELVALUE }
             *     
             */
            public INSURANCE.LISTINSURANCEBOOKING.PLANTYPE.TRAVELVALUE getTRAVELVALUE() {
                return travelvalue;
            }

            /**
             * Sets the value of the travelvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link INSURANCE.LISTINSURANCEBOOKING.PLANTYPE.TRAVELVALUE }
             *     
             */
            public void setTRAVELVALUE(INSURANCE.LISTINSURANCEBOOKING.PLANTYPE.TRAVELVALUE value) {
                this.travelvalue = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            public static class LISTCOVEREDCOUNTRY
                implements Serializable
            {

                @XmlElement(name = "COUNTRY_CODE", required = true)
                protected String countrycode;

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
             *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "currency"
            })
            public static class TRAVELVALUE
                implements Serializable
            {

                @XmlElement(name = "AMOUNT", required = true)
                protected String amount;
                @XmlElement(name = "CURRENCY", required = true)
                protected String currency;

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
         *         &lt;element name="PARENT_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="IS_THIRD_PARTY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "isthirdparty"
        })
        public static class PNRINFORMATION
            implements Serializable
        {

            @XmlElement(name = "PARENT_PNR_ID", required = true)
            protected BigInteger parentpnrid;
            @XmlElement(name = "IS_THIRD_PARTY")
            protected Boolean isthirdparty;

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
             * Gets the value of the isthirdparty property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISTHIRDPARTY() {
                return isthirdparty;
            }

            /**
             * Sets the value of the isthirdparty property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISTHIRDPARTY(Boolean value) {
                this.isthirdparty = value;
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
        public static class STATUS
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
     *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EXTENSION_CODE" minOccurs="0"&gt;
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
     *         &lt;element name="IS_ANNUAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="GENERAL_CONDITION_URL" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
    public static class LISTINSURANCEPRODUCT
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "ITEM_ID", required = true)
        protected BigInteger itemid;
        @XmlElement(name = "PROVIDER", required = true)
        protected INSURANCE.LISTINSURANCEPRODUCT.PROVIDER provider;
        @XmlElement(name = "PRODUCT", required = true)
        protected INSURANCE.LISTINSURANCEPRODUCT.PRODUCT product;
        @XmlElement(name = "EXTENSION_CODE")
        protected INSURANCE.LISTINSURANCEPRODUCT.EXTENSIONCODE extensioncode;
        @XmlElement(name = "IS_ANNUAL")
        protected boolean isannual;
        @XmlElement(name = "GENERAL_CONDITION_URL")
        protected String generalconditionurl;

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
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEPRODUCT.PROVIDER }
         *     
         */
        public INSURANCE.LISTINSURANCEPRODUCT.PROVIDER getPROVIDER() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEPRODUCT.PROVIDER }
         *     
         */
        public void setPROVIDER(INSURANCE.LISTINSURANCEPRODUCT.PROVIDER value) {
            this.provider = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEPRODUCT.PRODUCT }
         *     
         */
        public INSURANCE.LISTINSURANCEPRODUCT.PRODUCT getPRODUCT() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEPRODUCT.PRODUCT }
         *     
         */
        public void setPRODUCT(INSURANCE.LISTINSURANCEPRODUCT.PRODUCT value) {
            this.product = value;
        }

        /**
         * Gets the value of the extensioncode property.
         * 
         * @return
         *     possible object is
         *     {@link INSURANCE.LISTINSURANCEPRODUCT.EXTENSIONCODE }
         *     
         */
        public INSURANCE.LISTINSURANCEPRODUCT.EXTENSIONCODE getEXTENSIONCODE() {
            return extensioncode;
        }

        /**
         * Sets the value of the extensioncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link INSURANCE.LISTINSURANCEPRODUCT.EXTENSIONCODE }
         *     
         */
        public void setEXTENSIONCODE(INSURANCE.LISTINSURANCEPRODUCT.EXTENSIONCODE value) {
            this.extensioncode = value;
        }

        /**
         * Gets the value of the isannual property.
         * 
         */
        public boolean isISANNUAL() {
            return isannual;
        }

        /**
         * Sets the value of the isannual property.
         * 
         */
        public void setISANNUAL(boolean value) {
            this.isannual = value;
        }

        /**
         * Gets the value of the generalconditionurl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENERALCONDITIONURL() {
            return generalconditionurl;
        }

        /**
         * Sets the value of the generalconditionurl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENERALCONDITIONURL(String value) {
            this.generalconditionurl = value;
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
        public static class EXTENSIONCODE
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
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
        public static class PRODUCT
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

}
