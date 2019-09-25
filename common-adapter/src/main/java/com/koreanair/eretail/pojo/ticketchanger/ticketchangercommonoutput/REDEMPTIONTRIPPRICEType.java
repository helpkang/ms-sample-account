
package com.koreanair.eretail.pojo.ticketchanger.ticketchangercommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.AMOUNTSIMPLEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.CURRENCYType;


/**
 * <p>Java class for REDEMPTION_TRIP_PRICE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDEMPTION_TRIP_PRICE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AMOUNT_SIMPLE_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CURRENCY" type="{}CURRENCY_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDEMPTION_TRIP_PRICE_Type", propOrder = {
    "currency"
})
public class REDEMPTIONTRIPPRICEType
    extends AMOUNTSIMPLEType
    implements Serializable
{

    @XmlElement(name = "CURRENCY", required = true)
    protected CURRENCYType currency;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCYType }
     *     
     */
    public CURRENCYType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCYType }
     *     
     */
    public void setCURRENCY(CURRENCYType value) {
        this.currency = value;
    }

}
