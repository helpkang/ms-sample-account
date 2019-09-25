
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAIN_PREFERENCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAIN_PREFERENCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_CODE_Type"/&gt;
 *         &lt;element name="TRAIN_CABIN" type="{}TRAIN_CABIN_CODE_Type" minOccurs="0"/&gt;
 *         &lt;element name="RATE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RATE_SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NEGOTIATED_RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAIN_TYPE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="HIGH_SPEED"/&gt;
 *               &lt;enumeration value="INTER_CITY"/&gt;
 *               &lt;enumeration value="REGIONAL"/&gt;
 *               &lt;enumeration value="COMMUTER"/&gt;
 *               &lt;enumeration value="METRO"/&gt;
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
@XmlType(name = "TRAIN_PREFERENCE_Type", propOrder = {
    "traincompany",
    "traincabin",
    "ratetype",
    "ratesubtype",
    "negotiatedratecode",
    "listtraintype"
})
public class TRAINPREFERENCEType
    implements Serializable
{

    @XmlElement(name = "TRAIN_COMPANY", required = true)
    protected String traincompany;
    @XmlElement(name = "TRAIN_CABIN")
    protected String traincabin;
    @XmlElement(name = "RATE_TYPE")
    protected String ratetype;
    @XmlElement(name = "RATE_SUB_TYPE")
    protected String ratesubtype;
    @XmlElement(name = "NEGOTIATED_RATE_CODE")
    protected String negotiatedratecode;
    @XmlElement(name = "LIST_TRAIN_TYPE")
    protected List<String> listtraintype;

    /**
     * Gets the value of the traincompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAINCOMPANY() {
        return traincompany;
    }

    /**
     * Sets the value of the traincompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAINCOMPANY(String value) {
        this.traincompany = value;
    }

    /**
     * Gets the value of the traincabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAINCABIN() {
        return traincabin;
    }

    /**
     * Sets the value of the traincabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAINCABIN(String value) {
        this.traincabin = value;
    }

    /**
     * Gets the value of the ratetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATETYPE() {
        return ratetype;
    }

    /**
     * Sets the value of the ratetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATETYPE(String value) {
        this.ratetype = value;
    }

    /**
     * Gets the value of the ratesubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATESUBTYPE() {
        return ratesubtype;
    }

    /**
     * Sets the value of the ratesubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATESUBTYPE(String value) {
        this.ratesubtype = value;
    }

    /**
     * Gets the value of the negotiatedratecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEGOTIATEDRATECODE() {
        return negotiatedratecode;
    }

    /**
     * Sets the value of the negotiatedratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEGOTIATEDRATECODE(String value) {
        this.negotiatedratecode = value;
    }

    /**
     * Gets the value of the listtraintype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraintype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAINTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTTRAINTYPE() {
        if (listtraintype == null) {
            listtraintype = new ArrayList<String>();
        }
        return this.listtraintype;
    }

}
