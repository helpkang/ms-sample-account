
package com.koreanair.external.eretail.vo.tripplan.common.common_fare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FARE_CALCULATION_RAW_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_CALCULATION_RAW_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_CALCULATION_LINE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_FARE_TAX" type="{}Misc_Amount_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FARE_TAX_LINE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_CALCULATION_RAW_Type", propOrder = {
    "farecalculationline",
    "listfaretax",
    "faretaxline"
})
public class FARECALCULATIONRAWType
    implements Serializable
{

    @XmlElement(name = "FARE_CALCULATION_LINE", required = true)
    protected String farecalculationline;
    @XmlElement(name = "LIST_FARE_TAX")
    protected List<MiscAmountType> listfaretax;
    @XmlElement(name = "FARE_TAX_LINE")
    protected String faretaxline;

    /**
     * Gets the value of the farecalculationline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECALCULATIONLINE() {
        return farecalculationline;
    }

    /**
     * Sets the value of the farecalculationline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECALCULATIONLINE(String value) {
        this.farecalculationline = value;
    }

    /**
     * Gets the value of the listfaretax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfaretax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARETAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscAmountType }
     * 
     * 
     */
    public List<MiscAmountType> getLISTFARETAX() {
        if (listfaretax == null) {
            listfaretax = new ArrayList<MiscAmountType>();
        }
        return this.listfaretax;
    }

    /**
     * Gets the value of the faretaxline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARETAXLINE() {
        return faretaxline;
    }

    /**
     * Sets the value of the faretaxline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARETAXLINE(String value) {
        this.faretaxline = value;
    }

}
