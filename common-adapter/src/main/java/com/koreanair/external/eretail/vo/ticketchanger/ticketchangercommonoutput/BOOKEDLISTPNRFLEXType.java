
package com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BOOKED_LIST_PNR_FLEX_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKED_LIST_PNR_FLEX_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PNR_PRICE" type="{}BOOKED_PRICE_AMOUNT_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_TRAVELLER_TYPE" type="{}BOOKED_LIST_TRAVELLER_TYPE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKED_LIST_PNR_FLEX_Type", propOrder = {
    "listpnrprice",
    "listtravellertype"
})
public class BOOKEDLISTPNRFLEXType
    implements Serializable
{

    @XmlElement(name = "LIST_PNR_PRICE", required = true)
    protected List<BOOKEDPRICEAMOUNTType> listpnrprice;
    @XmlElement(name = "LIST_TRAVELLER_TYPE")
    protected List<BOOKEDLISTTRAVELLERTYPEType> listtravellertype;

    /**
     * Gets the value of the listpnrprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpnrprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPNRPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOOKEDPRICEAMOUNTType }
     * 
     * 
     */
    public List<BOOKEDPRICEAMOUNTType> getLISTPNRPRICE() {
        if (listpnrprice == null) {
            listpnrprice = new ArrayList<BOOKEDPRICEAMOUNTType>();
        }
        return this.listpnrprice;
    }

    /**
     * Gets the value of the listtravellertype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellertype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOOKEDLISTTRAVELLERTYPEType }
     * 
     * 
     */
    public List<BOOKEDLISTTRAVELLERTYPEType> getLISTTRAVELLERTYPE() {
        if (listtravellertype == null) {
            listtravellertype = new ArrayList<BOOKEDLISTTRAVELLERTYPEType>();
        }
        return this.listtravellertype;
    }

}
