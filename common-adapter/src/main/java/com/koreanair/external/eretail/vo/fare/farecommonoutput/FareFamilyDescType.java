
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;
import com.koreanair.external.eretail.vo.farecommon.farecommon.FareFamilyType;


/**
 * <p>Java class for fareFamilyDescType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareFamilyDescType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}fareFamilyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}originDestinationGroup" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICE_INFO" type="{}ServiceInfoType" maxOccurs="20" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareFamilyDescType", propOrder = {
    "origindestination",
    "listserviceinfo",
    "listmsg"
})
public class FareFamilyDescType
    extends FareFamilyType
    implements Serializable
{

    @XmlElement(name = "ORIGIN_DESTINATION")
    protected FareFamilyDescType.ORIGINDESTINATION origindestination;
    @XmlElement(name = "LIST_SERVICE_INFO")
    protected List<ServiceInfoType> listserviceinfo;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;

    /**
     * Gets the value of the origindestination property.
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyDescType.ORIGINDESTINATION }
     *     
     */
    public FareFamilyDescType.ORIGINDESTINATION getORIGINDESTINATION() {
        return origindestination;
    }

    /**
     * Sets the value of the origindestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyDescType.ORIGINDESTINATION }
     *     
     */
    public void setORIGINDESTINATION(FareFamilyDescType.ORIGINDESTINATION value) {
        this.origindestination = value;
    }

    /**
     * Gets the value of the listserviceinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listserviceinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceInfoType }
     * 
     * 
     */
    public List<ServiceInfoType> getLISTSERVICEINFO() {
        if (listserviceinfo == null) {
            listserviceinfo = new ArrayList<ServiceInfoType>();
        }
        return this.listserviceinfo;
    }

    /**
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ORIGIN" type="{}cityType"/&gt;
     *         &lt;element name="DESTINATION" type="{}cityType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "origin",
        "destination"
    })
    public static class ORIGINDESTINATION
        implements Serializable
    {

        @XmlElement(name = "ORIGIN", required = true)
        protected CityType origin;
        @XmlElement(name = "DESTINATION", required = true)
        protected CityType destination;

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link CityType }
         *     
         */
        public CityType getORIGIN() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link CityType }
         *     
         */
        public void setORIGIN(CityType value) {
            this.origin = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link CityType }
         *     
         */
        public CityType getDESTINATION() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link CityType }
         *     
         */
        public void setDESTINATION(CityType value) {
            this.destination = value;
        }

    }

}
