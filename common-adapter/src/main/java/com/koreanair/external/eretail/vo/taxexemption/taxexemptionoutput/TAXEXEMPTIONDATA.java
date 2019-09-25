
package com.koreanair.external.eretail.vo.taxexemption.taxexemptionoutput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tax exemption structure
 * 
 * <p>Java class for TAX_EXEMPTION_DATA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAX_EXEMPTION_DATA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAX_EXEMPTION_PROFILE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FEDERAL_GOV_EMPLOYEE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FEDERAL_GOV_BODY_NAME"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROVINCIAL_GOV_EMPLOYEE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PROVINCE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PROVINCIAL_GOV_BODY_NAME"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONTINUOUS_JOURNEY_FLIGHT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TICKET_NUMBER"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                         &lt;length value="13"/&gt;
 *                         &lt;pattern value="\d{13}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OUTBOUND_FLIGHT" type="{}FLIGHT_DATA"/&gt;
 *                   &lt;element name="INBOUND_FLIGHT" type="{}FLIGHT_DATA"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONTINUOUS_JOURNEY_CRUISE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CRUISELINE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PORT_OF_SAIL"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="\D{3}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OUTBOUND_SAIL_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="INBOUND_SAIL_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "TAX_EXEMPTION_DATA", propOrder = {
    "taxexemptionprofileid",
    "federalgovemployee",
    "provincialgovemployee",
    "continuousjourneyflight",
    "continuousjourneycruise"
})
public class TAXEXEMPTIONDATA
    implements Serializable
{

    @XmlElement(name = "TAX_EXEMPTION_PROFILE_ID", required = true)
    protected BigInteger taxexemptionprofileid;
    @XmlElement(name = "FEDERAL_GOV_EMPLOYEE")
    protected TAXEXEMPTIONDATA.FEDERALGOVEMPLOYEE federalgovemployee;
    @XmlElement(name = "PROVINCIAL_GOV_EMPLOYEE")
    protected TAXEXEMPTIONDATA.PROVINCIALGOVEMPLOYEE provincialgovemployee;
    @XmlElement(name = "CONTINUOUS_JOURNEY_FLIGHT")
    protected TAXEXEMPTIONDATA.CONTINUOUSJOURNEYFLIGHT continuousjourneyflight;
    @XmlElement(name = "CONTINUOUS_JOURNEY_CRUISE")
    protected TAXEXEMPTIONDATA.CONTINUOUSJOURNEYCRUISE continuousjourneycruise;

    /**
     * Gets the value of the taxexemptionprofileid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXEXEMPTIONPROFILEID() {
        return taxexemptionprofileid;
    }

    /**
     * Sets the value of the taxexemptionprofileid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXEXEMPTIONPROFILEID(BigInteger value) {
        this.taxexemptionprofileid = value;
    }

    /**
     * Gets the value of the federalgovemployee property.
     * 
     * @return
     *     possible object is
     *     {@link TAXEXEMPTIONDATA.FEDERALGOVEMPLOYEE }
     *     
     */
    public TAXEXEMPTIONDATA.FEDERALGOVEMPLOYEE getFEDERALGOVEMPLOYEE() {
        return federalgovemployee;
    }

    /**
     * Sets the value of the federalgovemployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXEXEMPTIONDATA.FEDERALGOVEMPLOYEE }
     *     
     */
    public void setFEDERALGOVEMPLOYEE(TAXEXEMPTIONDATA.FEDERALGOVEMPLOYEE value) {
        this.federalgovemployee = value;
    }

    /**
     * Gets the value of the provincialgovemployee property.
     * 
     * @return
     *     possible object is
     *     {@link TAXEXEMPTIONDATA.PROVINCIALGOVEMPLOYEE }
     *     
     */
    public TAXEXEMPTIONDATA.PROVINCIALGOVEMPLOYEE getPROVINCIALGOVEMPLOYEE() {
        return provincialgovemployee;
    }

    /**
     * Sets the value of the provincialgovemployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXEXEMPTIONDATA.PROVINCIALGOVEMPLOYEE }
     *     
     */
    public void setPROVINCIALGOVEMPLOYEE(TAXEXEMPTIONDATA.PROVINCIALGOVEMPLOYEE value) {
        this.provincialgovemployee = value;
    }

    /**
     * Gets the value of the continuousjourneyflight property.
     * 
     * @return
     *     possible object is
     *     {@link TAXEXEMPTIONDATA.CONTINUOUSJOURNEYFLIGHT }
     *     
     */
    public TAXEXEMPTIONDATA.CONTINUOUSJOURNEYFLIGHT getCONTINUOUSJOURNEYFLIGHT() {
        return continuousjourneyflight;
    }

    /**
     * Sets the value of the continuousjourneyflight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXEXEMPTIONDATA.CONTINUOUSJOURNEYFLIGHT }
     *     
     */
    public void setCONTINUOUSJOURNEYFLIGHT(TAXEXEMPTIONDATA.CONTINUOUSJOURNEYFLIGHT value) {
        this.continuousjourneyflight = value;
    }

    /**
     * Gets the value of the continuousjourneycruise property.
     * 
     * @return
     *     possible object is
     *     {@link TAXEXEMPTIONDATA.CONTINUOUSJOURNEYCRUISE }
     *     
     */
    public TAXEXEMPTIONDATA.CONTINUOUSJOURNEYCRUISE getCONTINUOUSJOURNEYCRUISE() {
        return continuousjourneycruise;
    }

    /**
     * Sets the value of the continuousjourneycruise property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXEXEMPTIONDATA.CONTINUOUSJOURNEYCRUISE }
     *     
     */
    public void setCONTINUOUSJOURNEYCRUISE(TAXEXEMPTIONDATA.CONTINUOUSJOURNEYCRUISE value) {
        this.continuousjourneycruise = value;
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
     *         &lt;element name="CRUISELINE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="10"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PORT_OF_SAIL"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="\D{3}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OUTBOUND_SAIL_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="INBOUND_SAIL_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "cruiseline",
        "portofsail",
        "outboundsaildate",
        "inboundsaildate"
    })
    public static class CONTINUOUSJOURNEYCRUISE
        implements Serializable
    {

        @XmlElement(name = "CRUISELINE", required = true)
        protected String cruiseline;
        @XmlElement(name = "PORT_OF_SAIL", required = true)
        protected String portofsail;
        @XmlElement(name = "OUTBOUND_SAIL_DATE", required = true)
        protected String outboundsaildate;
        @XmlElement(name = "INBOUND_SAIL_DATE", required = true)
        protected String inboundsaildate;

        /**
         * Gets the value of the cruiseline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRUISELINE() {
            return cruiseline;
        }

        /**
         * Sets the value of the cruiseline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRUISELINE(String value) {
            this.cruiseline = value;
        }

        /**
         * Gets the value of the portofsail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPORTOFSAIL() {
            return portofsail;
        }

        /**
         * Sets the value of the portofsail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPORTOFSAIL(String value) {
            this.portofsail = value;
        }

        /**
         * Gets the value of the outboundsaildate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOUTBOUNDSAILDATE() {
            return outboundsaildate;
        }

        /**
         * Sets the value of the outboundsaildate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOUTBOUNDSAILDATE(String value) {
            this.outboundsaildate = value;
        }

        /**
         * Gets the value of the inboundsaildate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINBOUNDSAILDATE() {
            return inboundsaildate;
        }

        /**
         * Sets the value of the inboundsaildate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINBOUNDSAILDATE(String value) {
            this.inboundsaildate = value;
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
     *         &lt;element name="TICKET_NUMBER"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *               &lt;length value="13"/&gt;
     *               &lt;pattern value="\d{13}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OUTBOUND_FLIGHT" type="{}FLIGHT_DATA"/&gt;
     *         &lt;element name="INBOUND_FLIGHT" type="{}FLIGHT_DATA"/&gt;
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
        "ticketnumber",
        "outboundflight",
        "inboundflight"
    })
    public static class CONTINUOUSJOURNEYFLIGHT
        implements Serializable
    {

        @XmlElement(name = "TICKET_NUMBER", required = true)
        protected String ticketnumber;
        @XmlElement(name = "OUTBOUND_FLIGHT", required = true)
        protected FLIGHTDATA outboundflight;
        @XmlElement(name = "INBOUND_FLIGHT", required = true)
        protected FLIGHTDATA inboundflight;

        /**
         * Gets the value of the ticketnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETNUMBER() {
            return ticketnumber;
        }

        /**
         * Sets the value of the ticketnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETNUMBER(String value) {
            this.ticketnumber = value;
        }

        /**
         * Gets the value of the outboundflight property.
         * 
         * @return
         *     possible object is
         *     {@link FLIGHTDATA }
         *     
         */
        public FLIGHTDATA getOUTBOUNDFLIGHT() {
            return outboundflight;
        }

        /**
         * Sets the value of the outboundflight property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLIGHTDATA }
         *     
         */
        public void setOUTBOUNDFLIGHT(FLIGHTDATA value) {
            this.outboundflight = value;
        }

        /**
         * Gets the value of the inboundflight property.
         * 
         * @return
         *     possible object is
         *     {@link FLIGHTDATA }
         *     
         */
        public FLIGHTDATA getINBOUNDFLIGHT() {
            return inboundflight;
        }

        /**
         * Sets the value of the inboundflight property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLIGHTDATA }
         *     
         */
        public void setINBOUNDFLIGHT(FLIGHTDATA value) {
            this.inboundflight = value;
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
     *         &lt;element name="FEDERAL_GOV_BODY_NAME"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="24"/&gt;
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
        "federalgovbodyname"
    })
    public static class FEDERALGOVEMPLOYEE
        implements Serializable
    {

        @XmlElement(name = "FEDERAL_GOV_BODY_NAME", required = true)
        protected String federalgovbodyname;

        /**
         * Gets the value of the federalgovbodyname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFEDERALGOVBODYNAME() {
            return federalgovbodyname;
        }

        /**
         * Sets the value of the federalgovbodyname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFEDERALGOVBODYNAME(String value) {
            this.federalgovbodyname = value;
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
     *         &lt;element name="PROVINCE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="24"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PROVINCIAL_GOV_BODY_NAME"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="24"/&gt;
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
        "province",
        "provincialgovbodyname"
    })
    public static class PROVINCIALGOVEMPLOYEE
        implements Serializable
    {

        @XmlElement(name = "PROVINCE", required = true)
        protected String province;
        @XmlElement(name = "PROVINCIAL_GOV_BODY_NAME", required = true)
        protected String provincialgovbodyname;

        /**
         * Gets the value of the province property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVINCE() {
            return province;
        }

        /**
         * Sets the value of the province property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVINCE(String value) {
            this.province = value;
        }

        /**
         * Gets the value of the provincialgovbodyname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVINCIALGOVBODYNAME() {
            return provincialgovbodyname;
        }

        /**
         * Sets the value of the provincialgovbodyname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVINCIALGOVBODYNAME(String value) {
            this.provincialgovbodyname = value;
        }

    }

}
