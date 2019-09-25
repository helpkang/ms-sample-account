
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional luggage information  
 * 
 * <p>Java class for LUGGAGE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LUGGAGE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="LUGGAGE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LUGGAGE_TYPE" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="WEIGHT" type="{}WEIGHT_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="DIMENSION" type="{}DIMENSION_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LUGGAGE_type", propOrder = {

})
public class LUGGAGEType
    implements Serializable
{

    @XmlElement(name = "LUGGAGE_ID")
    protected Object luggageid;
    @XmlElement(name = "INDEX")
    protected BigInteger index;
    @XmlElement(name = "LUGGAGE_TYPE")
    protected CODENAMEPAIRTYPE luggagetype;
    @XmlElement(name = "NUMBER")
    protected BigInteger number;
    @XmlElement(name = "WEIGHT")
    protected WEIGHTTYPEPROFILE weight;
    @XmlElement(name = "DIMENSION")
    protected DIMENSIONTYPEPROFILE dimension;
    @XmlElement(name = "STATUS")
    protected CODENAMEPAIRTYPE status;

    /**
     * Gets the value of the luggageid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLUGGAGEID() {
        return luggageid;
    }

    /**
     * Sets the value of the luggageid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLUGGAGEID(Object value) {
        this.luggageid = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINDEX() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINDEX(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the luggagetype property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getLUGGAGETYPE() {
        return luggagetype;
    }

    /**
     * Sets the value of the luggagetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setLUGGAGETYPE(CODENAMEPAIRTYPE value) {
        this.luggagetype = value;
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
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link WEIGHTTYPEPROFILE }
     *     
     */
    public WEIGHTTYPEPROFILE getWEIGHT() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEIGHTTYPEPROFILE }
     *     
     */
    public void setWEIGHT(WEIGHTTYPEPROFILE value) {
        this.weight = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link DIMENSIONTYPEPROFILE }
     *     
     */
    public DIMENSIONTYPEPROFILE getDIMENSION() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIMENSIONTYPEPROFILE }
     *     
     */
    public void setDIMENSION(DIMENSIONTYPEPROFILE value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setSTATUS(CODENAMEPAIRTYPE value) {
        this.status = value;
    }

}
