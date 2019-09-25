
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_REVIEW_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_REVIEW_1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="USER_INFO" type="{}USER_UGC" minOccurs="0"/&gt;
 *         &lt;element name="AVERAGE_RATING" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RECOMMENDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CATEGORY_RATING" type="{}CATEGORY_RATING_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_REVIEW_1", propOrder = {
    "userinfo",
    "averagerating",
    "recommended",
    "listcategoryrating"
})
public class LISTREVIEW1
    implements Serializable
{

    @XmlElement(name = "USER_INFO")
    protected USERUGC userinfo;
    @XmlElement(name = "AVERAGE_RATING")
    protected Double averagerating;
    @XmlElement(name = "RECOMMENDED")
    protected Boolean recommended;
    @XmlElement(name = "LIST_CATEGORY_RATING")
    protected List<CATEGORYRATINGTYPE> listcategoryrating;

    /**
     * Gets the value of the userinfo property.
     * 
     * @return
     *     possible object is
     *     {@link USERUGC }
     *     
     */
    public USERUGC getUSERINFO() {
        return userinfo;
    }

    /**
     * Sets the value of the userinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link USERUGC }
     *     
     */
    public void setUSERINFO(USERUGC value) {
        this.userinfo = value;
    }

    /**
     * Gets the value of the averagerating property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAVERAGERATING() {
        return averagerating;
    }

    /**
     * Sets the value of the averagerating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAVERAGERATING(Double value) {
        this.averagerating = value;
    }

    /**
     * Gets the value of the recommended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRECOMMENDED() {
        return recommended;
    }

    /**
     * Sets the value of the recommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRECOMMENDED(Boolean value) {
        this.recommended = value;
    }

    /**
     * Gets the value of the listcategoryrating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcategoryrating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCATEGORYRATING().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CATEGORYRATINGTYPE }
     * 
     * 
     */
    public List<CATEGORYRATINGTYPE> getLISTCATEGORYRATING() {
        if (listcategoryrating == null) {
            listcategoryrating = new ArrayList<CATEGORYRATINGTYPE>();
        }
        return this.listcategoryrating;
    }

}
