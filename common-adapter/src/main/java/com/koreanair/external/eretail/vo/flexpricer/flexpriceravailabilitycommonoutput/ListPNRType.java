
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.APPLICABLEFEEType;


/**
 * <p>Java class for ListPNRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListPNRType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_TRAVELLER_TYPE" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}TYPE_OF_FARE" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}LIST_PNR_PRICE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="PNR_PRICE" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}LIST_APPLICABLE_MARKUP_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}PRICED_PAX_ONLY" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListPNRType", propOrder = {
    "listtravellertype",
    "typeoffare",
    "listpnrprice",
    "pnrprice",
    "listapplicablemarkupdiscount",
    "pricedpaxonly"
})
public class ListPNRType
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER_TYPE", required = true)
    protected List<ListTravellerType> listtravellertype;
    @XmlElement(name = "TYPE_OF_FARE")
    protected BigInteger typeoffare;
    @XmlElement(name = "LIST_PNR_PRICE")
    protected List<PriceType> listpnrprice;
    @XmlElement(name = "PNR_PRICE")
    protected ListPNRType.PNRPRICE pnrprice;
    @XmlElement(name = "LIST_APPLICABLE_MARKUP_DISCOUNT")
    protected List<APPLICABLEFEEType> listapplicablemarkupdiscount;
    @XmlElement(name = "PRICED_PAX_ONLY")
    protected Boolean pricedpaxonly;

    /**
     * Gets the value of the listtravellertype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellertype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTravellerType }
     * 
     * 
     */
    public List<ListTravellerType> getLISTTRAVELLERTYPE() {
        if (listtravellertype == null) {
            listtravellertype = new ArrayList<ListTravellerType>();
        }
        return this.listtravellertype;
    }

    /**
     * Gets the value of the typeoffare property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPEOFFARE() {
        return typeoffare;
    }

    /**
     * Sets the value of the typeoffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPEOFFARE(BigInteger value) {
        this.typeoffare = value;
    }

    /**
     * PNR prices computed in  different currencies. This tag is optional if the extended calendar functionality is used (panel type = EC) and mandatory otherwise Gets the value of the listpnrprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpnrprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPNRPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getLISTPNRPRICE() {
        if (listpnrprice == null) {
            listpnrprice = new ArrayList<PriceType>();
        }
        return this.listpnrprice;
    }

    /**
     * Gets the value of the pnrprice property.
     * 
     * @return
     *     possible object is
     *     {@link ListPNRType.PNRPRICE }
     *     
     */
    public ListPNRType.PNRPRICE getPNRPRICE() {
        return pnrprice;
    }

    /**
     * Sets the value of the pnrprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPNRType.PNRPRICE }
     *     
     */
    public void setPNRPRICE(ListPNRType.PNRPRICE value) {
        this.pnrprice = value;
    }

    /**
     * Gets the value of the listapplicablemarkupdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listapplicablemarkupdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPPLICABLEMARKUPDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APPLICABLEFEEType }
     * 
     * 
     */
    public List<APPLICABLEFEEType> getLISTAPPLICABLEMARKUPDISCOUNT() {
        if (listapplicablemarkupdiscount == null) {
            listapplicablemarkupdiscount = new ArrayList<APPLICABLEFEEType>();
        }
        return this.listapplicablemarkupdiscount;
    }

    /**
     * Gets the value of the pricedpaxonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPRICEDPAXONLY() {
        return pricedpaxonly;
    }

    /**
     * Sets the value of the pricedpaxonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPRICEDPAXONLY(Boolean value) {
        this.pricedpaxonly = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "refnumber"
    })
    public static class PNRPRICE
        implements Serializable
    {

        @XmlElement(name = "REF_NUMBER", required = true)
        protected BigInteger refnumber;

        /**
         * Gets the value of the refnumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getREFNUMBER() {
            return refnumber;
        }

        /**
         * Sets the value of the refnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setREFNUMBER(BigInteger value) {
            this.refnumber = value;
        }

    }

}
