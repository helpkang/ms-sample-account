
package com.koreanair.external.eretail.vo.tripplan.tr_elements;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.TRIPREASON;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrBaseElementsType;


/**
 * This Type is about generic structure that could  not be supported by the CS TR format. All new types should be added inside this type instead of other TR structure
 * 
 * <p>Java class for trGenericTravelRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trGenericTravelRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}trBaseElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}TRIP_REASON" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trGenericTravelRequestType", propOrder = {
    "tripreason"
})
public class TrGenericTravelRequestType
    extends TrBaseElementsType
    implements Serializable
{

    @XmlElement(name = "TRIP_REASON")
    protected TRIPREASON tripreason;

    /**
     * Gets the value of the tripreason property.
     * 
     * @return
     *     possible object is
     *     {@link TRIPREASON }
     *     
     */
    public TRIPREASON getTRIPREASON() {
        return tripreason;
    }

    /**
     * Sets the value of the tripreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIPREASON }
     *     
     */
    public void setTRIPREASON(TRIPREASON value) {
        this.tripreason = value;
    }

}
