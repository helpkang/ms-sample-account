
package com.koreanair.external.eretail.vo.import_git.com_amadeus_jcp_objectmodel_pnr_rebooking_waiver.waiveritem;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Waiver information per ticket. For a matching of waiver information and segments check the element LIST_WAIVER_INFORMATION_PER_TICKET.
 * 
 * <p>Java class for waiverItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waiverItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WAIVER_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WAIVER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CURRENT_TICKET" type="{}waiverTicketItem"/&gt;
 *         &lt;element name="NEW_TICKET" type="{}waiverTicketItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waiverItem", propOrder = {
    "waivercode",
    "waivertype",
    "currentticket",
    "newticket"
})
public class WaiverItem
    implements Serializable
{

    @XmlElement(name = "WAIVER_CODE", required = true)
    protected String waivercode;
    @XmlElement(name = "WAIVER_TYPE", required = true)
    protected String waivertype;
    @XmlElement(name = "CURRENT_TICKET", required = true)
    protected WaiverTicketItem currentticket;
    @XmlElement(name = "NEW_TICKET", required = true)
    protected WaiverTicketItem newticket;

    /**
     * Gets the value of the waivercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAIVERCODE() {
        return waivercode;
    }

    /**
     * Sets the value of the waivercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAIVERCODE(String value) {
        this.waivercode = value;
    }

    /**
     * Gets the value of the waivertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAIVERTYPE() {
        return waivertype;
    }

    /**
     * Sets the value of the waivertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAIVERTYPE(String value) {
        this.waivertype = value;
    }

    /**
     * Gets the value of the currentticket property.
     * 
     * @return
     *     possible object is
     *     {@link WaiverTicketItem }
     *     
     */
    public WaiverTicketItem getCURRENTTICKET() {
        return currentticket;
    }

    /**
     * Sets the value of the currentticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverTicketItem }
     *     
     */
    public void setCURRENTTICKET(WaiverTicketItem value) {
        this.currentticket = value;
    }

    /**
     * Gets the value of the newticket property.
     * 
     * @return
     *     possible object is
     *     {@link WaiverTicketItem }
     *     
     */
    public WaiverTicketItem getNEWTICKET() {
        return newticket;
    }

    /**
     * Sets the value of the newticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverTicketItem }
     *     
     */
    public void setNEWTICKET(WaiverTicketItem value) {
        this.newticket = value;
    }

}
