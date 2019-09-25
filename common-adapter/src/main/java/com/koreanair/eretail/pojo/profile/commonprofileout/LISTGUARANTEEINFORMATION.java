
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
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
 *       &lt;all&gt;
 *         &lt;element name="TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="CAR"/&gt;
 *               &lt;enumeration value="HOTEL"/&gt;
 *               &lt;enumeration value="CARHOTEL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCREDITIVE_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILLING_NUMBER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="CC"/&gt;
 *                         &lt;enumeration value="BS"/&gt;
 *                         &lt;enumeration value="AM"/&gt;
 *                         &lt;enumeration value="CD"/&gt;
 *                         &lt;enumeration value="ID"/&gt;
 *                         &lt;enumeration value="CK"/&gt;
 *                         &lt;enumeration value="MO"/&gt;
 *                         &lt;enumeration value="CQ"/&gt;
 *                         &lt;enumeration value="AC"/&gt;
 *                         &lt;enumeration value="AP"/&gt;
 *                         &lt;enumeration value="BN"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCUMENT_NUMBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
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
@XmlRootElement(name = "LIST_GUARANTEE_INFORMATION")
public class LISTGUARANTEEINFORMATION
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "CREDIT_CARD_ID")
    protected String creditcardid;
    @XmlElement(name = "ACCREDITIVE_CARD_ID")
    protected String accreditivecardid;
    @XmlElement(name = "BILLING_NUMBER_ID")
    protected String billingnumberid;
    @XmlElement(name = "DOCUMENT_TYPE")
    protected LISTGUARANTEEINFORMATION.DOCUMENTTYPE documenttype;
    @XmlElement(name = "DOCUMENT_NUMBER")
    protected String documentnumber;

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
     * Gets the value of the creditcardid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITCARDID() {
        return creditcardid;
    }

    /**
     * Sets the value of the creditcardid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITCARDID(String value) {
        this.creditcardid = value;
    }

    /**
     * Gets the value of the accreditivecardid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCREDITIVECARDID() {
        return accreditivecardid;
    }

    /**
     * Sets the value of the accreditivecardid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCREDITIVECARDID(String value) {
        this.accreditivecardid = value;
    }

    /**
     * Gets the value of the billingnumberid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLINGNUMBERID() {
        return billingnumberid;
    }

    /**
     * Sets the value of the billingnumberid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLINGNUMBERID(String value) {
        this.billingnumberid = value;
    }

    /**
     * Gets the value of the documenttype property.
     * 
     * @return
     *     possible object is
     *     {@link LISTGUARANTEEINFORMATION.DOCUMENTTYPE }
     *     
     */
    public LISTGUARANTEEINFORMATION.DOCUMENTTYPE getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTGUARANTEEINFORMATION.DOCUMENTTYPE }
     *     
     */
    public void setDOCUMENTTYPE(LISTGUARANTEEINFORMATION.DOCUMENTTYPE value) {
        this.documenttype = value;
    }

    /**
     * Gets the value of the documentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTNUMBER() {
        return documentnumber;
    }

    /**
     * Sets the value of the documentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTNUMBER(String value) {
        this.documentnumber = value;
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
     *               &lt;enumeration value="CC"/&gt;
     *               &lt;enumeration value="BS"/&gt;
     *               &lt;enumeration value="AM"/&gt;
     *               &lt;enumeration value="CD"/&gt;
     *               &lt;enumeration value="ID"/&gt;
     *               &lt;enumeration value="CK"/&gt;
     *               &lt;enumeration value="MO"/&gt;
     *               &lt;enumeration value="CQ"/&gt;
     *               &lt;enumeration value="AC"/&gt;
     *               &lt;enumeration value="AP"/&gt;
     *               &lt;enumeration value="BN"/&gt;
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
    public static class DOCUMENTTYPE
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
