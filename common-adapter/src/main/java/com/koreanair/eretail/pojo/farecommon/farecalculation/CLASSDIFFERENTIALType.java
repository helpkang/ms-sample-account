
package com.koreanair.eretail.pojo.farecommon.farecalculation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.DictionaryChoice;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.DecodedLocationType;


/**
 * <p>Java class for CLASS_DIFFERENTIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLASS_DIFFERENTIAL_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMOUNT" type="{}AmountAsString_Type"/&gt;
 *         &lt;element name="CURRENCY" type="{}DictionaryChoice" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{}FROM_TO_Pair"/&gt;
 *           &lt;group ref="{}Decoded_From_To_Group"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LIST_IATA_CHECK" type="{}IATA_CHECK_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLASS_DIFFERENTIAL_Type", propOrder = {
    "amount",
    "currency",
    "from",
    "to",
    "blocation",
    "elocation",
    "listiatacheck"
})
public class CLASSDIFFERENTIALType
    implements Serializable
{

    @XmlElement(name = "AMOUNT", required = true)
    protected String amount;
    @XmlElement(name = "CURRENCY")
    protected DictionaryChoice currency;
    @XmlElement(name = "FROM")
    protected String from;
    @XmlElement(name = "TO")
    protected String to;
    @XmlElement(name = "B_LOCATION")
    protected DecodedLocationType blocation;
    @XmlElement(name = "E_LOCATION")
    protected DecodedLocationType elocation;
    @XmlElement(name = "LIST_IATA_CHECK")
    protected List<IATACHECKType> listiatacheck;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNT(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryChoice }
     *     
     */
    public DictionaryChoice getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryChoice }
     *     
     */
    public void setCURRENCY(DictionaryChoice value) {
        this.currency = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROM() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROM(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTO() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTO(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link DecodedLocationType }
     *     
     */
    public DecodedLocationType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecodedLocationType }
     *     
     */
    public void setBLOCATION(DecodedLocationType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link DecodedLocationType }
     *     
     */
    public DecodedLocationType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecodedLocationType }
     *     
     */
    public void setELOCATION(DecodedLocationType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the listiatacheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listiatacheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTIATACHECK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IATACHECKType }
     * 
     * 
     */
    public List<IATACHECKType> getLISTIATACHECK() {
        if (listiatacheck == null) {
            listiatacheck = new ArrayList<IATACHECKType>();
        }
        return this.listiatacheck;
    }

}
