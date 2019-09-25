
package com.koreanair.external.eretail.vo.tripplan.traveller_information_ff;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Frequent flyer information  
 * 
 * <p>Java class for LIST_FREQUENT_FLYER_TYPE_FF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FREQUENT_FLYER_TYPE_FF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_FREQUENT_FLYER_TYPE_FF", propOrder = {

})
@XmlSeeAlso({
    com.koreanair.external.eretail.vo.tripplan.traveller_information_ff.TRAVELLERINFORMATIONFF.LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER.class
})
public class LISTFREQUENTFLYERTYPEFF
    implements Serializable
{

    @XmlElement(name = "COMPANY_ACCOUNT_ID", required = true)
    protected BigInteger companyaccountid;

    /**
     * Gets the value of the companyaccountid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOMPANYACCOUNTID() {
        return companyaccountid;
    }

    /**
     * Sets the value of the companyaccountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOMPANYACCOUNTID(BigInteger value) {
        this.companyaccountid = value;
    }

}
