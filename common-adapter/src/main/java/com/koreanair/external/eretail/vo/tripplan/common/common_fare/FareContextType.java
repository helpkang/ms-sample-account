
package com.koreanair.external.eretail.vo.tripplan.common.common_fare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListResidentDiscountType;


/**
 * <p>Java class for fareContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_RESIDENT_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_DISCOUNT_CREDENTIALS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_CLASS" type="{}listFareClassType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareContextType", propOrder = {
    "listresidentdiscount",
    "listdiscountcredentials",
    "listfareclass"
})
public class FareContextType
    implements Serializable
{

    @XmlElement(name = "LIST_RESIDENT_DISCOUNT")
    protected List<ListResidentDiscountType> listresidentdiscount;
    @XmlElement(name = "LIST_DISCOUNT_CREDENTIALS")
    protected List<ListDiscountCredentialsType> listdiscountcredentials;
    @XmlElement(name = "LIST_FARE_CLASS")
    protected List<ListFareClassType> listfareclass;

    /**
     * Gets the value of the listresidentdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listresidentdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRESIDENTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListResidentDiscountType }
     * 
     * 
     */
    public List<ListResidentDiscountType> getLISTRESIDENTDISCOUNT() {
        if (listresidentdiscount == null) {
            listresidentdiscount = new ArrayList<ListResidentDiscountType>();
        }
        return this.listresidentdiscount;
    }

    /**
     * Gets the value of the listdiscountcredentials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscountcredentials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNTCREDENTIALS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListDiscountCredentialsType }
     * 
     * 
     */
    public List<ListDiscountCredentialsType> getLISTDISCOUNTCREDENTIALS() {
        if (listdiscountcredentials == null) {
            listdiscountcredentials = new ArrayList<ListDiscountCredentialsType>();
        }
        return this.listdiscountcredentials;
    }

    /**
     * Gets the value of the listfareclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARECLASS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListFareClassType }
     * 
     * 
     */
    public List<ListFareClassType> getLISTFARECLASS() {
        if (listfareclass == null) {
            listfareclass = new ArrayList<ListFareClassType>();
        }
        return this.listfareclass;
    }

}
