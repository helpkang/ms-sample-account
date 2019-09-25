
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.LISTMSG;


/**
 *  Hotel Multimedia Features
 * 
 * <p>Java class for MULTIMEDIA_FEATURES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MULTIMEDIA_FEATURES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_CATEGORIES" type="{}HOTEL_FEATURES_CATEGORIES_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MULTIMEDIA" type="{}MULTIMEDIA_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MULTIMEDIA_FEATURES_TYPE", propOrder = {
    "listcategories",
    "listmsg",
    "multimedia"
})
public class MULTIMEDIAFEATURESTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_CATEGORIES")
    protected List<HOTELFEATURESCATEGORIESTYPE> listcategories;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "MULTIMEDIA")
    protected MULTIMEDIATYPE multimedia;

    /**
     * Gets the value of the listcategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCATEGORIES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOTELFEATURESCATEGORIESTYPE }
     * 
     * 
     */
    public List<HOTELFEATURESCATEGORIESTYPE> getLISTCATEGORIES() {
        if (listcategories == null) {
            listcategories = new ArrayList<HOTELFEATURESCATEGORIESTYPE>();
        }
        return this.listcategories;
    }

    /**
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }

    /**
     * Gets the value of the multimedia property.
     * 
     * @return
     *     possible object is
     *     {@link MULTIMEDIATYPE }
     *     
     */
    public MULTIMEDIATYPE getMULTIMEDIA() {
        return multimedia;
    }

    /**
     * Sets the value of the multimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIMEDIATYPE }
     *     
     */
    public void setMULTIMEDIA(MULTIMEDIATYPE value) {
        this.multimedia = value;
    }

}
