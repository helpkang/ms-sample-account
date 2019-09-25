
package com.koreanair.eretail.pojo.fare.commoninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ITINERARY_DirectFare_Decoded_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ITINERARY_DirectFare_Decoded_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ELEMENT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SEGMENT" type="{}LIST_SEGMENT_DirectFare_Decoded_Type" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="TYPE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="F"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "LIST_ITINERARY_DirectFare_Decoded_Type", propOrder = {
    "element"
})
public class LISTITINERARYDirectFareDecodedType
    implements Serializable
{

    @XmlElement(name = "ELEMENT", required = true)
    protected LISTITINERARYDirectFareDecodedType.ELEMENT element;

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link LISTITINERARYDirectFareDecodedType.ELEMENT }
     *     
     */
    public LISTITINERARYDirectFareDecodedType.ELEMENT getELEMENT() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTITINERARYDirectFareDecodedType.ELEMENT }
     *     
     */
    public void setELEMENT(LISTITINERARYDirectFareDecodedType.ELEMENT value) {
        this.element = value;
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
     *         &lt;element name="LIST_SEGMENT" type="{}LIST_SEGMENT_DirectFare_Decoded_Type" maxOccurs="unbounded"/&gt;
     *         &lt;element name="TYPE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="F"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
    @XmlType(name = "", propOrder = {
        "listsegment",
        "type"
    })
    public static class ELEMENT
        implements Serializable
    {

        @XmlElement(name = "LIST_SEGMENT", required = true)
        protected List<LISTSEGMENTDirectFareDecodedType> listsegment;
        @XmlElement(name = "TYPE", required = true)
        protected String type;

        /**
         * Gets the value of the listsegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEGMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTSEGMENTDirectFareDecodedType }
         * 
         * 
         */
        public List<LISTSEGMENTDirectFareDecodedType> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<LISTSEGMENTDirectFareDecodedType>();
            }
            return this.listsegment;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

    }

}
