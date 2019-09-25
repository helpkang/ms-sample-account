
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LABEL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FORMAT_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_COMMANDS" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "id",
    "label",
    "value",
    "type",
    "formattype",
    "listcommands"
})
@XmlRootElement(name = "LIST_CUSTOM_FIELDS_INFORMATION")
public class LISTCUSTOMFIELDSINFORMATION
    implements Serializable
{

    @XmlElement(name = "ID")
    protected BigInteger id;
    @XmlElement(name = "LABEL")
    protected String label;
    @XmlElement(name = "VALUE")
    protected String value;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "FORMAT_TYPE")
    protected String formattype;
    @XmlElement(name = "LIST_COMMANDS")
    protected List<LISTCOMMANDS> listcommands;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABEL() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABEL(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUE(String value) {
        this.value = value;
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
     * Gets the value of the formattype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATTYPE() {
        return formattype;
    }

    /**
     * Sets the value of the formattype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATTYPE(String value) {
        this.formattype = value;
    }

    /**
     * Gets the value of the listcommands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcommands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMANDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCOMMANDS }
     * 
     * 
     */
    public List<LISTCOMMANDS> getLISTCOMMANDS() {
        if (listcommands == null) {
            listcommands = new ArrayList<LISTCOMMANDS>();
        }
        return this.listcommands;
    }

}
