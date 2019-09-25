
package com.koreanair.eretail.pojo.hotel.commonout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.commonelementsout.HTLPRICETYPE;


/**
 * Represents a room for AeTM. This elements inherits from other room types, be carefull to check the hierarchy before you add something !
 * 
 * <p>Java class for RULES_DRIVEN_ROOM_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RULES_DRIVEN_ROOM_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ROOM_MULTISOURCE_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GDS_ROOM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RATECATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RATEACCESS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PRICING_DONE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RATE_PER_NIGHT" type="{}HTL_PRICE_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}BOOL_IS_OUT_OF_POLICY" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_IN_POLICY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}DISPLAY_RANK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RULES_DRIVEN_ROOM_TYPE", propOrder = {
    "gdsroomtype",
    "ratecategory",
    "rateaccess",
    "status",
    "pricingdone",
    "ratepernight",
    "boolisoutofpolicy",
    "hotelinpolicy",
    "displayrank"
})
public class RULESDRIVENROOMTYPE
    extends ROOMMULTISOURCETYPE
{

    @XmlElement(name = "GDS_ROOM_TYPE")
    protected String gdsroomtype;
    @XmlElement(name = "RATECATEGORY")
    protected List<String> ratecategory;
    @XmlElement(name = "RATEACCESS")
    protected List<String> rateaccess;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "PRICING_DONE")
    protected Boolean pricingdone;
    @XmlElement(name = "RATE_PER_NIGHT")
    protected HTLPRICETYPE ratepernight;
    @XmlElement(name = "BOOL_IS_OUT_OF_POLICY")
    protected Boolean boolisoutofpolicy;
    @XmlElement(name = "HOTEL_IN_POLICY")
    protected Boolean hotelinpolicy;
    @XmlElement(name = "DISPLAY_RANK")
    protected String displayrank;

    /**
     * Gets the value of the gdsroomtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSROOMTYPE() {
        return gdsroomtype;
    }

    /**
     * Sets the value of the gdsroomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSROOMTYPE(String value) {
        this.gdsroomtype = value;
    }

    /**
     * Gets the value of the ratecategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratecategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRATECATEGORY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRATECATEGORY() {
        if (ratecategory == null) {
            ratecategory = new ArrayList<String>();
        }
        return this.ratecategory;
    }

    /**
     * Gets the value of the rateaccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateaccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRATEACCESS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRATEACCESS() {
        if (rateaccess == null) {
            rateaccess = new ArrayList<String>();
        }
        return this.rateaccess;
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
     * Gets the value of the pricingdone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPRICINGDONE() {
        return pricingdone;
    }

    /**
     * Sets the value of the pricingdone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPRICINGDONE(Boolean value) {
        this.pricingdone = value;
    }

    /**
     * Gets the value of the ratepernight property.
     * 
     * @return
     *     possible object is
     *     {@link HTLPRICETYPE }
     *     
     */
    public HTLPRICETYPE getRATEPERNIGHT() {
        return ratepernight;
    }

    /**
     * Sets the value of the ratepernight property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTLPRICETYPE }
     *     
     */
    public void setRATEPERNIGHT(HTLPRICETYPE value) {
        this.ratepernight = value;
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
     * Gets the value of the hotelinpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHOTELINPOLICY() {
        return hotelinpolicy;
    }

    /**
     * Sets the value of the hotelinpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHOTELINPOLICY(Boolean value) {
        this.hotelinpolicy = value;
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
