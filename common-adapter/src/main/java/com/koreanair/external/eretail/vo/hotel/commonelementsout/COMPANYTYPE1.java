
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel company type.
 * 
 * <p>Java class for COMPANY_TYPE_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMPANY_TYPE_1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}COMPANY_TYPE_3"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MASTER_CHAIN" type="{}COMPANY_TYPE_2" minOccurs="0"/&gt;
 *         &lt;element name="BOOL_REVERT_TO_STANDARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BRAND" type="{}COMPANY_TYPE_2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPANY_TYPE_1", propOrder = {
    "masterchain",
    "boolreverttostandard",
    "brand"
})
public class COMPANYTYPE1
    extends COMPANYTYPE3
    implements Serializable
{

    @XmlElement(name = "MASTER_CHAIN")
    protected COMPANYTYPE2 masterchain;
    @XmlElement(name = "BOOL_REVERT_TO_STANDARD")
    protected Boolean boolreverttostandard;
    @XmlElement(name = "BRAND")
    protected COMPANYTYPE2 brand;

    /**
     * Gets the value of the masterchain property.
     * 
     * @return
     *     possible object is
     *     {@link COMPANYTYPE2 }
     *     
     */
    public COMPANYTYPE2 getMASTERCHAIN() {
        return masterchain;
    }

    /**
     * Sets the value of the masterchain property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPANYTYPE2 }
     *     
     */
    public void setMASTERCHAIN(COMPANYTYPE2 value) {
        this.masterchain = value;
    }

    /**
     * Gets the value of the boolreverttostandard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLREVERTTOSTANDARD() {
        return boolreverttostandard;
    }

    /**
     * Sets the value of the boolreverttostandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLREVERTTOSTANDARD(Boolean value) {
        this.boolreverttostandard = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link COMPANYTYPE2 }
     *     
     */
    public COMPANYTYPE2 getBRAND() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPANYTYPE2 }
     *     
     */
    public void setBRAND(COMPANYTYPE2 value) {
        this.brand = value;
    }

}
