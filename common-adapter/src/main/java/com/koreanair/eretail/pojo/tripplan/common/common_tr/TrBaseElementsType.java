
package com.koreanair.eretail.pojo.tripplan.common.common_tr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trBaseElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trBaseElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}trBaseElementsIDsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUMBER_IN_PARTY" type="{}trNumeric1To99Type" minOccurs="0"/&gt;
 *         &lt;element name="OVERRIDE_STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_FAMILY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trBaseElementsType", propOrder = {
    "description",
    "status",
    "numberinparty",
    "overridestatus",
    "typefamily"
})
@XmlSeeAlso({
    TrCommonElementsType.class
})
public class TrBaseElementsType
    extends TrBaseElementsIDsType
    implements Serializable
{

    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "NUMBER_IN_PARTY")
    @XmlSchemaType(name = "integer")
    protected Integer numberinparty;
    @XmlElement(name = "OVERRIDE_STATUS")
    protected String overridestatus;
    @XmlElement(name = "TYPE_FAMILY")
    protected String typefamily;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the numberinparty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMBERINPARTY() {
        return numberinparty;
    }

    /**
     * Sets the value of the numberinparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMBERINPARTY(Integer value) {
        this.numberinparty = value;
    }

    /**
     * Gets the value of the overridestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVERRIDESTATUS() {
        return overridestatus;
    }

    /**
     * Sets the value of the overridestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVERRIDESTATUS(String value) {
        this.overridestatus = value;
    }

    /**
     * Gets the value of the typefamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEFAMILY() {
        return typefamily;
    }

    /**
     * Sets the value of the typefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEFAMILY(String value) {
        this.typefamily = value;
    }

}
