
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListRecommendationOrientedPanelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListRecommendationOrientedPanelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_TAB" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEARCH_DATA"/&gt;
 *         &lt;element name="TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="FP"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IS_LOADED_FROM_CACHE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LAST_UPDATED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListRecommendationOrientedPanelType", propOrder = {
    "listtab",
    "searchdata",
    "type",
    "boundid",
    "isloadedfromcache",
    "lastupdated"
})
public class ListRecommendationOrientedPanelType
    implements Serializable
{

    @XmlElement(name = "LIST_TAB")
    protected List<ListTabType> listtab;
    @XmlElement(name = "SEARCH_DATA", required = true)
    protected SearchDataType searchdata;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "BOUND_ID")
    protected BigInteger boundid;
    @XmlElement(name = "IS_LOADED_FROM_CACHE")
    protected Boolean isloadedfromcache;
    @XmlElement(name = "LAST_UPDATED")
    protected Boolean lastupdated;

    /**
     * There is no LIST_TAB in case of Dual Mode request when Upsell Panel returns no recommendations for pre-selected day.Gets the value of the listtab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTabType }
     * 
     * 
     */
    public List<ListTabType> getLISTTAB() {
        if (listtab == null) {
            listtab = new ArrayList<ListTabType>();
        }
        return this.listtab;
    }

    /**
     * Gets the value of the searchdata property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDataType }
     *     
     */
    public SearchDataType getSEARCHDATA() {
        return searchdata;
    }

    /**
     * Sets the value of the searchdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDataType }
     *     
     */
    public void setSEARCHDATA(SearchDataType value) {
        this.searchdata = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the boundid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBOUNDID() {
        return boundid;
    }

    /**
     * Sets the value of the boundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBOUNDID(BigInteger value) {
        this.boundid = value;
    }

    /**
     * Gets the value of the isloadedfromcache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISLOADEDFROMCACHE() {
        return isloadedfromcache;
    }

    /**
     * Sets the value of the isloadedfromcache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISLOADEDFROMCACHE(Boolean value) {
        this.isloadedfromcache = value;
    }

    /**
     * Gets the value of the lastupdated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLASTUPDATED() {
        return lastupdated;
    }

    /**
     * Sets the value of the lastupdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLASTUPDATED(Boolean value) {
        this.lastupdated = value;
    }

}
