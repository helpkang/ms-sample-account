
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ASYNC_REFERENCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASYNC_REFERENCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BASE_URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LIST_POST_DATA" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASYNC_REFERENCE_Type", propOrder = {
    "url",
    "id"
})
public class ASYNCREFERENCEType
    implements Serializable
{

    @XmlElement(name = "URL")
    protected ASYNCREFERENCEType.URL url;
    @XmlElement(name = "ID")
    protected String id;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link ASYNCREFERENCEType.URL }
     *     
     */
    public ASYNCREFERENCEType.URL getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASYNCREFERENCEType.URL }
     *     
     */
    public void setURL(ASYNCREFERENCEType.URL value) {
        this.url = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     *         &lt;element name="BASE_URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LIST_POST_DATA" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "baseurl",
        "listpostdata"
    })
    public static class URL
        implements Serializable
    {

        @XmlElement(name = "BASE_URL", required = true)
        protected String baseurl;
        @XmlElement(name = "LIST_POST_DATA")
        protected List<ASYNCREFERENCEType.URL.LISTPOSTDATA> listpostdata;

        /**
         * Gets the value of the baseurl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBASEURL() {
            return baseurl;
        }

        /**
         * Sets the value of the baseurl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBASEURL(String value) {
            this.baseurl = value;
        }

        /**
         * Gets the value of the listpostdata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpostdata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPOSTDATA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ASYNCREFERENCEType.URL.LISTPOSTDATA }
         * 
         * 
         */
        public List<ASYNCREFERENCEType.URL.LISTPOSTDATA> getLISTPOSTDATA() {
            if (listpostdata == null) {
                listpostdata = new ArrayList<ASYNCREFERENCEType.URL.LISTPOSTDATA>();
            }
            return this.listpostdata;
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
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "name",
            "value"
        })
        public static class LISTPOSTDATA
            implements Serializable
        {

            @XmlElement(name = "NAME", required = true)
            protected String name;
            @XmlElement(name = "VALUE", required = true)
            protected String value;

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
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUE() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVALUE(String value) {
                this.value = value;
            }

        }

    }

}
