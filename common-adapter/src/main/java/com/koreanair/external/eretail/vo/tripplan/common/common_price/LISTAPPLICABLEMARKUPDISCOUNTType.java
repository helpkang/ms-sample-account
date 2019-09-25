
package com.koreanair.external.eretail.vo.tripplan.common.common_price;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.FEETYPEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.FEEVALUEType;


/**
 * <p>Java class for LIST_APPLICABLE_MARKUP_DISCOUNT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_APPLICABLE_MARKUP_DISCOUNT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}FEE_TYPE_Type"/&gt;
 *         &lt;element name="LIST_VALUE" type="{}FEE_VALUE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_APPLICABLE_MARKUP_DISCOUNT_Type", propOrder = {
    "type",
    "listvalue"
})
public class LISTAPPLICABLEMARKUPDISCOUNTType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected FEETYPEType type;
    @XmlElement(name = "LIST_VALUE")
    protected List<FEEVALUEType> listvalue;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FEETYPEType }
     *     
     */
    public FEETYPEType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEETYPEType }
     *     
     */
    public void setTYPE(FEETYPEType value) {
        this.type = value;
    }

    /**
     * Gets the value of the listvalue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listvalue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTVALUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEEVALUEType }
     * 
     * 
     */
    public List<FEEVALUEType> getLISTVALUE() {
        if (listvalue == null) {
            listvalue = new ArrayList<FEEVALUEType>();
        }
        return this.listvalue;
    }

}
