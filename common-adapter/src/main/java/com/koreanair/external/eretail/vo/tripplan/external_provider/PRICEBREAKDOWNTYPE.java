
package com.koreanair.external.eretail.vo.tripplan.external_provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRICE_BREAKDOWN_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRICE_BREAKDOWN_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PRICE_TYPE_EP"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_INCLUDED_PRICE_ELEMENTS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}CODE_NAME"/&gt;
 *                   &lt;element name="AMOUNT" type="{}PRICE_TYPE_EP"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRICE_BREAKDOWN_TYPE", propOrder = {
    "listincludedpriceelements"
})
public class PRICEBREAKDOWNTYPE
    extends PRICETYPEEP
    implements Serializable
{

    @XmlElement(name = "LIST_INCLUDED_PRICE_ELEMENTS")
    protected List<PRICEBREAKDOWNTYPE.LISTINCLUDEDPRICEELEMENTS> listincludedpriceelements;

    /**
     * Gets the value of the listincludedpriceelements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listincludedpriceelements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINCLUDEDPRICEELEMENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRICEBREAKDOWNTYPE.LISTINCLUDEDPRICEELEMENTS }
     * 
     * 
     */
    public List<PRICEBREAKDOWNTYPE.LISTINCLUDEDPRICEELEMENTS> getLISTINCLUDEDPRICEELEMENTS() {
        if (listincludedpriceelements == null) {
            listincludedpriceelements = new ArrayList<PRICEBREAKDOWNTYPE.LISTINCLUDEDPRICEELEMENTS>();
        }
        return this.listincludedpriceelements;
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
     *         &lt;element name="CODE" type="{}CODE_NAME"/&gt;
     *         &lt;element name="AMOUNT" type="{}PRICE_TYPE_EP"/&gt;
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
        "code",
        "amount"
    })
    public static class LISTINCLUDEDPRICEELEMENTS
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected CODENAME code;
        @XmlElement(name = "AMOUNT", required = true)
        protected PRICETYPEEP amount;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAME }
         *     
         */
        public CODENAME getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAME }
         *     
         */
        public void setCODE(CODENAME value) {
            this.code = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link PRICETYPEEP }
         *     
         */
        public PRICETYPEEP getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PRICETYPEEP }
         *     
         */
        public void setAMOUNT(PRICETYPEEP value) {
            this.amount = value;
        }

    }

}
