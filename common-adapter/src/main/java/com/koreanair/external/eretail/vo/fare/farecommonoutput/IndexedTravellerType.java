
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.DictionaryChoice;


/**
 * <p>Java class for IndexedTravellerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexedTravellerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
 *         &lt;element name="INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TRAVELLER_INDEX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}FIRST_NAME" minOccurs="0"/&gt;
 *             &lt;element ref="{}LAST_NAME" minOccurs="0"/&gt;
 *             &lt;element ref="{}TITLE" minOccurs="0"/&gt;
 *             &lt;element name="TRAVELLER_TYPE" type="{}DictionaryChoice" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexedTravellerType", propOrder = {
    "travellerid",
    "infant",
    "travellerindex",
    "firstname",
    "lastname",
    "title",
    "travellertype"
})
@XmlSeeAlso({
    com.koreanair.external.eretail.vo.fare.farecommonoutput.TicketImageType.LISTTRAVELLER.class
})
public class IndexedTravellerType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "INFANT")
    protected Boolean infant;
    @XmlElement(name = "TRAVELLER_INDEX")
    protected Integer travellerindex;
    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "TRAVELLER_TYPE")
    protected DictionaryChoice travellertype;

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
     * Gets the value of the infant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINFANT() {
        return infant;
    }

    /**
     * Sets the value of the infant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINFANT(Boolean value) {
        this.infant = value;
    }

    /**
     * Gets the value of the travellerindex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTRAVELLERINDEX() {
        return travellerindex;
    }

    /**
     * Sets the value of the travellerindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTRAVELLERINDEX(Integer value) {
        this.travellerindex = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTNAME(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTNAME(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryChoice }
     *     
     */
    public DictionaryChoice getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryChoice }
     *     
     */
    public void setTRAVELLERTYPE(DictionaryChoice value) {
        this.travellertype = value;
    }

}
