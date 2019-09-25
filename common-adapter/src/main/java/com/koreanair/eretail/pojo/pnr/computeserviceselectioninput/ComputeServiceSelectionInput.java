
package com.koreanair.eretail.pojo.pnr.computeserviceselectioninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.specialservices.commonservices.SERVICEInput;


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
 *         &lt;element ref="{}IS_STRUCTURED_XML" minOccurs="0"/&gt;
 *         &lt;element name="TRANSACTION_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="SITE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LANGUAGE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="FROM_PAX" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICE" type="{}SERVICE_input" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="COMMIT_SERVICES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKIP_TRAV_VALIDATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_OPTION" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KEEP_INCOMPLETE_PACK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isstructuredxml",
    "transactionid",
    "site",
    "language",
    "type",
    "frompax",
    "listservice",
    "commitservices",
    "skiptravvalidation",
    "listoption",
    "keepincompletepack"
})
@XmlRootElement(name = "ComputeServiceSelectionInput")
public class ComputeServiceSelectionInput
    implements Serializable
{

    @XmlElement(name = "IS_STRUCTURED_XML")
    protected String isstructuredxml;
    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "FROM_PAX")
    protected Boolean frompax;
    @XmlElement(name = "LIST_SERVICE")
    protected List<SERVICEInput> listservice;
    @XmlElement(name = "COMMIT_SERVICES")
    protected Boolean commitservices;
    @XmlElement(name = "SKIP_TRAV_VALIDATION")
    protected Boolean skiptravvalidation;
    @XmlElement(name = "LIST_OPTION")
    protected List<String> listoption;
    @XmlElement(name = "KEEP_INCOMPLETE_PACK")
    protected Boolean keepincompletepack;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the isstructuredxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSTRUCTUREDXML() {
        return isstructuredxml;
    }

    /**
     * Sets the value of the isstructuredxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSTRUCTUREDXML(String value) {
        this.isstructuredxml = value;
    }

    /**
     * Gets the value of the transactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONID() {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONID(String value) {
        this.transactionid = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITE() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITE(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
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
     * Gets the value of the frompax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFROMPAX() {
        return frompax;
    }

    /**
     * Sets the value of the frompax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFROMPAX(Boolean value) {
        this.frompax = value;
    }

    /**
     * Gets the value of the listservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICEInput }
     * 
     * 
     */
    public List<SERVICEInput> getLISTSERVICE() {
        if (listservice == null) {
            listservice = new ArrayList<SERVICEInput>();
        }
        return this.listservice;
    }

    /**
     * Gets the value of the commitservices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCOMMITSERVICES() {
        return commitservices;
    }

    /**
     * Sets the value of the commitservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCOMMITSERVICES(Boolean value) {
        this.commitservices = value;
    }

    /**
     * Gets the value of the skiptravvalidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKIPTRAVVALIDATION() {
        return skiptravvalidation;
    }

    /**
     * Sets the value of the skiptravvalidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKIPTRAVVALIDATION(Boolean value) {
        this.skiptravvalidation = value;
    }

    /**
     * Gets the value of the listoption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listoption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTOPTION() {
        if (listoption == null) {
            listoption = new ArrayList<String>();
        }
        return this.listoption;
    }

    /**
     * Gets the value of the keepincompletepack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKEEPINCOMPLETEPACK() {
        return keepincompletepack;
    }

    /**
     * Sets the value of the keepincompletepack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKEEPINCOMPLETEPACK(Boolean value) {
        this.keepincompletepack = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
