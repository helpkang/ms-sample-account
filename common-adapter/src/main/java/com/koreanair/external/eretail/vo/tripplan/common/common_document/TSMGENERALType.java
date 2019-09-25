
package com.koreanair.external.eretail.vo.tripplan.common.common_document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.tripplan.common.common_fare.VALIDATINGCARRIERType;


/**
 * <p>Java class for TSM_GENERALType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSM_GENERALType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFIC" type="{}RFICType" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATION_INDICATOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="S"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CREATION_INFO" type="{}CREATION_INFOType" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTING_DATA" type="{}TASF_SPECIFICType" minOccurs="0"/&gt;
 *         &lt;element name="VALIDATING_CARRIER" type="{}VALIDATING_CARRIERType" minOccurs="0"/&gt;
 *         &lt;element name="ROUTE_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="I"/&gt;
 *               &lt;enumeration value="D"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PC_FLAG" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_TICKETED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_DELETED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_INITIAL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IS_ISSUANCE_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="REMARK" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSM_GENERALType", propOrder = {
    "rfic",
    "associationindicator",
    "creationinfo",
    "accountingdata",
    "validatingcarrier",
    "routetype",
    "pcflag",
    "isticketed",
    "isdeleted",
    "isinitial",
    "isissuancerequired",
    "remark"
})
public class TSMGENERALType
    implements Serializable
{

    @XmlElement(name = "RFIC")
    protected RFICType rfic;
    @XmlElement(name = "ASSOCIATION_INDICATOR")
    protected String associationindicator;
    @XmlElement(name = "CREATION_INFO")
    protected CREATIONINFOType creationinfo;
    @XmlElement(name = "ACCOUNTING_DATA")
    protected TASFSPECIFICType accountingdata;
    @XmlElement(name = "VALIDATING_CARRIER")
    protected VALIDATINGCARRIERType validatingcarrier;
    @XmlElement(name = "ROUTE_TYPE")
    protected String routetype;
    @XmlElement(name = "PC_FLAG")
    protected Object pcflag;
    @XmlElement(name = "IS_TICKETED")
    protected Object isticketed;
    @XmlElement(name = "IS_DELETED")
    protected Object isdeleted;
    @XmlElement(name = "IS_INITIAL")
    protected Object isinitial;
    @XmlElement(name = "IS_ISSUANCE_REQUIRED")
    protected Object isissuancerequired;
    @XmlElement(name = "REMARK")
    protected Object remark;

    /**
     * Gets the value of the rfic property.
     * 
     * @return
     *     possible object is
     *     {@link RFICType }
     *     
     */
    public RFICType getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFICType }
     *     
     */
    public void setRFIC(RFICType value) {
        this.rfic = value;
    }

    /**
     * Gets the value of the associationindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSOCIATIONINDICATOR() {
        return associationindicator;
    }

    /**
     * Sets the value of the associationindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSOCIATIONINDICATOR(String value) {
        this.associationindicator = value;
    }

    /**
     * Gets the value of the creationinfo property.
     * 
     * @return
     *     possible object is
     *     {@link CREATIONINFOType }
     *     
     */
    public CREATIONINFOType getCREATIONINFO() {
        return creationinfo;
    }

    /**
     * Sets the value of the creationinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREATIONINFOType }
     *     
     */
    public void setCREATIONINFO(CREATIONINFOType value) {
        this.creationinfo = value;
    }

    /**
     * Gets the value of the accountingdata property.
     * 
     * @return
     *     possible object is
     *     {@link TASFSPECIFICType }
     *     
     */
    public TASFSPECIFICType getACCOUNTINGDATA() {
        return accountingdata;
    }

    /**
     * Sets the value of the accountingdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TASFSPECIFICType }
     *     
     */
    public void setACCOUNTINGDATA(TASFSPECIFICType value) {
        this.accountingdata = value;
    }

    /**
     * Gets the value of the validatingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link VALIDATINGCARRIERType }
     *     
     */
    public VALIDATINGCARRIERType getVALIDATINGCARRIER() {
        return validatingcarrier;
    }

    /**
     * Sets the value of the validatingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALIDATINGCARRIERType }
     *     
     */
    public void setVALIDATINGCARRIER(VALIDATINGCARRIERType value) {
        this.validatingcarrier = value;
    }

    /**
     * Gets the value of the routetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTETYPE() {
        return routetype;
    }

    /**
     * Sets the value of the routetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTETYPE(String value) {
        this.routetype = value;
    }

    /**
     * Gets the value of the pcflag property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPCFLAG() {
        return pcflag;
    }

    /**
     * Sets the value of the pcflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPCFLAG(Object value) {
        this.pcflag = value;
    }

    /**
     * Gets the value of the isticketed property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISTICKETED() {
        return isticketed;
    }

    /**
     * Sets the value of the isticketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISTICKETED(Object value) {
        this.isticketed = value;
    }

    /**
     * Gets the value of the isdeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISDELETED() {
        return isdeleted;
    }

    /**
     * Sets the value of the isdeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISDELETED(Object value) {
        this.isdeleted = value;
    }

    /**
     * Gets the value of the isinitial property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISINITIAL() {
        return isinitial;
    }

    /**
     * Sets the value of the isinitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISINITIAL(Object value) {
        this.isinitial = value;
    }

    /**
     * Gets the value of the isissuancerequired property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISISSUANCEREQUIRED() {
        return isissuancerequired;
    }

    /**
     * Sets the value of the isissuancerequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISISSUANCEREQUIRED(Object value) {
        this.isissuancerequired = value;
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

}
