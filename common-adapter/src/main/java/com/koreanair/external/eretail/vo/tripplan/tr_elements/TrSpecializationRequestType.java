
package com.koreanair.external.eretail.vo.tripplan.tr_elements;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrBaseElementsType;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrLocation;


/**
 * Search criteria
 * 
 * <p>Java class for trSpecializationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trSpecializationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}trBaseElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EXPECTED_REPLY"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{}trAlphaNumericType"/&gt;
 *                   &lt;element name="NUMBER_MAX_OFFERS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PREFERED_SERVICE_PROVIDER" maxOccurs="3" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REF" type="{}trAlphaNumericType"/&gt;
 *                   &lt;element name="NAME" type="{}trAlphaNumericType"/&gt;
 *                   &lt;element name="CODE" type="{}trAlphaNumericType"/&gt;
 *                   &lt;element name="EXTERNAL_REF" type="{}trAlphaNumericType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACCEPTABLE_RADIUS" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DISTANCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="UNIT" type="{}trAlphaNumericType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TIME_WINDOW" type="{}trAlphaNumericType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="VIA" type="{}trLocation" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="directOption" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trSpecializationRequestType", propOrder = {
    "expectedreply",
    "preferedserviceprovider",
    "acceptableradius",
    "timewindow",
    "via"
})
public class TrSpecializationRequestType
    extends TrBaseElementsType
    implements Serializable
{

    @XmlElement(name = "EXPECTED_REPLY", required = true)
    protected TrSpecializationRequestType.EXPECTEDREPLY expectedreply;
    @XmlElement(name = "PREFERED_SERVICE_PROVIDER")
    protected List<TrSpecializationRequestType.PREFEREDSERVICEPROVIDER> preferedserviceprovider;
    @XmlElement(name = "ACCEPTABLE_RADIUS")
    protected List<TrSpecializationRequestType.ACCEPTABLERADIUS> acceptableradius;
    @XmlElement(name = "TIME_WINDOW")
    protected List<String> timewindow;
    @XmlElement(name = "VIA")
    protected List<TrLocation> via;
    @XmlAttribute(name = "directOption")
    @XmlSchemaType(name = "anySimpleType")
    protected String directOption;

    /**
     * Gets the value of the expectedreply property.
     * 
     * @return
     *     possible object is
     *     {@link TrSpecializationRequestType.EXPECTEDREPLY }
     *     
     */
    public TrSpecializationRequestType.EXPECTEDREPLY getEXPECTEDREPLY() {
        return expectedreply;
    }

    /**
     * Sets the value of the expectedreply property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrSpecializationRequestType.EXPECTEDREPLY }
     *     
     */
    public void setEXPECTEDREPLY(TrSpecializationRequestType.EXPECTEDREPLY value) {
        this.expectedreply = value;
    }

    /**
     * Gets the value of the preferedserviceprovider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferedserviceprovider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPREFEREDSERVICEPROVIDER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrSpecializationRequestType.PREFEREDSERVICEPROVIDER }
     * 
     * 
     */
    public List<TrSpecializationRequestType.PREFEREDSERVICEPROVIDER> getPREFEREDSERVICEPROVIDER() {
        if (preferedserviceprovider == null) {
            preferedserviceprovider = new ArrayList<TrSpecializationRequestType.PREFEREDSERVICEPROVIDER>();
        }
        return this.preferedserviceprovider;
    }

    /**
     * Gets the value of the acceptableradius property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptableradius property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACCEPTABLERADIUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrSpecializationRequestType.ACCEPTABLERADIUS }
     * 
     * 
     */
    public List<TrSpecializationRequestType.ACCEPTABLERADIUS> getACCEPTABLERADIUS() {
        if (acceptableradius == null) {
            acceptableradius = new ArrayList<TrSpecializationRequestType.ACCEPTABLERADIUS>();
        }
        return this.acceptableradius;
    }

    /**
     * Gets the value of the timewindow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timewindow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIMEWINDOW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTIMEWINDOW() {
        if (timewindow == null) {
            timewindow = new ArrayList<String>();
        }
        return this.timewindow;
    }

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVIA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrLocation }
     * 
     * 
     */
    public List<TrLocation> getVIA() {
        if (via == null) {
            via = new ArrayList<TrLocation>();
        }
        return this.via;
    }

    /**
     * Gets the value of the directOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectOption() {
        return directOption;
    }

    /**
     * Sets the value of the directOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectOption(String value) {
        this.directOption = value;
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
     *         &lt;element name="DISTANCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="UNIT" type="{}trAlphaNumericType"/&gt;
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
        "distance",
        "unit"
    })
    public static class ACCEPTABLERADIUS
        implements Serializable
    {

        @XmlElement(name = "DISTANCE", required = true)
        protected BigInteger distance;
        @XmlElement(name = "UNIT", required = true)
        protected String unit;

        /**
         * Gets the value of the distance property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDISTANCE() {
            return distance;
        }

        /**
         * Sets the value of the distance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDISTANCE(BigInteger value) {
            this.distance = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNIT() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNIT(String value) {
            this.unit = value;
        }

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
     *         &lt;element name="TYPE" type="{}trAlphaNumericType"/&gt;
     *         &lt;element name="NUMBER_MAX_OFFERS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "type",
        "numbermaxoffers"
    })
    public static class EXPECTEDREPLY
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "NUMBER_MAX_OFFERS", required = true)
        protected BigInteger numbermaxoffers;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the numbermaxoffers property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMBERMAXOFFERS() {
            return numbermaxoffers;
        }

        /**
         * Sets the value of the numbermaxoffers property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMBERMAXOFFERS(BigInteger value) {
            this.numbermaxoffers = value;
        }

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
     *         &lt;element name="REF" type="{}trAlphaNumericType"/&gt;
     *         &lt;element name="NAME" type="{}trAlphaNumericType"/&gt;
     *         &lt;element name="CODE" type="{}trAlphaNumericType"/&gt;
     *         &lt;element name="EXTERNAL_REF" type="{}trAlphaNumericType"/&gt;
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
        "ref",
        "name",
        "code",
        "externalref"
    })
    public static class PREFEREDSERVICEPROVIDER
        implements Serializable
    {

        @XmlElement(name = "REF", required = true)
        protected String ref;
        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "EXTERNAL_REF", required = true)
        protected String externalref;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREF() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREF(String value) {
            this.ref = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the externalref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEXTERNALREF() {
            return externalref;
        }

        /**
         * Sets the value of the externalref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEXTERNALREF(String value) {
            this.externalref = value;
        }

    }

}
