
package com.koreanair.external.eretail.vo.flexpricer.flexpricercommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;
import com.koreanair.external.eretail.vo.flexpricer.farefamilydescriptioncommon.CityType;
import com.koreanair.external.eretail.vo.flexpricer.farefamilydescriptioncommon.ServiceInfoType;


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
 *         &lt;element name="FARE_FAMILY" type="{}FARE_FAMILY_Type"/&gt;
 *         &lt;element name="DESCRIPTION" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SHORT_DESCRIPTION" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="URI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;group ref="{}FareFamilyDescriptionGrp"/&gt;
 *         &lt;/sequence&gt;
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
    "farefamily",
    "description",
    "shortdescription",
    "uri",
    "origindestination",
    "airlinename",
    "listserviceinfo",
    "listmsg"
})
@XmlRootElement(name = "LIST_RULES")
public class LISTRULES
    implements Serializable
{

    @XmlElement(name = "FARE_FAMILY", required = true)
    protected FAREFAMILYType farefamily;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "SHORT_DESCRIPTION")
    protected String shortdescription;
    @XmlElement(name = "URI")
    protected String uri;
    @XmlElement(name = "ORIGIN_DESTINATION")
    protected LISTRULES.ORIGINDESTINATION origindestination;
    @XmlElement(name = "AIRLINE_NAME")
    protected CodeDescriptorType airlinename;
    @XmlElement(name = "LIST_SERVICE_INFO")
    protected List<ServiceInfoType> listserviceinfo;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FAREFAMILYType }
     *     
     */
    public FAREFAMILYType getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREFAMILYType }
     *     
     */
    public void setFAREFAMILY(FAREFAMILYType value) {
        this.farefamily = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the shortdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHORTDESCRIPTION() {
        return shortdescription;
    }

    /**
     * Sets the value of the shortdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHORTDESCRIPTION(String value) {
        this.shortdescription = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the origindestination property.
     * 
     * @return
     *     possible object is
     *     {@link LISTRULES.ORIGINDESTINATION }
     *     
     */
    public LISTRULES.ORIGINDESTINATION getORIGINDESTINATION() {
        return origindestination;
    }

    /**
     * Sets the value of the origindestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTRULES.ORIGINDESTINATION }
     *     
     */
    public void setORIGINDESTINATION(LISTRULES.ORIGINDESTINATION value) {
        this.origindestination = value;
    }

    /**
     * Gets the value of the airlinename property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getAIRLINENAME() {
        return airlinename;
    }

    /**
     * Sets the value of the airlinename property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setAIRLINENAME(CodeDescriptorType value) {
        this.airlinename = value;
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
