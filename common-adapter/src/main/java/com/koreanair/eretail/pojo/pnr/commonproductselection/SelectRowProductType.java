
package com.koreanair.eretail.pojo.pnr.commonproductselection;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * If you want to select an insurance pricing from the structure: LIST_INSURANCE_PRICING_PER_PRODUCT
 * 
 * 
 * <p>Java class for SelectRowProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectRowProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ROW" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;group ref="{}CarInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectRowProductType", propOrder = {
    "row",
    "subrow",
    "carrequestid"
})
public class SelectRowProductType {

    @XmlElement(name = "ROW", required = true)
    protected BigInteger row;
    @XmlElement(name = "SUB_ROW")
    protected BigInteger subrow;
    @XmlElement(name = "CAR_REQUEST_ID")
    protected BigInteger carrequestid;

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getROW() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setROW(BigInteger value) {
        this.row = value;
    }

    /**
     * Gets the value of the subrow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSUBROW() {
        return subrow;
    }

    /**
     * Sets the value of the subrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSUBROW(BigInteger value) {
        this.subrow = value;
    }

    /**
     * Gets the value of the carrequestid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCARREQUESTID() {
        return carrequestid;
    }

    /**
     * Sets the value of the carrequestid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCARREQUESTID(BigInteger value) {
        this.carrequestid = value;
    }

}
