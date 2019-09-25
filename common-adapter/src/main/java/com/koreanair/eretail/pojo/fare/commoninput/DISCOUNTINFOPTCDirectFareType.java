
package com.koreanair.eretail.pojo.fare.commoninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Element to contain all PTC discount information associated to a traveller
 * 			
 * 
 * <p>Java class for DISCOUNT_INFO_PTC_DirectFare_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNT_INFO_PTC_DirectFare_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IS_CUMULATIVE_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PTC" type="{}DISCOUNT_INFO_PTC_LIST_PTC_DirectFare_Type" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISCOUNT_INFO_PTC_DirectFare_Type", propOrder = {
    "iscumulativediscount",
    "listptc"
})
public class DISCOUNTINFOPTCDirectFareType
    implements Serializable
{

    @XmlElement(name = "IS_CUMULATIVE_DISCOUNT")
    protected Boolean iscumulativediscount;
    @XmlElement(name = "LIST_PTC", required = true)
    protected List<DISCOUNTINFOPTCLISTPTCDirectFareType> listptc;

    /**
     * Gets the value of the iscumulativediscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISCUMULATIVEDISCOUNT() {
        return iscumulativediscount;
    }

    /**
     * Sets the value of the iscumulativediscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISCUMULATIVEDISCOUNT(Boolean value) {
        this.iscumulativediscount = value;
    }

    /**
     * Gets the value of the listptc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listptc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPTC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISCOUNTINFOPTCLISTPTCDirectFareType }
     * 
     * 
     */
    public List<DISCOUNTINFOPTCLISTPTCDirectFareType> getLISTPTC() {
        if (listptc == null) {
            listptc = new ArrayList<DISCOUNTINFOPTCLISTPTCDirectFareType>();
        }
        return this.listptc;
    }

}
