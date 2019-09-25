
package com.koreanair.eretail.pojo.hotel.hotelinputgroup;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REQUESTED_ROOM_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REQUESTED_ROOM_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ROW" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATED_TRAVELLER_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATED_TRAVELLER_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REQUESTED_ROOM_TYPE", propOrder = {
    "row",
    "number",
    "associatedtravellerfirstname",
    "associatedtravellerlastname"
})
public class REQUESTEDROOMTYPE
    implements Serializable
{

    @XmlElement(name = "ROW", required = true)
    protected BigInteger row;
    @XmlElement(name = "NUMBER")
    protected BigInteger number;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_FIRST_NAME")
    protected String associatedtravellerfirstname;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_LAST_NAME")
    protected String associatedtravellerlastname;

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getROW() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setROW(BigInteger value) {
        this.row = value;
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
     * Gets the value of the associatedtravellerfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSOCIATEDTRAVELLERFIRSTNAME() {
        return associatedtravellerfirstname;
    }

    /**
     * Sets the value of the associatedtravellerfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSOCIATEDTRAVELLERFIRSTNAME(String value) {
        this.associatedtravellerfirstname = value;
    }

    /**
     * Gets the value of the associatedtravellerlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSOCIATEDTRAVELLERLASTNAME() {
        return associatedtravellerlastname;
    }

    /**
     * Sets the value of the associatedtravellerlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSOCIATEDTRAVELLERLASTNAME(String value) {
        this.associatedtravellerlastname = value;
    }

}
