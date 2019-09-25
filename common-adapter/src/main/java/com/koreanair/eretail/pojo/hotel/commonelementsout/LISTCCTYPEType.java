
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CC accepted, and the CC fields to be provided
 * 
 * <p>Java class for LIST_CC_TYPE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_CC_TYPE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MOB_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CC_FIELD" type="{}LIST_CC_FIELDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_CC_TYPE_Type", propOrder = {
    "mobcode",
    "code",
    "name",
    "listccfield"
})
public class LISTCCTYPEType
    implements Serializable
{

    @XmlElement(name = "MOB_CODE")
    protected String mobcode;
    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "LIST_CC_FIELD")
    protected List<LISTCCFIELDType> listccfield;

    /**
     * Gets the value of the mobcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBCODE() {
        return mobcode;
    }

    /**
     * Sets the value of the mobcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBCODE(String value) {
        this.mobcode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the listccfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listccfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCCFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCCFIELDType }
     * 
     * 
     */
    public List<LISTCCFIELDType> getLISTCCFIELD() {
        if (listccfield == null) {
            listccfield = new ArrayList<LISTCCFIELDType>();
        }
        return this.listccfield;
    }

}
