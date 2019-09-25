
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CODENAMEPAIRTYPE;


/**
 * <p>Java class for CERTIFICATE_SEARCH_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CERTIFICATE_SEARCH_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}LOYALTY_ACCOUNT_Group"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ETICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CERTIFICATES_IDENTIFIERS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NEED_TO_FETCH_DATA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CERTIFICATE_SEARCH_INFORMATIONType", propOrder = {
    "accountnumber",
    "company",
    "type",
    "eticketnumber",
    "certificatesidentifiers",
    "needtofetchdata"
})
public class CERTIFICATESEARCHINFORMATIONType implements Serializable
{

    @XmlElement(name = "ACCOUNT_NUMBER", required = true)
    protected String accountnumber;
    @XmlElement(name = "COMPANY", required = true)
    protected CODENAMEPAIRTYPE company;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "ETICKET_NUMBER")
    protected String eticketnumber;
    @XmlElement(name = "CERTIFICATES_IDENTIFIERS")
    protected CERTIFICATESEARCHINFORMATIONType.CERTIFICATESIDENTIFIERS certificatesidentifiers;
    @XmlElement(name = "NEED_TO_FETCH_DATA")
    protected Boolean needtofetchdata;

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTNUMBER(String value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setCOMPANY(CODENAMEPAIRTYPE value) {
        this.company = value;
    }

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
     * Gets the value of the eticketnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETICKETNUMBER() {
        return eticketnumber;
    }

    /**
     * Sets the value of the eticketnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETICKETNUMBER(String value) {
        this.eticketnumber = value;
    }

    /**
     * Gets the value of the certificatesidentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link CERTIFICATESEARCHINFORMATIONType.CERTIFICATESIDENTIFIERS }
     *     
     */
    public CERTIFICATESEARCHINFORMATIONType.CERTIFICATESIDENTIFIERS getCERTIFICATESIDENTIFIERS() {
        return certificatesidentifiers;
    }

    /**
     * Sets the value of the certificatesidentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CERTIFICATESEARCHINFORMATIONType.CERTIFICATESIDENTIFIERS }
     *     
     */
    public void setCERTIFICATESIDENTIFIERS(CERTIFICATESEARCHINFORMATIONType.CERTIFICATESIDENTIFIERS value) {
        this.certificatesidentifiers = value;
    }

    /**
     * Gets the value of the needtofetchdata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNEEDTOFETCHDATA() {
        return needtofetchdata;
    }

    /**
     * Sets the value of the needtofetchdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNEEDTOFETCHDATA(Boolean value) {
        this.needtofetchdata = value;
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
     *         &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "identifier"
    })
    public static class CERTIFICATESIDENTIFIERS
        implements Serializable
    {

        @XmlElement(name = "IDENTIFIER", required = true)
        protected List<String> identifier;

        /**
         * Gets the value of the identifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDENTIFIER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIDENTIFIER() {
            if (identifier == null) {
                identifier = new ArrayList<String>();
            }
            return this.identifier;
        }

    }

}
