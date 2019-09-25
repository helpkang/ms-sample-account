
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_PACKAGE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PACKAGE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PKG_ROOM" type="{}PKG_ROOM_TYPE" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_TOTAL_PRICE" type="{}AMOUNT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DUPE_PROPERTY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{}MARKUP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PACKAGE_TYPE", propOrder = {
    "listpkgroom",
    "listtotalprice",
    "dupepropertycode",
    "markup"
})
public class LISTPACKAGETYPE
    implements Serializable
{

    @XmlElement(name = "LIST_PKG_ROOM", required = true)
    protected List<PKGROOMTYPE> listpkgroom;
    @XmlElement(name = "LIST_TOTAL_PRICE")
    protected List<AMOUNTTYPE> listtotalprice;
    @XmlElement(name = "DUPE_PROPERTY_CODE")
    protected Object dupepropertycode;
    @XmlElement(name = "MARKUP")
    protected MARKUP markup;

    /**
     * Gets the value of the listpkgroom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpkgroom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPKGROOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PKGROOMTYPE }
     * 
     * 
     */
    public List<PKGROOMTYPE> getLISTPKGROOM() {
        if (listpkgroom == null) {
            listpkgroom = new ArrayList<PKGROOMTYPE>();
        }
        return this.listpkgroom;
    }

    /**
     * Gets the value of the listtotalprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtotalprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTOTALPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AMOUNTTYPE }
     * 
     * 
     */
    public List<AMOUNTTYPE> getLISTTOTALPRICE() {
        if (listtotalprice == null) {
            listtotalprice = new ArrayList<AMOUNTTYPE>();
        }
        return this.listtotalprice;
    }

    /**
     * Gets the value of the dupepropertycode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDUPEPROPERTYCODE() {
        return dupepropertycode;
    }

    /**
     * Sets the value of the dupepropertycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDUPEPROPERTYCODE(Object value) {
        this.dupepropertycode = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link MARKUP }
     *     
     */
    public MARKUP getMARKUP() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKUP }
     *     
     */
    public void setMARKUP(MARKUP value) {
        this.markup = value;
    }

}
