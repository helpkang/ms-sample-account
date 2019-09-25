
package com.koreanair.eretail.pojo.hotel.reservation.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PARSED_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FORMAT_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubErrorType", propOrder = {
    "number",
    "type",
    "text",
    "parsedtext",
    "listformatparams"
})
public class SubErrorType
    implements Serializable
{

    @XmlElement(name = "NUMBER", required = true)
    protected BigInteger number;
    @XmlElement(name = "TYPE", required = true)
    protected BigInteger type;
    @XmlElement(name = "TEXT")
    protected String text;
    @XmlElement(name = "PARSED_TEXT")
    protected String parsedtext;
    @XmlElement(name = "LIST_FORMAT_PARAMS")
    protected List<String> listformatparams;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPE(BigInteger value) {
        this.type = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXT() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXT(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the parsedtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARSEDTEXT() {
        return parsedtext;
    }

    /**
     * Sets the value of the parsedtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARSEDTEXT(String value) {
        this.parsedtext = value;
    }

    /**
     * Gets the value of the listformatparams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listformatparams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFORMATPARAMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFORMATPARAMS() {
        if (listformatparams == null) {
            listformatparams = new ArrayList<String>();
        }
        return this.listformatparams;
    }

}
