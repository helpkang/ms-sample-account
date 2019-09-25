
package com.koreanair.external.eretail.vo.flexpricer.flexpricercommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_SERVICE_LEVELS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_SERVICE_LEVELS_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SERVICE_LEVEL" type="{}SERVICE_LEVEL_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_SERVICE_LEVELS_Type", propOrder = {
    "servicelevel"
})
public class LISTSERVICELEVELSType
    implements Serializable
{

    @XmlElement(name = "SERVICE_LEVEL", required = true)
    protected List<SERVICELEVELType> servicelevel;

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
     * {@link SERVICELEVELType }
     * 
     * 
     */
    public List<SERVICELEVELType> getSERVICELEVEL() {
        if (servicelevel == null) {
            servicelevel = new ArrayList<SERVICELEVELType>();
        }
        return this.servicelevel;
    }

}
