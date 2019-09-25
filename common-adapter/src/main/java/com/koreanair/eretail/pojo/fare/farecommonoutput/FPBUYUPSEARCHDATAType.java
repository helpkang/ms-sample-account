
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FP_BUYUP_SEARCH_DATA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FP_BUYUP_SEARCH_DATA_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_RECOMMENDATION_ID" type="{}LIST_RECOMMENDATION_ID_TYPE" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_BUYUP_SEARCH_DATA_Type", propOrder = {
    "listrecommendationid"
})
public class FPBUYUPSEARCHDATAType
    implements Serializable
{

    @XmlElement(name = "LIST_RECOMMENDATION_ID", required = true)
    protected List<LISTRECOMMENDATIONIDTYPE> listrecommendationid;

    /**
     * Gets the value of the listrecommendationid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrecommendationid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRECOMMENDATIONID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRECOMMENDATIONIDTYPE }
     * 
     * 
     */
    public List<LISTRECOMMENDATIONIDTYPE> getLISTRECOMMENDATIONID() {
        if (listrecommendationid == null) {
            listrecommendationid = new ArrayList<LISTRECOMMENDATIONIDTYPE>();
        }
        return this.listrecommendationid;
    }

}
