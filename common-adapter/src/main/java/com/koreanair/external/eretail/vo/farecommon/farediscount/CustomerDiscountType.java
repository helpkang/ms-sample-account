
package com.koreanair.external.eretail.vo.farecommon.farediscount;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDiscount_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDiscount_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}CodeDescriptorGroup"/&gt;
 *         &lt;element name="TYPE" type="{}CustomerDiscountType_Type" minOccurs="0"/&gt;
 *         &lt;group ref="{}CustomerDiscountAdditionalData_Group" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_REFERENCE" maxOccurs="9" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;group ref="{}TravellerReferenceGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDiscount_Type", propOrder = {
    "code",
    "name",
    "type",
    "localmarketdiscountadditionaldata",
    "listtravellerreference"
})
public class CustomerDiscountType
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "TYPE")
    @XmlSchemaType(name = "string")
    protected CustomerDiscountTypeType type;
    @XmlElement(name = "LOCAL_MARKET_DISCOUNT_ADDITIONAL_DATA")
    protected LocalMarketDiscountAdditionalDataType localmarketdiscountadditionaldata;
    @XmlElement(name = "LIST_TRAVELLER_REFERENCE")
    protected List<CustomerDiscountType.LISTTRAVELLERREFERENCE> listtravellerreference;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDiscountTypeType }
     *     
     */
    public CustomerDiscountTypeType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDiscountTypeType }
     *     
     */
    public void setTYPE(CustomerDiscountTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the localmarketdiscountadditionaldata property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketDiscountAdditionalDataType }
     *     
     */
    public LocalMarketDiscountAdditionalDataType getLOCALMARKETDISCOUNTADDITIONALDATA() {
        return localmarketdiscountadditionaldata;
    }

    /**
     * Sets the value of the localmarketdiscountadditionaldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketDiscountAdditionalDataType }
     *     
     */
    public void setLOCALMARKETDISCOUNTADDITIONALDATA(LocalMarketDiscountAdditionalDataType value) {
        this.localmarketdiscountadditionaldata = value;
    }

    /**
     * Gets the value of the listtravellerreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerDiscountType.LISTTRAVELLERREFERENCE }
     * 
     * 
     */
    public List<CustomerDiscountType.LISTTRAVELLERREFERENCE> getLISTTRAVELLERREFERENCE() {
        if (listtravellerreference == null) {
            listtravellerreference = new ArrayList<CustomerDiscountType.LISTTRAVELLERREFERENCE>();
        }
        return this.listtravellerreference;
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
     *       &lt;group ref="{}TravellerReferenceGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "travellerid",
        "scope"
    })
    public static class LISTTRAVELLERREFERENCE
        implements Serializable
    {

        @XmlElement(name = "TRAVELLER_ID", required = true)
        protected BigInteger travellerid;
        @XmlElement(name = "SCOPE")
        protected String scope;

        /**
         * Gets the value of the travellerid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTRAVELLERID() {
            return travellerid;
        }

        /**
         * Sets the value of the travellerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTRAVELLERID(BigInteger value) {
            this.travellerid = value;
        }

        /**
         * Gets the value of the scope property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCOPE() {
            return scope;
        }

        /**
         * Sets the value of the scope property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCOPE(String value) {
            this.scope = value;
        }

    }

}
