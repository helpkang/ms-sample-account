
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identity information (name)
 * 
 * <p>Java class for IDENTITY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDENTITY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TYPE" type="{}TRAVELLER_TYPE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="TITLE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="AMB"/&gt;
 *                         &lt;enumeration value="BRIG"/&gt;
 *                         &lt;enumeration value="CAPT"/&gt;
 *                         &lt;enumeration value="COLO"/&gt;
 *                         &lt;enumeration value="DR"/&gt;
 *                         &lt;enumeration value="DRMR"/&gt;
 *                         &lt;enumeration value="DRMS"/&gt;
 *                         &lt;enumeration value="FR"/&gt;
 *                         &lt;enumeration value="GENE"/&gt;
 *                         &lt;enumeration value="HE"/&gt;
 *                         &lt;enumeration value="HEE"/&gt;
 *                         &lt;enumeration value="HH"/&gt;
 *                         &lt;enumeration value="HON"/&gt;
 *                         &lt;enumeration value="HRH"/&gt;
 *                         &lt;enumeration value="JUD"/&gt;
 *                         &lt;enumeration value="JUG"/&gt;
 *                         &lt;enumeration value="JUSTICE"/&gt;
 *                         &lt;enumeration value="LADY"/&gt;
 *                         &lt;enumeration value="LORD"/&gt;
 *                         &lt;enumeration value="MDM"/&gt;
 *                         &lt;enumeration value="MI"/&gt;
 *                         &lt;enumeration value="MISS"/&gt;
 *                         &lt;enumeration value="MIST"/&gt;
 *                         &lt;enumeration value="MR"/&gt;
 *                         &lt;enumeration value="MRDR"/&gt;
 *                         &lt;enumeration value="MRPROF"/&gt;
 *                         &lt;enumeration value="MRPROFDR"/&gt;
 *                         &lt;enumeration value="MRS"/&gt;
 *                         &lt;enumeration value="MRSDR"/&gt;
 *                         &lt;enumeration value="MRSPROF"/&gt;
 *                         &lt;enumeration value="MRSPROFDR"/&gt;
 *                         &lt;enumeration value="MS"/&gt;
 *                         &lt;enumeration value="MSPROFDR"/&gt;
 *                         &lt;enumeration value="MSPROF"/&gt;
 *                         &lt;enumeration value="MSTR"/&gt;
 *                         &lt;enumeration value="MTR"/&gt;
 *                         &lt;enumeration value="PRMR"/&gt;
 *                         &lt;enumeration value="PRMS"/&gt;
 *                         &lt;enumeration value="PROF"/&gt;
 *                         &lt;enumeration value="RABB"/&gt;
 *                         &lt;enumeration value="REV"/&gt;
 *                         &lt;enumeration value="SEN"/&gt;
 *                         &lt;enumeration value="SHAK"/&gt;
 *                         &lt;enumeration value="SHEK"/&gt;
 *                         &lt;enumeration value="SHK"/&gt;
 *                         &lt;enumeration value="SHKA"/&gt;
 *                         &lt;enumeration value="SIR"/&gt;
 *                         &lt;enumeration value="SR"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FIRST_NAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MIDDLE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GENDER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "IDENTITY_TYPE", propOrder = {

})
public class IDENTITYTYPE
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected TRAVELLERTYPETYPE type;
    @XmlElement(name = "TITLE")
    protected IDENTITYTYPE.TITLE title;
    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "MIDDLE_NAME")
    protected String middlename;
    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "SUFFIX")
    protected String suffix;
    @XmlElement(name = "GENDER")
    protected String gender;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELLERTYPETYPE }
     *     
     */
    public TRAVELLERTYPETYPE getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELLERTYPETYPE }
     *     
     */
    public void setTYPE(TRAVELLERTYPETYPE value) {
        this.type = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYTYPE.TITLE }
     *     
     */
    public IDENTITYTYPE.TITLE getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYTYPE.TITLE }
     *     
     */
    public void setTITLE(IDENTITYTYPE.TITLE value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTNAME(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIDDLENAME() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIDDLENAME(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTNAME(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUFFIX() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUFFIX(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENDER() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENDER(String value) {
        this.gender = value;
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
     *         &lt;element name="CODE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="AMB"/&gt;
     *               &lt;enumeration value="BRIG"/&gt;
     *               &lt;enumeration value="CAPT"/&gt;
     *               &lt;enumeration value="COLO"/&gt;
     *               &lt;enumeration value="DR"/&gt;
     *               &lt;enumeration value="DRMR"/&gt;
     *               &lt;enumeration value="DRMS"/&gt;
     *               &lt;enumeration value="FR"/&gt;
     *               &lt;enumeration value="GENE"/&gt;
     *               &lt;enumeration value="HE"/&gt;
     *               &lt;enumeration value="HEE"/&gt;
     *               &lt;enumeration value="HH"/&gt;
     *               &lt;enumeration value="HON"/&gt;
     *               &lt;enumeration value="HRH"/&gt;
     *               &lt;enumeration value="JUD"/&gt;
     *               &lt;enumeration value="JUG"/&gt;
     *               &lt;enumeration value="JUSTICE"/&gt;
     *               &lt;enumeration value="LADY"/&gt;
     *               &lt;enumeration value="LORD"/&gt;
     *               &lt;enumeration value="MDM"/&gt;
     *               &lt;enumeration value="MI"/&gt;
     *               &lt;enumeration value="MISS"/&gt;
     *               &lt;enumeration value="MIST"/&gt;
     *               &lt;enumeration value="MR"/&gt;
     *               &lt;enumeration value="MRDR"/&gt;
     *               &lt;enumeration value="MRPROF"/&gt;
     *               &lt;enumeration value="MRPROFDR"/&gt;
     *               &lt;enumeration value="MRS"/&gt;
     *               &lt;enumeration value="MRSDR"/&gt;
     *               &lt;enumeration value="MRSPROF"/&gt;
     *               &lt;enumeration value="MRSPROFDR"/&gt;
     *               &lt;enumeration value="MS"/&gt;
     *               &lt;enumeration value="MSPROFDR"/&gt;
     *               &lt;enumeration value="MSPROF"/&gt;
     *               &lt;enumeration value="MSTR"/&gt;
     *               &lt;enumeration value="MTR"/&gt;
     *               &lt;enumeration value="PRMR"/&gt;
     *               &lt;enumeration value="PRMS"/&gt;
     *               &lt;enumeration value="PROF"/&gt;
     *               &lt;enumeration value="RABB"/&gt;
     *               &lt;enumeration value="REV"/&gt;
     *               &lt;enumeration value="SEN"/&gt;
     *               &lt;enumeration value="SHAK"/&gt;
     *               &lt;enumeration value="SHEK"/&gt;
     *               &lt;enumeration value="SHK"/&gt;
     *               &lt;enumeration value="SHKA"/&gt;
     *               &lt;enumeration value="SIR"/&gt;
     *               &lt;enumeration value="SR"/&gt;
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
    public static class TITLE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
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
