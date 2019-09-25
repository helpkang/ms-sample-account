
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the rate per category (ex. room quality, location, etc.)
 * 
 * <p>Java class for CATEGORY_RATING_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CATEGORY_RATING_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CATEGORY" type="{}RATING_CATEGORY_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="RATING" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LIST_QUESTION" type="{}QUESTION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATEGORY_RATING_TYPE", propOrder = {
    "category",
    "rating",
    "listquestion"
})
public class CATEGORYRATINGTYPE
    implements Serializable
{

    @XmlElement(name = "CATEGORY")
    protected RATINGCATEGORYTYPE category;
    @XmlElement(name = "RATING")
    protected Double rating;
    @XmlElement(name = "LIST_QUESTION")
    protected List<QUESTIONTYPE> listquestion;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link RATINGCATEGORYTYPE }
     *     
     */
    public RATINGCATEGORYTYPE getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link RATINGCATEGORYTYPE }
     *     
     */
    public void setCATEGORY(RATINGCATEGORYTYPE value) {
        this.category = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRATING() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRATING(Double value) {
        this.rating = value;
    }

    /**
     * Gets the value of the listquestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listquestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTQUESTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QUESTIONTYPE }
     * 
     * 
     */
    public List<QUESTIONTYPE> getLISTQUESTION() {
        if (listquestion == null) {
            listquestion = new ArrayList<QUESTIONTYPE>();
        }
        return this.listquestion;
    }

}
