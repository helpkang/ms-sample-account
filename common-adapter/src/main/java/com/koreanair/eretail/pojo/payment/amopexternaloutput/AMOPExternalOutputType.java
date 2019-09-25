
package com.koreanair.eretail.pojo.payment.amopexternaloutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Define the external payment data used with an external provider
 * 
 * <p>Java class for AMOPExternalOutput_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMOPExternalOutput_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="REDIRECTION"/&gt;
 *               &lt;enumeration value="FRAME"/&gt;
 *               &lt;enumeration value="POPUP"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HTTP" type="{}HTTP_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMOPExternalOutput_Type", propOrder = {
    "type",
    "http"
})
public class AMOPExternalOutputType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "HTTP", required = true)
    protected HTTPType http;

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
     * Gets the value of the http property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPType }
     *     
     */
    public HTTPType getHTTP() {
        return http;
    }

    /**
     * Sets the value of the http property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPType }
     *     
     */
    public void setHTTP(HTTPType value) {
        this.http = value;
    }

}
