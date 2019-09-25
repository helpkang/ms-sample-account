
package com.koreanair.external.eretail.vo.pnr.addelementsinput1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_PACKAGEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PACKAGEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_ROOM" type="{}LIST_ROOMType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PACKAGEType", propOrder = {
    "listroom"
})
public class LISTPACKAGEType
    implements Serializable
{

    @XmlElement(name = "LIST_ROOM", required = true)
    protected LISTROOMType listroom;

    /**
     * Gets the value of the listroom property.
     * 
     * @return
     *     possible object is
     *     {@link LISTROOMType }
     *     
     */
    public LISTROOMType getLISTROOM() {
        return listroom;
    }

    /**
     * Sets the value of the listroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTROOMType }
     *     
     */
    public void setLISTROOM(LISTROOMType value) {
        this.listroom = value;
    }

}
