
package com.koreanair.external.eretail.vo.tripplan.common.common_price;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MILES_AND_CASH_COST_WITH_SLIDER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MILES_AND_CASH_COST_WITH_SLIDER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}AwardConverterMilesAndCash"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MILES_AND_CASH_COST_WITH_SLIDER_Type", propOrder = {
    "resultingmiles",
    "convertedamount",
    "nonconvertedamount",
    "convertedcashmiles",
    "minimummilescost",
    "milesamount",
    "cashamount",
    "totalcashpaid",
    "sliderrankposition",
    "numberofsliderranks",
    "slidertype",
    "listoption"
})
@XmlSeeAlso({
    com.koreanair.external.eretail.vo.tripplan.common.common_price.TripplanPriceType.MILESANDCASHCOST.class
})
public class MILESANDCASHCOSTWITHSLIDERType
    implements Serializable
{

    @XmlElement(name = "RESULTING_MILES")
    protected AMOUNTSINTEGERTYPE resultingmiles;
    @XmlElement(name = "CONVERTED_AMOUNT")
    protected AMOUNTSTYPE convertedamount;
    @XmlElement(name = "NON_CONVERTED_AMOUNT")
    protected AMOUNTBREAKDOWN nonconvertedamount;
    @XmlElement(name = "CONVERTED_CASH_MILES")
    protected Object convertedcashmiles;
    @XmlElement(name = "MINIMUM_MILES_COST")
    protected Object minimummilescost;
    @XmlElement(name = "MILES_AMOUNT")
    protected Object milesamount;
    @XmlElement(name = "CASH_AMOUNT")
    protected Object cashamount;
    @XmlElement(name = "TOTAL_CASH_PAID")
    protected Object totalcashpaid;
    @XmlElement(name = "SLIDER_RANK_POSITION")
    protected Integer sliderrankposition;
    @XmlElement(name = "NUMBER_OF_SLIDER_RANKS")
    protected Integer numberofsliderranks;
    @XmlElement(name = "SLIDER_TYPE")
    protected String slidertype;
    @XmlElement(name = "LIST_OPTION")
    protected List<String> listoption;

    /**
     * Gets the value of the resultingmiles property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTSINTEGERTYPE }
     *     
     */
    public AMOUNTSINTEGERTYPE getRESULTINGMILES() {
        return resultingmiles;
    }

    /**
     * Sets the value of the resultingmiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTSINTEGERTYPE }
     *     
     */
    public void setRESULTINGMILES(AMOUNTSINTEGERTYPE value) {
        this.resultingmiles = value;
    }

    /**
     * Gets the value of the convertedamount property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTSTYPE }
     *     
     */
    public AMOUNTSTYPE getCONVERTEDAMOUNT() {
        return convertedamount;
    }

    /**
     * Sets the value of the convertedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTSTYPE }
     *     
     */
    public void setCONVERTEDAMOUNT(AMOUNTSTYPE value) {
        this.convertedamount = value;
    }

    /**
     * Gets the value of the nonconvertedamount property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTBREAKDOWN }
     *     
     */
    public AMOUNTBREAKDOWN getNONCONVERTEDAMOUNT() {
        return nonconvertedamount;
    }

    /**
     * Sets the value of the nonconvertedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTBREAKDOWN }
     *     
     */
    public void setNONCONVERTEDAMOUNT(AMOUNTBREAKDOWN value) {
        this.nonconvertedamount = value;
    }

    /**
     * Gets the value of the convertedcashmiles property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCONVERTEDCASHMILES() {
        return convertedcashmiles;
    }

    /**
     * Sets the value of the convertedcashmiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCONVERTEDCASHMILES(Object value) {
        this.convertedcashmiles = value;
    }

    /**
     * Gets the value of the minimummilescost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMINIMUMMILESCOST() {
        return minimummilescost;
    }

    /**
     * Sets the value of the minimummilescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMINIMUMMILESCOST(Object value) {
        this.minimummilescost = value;
    }

    /**
     * Gets the value of the milesamount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMILESAMOUNT() {
        return milesamount;
    }

    /**
     * Sets the value of the milesamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMILESAMOUNT(Object value) {
        this.milesamount = value;
    }

    /**
     * Gets the value of the cashamount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCASHAMOUNT() {
        return cashamount;
    }

    /**
     * Sets the value of the cashamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCASHAMOUNT(Object value) {
        this.cashamount = value;
    }

    /**
     * Gets the value of the totalcashpaid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTOTALCASHPAID() {
        return totalcashpaid;
    }

    /**
     * Sets the value of the totalcashpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTOTALCASHPAID(Object value) {
        this.totalcashpaid = value;
    }

    /**
     * Gets the value of the sliderrankposition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSLIDERRANKPOSITION() {
        return sliderrankposition;
    }

    /**
     * Sets the value of the sliderrankposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSLIDERRANKPOSITION(Integer value) {
        this.sliderrankposition = value;
    }

    /**
     * Gets the value of the numberofsliderranks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMBEROFSLIDERRANKS() {
        return numberofsliderranks;
    }

    /**
     * Sets the value of the numberofsliderranks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMBEROFSLIDERRANKS(Integer value) {
        this.numberofsliderranks = value;
    }

    /**
     * Gets the value of the slidertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLIDERTYPE() {
        return slidertype;
    }

    /**
     * Sets the value of the slidertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLIDERTYPE(String value) {
        this.slidertype = value;
    }

    /**
     * Gets the value of the listoption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listoption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTOPTION() {
        if (listoption == null) {
            listoption = new ArrayList<String>();
        }
        return this.listoption;
    }

}
