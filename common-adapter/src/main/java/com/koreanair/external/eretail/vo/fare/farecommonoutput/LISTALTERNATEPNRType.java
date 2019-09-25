
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ALTERNATE_PNR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ALTERNATE_PNR_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}TYPE_OF_FARE" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_TYPE" type="{}LIST_ALTERNATE_TRAVELLER_TYPE_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}FARE_COMMAND" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PNR_PRICE" type="{}ALTERNATE_CONVERTED_BALANCE_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ALTERNATE_PNR_Type", propOrder = {
    "typeoffare",
    "listtravellertype",
    "farecommand",
    "listpnrprice"
})
public class LISTALTERNATEPNRType
    implements Serializable
{

    @XmlElement(name = "TYPE_OF_FARE")
    protected BigInteger typeoffare;
    @XmlElement(name = "LIST_TRAVELLER_TYPE", required = true)
    protected List<LISTALTERNATETRAVELLERTYPEType> listtravellertype;
    @XmlElement(name = "FARE_COMMAND")
    protected BigInteger farecommand;
    @XmlElement(name = "LIST_PNR_PRICE", required = true)
    protected List<ALTERNATECONVERTEDBALANCEType> listpnrprice;

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
     * {@link LISTALTERNATETRAVELLERTYPEType }
     * 
     * 
     */
    public List<LISTALTERNATETRAVELLERTYPEType> getLISTTRAVELLERTYPE() {
        if (listtravellertype == null) {
            listtravellertype = new ArrayList<LISTALTERNATETRAVELLERTYPEType>();
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
     * {@link ALTERNATECONVERTEDBALANCEType }
     * 
     * 
     */
    public List<ALTERNATECONVERTEDBALANCEType> getLISTPNRPRICE() {
        if (listpnrprice == null) {
            listpnrprice = new ArrayList<ALTERNATECONVERTEDBALANCEType>();
        }
        return this.listpnrprice;
    }

}
