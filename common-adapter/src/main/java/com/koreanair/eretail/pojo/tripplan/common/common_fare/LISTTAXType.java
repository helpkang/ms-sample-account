
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.payment.amountcommon.AMOUNTValueType;


/**
 * <p>Java class for LIST_TAXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TAXType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{}CODEType" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT" type="{}AMOUNTValueType"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_EXEMPTED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TAXType", propOrder = {
    "code",
    "amount",
    "status",
    "isexempted"
})
public class LISTTAXType
    implements Serializable
{

    @XmlElement(name = "CODE")
    protected CODEType code;
    @XmlElement(name = "AMOUNT", required = true)
    protected AMOUNTValueType amount;
    @XmlElement(name = "STATUS")
    protected Object status;
    @XmlElement(name = "IS_EXEMPTED")
    protected Object isexempted;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CODEType }
     *     
     */
    public CODEType getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODEType }
     *     
     */
    public void setCODE(CODEType value) {
        this.code = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setAMOUNT(AMOUNTValueType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSTATUS(Object value) {
        this.status = value;
    }

    /**
     * Gets the value of the isexempted property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISEXEMPTED() {
        return isexempted;
    }

    /**
     * Sets the value of the isexempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISEXEMPTED(Object value) {
        this.isexempted = value;
    }

}
