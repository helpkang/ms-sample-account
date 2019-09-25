
package com.koreanair.eretail.pojo.tripplan.external_provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOCATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCATION"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GEO_COORDINATES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION_CODE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LOCATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IDENTIFIER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LOCATION_ADDRESS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_STREET_LINE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="POSTAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CITY" type="{}CODE_VALUE" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_SUBDIVISION" type="{}CODE_VALUE" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY" type="{}CODE_VALUE" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IDENTIFIER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CITY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROVINCE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COUNTRY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCATION", propOrder = {
    "geocoordinates",
    "locationcode",
    "locationaddress",
    "locationname",
    "locationtype",
    "identifiertype",
    "identifier",
    "address",
    "city",
    "province",
    "country"
})
public class LOCATION
    implements Serializable
{

    @XmlElement(name = "GEO_COORDINATES")
    protected String geocoordinates;
    @XmlElement(name = "LOCATION_CODE")
    protected LOCATION.LOCATIONCODE locationcode;
    @XmlElement(name = "LOCATION_ADDRESS")
    protected LOCATION.LOCATIONADDRESS locationaddress;
    @XmlElement(name = "LOCATION_NAME")
    protected String locationname;
    @XmlElement(name = "LOCATION_TYPE")
    protected Object locationtype;
    @XmlElement(name = "IDENTIFIER_TYPE")
    protected String identifiertype;
    @XmlElement(name = "IDENTIFIER")
    protected String identifier;
    @XmlElement(name = "ADDRESS")
    protected String address;
    @XmlElement(name = "CITY")
    protected LOCATION.CITY city;
    @XmlElement(name = "PROVINCE")
    protected LOCATION.PROVINCE province;
    @XmlElement(name = "COUNTRY")
    protected LOCATION.COUNTRY country;

    /**
     * Gets the value of the geocoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEOCOORDINATES() {
        return geocoordinates;
    }

    /**
     * Sets the value of the geocoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEOCOORDINATES(String value) {
        this.geocoordinates = value;
    }

    /**
     * Gets the value of the locationcode property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATION.LOCATIONCODE }
     *     
     */
    public LOCATION.LOCATIONCODE getLOCATIONCODE() {
        return locationcode;
    }

    /**
     * Sets the value of the locationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATION.LOCATIONCODE }
     *     
     */
    public void setLOCATIONCODE(LOCATION.LOCATIONCODE value) {
        this.locationcode = value;
    }

    /**
     * Gets the value of the locationaddress property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATION.LOCATIONADDRESS }
     *     
     */
    public LOCATION.LOCATIONADDRESS getLOCATIONADDRESS() {
        return locationaddress;
    }

    /**
     * Sets the value of the locationaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATION.LOCATIONADDRESS }
     *     
     */
    public void setLOCATIONADDRESS(LOCATION.LOCATIONADDRESS value) {
        this.locationaddress = value;
    }

    /**
     * Gets the value of the locationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONNAME() {
        return locationname;
    }

    /**
     * Sets the value of the locationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONNAME(String value) {
        this.locationname = value;
    }

    /**
     * Gets the value of the locationtype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLOCATIONTYPE() {
        return locationtype;
    }

    /**
     * Sets the value of the locationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLOCATIONTYPE(Object value) {
        this.locationtype = value;
    }

    /**
     * Gets the value of the identifiertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFIERTYPE() {
        return identifiertype;
    }

    /**
     * Sets the value of the identifiertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFIERTYPE(String value) {
        this.identifiertype = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFIER() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFIER(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATION.CITY }
     *     
     */
    public LOCATION.CITY getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATION.CITY }
     *     
     */
    public void setCITY(LOCATION.CITY value) {
        this.city = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATION.PROVINCE }
     *     
     */
    public LOCATION.PROVINCE getPROVINCE() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATION.PROVINCE }
     *     
     */
    public void setPROVINCE(LOCATION.PROVINCE value) {
        this.province = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATION.COUNTRY }
     *     
     */
    public LOCATION.COUNTRY getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATION.COUNTRY }
     *     
     */
    public void setCOUNTRY(LOCATION.COUNTRY value) {
        this.country = value;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "code",
        "name"
    })
    public static class CITY
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "code",
        "name"
    })
    public static class COUNTRY
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

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
     *         &lt;element name="LIST_STREET_LINE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="POSTAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CITY" type="{}CODE_VALUE" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_SUBDIVISION" type="{}CODE_VALUE" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY" type="{}CODE_VALUE" minOccurs="0"/&gt;
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
        "liststreetline",
        "postalcode",
        "city",
        "countrysubdivision",
        "country"
    })
    public static class LOCATIONADDRESS
        implements Serializable
    {

        @XmlElement(name = "LIST_STREET_LINE")
        protected List<String> liststreetline;
        @XmlElement(name = "POSTAL_CODE")
        protected String postalcode;
        @XmlElement(name = "CITY")
        protected CODEVALUE city;
        @XmlElement(name = "COUNTRY_SUBDIVISION")
        protected CODEVALUE countrysubdivision;
        @XmlElement(name = "COUNTRY")
        protected CODEVALUE country;

        /**
         * Gets the value of the liststreetline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the liststreetline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSTREETLINE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTSTREETLINE() {
            if (liststreetline == null) {
                liststreetline = new ArrayList<String>();
            }
            return this.liststreetline;
        }

        /**
         * Gets the value of the postalcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOSTALCODE() {
            return postalcode;
        }

        /**
         * Sets the value of the postalcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOSTALCODE(String value) {
            this.postalcode = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link CODEVALUE }
         *     
         */
        public CODEVALUE getCITY() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODEVALUE }
         *     
         */
        public void setCITY(CODEVALUE value) {
            this.city = value;
        }

        /**
         * Gets the value of the countrysubdivision property.
         * 
         * @return
         *     possible object is
         *     {@link CODEVALUE }
         *     
         */
        public CODEVALUE getCOUNTRYSUBDIVISION() {
            return countrysubdivision;
        }

        /**
         * Sets the value of the countrysubdivision property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODEVALUE }
         *     
         */
        public void setCOUNTRYSUBDIVISION(CODEVALUE value) {
            this.countrysubdivision = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link CODEVALUE }
         *     
         */
        public CODEVALUE getCOUNTRY() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODEVALUE }
         *     
         */
        public void setCOUNTRY(CODEVALUE value) {
            this.country = value;
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
     *         &lt;element name="LOCATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IDENTIFIER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "locationtype",
        "identifiertype",
        "identifier"
    })
    public static class LOCATIONCODE
        implements Serializable
    {

        @XmlElement(name = "LOCATION_TYPE", required = true)
        protected String locationtype;
        @XmlElement(name = "IDENTIFIER_TYPE", required = true)
        protected String identifiertype;
        @XmlElement(name = "IDENTIFIER", required = true)
        protected String identifier;

        /**
         * Gets the value of the locationtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONTYPE() {
            return locationtype;
        }

        /**
         * Sets the value of the locationtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONTYPE(String value) {
            this.locationtype = value;
        }

        /**
         * Gets the value of the identifiertype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDENTIFIERTYPE() {
            return identifiertype;
        }

        /**
         * Sets the value of the identifiertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDENTIFIERTYPE(String value) {
            this.identifiertype = value;
        }

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDENTIFIER() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDENTIFIER(String value) {
            this.identifier = value;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "code",
        "name"
    })
    public static class PROVINCE
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

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

    }

}
