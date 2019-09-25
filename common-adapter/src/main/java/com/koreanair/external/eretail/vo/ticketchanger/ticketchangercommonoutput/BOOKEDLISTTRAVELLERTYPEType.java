
package com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTTRAVELLERType;


/**
 * <p>Java class for BOOKED_LIST_TRAVELLER_TYPE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKED_LIST_TRAVELLER_TYPE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{}BOOKED_LIST_TRAVELLER_ID_Type" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_TYPE" type="{}INPUT_TRAVELLER_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_TRAVELLER_PRICE" type="{}BOOKED_PRICE_AMOUNT_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_TRAVELLER_TYPE_PRICE" type="{}BOOKED_PRICE_AMOUNT_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKED_LIST_TRAVELLER_TYPE_Type", propOrder = {
    "listtravellerid",
    "travellertype",
    "listtravellerprice",
    "listtravellertypeprice"
})
public class BOOKEDLISTTRAVELLERTYPEType
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<BOOKEDLISTTRAVELLERIDType> listtravellerid;
    @XmlElement(name = "TRAVELLER_TYPE", required = true)
    protected List<INPUTTRAVELLERType> travellertype;
    @XmlElement(name = "LIST_TRAVELLER_PRICE", required = true)
    protected List<BOOKEDPRICEAMOUNTType> listtravellerprice;
    @XmlElement(name = "LIST_TRAVELLER_TYPE_PRICE", required = true)
    protected List<BOOKEDPRICEAMOUNTType> listtravellertypeprice;

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOOKEDLISTTRAVELLERIDType }
     * 
     * 
     */
    public List<BOOKEDLISTTRAVELLERIDType> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<BOOKEDLISTTRAVELLERIDType>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the travellertype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellertype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVELLERTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INPUTTRAVELLERType }
     * 
     * 
     */
    public List<INPUTTRAVELLERType> getTRAVELLERTYPE() {
        if (travellertype == null) {
            travellertype = new ArrayList<INPUTTRAVELLERType>();
        }
        return this.travellertype;
    }

    /**
     * Gets the value of the listtravellerprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOOKEDPRICEAMOUNTType }
     * 
     * 
     */
    public List<BOOKEDPRICEAMOUNTType> getLISTTRAVELLERPRICE() {
        if (listtravellerprice == null) {
            listtravellerprice = new ArrayList<BOOKEDPRICEAMOUNTType>();
        }
        return this.listtravellerprice;
    }

    /**
     * Gets the value of the listtravellertypeprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellertypeprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERTYPEPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOOKEDPRICEAMOUNTType }
     * 
     * 
     */
    public List<BOOKEDPRICEAMOUNTType> getLISTTRAVELLERTYPEPRICE() {
        if (listtravellertypeprice == null) {
            listtravellertypeprice = new ArrayList<BOOKEDPRICEAMOUNTType>();
        }
        return this.listtravellertypeprice;
    }

}
