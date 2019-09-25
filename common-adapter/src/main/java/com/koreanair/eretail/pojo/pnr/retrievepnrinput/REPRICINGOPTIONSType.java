
package com.koreanair.eretail.pojo.pnr.retrievepnrinput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.air.segmentstandaloneavailabilitycommon.SEGMENTStandaloneType;
import com.koreanair.eretail.pojo.farecommon.farecontext.LISTPRICINGOPTIONSType;


/**
 * 
 * 				Gives details all the pricing options that will be used to reprice the PNR when it is retrieved. These options can be segment or passenger associated, or general pricing options.
 * 			
 * 
 * <p>Java class for REPRICING_OPTIONS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REPRICING_OPTIONS_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PRICING_OPTIONS" type="{}LIST_PRICING_OPTIONS_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}SEGMENT_Standalone_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER" type="{}TRAVELLER_PRICING_OPTION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REPRICING_OPTIONS_Type", propOrder = {
    "listpricingoptions",
    "listsegment",
    "listtraveller"
})
public class REPRICINGOPTIONSType
    implements Serializable
{

    @XmlElement(name = "LIST_PRICING_OPTIONS")
    protected List<LISTPRICINGOPTIONSType> listpricingoptions;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<SEGMENTStandaloneType> listsegment;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<TRAVELLERPRICINGOPTIONType> listtraveller;

    /**
     * Gets the value of the listpricingoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricingoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICINGOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGOPTIONSType }
     * 
     * 
     */
    public List<LISTPRICINGOPTIONSType> getLISTPRICINGOPTIONS() {
        if (listpricingoptions == null) {
            listpricingoptions = new ArrayList<LISTPRICINGOPTIONSType>();
        }
        return this.listpricingoptions;
    }

    /**
     * Gets the value of the listsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEGMENTStandaloneType }
     * 
     * 
     */
    public List<SEGMENTStandaloneType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<SEGMENTStandaloneType>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the listtraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERPRICINGOPTIONType }
     * 
     * 
     */
    public List<TRAVELLERPRICINGOPTIONType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAVELLERPRICINGOPTIONType>();
        }
        return this.listtraveller;
    }

}
