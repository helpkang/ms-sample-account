
package com.koreanair.eretail.pojo.tripplan.document;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.document_data.DOCUMENTDATA;


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
 *         &lt;element name="DOCUMENT_DATA" type="{}DOCUMENT_DATA"/&gt;
 *         &lt;element name="LIST_PRODUCT_ID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRODUCT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PAYER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "documentdata",
    "listproductid",
    "listtravellerid",
    "listpayerid"
})
@XmlRootElement(name = "DOCUMENT")
public class DOCUMENT
    implements Serializable
{

    @XmlElement(name = "DOCUMENT_DATA", required = true)
    protected DOCUMENTDATA documentdata;
    @XmlElement(name = "LIST_PRODUCT_ID")
    protected List<DOCUMENT.LISTPRODUCTID> listproductid;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<BigInteger> listtravellerid;
    @XmlElement(name = "LIST_PAYER_ID")
    protected List<BigInteger> listpayerid;

    /**
     * Gets the value of the documentdata property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTDATA }
     *     
     */
    public DOCUMENTDATA getDOCUMENTDATA() {
        return documentdata;
    }

    /**
     * Sets the value of the documentdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTDATA }
     *     
     */
    public void setDOCUMENTDATA(DOCUMENTDATA value) {
        this.documentdata = value;
    }

    /**
     * Gets the value of the listproductid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproductid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRODUCTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOCUMENT.LISTPRODUCTID }
     * 
     * 
     */
    public List<DOCUMENT.LISTPRODUCTID> getLISTPRODUCTID() {
        if (listproductid == null) {
            listproductid = new ArrayList<DOCUMENT.LISTPRODUCTID>();
        }
        return this.listproductid;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<BigInteger>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the listpayerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpayerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPAYERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTPAYERID() {
        if (listpayerid == null) {
            listpayerid = new ArrayList<BigInteger>();
        }
        return this.listpayerid;
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
     *         &lt;element name="PRODUCT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "producttype",
        "productid"
    })
    public static class LISTPRODUCTID
        implements Serializable
    {

        @XmlElement(name = "PRODUCT_TYPE", required = true)
        protected String producttype;
        @XmlElement(name = "PRODUCT_ID", required = true)
        protected BigInteger productid;

        /**
         * Gets the value of the producttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCTTYPE() {
            return producttype;
        }

        /**
         * Sets the value of the producttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCTTYPE(String value) {
            this.producttype = value;
        }

        /**
         * Gets the value of the productid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPRODUCTID() {
            return productid;
        }

        /**
         * Sets the value of the productid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPRODUCTID(BigInteger value) {
            this.productid = value;
        }

    }

}
