
package com.koreanair.external.eretail.vo.tripplan.common.common_car;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The car availability validity information needed if a Car Sell From Availability is done
 * 
 * <p>Java class for validityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validityInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TOKEN" type="{}validityToken" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PERIOD" type="{}validityPeriod"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validityInformation", propOrder = {
    "listtoken",
    "period"
})
public class ValidityInformation
    implements Serializable
{

    @XmlElement(name = "LIST_TOKEN")
    protected List<ValidityToken> listtoken;
    @XmlElement(name = "PERIOD", required = true)
    protected ValidityPeriod period;

    /**
     * Gets the value of the listtoken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtoken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTOKEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidityToken }
     * 
     * 
     */
    public List<ValidityToken> getLISTTOKEN() {
        if (listtoken == null) {
            listtoken = new ArrayList<ValidityToken>();
        }
        return this.listtoken;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriod }
     *     
     */
    public ValidityPeriod getPERIOD() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriod }
     *     
     */
    public void setPERIOD(ValidityPeriod value) {
        this.period = value;
    }

}
