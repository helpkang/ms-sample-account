
package com.koreanair.eretail.pojo.tripplan.traveller_link;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of link(s) between travellers in trip plan
 * 
 * <p>Java class for TRAVELLER_LINK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVELLER_LINK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LINK_TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_TRAVELLER" type="{}TRAVELLER_DESCRIPTOR_TYPE" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAVELLER_LINK", propOrder = {
    "id",
    "linktype",
    "listtraveller"
})
public class TRAVELLERLINK
    implements Serializable
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "LINK_TYPE", required = true)
    protected String linktype;
    @XmlElement(name = "LIST_TRAVELLER", required = true)
    protected List<TRAVELLERDESCRIPTORTYPE> listtraveller;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the linktype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKTYPE() {
        return linktype;
    }

    /**
     * Sets the value of the linktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKTYPE(String value) {
        this.linktype = value;
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
     * {@link TRAVELLERDESCRIPTORTYPE }
     * 
     * 
     */
    public List<TRAVELLERDESCRIPTORTYPE> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAVELLERDESCRIPTORTYPE>();
        }
        return this.listtraveller;
    }

}
