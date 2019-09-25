
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Hotel Multimedia Features
 * 
 * <p>Java class for MultimediaDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_CATEGORIES" type="{}MultimediaCategoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MULTIMEDIA" type="{}MultimediaInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaDetailsType", propOrder = {
    "listcategories",
    "multimedia"
})
public class MultimediaDetailsType
    implements Serializable
{

    @XmlElement(name = "LIST_CATEGORIES")
    protected List<MultimediaCategoryType> listcategories;
    @XmlElement(name = "MULTIMEDIA")
    protected MultimediaInformationType multimedia;

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
     * {@link MultimediaCategoryType }
     * 
     * 
     */
    public List<MultimediaCategoryType> getLISTCATEGORIES() {
        if (listcategories == null) {
            listcategories = new ArrayList<MultimediaCategoryType>();
        }
        return this.listcategories;
    }

    /**
     * Gets the value of the multimedia property.
     * 
     * @return
     *     possible object is
     *     {@link MultimediaInformationType }
     *     
     */
    public MultimediaInformationType getMULTIMEDIA() {
        return multimedia;
    }

    /**
     * Sets the value of the multimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaInformationType }
     *     
     */
    public void setMULTIMEDIA(MultimediaInformationType value) {
        this.multimedia = value;
    }

}
