
package com.koreanair.external.eretail.vo.fareshopper.fareshoppercommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.fareshopper.fareshoppercommonsimpletypes.BasicExchangeRateType;


/**
 * Sometimes there is no direct conversion rate between two currencies. In that case multiple exchange rates are returned which gives a path of rates from the source to the target currency.
 * 
 * <p>Java class for Complex_ExchangeRate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Complex_ExchangeRate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Basic_ExchangeRate_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PATH" type="{}Basic_ExchangeRate_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Complex_ExchangeRate_Type", propOrder = {
    "listpath"
})
public class ComplexExchangeRateType
    extends BasicExchangeRateType
    implements Serializable
{

    @XmlElement(name = "LIST_PATH")
    protected List<BasicExchangeRateType> listpath;

    /**
     * Gets the value of the listpath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPATH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicExchangeRateType }
     * 
     * 
     */
    public List<BasicExchangeRateType> getLISTPATH() {
        if (listpath == null) {
            listpath = new ArrayList<BasicExchangeRateType>();
        }
        return this.listpath;
    }

}
