
package com.koreanair.external.eretail.vo.tripplan.external_provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODE_VALUE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODE_VALUE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{}CODE_NAME" minOccurs="0"/&gt;
 *         &lt;element name="LIST_VALUE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="DECODING_CONTEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "CODE_VALUE", propOrder = {
    "code",
    "listvalue"
})
public class CODEVALUE
    implements Serializable
{

    @XmlElement(name = "CODE")
    protected CODENAME code;
    @XmlElement(name = "LIST_VALUE")
    protected List<CODEVALUE.LISTVALUE> listvalue;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAME }
     *     
     */
    public CODENAME getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAME }
     *     
     */
    public void setCODE(CODENAME value) {
        this.code = value;
    }

    /**
     * Gets the value of the listvalue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listvalue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTVALUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CODEVALUE.LISTVALUE }
     * 
     * 
     */
    public List<CODEVALUE.LISTVALUE> getLISTVALUE() {
        if (listvalue == null) {
            listvalue = new ArrayList<CODEVALUE.LISTVALUE>();
        }
        return this.listvalue;
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
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="DECODING_CONTEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "value",
        "decodingcontext"
    })
    public static class LISTVALUE
        implements Serializable
    {

        @XmlElement(name = "VALUE", required = true)
        protected Object value;
        @XmlElement(name = "DECODING_CONTEXT")
        protected Object decodingcontext;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setVALUE(Object value) {
            this.value = value;
        }

        /**
         * Gets the value of the decodingcontext property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDECODINGCONTEXT() {
            return decodingcontext;
        }

        /**
         * Sets the value of the decodingcontext property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDECODINGCONTEXT(Object value) {
            this.decodingcontext = value;
        }

    }

}
