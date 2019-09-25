
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of associated document information.
 * 
 * <p>Java class for LIST_ASSOCIATED_DOCUMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ASSOCIATED_DOCUMENT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="DOCUMENT_INDEX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_TYPE" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_NUMBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCUMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_VENDOR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LIST_ASSOCIATED_DOCUMENT", propOrder = {

})
public class LISTASSOCIATEDDOCUMENT
    implements Serializable
{

    @XmlElement(name = "DOCUMENT_INDEX")
    protected Object documentindex;
    @XmlElement(name = "DOCUMENT_TYPE")
    protected CODENAMEPAIRTYPE documenttype;
    @XmlElement(name = "DOCUMENT_NUMBER")
    protected String documentnumber;
    @XmlElement(name = "DOCUMENT_ID")
    protected Object documentid;
    @XmlElement(name = "EXPIRY_DATE")
    protected DATETYPEPROFILE expirydate;
    @XmlElement(name = "DOCUMENT_VENDOR")
    protected LISTASSOCIATEDDOCUMENT.DOCUMENTVENDOR documentvendor;

    /**
     * Gets the value of the documentindex property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDOCUMENTINDEX() {
        return documentindex;
    }

    /**
     * Sets the value of the documentindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDOCUMENTINDEX(Object value) {
        this.documentindex = value;
    }

    /**
     * Gets the value of the documenttype property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setDOCUMENTTYPE(CODENAMEPAIRTYPE value) {
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
     * Gets the value of the documentid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDOCUMENTID() {
        return documentid;
    }

    /**
     * Sets the value of the documentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDOCUMENTID(Object value) {
        this.documentid = value;
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
     * Gets the value of the documentvendor property.
     * 
     * @return
     *     possible object is
     *     {@link LISTASSOCIATEDDOCUMENT.DOCUMENTVENDOR }
     *     
     */
    public LISTASSOCIATEDDOCUMENT.DOCUMENTVENDOR getDOCUMENTVENDOR() {
        return documentvendor;
    }

    /**
     * Sets the value of the documentvendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTASSOCIATEDDOCUMENT.DOCUMENTVENDOR }
     *     
     */
    public void setDOCUMENTVENDOR(LISTASSOCIATEDDOCUMENT.DOCUMENTVENDOR value) {
        this.documentvendor = value;
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
    public static class DOCUMENTVENDOR
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected Object code;
        @XmlElement(name = "NAME")
        protected String name;

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
