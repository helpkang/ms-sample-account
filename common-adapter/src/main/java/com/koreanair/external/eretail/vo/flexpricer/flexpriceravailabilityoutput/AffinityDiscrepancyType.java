
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffinityDiscrepancyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityDiscrepancyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="2"&gt;
 *         &lt;element name="PRICE_DISCREPANCY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DISCREPANCY_THRESHOLD" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="DISCREPANCY_VALUE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AVAILABILITY_DISCREPANCY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="OUTBOUND"/&gt;
 *               &lt;enumeration value="INBOUND"/&gt;
 *               &lt;enumeration value="BOTH_BOUNDS"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TIER_LEVEL_DISCREPANCY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AFFINITY_TIER_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FP_TIER_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "AffinityDiscrepancyType", propOrder = {
    "pricediscrepancyAndAVAILABILITYDISCREPANCYAndTIERLEVELDISCREPANCY"
})
public class AffinityDiscrepancyType
    implements Serializable
{

    @XmlElements({
        @XmlElement(name = "PRICE_DISCREPANCY", type = AffinityDiscrepancyType.PRICEDISCREPANCY.class),
        @XmlElement(name = "AVAILABILITY_DISCREPANCY", type = String.class),
        @XmlElement(name = "TIER_LEVEL_DISCREPANCY", type = AffinityDiscrepancyType.TIERLEVELDISCREPANCY.class)
    })
    protected List<Serializable> pricediscrepancyAndAVAILABILITYDISCREPANCYAndTIERLEVELDISCREPANCY;

    /**
     * Gets the value of the pricediscrepancyAndAVAILABILITYDISCREPANCYAndTIERLEVELDISCREPANCY property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricediscrepancyAndAVAILABILITYDISCREPANCYAndTIERLEVELDISCREPANCY property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRICEDISCREPANCYAndAVAILABILITYDISCREPANCYAndTIERLEVELDISCREPANCY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffinityDiscrepancyType.PRICEDISCREPANCY }
     * {@link String }
     * {@link AffinityDiscrepancyType.TIERLEVELDISCREPANCY }
     * 
     * 
     */
    public List<Serializable> getPRICEDISCREPANCYAndAVAILABILITYDISCREPANCYAndTIERLEVELDISCREPANCY() {
        if (pricediscrepancyAndAVAILABILITYDISCREPANCYAndTIERLEVELDISCREPANCY == null) {
            pricediscrepancyAndAVAILABILITYDISCREPANCYAndTIERLEVELDISCREPANCY = new ArrayList<Serializable>();
        }
        return this.pricediscrepancyAndAVAILABILITYDISCREPANCYAndTIERLEVELDISCREPANCY;
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
     *         &lt;element name="DISCREPANCY_THRESHOLD" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="DISCREPANCY_VALUE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
        "discrepancythreshold",
        "discrepancyvalue"
    })
    public static class PRICEDISCREPANCY implements Serializable
    {

        @XmlElement(name = "DISCREPANCY_THRESHOLD", required = true)
        protected BigInteger discrepancythreshold;
        @XmlElement(name = "DISCREPANCY_VALUE")
        protected double discrepancyvalue;

        /**
         * Gets the value of the discrepancythreshold property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDISCREPANCYTHRESHOLD() {
            return discrepancythreshold;
        }

        /**
         * Sets the value of the discrepancythreshold property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDISCREPANCYTHRESHOLD(BigInteger value) {
            this.discrepancythreshold = value;
        }

        /**
         * Gets the value of the discrepancyvalue property.
         * 
         */
        public double getDISCREPANCYVALUE() {
            return discrepancyvalue;
        }

        /**
         * Sets the value of the discrepancyvalue property.
         * 
         */
        public void setDISCREPANCYVALUE(double value) {
            this.discrepancyvalue = value;
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
     *         &lt;element name="AFFINITY_TIER_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FP_TIER_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "affinitytierlevel",
        "fptierlevel"
    })
    public static class TIERLEVELDISCREPANCY implements Serializable
    {

        @XmlElement(name = "AFFINITY_TIER_LEVEL", required = true)
        protected String affinitytierlevel;
        @XmlElement(name = "FP_TIER_LEVEL", required = true)
        protected String fptierlevel;

        /**
         * Gets the value of the affinitytierlevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAFFINITYTIERLEVEL() {
            return affinitytierlevel;
        }

        /**
         * Sets the value of the affinitytierlevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAFFINITYTIERLEVEL(String value) {
            this.affinitytierlevel = value;
        }

        /**
         * Gets the value of the fptierlevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFPTIERLEVEL() {
            return fptierlevel;
        }

        /**
         * Sets the value of the fptierlevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFPTIERLEVEL(String value) {
            this.fptierlevel = value;
        }

    }

}
