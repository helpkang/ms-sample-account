
package com.koreanair.eretail.pojo.tripplan.list_ticket_group;

import java.io.Serializable;
import java.math.BigInteger;
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
 *         &lt;element name="TICKET_GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "ticketgroupid",
    "ticketid"
})
@XmlRootElement(name = "LIST_TICKET_GROUP")
public class LISTTICKETGROUP
    implements Serializable
{

    @XmlElement(name = "TICKET_GROUP_ID")
    protected BigInteger ticketgroupid;
    @XmlElement(name = "TICKET_ID")
    protected List<BigInteger> ticketid;

    /**
     * Gets the value of the ticketgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTICKETGROUPID() {
        return ticketgroupid;
    }

    /**
     * Sets the value of the ticketgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTICKETGROUPID(BigInteger value) {
        this.ticketgroupid = value;
    }

    /**
     * Gets the value of the ticketid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTICKETID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getTICKETID() {
        if (ticketid == null) {
            ticketid = new ArrayList<BigInteger>();
        }
        return this.ticketid;
    }

}
