
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TOTAL_PRICINGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOTAL_PRICINGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}TOTAL_PRICINGSimpleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAX" type="{}TAXType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOTAL_PRICINGType", propOrder = {
    "tax"
})
public class TOTALPRICINGType
    extends TOTALPRICINGSimpleType
    implements Serializable
{

    @XmlElement(name = "TAX")
    protected List<TAXType> tax;

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAXType }
     * 
     * 
     */
    public List<TAXType> getTAX() {
        if (tax == null) {
            tax = new ArrayList<TAXType>();
        }
        return this.tax;
    }

}
