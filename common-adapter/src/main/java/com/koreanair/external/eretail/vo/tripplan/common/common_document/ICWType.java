
package com.koreanair.external.eretail.vo.tripplan.common.common_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.tripplan.common.common_fare.DOCUMENTType;
import com.koreanair.external.eretail.vo.tripplan.common.common_fare.MARKETINGCARRIERType;


/**
 * <p>Java class for ICWType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICWType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COUPON_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="16" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT" type="{}DOCUMENTType" minOccurs="0"/&gt;
 *         &lt;element name="MARKETING_CARRIER" type="{}MARKETING_CARRIERType" minOccurs="0"/&gt;
 *         &lt;element name="COUPON_QUALIFIER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="D"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICWType", propOrder = {
    "couponnumber",
    "document",
    "marketingcarrier",
    "couponqualifier"
})
public class ICWType
    implements Serializable
{

    @XmlElement(name = "COUPON_NUMBER")
    protected List<Object> couponnumber;
    @XmlElement(name = "DOCUMENT")
    protected DOCUMENTType document;
    @XmlElement(name = "MARKETING_CARRIER")
    protected MARKETINGCARRIERType marketingcarrier;
    @XmlElement(name = "COUPON_QUALIFIER")
    protected String couponqualifier;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;

    /**
     * Gets the value of the couponnumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponnumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOUPONNUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCOUPONNUMBER() {
        if (couponnumber == null) {
            couponnumber = new ArrayList<Object>();
        }
        return this.couponnumber;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTType }
     *     
     */
    public DOCUMENTType getDOCUMENT() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTType }
     *     
     */
    public void setDOCUMENT(DOCUMENTType value) {
        this.document = value;
    }

    /**
     * Gets the value of the marketingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link MARKETINGCARRIERType }
     *     
     */
    public MARKETINGCARRIERType getMARKETINGCARRIER() {
        return marketingcarrier;
    }

    /**
     * Sets the value of the marketingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKETINGCARRIERType }
     *     
     */
    public void setMARKETINGCARRIER(MARKETINGCARRIERType value) {
        this.marketingcarrier = value;
    }

    /**
     * Gets the value of the couponqualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUPONQUALIFIER() {
        return couponqualifier;
    }

    /**
     * Sets the value of the couponqualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUPONQUALIFIER(String value) {
        this.couponqualifier = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
