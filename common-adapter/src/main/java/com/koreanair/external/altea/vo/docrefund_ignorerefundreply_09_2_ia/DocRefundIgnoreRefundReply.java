//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.18 at 03:42:33 ���� KST 
//


package com.koreanair.external.altea.vo.docrefund_ignorerefundreply_09_2_ia;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ignoreInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="actionRequest">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ignoreInformation"
})
@XmlRootElement(name = "DocRefund_IgnoreRefundReply")
public class DocRefundIgnoreRefundReply {

    @XmlElement(required = true)
    protected DocRefundIgnoreRefundReply.IgnoreInformation ignoreInformation;

    /**
     * Gets the value of the ignoreInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DocRefundIgnoreRefundReply.IgnoreInformation }
     *     
     */
    public DocRefundIgnoreRefundReply.IgnoreInformation getIgnoreInformation() {
        return ignoreInformation;
    }

    /**
     * Sets the value of the ignoreInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocRefundIgnoreRefundReply.IgnoreInformation }
     *     
     */
    public void setIgnoreInformation(DocRefundIgnoreRefundReply.IgnoreInformation value) {
        this.ignoreInformation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="actionRequest">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "actionRequest"
    })
    public static class IgnoreInformation {

        @XmlElement(required = true)
        protected String actionRequest;

        /**
         * Gets the value of the actionRequest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionRequest() {
            return actionRequest;
        }

        /**
         * Sets the value of the actionRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionRequest(String value) {
            this.actionRequest = value;
        }

    }

}
