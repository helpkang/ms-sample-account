
package com.koreanair.external.eretail.vo.air.commonin;

import java.io.Serializable;
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
 *         &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="TRAVELLER_TYPE_AMOUNT" type="{}unprotectedStringType"/&gt;
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
    "travellertype",
    "travellertypeamount"
})
@XmlRootElement(name = "LIST_EXTERNAL_FARES")
public class LISTEXTERNALFARES
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_TYPE", required = true)
    protected String travellertype;
    @XmlElement(name = "TRAVELLER_TYPE_AMOUNT", required = true)
    protected String travellertypeamount;

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERTYPE(String value) {
        this.travellertype = value;
    }

    /**
     * Gets the value of the travellertypeamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERTYPEAMOUNT() {
        return travellertypeamount;
    }

    /**
     * Sets the value of the travellertypeamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERTYPEAMOUNT(String value) {
        this.travellertypeamount = value;
    }

}
