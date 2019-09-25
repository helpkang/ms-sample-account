
package com.koreanair.eretail.pojo.ticketchanger.ticketchangercommoninput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_TICKET_FOR_REPRICE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TICKET_FOR_REPRICE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENT_NUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;pattern value="\d{13}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ASSOCIATED_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FUTURE_USE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TICKET_FOR_REPRICE_Type", propOrder = {
    "documentnumber",
    "associatedtravellerid",
    "futureuse"
})
public class LISTTICKETFORREPRICEType
    implements Serializable
{

    @XmlElement(name = "DOCUMENT_NUMBER", required = true)
    protected String documentnumber;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_ID", required = true)
    protected BigInteger associatedtravellerid;
    @XmlElement(name = "FUTURE_USE")
    protected Boolean futureuse;

    /**
     * Gets the value of the documentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTNUMBER() {
        return documentnumber;
    }

    /**
     * Sets the value of the documentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTNUMBER(String value) {
        this.documentnumber = value;
    }

    /**
     * Gets the value of the associatedtravellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getASSOCIATEDTRAVELLERID() {
        return associatedtravellerid;
    }

    /**
     * Sets the value of the associatedtravellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setASSOCIATEDTRAVELLERID(BigInteger value) {
        this.associatedtravellerid = value;
    }

    /**
     * Gets the value of the futureuse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFUTUREUSE() {
        return futureuse;
    }

    /**
     * Sets the value of the futureuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFUTUREUSE(Boolean value) {
        this.futureuse = value;
    }

}
