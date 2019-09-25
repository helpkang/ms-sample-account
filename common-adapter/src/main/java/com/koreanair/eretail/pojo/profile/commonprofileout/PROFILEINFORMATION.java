
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CSXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PIN_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROFILE_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="FREQUENT_FLYER"/&gt;
 *               &lt;enumeration value="CORPORATE"/&gt;
 *               &lt;enumeration value="TRAVELLER"/&gt;
 *               &lt;enumeration value="COMPANY"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ADDITIONAL_PROFILE_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PROFILE_TYPE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="COMPANION"/&gt;
 *                         &lt;enumeration value="ACKI"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CEM_DETAILS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CEM_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="CEM_AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
@XmlType(name = "", propOrder = {
    "csxid",
    "pinnumber",
    "profiletype",
    "listadditionalprofileinformation",
    "cemdetails"
})
@XmlRootElement(name = "PROFILE_INFORMATION")
public class PROFILEINFORMATION
    implements Serializable
{

    @XmlElement(name = "CSXID")
    protected String csxid;
    @XmlElement(name = "PIN_NUMBER")
    protected String pinnumber;
    @XmlElement(name = "PROFILE_TYPE")
    protected String profiletype;
    @XmlElement(name = "LIST_ADDITIONAL_PROFILE_INFORMATION")
    protected List<PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION> listadditionalprofileinformation;
    @XmlElement(name = "CEM_DETAILS")
    protected PROFILEINFORMATION.CEMDETAILS cemdetails;

    /**
     * Gets the value of the csxid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSXID() {
        return csxid;
    }

    /**
     * Sets the value of the csxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSXID(String value) {
        this.csxid = value;
    }

    /**
     * Gets the value of the pinnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINNUMBER() {
        return pinnumber;
    }

    /**
     * Sets the value of the pinnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINNUMBER(String value) {
        this.pinnumber = value;
    }

    /**
     * Gets the value of the profiletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFILETYPE() {
        return profiletype;
    }

    /**
     * Sets the value of the profiletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFILETYPE(String value) {
        this.profiletype = value;
    }

    /**
     * Gets the value of the listadditionalprofileinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalprofileinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALPROFILEINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION }
     * 
     * 
     */
    public List<PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION> getLISTADDITIONALPROFILEINFORMATION() {
        if (listadditionalprofileinformation == null) {
            listadditionalprofileinformation = new ArrayList<PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION>();
        }
        return this.listadditionalprofileinformation;
    }

    /**
     * Gets the value of the cemdetails property.
     * 
     * @return
     *     possible object is
     *     {@link PROFILEINFORMATION.CEMDETAILS }
     *     
     */
    public PROFILEINFORMATION.CEMDETAILS getCEMDETAILS() {
        return cemdetails;
    }

    /**
     * Sets the value of the cemdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROFILEINFORMATION.CEMDETAILS }
     *     
     */
    public void setCEMDETAILS(PROFILEINFORMATION.CEMDETAILS value) {
        this.cemdetails = value;
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
     *         &lt;element name="CEM_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="CEM_AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "cemid",
        "cemairlinecode"
    })
    public static class CEMDETAILS
        implements Serializable
    {

        @XmlElement(name = "CEM_ID", required = true)
        protected Object cemid;
        @XmlElement(name = "CEM_AIRLINE_CODE", required = true)
        protected Object cemairlinecode;

        /**
         * Gets the value of the cemid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCEMID() {
            return cemid;
        }

        /**
         * Sets the value of the cemid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCEMID(Object value) {
            this.cemid = value;
        }

        /**
         * Gets the value of the cemairlinecode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCEMAIRLINECODE() {
            return cemairlinecode;
        }

        /**
         * Sets the value of the cemairlinecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCEMAIRLINECODE(Object value) {
            this.cemairlinecode = value;
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
     *         &lt;element name="PROFILE_TYPE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="COMPANION"/&gt;
     *               &lt;enumeration value="ACKI"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/all&gt;
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
    @XmlType(name = "", propOrder = {
        "profiletype",
        "listparameter"
    })
    public static class LISTADDITIONALPROFILEINFORMATION
        implements Serializable
    {

        @XmlElement(name = "PROFILE_TYPE")
        protected String profiletype;
        @XmlElement(name = "LIST_PARAMETER")
        protected List<PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION.LISTPARAMETER> listparameter;

        /**
         * Gets the value of the profiletype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROFILETYPE() {
            return profiletype;
        }

        /**
         * Sets the value of the profiletype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROFILETYPE(String value) {
            this.profiletype = value;
        }

        /**
         * Gets the value of the listparameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listparameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPARAMETER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION.LISTPARAMETER }
         * 
         * 
         */
        public List<PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION.LISTPARAMETER> getLISTPARAMETER() {
            if (listparameter == null) {
                listparameter = new ArrayList<PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION.LISTPARAMETER>();
            }
            return this.listparameter;
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class LISTPARAMETER
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected Object code;
            @XmlElement(name = "NAME")
            protected Object name;
            @XmlElement(name = "VALUE", required = true)
            protected Object value;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCODE(Object value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setNAME(Object value) {
                this.name = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getVALUE() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setVALUE(Object value) {
                this.value = value;
            }

        }

    }

}
