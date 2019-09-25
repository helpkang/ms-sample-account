
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Some aggegators requires list of statistical fields ( preconfigured ) to be sent at the time of booking. These fields carry more information of booking being made
 * 
 * <p>Java class for AdditionalFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalFieldType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FIELD_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="POSSIBLE_VALUES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="INDEX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFieldType", propOrder = {
    "fieldname",
    "possiblevalues",
    "value",
    "type",
    "mandatory",
    "indexnumber"
})
public class AdditionalFieldType
    implements Serializable
{

    @XmlElement(name = "FIELD_NAME", required = true)
    protected String fieldname;
    @XmlElement(name = "POSSIBLE_VALUES")
    protected List<String> possiblevalues;
    @XmlElement(name = "VALUE")
    protected String value;
    @XmlElement(name = "TYPE")
    protected int type;
    @XmlElement(name = "MANDATORY")
    protected Boolean mandatory;
    @XmlElement(name = "INDEX_NUMBER")
    protected int indexnumber;

    /**
     * Gets the value of the fieldname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIELDNAME() {
        return fieldname;
    }

    /**
     * Sets the value of the fieldname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIELDNAME(String value) {
        this.fieldname = value;
    }

    /**
     * Gets the value of the possiblevalues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the possiblevalues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSSIBLEVALUES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPOSSIBLEVALUES() {
        if (possiblevalues == null) {
            possiblevalues = new ArrayList<String>();
        }
        return this.possiblevalues;
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
     */
    public int getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setTYPE(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMANDATORY() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMANDATORY(Boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the indexnumber property.
     * 
     */
    public int getINDEXNUMBER() {
        return indexnumber;
    }

    /**
     * Sets the value of the indexnumber property.
     * 
     */
    public void setINDEXNUMBER(int value) {
        this.indexnumber = value;
    }

}
