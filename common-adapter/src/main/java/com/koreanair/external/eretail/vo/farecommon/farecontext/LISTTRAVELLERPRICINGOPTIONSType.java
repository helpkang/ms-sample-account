
package com.koreanair.external.eretail.vo.farecommon.farecontext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOATCType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.LISTTRAVELLERIDType;


/**
 * List of traveller-associated pricing options
 * 
 * <p>Java class for LIST_TRAVELLER_PRICING_OPTIONS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAVELLER_PRICING_OPTIONS_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{}LIST_TRAVELLER_ID_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DISCOUNT_INFO" type="{}DISCOUNT_INFO_ATC_Type" minOccurs="0"/&gt;
 *         &lt;element name="HOLD_FOR_FUTURE_USE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAVELLER_PRICING_OPTIONS_Type", propOrder = {
    "listtravellerid",
    "discountinfo",
    "holdforfutureuse"
})
public class LISTTRAVELLERPRICINGOPTIONSType
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER_ID", required = true)
    protected List<LISTTRAVELLERIDType> listtravellerid;
    @XmlElement(name = "DISCOUNT_INFO")
    protected DISCOUNTINFOATCType discountinfo;
    @XmlElement(name = "HOLD_FOR_FUTURE_USE")
    protected Boolean holdforfutureuse;

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVELLERIDType }
     * 
     * 
     */
    public List<LISTTRAVELLERIDType> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<LISTTRAVELLERIDType>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the discountinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFOATCType }
     *     
     */
    public DISCOUNTINFOATCType getDISCOUNTINFO() {
        return discountinfo;
    }

    /**
     * Sets the value of the discountinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFOATCType }
     *     
     */
    public void setDISCOUNTINFO(DISCOUNTINFOATCType value) {
        this.discountinfo = value;
    }

    /**
     * Gets the value of the holdforfutureuse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHOLDFORFUTUREUSE() {
        return holdforfutureuse;
    }

    /**
     * Sets the value of the holdforfutureuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHOLDFORFUTUREUSE(Boolean value) {
        this.holdforfutureuse = value;
    }

}
