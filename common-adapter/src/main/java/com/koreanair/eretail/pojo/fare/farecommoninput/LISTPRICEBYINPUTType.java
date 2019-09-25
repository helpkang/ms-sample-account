
package com.koreanair.eretail.pojo.fare.farecommoninput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.fare.commoninput.PARAMETERIDType;
import com.koreanair.eretail.pojo.farecommon.farecontext.LISTCORPORATENUMBER;


/**
 * <p>Java class for LIST_PRICE_BY_INPUT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PRICE_BY_INPUT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}PRICE_BY_INPUT_ID"/&gt;
 *         &lt;element ref="{}TYPE_OF_FARE"/&gt;
 *         &lt;element ref="{}FARE_COMMAND_ID"/&gt;
 *         &lt;element ref="{}ALL_FARES" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}PASS_CORPORATE_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}USE_DISCOUNT_CARD" minOccurs="0"/&gt;
 *         &lt;element ref="{}AIR_RULE_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_BY_BOUND" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{}CABIN_INFO_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}USE_CABIN_OPTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}CABIN_OPTION_VALUE" minOccurs="0"/&gt;
 *         &lt;element ref="{}TYPE_OF_CORPORATE_FARE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_CORPORATE_NUMBER" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_PARAMETER" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="FARE_RESPONSE_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="LOWEST_FARE"/&gt;
 *               &lt;enumeration value="LIST_OF_FARE"/&gt;
 *               &lt;enumeration value="LOWEST_AVAILABLE_FARE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}PRICING_OPTIONS_ID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PRICE_BY_INPUT_Type", propOrder = {
    "pricebyinputid",
    "typeoffare",
    "farecommandid",
    "allfares",
    "fareid",
    "passcorporateid",
    "usediscountcard",
    "airruleid",
    "listfarebybound",
    "cabininfoid",
    "usecabinoption",
    "cabinoptionvalue",
    "typeofcorporatefare",
    "listcorporatenumber",
    "listfareparameter",
    "fareresponsetype",
    "pricingoptionsid"
})
public class LISTPRICEBYINPUTType
    implements Serializable
{

    @XmlElement(name = "PRICE_BY_INPUT_ID", required = true)
    protected BigInteger pricebyinputid;
    @XmlElement(name = "TYPE_OF_FARE", required = true)
    protected BigInteger typeoffare;
    @XmlElement(name = "FARE_COMMAND_ID", required = true)
    protected BigInteger farecommandid;
    @XmlElement(name = "ALL_FARES")
    protected BigInteger allfares;
    @XmlElement(name = "FARE_ID")
    protected BigInteger fareid;
    @XmlElement(name = "PASS_CORPORATE_ID")
    protected BigInteger passcorporateid;
    @XmlElement(name = "USE_DISCOUNT_CARD")
    protected Boolean usediscountcard;
    @XmlElement(name = "AIR_RULE_ID")
    protected BigInteger airruleid;
    @XmlElement(name = "LIST_FARE_BY_BOUND")
    protected List<String> listfarebybound;
    @XmlElement(name = "CABIN_INFO_ID")
    protected BigInteger cabininfoid;
    @XmlElement(name = "USE_CABIN_OPTION")
    protected Boolean usecabinoption;
    @XmlElement(name = "CABIN_OPTION_VALUE")
    protected Object cabinoptionvalue;
    @XmlElement(name = "TYPE_OF_CORPORATE_FARE")
    protected BigInteger typeofcorporatefare;
    @XmlElement(name = "LIST_CORPORATE_NUMBER")
    protected List<LISTCORPORATENUMBER> listcorporatenumber;
    @XmlElement(name = "LIST_FARE_PARAMETER")
    protected List<PARAMETERIDType> listfareparameter;
    @XmlElement(name = "FARE_RESPONSE_TYPE")
    protected String fareresponsetype;
    @XmlElement(name = "PRICING_OPTIONS_ID")
    protected BigInteger pricingoptionsid;

    /**
     * Gets the value of the pricebyinputid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRICEBYINPUTID() {
        return pricebyinputid;
    }

    /**
     * Sets the value of the pricebyinputid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRICEBYINPUTID(BigInteger value) {
        this.pricebyinputid = value;
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
     * Gets the value of the farecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFARECOMMANDID() {
        return farecommandid;
    }

    /**
     * Sets the value of the farecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFARECOMMANDID(BigInteger value) {
        this.farecommandid = value;
    }

    /**
     * Gets the value of the allfares property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getALLFARES() {
        return allfares;
    }

    /**
     * Sets the value of the allfares property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setALLFARES(BigInteger value) {
        this.allfares = value;
    }

    /**
     * Mandatory:The fare id: 0 Restricted. 1 Unrestricted. But it is not mandatory for ATC repricing verb, this value is not supported.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFAREID() {
        return fareid;
    }

    /**
     * Sets the value of the fareid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFAREID(BigInteger value) {
        this.fareid = value;
    }

    /**
     * Gets the value of the passcorporateid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPASSCORPORATEID() {
        return passcorporateid;
    }

    /**
     * Sets the value of the passcorporateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPASSCORPORATEID(BigInteger value) {
        this.passcorporateid = value;
    }

    /**
     * Gets the value of the usediscountcard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSEDISCOUNTCARD() {
        return usediscountcard;
    }

    /**
     * Sets the value of the usediscountcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSEDISCOUNTCARD(Boolean value) {
        this.usediscountcard = value;
    }

    /**
     * Gets the value of the airruleid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAIRRULEID() {
        return airruleid;
    }

    /**
     * Sets the value of the airruleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAIRRULEID(BigInteger value) {
        this.airruleid = value;
    }

    /**
     * Gets the value of the listfarebybound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarebybound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREBYBOUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFAREBYBOUND() {
        if (listfarebybound == null) {
            listfarebybound = new ArrayList<String>();
        }
        return this.listfarebybound;
    }

    /**
     * Gets the value of the cabininfoid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCABININFOID() {
        return cabininfoid;
    }

    /**
     * Sets the value of the cabininfoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCABININFOID(BigInteger value) {
        this.cabininfoid = value;
    }

    /**
     * Gets the value of the usecabinoption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSECABINOPTION() {
        return usecabinoption;
    }

    /**
     * Sets the value of the usecabinoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSECABINOPTION(Boolean value) {
        this.usecabinoption = value;
    }

    /**
     * The value to use after /K option in price for lower fares. A string concatenation of cabin codes. Allowed codes are F:First, C:Business, W:Premium Economy, M:Standard Economy, Y:Economy (M+W)
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCABINOPTIONVALUE() {
        return cabinoptionvalue;
    }

    /**
     * Sets the value of the cabinoptionvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCABINOPTIONVALUE(Object value) {
        this.cabinoptionvalue = value;
    }

    /**
     * The type of corporate used for the faring command. For ATC repricing verb, Only corporate fare unifare (2) is supported.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPEOFCORPORATEFARE() {
        return typeofcorporatefare;
    }

    /**
     * Sets the value of the typeofcorporatefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPEOFCORPORATEFARE(BigInteger value) {
        this.typeofcorporatefare = value;
    }

    /**
     * The list of corporate code that will be used during faring. For ATC repricing verb, the first corporate code will be used.Gets the value of the listcorporatenumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcorporatenumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCORPORATENUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCORPORATENUMBER }
     * 
     * 
     */
    public List<LISTCORPORATENUMBER> getLISTCORPORATENUMBER() {
        if (listcorporatenumber == null) {
            listcorporatenumber = new ArrayList<LISTCORPORATENUMBER>();
        }
        return this.listcorporatenumber;
    }

    /**
     * Gets the value of the listfareparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREPARAMETER() {
        if (listfareparameter == null) {
            listfareparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfareparameter;
    }

    /**
     * Gets the value of the fareresponsetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARERESPONSETYPE() {
        return fareresponsetype;
    }

    /**
     * Sets the value of the fareresponsetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARERESPONSETYPE(String value) {
        this.fareresponsetype = value;
    }

    /**
     * Gets the value of the pricingoptionsid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRICINGOPTIONSID() {
        return pricingoptionsid;
    }

    /**
     * Sets the value of the pricingoptionsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRICINGOPTIONSID(BigInteger value) {
        this.pricingoptionsid = value;
    }

}
