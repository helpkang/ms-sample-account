
package com.koreanair.eretail.pojo.pnr.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODE_NUMBER_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODE_NUMBER_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CODE_NAME_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODE_NUMBER_TYPE", propOrder = {
    "number"
})
public class CODENUMBERTYPE
    extends CODENAMETYPE
{

    @XmlElement(name = "NUMBER", required = true)
    protected BigInteger number;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBER(BigInteger value) {
        this.number = value;
    }

}
