
package com.koreanair.eretail.pojo.farecommon.farecontext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPTPC_OPTION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPTPC_OPTION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_USER_ACCOUNT_ASSOCIATION" type="{}LIST_USER_ACCOUNT_ASSOCIATION_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_SEGMENT_ACCOUNT_ASSOCIATION" type="{}LIST_SEGMENT_ACCOUNT_ASSOCIATION_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPTPC_OPTION_Type", propOrder = {
    "listuseraccountassociation",
    "listsegmentaccountassociation",
    "recloc"
})
public class TPTPCOPTIONType
    implements Serializable
{

    @XmlElement(name = "LIST_USER_ACCOUNT_ASSOCIATION", required = true)
    protected List<LISTUSERACCOUNTASSOCIATIONType> listuseraccountassociation;
    @XmlElement(name = "LIST_SEGMENT_ACCOUNT_ASSOCIATION", required = true)
    protected List<LISTSEGMENTACCOUNTASSOCIATIONType> listsegmentaccountassociation;
    @XmlElement(name = "REC_LOC", required = true)
    protected String recloc;

    /**
     * Gets the value of the listuseraccountassociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listuseraccountassociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTUSERACCOUNTASSOCIATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTUSERACCOUNTASSOCIATIONType }
     * 
     * 
     */
    public List<LISTUSERACCOUNTASSOCIATIONType> getLISTUSERACCOUNTASSOCIATION() {
        if (listuseraccountassociation == null) {
            listuseraccountassociation = new ArrayList<LISTUSERACCOUNTASSOCIATIONType>();
        }
        return this.listuseraccountassociation;
    }

    /**
     * Gets the value of the listsegmentaccountassociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentaccountassociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTACCOUNTASSOCIATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSEGMENTACCOUNTASSOCIATIONType }
     * 
     * 
     */
    public List<LISTSEGMENTACCOUNTASSOCIATIONType> getLISTSEGMENTACCOUNTASSOCIATION() {
        if (listsegmentaccountassociation == null) {
            listsegmentaccountassociation = new ArrayList<LISTSEGMENTACCOUNTASSOCIATIONType>();
        }
        return this.listsegmentaccountassociation;
    }

    /**
     * Gets the value of the recloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECLOC() {
        return recloc;
    }

    /**
     * Sets the value of the recloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECLOC(String value) {
        this.recloc = value;
    }

}
