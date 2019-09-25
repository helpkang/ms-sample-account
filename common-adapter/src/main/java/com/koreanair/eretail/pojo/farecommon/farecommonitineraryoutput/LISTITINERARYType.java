
package com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ITINERARY_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ITINERARY_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}LIST_ITINERARY_LightType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEARCH_DATA" type="{}SEARCH_DATA_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_FAMILY" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ITINERARY_Type", propOrder = {
    "searchdata",
    "farefamily"
})
public class LISTITINERARYType
    extends LISTITINERARYLightType
    implements Serializable
{

    @XmlElement(name = "SEARCH_DATA")
    protected SEARCHDATAType searchdata;
    @XmlElement(name = "FARE_FAMILY")
    protected FAREFAMILYFareType farefamily;

    /**
     * Gets the value of the searchdata property.
     * 
     * @return
     *     possible object is
     *     {@link SEARCHDATAType }
     *     
     */
    public SEARCHDATAType getSEARCHDATA() {
        return searchdata;
    }

    /**
     * Sets the value of the searchdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEARCHDATAType }
     *     
     */
    public void setSEARCHDATA(SEARCHDATAType value) {
        this.searchdata = value;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public FAREFAMILYFareType getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public void setFAREFAMILY(FAREFAMILYFareType value) {
        this.farefamily = value;
    }

}
