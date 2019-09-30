//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.18 at 03:42:03 ���� KST 
//


package com.koreanair.external.altea.vo.docrefund_updaterefundreply_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This group will be used to convey all fop informations
 * 
 * <p>Java class for FOPRepresentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FOPRepresentationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formOfPaymentInformation" type="{http://xml.amadeus.com/TRFUUR_13_1_1A}FormOfPaymentTypeI"/>
 *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/TRFUUR_13_1_1A}InteractiveFreeTextType" maxOccurs="2"/>
 *         &lt;element name="formOfPaymentattribute" type="{http://xml.amadeus.com/TRFUUR_13_1_1A}CodedAttributeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOPRepresentationType", propOrder = {
    "formOfPaymentInformation",
    "interactiveFreeText",
    "formOfPaymentattribute"
})
public class FOPRepresentationType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI formOfPaymentInformation;
    @XmlElement(required = true)
    protected List<InteractiveFreeTextType> interactiveFreeText;
    protected CodedAttributeType formOfPaymentattribute;

    /**
     * Gets the value of the formOfPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public FormOfPaymentTypeI getFormOfPaymentInformation() {
        return formOfPaymentInformation;
    }

    /**
     * Sets the value of the formOfPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public void setFormOfPaymentInformation(FormOfPaymentTypeI value) {
        this.formOfPaymentInformation = value;
    }

    /**
     * Gets the value of the interactiveFreeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactiveFreeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractiveFreeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractiveFreeTextType }
     * 
     * 
     */
    public List<InteractiveFreeTextType> getInteractiveFreeText() {
        if (interactiveFreeText == null) {
            interactiveFreeText = new ArrayList<InteractiveFreeTextType>();
        }
        return this.interactiveFreeText;
    }

    /**
     * Gets the value of the formOfPaymentattribute property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getFormOfPaymentattribute() {
        return formOfPaymentattribute;
    }

    /**
     * Sets the value of the formOfPaymentattribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setFormOfPaymentattribute(CodedAttributeType value) {
        this.formOfPaymentattribute = value;
    }

}
