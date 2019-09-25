
package com.koreanair.eretail.pojo.tripplan.common.common_permissions;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Permissions by office.
 * 
 * <p>Java class for LIST_PERMISSIONSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PERMISSIONSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PERMISSION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ALLOW_EOS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PERMISSIONSType", propOrder = {
    "officeid",
    "permission",
    "alloweos"
})
public class LISTPERMISSIONSType
    implements Serializable
{

    @XmlElement(name = "OFFICE_ID", required = true)
    protected String officeid;
    @XmlElement(name = "PERMISSION", required = true)
    protected String permission;
    @XmlElement(name = "ALLOW_EOS")
    protected Object alloweos;

    /**
     * Gets the value of the officeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFICEID() {
        return officeid;
    }

    /**
     * Sets the value of the officeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFICEID(String value) {
        this.officeid = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERMISSION() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERMISSION(String value) {
        this.permission = value;
    }

    /**
     * Gets the value of the alloweos property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getALLOWEOS() {
        return alloweos;
    }

    /**
     * Sets the value of the alloweos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setALLOWEOS(Object value) {
        this.alloweos = value;
    }

}
