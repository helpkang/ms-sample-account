
package com.koreanair.external.eretail.vo.pnr.retrievepnrinput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.IDENTITYTYPE;


/**
 * 
 * 				Gives details about a traveller targeted by pricing options defined in LIST_PRICING_OPTIONS element.
 * 			
 * 
 * <p>Java class for TRAVELLER_PRICING_OPTION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVELLER_PRICING_OPTION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_EXTERNAL_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IDENTITY" type="{}IDENTITY_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAVELLER_PRICING_OPTION_Type", propOrder = {
    "travellerexternalid",
    "identity"
})
public class TRAVELLERPRICINGOPTIONType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_EXTERNAL_ID", required = true)
    protected String travellerexternalid;
    @XmlElement(name = "IDENTITY", required = true)
    protected IDENTITYTYPE identity;

    /**
     * Gets the value of the travellerexternalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLEREXTERNALID() {
        return travellerexternalid;
    }

    /**
     * Sets the value of the travellerexternalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLEREXTERNALID(String value) {
        this.travellerexternalid = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYTYPE }
     *     
     */
    public IDENTITYTYPE getIDENTITY() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYTYPE }
     *     
     */
    public void setIDENTITY(IDENTITYTYPE value) {
        this.identity = value;
    }

}
