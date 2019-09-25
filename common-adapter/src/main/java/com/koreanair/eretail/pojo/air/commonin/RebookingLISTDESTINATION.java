
package com.koreanair.eretail.pojo.air.commonin;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rebooking_LIST_DESTINATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rebooking_LIST_DESTINATION"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B_DATE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="B_REBOOK_REQUESTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rebooking_LIST_DESTINATION", propOrder = {
    "bdate",
    "brebookrequested"
})
public class RebookingLISTDESTINATION
    implements Serializable
{

    @XmlElement(name = "B_DATE", required = true)
    protected String bdate;
    @XmlElement(name = "B_REBOOK_REQUESTED")
    protected boolean brebookrequested;

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDATE(String value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the brebookrequested property.
     * 
     */
    public boolean isBREBOOKREQUESTED() {
        return brebookrequested;
    }

    /**
     * Sets the value of the brebookrequested property.
     * 
     */
    public void setBREBOOKREQUESTED(boolean value) {
        this.brebookrequested = value;
    }

}
