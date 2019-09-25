
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="PROVIDER" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_LUGGAGE" type="{}SPORT_EQUIPMENT_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICE" type="{}SERVICE_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SELECTED_CONTACT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IS_PASSENGER_ASSOCIATED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "providerAndLISTLUGGAGEAndLISTSERVICE"
})
@XmlRootElement(name = "LIST_WEBFARES_ADDITIONAL_INFORMATION")
public class LISTWEBFARESADDITIONALINFORMATION
    implements Serializable
{

    @XmlElements({
        @XmlElement(name = "PROVIDER", type = String.class),
        @XmlElement(name = "LIST_LUGGAGE", type = SPORTEQUIPMENTType.class),
        @XmlElement(name = "LIST_SERVICE", type = SERVICEType.class),
        @XmlElement(name = "LIST_SELECTED_CONTACT", type = LISTWEBFARESADDITIONALINFORMATION.LISTSELECTEDCONTACT.class)
    })
    protected List<Serializable> providerAndLISTLUGGAGEAndLISTSERVICE;

    /**
     * Gets the value of the providerAndLISTLUGGAGEAndLISTSERVICE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerAndLISTLUGGAGEAndLISTSERVICE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROVIDERAndLISTLUGGAGEAndLISTSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link SPORTEQUIPMENTType }
     * {@link SERVICEType }
     * {@link LISTWEBFARESADDITIONALINFORMATION.LISTSELECTEDCONTACT }
     * 
     * 
     */
    public List<Serializable> getPROVIDERAndLISTLUGGAGEAndLISTSERVICE() {
        if (providerAndLISTLUGGAGEAndLISTSERVICE == null) {
            providerAndLISTLUGGAGEAndLISTSERVICE = new ArrayList<Serializable>();
        }
        return this.providerAndLISTLUGGAGEAndLISTSERVICE;
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
     *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IS_PASSENGER_ASSOCIATED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "index",
        "contactid",
        "ispassengerassociated"
    })
    public static class LISTSELECTEDCONTACT implements Serializable
    {

        @XmlElement(name = "INDEX")
        protected BigInteger index;
        @XmlElement(name = "CONTACT_ID", required = true)
        protected String contactid;
        @XmlElement(name = "IS_PASSENGER_ASSOCIATED")
        protected Boolean ispassengerassociated;

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getINDEX() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setINDEX(BigInteger value) {
            this.index = value;
        }

        /**
         * Gets the value of the contactid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTACTID() {
            return contactid;
        }

        /**
         * Sets the value of the contactid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTACTID(String value) {
            this.contactid = value;
        }

        /**
         * Gets the value of the ispassengerassociated property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISPASSENGERASSOCIATED() {
            return ispassengerassociated;
        }

        /**
         * Sets the value of the ispassengerassociated property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISPASSENGERASSOCIATED(Boolean value) {
            this.ispassengerassociated = value;
        }

    }

}
