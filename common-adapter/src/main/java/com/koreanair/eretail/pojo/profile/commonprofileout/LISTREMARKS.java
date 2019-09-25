
package com.koreanair.eretail.pojo.profile.commonprofileout;

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
 *         &lt;element ref="{}LIST_REMARK_FIELDS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="REMARK_USE_BY" type="{}unprotectedStringType"/&gt;
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
    "listremarkfields",
    "remarkuseby"
})
@XmlRootElement(name = "LIST_REMARKS")
public class LISTREMARKS
    implements Serializable
{

    @XmlElement(name = "LIST_REMARK_FIELDS")
    protected List<LISTREMARKFIELDS> listremarkfields;
    @XmlElement(name = "REMARK_USE_BY", required = true)
    protected String remarkuseby;

    /**
     * Gets the value of the listremarkfields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listremarkfields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREMARKFIELDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTREMARKFIELDS }
     * 
     * 
     */
    public List<LISTREMARKFIELDS> getLISTREMARKFIELDS() {
        if (listremarkfields == null) {
            listremarkfields = new ArrayList<LISTREMARKFIELDS>();
        }
        return this.listremarkfields;
    }

    /**
     * Gets the value of the remarkuseby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKUSEBY() {
        return remarkuseby;
    }

    /**
     * Sets the value of the remarkuseby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKUSEBY(String value) {
        this.remarkuseby = value;
    }

}
