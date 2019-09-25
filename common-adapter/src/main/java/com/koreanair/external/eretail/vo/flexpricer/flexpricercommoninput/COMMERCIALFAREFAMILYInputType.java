
package com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.PanelTypeCode;


/**
 * <p>Java class for COMMERCIAL_FARE_FAMILY_input_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMMERCIAL_FARE_FAMILY_input_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *           &lt;element name="PANEL_TYPE" type="{}PanelTypeCode" minOccurs="0"/&gt;
 *           &lt;element name="SET_INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *           &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="LIST_CRITERIA" maxOccurs="9"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="VALUE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMMERCIAL_FARE_FAMILY_input_type", propOrder = {
    "code",
    "paneltype",
    "setindex",
    "boundid",
    "listcriteria"
})
public class COMMERCIALFAREFAMILYInputType
    implements Serializable
{

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "PANEL_TYPE")
    @XmlSchemaType(name = "string")
    protected PanelTypeCode paneltype;
    @XmlElement(name = "SET_INDEX")
    protected BigInteger setindex;
    @XmlElement(name = "BOUND_ID")
    protected Object boundid;
    @XmlElement(name = "LIST_CRITERIA")
    protected List<COMMERCIALFAREFAMILYInputType.LISTCRITERIA> listcriteria;

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
     * Gets the value of the paneltype property.
     * 
     * @return
     *     possible object is
     *     {@link PanelTypeCode }
     *     
     */
    public PanelTypeCode getPANELTYPE() {
        return paneltype;
    }

    /**
     * Sets the value of the paneltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelTypeCode }
     *     
     */
    public void setPANELTYPE(PanelTypeCode value) {
        this.paneltype = value;
    }

    /**
     * Gets the value of the setindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSETINDEX() {
        return setindex;
    }

    /**
     * Sets the value of the setindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSETINDEX(BigInteger value) {
        this.setindex = value;
    }

    /**
     * Gets the value of the boundid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBOUNDID() {
        return boundid;
    }

    /**
     * Sets the value of the boundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBOUNDID(Object value) {
        this.boundid = value;
    }

    /**
     * Gets the value of the listcriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCRITERIA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COMMERCIALFAREFAMILYInputType.LISTCRITERIA }
     * 
     * 
     */
    public List<COMMERCIALFAREFAMILYInputType.LISTCRITERIA> getLISTCRITERIA() {
        if (listcriteria == null) {
            listcriteria = new ArrayList<COMMERCIALFAREFAMILYInputType.LISTCRITERIA>();
        }
        return this.listcriteria;
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
     *         &lt;element name="QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="VALUE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "qualifier",
        "value"
    })
    public static class LISTCRITERIA
        implements Serializable
    {

        @XmlElement(name = "QUALIFIER")
        protected String qualifier;
        @XmlElement(name = "VALUE")
        protected String value;

        /**
         * Gets the value of the qualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUALIFIER() {
            return qualifier;
        }

        /**
         * Sets the value of the qualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUALIFIER(String value) {
            this.qualifier = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVALUE(String value) {
            this.value = value;
        }

    }

}
