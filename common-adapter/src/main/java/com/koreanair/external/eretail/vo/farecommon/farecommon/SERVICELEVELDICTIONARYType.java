
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SERVICE_LEVEL_DICTIONARY_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICE_LEVEL_DICTIONARY_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_SERVICE_LEVEL" type="{}DESC_SERVICE_LEVEL_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICE_LEVEL_DICTIONARY_Type", propOrder = {
    "listservicelevel"
})
public class SERVICELEVELDICTIONARYType
    implements Serializable
{

    @XmlElement(name = "LIST_SERVICE_LEVEL", required = true)
    protected List<DESCSERVICELEVELType> listservicelevel;

    /**
     * Gets the value of the listservicelevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicelevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICELEVEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESCSERVICELEVELType }
     * 
     * 
     */
    public List<DESCSERVICELEVELType> getLISTSERVICELEVEL() {
        if (listservicelevel == null) {
            listservicelevel = new ArrayList<DESCSERVICELEVELType>();
        }
        return this.listservicelevel;
    }

}
