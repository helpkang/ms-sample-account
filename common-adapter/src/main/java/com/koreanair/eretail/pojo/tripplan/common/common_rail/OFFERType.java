
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OFFER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFFER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}OFFER_Type_BASE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOOKABLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PRICE" type="{}TRAIN_PRICE_Type" minOccurs="0"/&gt;
 *         &lt;element name="OFFER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{}RulesDrivenInformation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OFFER_Type", propOrder = {
    "bookable",
    "price",
    "offerid",
    "boolisoutofpolicy",
    "displayrank"
})
public class OFFERType
    extends OFFERTypeBASE
    implements Serializable
{

    @XmlElement(name = "BOOKABLE")
    protected boolean bookable;
    @XmlElement(name = "PRICE")
    protected TRAINPRICEType price;
    @XmlElement(name = "OFFER_ID", required = true)
    protected String offerid;
    @XmlElement(name = "BOOL_IS_OUT_OF_POLICY")
    protected Boolean boolisoutofpolicy;
    @XmlElement(name = "DISPLAY_RANK")
    protected String displayrank;

    /**
     * Gets the value of the bookable property.
     * 
     */
    public boolean isBOOKABLE() {
        return bookable;
    }

    /**
     * Sets the value of the bookable property.
     * 
     */
    public void setBOOKABLE(boolean value) {
        this.bookable = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINPRICEType }
     *     
     */
    public TRAINPRICEType getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINPRICEType }
     *     
     */
    public void setPRICE(TRAINPRICEType value) {
        this.price = value;
    }

    /**
     * Gets the value of the offerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFERID() {
        return offerid;
    }

    /**
     * Sets the value of the offerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFERID(String value) {
        this.offerid = value;
    }

    /**
     * Gets the value of the boolisoutofpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLISOUTOFPOLICY() {
        return boolisoutofpolicy;
    }

    /**
     * Sets the value of the boolisoutofpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLISOUTOFPOLICY(Boolean value) {
        this.boolisoutofpolicy = value;
    }

    /**
     * Gets the value of the displayrank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYRANK() {
        return displayrank;
    }

    /**
     * Sets the value of the displayrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYRANK(String value) {
        this.displayrank = value;
    }

}
