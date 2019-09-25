
package com.koreanair.eretail.pojo.tripplan.common.common_tr;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrReferenceType;


/**
 * <p>Java class for trBaseElementsIDsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trBaseElementsIDsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TECHNICAL_IDS" type="{}trTechnicalIdsType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_REFERENCES" type="{}etrReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INITIAL_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DELETED_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trBaseElementsIDsType", propOrder = {
    "itemid",
    "technicalids",
    "listreferences",
    "initialelement",
    "deletedelement"
})
@XmlSeeAlso({
    TrBaseElementsType.class
})
public class TrBaseElementsIDsType
    implements Serializable
{

    @XmlElement(name = "ITEM_ID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemid;
    @XmlElement(name = "TECHNICAL_IDS")
    protected TrTechnicalIdsType technicalids;
    @XmlElement(name = "LIST_REFERENCES")
    protected List<EtrReferenceType> listreferences;
    @XmlElement(name = "INITIAL_ELEMENT")
    protected Boolean initialelement;
    @XmlElement(name = "DELETED_ELEMENT")
    protected Boolean deletedelement;

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the technicalids property.
     * 
     * @return
     *     possible object is
     *     {@link TrTechnicalIdsType }
     *     
     */
    public TrTechnicalIdsType getTECHNICALIDS() {
        return technicalids;
    }

    /**
     * Sets the value of the technicalids property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrTechnicalIdsType }
     *     
     */
    public void setTECHNICALIDS(TrTechnicalIdsType value) {
        this.technicalids = value;
    }

    /**
     * Gets the value of the listreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREFERENCES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtrReferenceType }
     * 
     * 
     */
    public List<EtrReferenceType> getLISTREFERENCES() {
        if (listreferences == null) {
            listreferences = new ArrayList<EtrReferenceType>();
        }
        return this.listreferences;
    }

    /**
     * Gets the value of the initialelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINITIALELEMENT() {
        return initialelement;
    }

    /**
     * Sets the value of the initialelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINITIALELEMENT(Boolean value) {
        this.initialelement = value;
    }

    /**
     * Gets the value of the deletedelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDELETEDELEMENT() {
        return deletedelement;
    }

    /**
     * Sets the value of the deletedelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDELETEDELEMENT(Boolean value) {
        this.deletedelement = value;
    }

}
