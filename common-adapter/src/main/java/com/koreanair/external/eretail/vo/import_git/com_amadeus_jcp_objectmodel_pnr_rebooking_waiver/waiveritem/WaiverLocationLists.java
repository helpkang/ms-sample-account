
package com.koreanair.external.eretail.vo.import_git.com_amadeus_jcp_objectmodel_pnr_rebooking_waiver.waiveritem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representation of central system ticketGeoGrp in Ticket_CheckEligibility
 * 
 * <p>Java class for waiverLocationLists complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waiverLocationLists"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_LOCATION" type="{}waiverLocationItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_EXCLUDED_LOCATION" type="{}waiverLocationItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waiverLocationLists", propOrder = {
    "listlocation",
    "listexcludedlocation"
})
public class WaiverLocationLists
    implements Serializable
{

    @XmlElement(name = "LIST_LOCATION")
    protected List<WaiverLocationItem> listlocation;
    @XmlElement(name = "LIST_EXCLUDED_LOCATION")
    protected List<WaiverLocationItem> listexcludedlocation;

    /**
     * Gets the value of the listlocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listlocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTLOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaiverLocationItem }
     * 
     * 
     */
    public List<WaiverLocationItem> getLISTLOCATION() {
        if (listlocation == null) {
            listlocation = new ArrayList<WaiverLocationItem>();
        }
        return this.listlocation;
    }

    /**
     * Gets the value of the listexcludedlocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexcludedlocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXCLUDEDLOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaiverLocationItem }
     * 
     * 
     */
    public List<WaiverLocationItem> getLISTEXCLUDEDLOCATION() {
        if (listexcludedlocation == null) {
            listexcludedlocation = new ArrayList<WaiverLocationItem>();
        }
        return this.listexcludedlocation;
    }

}
