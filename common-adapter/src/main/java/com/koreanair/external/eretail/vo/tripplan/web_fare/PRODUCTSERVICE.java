
package com.koreanair.external.eretail.vo.tripplan.web_fare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRODUCT_SERVICE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRODUCT_SERVICE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IS_PER_PASSENGER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IS_MODIFIABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VALUE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_RANGE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="MIN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="MAX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "PRODUCT_SERVICE", propOrder = {
    "code",
    "isperpassenger",
    "ismandatory",
    "ismodifiable",
    "valuetype",
    "listrange"
})
public class PRODUCTSERVICE
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "IS_PER_PASSENGER")
    protected boolean isperpassenger;
    @XmlElement(name = "IS_MANDATORY")
    protected boolean ismandatory;
    @XmlElement(name = "IS_MODIFIABLE")
    protected Boolean ismodifiable;
    @XmlElement(name = "VALUE_TYPE", required = true)
    protected String valuetype;
    @XmlElement(name = "LIST_RANGE")
    protected List<PRODUCTSERVICE.LISTRANGE> listrange;

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
     * Gets the value of the isperpassenger property.
     * 
     */
    public boolean isISPERPASSENGER() {
        return isperpassenger;
    }

    /**
     * Sets the value of the isperpassenger property.
     * 
     */
    public void setISPERPASSENGER(boolean value) {
        this.isperpassenger = value;
    }

    /**
     * Gets the value of the ismandatory property.
     * 
     */
    public boolean isISMANDATORY() {
        return ismandatory;
    }

    /**
     * Sets the value of the ismandatory property.
     * 
     */
    public void setISMANDATORY(boolean value) {
        this.ismandatory = value;
    }

    /**
     * Gets the value of the ismodifiable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISMODIFIABLE() {
        return ismodifiable;
    }

    /**
     * Sets the value of the ismodifiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISMODIFIABLE(Boolean value) {
        this.ismodifiable = value;
    }

    /**
     * Gets the value of the valuetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUETYPE() {
        return valuetype;
    }

    /**
     * Sets the value of the valuetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUETYPE(String value) {
        this.valuetype = value;
    }

    /**
     * Gets the value of the listrange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRANGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRODUCTSERVICE.LISTRANGE }
     * 
     * 
     */
    public List<PRODUCTSERVICE.LISTRANGE> getLISTRANGE() {
        if (listrange == null) {
            listrange = new ArrayList<PRODUCTSERVICE.LISTRANGE>();
        }
        return this.listrange;
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
     *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="MIN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="MAX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "unit",
        "min",
        "max"
    })
    public static class LISTRANGE
        implements Serializable
    {

        @XmlElement(name = "UNIT", required = true)
        protected String unit;
        @XmlElement(name = "MIN")
        protected int min;
        @XmlElement(name = "MAX")
        protected int max;

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNIT() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNIT(String value) {
            this.unit = value;
        }

        /**
         * Gets the value of the min property.
         * 
         */
        public int getMIN() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         */
        public void setMIN(int value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         */
        public int getMAX() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         */
        public void setMAX(int value) {
            this.max = value;
        }

    }

}
