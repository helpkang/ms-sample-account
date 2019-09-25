
package com.koreanair.eretail.pojo.farecommon.farecalculation;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.TYPEDAMOUNTType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.DecodedLocationType;


/**
 * <p>Java class for SURCHARGE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SURCHARGE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{}SurchargeCode_Type"/&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{}Untyped_Surcharge_Group"/&gt;
 *           &lt;group ref="{}Typed_Surcharge_Group"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SURCHARGE_Type", propOrder = {
    "code",
    "amount",
    "journeypart",
    "location",
    "numberofstopovers",
    "currencyamount",
    "journey",
    "stopoverlocation",
    "numstopovers"
})
public class SURCHARGEType
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    @XmlSchemaType(name = "string")
    protected SurchargeCodeType code;
    @XmlElement(name = "AMOUNT")
    protected String amount;
    @XmlElement(name = "JOURNEY_PART")
    protected SURCHARGEType.JOURNEYPART journeypart;
    @XmlElement(name = "LOCATION")
    protected String location;
    @XmlElement(name = "NUMBER_OF_STOPOVERS")
    protected BigInteger numberofstopovers;
    @XmlElement(name = "CURRENCY_AMOUNT")
    protected TYPEDAMOUNTType currencyamount;
    @XmlElement(name = "JOURNEY")
    protected SURCHARGEType.JOURNEY journey;
    @XmlElement(name = "STOPOVER_LOCATION")
    protected DecodedLocationType stopoverlocation;
    @XmlElement(name = "NUM_STOPOVERS")
    protected BigInteger numstopovers;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeCodeType }
     *     
     */
    public SurchargeCodeType getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeCodeType }
     *     
     */
    public void setCODE(SurchargeCodeType value) {
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
     * Gets the value of the journeypart property.
     * 
     * @return
     *     possible object is
     *     {@link SURCHARGEType.JOURNEYPART }
     *     
     */
    public SURCHARGEType.JOURNEYPART getJOURNEYPART() {
        return journeypart;
    }

    /**
     * Sets the value of the journeypart property.
     * 
     * @param value
     *     allowed object is
     *     {@link SURCHARGEType.JOURNEYPART }
     *     
     */
    public void setJOURNEYPART(SURCHARGEType.JOURNEYPART value) {
        this.journeypart = value;
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

    /**
     * Gets the value of the numberofstopovers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFSTOPOVERS() {
        return numberofstopovers;
    }

    /**
     * Sets the value of the numberofstopovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFSTOPOVERS(BigInteger value) {
        this.numberofstopovers = value;
    }

    /**
     * Gets the value of the currencyamount property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getCURRENCYAMOUNT() {
        return currencyamount;
    }

    /**
     * Sets the value of the currencyamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setCURRENCYAMOUNT(TYPEDAMOUNTType value) {
        this.currencyamount = value;
    }

    /**
     * Gets the value of the journey property.
     * 
     * @return
     *     possible object is
     *     {@link SURCHARGEType.JOURNEY }
     *     
     */
    public SURCHARGEType.JOURNEY getJOURNEY() {
        return journey;
    }

    /**
     * Sets the value of the journey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SURCHARGEType.JOURNEY }
     *     
     */
    public void setJOURNEY(SURCHARGEType.JOURNEY value) {
        this.journey = value;
    }

    /**
     * Gets the value of the stopoverlocation property.
     * 
     * @return
     *     possible object is
     *     {@link DecodedLocationType }
     *     
     */
    public DecodedLocationType getSTOPOVERLOCATION() {
        return stopoverlocation;
    }

    /**
     * Sets the value of the stopoverlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecodedLocationType }
     *     
     */
    public void setSTOPOVERLOCATION(DecodedLocationType value) {
        this.stopoverlocation = value;
    }

    /**
     * Gets the value of the numstopovers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMSTOPOVERS() {
        return numstopovers;
    }

    /**
     * Sets the value of the numstopovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMSTOPOVERS(BigInteger value) {
        this.numstopovers = value;
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
     *       &lt;group ref="{}Decoded_From_To_Group"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "blocation",
        "elocation"
    })
    public static class JOURNEY
        implements Serializable
    {

        @XmlElement(name = "B_LOCATION", required = true)
        protected DecodedLocationType blocation;
        @XmlElement(name = "E_LOCATION", required = true)
        protected DecodedLocationType elocation;

        /**
         * Gets the value of the blocation property.
         * 
         * @return
         *     possible object is
         *     {@link DecodedLocationType }
         *     
         */
        public DecodedLocationType getBLOCATION() {
            return blocation;
        }

        /**
         * Sets the value of the blocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecodedLocationType }
         *     
         */
        public void setBLOCATION(DecodedLocationType value) {
            this.blocation = value;
        }

        /**
         * Gets the value of the elocation property.
         * 
         * @return
         *     possible object is
         *     {@link DecodedLocationType }
         *     
         */
        public DecodedLocationType getELOCATION() {
            return elocation;
        }

        /**
         * Sets the value of the elocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecodedLocationType }
         *     
         */
        public void setELOCATION(DecodedLocationType value) {
            this.elocation = value;
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
     *         &lt;group ref="{}FROM_TO_Pair"/&gt;
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
        "from",
        "to"
    })
    public static class JOURNEYPART
        implements Serializable
    {

        @XmlElement(name = "FROM", required = true)
        protected String from;
        @XmlElement(name = "TO", required = true)
        protected String to;

        /**
         * Gets the value of the from property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFROM() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFROM(String value) {
            this.from = value;
        }

        /**
         * Gets the value of the to property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTO() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTO(String value) {
            this.to = value;
        }

    }

}
