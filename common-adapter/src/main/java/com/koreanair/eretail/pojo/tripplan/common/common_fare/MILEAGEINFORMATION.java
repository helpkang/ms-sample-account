
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

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
 *         &lt;element name="TPM" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MPM" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EMA" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="EMS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_IATA_MILEAGE_EXCEPTION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LOCATION" type="{}LocationCodeType"/&gt;
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
    "tpm",
    "mpm",
    "ema",
    "ems",
    "listiatamileageexception"
})
@XmlRootElement(name = "MILEAGE_INFORMATION")
public class MILEAGEINFORMATION
    implements Serializable
{

    @XmlElement(name = "TPM", required = true)
    protected BigInteger tpm;
    @XmlElement(name = "MPM", required = true)
    protected BigInteger mpm;
    @XmlElement(name = "EMA")
    protected BigInteger ema;
    @XmlElement(name = "EMS")
    protected BigInteger ems;
    @XmlElement(name = "LIST_IATA_MILEAGE_EXCEPTION")
    protected List<MILEAGEINFORMATION.LISTIATAMILEAGEEXCEPTION> listiatamileageexception;

    /**
     * Gets the value of the tpm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTPM() {
        return tpm;
    }

    /**
     * Sets the value of the tpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTPM(BigInteger value) {
        this.tpm = value;
    }

    /**
     * Gets the value of the mpm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMPM() {
        return mpm;
    }

    /**
     * Sets the value of the mpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMPM(BigInteger value) {
        this.mpm = value;
    }

    /**
     * Gets the value of the ema property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEMA() {
        return ema;
    }

    /**
     * Sets the value of the ema property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEMA(BigInteger value) {
        this.ema = value;
    }

    /**
     * Gets the value of the ems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEMS() {
        return ems;
    }

    /**
     * Sets the value of the ems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEMS(BigInteger value) {
        this.ems = value;
    }

    /**
     * Gets the value of the listiatamileageexception property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listiatamileageexception property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTIATAMILEAGEEXCEPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MILEAGEINFORMATION.LISTIATAMILEAGEEXCEPTION }
     * 
     * 
     */
    public List<MILEAGEINFORMATION.LISTIATAMILEAGEEXCEPTION> getLISTIATAMILEAGEEXCEPTION() {
        if (listiatamileageexception == null) {
            listiatamileageexception = new ArrayList<MILEAGEINFORMATION.LISTIATAMILEAGEEXCEPTION>();
        }
        return this.listiatamileageexception;
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
     *         &lt;element name="LOCATION" type="{}LocationCodeType"/&gt;
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
        "location"
    })
    public static class LISTIATAMILEAGEEXCEPTION
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "LOCATION", required = true)
        protected String location;

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
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATION() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATION(String value) {
            this.location = value;
        }

    }

}
