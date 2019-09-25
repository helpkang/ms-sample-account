
package com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_SERVICE_LEVELS_input_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_SERVICE_LEVELS_input_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="SERVICE_LEVEL" type="{}SERVICE_LEVEL_input_Type" maxOccurs="unbounded"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="EXACT_RANKING" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_SERVICE_LEVELS_input_Type", propOrder = {
    "servicelevel",
    "exactranking"
})
public class LISTSERVICELEVELSInputType
    implements Serializable
{

    @XmlElement(name = "SERVICE_LEVEL")
    protected List<SERVICELEVELInputType> servicelevel;
    @XmlElement(name = "EXACT_RANKING")
    protected Object exactranking;

    /**
     * Gets the value of the servicelevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicelevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSERVICELEVEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICELEVELInputType }
     * 
     * 
     */
    public List<SERVICELEVELInputType> getSERVICELEVEL() {
        if (servicelevel == null) {
            servicelevel = new ArrayList<SERVICELEVELInputType>();
        }
        return this.servicelevel;
    }

    /**
     * Gets the value of the exactranking property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEXACTRANKING() {
        return exactranking;
    }

    /**
     * Sets the value of the exactranking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEXACTRANKING(Object value) {
        this.exactranking = value;
    }

}
