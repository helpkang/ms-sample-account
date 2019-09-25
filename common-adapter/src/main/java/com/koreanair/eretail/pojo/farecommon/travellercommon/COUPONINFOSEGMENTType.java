
package com.koreanair.eretail.pojo.farecommon.travellercommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Only 1 Coupon code is allowed per segment and traveller.
 * 
 * <p>Java class for COUPON_INFO_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COUPON_INFO_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_COUPON" type="{}COUPON_INFO_SEGMENT_LIST_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COUPON_INFO_SEGMENT_Type", propOrder = {
    "listcoupon"
})
public class COUPONINFOSEGMENTType
    implements Serializable
{

    @XmlElement(name = "LIST_COUPON", required = true)
    protected List<COUPONINFOSEGMENTLISTType> listcoupon;

    /**
     * Gets the value of the listcoupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcoupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOUPON().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COUPONINFOSEGMENTLISTType }
     * 
     * 
     */
    public List<COUPONINFOSEGMENTLISTType> getLISTCOUPON() {
        if (listcoupon == null) {
            listcoupon = new ArrayList<COUPONINFOSEGMENTLISTType>();
        }
        return this.listcoupon;
    }

}
