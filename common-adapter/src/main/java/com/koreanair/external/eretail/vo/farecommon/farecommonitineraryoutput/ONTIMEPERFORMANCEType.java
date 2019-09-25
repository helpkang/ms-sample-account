
package com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Display OnTimePerformance.
 * 
 * <p>Java class for ON_TIME_PERFORMANCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ON_TIME_PERFORMANCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE_TIME_PERIOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCURACY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ON_TIME_PERFORMANCE_Type", propOrder = {
    "datetimeperiod",
    "percentage",
    "accuracy"
})
public class ONTIMEPERFORMANCEType
    implements Serializable
{

    @XmlElement(name = "DATE_TIME_PERIOD")
    protected String datetimeperiod;
    @XmlElement(name = "PERCENTAGE")
    protected String percentage;
    @XmlElement(name = "ACCURACY")
    protected String accuracy;

    /**
     * Gets the value of the datetimeperiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATETIMEPERIOD() {
        return datetimeperiod;
    }

    /**
     * Sets the value of the datetimeperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATETIMEPERIOD(String value) {
        this.datetimeperiod = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCENTAGE() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCENTAGE(String value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCURACY() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCURACY(String value) {
        this.accuracy = value;
    }

}
