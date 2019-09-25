
package com.koreanair.external.eretail.vo.farecommon.farediscount;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of fare discount credentials.
 * 
 * <p>Java class for listDiscountCredentialsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listDiscountCredentialsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISCOUNT_NAME" type="{}unprotectedStringType"/&gt;
 *         &lt;element ref="{}DISCOUNT_CODE"/&gt;
 *         &lt;group ref="{}FareContextCredentialData_Group"/&gt;
 *         &lt;group ref="{}CommonCredentialData_Group"/&gt;
 *         &lt;element name="LIST_ASSOCIATED_SEGMENT" type="{}ListSegmentAssociated_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listDiscountCredentialsType", propOrder = {
    "discountname",
    "discountcode",
    "travellerid",
    "ptnumber",
    "paxcategory",
    "travellertype",
    "areacode",
    "largefamilycertnum",
    "spanishresidentcertnum",
    "idcardnum",
    "dateofbirth",
    "listassociatedsegment"
})
public class ListDiscountCredentialsType
    implements Serializable
{

    @XmlElement(name = "DISCOUNT_NAME", required = true)
    protected String discountname;
    @XmlElement(name = "DISCOUNT_CODE", required = true)
    protected String discountcode;
    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "PT_NUMBER")
    protected BigInteger ptnumber;
    @XmlElement(name = "PAX_CATEGORY")
    protected String paxcategory;
    @XmlElement(name = "TRAVELLER_TYPE")
    protected String travellertype;
    @XmlElement(name = "AREA_CODE")
    protected String areacode;
    @XmlElement(name = "LARGE_FAMILY_CERT_NUM")
    protected String largefamilycertnum;
    @XmlElement(name = "SPANISH_RESIDENT_CERT_NUM")
    protected String spanishresidentcertnum;
    @XmlElement(name = "ID_CARD_NUM")
    protected String idcardnum;
    @XmlElement(name = "DATE_OF_BIRTH")
    protected String dateofbirth;
    @XmlElement(name = "LIST_ASSOCIATED_SEGMENT")
    protected List<ListSegmentAssociatedType> listassociatedsegment;

    /**
     * Gets the value of the discountname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTNAME() {
        return discountname;
    }

    /**
     * Sets the value of the discountname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTNAME(String value) {
        this.discountname = value;
    }

    /**
     * Gets the value of the discountcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTCODE() {
        return discountcode;
    }

    /**
     * Sets the value of the discountcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTCODE(String value) {
        this.discountcode = value;
    }

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the ptnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPTNUMBER() {
        return ptnumber;
    }

    /**
     * Sets the value of the ptnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPTNUMBER(BigInteger value) {
        this.ptnumber = value;
    }

    /**
     * Gets the value of the paxcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAXCATEGORY() {
        return paxcategory;
    }

    /**
     * Sets the value of the paxcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAXCATEGORY(String value) {
        this.paxcategory = value;
    }

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERTYPE(String value) {
        this.travellertype = value;
    }

    /**
     * Gets the value of the areacode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREACODE() {
        return areacode;
    }

    /**
     * Sets the value of the areacode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREACODE(String value) {
        this.areacode = value;
    }

    /**
     * Gets the value of the largefamilycertnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLARGEFAMILYCERTNUM() {
        return largefamilycertnum;
    }

    /**
     * Sets the value of the largefamilycertnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLARGEFAMILYCERTNUM(String value) {
        this.largefamilycertnum = value;
    }

    /**
     * Gets the value of the spanishresidentcertnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPANISHRESIDENTCERTNUM() {
        return spanishresidentcertnum;
    }

    /**
     * Sets the value of the spanishresidentcertnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPANISHRESIDENTCERTNUM(String value) {
        this.spanishresidentcertnum = value;
    }

    /**
     * Gets the value of the idcardnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCARDNUM() {
        return idcardnum;
    }

    /**
     * Sets the value of the idcardnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCARDNUM(String value) {
        this.idcardnum = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOFBIRTH(String value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the listassociatedsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listassociatedsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTASSOCIATEDSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListSegmentAssociatedType }
     * 
     * 
     */
    public List<ListSegmentAssociatedType> getLISTASSOCIATEDSEGMENT() {
        if (listassociatedsegment == null) {
            listassociatedsegment = new ArrayList<ListSegmentAssociatedType>();
        }
        return this.listassociatedsegment;
    }

}
