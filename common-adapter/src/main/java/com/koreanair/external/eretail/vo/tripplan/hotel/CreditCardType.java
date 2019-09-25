
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.CodeNameType;


/**
 * CC accepted, and the CC fields to be provided
 * 
 * <p>Java class for CreditCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CodeNameType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MOB_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CC_FIELD" type="{}CreditCardFieldType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardType", propOrder = {
    "mobcode",
    "listccfield"
})
public class CreditCardType
    extends CodeNameType
    implements Serializable
{

    @XmlElement(name = "MOB_CODE")
    protected String mobcode;
    @XmlElement(name = "LIST_CC_FIELD")
    protected List<CreditCardFieldType> listccfield;

    /**
     * Gets the value of the mobcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBCODE() {
        return mobcode;
    }

    /**
     * Sets the value of the mobcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBCODE(String value) {
        this.mobcode = value;
    }

    /**
     * Gets the value of the listccfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listccfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCCFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardFieldType }
     * 
     * 
     */
    public List<CreditCardFieldType> getLISTCCFIELD() {
        if (listccfield == null) {
            listccfield = new ArrayList<CreditCardFieldType>();
        }
        return this.listccfield;
    }

}
