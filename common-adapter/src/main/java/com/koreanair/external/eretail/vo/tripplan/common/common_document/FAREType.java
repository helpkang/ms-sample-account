
package com.koreanair.external.eretail.vo.tripplan.common.common_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.payment.amountcommon.AMOUNTValueType;
import com.koreanair.external.eretail.vo.tripplan.common.common_fare.FARECALCULATIONType;


/**
 * <p>Java class for FAREType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FAREType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}commonMiscDocFareGroup"/&gt;
 *         &lt;element name="TOTAL_TAX" type="{}AMOUNTValueType" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_TAX_TO_BE_PAID" type="{}AMOUNTValueType" minOccurs="0"/&gt;
 *         &lt;element name="RFW" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAREType", propOrder = {
    "basefare",
    "basecurrencycode",
    "equivalentfare",
    "netfare",
    "totalfare",
    "refundfare",
    "exchangefare",
    "farecalculation",
    "listtax",
    "bankerrate",
    "issueidentifier",
    "listnonmonetarycost",
    "totaltax",
    "totaltaxtobepaid",
    "rfw"
})
public class FAREType
    implements Serializable
{

    @XmlElement(name = "BASE_FARE")
    protected String basefare;
    @XmlElement(name = "BASE_CURRENCY_CODE")
    protected Object basecurrencycode;
    @XmlElement(name = "EQUIVALENT_FARE")
    protected AMOUNTValueType equivalentfare;
    @XmlElement(name = "NET_FARE")
    protected AMOUNTValueType netfare;
    @XmlElement(name = "TOTAL_FARE")
    protected AMOUNTValueType totalfare;
    @XmlElement(name = "REFUND_FARE")
    protected AMOUNTValueType refundfare;
    @XmlElement(name = "EXCHANGE_FARE")
    protected AMOUNTValueType exchangefare;
    @XmlElement(name = "FARE_CALCULATION")
    protected FARECALCULATIONType farecalculation;
    @XmlElement(name = "LIST_TAX")
    protected List<com.koreanair.external.eretail.vo.tripplan.common.common_document.EMDFAREType.LISTTAX> listtax;
    @XmlElement(name = "BANKER_RATE")
    protected Object bankerrate;
    @XmlElement(name = "ISSUE_IDENTIFIER")
    protected String issueidentifier;
    @XmlElement(name = "LIST_NON_MONETARY_COST")
    protected List<com.koreanair.external.eretail.vo.tripplan.common.common_document.EMDFAREType.LISTNONMONETARYCOST> listnonmonetarycost;
    @XmlElement(name = "TOTAL_TAX")
    protected AMOUNTValueType totaltax;
    @XmlElement(name = "TOTAL_TAX_TO_BE_PAID")
    protected AMOUNTValueType totaltaxtobepaid;
    @XmlElement(name = "RFW")
    protected Object rfw;

    /**
     * Gets the value of the basefare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASEFARE() {
        return basefare;
    }

    /**
     * Sets the value of the basefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASEFARE(String value) {
        this.basefare = value;
    }

    /**
     * Gets the value of the basecurrencycode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBASECURRENCYCODE() {
        return basecurrencycode;
    }

    /**
     * Sets the value of the basecurrencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBASECURRENCYCODE(Object value) {
        this.basecurrencycode = value;
    }

    /**
     * Gets the value of the equivalentfare property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getEQUIVALENTFARE() {
        return equivalentfare;
    }

    /**
     * Sets the value of the equivalentfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setEQUIVALENTFARE(AMOUNTValueType value) {
        this.equivalentfare = value;
    }

    /**
     * Gets the value of the netfare property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getNETFARE() {
        return netfare;
    }

    /**
     * Sets the value of the netfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setNETFARE(AMOUNTValueType value) {
        this.netfare = value;
    }

    /**
     * Gets the value of the totalfare property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getTOTALFARE() {
        return totalfare;
    }

    /**
     * Sets the value of the totalfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setTOTALFARE(AMOUNTValueType value) {
        this.totalfare = value;
    }

    /**
     * Gets the value of the refundfare property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getREFUNDFARE() {
        return refundfare;
    }

    /**
     * Sets the value of the refundfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setREFUNDFARE(AMOUNTValueType value) {
        this.refundfare = value;
    }

    /**
     * Gets the value of the exchangefare property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getEXCHANGEFARE() {
        return exchangefare;
    }

    /**
     * Sets the value of the exchangefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setEXCHANGEFARE(AMOUNTValueType value) {
        this.exchangefare = value;
    }

    /**
     * Gets the value of the farecalculation property.
     * 
     * @return
     *     possible object is
     *     {@link FARECALCULATIONType }
     *     
     */
    public FARECALCULATIONType getFARECALCULATION() {
        return farecalculation;
    }

    /**
     * Sets the value of the farecalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARECALCULATIONType }
     *     
     */
    public void setFARECALCULATION(FARECALCULATIONType value) {
        this.farecalculation = value;
    }

    /**
     * Gets the value of the listtax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.koreanair.external.eretail.vo.tripplan.common.common_document.EMDFAREType.LISTTAX }
     * 
     * 
     */
    public List<com.koreanair.external.eretail.vo.tripplan.common.common_document.EMDFAREType.LISTTAX> getLISTTAX() {
        if (listtax == null) {
            listtax = new ArrayList<com.koreanair.external.eretail.vo.tripplan.common.common_document.EMDFAREType.LISTTAX>();
        }
        return this.listtax;
    }

    /**
     * Gets the value of the bankerrate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBANKERRATE() {
        return bankerrate;
    }

    /**
     * Sets the value of the bankerrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBANKERRATE(Object value) {
        this.bankerrate = value;
    }

    /**
     * Gets the value of the issueidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUEIDENTIFIER() {
        return issueidentifier;
    }

    /**
     * Sets the value of the issueidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUEIDENTIFIER(String value) {
        this.issueidentifier = value;
    }

    /**
     * Gets the value of the listnonmonetarycost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listnonmonetarycost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTNONMONETARYCOST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.koreanair.external.eretail.vo.tripplan.common.common_document.EMDFAREType.LISTNONMONETARYCOST }
     * 
     * 
     */
    public List<com.koreanair.external.eretail.vo.tripplan.common.common_document.EMDFAREType.LISTNONMONETARYCOST> getLISTNONMONETARYCOST() {
        if (listnonmonetarycost == null) {
            listnonmonetarycost = new ArrayList<com.koreanair.external.eretail.vo.tripplan.common.common_document.EMDFAREType.LISTNONMONETARYCOST>();
        }
        return this.listnonmonetarycost;
    }

    /**
     * Gets the value of the totaltax property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getTOTALTAX() {
        return totaltax;
    }

    /**
     * Sets the value of the totaltax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setTOTALTAX(AMOUNTValueType value) {
        this.totaltax = value;
    }

    /**
     * Gets the value of the totaltaxtobepaid property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getTOTALTAXTOBEPAID() {
        return totaltaxtobepaid;
    }

    /**
     * Sets the value of the totaltaxtobepaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setTOTALTAXTOBEPAID(AMOUNTValueType value) {
        this.totaltaxtobepaid = value;
    }

    /**
     * Gets the value of the rfw property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRFW() {
        return rfw;
    }

    /**
     * Sets the value of the rfw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRFW(Object value) {
        this.rfw = value;
    }

}
