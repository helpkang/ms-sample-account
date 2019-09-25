
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTTRAVELLERType;


/**
 * <p>Java class for LIST_ALTERNATE_TRAVELLER_TYPE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ALTERNATE_TRAVELLER_TYPE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRAVELLER" type="{}LIST_ALTERNATE_TRAVELLER_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TRAVELLER_TYPE" type="{}INPUT_TRAVELLER_Type"/&gt;
 *         &lt;element ref="{}NUMBER"/&gt;
 *         &lt;element name="LIST_TRAVELLER_PRICE" type="{}ALTERNATE_CONVERTED_BALANCE_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_TRAVELLER_TYPE_PRICE" type="{}ALTERNATE_CONVERTED_BALANCE_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ALTERNATE_TRAVELLER_TYPE_Type", propOrder = {
    "listtraveller",
    "travellertype",
    "number",
    "listtravellerprice",
    "listtravellertypeprice"
})
public class LISTALTERNATETRAVELLERTYPEType
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER", required = true)
    protected List<LISTALTERNATETRAVELLERType> listtraveller;
    @XmlElement(name = "TRAVELLER_TYPE", required = true)
    protected INPUTTRAVELLERType travellertype;
    @XmlElement(name = "NUMBER", required = true)
    protected BigInteger number;
    @XmlElement(name = "LIST_TRAVELLER_PRICE", required = true)
    protected List<ALTERNATECONVERTEDBALANCEType> listtravellerprice;
    @XmlElement(name = "LIST_TRAVELLER_TYPE_PRICE", required = true)
    protected List<ALTERNATECONVERTEDBALANCEType> listtravellertypeprice;

    /**
     * Gets the value of the listtraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTALTERNATETRAVELLERType }
     * 
     * 
     */
    public List<LISTALTERNATETRAVELLERType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<LISTALTERNATETRAVELLERType>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link INPUTTRAVELLERType }
     *     
     */
    public INPUTTRAVELLERType getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link INPUTTRAVELLERType }
     *     
     */
    public void setTRAVELLERTYPE(INPUTTRAVELLERType value) {
        this.travellertype = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBER(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the listtravellerprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ALTERNATECONVERTEDBALANCEType }
     * 
     * 
     */
    public List<ALTERNATECONVERTEDBALANCEType> getLISTTRAVELLERPRICE() {
        if (listtravellerprice == null) {
            listtravellerprice = new ArrayList<ALTERNATECONVERTEDBALANCEType>();
        }
        return this.listtravellerprice;
    }

    /**
     * Gets the value of the listtravellertypeprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellertypeprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERTYPEPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ALTERNATECONVERTEDBALANCEType }
     * 
     * 
     */
    public List<ALTERNATECONVERTEDBALANCEType> getLISTTRAVELLERTYPEPRICE() {
        if (listtravellertypeprice == null) {
            listtravellertypeprice = new ArrayList<ALTERNATECONVERTEDBALANCEType>();
        }
        return this.listtravellertypeprice;
    }

}
