
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CODENAMEPAIRTYPE;


/**
 * <p>Java class for NON_REVENUE_PASS_SEARCH_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NON_REVENUE_PASS_SEARCH_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}NON_REVENUE_ACCOUNT_Group"/&gt;
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
@XmlType(name = "NON_REVENUE_PASS_SEARCH_INFORMATIONType", propOrder = {
    "participantid",
    "airline",
    "needtofetchdata"
})
public class NONREVENUEPASSSEARCHINFORMATIONType implements Serializable
{

    @XmlElement(name = "PARTICIPANT_ID", required = true)
    protected String participantid;
    @XmlElement(name = "AIRLINE")
    protected CODENAMEPAIRTYPE airline;
    @XmlElement(name = "NEED_TO_FETCH_DATA")
    protected Boolean needtofetchdata;

    /**
     * Gets the value of the participantid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTICIPANTID() {
        return participantid;
    }

    /**
     * Sets the value of the participantid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTICIPANTID(String value) {
        this.participantid = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setAIRLINE(CODENAMEPAIRTYPE value) {
        this.airline = value;
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

}
