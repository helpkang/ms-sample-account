
package com.koreanair.eretail.pojo.common.common;

import java.io.Serializable;
import java.math.BigInteger;
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
 *         &lt;element name="TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="F"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *               &lt;enumeration value="W"/&gt;
 *               &lt;enumeration value="I"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="O"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}SUBERROR_LIST" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUBERROR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PARSED_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_FORMAT_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}LIST_FIELD_ERROR" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "type",
    "suberrorlist",
    "number",
    "text",
    "suberror",
    "listfielderror"
})
@XmlRootElement(name = "LIST_MSG")
public class LISTMSG
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "SUBERROR_LIST")
    protected SUBERRORLIST suberrorlist;
    @XmlElement(name = "NUMBER", required = true)
    protected BigInteger number;
    @XmlElement(name = "TEXT")
    protected String text;
    @XmlElement(name = "SUBERROR")
    protected LISTMSG.SUBERROR suberror;
    @XmlElement(name = "LIST_FIELD_ERROR")
    protected List<String> listfielderror;

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
     * Gets the value of the suberrorlist property.
     * 
     * @return
     *     possible object is
     *     {@link SUBERRORLIST }
     *     
     */
    public SUBERRORLIST getSUBERRORLIST() {
        return suberrorlist;
    }

    /**
     * Sets the value of the suberrorlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBERRORLIST }
     *     
     */
    public void setSUBERRORLIST(SUBERRORLIST value) {
        this.suberrorlist = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBER(BigInteger value) {
        this.number = value;
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

    /**
     * Gets the value of the suberror property.
     * 
     * @return
     *     possible object is
     *     {@link LISTMSG.SUBERROR }
     *     
     */
    public LISTMSG.SUBERROR getSUBERROR() {
        return suberror;
    }

    /**
     * Sets the value of the suberror property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTMSG.SUBERROR }
     *     
     */
    public void setSUBERROR(LISTMSG.SUBERROR value) {
        this.suberror = value;
    }

    /**
     * Gets the value of the listfielderror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfielderror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFIELDERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFIELDERROR() {
        if (listfielderror == null) {
            listfielderror = new ArrayList<String>();
        }
        return this.listfielderror;
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
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PARSED_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_FORMAT_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "number",
        "type",
        "text",
        "parsedtext",
        "listformatparams"
    })
    public static class SUBERROR
        implements Serializable
    {

        @XmlElement(name = "NUMBER", required = true)
        protected BigInteger number;
        @XmlElement(name = "TYPE", required = true)
        protected BigInteger type;
        @XmlElement(name = "TEXT")
        protected String text;
        @XmlElement(name = "PARSED_TEXT")
        protected String parsedtext;
        @XmlElement(name = "LIST_FORMAT_PARAMS")
        protected List<String> listformatparams;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMBER(BigInteger value) {
            this.number = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTYPE(BigInteger value) {
            this.type = value;
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

        /**
         * Gets the value of the parsedtext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARSEDTEXT() {
            return parsedtext;
        }

        /**
         * Sets the value of the parsedtext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARSEDTEXT(String value) {
            this.parsedtext = value;
        }

        /**
         * Gets the value of the listformatparams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listformatparams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFORMATPARAMS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTFORMATPARAMS() {
            if (listformatparams == null) {
                listformatparams = new ArrayList<String>();
            }
            return this.listformatparams;
        }

    }

}
