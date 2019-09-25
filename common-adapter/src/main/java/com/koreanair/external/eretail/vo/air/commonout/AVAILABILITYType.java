
package com.koreanair.external.eretail.vo.air.commonout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;


/**
 * <p>Java class for AVAILABILITY_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVAILABILITY_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISPLAY_NEXT_DAY_LINK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DISPLAY_PREVIOUS_DAY_LINK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SEARCH_DATA" type="{}SEARCH_DATA_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FLIGHT" type="{}FLIGHT_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVAILABILITY_Type", propOrder = {
    "displaynextdaylink",
    "displaypreviousdaylink",
    "searchdata",
    "listflight",
    "listmsg"
})
public class AVAILABILITYType
    implements Serializable
{

    @XmlElement(name = "DISPLAY_NEXT_DAY_LINK")
    protected Boolean displaynextdaylink;
    @XmlElement(name = "DISPLAY_PREVIOUS_DAY_LINK")
    protected Boolean displaypreviousdaylink;
    @XmlElement(name = "SEARCH_DATA")
    protected SEARCHDATAType searchdata;
    @XmlElement(name = "LIST_FLIGHT", required = true)
    protected List<FLIGHTType> listflight;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;

    /**
     * Gets the value of the displaynextdaylink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISPLAYNEXTDAYLINK() {
        return displaynextdaylink;
    }

    /**
     * Sets the value of the displaynextdaylink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISPLAYNEXTDAYLINK(Boolean value) {
        this.displaynextdaylink = value;
    }

    /**
     * Gets the value of the displaypreviousdaylink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISPLAYPREVIOUSDAYLINK() {
        return displaypreviousdaylink;
    }

    /**
     * Sets the value of the displaypreviousdaylink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISPLAYPREVIOUSDAYLINK(Boolean value) {
        this.displaypreviousdaylink = value;
    }

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
     * Gets the value of the listflight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLIGHTType }
     * 
     * 
     */
    public List<FLIGHTType> getLISTFLIGHT() {
        if (listflight == null) {
            listflight = new ArrayList<FLIGHTType>();
        }
        return this.listflight;
    }

    /**
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }

}
