
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Standard Train Rule definition returned by Rule engine
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}RULE_ID"/&gt;
 *         &lt;element name="TRAIN_CABIN" type="{}TRAIN_CABIN_CODE_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAIN_PREFERENCE" type="{}TRAIN_RULE_PREFERENCE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FARING_DETAIL" type="{}FARING_DETAIL_Type" minOccurs="0"/&gt;
 *         &lt;element name="SPECIFY_MAX_AMOUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Y"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *               &lt;enumeration value="G"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MAX_PRICE" type="{}MAX_PRICE_Type" minOccurs="0"/&gt;
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
    "ruleid",
    "traincabin",
    "listtrainpreference",
    "faringdetail",
    "specifymaxamount",
    "maxprice"
})
@XmlRootElement(name = "LIST_STANDARD_RAIL_RULE")
public class LISTSTANDARDRAILRULE
    implements Serializable
{

    @XmlElement(name = "RULE_ID", required = true)
    protected String ruleid;
    @XmlElement(name = "TRAIN_CABIN")
    protected String traincabin;
    @XmlElement(name = "LIST_TRAIN_PREFERENCE")
    protected List<TRAINRULEPREFERENCEType> listtrainpreference;
    @XmlElement(name = "FARING_DETAIL")
    protected FARINGDETAILType faringdetail;
    @XmlElement(name = "SPECIFY_MAX_AMOUNT")
    protected String specifymaxamount;
    @XmlElement(name = "MAX_PRICE")
    protected MAXPRICEType maxprice;

    /**
     * Gets the value of the ruleid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRULEID() {
        return ruleid;
    }

    /**
     * Sets the value of the ruleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRULEID(String value) {
        this.ruleid = value;
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
     * Gets the value of the listtrainpreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtrainpreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAINPREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAINRULEPREFERENCEType }
     * 
     * 
     */
    public List<TRAINRULEPREFERENCEType> getLISTTRAINPREFERENCE() {
        if (listtrainpreference == null) {
            listtrainpreference = new ArrayList<TRAINRULEPREFERENCEType>();
        }
        return this.listtrainpreference;
    }

    /**
     * Gets the value of the faringdetail property.
     * 
     * @return
     *     possible object is
     *     {@link FARINGDETAILType }
     *     
     */
    public FARINGDETAILType getFARINGDETAIL() {
        return faringdetail;
    }

    /**
     * Sets the value of the faringdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARINGDETAILType }
     *     
     */
    public void setFARINGDETAIL(FARINGDETAILType value) {
        this.faringdetail = value;
    }

    /**
     * Gets the value of the specifymaxamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPECIFYMAXAMOUNT() {
        return specifymaxamount;
    }

    /**
     * Sets the value of the specifymaxamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPECIFYMAXAMOUNT(String value) {
        this.specifymaxamount = value;
    }

    /**
     * Gets the value of the maxprice property.
     * 
     * @return
     *     possible object is
     *     {@link MAXPRICEType }
     *     
     */
    public MAXPRICEType getMAXPRICE() {
        return maxprice;
    }

    /**
     * Sets the value of the maxprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MAXPRICEType }
     *     
     */
    public void setMAXPRICE(MAXPRICEType value) {
        this.maxprice = value;
    }

}
