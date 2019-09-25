
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Question containing a question, list of answer, rating. It's not possible to get both answer and rating
 * 
 * <p>Java class for QUESTION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QUESTION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SUB_CATEGORY" type="{}RATING_CATEGORY_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ANSWER" type="{}ANSWER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RATING" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QUESTION_TYPE", propOrder = {
    "subcategory",
    "comment",
    "listanswer",
    "rating"
})
public class QUESTIONTYPE
    implements Serializable
{

    @XmlElement(name = "SUB_CATEGORY")
    protected RATINGCATEGORYTYPE subcategory;
    @XmlElement(name = "COMMENT")
    protected String comment;
    @XmlElement(name = "LIST_ANSWER")
    protected List<ANSWERTYPE> listanswer;
    @XmlElement(name = "RATING")
    protected Double rating;

    /**
     * Gets the value of the subcategory property.
     * 
     * @return
     *     possible object is
     *     {@link RATINGCATEGORYTYPE }
     *     
     */
    public RATINGCATEGORYTYPE getSUBCATEGORY() {
        return subcategory;
    }

    /**
     * Sets the value of the subcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RATINGCATEGORYTYPE }
     *     
     */
    public void setSUBCATEGORY(RATINGCATEGORYTYPE value) {
        this.subcategory = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENT() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENT(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the listanswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listanswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTANSWER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ANSWERTYPE }
     * 
     * 
     */
    public List<ANSWERTYPE> getLISTANSWER() {
        if (listanswer == null) {
            listanswer = new ArrayList<ANSWERTYPE>();
        }
        return this.listanswer;
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

}
