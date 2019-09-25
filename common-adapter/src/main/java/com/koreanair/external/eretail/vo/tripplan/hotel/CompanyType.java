
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel Chain information
 * 
 * <p>Java class for CompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}InternalCompanyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACCESS_LEVEL" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="GDS_COMPANY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GDS_COMPANY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OPTIONS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SI_FIELD_INFO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MAX_LENGTH" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="AVAILABLE_LENGTH" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyType", propOrder = {
    "accesslevel",
    "gdscompanycode",
    "gdscompanyname",
    "options"
})
public class CompanyType
    extends InternalCompanyType
    implements Serializable
{

    @XmlElement(name = "ACCESS_LEVEL")
    protected String accesslevel;
    @XmlElement(name = "GDS_COMPANY_CODE")
    protected String gdscompanycode;
    @XmlElement(name = "GDS_COMPANY_NAME")
    protected String gdscompanyname;
    @XmlElement(name = "OPTIONS")
    protected CompanyType.OPTIONS options;

    /**
     * Gets the value of the accesslevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSLEVEL() {
        return accesslevel;
    }

    /**
     * Sets the value of the accesslevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCESSLEVEL(String value) {
        this.accesslevel = value;
    }

    /**
     * Gets the value of the gdscompanycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSCOMPANYCODE() {
        return gdscompanycode;
    }

    /**
     * Sets the value of the gdscompanycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSCOMPANYCODE(String value) {
        this.gdscompanycode = value;
    }

    /**
     * Gets the value of the gdscompanyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSCOMPANYNAME() {
        return gdscompanyname;
    }

    /**
     * Sets the value of the gdscompanyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSCOMPANYNAME(String value) {
        this.gdscompanyname = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType.OPTIONS }
     *     
     */
    public CompanyType.OPTIONS getOPTIONS() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType.OPTIONS }
     *     
     */
    public void setOPTIONS(CompanyType.OPTIONS value) {
        this.options = value;
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
     *         &lt;element name="SI_FIELD_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MAX_LENGTH" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="AVAILABLE_LENGTH" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "sifieldinfo"
    })
    public static class OPTIONS
        implements Serializable
    {

        @XmlElement(name = "SI_FIELD_INFO")
        protected CompanyType.OPTIONS.SIFIELDINFO sifieldinfo;

        /**
         * Gets the value of the sifieldinfo property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyType.OPTIONS.SIFIELDINFO }
         *     
         */
        public CompanyType.OPTIONS.SIFIELDINFO getSIFIELDINFO() {
            return sifieldinfo;
        }

        /**
         * Sets the value of the sifieldinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyType.OPTIONS.SIFIELDINFO }
         *     
         */
        public void setSIFIELDINFO(CompanyType.OPTIONS.SIFIELDINFO value) {
            this.sifieldinfo = value;
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
         *         &lt;element name="MAX_LENGTH" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="AVAILABLE_LENGTH" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            "maxlength",
            "availablelength"
        })
        public static class SIFIELDINFO
            implements Serializable
        {

            @XmlElement(name = "MAX_LENGTH")
            protected int maxlength;
            @XmlElement(name = "AVAILABLE_LENGTH")
            protected int availablelength;

            /**
             * Gets the value of the maxlength property.
             * 
             */
            public int getMAXLENGTH() {
                return maxlength;
            }

            /**
             * Sets the value of the maxlength property.
             * 
             */
            public void setMAXLENGTH(int value) {
                this.maxlength = value;
            }

            /**
             * Gets the value of the availablelength property.
             * 
             */
            public int getAVAILABLELENGTH() {
                return availablelength;
            }

            /**
             * Sets the value of the availablelength property.
             * 
             */
            public void setAVAILABLELENGTH(int value) {
                this.availablelength = value;
            }

        }

    }

}
