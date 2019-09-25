
package com.koreanair.external.eretail.vo.tripplan.common.common_tr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.OutputDateType;


/**
 * date type with time window
 * 
 * <p>Java class for trDateWindow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trDateWindow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="TIME_WINDOW" type="{}trAlphaNumericType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trDateWindow", propOrder = {
    "date",
    "timewindow"
})
public class TrDateWindow
    implements Serializable
{

    @XmlElement(name = "DATE")
    protected OutputDateType date;
    @XmlElement(name = "TIME_WINDOW", required = true)
    protected String timewindow;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getDATE() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setDATE(OutputDateType value) {
        this.date = value;
    }

    /**
     * Gets the value of the timewindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMEWINDOW() {
        return timewindow;
    }

    /**
     * Sets the value of the timewindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMEWINDOW(String value) {
        this.timewindow = value;
    }

}
