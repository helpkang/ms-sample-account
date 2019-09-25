
package com.koreanair.eretail.pojo.fare.farecommoninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Add Override Data Elements
 * 
 * <p>Java class for REASON_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REASON_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OVERRIDE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODE_DESCRIPTOR" type="{}CODE_DESCRIPTOR_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FREETEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REASON_type", propOrder = {
    "overridetype",
    "codedescriptor",
    "freetext"
})
public class REASONType
    implements Serializable
{

    @XmlElement(name = "OVERRIDE_TYPE", required = true)
    protected String overridetype;
    @XmlElement(name = "CODE_DESCRIPTOR")
    protected List<CODEDESCRIPTORType> codedescriptor;
    @XmlElement(name = "FREETEXT")
    protected String freetext;

    /**
     * Gets the value of the overridetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVERRIDETYPE() {
        return overridetype;
    }

    /**
     * Sets the value of the overridetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVERRIDETYPE(String value) {
        this.overridetype = value;
    }

    /**
     * Gets the value of the codedescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codedescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCODEDESCRIPTOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CODEDESCRIPTORType }
     * 
     * 
     */
    public List<CODEDESCRIPTORType> getCODEDESCRIPTOR() {
        if (codedescriptor == null) {
            codedescriptor = new ArrayList<CODEDESCRIPTORType>();
        }
        return this.codedescriptor;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXT() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXT(String value) {
        this.freetext = value;
    }

}
