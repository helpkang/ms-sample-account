
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
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
 *         &lt;element ref="{}LIST_STANDARD_RAIL_RULE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}OTHER_RAIL_RULES" minOccurs="0"/&gt;
 *         &lt;element name="DISPLAY_RULES" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ALWAYS_IN"/&gt;
 *               &lt;enumeration value="IN_AND_OUT"/&gt;
 *               &lt;enumeration value="OUT_IF_NO_IN"/&gt;
 *               &lt;enumeration value="OUT_FOR_MORE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "liststandardrailrule",
    "otherrailrules",
    "displayrules"
})
@XmlRootElement(name = "TRAIN_RULES")
public class TRAINRULES
    implements Serializable
{

    @XmlElement(name = "LIST_STANDARD_RAIL_RULE")
    protected List<LISTSTANDARDRAILRULE> liststandardrailrule;
    @XmlElement(name = "OTHER_RAIL_RULES")
    protected OTHERRAILRULES otherrailrules;
    @XmlElement(name = "DISPLAY_RULES")
    protected String displayrules;

    /**
     * Gets the value of the liststandardrailrule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststandardrailrule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTANDARDRAILRULE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSTANDARDRAILRULE }
     * 
     * 
     */
    public List<LISTSTANDARDRAILRULE> getLISTSTANDARDRAILRULE() {
        if (liststandardrailrule == null) {
            liststandardrailrule = new ArrayList<LISTSTANDARDRAILRULE>();
        }
        return this.liststandardrailrule;
    }

    /**
     * Gets the value of the otherrailrules property.
     * 
     * @return
     *     possible object is
     *     {@link OTHERRAILRULES }
     *     
     */
    public OTHERRAILRULES getOTHERRAILRULES() {
        return otherrailrules;
    }

    /**
     * Sets the value of the otherrailrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTHERRAILRULES }
     *     
     */
    public void setOTHERRAILRULES(OTHERRAILRULES value) {
        this.otherrailrules = value;
    }

    /**
     * Gets the value of the displayrules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYRULES() {
        return displayrules;
    }

    /**
     * Sets the value of the displayrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYRULES(String value) {
        this.displayrules = value;
    }

}
