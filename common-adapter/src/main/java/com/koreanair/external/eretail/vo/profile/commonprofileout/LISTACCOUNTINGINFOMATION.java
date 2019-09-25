
package com.koreanair.external.eretail.vo.profile.commonprofileout;

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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}INDEX_TYPE"/&gt;
 *         &lt;element name="ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="COST_CENTER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CLIENT_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IATA_COMPANY_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="GST_DETAILS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="ABN_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    "indextype",
    "accountnumber",
    "costcenter",
    "clientreference",
    "iatacompanynumber",
    "gstdetails"
})
@XmlRootElement(name = "LIST_ACCOUNTING_INFOMATION")
public class LISTACCOUNTINGINFOMATION
    implements Serializable
{

    @XmlElement(name = "INDEX_TYPE", required = true)
    protected INDEXTYPE indextype;
    @XmlElement(name = "ACCOUNT_NUMBER")
    protected Object accountnumber;
    @XmlElement(name = "COST_CENTER")
    protected Object costcenter;
    @XmlElement(name = "CLIENT_REFERENCE")
    protected Object clientreference;
    @XmlElement(name = "IATA_COMPANY_NUMBER")
    protected Object iatacompanynumber;
    @XmlElement(name = "GST_DETAILS")
    protected LISTACCOUNTINGINFOMATION.GSTDETAILS gstdetails;

    /**
     * Gets the value of the indextype property.
     * 
     * @return
     *     possible object is
     *     {@link INDEXTYPE }
     *     
     */
    public INDEXTYPE getINDEXTYPE() {
        return indextype;
    }

    /**
     * Sets the value of the indextype property.
     * 
     * @param value
     *     allowed object is
     *     {@link INDEXTYPE }
     *     
     */
    public void setINDEXTYPE(INDEXTYPE value) {
        this.indextype = value;
    }

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setACCOUNTNUMBER(Object value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the costcenter property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOSTCENTER() {
        return costcenter;
    }

    /**
     * Sets the value of the costcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOSTCENTER(Object value) {
        this.costcenter = value;
    }

    /**
     * Gets the value of the clientreference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCLIENTREFERENCE() {
        return clientreference;
    }

    /**
     * Sets the value of the clientreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCLIENTREFERENCE(Object value) {
        this.clientreference = value;
    }

    /**
     * Gets the value of the iatacompanynumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIATACOMPANYNUMBER() {
        return iatacompanynumber;
    }

    /**
     * Sets the value of the iatacompanynumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIATACOMPANYNUMBER(Object value) {
        this.iatacompanynumber = value;
    }

    /**
     * Gets the value of the gstdetails property.
     * 
     * @return
     *     possible object is
     *     {@link LISTACCOUNTINGINFOMATION.GSTDETAILS }
     *     
     */
    public LISTACCOUNTINGINFOMATION.GSTDETAILS getGSTDETAILS() {
        return gstdetails;
    }

    /**
     * Sets the value of the gstdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTACCOUNTINGINFOMATION.GSTDETAILS }
     *     
     */
    public void setGSTDETAILS(LISTACCOUNTINGINFOMATION.GSTDETAILS value) {
        this.gstdetails = value;
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
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="ABN_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "name",
        "abncode",
        "address"
    })
    public static class GSTDETAILS
        implements Serializable
    {

        @XmlElement(name = "NAME")
        protected Object name;
        @XmlElement(name = "ABN_CODE")
        protected Object abncode;
        @XmlElement(name = "ADDRESS")
        protected Object address;

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

        /**
         * Gets the value of the abncode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getABNCODE() {
            return abncode;
        }

        /**
         * Sets the value of the abncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setABNCODE(Object value) {
            this.abncode = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setADDRESS(Object value) {
            this.address = value;
        }

    }

}
