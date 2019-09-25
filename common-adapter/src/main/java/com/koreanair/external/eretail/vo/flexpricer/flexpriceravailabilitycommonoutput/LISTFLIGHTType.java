
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_FLIGHTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FLIGHTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FLIGHT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RJS_RANK" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_SEGMENT" maxOccurs="4"/&gt;
 *         &lt;element name="LIST_STATUS" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_QUALIFIER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NPF" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_FLIGHTType", propOrder = {
    "flightid",
    "rjsrank",
    "listsegment",
    "liststatus",
    "listqualifier",
    "npf"
})
public class LISTFLIGHTType
    implements Serializable
{

    @XmlElement(name = "FLIGHT_ID", required = true)
    protected BigInteger flightid;
    @XmlElement(name = "RJS_RANK")
    protected BigInteger rjsrank;
    @XmlElement(name = "LIST_SEGMENT", required = true)
    protected List<ListSegmentType> listsegment;
    @XmlElement(name = "LIST_STATUS")
    protected List<String> liststatus;
    @XmlElement(name = "LIST_QUALIFIER")
    protected List<String> listqualifier;
    @XmlElement(name = "NPF")
    protected BigInteger npf;

    /**
     * Gets the value of the flightid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFLIGHTID() {
        return flightid;
    }

    /**
     * Sets the value of the flightid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFLIGHTID(BigInteger value) {
        this.flightid = value;
    }

    /**
     * Gets the value of the rjsrank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRJSRANK() {
        return rjsrank;
    }

    /**
     * Sets the value of the rjsrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRJSRANK(BigInteger value) {
        this.rjsrank = value;
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
     * {@link ListSegmentType }
     * 
     * 
     */
    public List<ListSegmentType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<ListSegmentType>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the liststatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTATUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSTATUS() {
        if (liststatus == null) {
            liststatus = new ArrayList<String>();
        }
        return this.liststatus;
    }

    /**
     * Gets the value of the listqualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listqualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTQUALIFIER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTQUALIFIER() {
        if (listqualifier == null) {
            listqualifier = new ArrayList<String>();
        }
        return this.listqualifier;
    }

    /**
     * Gets the value of the npf property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNPF() {
        return npf;
    }

    /**
     * Sets the value of the npf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNPF(BigInteger value) {
        this.npf = value;
    }

}
