
package com.koreanair.eretail.pojo.fare.farecommoninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;
import com.koreanair.eretail.pojo.profile.commonprofileout.LISTFREQUENTFLYERTYPE;


/**
 * Common input structure for award PNR pricing flows
 * 
 * <p>Java class for AwardItineraryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardItineraryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}BookedItineraryRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AWARD_TYPE" type="{}CodeDescriptorType"/&gt;
 *         &lt;element name="LIST_FREQUENT_FLYER" type="{}LIST_FREQUENT_FLYER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AWARD_QUOTATION_TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="INFORMATIVE_AWARD"/&gt;
 *               &lt;enumeration value="INFORMATIVE_AWARD_IN_FLOW"/&gt;
 *               &lt;enumeration value="MANDATORY_AWARD"/&gt;
 *               &lt;enumeration value="MANDATORY_UPGRADE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardItineraryRequestType", propOrder = {
    "awardtype",
    "listfrequentflyer",
    "awardquotationtype"
})
public class AwardItineraryRequestType
    extends BookedItineraryRequestType
    implements Serializable
{

    @XmlElement(name = "AWARD_TYPE", required = true)
    protected CodeDescriptorType awardtype;
    @XmlElement(name = "LIST_FREQUENT_FLYER")
    protected List<LISTFREQUENTFLYERTYPE> listfrequentflyer;
    @XmlElement(name = "AWARD_QUOTATION_TYPE", required = true)
    protected String awardquotationtype;

    /**
     * Gets the value of the awardtype property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getAWARDTYPE() {
        return awardtype;
    }

    /**
     * Sets the value of the awardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setAWARDTYPE(CodeDescriptorType value) {
        this.awardtype = value;
    }

    /**
     * Gets the value of the listfrequentflyer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfrequentflyer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFREQUENTFLYER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFREQUENTFLYERTYPE }
     * 
     * 
     */
    public List<LISTFREQUENTFLYERTYPE> getLISTFREQUENTFLYER() {
        if (listfrequentflyer == null) {
            listfrequentflyer = new ArrayList<LISTFREQUENTFLYERTYPE>();
        }
        return this.listfrequentflyer;
    }

    /**
     * Gets the value of the awardquotationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWARDQUOTATIONTYPE() {
        return awardquotationtype;
    }

    /**
     * Sets the value of the awardquotationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWARDQUOTATIONTYPE(String value) {
        this.awardquotationtype = value;
    }

}
