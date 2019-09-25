
package com.koreanair.eretail.pojo.tripplan.accountable_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.AmountType;
import com.koreanair.eretail.pojo.common.common.ERRORType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REFUNDBALANCEType;
import com.koreanair.eretail.pojo.tripplan.common.common_document.EMDType;
import com.koreanair.eretail.pojo.tripplan.payment_group.TRAVELFUNDSINFORMATIONType;


/**
 * <p>Java class for ACCOUNTABLE_DOCUMENTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNTABLE_DOCUMENTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="AIR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PARTIAL_REFUND" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ELIGIBILITY" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="LIST_ITINERARY" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="REFUND" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_NON_ELIGIBILITY_REASON" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{}unprotectedStringType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ELIGIBILITY" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FULL_REFUND" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                                 &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="INVOLUNTARY_REFUND" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                                 &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ATC_INVOLUNTARY_REFUND" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                                 &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_REFUND_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="APPLIED_MODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                                       &lt;element name="ERROR" type="{}ERRORType" minOccurs="0"/&gt;
 *                                       &lt;element name="LIST_REFUND_AMOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{}REFUND_BALANCE_Type"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="LIST_REFUND_BREAKDOWN" type="{}REFUND_BREAKDOWN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="LIST_PENALTY_CHARGE" type="{}amountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;element name="LIST_REDEMPTION_INFORMATION" type="{}LIST_REDEMPTION_INFORMATIONType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;element name="IS_MANUAL_PROCESS_NEEDED_FOR_FOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                       &lt;element name="TRAVEL_FUND" type="{}TRAVEL_FUNDS_INFORMATIONType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="IS_MANUAL_PROCESS_NEEDED_FOR_FOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAYMENT_GROUP" type="{}PAYMENT_GROUP_LIGHT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_EMD" type="{}EMDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVEL_REPORT" type="{}TRAVEL_REPORT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOUNTABLE_DOCUMENTType", propOrder = {
    "type",
    "air",
    "paymentgroup",
    "listemd",
    "listtravelreport"
})
public class ACCOUNTABLEDOCUMENTType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "AIR")
    protected ACCOUNTABLEDOCUMENTType.AIR air;
    @XmlElement(name = "PAYMENT_GROUP")
    protected List<PAYMENTGROUPLIGHTType> paymentgroup;
    @XmlElement(name = "LIST_EMD")
    protected List<EMDType> listemd;
    @XmlElement(name = "LIST_TRAVEL_REPORT")
    protected List<TRAVELREPORT> listtravelreport;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the air property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTABLEDOCUMENTType.AIR }
     *     
     */
    public ACCOUNTABLEDOCUMENTType.AIR getAIR() {
        return air;
    }

    /**
     * Sets the value of the air property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTABLEDOCUMENTType.AIR }
     *     
     */
    public void setAIR(ACCOUNTABLEDOCUMENTType.AIR value) {
        this.air = value;
    }

    /**
     * Gets the value of the paymentgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAYMENTGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENTGROUPLIGHTType }
     * 
     * 
     */
    public List<PAYMENTGROUPLIGHTType> getPAYMENTGROUP() {
        if (paymentgroup == null) {
            paymentgroup = new ArrayList<PAYMENTGROUPLIGHTType>();
        }
        return this.paymentgroup;
    }

    /**
     * Gets the value of the listemd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listemd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEMD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType }
     * 
     * 
     */
    public List<EMDType> getLISTEMD() {
        if (listemd == null) {
            listemd = new ArrayList<EMDType>();
        }
        return this.listemd;
    }

    /**
     * Gets the value of the listtravelreport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravelreport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELREPORT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELREPORT }
     * 
     * 
     */
    public List<TRAVELREPORT> getLISTTRAVELREPORT() {
        if (listtravelreport == null) {
            listtravelreport = new ArrayList<TRAVELREPORT>();
        }
        return this.listtravelreport;
    }


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
     *         &lt;element name="PARTIAL_REFUND" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ELIGIBILITY" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_ITINERARY" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="REFUND" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_NON_ELIGIBILITY_REASON" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" type="{}unprotectedStringType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ELIGIBILITY" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FULL_REFUND" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                                       &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="INVOLUNTARY_REFUND" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                                       &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ATC_INVOLUNTARY_REFUND" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                                       &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_REFUND_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="APPLIED_MODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                             &lt;element name="ERROR" type="{}ERRORType" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_REFUND_AMOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{}REFUND_BALANCE_Type"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LIST_REFUND_BREAKDOWN" type="{}REFUND_BREAKDOWN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="LIST_PENALTY_CHARGE" type="{}amountType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_REDEMPTION_INFORMATION" type="{}LIST_REDEMPTION_INFORMATIONType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="IS_MANUAL_PROCESS_NEEDED_FOR_FOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                             &lt;element name="TRAVEL_FUND" type="{}TRAVEL_FUNDS_INFORMATIONType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="IS_MANUAL_PROCESS_NEEDED_FOR_FOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "partialrefund",
        "refund"
    })
    public static class AIR
        implements Serializable
    {

        @XmlElement(name = "PARTIAL_REFUND")
        protected ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND partialrefund;
        @XmlElement(name = "REFUND")
        protected ACCOUNTABLEDOCUMENTType.AIR.REFUND refund;

        /**
         * Gets the value of the partialrefund property.
         * 
         * @return
         *     possible object is
         *     {@link ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND }
         *     
         */
        public ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND getPARTIALREFUND() {
            return partialrefund;
        }

        /**
         * Sets the value of the partialrefund property.
         * 
         * @param value
         *     allowed object is
         *     {@link ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND }
         *     
         */
        public void setPARTIALREFUND(ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND value) {
            this.partialrefund = value;
        }

        /**
         * Gets the value of the refund property.
         * 
         * @return
         *     possible object is
         *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND }
         *     
         */
        public ACCOUNTABLEDOCUMENTType.AIR.REFUND getREFUND() {
            return refund;
        }

        /**
         * Sets the value of the refund property.
         * 
         * @param value
         *     allowed object is
         *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND }
         *     
         */
        public void setREFUND(ACCOUNTABLEDOCUMENTType.AIR.REFUND value) {
            this.refund = value;
        }


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
         *         &lt;element name="ELIGIBILITY" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_ITINERARY" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "eligibility",
            "listticket"
        })
        public static class PARTIALREFUND
            implements Serializable
        {

            @XmlElement(name = "ELIGIBILITY")
            protected ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.ELIGIBILITY eligibility;
            @XmlElement(name = "LIST_TICKET")
            protected List<ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.LISTTICKET> listticket;

            /**
             * Gets the value of the eligibility property.
             * 
             * @return
             *     possible object is
             *     {@link ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.ELIGIBILITY }
             *     
             */
            public ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.ELIGIBILITY getELIGIBILITY() {
                return eligibility;
            }

            /**
             * Sets the value of the eligibility property.
             * 
             * @param value
             *     allowed object is
             *     {@link ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.ELIGIBILITY }
             *     
             */
            public void setELIGIBILITY(ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.ELIGIBILITY value) {
                this.eligibility = value;
            }

            /**
             * Gets the value of the listticket property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listticket property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTTICKET().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.LISTTICKET }
             * 
             * 
             */
            public List<ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.LISTTICKET> getLISTTICKET() {
                if (listticket == null) {
                    listticket = new ArrayList<ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.LISTTICKET>();
                }
                return this.listticket;
            }


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
             *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="LIST_ITINERARY" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "iseligible",
                "noneligibilityreason",
                "listitinerary"
            })
            public static class ELIGIBILITY
                implements Serializable
            {

                @XmlElement(name = "IS_ELIGIBLE", required = true)
                protected String iseligible;
                @XmlElement(name = "NON_ELIGIBILITY_REASON")
                protected String noneligibilityreason;
                @XmlElement(name = "LIST_ITINERARY")
                protected List<ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.ELIGIBILITY.LISTITINERARY> listitinerary;

                /**
                 * Gets the value of the iseligible property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getISELIGIBLE() {
                    return iseligible;
                }

                /**
                 * Sets the value of the iseligible property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setISELIGIBLE(String value) {
                    this.iseligible = value;
                }

                /**
                 * Gets the value of the noneligibilityreason property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNONELIGIBILITYREASON() {
                    return noneligibilityreason;
                }

                /**
                 * Sets the value of the noneligibilityreason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNONELIGIBILITYREASON(String value) {
                    this.noneligibilityreason = value;
                }

                /**
                 * Gets the value of the listitinerary property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listitinerary property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTITINERARY().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.ELIGIBILITY.LISTITINERARY }
                 * 
                 * 
                 */
                public List<ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.ELIGIBILITY.LISTITINERARY> getLISTITINERARY() {
                    if (listitinerary == null) {
                        listitinerary = new ArrayList<ACCOUNTABLEDOCUMENTType.AIR.PARTIALREFUND.ELIGIBILITY.LISTITINERARY>();
                    }
                    return this.listitinerary;
                }


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
                 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "itemid",
                    "iseligible",
                    "noneligibilityreason"
                })
                public static class LISTITINERARY
                    implements Serializable
                {

                    @XmlElement(name = "ITEM_ID", required = true)
                    protected String itemid;
                    @XmlElement(name = "IS_ELIGIBLE", required = true)
                    protected String iseligible;
                    @XmlElement(name = "NON_ELIGIBILITY_REASON")
                    protected String noneligibilityreason;

                    /**
                     * Gets the value of the itemid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getITEMID() {
                        return itemid;
                    }

                    /**
                     * Sets the value of the itemid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setITEMID(String value) {
                        this.itemid = value;
                    }

                    /**
                     * Gets the value of the iseligible property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getISELIGIBLE() {
                        return iseligible;
                    }

                    /**
                     * Sets the value of the iseligible property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setISELIGIBLE(String value) {
                        this.iseligible = value;
                    }

                    /**
                     * Gets the value of the noneligibilityreason property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNONELIGIBILITYREASON() {
                        return noneligibilityreason;
                    }

                    /**
                     * Sets the value of the noneligibilityreason property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNONELIGIBILITYREASON(String value) {
                        this.noneligibilityreason = value;
                    }

                }

            }


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
             *         &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                "documentnumber"
            })
            public static class LISTTICKET
                implements Serializable
            {

                @XmlElement(name = "DOCUMENT_NUMBER")
                protected Object documentnumber;

                /**
                 * Gets the value of the documentnumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getDOCUMENTNUMBER() {
                    return documentnumber;
                }

                /**
                 * Sets the value of the documentnumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setDOCUMENTNUMBER(Object value) {
                    this.documentnumber = value;
                }

            }

        }


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
         *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="LIST_NON_ELIGIBILITY_REASON" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" type="{}unprotectedStringType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ELIGIBILITY" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FULL_REFUND" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="INVOLUNTARY_REFUND" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ATC_INVOLUNTARY_REFUND" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                             &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_REFUND_TICKET" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="APPLIED_MODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                   &lt;element name="ERROR" type="{}ERRORType" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_REFUND_AMOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{}REFUND_BALANCE_Type"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LIST_REFUND_BREAKDOWN" type="{}REFUND_BREAKDOWN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="LIST_PENALTY_CHARGE" type="{}amountType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_REDEMPTION_INFORMATION" type="{}LIST_REDEMPTION_INFORMATIONType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="IS_MANUAL_PROCESS_NEEDED_FOR_FOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                   &lt;element name="TRAVEL_FUND" type="{}TRAVEL_FUNDS_INFORMATIONType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="IS_MANUAL_PROCESS_NEEDED_FOR_FOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "status",
            "noneligibilityreason",
            "listnoneligibilityreason",
            "eligibility",
            "listrefundticket",
            "ismanualprocessneededforfop"
        })
        public static class REFUND
            implements Serializable
        {

            @XmlElement(name = "STATUS", required = true)
            protected Object status;
            @XmlElement(name = "NON_ELIGIBILITY_REASON")
            protected Object noneligibilityreason;
            @XmlElement(name = "LIST_NON_ELIGIBILITY_REASON")
            protected ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTNONELIGIBILITYREASON listnoneligibilityreason;
            @XmlElement(name = "ELIGIBILITY")
            protected ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY eligibility;
            @XmlElement(name = "LIST_REFUND_TICKET")
            protected List<ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTREFUNDTICKET> listrefundticket;
            @XmlElement(name = "IS_MANUAL_PROCESS_NEEDED_FOR_FOP")
            protected Boolean ismanualprocessneededforfop;

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSTATUS(Object value) {
                this.status = value;
            }

            /**
             * Gets the value of the noneligibilityreason property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getNONELIGIBILITYREASON() {
                return noneligibilityreason;
            }

            /**
             * Sets the value of the noneligibilityreason property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setNONELIGIBILITYREASON(Object value) {
                this.noneligibilityreason = value;
            }

            /**
             * Gets the value of the listnoneligibilityreason property.
             * 
             * @return
             *     possible object is
             *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTNONELIGIBILITYREASON }
             *     
             */
            public ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTNONELIGIBILITYREASON getLISTNONELIGIBILITYREASON() {
                return listnoneligibilityreason;
            }

            /**
             * Sets the value of the listnoneligibilityreason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTNONELIGIBILITYREASON }
             *     
             */
            public void setLISTNONELIGIBILITYREASON(ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTNONELIGIBILITYREASON value) {
                this.listnoneligibilityreason = value;
            }

            /**
             * Gets the value of the eligibility property.
             * 
             * @return
             *     possible object is
             *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY }
             *     
             */
            public ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY getELIGIBILITY() {
                return eligibility;
            }

            /**
             * Sets the value of the eligibility property.
             * 
             * @param value
             *     allowed object is
             *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY }
             *     
             */
            public void setELIGIBILITY(ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY value) {
                this.eligibility = value;
            }

            /**
             * Gets the value of the listrefundticket property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listrefundticket property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTREFUNDTICKET().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTREFUNDTICKET }
             * 
             * 
             */
            public List<ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTREFUNDTICKET> getLISTREFUNDTICKET() {
                if (listrefundticket == null) {
                    listrefundticket = new ArrayList<ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTREFUNDTICKET>();
                }
                return this.listrefundticket;
            }

            /**
             * Gets the value of the ismanualprocessneededforfop property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISMANUALPROCESSNEEDEDFORFOP() {
                return ismanualprocessneededforfop;
            }

            /**
             * Sets the value of the ismanualprocessneededforfop property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISMANUALPROCESSNEEDEDFORFOP(Boolean value) {
                this.ismanualprocessneededforfop = value;
            }


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
             *         &lt;element name="FULL_REFUND" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="INVOLUNTARY_REFUND" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ATC_INVOLUNTARY_REFUND" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "fullrefund",
                "involuntaryrefund",
                "atcinvoluntaryrefund"
            })
            public static class ELIGIBILITY
                implements Serializable
            {

                @XmlElement(name = "FULL_REFUND")
                protected ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.FULLREFUND fullrefund;
                @XmlElement(name = "INVOLUNTARY_REFUND")
                protected ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.INVOLUNTARYREFUND involuntaryrefund;
                @XmlElement(name = "ATC_INVOLUNTARY_REFUND")
                protected ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.ATCINVOLUNTARYREFUND atcinvoluntaryrefund;

                /**
                 * Gets the value of the fullrefund property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.FULLREFUND }
                 *     
                 */
                public ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.FULLREFUND getFULLREFUND() {
                    return fullrefund;
                }

                /**
                 * Sets the value of the fullrefund property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.FULLREFUND }
                 *     
                 */
                public void setFULLREFUND(ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.FULLREFUND value) {
                    this.fullrefund = value;
                }

                /**
                 * Gets the value of the involuntaryrefund property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.INVOLUNTARYREFUND }
                 *     
                 */
                public ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.INVOLUNTARYREFUND getINVOLUNTARYREFUND() {
                    return involuntaryrefund;
                }

                /**
                 * Sets the value of the involuntaryrefund property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.INVOLUNTARYREFUND }
                 *     
                 */
                public void setINVOLUNTARYREFUND(ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.INVOLUNTARYREFUND value) {
                    this.involuntaryrefund = value;
                }

                /**
                 * Gets the value of the atcinvoluntaryrefund property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.ATCINVOLUNTARYREFUND }
                 *     
                 */
                public ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.ATCINVOLUNTARYREFUND getATCINVOLUNTARYREFUND() {
                    return atcinvoluntaryrefund;
                }

                /**
                 * Sets the value of the atcinvoluntaryrefund property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.ATCINVOLUNTARYREFUND }
                 *     
                 */
                public void setATCINVOLUNTARYREFUND(ACCOUNTABLEDOCUMENTType.AIR.REFUND.ELIGIBILITY.ATCINVOLUNTARYREFUND value) {
                    this.atcinvoluntaryrefund = value;
                }


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
                 *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
                 *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                    "iseligible",
                    "noneligibilityreason"
                })
                public static class ATCINVOLUNTARYREFUND
                    implements Serializable
                {

                    @XmlElement(name = "IS_ELIGIBLE")
                    protected boolean iseligible;
                    @XmlElement(name = "NON_ELIGIBILITY_REASON")
                    protected Object noneligibilityreason;

                    /**
                     * Gets the value of the iseligible property.
                     * 
                     */
                    public boolean isISELIGIBLE() {
                        return iseligible;
                    }

                    /**
                     * Sets the value of the iseligible property.
                     * 
                     */
                    public void setISELIGIBLE(boolean value) {
                        this.iseligible = value;
                    }

                    /**
                     * Gets the value of the noneligibilityreason property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getNONELIGIBILITYREASON() {
                        return noneligibilityreason;
                    }

                    /**
                     * Sets the value of the noneligibilityreason property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setNONELIGIBILITYREASON(Object value) {
                        this.noneligibilityreason = value;
                    }

                }


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
                 *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
                 *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                    "iseligible",
                    "noneligibilityreason"
                })
                public static class FULLREFUND
                    implements Serializable
                {

                    @XmlElement(name = "IS_ELIGIBLE")
                    protected boolean iseligible;
                    @XmlElement(name = "NON_ELIGIBILITY_REASON")
                    protected Object noneligibilityreason;

                    /**
                     * Gets the value of the iseligible property.
                     * 
                     */
                    public boolean isISELIGIBLE() {
                        return iseligible;
                    }

                    /**
                     * Sets the value of the iseligible property.
                     * 
                     */
                    public void setISELIGIBLE(boolean value) {
                        this.iseligible = value;
                    }

                    /**
                     * Gets the value of the noneligibilityreason property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getNONELIGIBILITYREASON() {
                        return noneligibilityreason;
                    }

                    /**
                     * Sets the value of the noneligibilityreason property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setNONELIGIBILITYREASON(Object value) {
                        this.noneligibilityreason = value;
                    }

                }


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
                 *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
                 *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                    "iseligible",
                    "noneligibilityreason"
                })
                public static class INVOLUNTARYREFUND
                    implements Serializable
                {

                    @XmlElement(name = "IS_ELIGIBLE")
                    protected boolean iseligible;
                    @XmlElement(name = "NON_ELIGIBILITY_REASON")
                    protected Object noneligibilityreason;

                    /**
                     * Gets the value of the iseligible property.
                     * 
                     */
                    public boolean isISELIGIBLE() {
                        return iseligible;
                    }

                    /**
                     * Sets the value of the iseligible property.
                     * 
                     */
                    public void setISELIGIBLE(boolean value) {
                        this.iseligible = value;
                    }

                    /**
                     * Gets the value of the noneligibilityreason property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getNONELIGIBILITYREASON() {
                        return noneligibilityreason;
                    }

                    /**
                     * Sets the value of the noneligibilityreason property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setNONELIGIBILITYREASON(Object value) {
                        this.noneligibilityreason = value;
                    }

                }

            }


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
             *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="NAME" type="{}unprotectedStringType"/&gt;
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
                "code",
                "name"
            })
            public static class LISTNONELIGIBILITYREASON
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NAME", required = true)
                protected String name;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAME(String value) {
                    this.name = value;
                }

            }


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
             *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="APPLIED_MODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *         &lt;element name="ERROR" type="{}ERRORType" minOccurs="0"/&gt;
             *         &lt;element name="LIST_REFUND_AMOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{}REFUND_BALANCE_Type"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LIST_REFUND_BREAKDOWN" type="{}REFUND_BREAKDOWN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="LIST_PENALTY_CHARGE" type="{}amountType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="LIST_REDEMPTION_INFORMATION" type="{}LIST_REDEMPTION_INFORMATIONType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="IS_MANUAL_PROCESS_NEEDED_FOR_FOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *         &lt;element name="TRAVEL_FUND" type="{}TRAVEL_FUNDS_INFORMATIONType" minOccurs="0"/&gt;
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
                "status",
                "documentnumber",
                "appliedmode",
                "error",
                "listrefundamount",
                "listpenaltycharge",
                "listredemptioninformation",
                "ismanualprocessneededforfop",
                "travelfund"
            })
            public static class LISTREFUNDTICKET
                implements Serializable
            {

                @XmlElement(name = "STATUS", required = true)
                protected Object status;
                @XmlElement(name = "DOCUMENT_NUMBER", required = true)
                protected Object documentnumber;
                @XmlElement(name = "APPLIED_MODE")
                protected Object appliedmode;
                @XmlElement(name = "ERROR")
                protected ERRORType error;
                @XmlElement(name = "LIST_REFUND_AMOUNT")
                protected List<ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTREFUNDTICKET.LISTREFUNDAMOUNT> listrefundamount;
                @XmlElement(name = "LIST_PENALTY_CHARGE")
                protected List<AmountType> listpenaltycharge;
                @XmlElement(name = "LIST_REDEMPTION_INFORMATION")
                protected List<LISTREDEMPTIONINFORMATIONType> listredemptioninformation;
                @XmlElement(name = "IS_MANUAL_PROCESS_NEEDED_FOR_FOP")
                protected Boolean ismanualprocessneededforfop;
                @XmlElement(name = "TRAVEL_FUND")
                protected TRAVELFUNDSINFORMATIONType travelfund;

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getSTATUS() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setSTATUS(Object value) {
                    this.status = value;
                }

                /**
                 * Gets the value of the documentnumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getDOCUMENTNUMBER() {
                    return documentnumber;
                }

                /**
                 * Sets the value of the documentnumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setDOCUMENTNUMBER(Object value) {
                    this.documentnumber = value;
                }

                /**
                 * Gets the value of the appliedmode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAPPLIEDMODE() {
                    return appliedmode;
                }

                /**
                 * Sets the value of the appliedmode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAPPLIEDMODE(Object value) {
                    this.appliedmode = value;
                }

                /**
                 * Gets the value of the error property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ERRORType }
                 *     
                 */
                public ERRORType getERROR() {
                    return error;
                }

                /**
                 * Sets the value of the error property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ERRORType }
                 *     
                 */
                public void setERROR(ERRORType value) {
                    this.error = value;
                }

                /**
                 * Gets the value of the listrefundamount property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listrefundamount property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTREFUNDAMOUNT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTREFUNDTICKET.LISTREFUNDAMOUNT }
                 * 
                 * 
                 */
                public List<ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTREFUNDTICKET.LISTREFUNDAMOUNT> getLISTREFUNDAMOUNT() {
                    if (listrefundamount == null) {
                        listrefundamount = new ArrayList<ACCOUNTABLEDOCUMENTType.AIR.REFUND.LISTREFUNDTICKET.LISTREFUNDAMOUNT>();
                    }
                    return this.listrefundamount;
                }

                /**
                 * Gets the value of the listpenaltycharge property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listpenaltycharge property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTPENALTYCHARGE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AmountType }
                 * 
                 * 
                 */
                public List<AmountType> getLISTPENALTYCHARGE() {
                    if (listpenaltycharge == null) {
                        listpenaltycharge = new ArrayList<AmountType>();
                    }
                    return this.listpenaltycharge;
                }

                /**
                 * Gets the value of the listredemptioninformation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listredemptioninformation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTREDEMPTIONINFORMATION().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LISTREDEMPTIONINFORMATIONType }
                 * 
                 * 
                 */
                public List<LISTREDEMPTIONINFORMATIONType> getLISTREDEMPTIONINFORMATION() {
                    if (listredemptioninformation == null) {
                        listredemptioninformation = new ArrayList<LISTREDEMPTIONINFORMATIONType>();
                    }
                    return this.listredemptioninformation;
                }

                /**
                 * Gets the value of the ismanualprocessneededforfop property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isISMANUALPROCESSNEEDEDFORFOP() {
                    return ismanualprocessneededforfop;
                }

                /**
                 * Sets the value of the ismanualprocessneededforfop property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setISMANUALPROCESSNEEDEDFORFOP(Boolean value) {
                    this.ismanualprocessneededforfop = value;
                }

                /**
                 * Gets the value of the travelfund property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRAVELFUNDSINFORMATIONType }
                 *     
                 */
                public TRAVELFUNDSINFORMATIONType getTRAVELFUND() {
                    return travelfund;
                }

                /**
                 * Sets the value of the travelfund property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRAVELFUNDSINFORMATIONType }
                 *     
                 */
                public void setTRAVELFUND(TRAVELFUNDSINFORMATIONType value) {
                    this.travelfund = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{}REFUND_BALANCE_Type"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="LIST_REFUND_BREAKDOWN" type="{}REFUND_BREAKDOWN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "listrefundbreakdown"
                })
                public static class LISTREFUNDAMOUNT
                    extends REFUNDBALANCEType
                    implements Serializable
                {

                    @XmlElement(name = "LIST_REFUND_BREAKDOWN")
                    protected List<REFUNDBREAKDOWNType> listrefundbreakdown;

                    /**
                     * Gets the value of the listrefundbreakdown property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the listrefundbreakdown property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLISTREFUNDBREAKDOWN().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link REFUNDBREAKDOWNType }
                     * 
                     * 
                     */
                    public List<REFUNDBREAKDOWNType> getLISTREFUNDBREAKDOWN() {
                        if (listrefundbreakdown == null) {
                            listrefundbreakdown = new ArrayList<REFUNDBREAKDOWNType>();
                        }
                        return this.listrefundbreakdown;
                    }

                }

            }

        }

    }

}
