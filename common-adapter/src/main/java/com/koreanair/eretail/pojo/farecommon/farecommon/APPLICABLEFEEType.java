
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APPLICABLE_FEE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APPLICABLE_FEE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}FEE_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_ADDITIONAL_INFO" type="{}FEE_ADDITIONAL_INFO_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HIDE_FEE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HIDE_IN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPLICABLE_FEE_Type", propOrder = {
    "listadditionalinfo",
    "hidefee",
    "hidein"
})
public class APPLICABLEFEEType
    extends FEEType
    implements Serializable
{

    @XmlElement(name = "LIST_ADDITIONAL_INFO")
    protected List<FEEADDITIONALINFOType> listadditionalinfo;
    @XmlElement(name = "HIDE_FEE")
    protected Boolean hidefee;
    @XmlElement(name = "HIDE_IN")
    protected Object hidein;

    /**
     * Gets the value of the listadditionalinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEEADDITIONALINFOType }
     * 
     * 
     */
    public List<FEEADDITIONALINFOType> getLISTADDITIONALINFO() {
        if (listadditionalinfo == null) {
            listadditionalinfo = new ArrayList<FEEADDITIONALINFOType>();
        }
        return this.listadditionalinfo;
    }

    /**
     * Gets the value of the hidefee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHIDEFEE() {
        return hidefee;
    }

    /**
     * Sets the value of the hidefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHIDEFEE(Boolean value) {
        this.hidefee = value;
    }

    /**
     * Gets the value of the hidein property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHIDEIN() {
        return hidein;
    }

    /**
     * Sets the value of the hidein property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHIDEIN(Object value) {
        this.hidein = value;
    }

}
