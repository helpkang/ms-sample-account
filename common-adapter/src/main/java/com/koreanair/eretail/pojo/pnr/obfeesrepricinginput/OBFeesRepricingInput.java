
package com.koreanair.eretail.pojo.pnr.obfeesrepricinginput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.payment_group.PAYMENTGROUPType;
import com.koreanair.eretail.pojo.tripplan.payment_group.PAYMENTType;


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
 *         &lt;element name="TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SITE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{}OBFEE_REPRICING_GENERIC_INPUTS" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_GROUP" type="{}PAYMENT_GROUP_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionid",
    "site",
    "language",
    "listtst",
    "globalpayment",
    "reqid",
    "foptype",
    "fopamount",
    "fopccnumber",
    "listincludedsubtypes",
    "listexcludedsubtypes",
    "excludeall",
    "listpassengerassociation",
    "pricingdate",
    "pos",
    "paymentgroup"
})
@XmlRootElement(name = "OBFeesRepricingInput")
public class OBFeesRepricingInput
    implements Serializable
{

    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "LIST_TST")
    protected List<OBFeesRepricingInput.LISTTST> listtst;
    @XmlElement(name = "GLOBAL_PAYMENT")
    protected PAYMENTType globalpayment;
    @XmlElement(name = "REQ_ID")
    protected Object reqid;
    @XmlElement(name = "FOP_TYPE")
    protected String foptype;
    @XmlElement(name = "FOP_AMOUNT")
    protected Float fopamount;
    @XmlElement(name = "FOP_CC_NUMBER")
    protected String fopccnumber;
    @XmlElement(name = "LIST_INCLUDED_SUBTYPES")
    protected List<String> listincludedsubtypes;
    @XmlElement(name = "LIST_EXCLUDED_SUBTYPES")
    protected List<String> listexcludedsubtypes;
    @XmlElement(name = "EXCLUDE_ALL")
    protected Boolean excludeall;
    @XmlElement(name = "LIST_PASSENGER_ASSOCIATION")
    protected List<PASSENGERASSOCIATION> listpassengerassociation;
    @XmlElement(name = "PRICING_DATE")
    protected String pricingdate;
    @XmlElement(name = "POS")
    protected String pos;
    @XmlElement(name = "PAYMENT_GROUP")
    protected List<PAYMENTGROUPType> paymentgroup;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the transactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONID() {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONID(String value) {
        this.transactionid = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITE() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITE(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the listtst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBFeesRepricingInput.LISTTST }
     * 
     * 
     */
    public List<OBFeesRepricingInput.LISTTST> getLISTTST() {
        if (listtst == null) {
            listtst = new ArrayList<OBFeesRepricingInput.LISTTST>();
        }
        return this.listtst;
    }

    /**
     * Gets the value of the globalpayment property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTType }
     *     
     */
    public PAYMENTType getGLOBALPAYMENT() {
        return globalpayment;
    }

    /**
     * Sets the value of the globalpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTType }
     *     
     */
    public void setGLOBALPAYMENT(PAYMENTType value) {
        this.globalpayment = value;
    }

    /**
     * Gets the value of the reqid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREQID() {
        return reqid;
    }

    /**
     * Sets the value of the reqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREQID(Object value) {
        this.reqid = value;
    }

    /**
     * Gets the value of the foptype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOPTYPE() {
        return foptype;
    }

    /**
     * Sets the value of the foptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOPTYPE(String value) {
        this.foptype = value;
    }

    /**
     * Gets the value of the fopamount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFOPAMOUNT() {
        return fopamount;
    }

    /**
     * Sets the value of the fopamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFOPAMOUNT(Float value) {
        this.fopamount = value;
    }

    /**
     * Gets the value of the fopccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOPCCNUMBER() {
        return fopccnumber;
    }

    /**
     * Sets the value of the fopccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOPCCNUMBER(String value) {
        this.fopccnumber = value;
    }

    /**
     * Gets the value of the listincludedsubtypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listincludedsubtypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINCLUDEDSUBTYPES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTINCLUDEDSUBTYPES() {
        if (listincludedsubtypes == null) {
            listincludedsubtypes = new ArrayList<String>();
        }
        return this.listincludedsubtypes;
    }

    /**
     * Gets the value of the listexcludedsubtypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexcludedsubtypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXCLUDEDSUBTYPES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTEXCLUDEDSUBTYPES() {
        if (listexcludedsubtypes == null) {
            listexcludedsubtypes = new ArrayList<String>();
        }
        return this.listexcludedsubtypes;
    }

    /**
     * Gets the value of the excludeall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEXCLUDEALL() {
        return excludeall;
    }

    /**
     * Sets the value of the excludeall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEXCLUDEALL(Boolean value) {
        this.excludeall = value;
    }

    /**
     * Gets the value of the listpassengerassociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpassengerassociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPASSENGERASSOCIATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PASSENGERASSOCIATION }
     * 
     * 
     */
    public List<PASSENGERASSOCIATION> getLISTPASSENGERASSOCIATION() {
        if (listpassengerassociation == null) {
            listpassengerassociation = new ArrayList<PASSENGERASSOCIATION>();
        }
        return this.listpassengerassociation;
    }

    /**
     * Gets the value of the pricingdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICINGDATE() {
        return pricingdate;
    }

    /**
     * Sets the value of the pricingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICINGDATE(String value) {
        this.pricingdate = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOS(String value) {
        this.pos = value;
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
     * {@link PAYMENTGROUPType }
     * 
     * 
     */
    public List<PAYMENTGROUPType> getPAYMENTGROUP() {
        if (paymentgroup == null) {
            paymentgroup = new ArrayList<PAYMENTGROUPType>();
        }
        return this.paymentgroup;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LIST_PAYMENT" type="{}PAYMENT_Type" maxOccurs="3" minOccurs="0"/&gt;
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
        "id",
        "listpayment"
    })
    public static class LISTTST
        implements Serializable
    {

        @XmlElement(name = "ID", required = true)
        protected String id;
        @XmlElement(name = "LIST_PAYMENT")
        protected List<PAYMENTType> listpayment;

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
         * Gets the value of the listpayment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpayment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPAYMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PAYMENTType }
         * 
         * 
         */
        public List<PAYMENTType> getLISTPAYMENT() {
            if (listpayment == null) {
                listpayment = new ArrayList<PAYMENTType>();
            }
            return this.listpayment;
        }

    }

}
