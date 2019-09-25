
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REMARK_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="REMARK_TEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_OFFICES" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "remarkid",
    "remarktext",
    "type",
    "category",
    "listoffices"
})
@XmlRootElement(name = "LIST_REMARK_FIELDS")
public class LISTREMARKFIELDS
    implements Serializable
{

    @XmlElement(name = "REMARK_ID", required = true)
    protected String remarkid;
    @XmlElement(name = "REMARK_TEXT")
    protected Object remarktext;
    @XmlElement(name = "TYPE")
    protected Object type;
    @XmlElement(name = "CATEGORY")
    protected Object category;
    @XmlElement(name = "LIST_OFFICES")
    protected List<LISTREMARKFIELDS.LISTOFFICES> listoffices;

    /**
     * Gets the value of the remarkid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKID() {
        return remarkid;
    }

    /**
     * Sets the value of the remarkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKID(String value) {
        this.remarkid = value;
    }

    /**
     * Gets the value of the remarktext property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREMARKTEXT() {
        return remarktext;
    }

    /**
     * Sets the value of the remarktext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREMARKTEXT(Object value) {
        this.remarktext = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTYPE(Object value) {
        this.type = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCATEGORY(Object value) {
        this.category = value;
    }

    /**
     * Gets the value of the listoffices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listoffices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOFFICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTREMARKFIELDS.LISTOFFICES }
     * 
     * 
     */
    public List<LISTREMARKFIELDS.LISTOFFICES> getLISTOFFICES() {
        if (listoffices == null) {
            listoffices = new ArrayList<LISTREMARKFIELDS.LISTOFFICES>();
        }
        return this.listoffices;
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
     *         &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "officeid"
    })
    public static class LISTOFFICES
        implements Serializable
    {

        @XmlElement(name = "OFFICE_ID")
        protected Object officeid;

        /**
         * Gets the value of the officeid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOFFICEID() {
            return officeid;
        }

        /**
         * Sets the value of the officeid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOFFICEID(Object value) {
            this.officeid = value;
        }

    }

}
