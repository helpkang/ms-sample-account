
package com.koreanair.eretail.pojo.tripplan.common.common_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRIMARY_DOCUMENT_NUMBER" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_DOC_NUMBER_IN_CONJUNCTION" type="{}unprotectedStringType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER" type="{}EMD_TRAVELLERType" minOccurs="0"/&gt;
 *         &lt;element name="GENERAL" type="{}EMD_GENERALType" minOccurs="0"/&gt;
 *         &lt;element name="FARE" type="{}EMD_FAREType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_COUPON" type="{}EMD_LIST_COUPONType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMDType", propOrder = {
    "primarydocumentnumber",
    "listdocnumberinconjunction",
    "traveller",
    "general",
    "fare",
    "listcoupon"
})
public class EMDType
    implements Serializable
{

    @XmlElement(name = "PRIMARY_DOCUMENT_NUMBER", required = true)
    protected String primarydocumentnumber;
    @XmlElement(name = "LIST_DOC_NUMBER_IN_CONJUNCTION")
    protected List<String> listdocnumberinconjunction;
    @XmlElement(name = "TRAVELLER")
    protected EMDTRAVELLERType traveller;
    @XmlElement(name = "GENERAL")
    protected EMDGENERALType general;
    @XmlElement(name = "FARE")
    protected EMDFAREType fare;
    @XmlElement(name = "LIST_COUPON")
    protected List<EMDLISTCOUPONType> listcoupon;

    /**
     * Gets the value of the primarydocumentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMARYDOCUMENTNUMBER() {
        return primarydocumentnumber;
    }

    /**
     * Sets the value of the primarydocumentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMARYDOCUMENTNUMBER(String value) {
        this.primarydocumentnumber = value;
    }

    /**
     * Gets the value of the listdocnumberinconjunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdocnumberinconjunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDOCNUMBERINCONJUNCTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTDOCNUMBERINCONJUNCTION() {
        if (listdocnumberinconjunction == null) {
            listdocnumberinconjunction = new ArrayList<String>();
        }
        return this.listdocnumberinconjunction;
    }

    /**
     * Gets the value of the traveller property.
     * 
     * @return
     *     possible object is
     *     {@link EMDTRAVELLERType }
     *     
     */
    public EMDTRAVELLERType getTRAVELLER() {
        return traveller;
    }

    /**
     * Sets the value of the traveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDTRAVELLERType }
     *     
     */
    public void setTRAVELLER(EMDTRAVELLERType value) {
        this.traveller = value;
    }

    /**
     * Gets the value of the general property.
     * 
     * @return
     *     possible object is
     *     {@link EMDGENERALType }
     *     
     */
    public EMDGENERALType getGENERAL() {
        return general;
    }

    /**
     * Sets the value of the general property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDGENERALType }
     *     
     */
    public void setGENERAL(EMDGENERALType value) {
        this.general = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link EMDFAREType }
     *     
     */
    public EMDFAREType getFARE() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDFAREType }
     *     
     */
    public void setFARE(EMDFAREType value) {
        this.fare = value;
    }

    /**
     * Gets the value of the listcoupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcoupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOUPON().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDLISTCOUPONType }
     * 
     * 
     */
    public List<EMDLISTCOUPONType> getLISTCOUPON() {
        if (listcoupon == null) {
            listcoupon = new ArrayList<EMDLISTCOUPONType>();
        }
        return this.listcoupon;
    }

}
