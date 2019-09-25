
package com.koreanair.eretail.pojo.payment.listmopoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_MOP_PARAMETER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_MOP_PARAMETER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KEY" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IS_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="INPUT_REGEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SENSITIVE_DATA_MASK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESOURCE_KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCALIZATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LABEL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="TOOLTIP" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="DEFAULT_VALUE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="MAP" type="{}LOCALIZATION_MAP_Type" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DISPLAY_INFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="COMPONENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MODIFIABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_MOP_PARAMETER_Type", propOrder = {
    "key",
    "type",
    "ismandatory",
    "inputregex",
    "check",
    "sensitivedatamask",
    "resourcekey",
    "localization",
    "displayinfo",
    "modifiable"
})
public class LISTMOPPARAMETERType
    implements Serializable
{

    @XmlElement(name = "KEY", required = true)
    protected String key;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "IS_MANDATORY", defaultValue = "false")
    protected Boolean ismandatory;
    @XmlElement(name = "INPUT_REGEX")
    protected String inputregex;
    @XmlElement(name = "CHECK")
    protected String check;
    @XmlElement(name = "SENSITIVE_DATA_MASK")
    protected String sensitivedatamask;
    @XmlElement(name = "RESOURCE_KEY")
    protected String resourcekey;
    @XmlElement(name = "LOCALIZATION")
    protected LISTMOPPARAMETERType.LOCALIZATION localization;
    @XmlElement(name = "DISPLAY_INFO")
    protected LISTMOPPARAMETERType.DISPLAYINFO displayinfo;
    @XmlElement(name = "MODIFIABLE", defaultValue = "true")
    protected Boolean modifiable;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEY() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEY(String value) {
        this.key = value;
    }

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
     * Gets the value of the ismandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISMANDATORY() {
        return ismandatory;
    }

    /**
     * Sets the value of the ismandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISMANDATORY(Boolean value) {
        this.ismandatory = value;
    }

    /**
     * Gets the value of the inputregex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINPUTREGEX() {
        return inputregex;
    }

    /**
     * Sets the value of the inputregex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINPUTREGEX(String value) {
        this.inputregex = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECK() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECK(String value) {
        this.check = value;
    }

    /**
     * Gets the value of the sensitivedatamask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENSITIVEDATAMASK() {
        return sensitivedatamask;
    }

    /**
     * Sets the value of the sensitivedatamask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENSITIVEDATAMASK(String value) {
        this.sensitivedatamask = value;
    }

    /**
     * Gets the value of the resourcekey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESOURCEKEY() {
        return resourcekey;
    }

    /**
     * Sets the value of the resourcekey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESOURCEKEY(String value) {
        this.resourcekey = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link LISTMOPPARAMETERType.LOCALIZATION }
     *     
     */
    public LISTMOPPARAMETERType.LOCALIZATION getLOCALIZATION() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTMOPPARAMETERType.LOCALIZATION }
     *     
     */
    public void setLOCALIZATION(LISTMOPPARAMETERType.LOCALIZATION value) {
        this.localization = value;
    }

    /**
     * Gets the value of the displayinfo property.
     * 
     * @return
     *     possible object is
     *     {@link LISTMOPPARAMETERType.DISPLAYINFO }
     *     
     */
    public LISTMOPPARAMETERType.DISPLAYINFO getDISPLAYINFO() {
        return displayinfo;
    }

    /**
     * Sets the value of the displayinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTMOPPARAMETERType.DISPLAYINFO }
     *     
     */
    public void setDISPLAYINFO(LISTMOPPARAMETERType.DISPLAYINFO value) {
        this.displayinfo = value;
    }

    /**
     * Gets the value of the modifiable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMODIFIABLE() {
        return modifiable;
    }

    /**
     * Sets the value of the modifiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMODIFIABLE(Boolean value) {
        this.modifiable = value;
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
     *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="COMPONENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "index",
        "component"
    })
    public static class DISPLAYINFO
        implements Serializable
    {

        @XmlElement(name = "INDEX")
        protected Integer index;
        @XmlElement(name = "COMPONENT")
        protected String component;

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getINDEX() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setINDEX(Integer value) {
            this.index = value;
        }

        /**
         * Gets the value of the component property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPONENT() {
            return component;
        }

        /**
         * Sets the value of the component property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPONENT(String value) {
            this.component = value;
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
     *         &lt;element name="LABEL" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="TOOLTIP" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="DEFAULT_VALUE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="MAP" type="{}LOCALIZATION_MAP_Type" minOccurs="0"/&gt;
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
        "label",
        "tooltip",
        "defaultvalue",
        "map"
    })
    public static class LOCALIZATION
        implements Serializable
    {

        @XmlElement(name = "LABEL")
        protected String label;
        @XmlElement(name = "TOOLTIP")
        protected String tooltip;
        @XmlElement(name = "DEFAULT_VALUE")
        protected String defaultvalue;
        @XmlElement(name = "MAP")
        protected LOCALIZATIONMAPType map;

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLABEL() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLABEL(String value) {
            this.label = value;
        }

        /**
         * Gets the value of the tooltip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOOLTIP() {
            return tooltip;
        }

        /**
         * Sets the value of the tooltip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOOLTIP(String value) {
            this.tooltip = value;
        }

        /**
         * Gets the value of the defaultvalue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEFAULTVALUE() {
            return defaultvalue;
        }

        /**
         * Sets the value of the defaultvalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEFAULTVALUE(String value) {
            this.defaultvalue = value;
        }

        /**
         * Gets the value of the map property.
         * 
         * @return
         *     possible object is
         *     {@link LOCALIZATIONMAPType }
         *     
         */
        public LOCALIZATIONMAPType getMAP() {
            return map;
        }

        /**
         * Sets the value of the map property.
         * 
         * @param value
         *     allowed object is
         *     {@link LOCALIZATIONMAPType }
         *     
         */
        public void setMAP(LOCALIZATIONMAPType value) {
            this.map = value;
        }

    }

}
