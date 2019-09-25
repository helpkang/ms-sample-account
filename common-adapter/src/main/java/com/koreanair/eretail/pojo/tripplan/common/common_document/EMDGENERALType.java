
package com.koreanair.eretail.pojo.tripplan.common.common_document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.common.common_fare.VALIDATINGCARRIERType;


/**
 * <p>Java class for EMD_GENERALType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMD_GENERALType"&gt;
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
 *         &lt;element name="VALIDATING_CARRIER" type="{}VALIDATING_CARRIERType" minOccurs="0"/&gt;
 *         &lt;element name="PNR_REC_LOC" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMD_GENERALType", propOrder = {
    "rfic",
    "associationindicator",
    "validatingcarrier",
    "pnrrecloc"
})
public class EMDGENERALType
    implements Serializable
{

    @XmlElement(name = "RFIC")
    protected RFICType rfic;
    @XmlElement(name = "ASSOCIATION_INDICATOR")
    protected String associationindicator;
    @XmlElement(name = "VALIDATING_CARRIER")
    protected VALIDATINGCARRIERType validatingcarrier;
    @XmlElement(name = "PNR_REC_LOC")
    protected String pnrrecloc;

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
     * Gets the value of the pnrrecloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRRECLOC() {
        return pnrrecloc;
    }

    /**
     * Sets the value of the pnrrecloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRRECLOC(String value) {
        this.pnrrecloc = value;
    }

}
