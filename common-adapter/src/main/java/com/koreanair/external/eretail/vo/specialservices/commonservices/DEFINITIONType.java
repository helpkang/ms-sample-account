
package com.koreanair.external.eretail.vo.specialservices.commonservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Configuration and display information.
 * 
 * <p>Java class for DEFINITION_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEFINITION_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ASSOCIATION_MODE" type="{}ASSOCIATION_MODE_TYPE" maxOccurs="unbounded"/&gt;
 *         &lt;element name="CATEGORY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{}CategoryGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SUB_CATEGORY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{}CategoryGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ICON_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEFINITION_type", propOrder = {
    "associationmode",
    "category",
    "subcategory",
    "priority",
    "name",
    "description",
    "iconid"
})
public class DEFINITIONType
    implements Serializable
{

    @XmlElement(name = "ASSOCIATION_MODE", required = true)
    protected List<ASSOCIATIONMODETYPE> associationmode;
    @XmlElement(name = "CATEGORY")
    protected DEFINITIONType.CATEGORY category;
    @XmlElement(name = "SUB_CATEGORY")
    protected DEFINITIONType.SUBCATEGORY subcategory;
    @XmlElement(name = "PRIORITY")
    protected String priority;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "ICON_ID")
    protected String iconid;

    /**
     * Gets the value of the associationmode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associationmode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getASSOCIATIONMODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ASSOCIATIONMODETYPE }
     * 
     * 
     */
    public List<ASSOCIATIONMODETYPE> getASSOCIATIONMODE() {
        if (associationmode == null) {
            associationmode = new ArrayList<ASSOCIATIONMODETYPE>();
        }
        return this.associationmode;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link DEFINITIONType.CATEGORY }
     *     
     */
    public DEFINITIONType.CATEGORY getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEFINITIONType.CATEGORY }
     *     
     */
    public void setCATEGORY(DEFINITIONType.CATEGORY value) {
        this.category = value;
    }

    /**
     * Gets the value of the subcategory property.
     * 
     * @return
     *     possible object is
     *     {@link DEFINITIONType.SUBCATEGORY }
     *     
     */
    public DEFINITIONType.SUBCATEGORY getSUBCATEGORY() {
        return subcategory;
    }

    /**
     * Sets the value of the subcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEFINITIONType.SUBCATEGORY }
     *     
     */
    public void setSUBCATEGORY(DEFINITIONType.SUBCATEGORY value) {
        this.subcategory = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIORITY(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the iconid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICONID() {
        return iconid;
    }

    /**
     * Sets the value of the iconid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICONID(String value) {
        this.iconid = value;
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
     *         &lt;group ref="{}CategoryGroup"/&gt;
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
        "name",
        "priority",
        "type",
        "description",
        "labelposition",
        "iconid"
    })
    public static class CATEGORY
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;
        @XmlElement(name = "PRIORITY")
        protected String priority;
        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "DESCRIPTION")
        protected String description;
        @XmlElement(name = "LABEL_POSITION")
        protected String labelposition;
        @XmlElement(name = "ICON_ID")
        protected String iconid;

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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRIORITY() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRIORITY(String value) {
            this.priority = value;
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

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the labelposition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLABELPOSITION() {
            return labelposition;
        }

        /**
         * Sets the value of the labelposition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLABELPOSITION(String value) {
            this.labelposition = value;
        }

        /**
         * Gets the value of the iconid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getICONID() {
            return iconid;
        }

        /**
         * Sets the value of the iconid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setICONID(String value) {
            this.iconid = value;
        }

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
     *         &lt;group ref="{}CategoryGroup"/&gt;
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
        "name",
        "priority",
        "type",
        "description",
        "labelposition",
        "iconid"
    })
    public static class SUBCATEGORY
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;
        @XmlElement(name = "PRIORITY")
        protected String priority;
        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "DESCRIPTION")
        protected String description;
        @XmlElement(name = "LABEL_POSITION")
        protected String labelposition;
        @XmlElement(name = "ICON_ID")
        protected String iconid;

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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRIORITY() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRIORITY(String value) {
            this.priority = value;
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

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the labelposition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLABELPOSITION() {
            return labelposition;
        }

        /**
         * Sets the value of the labelposition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLABELPOSITION(String value) {
            this.labelposition = value;
        }

        /**
         * Gets the value of the iconid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getICONID() {
            return iconid;
        }

        /**
         * Sets the value of the iconid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setICONID(String value) {
            this.iconid = value;
        }

    }

}
