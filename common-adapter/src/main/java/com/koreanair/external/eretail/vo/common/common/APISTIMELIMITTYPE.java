
package com.koreanair.external.eretail.vo.common.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIS_TIME_LIMIT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIS_TIME_LIMIT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}APIS_TIME_LIMIT_DESCRIPTION_GROUP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIS_TIME_LIMIT_TYPE", propOrder = {
    "referencedate",
    "limitdate",
    "requirement",
    "timelimit",
    "segmentid",
    "direction"
})
public class APISTIMELIMITTYPE
    implements Serializable
{

    @XmlElement(name = "REFERENCE_DATE")
    protected Object referencedate;
    @XmlElement(name = "LIMIT_DATE")
    protected Object limitdate;
    @XmlElement(name = "REQUIREMENT")
    protected Object requirement;
    @XmlElement(name = "TIME_LIMIT")
    protected Object timelimit;
    @XmlElement(name = "SEGMENT_ID")
    protected Object segmentid;
    @XmlElement(name = "DIRECTION")
    protected Object direction;

    /**
     * Gets the value of the referencedate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREFERENCEDATE() {
        return referencedate;
    }

    /**
     * Sets the value of the referencedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREFERENCEDATE(Object value) {
        this.referencedate = value;
    }

    /**
     * Gets the value of the limitdate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLIMITDATE() {
        return limitdate;
    }

    /**
     * Sets the value of the limitdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLIMITDATE(Object value) {
        this.limitdate = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREQUIREMENT() {
        return requirement;
    }

    /**
     * Sets the value of the requirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREQUIREMENT(Object value) {
        this.requirement = value;
    }

    /**
     * Gets the value of the timelimit property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTIMELIMIT() {
        return timelimit;
    }

    /**
     * Sets the value of the timelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTIMELIMIT(Object value) {
        this.timelimit = value;
    }

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSEGMENTID(Object value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIRECTION() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIRECTION(Object value) {
        this.direction = value;
    }

}
