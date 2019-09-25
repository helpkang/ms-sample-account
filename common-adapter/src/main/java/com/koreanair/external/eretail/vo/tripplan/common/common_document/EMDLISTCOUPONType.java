
package com.koreanair.external.eretail.vo.tripplan.common.common_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.external.eretail.vo.payment.amountcommon.AMOUNTValueType;


/**
 * <p>Java class for EMD_LIST_COUPONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMD_LIST_COUPONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}CommonCouponGroup"/&gt;
 *         &lt;element name="IN_CONNECTION_WITH" type="{}ICWType" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="NOT_VALID_AFTER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NOT_VALID_BEFORE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAGS" type="{}COUPON_FLAGSType" minOccurs="0"/&gt;
 *         &lt;element name="COUPON_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMD_LIST_COUPONType", propOrder = {
    "couponid",
    "rfisc",
    "presentat",
    "presentto",
    "basefare",
    "remark",
    "inconnectionwith",
    "notvalidafter",
    "notvalidbefore",
    "flags",
    "couponstatus"
})
public class EMDLISTCOUPONType
    implements Serializable
{

    @XmlElement(name = "COUPON_ID")
    protected Object couponid;
    @XmlElement(name = "RFISC")
    protected RFISCType rfisc;
    @XmlElement(name = "PRESENT_AT")
    protected Object presentat;
    @XmlElement(name = "PRESENT_TO")
    protected Object presentto;
    @XmlElement(name = "BASE_FARE")
    protected AMOUNTValueType basefare;
    @XmlElement(name = "REMARK")
    protected Object remark;
    @XmlElement(name = "IN_CONNECTION_WITH")
    protected List<ICWType> inconnectionwith;
    @XmlElement(name = "NOT_VALID_AFTER")
    protected EMDLISTCOUPONType.NOTVALIDAFTER notvalidafter;
    @XmlElement(name = "NOT_VALID_BEFORE")
    protected EMDLISTCOUPONType.NOTVALIDBEFORE notvalidbefore;
    @XmlElement(name = "FLAGS")
    protected COUPONFLAGSType flags;
    @XmlElement(name = "COUPON_STATUS")
    protected String couponstatus;

    /**
     * Gets the value of the couponid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOUPONID() {
        return couponid;
    }

    /**
     * Sets the value of the couponid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOUPONID(Object value) {
        this.couponid = value;
    }

    /**
     * Gets the value of the rfisc property.
     * 
     * @return
     *     possible object is
     *     {@link RFISCType }
     *     
     */
    public RFISCType getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFISCType }
     *     
     */
    public void setRFISC(RFISCType value) {
        this.rfisc = value;
    }

    /**
     * Gets the value of the presentat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPRESENTAT() {
        return presentat;
    }

    /**
     * Sets the value of the presentat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPRESENTAT(Object value) {
        this.presentat = value;
    }

    /**
     * Gets the value of the presentto property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPRESENTTO() {
        return presentto;
    }

    /**
     * Sets the value of the presentto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPRESENTTO(Object value) {
        this.presentto = value;
    }

    /**
     * Gets the value of the basefare property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTValueType }
     *     
     */
    public AMOUNTValueType getBASEFARE() {
        return basefare;
    }

    /**
     * Sets the value of the basefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTValueType }
     *     
     */
    public void setBASEFARE(AMOUNTValueType value) {
        this.basefare = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREMARK() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREMARK(Object value) {
        this.remark = value;
    }

    /**
     * Gets the value of the inconnectionwith property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inconnectionwith property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINCONNECTIONWITH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ICWType }
     * 
     * 
     */
    public List<ICWType> getINCONNECTIONWITH() {
        if (inconnectionwith == null) {
            inconnectionwith = new ArrayList<ICWType>();
        }
        return this.inconnectionwith;
    }

    /**
     * Gets the value of the notvalidafter property.
     * 
     * @return
     *     possible object is
     *     {@link EMDLISTCOUPONType.NOTVALIDAFTER }
     *     
     */
    public EMDLISTCOUPONType.NOTVALIDAFTER getNOTVALIDAFTER() {
        return notvalidafter;
    }

    /**
     * Sets the value of the notvalidafter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDLISTCOUPONType.NOTVALIDAFTER }
     *     
     */
    public void setNOTVALIDAFTER(EMDLISTCOUPONType.NOTVALIDAFTER value) {
        this.notvalidafter = value;
    }

    /**
     * Gets the value of the notvalidbefore property.
     * 
     * @return
     *     possible object is
     *     {@link EMDLISTCOUPONType.NOTVALIDBEFORE }
     *     
     */
    public EMDLISTCOUPONType.NOTVALIDBEFORE getNOTVALIDBEFORE() {
        return notvalidbefore;
    }

    /**
     * Sets the value of the notvalidbefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDLISTCOUPONType.NOTVALIDBEFORE }
     *     
     */
    public void setNOTVALIDBEFORE(EMDLISTCOUPONType.NOTVALIDBEFORE value) {
        this.notvalidbefore = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link COUPONFLAGSType }
     *     
     */
    public COUPONFLAGSType getFLAGS() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link COUPONFLAGSType }
     *     
     */
    public void setFLAGS(COUPONFLAGSType value) {
        this.flags = value;
    }

    /**
     * Gets the value of the couponstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUPONSTATUS() {
        return couponstatus;
    }

    /**
     * Sets the value of the couponstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUPONSTATUS(String value) {
        this.couponstatus = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NOTVALIDAFTER
        implements Serializable
    {

        @XmlValue
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "code")
        protected String code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
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
        public void setCode(String value) {
            this.code = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NOTVALIDBEFORE
        implements Serializable
    {

        @XmlValue
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "code")
        protected String code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
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
        public void setCode(String value) {
            this.code = value;
        }

    }

}
