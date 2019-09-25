
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CR 1901873 the promotion container used to bear promotion codes in fare output
 * 
 * <p>Java class for PROMOTION_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROMOTION_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROMOTION_CODE" type="{}LIST_PROMOTION_CODE_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROMOTION_type", propOrder = {
    "type",
    "promotioncode"
})
public class PROMOTIONType
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "PROMOTION_CODE")
    protected List<LISTPROMOTIONCODEType> promotioncode;

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
     * Gets the value of the promotioncode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotioncode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROMOTIONCODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPROMOTIONCODEType }
     * 
     * 
     */
    public List<LISTPROMOTIONCODEType> getPROMOTIONCODE() {
        if (promotioncode == null) {
            promotioncode = new ArrayList<LISTPROMOTIONCODEType>();
        }
        return this.promotioncode;
    }

}
