
package com.koreanair.eretail.pojo.common.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element allows the override of site parameters without the need of calling the Override Action
 * 
 * <p>Java class for LIST_AVAILABILITY_OPTIONS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_AVAILABILITY_OPTIONS_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ALLOW_WAITLIST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ALLOW_MARRIED_SEGMENT_BREAK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_AVAILABILITY_OPTIONS_Type", propOrder = {
    "allowwaitlist",
    "allowmarriedsegmentbreak",
    "checkavailability"
})
public class LISTAVAILABILITYOPTIONSType
    implements Serializable
{

    @XmlElement(name = "ALLOW_WAITLIST")
    protected Boolean allowwaitlist;
    @XmlElement(name = "ALLOW_MARRIED_SEGMENT_BREAK")
    protected Boolean allowmarriedsegmentbreak;
    @XmlElement(name = "CHECK_AVAILABILITY")
    protected Boolean checkavailability;

    /**
     * Gets the value of the allowwaitlist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWWAITLIST() {
        return allowwaitlist;
    }

    /**
     * Sets the value of the allowwaitlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWWAITLIST(Boolean value) {
        this.allowwaitlist = value;
    }

    /**
     * Gets the value of the allowmarriedsegmentbreak property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWMARRIEDSEGMENTBREAK() {
        return allowmarriedsegmentbreak;
    }

    /**
     * Sets the value of the allowmarriedsegmentbreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWMARRIEDSEGMENTBREAK(Boolean value) {
        this.allowmarriedsegmentbreak = value;
    }

    /**
     * Gets the value of the checkavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCHECKAVAILABILITY() {
        return checkavailability;
    }

    /**
     * Sets the value of the checkavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCHECKAVAILABILITY(Boolean value) {
        this.checkavailability = value;
    }

}
