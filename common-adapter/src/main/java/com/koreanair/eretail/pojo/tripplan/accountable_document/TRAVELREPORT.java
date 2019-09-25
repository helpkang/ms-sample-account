
package com.koreanair.eretail.pojo.tripplan.accountable_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRAVEL_REPORT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVEL_REPORT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVEL_REPORT_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ETICKET" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TRAVEL_REPORT", propOrder = {
    "travelreporttype",
    "listeticket"
})
public class TRAVELREPORT
    implements Serializable
{

    @XmlElement(name = "TRAVEL_REPORT_TYPE")
    protected Object travelreporttype;
    @XmlElement(name = "LIST_ETICKET")
    protected List<TRAVELREPORT.LISTETICKET> listeticket;

    /**
     * Gets the value of the travelreporttype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTRAVELREPORTTYPE() {
        return travelreporttype;
    }

    /**
     * Sets the value of the travelreporttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTRAVELREPORTTYPE(Object value) {
        this.travelreporttype = value;
    }

    /**
     * Gets the value of the listeticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTETICKET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELREPORT.LISTETICKET }
     * 
     * 
     */
    public List<TRAVELREPORT.LISTETICKET> getLISTETICKET() {
        if (listeticket == null) {
            listeticket = new ArrayList<TRAVELREPORT.LISTETICKET>();
        }
        return this.listeticket;
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
     *         &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "documentnumber",
        "iseligible",
        "noneligibilityreason"
    })
    public static class LISTETICKET
        implements Serializable
    {

        @XmlElement(name = "DOCUMENT_NUMBER", required = true)
        protected Object documentnumber;
        @XmlElement(name = "IS_ELIGIBLE", required = true)
        protected String iseligible;
        @XmlElement(name = "NON_ELIGIBILITY_REASON")
        protected String noneligibilityreason;

        /**
         * Gets the value of the documentnumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDOCUMENTNUMBER() {
            return documentnumber;
        }

        /**
         * Sets the value of the documentnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDOCUMENTNUMBER(Object value) {
            this.documentnumber = value;
        }

        /**
         * Gets the value of the iseligible property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISELIGIBLE() {
            return iseligible;
        }

        /**
         * Sets the value of the iseligible property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISELIGIBLE(String value) {
            this.iseligible = value;
        }

        /**
         * Gets the value of the noneligibilityreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNONELIGIBILITYREASON() {
            return noneligibilityreason;
        }

        /**
         * Sets the value of the noneligibilityreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNONELIGIBILITYREASON(String value) {
            this.noneligibilityreason = value;
        }

    }

}
