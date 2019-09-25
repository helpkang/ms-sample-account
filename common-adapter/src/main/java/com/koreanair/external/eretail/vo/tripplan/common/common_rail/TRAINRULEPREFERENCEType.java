
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAIN_RULE_PREFERENCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAIN_RULE_PREFERENCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_CODE_Type"/&gt;
 *         &lt;element ref="{}TRAIN_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}DISPLAY_RANK"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAIN_RULE_PREFERENCE_Type", propOrder = {
    "traincompany",
    "traintype",
    "displayrank"
})
public class TRAINRULEPREFERENCEType
    implements Serializable
{

    @XmlElement(name = "TRAIN_COMPANY", required = true)
    protected String traincompany;
    @XmlElement(name = "TRAIN_TYPE")
    protected String traintype;
    @XmlElement(name = "DISPLAY_RANK", required = true)
    protected String displayrank;

    /**
     * Gets the value of the traincompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAINCOMPANY() {
        return traincompany;
    }

    /**
     * Sets the value of the traincompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAINCOMPANY(String value) {
        this.traincompany = value;
    }

    /**
     * Gets the value of the traintype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAINTYPE() {
        return traintype;
    }

    /**
     * Sets the value of the traintype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAINTYPE(String value) {
        this.traintype = value;
    }

    /**
     * Gets the value of the displayrank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYRANK() {
        return displayrank;
    }

    /**
     * Sets the value of the displayrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYRANK(String value) {
        this.displayrank = value;
    }

}
