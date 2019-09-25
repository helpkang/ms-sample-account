
package com.koreanair.external.eretail.vo.farecommon.farecalculation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.DictionaryChoice;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.DecodedLocationType;


/**
 * <p>Java class for IATA_CHECK_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IATA_CHECK_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT" type="{}AmountAsString_Type" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}DictionaryChoice" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="JOURNEY_PART"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;choice&gt;
 *                     &lt;group ref="{}FROM_TO_Pair"/&gt;
 *                     &lt;group ref="{}Decoded_From_To_Group"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;sequence&gt;
 *             &lt;choice&gt;
 *               &lt;element name="LOCATION" type="{}unprotectedStringType"/&gt;
 *               &lt;element name="DECODED_LOCATION" type="{}DecodedLocationType"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "IATA_CHECK_Type", propOrder = {
    "code",
    "name",
    "amount",
    "currency",
    "journeypart",
    "location",
    "decodedlocation"
})
public class IATACHECKType
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "AMOUNT")
    protected String amount;
    @XmlElement(name = "CURRENCY")
    protected DictionaryChoice currency;
    @XmlElement(name = "JOURNEY_PART")
    protected IATACHECKType.JOURNEYPART journeypart;
    @XmlElement(name = "LOCATION")
    protected String location;
    @XmlElement(name = "DECODED_LOCATION")
    protected DecodedLocationType decodedlocation;

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
     *     {@link DictionaryChoice }
     *     
     */
    public DictionaryChoice getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryChoice }
     *     
     */
    public void setCURRENCY(DictionaryChoice value) {
        this.currency = value;
    }

    /**
     * Gets the value of the journeypart property.
     * 
     * @return
     *     possible object is
     *     {@link IATACHECKType.JOURNEYPART }
     *     
     */
    public IATACHECKType.JOURNEYPART getJOURNEYPART() {
        return journeypart;
    }

    /**
     * Sets the value of the journeypart property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATACHECKType.JOURNEYPART }
     *     
     */
    public void setJOURNEYPART(IATACHECKType.JOURNEYPART value) {
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
     * Gets the value of the decodedlocation property.
     * 
     * @return
     *     possible object is
     *     {@link DecodedLocationType }
     *     
     */
    public DecodedLocationType getDECODEDLOCATION() {
        return decodedlocation;
    }

    /**
     * Sets the value of the decodedlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecodedLocationType }
     *     
     */
    public void setDECODEDLOCATION(DecodedLocationType value) {
        this.decodedlocation = value;
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
     *         &lt;group ref="{}FROM_TO_Pair"/&gt;
     *         &lt;group ref="{}Decoded_From_To_Group"/&gt;
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
        "from",
        "to",
        "blocation",
        "elocation"
    })
    public static class JOURNEYPART
        implements Serializable
    {

        @XmlElement(name = "FROM")
        protected String from;
        @XmlElement(name = "TO")
        protected String to;
        @XmlElement(name = "B_LOCATION")
        protected DecodedLocationType blocation;
        @XmlElement(name = "E_LOCATION")
        protected DecodedLocationType elocation;

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

}
