
package com.koreanair.eretail.pojo.fare.farecommoninput;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PTC or Discount which is normally associated to a passenger.
 * 
 * <p>Java class for PTC_Discount_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTC_Discount_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="DISCOUNT"/&gt;
 *               &lt;enumeration value="PTC"/&gt;
 *               &lt;enumeration value="RES_DISCOUNT"/&gt;
 *               &lt;enumeration value="COUPON"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_ADDITIONAL_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="STATUS_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "PTC_Discount_Type", propOrder = {
    "type",
    "code",
    "listadditionalinfo"
})
public class PTCDiscountType
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "LIST_ADDITIONAL_INFO")
    protected List<PTCDiscountType.LISTADDITIONALINFO> listadditionalinfo;

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
     * Gets the value of the listadditionalinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCDiscountType.LISTADDITIONALINFO }
     * 
     * 
     */
    public List<PTCDiscountType.LISTADDITIONALINFO> getLISTADDITIONALINFO() {
        if (listadditionalinfo == null) {
            listadditionalinfo = new ArrayList<PTCDiscountType.LISTADDITIONALINFO>();
        }
        return this.listadditionalinfo;
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
     *       &lt;choice&gt;
     *         &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="STATUS_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "age",
        "percentage",
        "statuscode",
        "countrycode"
    })
    public static class LISTADDITIONALINFO
        implements Serializable
    {

        @XmlElement(name = "AGE")
        protected Integer age;
        @XmlElement(name = "PERCENTAGE")
        protected BigDecimal percentage;
        @XmlElement(name = "STATUS_CODE")
        protected String statuscode;
        @XmlElement(name = "COUNTRY_CODE")
        protected String countrycode;

        /**
         * Gets the value of the age property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAGE() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAGE(Integer value) {
            this.age = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPERCENTAGE() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPERCENTAGE(BigDecimal value) {
            this.percentage = value;
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

}
