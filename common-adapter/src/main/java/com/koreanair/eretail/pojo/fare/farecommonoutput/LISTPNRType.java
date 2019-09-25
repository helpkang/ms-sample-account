
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.APPLICABLEFEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTPROMOTIONCODEType;
import com.koreanair.eretail.pojo.farecommon.farecontext.FARECONTEXTType;


/**
 * <p>Java class for LIST_PNR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PNR_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}TYPE_OF_FARE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TRAVELLER_TYPE" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}FARE_COMMAND" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_RBD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PNR_PRICE" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}SATURNE_INFO" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_CONTEXT" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_APPLICABLE_MARKUP_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PROMOTION_CODE" type="{}LIST_PROMOTION_CODE_type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LIST_PNR_Type", propOrder = {
    "typeoffare",
    "listtravellertype",
    "farecommand",
    "listrbd",
    "listpnrprice",
    "saturneinfo",
    "farecontext",
    "listapplicablemarkupdiscount",
    "listpromotioncode",
    "pricedpaxonly"
})
public class LISTPNRType
    implements Serializable
{

    @XmlElement(name = "TYPE_OF_FARE")
    protected BigInteger typeoffare;
    @XmlElement(name = "LIST_TRAVELLER_TYPE", required = true)
    protected List<LISTTRAVELLERTYPEType> listtravellertype;
    @XmlElement(name = "FARE_COMMAND")
    protected BigInteger farecommand;
    @XmlElement(name = "LIST_RBD")
    protected List<FARERBDType> listrbd;
    @XmlElement(name = "LIST_PNR_PRICE", required = true)
    protected List<PRICEType> listpnrprice;
    @XmlElement(name = "SATURNE_INFO")
    protected SATURNEINFO saturneinfo;
    @XmlElement(name = "FARE_CONTEXT")
    protected FARECONTEXTType farecontext;
    @XmlElement(name = "LIST_APPLICABLE_MARKUP_DISCOUNT")
    protected List<APPLICABLEFEEType> listapplicablemarkupdiscount;
    @XmlElement(name = "LIST_PROMOTION_CODE")
    protected List<LISTPROMOTIONCODEType> listpromotioncode;
    @XmlElement(name = "PRICED_PAX_ONLY")
    protected Boolean pricedpaxonly;

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
     * {@link LISTTRAVELLERTYPEType }
     * 
     * 
     */
    public List<LISTTRAVELLERTYPEType> getLISTTRAVELLERTYPE() {
        if (listtravellertype == null) {
            listtravellertype = new ArrayList<LISTTRAVELLERTYPEType>();
        }
        return this.listtravellertype;
    }

    /**
     * Gets the value of the farecommand property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFARECOMMAND() {
        return farecommand;
    }

    /**
     * Sets the value of the farecommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFARECOMMAND(BigInteger value) {
        this.farecommand = value;
    }

    /**
     * Cabin RBD codes. Optional in LIST_ORIGINATING_RECOMMENDATION.Gets the value of the listrbd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrbd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRBD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FARERBDType }
     * 
     * 
     */
    public List<FARERBDType> getLISTRBD() {
        if (listrbd == null) {
            listrbd = new ArrayList<FARERBDType>();
        }
        return this.listrbd;
    }

    /**
     * Gets the value of the listpnrprice property.
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
     * {@link PRICEType }
     * 
     * 
     */
    public List<PRICEType> getLISTPNRPRICE() {
        if (listpnrprice == null) {
            listpnrprice = new ArrayList<PRICEType>();
        }
        return this.listpnrprice;
    }

    /**
     * Gets the value of the saturneinfo property.
     * 
     * @return
     *     possible object is
     *     {@link SATURNEINFO }
     *     
     */
    public SATURNEINFO getSATURNEINFO() {
        return saturneinfo;
    }

    /**
     * Sets the value of the saturneinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SATURNEINFO }
     *     
     */
    public void setSATURNEINFO(SATURNEINFO value) {
        this.saturneinfo = value;
    }

    /**
     * Gets the value of the farecontext property.
     * 
     * @return
     *     possible object is
     *     {@link FARECONTEXTType }
     *     
     */
    public FARECONTEXTType getFARECONTEXT() {
        return farecontext;
    }

    /**
     * Sets the value of the farecontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARECONTEXTType }
     *     
     */
    public void setFARECONTEXT(FARECONTEXTType value) {
        this.farecontext = value;
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
     * Gets the value of the listpromotioncode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpromotioncode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROMOTIONCODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPROMOTIONCODEType }
     * 
     * 
     */
    public List<LISTPROMOTIONCODEType> getLISTPROMOTIONCODE() {
        if (listpromotioncode == null) {
            listpromotioncode = new ArrayList<LISTPROMOTIONCODEType>();
        }
        return this.listpromotioncode;
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

}
