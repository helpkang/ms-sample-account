
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.DateType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.ListPriceType;


/**
 * <p>Java class for DailyRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailyRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}InternalDailyRateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B_DATE" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="E_DATE" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="MARKUP" type="{}ListPriceType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRICE" type="{}PriceWithMarkupAndSubTotal" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NUM_OF_NIGHTS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyRateType", propOrder = {
    "bdate",
    "edate",
    "markup",
    "listprice",
    "numofnights"
})
public class DailyRateType
    extends InternalDailyRateType
    implements Serializable
{

    @XmlElement(name = "B_DATE")
    protected DateType bdate;
    @XmlElement(name = "E_DATE")
    protected DateType edate;
    @XmlElement(name = "MARKUP")
    protected ListPriceType markup;
    @XmlElement(name = "LIST_PRICE", required = true)
    protected List<PriceWithMarkupAndSubTotal> listprice;
    @XmlElement(name = "NUM_OF_NIGHTS")
    protected Integer numofnights;

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBDATE(DateType value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEDATE(DateType value) {
        this.edate = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link ListPriceType }
     *     
     */
    public ListPriceType getMARKUP() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPriceType }
     *     
     */
    public void setMARKUP(ListPriceType value) {
        this.markup = value;
    }

    /**
     * Gets the value of the listprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceWithMarkupAndSubTotal }
     * 
     * 
     */
    public List<PriceWithMarkupAndSubTotal> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<PriceWithMarkupAndSubTotal>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the numofnights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMOFNIGHTS() {
        return numofnights;
    }

    /**
     * Sets the value of the numofnights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMOFNIGHTS(Integer value) {
        this.numofnights = value;
    }

}
