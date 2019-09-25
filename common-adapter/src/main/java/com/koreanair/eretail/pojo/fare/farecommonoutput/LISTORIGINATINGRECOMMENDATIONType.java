
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ORIGINATING_RECOMMENDATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ORIGINATING_RECOMMENDATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_PNR" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}LIST_TRIP_PRICE" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ORIGINATING_RECOMMENDATION_Type", propOrder = {
    "listpnr",
    "listtripprice"
})
public class LISTORIGINATINGRECOMMENDATIONType
    implements Serializable
{

    @XmlElement(name = "LIST_PNR", required = true)
    protected List<LISTPNRType> listpnr;
    @XmlElement(name = "LIST_TRIP_PRICE", required = true)
    protected List<LISTTRIPPRICE> listtripprice;

    /**
     * Gets the value of the listpnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPNRType }
     * 
     * 
     */
    public List<LISTPNRType> getLISTPNR() {
        if (listpnr == null) {
            listpnr = new ArrayList<LISTPNRType>();
        }
        return this.listpnr;
    }

    /**
     * Gets the value of the listtripprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtripprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRIPPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRIPPRICE }
     * 
     * 
     */
    public List<LISTTRIPPRICE> getLISTTRIPPRICE() {
        if (listtripprice == null) {
            listtripprice = new ArrayList<LISTTRIPPRICE>();
        }
        return this.listtripprice;
    }

}
