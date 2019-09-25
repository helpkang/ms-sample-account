
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REBOOK_FEE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REBOOK_FEE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AMOUNT_SIMPLE_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TAX" type="{}LIST_TAX_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}DictionaryChoice" minOccurs="0"/&gt;
 *         &lt;element ref="{}MILES_COST" minOccurs="0"/&gt;
 *         &lt;element ref="{}AMOUNT_TO_SUM" minOccurs="0"/&gt;
 *         &lt;element ref="{}AMOUNT_TO_MAX" minOccurs="0"/&gt;
 *         &lt;element ref="{}COLLECTION_INFO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REBOOK_FEE_Type", propOrder = {
    "listtax",
    "currency",
    "milescost",
    "amounttosum",
    "amounttomax",
    "collectioninfo"
})
public class REBOOKFEEType
    extends AMOUNTSIMPLEType
    implements Serializable
{

    @XmlElement(name = "LIST_TAX")
    protected List<LISTTAXType> listtax;
    @XmlElement(name = "CURRENCY")
    protected DictionaryChoice currency;
    @XmlElement(name = "MILES_COST")
    protected BigInteger milescost;
    @XmlElement(name = "AMOUNT_TO_SUM")
    protected BigDecimal amounttosum;
    @XmlElement(name = "AMOUNT_TO_MAX")
    protected BigDecimal amounttomax;
    @XmlElement(name = "COLLECTION_INFO")
    protected CollectionInfoType collectioninfo;

    /**
     * Gets the value of the listtax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTAXType }
     * 
     * 
     */
    public List<LISTTAXType> getLISTTAX() {
        if (listtax == null) {
            listtax = new ArrayList<LISTTAXType>();
        }
        return this.listtax;
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
     * Gets the value of the milescost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMILESCOST() {
        return milescost;
    }

    /**
     * Sets the value of the milescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMILESCOST(BigInteger value) {
        this.milescost = value;
    }

    /**
     * Gets the value of the amounttosum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTTOSUM() {
        return amounttosum;
    }

    /**
     * Sets the value of the amounttosum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTTOSUM(BigDecimal value) {
        this.amounttosum = value;
    }

    /**
     * Gets the value of the amounttomax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTTOMAX() {
        return amounttomax;
    }

    /**
     * Sets the value of the amounttomax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTTOMAX(BigDecimal value) {
        this.amounttomax = value;
    }

    /**
     * Gets the value of the collectioninfo property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionInfoType }
     *     
     */
    public CollectionInfoType getCOLLECTIONINFO() {
        return collectioninfo;
    }

    /**
     * Sets the value of the collectioninfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionInfoType }
     *     
     */
    public void setCOLLECTIONINFO(CollectionInfoType value) {
        this.collectioninfo = value;
    }

}
