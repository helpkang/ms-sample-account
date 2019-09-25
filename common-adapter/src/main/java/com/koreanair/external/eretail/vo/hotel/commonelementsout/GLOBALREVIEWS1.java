
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GLOBAL_REVIEWS_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLOBAL_REVIEWS_1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AVERAGE_RATING" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RECOMMENDATION_PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CATEGORY_RATING" type="{}CATEGORY_RATING_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LOGO_IMAGE_URL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="REVIEWS_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLOBAL_REVIEWS_1", propOrder = {
    "averagerating",
    "recommendationpercentage",
    "listcategoryrating",
    "logoimageurl",
    "reviewsnumber"
})
public class GLOBALREVIEWS1
    implements Serializable
{

    @XmlElement(name = "AVERAGE_RATING")
    protected Double averagerating;
    @XmlElement(name = "RECOMMENDATION_PERCENTAGE")
    protected Double recommendationpercentage;
    @XmlElement(name = "LIST_CATEGORY_RATING")
    protected List<CATEGORYRATINGTYPE> listcategoryrating;
    @XmlElement(name = "LOGO_IMAGE_URL")
    protected String logoimageurl;
    @XmlElement(name = "REVIEWS_NUMBER")
    protected BigInteger reviewsnumber;

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
     * Gets the value of the recommendationpercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRECOMMENDATIONPERCENTAGE() {
        return recommendationpercentage;
    }

    /**
     * Sets the value of the recommendationpercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRECOMMENDATIONPERCENTAGE(Double value) {
        this.recommendationpercentage = value;
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

    /**
     * Gets the value of the logoimageurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOGOIMAGEURL() {
        return logoimageurl;
    }

    /**
     * Sets the value of the logoimageurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOGOIMAGEURL(String value) {
        this.logoimageurl = value;
    }

    /**
     * Gets the value of the reviewsnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getREVIEWSNUMBER() {
        return reviewsnumber;
    }

    /**
     * Sets the value of the reviewsnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setREVIEWSNUMBER(BigInteger value) {
        this.reviewsnumber = value;
    }

}
