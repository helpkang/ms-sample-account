
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_OC_RECOMMENDATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_OC_RECOMMENDATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OC_RECOMMENDATION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="LIST_BOUND" maxOccurs="6"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OC_REF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "LIST_OC_RECOMMENDATION_Type", propOrder = {
    "ocrecommendationid",
    "listbound"
})
public class LISTOCRECOMMENDATIONType
    implements Serializable
{

    @XmlElement(name = "OC_RECOMMENDATION_ID", required = true)
    protected Object ocrecommendationid;
    @XmlElement(name = "LIST_BOUND", required = true)
    protected List<LISTOCRECOMMENDATIONType.LISTBOUND> listbound;

    /**
     * Gets the value of the ocrecommendationid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOCRECOMMENDATIONID() {
        return ocrecommendationid;
    }

    /**
     * Sets the value of the ocrecommendationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOCRECOMMENDATIONID(Object value) {
        this.ocrecommendationid = value;
    }

    /**
     * Gets the value of the listbound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTOCRECOMMENDATIONType.LISTBOUND }
     * 
     * 
     */
    public List<LISTOCRECOMMENDATIONType.LISTBOUND> getLISTBOUND() {
        if (listbound == null) {
            listbound = new ArrayList<LISTOCRECOMMENDATIONType.LISTBOUND>();
        }
        return this.listbound;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OC_REF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "ocref"
    })
    public static class LISTBOUND
        implements Serializable
    {

        @XmlElement(name = "OC_REF", required = true)
        protected String ocref;

        /**
         * Gets the value of the ocref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOCREF() {
            return ocref;
        }

        /**
         * Sets the value of the ocref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOCREF(String value) {
            this.ocref = value;
        }

    }

}
