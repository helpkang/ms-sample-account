
package com.koreanair.external.eretail.vo.farecommon.farecontext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_CARRIER_CODE" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CLID_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "listcarriercode",
    "clididentifier"
})
@XmlRootElement(name = "LIST_CLID")
public class LISTCLID
    implements Serializable
{

    @XmlElement(name = "LIST_CARRIER_CODE", required = true)
    protected List<LISTCLID.LISTCARRIERCODE> listcarriercode;
    @XmlElement(name = "CLID_IDENTIFIER", required = true)
    protected String clididentifier;

    /**
     * Gets the value of the listcarriercode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcarriercode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCARRIERCODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCLID.LISTCARRIERCODE }
     * 
     * 
     */
    public List<LISTCLID.LISTCARRIERCODE> getLISTCARRIERCODE() {
        if (listcarriercode == null) {
            listcarriercode = new ArrayList<LISTCLID.LISTCARRIERCODE>();
        }
        return this.listcarriercode;
    }

    /**
     * Gets the value of the clididentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDIDENTIFIER() {
        return clididentifier;
    }

    /**
     * Sets the value of the clididentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDIDENTIFIER(String value) {
        this.clididentifier = value;
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
     *         &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "carriercode"
    })
    public static class LISTCARRIERCODE
        implements Serializable
    {

        @XmlElement(name = "CARRIER_CODE", required = true)
        protected String carriercode;

        /**
         * Gets the value of the carriercode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARRIERCODE() {
            return carriercode;
        }

        /**
         * Sets the value of the carriercode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARRIERCODE(String value) {
            this.carriercode = value;
        }

    }

}
