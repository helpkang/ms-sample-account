
package com.koreanair.external.eretail.vo.farecommon.farecalculation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;


/**
 * <p>Java class for FARE_CALCULATION_RAW_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_CALCULATION_RAW_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FARE_CALCULATION_LINE" type="{}unprotectedStringType"/&gt;
 *           &lt;element name="FARE_CALCULATION_LINES" type="{}unprotectedStringType" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LIST_FARE_TAX" maxOccurs="3" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="AMOUNT" type="{}AmountAsString_Type"/&gt;
 *                   &lt;element name="CURRENCY" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FARE_TAX_LINE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_CALCULATION_RAW_Type", propOrder = {
    "farecalculationline",
    "farecalculationlines",
    "listfaretax",
    "faretaxline"
})
public class FARECALCULATIONRAWType
    implements Serializable
{

    @XmlElement(name = "FARE_CALCULATION_LINE")
    protected String farecalculationline;
    @XmlElement(name = "FARE_CALCULATION_LINES")
    protected List<String> farecalculationlines;
    @XmlElement(name = "LIST_FARE_TAX")
    protected List<FARECALCULATIONRAWType.LISTFARETAX> listfaretax;
    @XmlElement(name = "FARE_TAX_LINE")
    protected String faretaxline;

    /**
     * Gets the value of the farecalculationline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECALCULATIONLINE() {
        return farecalculationline;
    }

    /**
     * Sets the value of the farecalculationline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECALCULATIONLINE(String value) {
        this.farecalculationline = value;
    }

    /**
     * Gets the value of the farecalculationlines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farecalculationlines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFARECALCULATIONLINES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFARECALCULATIONLINES() {
        if (farecalculationlines == null) {
            farecalculationlines = new ArrayList<String>();
        }
        return this.farecalculationlines;
    }

    /**
     * Gets the value of the listfaretax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfaretax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARETAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FARECALCULATIONRAWType.LISTFARETAX }
     * 
     * 
     */
    public List<FARECALCULATIONRAWType.LISTFARETAX> getLISTFARETAX() {
        if (listfaretax == null) {
            listfaretax = new ArrayList<FARECALCULATIONRAWType.LISTFARETAX>();
        }
        return this.listfaretax;
    }

    /**
     * Gets the value of the faretaxline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARETAXLINE() {
        return faretaxline;
    }

    /**
     * Sets the value of the faretaxline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARETAXLINE(String value) {
        this.faretaxline = value;
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
     *         &lt;element name="AMOUNT" type="{}AmountAsString_Type"/&gt;
     *         &lt;element name="CURRENCY" type="{}CodeDescriptorType" minOccurs="0"/&gt;
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
        "amount",
        "currency"
    })
    public static class LISTFARETAX
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "AMOUNT", required = true)
        protected String amount;
        @XmlElement(name = "CURRENCY")
        protected CodeDescriptorType currency;

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
         *     {@link CodeDescriptorType }
         *     
         */
        public CodeDescriptorType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeDescriptorType }
         *     
         */
        public void setCURRENCY(CodeDescriptorType value) {
            this.currency = value;
        }

    }

}
