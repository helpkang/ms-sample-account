
package com.koreanair.external.eretail.vo.tripplan.common.common_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.koreanair.external.eretail.vo.payment.amountcommon.AMOUNTValueType;


/**
 * <p>Java class for LIST_TSM_COUPONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TSM_COUPONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}CommonCouponGroup"/&gt;
 *         &lt;element name="SERVICE" type="{}SERVICEType" minOccurs="0"/&gt;
 *         &lt;element name="ADDITIONAL_INFORMATION" type="{}ADDITIONAL_INFORMATIONType" minOccurs="0"/&gt;
 *         &lt;element name="FEE_OWNER" type="{}FEE_OWNERType" minOccurs="0"/&gt;
 *         &lt;element name="ICW" type="{}ICWType" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="NVA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NVB" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAGS" type="{}COUPON_FLAGSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TSM_COUPONType", propOrder = {
    "couponid",
    "rfisc",
    "presentat",
    "presentto",
    "basefare",
    "remark",
    "service",
    "additionalinformation",
    "feeowner",
    "icw",
    "nva",
    "nvb",
    "flags"
})
public class LISTTSMCOUPONType
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
    @XmlElement(name = "SERVICE")
    protected SERVICEType service;
    @XmlElement(name = "ADDITIONAL_INFORMATION")
    protected ADDITIONALINFORMATIONType additionalinformation;
    @XmlElement(name = "FEE_OWNER")
    protected FEEOWNERType feeowner;
    @XmlElement(name = "ICW")
    protected List<ICWType> icw;
    @XmlElement(name = "NVA")
    protected LISTTSMCOUPONType.NVA nva;
    @XmlElement(name = "NVB")
    protected LISTTSMCOUPONType.NVB nvb;
    @XmlElement(name = "FLAGS")
    protected COUPONFLAGSType flags;

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
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEType }
     *     
     */
    public SERVICEType getSERVICE() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEType }
     *     
     */
    public void setSERVICE(SERVICEType value) {
        this.service = value;
    }

    /**
     * Gets the value of the additionalinformation property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALINFORMATIONType }
     *     
     */
    public ADDITIONALINFORMATIONType getADDITIONALINFORMATION() {
        return additionalinformation;
    }

    /**
     * Sets the value of the additionalinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALINFORMATIONType }
     *     
     */
    public void setADDITIONALINFORMATION(ADDITIONALINFORMATIONType value) {
        this.additionalinformation = value;
    }

    /**
     * Gets the value of the feeowner property.
     * 
     * @return
     *     possible object is
     *     {@link FEEOWNERType }
     *     
     */
    public FEEOWNERType getFEEOWNER() {
        return feeowner;
    }

    /**
     * Sets the value of the feeowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEEOWNERType }
     *     
     */
    public void setFEEOWNER(FEEOWNERType value) {
        this.feeowner = value;
    }

    /**
     * Gets the value of the icw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getICW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ICWType }
     * 
     * 
     */
    public List<ICWType> getICW() {
        if (icw == null) {
            icw = new ArrayList<ICWType>();
        }
        return this.icw;
    }

    /**
     * Gets the value of the nva property.
     * 
     * @return
     *     possible object is
     *     {@link LISTTSMCOUPONType.NVA }
     *     
     */
    public LISTTSMCOUPONType.NVA getNVA() {
        return nva;
    }

    /**
     * Sets the value of the nva property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTTSMCOUPONType.NVA }
     *     
     */
    public void setNVA(LISTTSMCOUPONType.NVA value) {
        this.nva = value;
    }

    /**
     * Gets the value of the nvb property.
     * 
     * @return
     *     possible object is
     *     {@link LISTTSMCOUPONType.NVB }
     *     
     */
    public LISTTSMCOUPONType.NVB getNVB() {
        return nvb;
    }

    /**
     * Sets the value of the nvb property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTTSMCOUPONType.NVB }
     *     
     */
    public void setNVB(LISTTSMCOUPONType.NVB value) {
        this.nvb = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
    public static class NVA
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code")
        protected String code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
    public static class NVB
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code")
        protected String code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
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
