
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="LIST_PRIMARY_TRAVEL_DOCUMENTS" type="{}APIS_ENTRY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SECONDARY_TRAVEL_DOCUMENTS" type="{}APIS_ENTRY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RESIDENCE_ADDRESSES" type="{}APIS_ENTRY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESTINATION_ADDRESSES" type="{}APIS_ENTRY_type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "listprimarytraveldocuments",
    "listsecondarytraveldocuments",
    "listresidenceaddresses",
    "listdestinationaddresses"
})
@XmlRootElement(name = "APIS")
public class APIS
    implements Serializable
{

    @XmlElement(name = "LIST_PRIMARY_TRAVEL_DOCUMENTS")
    protected List<APISENTRYType> listprimarytraveldocuments;
    @XmlElement(name = "LIST_SECONDARY_TRAVEL_DOCUMENTS")
    protected List<APISENTRYType> listsecondarytraveldocuments;
    @XmlElement(name = "LIST_RESIDENCE_ADDRESSES")
    protected List<APISENTRYType> listresidenceaddresses;
    @XmlElement(name = "LIST_DESTINATION_ADDRESSES")
    protected List<APISENTRYType> listdestinationaddresses;

    /**
     * Gets the value of the listprimarytraveldocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprimarytraveldocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRIMARYTRAVELDOCUMENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISENTRYType }
     * 
     * 
     */
    public List<APISENTRYType> getLISTPRIMARYTRAVELDOCUMENTS() {
        if (listprimarytraveldocuments == null) {
            listprimarytraveldocuments = new ArrayList<APISENTRYType>();
        }
        return this.listprimarytraveldocuments;
    }

    /**
     * Gets the value of the listsecondarytraveldocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsecondarytraveldocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSECONDARYTRAVELDOCUMENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISENTRYType }
     * 
     * 
     */
    public List<APISENTRYType> getLISTSECONDARYTRAVELDOCUMENTS() {
        if (listsecondarytraveldocuments == null) {
            listsecondarytraveldocuments = new ArrayList<APISENTRYType>();
        }
        return this.listsecondarytraveldocuments;
    }

    /**
     * Gets the value of the listresidenceaddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listresidenceaddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRESIDENCEADDRESSES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISENTRYType }
     * 
     * 
     */
    public List<APISENTRYType> getLISTRESIDENCEADDRESSES() {
        if (listresidenceaddresses == null) {
            listresidenceaddresses = new ArrayList<APISENTRYType>();
        }
        return this.listresidenceaddresses;
    }

    /**
     * Gets the value of the listdestinationaddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdestinationaddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESTINATIONADDRESSES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISENTRYType }
     * 
     * 
     */
    public List<APISENTRYType> getLISTDESTINATIONADDRESSES() {
        if (listdestinationaddresses == null) {
            listdestinationaddresses = new ArrayList<APISENTRYType>();
        }
        return this.listdestinationaddresses;
    }

}
