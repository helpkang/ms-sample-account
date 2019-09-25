
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Prices for one train offer. Up to two prices can be given. One is price that corresponds to requested traveller profile, the other is full fare.
 * 
 * <p>Java class for TRAIN_PRICE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAIN_PRICE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}TRAIN_PRICE_Base_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PRICE" type="{}TRAIN_PRICE_Base_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAIN_PRICE_Type", propOrder = {
    "listprice"
})
public class TRAINPRICEType
    extends TRAINPRICEBaseType
    implements Serializable
{

    @XmlElement(name = "LIST_PRICE")
    protected List<TRAINPRICEBaseType> listprice;

    /**
     * Gets the value of the listprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAINPRICEBaseType }
     * 
     * 
     */
    public List<TRAINPRICEBaseType> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<TRAINPRICEBaseType>();
        }
        return this.listprice;
    }

}
