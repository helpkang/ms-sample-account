
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
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
 *       &lt;all&gt;
 *         &lt;element name="INSURANCE_INFORMATION_ID" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="IDENTIFICATION_DOCUMENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="IDENTITY_DOCUMENT_ID" type="{}STRING_TYPE_PFIELD"/&gt;
 *                   &lt;element name="DOCUMENT_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="00"/&gt;
 *                                   &lt;enumeration value="AB"/&gt;
 *                                   &lt;enumeration value="CC"/&gt;
 *                                   &lt;enumeration value="DL"/&gt;
 *                                   &lt;enumeration value="FF"/&gt;
 *                                   &lt;enumeration value="NI"/&gt;
 *                                   &lt;enumeration value="OT"/&gt;
 *                                   &lt;enumeration value="PP"/&gt;
 *                                   &lt;enumeration value="BC"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlRootElement(name = "LIST_INSURANCE_INFORMATION")
public class LISTINSURANCEINFORMATION
    implements Serializable
{

    @XmlElement(name = "INSURANCE_INFORMATION_ID")
    protected STRINGTYPEPFIELD insuranceinformationid;
    @XmlElement(name = "IDENTIFICATION_DOCUMENT")
    protected LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT identificationdocument;

    /**
     * Gets the value of the insuranceinformationid property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getINSURANCEINFORMATIONID() {
        return insuranceinformationid;
    }

    /**
     * Sets the value of the insuranceinformationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setINSURANCEINFORMATIONID(STRINGTYPEPFIELD value) {
        this.insuranceinformationid = value;
    }

    /**
     * Gets the value of the identificationdocument property.
     * 
     * @return
     *     possible object is
     *     {@link LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT }
     *     
     */
    public LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT getIDENTIFICATIONDOCUMENT() {
        return identificationdocument;
    }

    /**
     * Sets the value of the identificationdocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT }
     *     
     */
    public void setIDENTIFICATIONDOCUMENT(LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT value) {
        this.identificationdocument = value;
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
     *         &lt;element name="IDENTITY_DOCUMENT_ID" type="{}STRING_TYPE_PFIELD"/&gt;
     *         &lt;element name="DOCUMENT_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="00"/&gt;
     *                         &lt;enumeration value="AB"/&gt;
     *                         &lt;enumeration value="CC"/&gt;
     *                         &lt;enumeration value="DL"/&gt;
     *                         &lt;enumeration value="FF"/&gt;
     *                         &lt;enumeration value="NI"/&gt;
     *                         &lt;enumeration value="OT"/&gt;
     *                         &lt;enumeration value="PP"/&gt;
     *                         &lt;enumeration value="BC"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
    public static class IDENTIFICATIONDOCUMENT
        implements Serializable
    {

        @XmlElement(name = "IDENTITY_DOCUMENT_ID", required = true)
        protected STRINGTYPEPFIELD identitydocumentid;
        @XmlElement(name = "DOCUMENT_TYPE")
        protected LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT.DOCUMENTTYPE documenttype;

        /**
         * Gets the value of the identitydocumentid property.
         * 
         * @return
         *     possible object is
         *     {@link STRINGTYPEPFIELD }
         *     
         */
        public STRINGTYPEPFIELD getIDENTITYDOCUMENTID() {
            return identitydocumentid;
        }

        /**
         * Sets the value of the identitydocumentid property.
         * 
         * @param value
         *     allowed object is
         *     {@link STRINGTYPEPFIELD }
         *     
         */
        public void setIDENTITYDOCUMENTID(STRINGTYPEPFIELD value) {
            this.identitydocumentid = value;
        }

        /**
         * Gets the value of the documenttype property.
         * 
         * @return
         *     possible object is
         *     {@link LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT.DOCUMENTTYPE }
         *     
         */
        public LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT.DOCUMENTTYPE getDOCUMENTTYPE() {
            return documenttype;
        }

        /**
         * Sets the value of the documenttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT.DOCUMENTTYPE }
         *     
         */
        public void setDOCUMENTTYPE(LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT.DOCUMENTTYPE value) {
            this.documenttype = value;
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
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="00"/&gt;
         *               &lt;enumeration value="AB"/&gt;
         *               &lt;enumeration value="CC"/&gt;
         *               &lt;enumeration value="DL"/&gt;
         *               &lt;enumeration value="FF"/&gt;
         *               &lt;enumeration value="NI"/&gt;
         *               &lt;enumeration value="OT"/&gt;
         *               &lt;enumeration value="PP"/&gt;
         *               &lt;enumeration value="BC"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class DOCUMENTTYPE
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

}
