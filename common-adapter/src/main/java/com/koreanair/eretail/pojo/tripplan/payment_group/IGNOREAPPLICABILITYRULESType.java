
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IGNORE_APPLICABILITY_RULES_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IGNORE_APPLICABILITY_RULES_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IGNORE_APPLICABILITY_RULES" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="REASON"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "IGNORE_APPLICABILITY_RULES_Type", propOrder = {
    "ignoreapplicabilityrules",
    "reason"
})
public class IGNOREAPPLICABILITYRULESType
    implements Serializable
{

    @XmlElement(name = "IGNORE_APPLICABILITY_RULES")
    protected boolean ignoreapplicabilityrules;
    @XmlElement(name = "REASON", required = true)
    protected IGNOREAPPLICABILITYRULESType.REASON reason;

    /**
     * Gets the value of the ignoreapplicabilityrules property.
     * 
     */
    public boolean isIGNOREAPPLICABILITYRULES() {
        return ignoreapplicabilityrules;
    }

    /**
     * Sets the value of the ignoreapplicabilityrules property.
     * 
     */
    public void setIGNOREAPPLICABILITYRULES(boolean value) {
        this.ignoreapplicabilityrules = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link IGNOREAPPLICABILITYRULESType.REASON }
     *     
     */
    public IGNOREAPPLICABILITYRULESType.REASON getREASON() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link IGNOREAPPLICABILITYRULESType.REASON }
     *     
     */
    public void setREASON(IGNOREAPPLICABILITYRULESType.REASON value) {
        this.reason = value;
    }


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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "code",
        "text"
    })
    public static class REASON
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "TEXT")
        protected String text;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTEXT() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTEXT(String value) {
            this.text = value;
        }

    }

}
