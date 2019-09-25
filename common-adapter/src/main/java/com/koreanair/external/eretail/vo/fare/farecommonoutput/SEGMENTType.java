
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.LISTMEAL;


/**
 * <p>Java class for SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_ID" type="{}SEGMENT_ID_Type" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="BAGGAGE_ALLOWANCE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *           &lt;element name="TYPED_BAGGAGE_ALLOWANCE" type="{}TYPED_BAGGAGE_ALLOWANCE_Type" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{}COMMON_SEGMENT_DATA_Type"/&gt;
 *         &lt;element name="TRANSPORT_CLASS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RBD" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="REFUNDABLE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DISCOUNT" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="REBOOKING_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FULLY_PROVIDER_SUPPORTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FARE_FAMILY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_FAMILY_CARRIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEGMENT_Type", propOrder = {
    "segmentid",
    "baggageallowance",
    "typedbaggageallowance",
    "farebasis",
    "ticketdesignator",
    "discountindicator",
    "nva",
    "nvb",
    "listmeal",
    "transportclass",
    "rbd",
    "refundableindicator",
    "listdiscount",
    "rebookingneeded",
    "fullyprovidersupported",
    "farefamily",
    "farefamilycarrier"
})
@XmlSeeAlso({
    com.koreanair.external.eretail.vo.fare.farecommonoutput.TicketSegmentType.FARESEGMENTINFO.class
})
public class SEGMENTType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID")
    protected BigInteger segmentid;
    @XmlElement(name = "BAGGAGE_ALLOWANCE")
    protected String baggageallowance;
    @XmlElement(name = "TYPED_BAGGAGE_ALLOWANCE")
    protected TYPEDBAGGAGEALLOWANCEType typedbaggageallowance;
    @XmlElement(name = "FARE_BASIS")
    protected String farebasis;
    @XmlElement(name = "TICKET_DESIGNATOR")
    protected String ticketdesignator;
    @XmlElement(name = "DISCOUNT_INDICATOR")
    protected String discountindicator;
    @XmlElement(name = "NVA")
    protected String nva;
    @XmlElement(name = "NVB")
    protected String nvb;
    @XmlElement(name = "LIST_MEAL")
    protected List<LISTMEAL> listmeal;
    @XmlElement(name = "TRANSPORT_CLASS")
    protected Object transportclass;
    @XmlElement(name = "RBD")
    protected String rbd;
    @XmlElement(name = "REFUNDABLE_INDICATOR")
    protected Boolean refundableindicator;
    @XmlElement(name = "LIST_DISCOUNT")
    protected List<CodeDescriptorType> listdiscount;
    @XmlElement(name = "REBOOKING_NEEDED")
    protected Boolean rebookingneeded;
    @XmlElement(name = "FULLY_PROVIDER_SUPPORTED")
    protected Boolean fullyprovidersupported;
    @XmlElement(name = "FARE_FAMILY")
    protected String farefamily;
    @XmlElement(name = "FARE_FAMILY_CARRIER")
    protected String farefamilycarrier;

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTID(BigInteger value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the baggageallowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAGGAGEALLOWANCE() {
        return baggageallowance;
    }

    /**
     * Sets the value of the baggageallowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAGGAGEALLOWANCE(String value) {
        this.baggageallowance = value;
    }

    /**
     * Gets the value of the typedbaggageallowance property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDBAGGAGEALLOWANCEType }
     *     
     */
    public TYPEDBAGGAGEALLOWANCEType getTYPEDBAGGAGEALLOWANCE() {
        return typedbaggageallowance;
    }

    /**
     * Sets the value of the typedbaggageallowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDBAGGAGEALLOWANCEType }
     *     
     */
    public void setTYPEDBAGGAGEALLOWANCE(TYPEDBAGGAGEALLOWANCEType value) {
        this.typedbaggageallowance = value;
    }

    /**
     * Gets the value of the farebasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBASIS() {
        return farebasis;
    }

    /**
     * Sets the value of the farebasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBASIS(String value) {
        this.farebasis = value;
    }

    /**
     * Gets the value of the ticketdesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETDESIGNATOR() {
        return ticketdesignator;
    }

    /**
     * Sets the value of the ticketdesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETDESIGNATOR(String value) {
        this.ticketdesignator = value;
    }

    /**
     * Gets the value of the discountindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTINDICATOR() {
        return discountindicator;
    }

    /**
     * Sets the value of the discountindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTINDICATOR(String value) {
        this.discountindicator = value;
    }

    /**
     * Not Valid After. The format is DDMMM (15OCT for example).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVA() {
        return nva;
    }

    /**
     * Sets the value of the nva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVA(String value) {
        this.nva = value;
    }

    /**
     * Not Valid Before. The format is DDMMM (15OCT for example).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVB() {
        return nvb;
    }

    /**
     * Sets the value of the nvb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVB(String value) {
        this.nvb = value;
    }

    /**
     * Gets the value of the listmeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMEAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMEAL }
     * 
     * 
     */
    public List<LISTMEAL> getLISTMEAL() {
        if (listmeal == null) {
            listmeal = new ArrayList<LISTMEAL>();
        }
        return this.listmeal;
    }

    /**
     * Gets the value of the transportclass property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTRANSPORTCLASS() {
        return transportclass;
    }

    /**
     * Sets the value of the transportclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTRANSPORTCLASS(Object value) {
        this.transportclass = value;
    }

    /**
     * Gets the value of the rbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBD() {
        return rbd;
    }

    /**
     * Sets the value of the rbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBD(String value) {
        this.rbd = value;
    }

    /**
     * Gets the value of the refundableindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREFUNDABLEINDICATOR() {
        return refundableindicator;
    }

    /**
     * Sets the value of the refundableindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREFUNDABLEINDICATOR(Boolean value) {
        this.refundableindicator = value;
    }

    /**
     * Gets the value of the listdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescriptorType }
     * 
     * 
     */
    public List<CodeDescriptorType> getLISTDISCOUNT() {
        if (listdiscount == null) {
            listdiscount = new ArrayList<CodeDescriptorType>();
        }
        return this.listdiscount;
    }

    /**
     * Gets the value of the rebookingneeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREBOOKINGNEEDED() {
        return rebookingneeded;
    }

    /**
     * Sets the value of the rebookingneeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREBOOKINGNEEDED(Boolean value) {
        this.rebookingneeded = value;
    }

    /**
     * Gets the value of the fullyprovidersupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFULLYPROVIDERSUPPORTED() {
        return fullyprovidersupported;
    }

    /**
     * Sets the value of the fullyprovidersupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFULLYPROVIDERSUPPORTED(Boolean value) {
        this.fullyprovidersupported = value;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREFAMILY(String value) {
        this.farefamily = value;
    }

    /**
     * Gets the value of the farefamilycarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREFAMILYCARRIER() {
        return farefamilycarrier;
    }

    /**
     * Sets the value of the farefamilycarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREFAMILYCARRIER(String value) {
        this.farefamilycarrier = value;
    }

}
