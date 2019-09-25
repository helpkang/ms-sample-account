
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FARE_CALCULATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_CALCULATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_FARE_COMPONENT" type="{}LIST_FARE_COMPONENT_Type" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{}FareCalculation_Extra_Amount_Group"/&gt;
 *         &lt;element name="FARE_CALCULATION_PRICE" type="{}AmountAsString_Type"/&gt;
 *         &lt;element name="CURRENCY" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_SPECIAL_CHARGE" type="{}SPECIAL_CHARGE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}CurrencyConversionRates"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_CALCULATION_Type", propOrder = {
    "listfarecomponent",
    "listiatacheck",
    "listsurcharge",
    "listmiscamount",
    "farecalculationprice",
    "currency",
    "listspecialcharge",
    "rateofexchange",
    "banksellingrate"
})
public class FARECALCULATIONTypeRename
    implements Serializable
{

    @XmlElement(name = "LIST_FARE_COMPONENT", required = true)
    protected List<LISTFARECOMPONENTType> listfarecomponent;
    @XmlElement(name = "LIST_IATA_CHECK")
    protected List<IATACHECKType> listiatacheck;
    @XmlElement(name = "LIST_SURCHARGE")
    protected List<SURCHARGEType> listsurcharge;
    @XmlElement(name = "LIST_MISC_AMOUNT")
    protected List<MiscAmountType> listmiscamount;
    @XmlElement(name = "FARE_CALCULATION_PRICE", required = true)
    protected String farecalculationprice;
    @XmlElement(name = "CURRENCY", required = true)
    protected String currency;
    @XmlElement(name = "LIST_SPECIAL_CHARGE")
    protected List<SPECIALCHARGEType> listspecialcharge;
    @XmlElement(name = "RATE_OF_EXCHANGE")
    protected String rateofexchange;
    @XmlElement(name = "BANK_SELLING_RATE")
    protected String banksellingrate;

    /**
     * Gets the value of the listfarecomponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarecomponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARECOMPONENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARECOMPONENTType }
     * 
     * 
     */
    public List<LISTFARECOMPONENTType> getLISTFARECOMPONENT() {
        if (listfarecomponent == null) {
            listfarecomponent = new ArrayList<LISTFARECOMPONENTType>();
        }
        return this.listfarecomponent;
    }

    /**
     * Gets the value of the listiatacheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listiatacheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTIATACHECK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IATACHECKType }
     * 
     * 
     */
    public List<IATACHECKType> getLISTIATACHECK() {
        if (listiatacheck == null) {
            listiatacheck = new ArrayList<IATACHECKType>();
        }
        return this.listiatacheck;
    }

    /**
     * Gets the value of the listsurcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsurcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSURCHARGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SURCHARGEType }
     * 
     * 
     */
    public List<SURCHARGEType> getLISTSURCHARGE() {
        if (listsurcharge == null) {
            listsurcharge = new ArrayList<SURCHARGEType>();
        }
        return this.listsurcharge;
    }

    /**
     * Gets the value of the listmiscamount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmiscamount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMISCAMOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscAmountType }
     * 
     * 
     */
    public List<MiscAmountType> getLISTMISCAMOUNT() {
        if (listmiscamount == null) {
            listmiscamount = new ArrayList<MiscAmountType>();
        }
        return this.listmiscamount;
    }

    /**
     * Gets the value of the farecalculationprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECALCULATIONPRICE() {
        return farecalculationprice;
    }

    /**
     * Sets the value of the farecalculationprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECALCULATIONPRICE(String value) {
        this.farecalculationprice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the listspecialcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspecialcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPECIALCHARGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPECIALCHARGEType }
     * 
     * 
     */
    public List<SPECIALCHARGEType> getLISTSPECIALCHARGE() {
        if (listspecialcharge == null) {
            listspecialcharge = new ArrayList<SPECIALCHARGEType>();
        }
        return this.listspecialcharge;
    }

    /**
     * Gets the value of the rateofexchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEOFEXCHANGE() {
        return rateofexchange;
    }

    /**
     * Sets the value of the rateofexchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEOFEXCHANGE(String value) {
        this.rateofexchange = value;
    }

    /**
     * Gets the value of the banksellingrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKSELLINGRATE() {
        return banksellingrate;
    }

    /**
     * Sets the value of the banksellingrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKSELLINGRATE(String value) {
        this.banksellingrate = value;
    }

}
