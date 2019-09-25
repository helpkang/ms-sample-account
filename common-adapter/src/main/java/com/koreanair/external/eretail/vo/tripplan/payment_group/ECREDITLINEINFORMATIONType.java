
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECREDIT_LINE_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECREDIT_LINE_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ECREDIT_LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECREDIT_LINE_INFORMATION_Type", propOrder = {
    "ecreditlineid",
    "travellername",
    "airlinecode",
    "accountbalance"
})
public class ECREDITLINEINFORMATIONType implements Serializable
{

    @XmlElement(name = "ECREDIT_LINE_ID")
    protected String ecreditlineid;
    @XmlElement(name = "TRAVELLER_NAME")
    protected String travellername;
    @XmlElement(name = "AIRLINE_CODE")
    protected String airlinecode;
    @XmlElement(name = "ACCOUNT_BALANCE")
    protected String accountbalance;

    /**
     * Gets the value of the ecreditlineid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECREDITLINEID() {
        return ecreditlineid;
    }

    /**
     * Sets the value of the ecreditlineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECREDITLINEID(String value) {
        this.ecreditlineid = value;
    }

    /**
     * Gets the value of the travellername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERNAME() {
        return travellername;
    }

    /**
     * Sets the value of the travellername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERNAME(String value) {
        this.travellername = value;
    }

    /**
     * Gets the value of the airlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINECODE() {
        return airlinecode;
    }

    /**
     * Sets the value of the airlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINECODE(String value) {
        this.airlinecode = value;
    }

    /**
     * Gets the value of the accountbalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTBALANCE() {
        return accountbalance;
    }

    /**
     * Sets the value of the accountbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTBALANCE(String value) {
        this.accountbalance = value;
    }

}
