
package com.koreanair.external.eretail.vo.farecommon.farecontext;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.LISTTRAVELLERIDType;


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
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *           &lt;element name="SEGMENT_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="FARE_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_BREAK_POINT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{}LIST_TRAVELLER_ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="COMMERCIAL_FARE_FAMILY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    "segmentid",
    "segmentidentifier",
    "fareclass",
    "farebreakpoint",
    "listtravellerid",
    "commercialfarefamily"
})
@XmlRootElement(name = "LIST_FARE_CLASS")
public class LISTFARECLASS
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID")
    protected BigInteger segmentid;
    @XmlElement(name = "SEGMENT_IDENTIFIER")
    protected BigInteger segmentidentifier;
    @XmlElement(name = "FARE_CLASS")
    protected String fareclass;
    @XmlElement(name = "FARE_BREAK_POINT")
    protected String farebreakpoint;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<LISTTRAVELLERIDType> listtravellerid;
    @XmlElement(name = "COMMERCIAL_FARE_FAMILY")
    protected Object commercialfarefamily;

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTID(BigInteger value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the segmentidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTIDENTIFIER() {
        return segmentidentifier;
    }

    /**
     * Sets the value of the segmentidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTIDENTIFIER(BigInteger value) {
        this.segmentidentifier = value;
    }

    /**
     * Gets the value of the fareclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECLASS() {
        return fareclass;
    }

    /**
     * Sets the value of the fareclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECLASS(String value) {
        this.fareclass = value;
    }

    /**
     * Gets the value of the farebreakpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBREAKPOINT() {
        return farebreakpoint;
    }

    /**
     * Sets the value of the farebreakpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBREAKPOINT(String value) {
        this.farebreakpoint = value;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVELLERIDType }
     * 
     * 
     */
    public List<LISTTRAVELLERIDType> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<LISTTRAVELLERIDType>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the commercialfarefamily property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOMMERCIALFAREFAMILY() {
        return commercialfarefamily;
    }

    /**
     * Sets the value of the commercialfarefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOMMERCIALFAREFAMILY(Object value) {
        this.commercialfarefamily = value;
    }

}
