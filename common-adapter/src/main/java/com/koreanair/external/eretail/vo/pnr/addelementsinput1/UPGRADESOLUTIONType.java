
package com.koreanair.external.eretail.vo.pnr.addelementsinput1;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UPGRADE_SOLUTIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPGRADE_SOLUTIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOLUTION_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPGRADE_SOLUTIONType", propOrder = {
    "solutionid"
})
public class UPGRADESOLUTIONType
    implements Serializable
{

    @XmlElement(name = "SOLUTION_ID", required = true)
    protected BigInteger solutionid;

    /**
     * Gets the value of the solutionid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSOLUTIONID() {
        return solutionid;
    }

    /**
     * Sets the value of the solutionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSOLUTIONID(BigInteger value) {
        this.solutionid = value;
    }

}
