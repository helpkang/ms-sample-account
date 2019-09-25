
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilityinputtype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains parameters used for availability
 * 			
 * 
 * <p>Java class for REQUEST_OPTIONS_TypeFlex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REQUEST_OPTIONS_TypeFlex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}RequestOptionsGroupFlex"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REQUEST_OPTIONS_TypeFlex", propOrder = {
    "allowdepartedflights",
    "allowsoldoutflights",
    "listincludedairlines",
    "listexcludedairlines",
    "partialavail"
})
public class REQUESTOPTIONSTypeFlex
    implements Serializable
{

    @XmlElement(name = "ALLOW_DEPARTED_FLIGHTS")
    protected Boolean allowdepartedflights;
    @XmlElement(name = "ALLOW_SOLDOUT_FLIGHTS")
    protected Boolean allowsoldoutflights;
    @XmlElement(name = "LIST_INCLUDED_AIRLINES")
    protected List<LISTINCLUDEDEXCLUDEDAIRLINESInputType> listincludedairlines;
    @XmlElement(name = "LIST_EXCLUDED_AIRLINES")
    protected List<LISTINCLUDEDEXCLUDEDAIRLINESInputType> listexcludedairlines;
    @XmlElement(name = "PARTIAL_AVAIL")
    protected Object partialavail;

    /**
     * Gets the value of the allowdepartedflights property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWDEPARTEDFLIGHTS() {
        return allowdepartedflights;
    }

    /**
     * Sets the value of the allowdepartedflights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWDEPARTEDFLIGHTS(Boolean value) {
        this.allowdepartedflights = value;
    }

    /**
     * Gets the value of the allowsoldoutflights property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWSOLDOUTFLIGHTS() {
        return allowsoldoutflights;
    }

    /**
     * Sets the value of the allowsoldoutflights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWSOLDOUTFLIGHTS(Boolean value) {
        this.allowsoldoutflights = value;
    }

    /**
     * Gets the value of the listincludedairlines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listincludedairlines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINCLUDEDAIRLINES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTINCLUDEDEXCLUDEDAIRLINESInputType }
     * 
     * 
     */
    public List<LISTINCLUDEDEXCLUDEDAIRLINESInputType> getLISTINCLUDEDAIRLINES() {
        if (listincludedairlines == null) {
            listincludedairlines = new ArrayList<LISTINCLUDEDEXCLUDEDAIRLINESInputType>();
        }
        return this.listincludedairlines;
    }

    /**
     * Gets the value of the listexcludedairlines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexcludedairlines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXCLUDEDAIRLINES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTINCLUDEDEXCLUDEDAIRLINESInputType }
     * 
     * 
     */
    public List<LISTINCLUDEDEXCLUDEDAIRLINESInputType> getLISTEXCLUDEDAIRLINES() {
        if (listexcludedairlines == null) {
            listexcludedairlines = new ArrayList<LISTINCLUDEDEXCLUDEDAIRLINESInputType>();
        }
        return this.listexcludedairlines;
    }

    /**
     * Gets the value of the partialavail property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPARTIALAVAIL() {
        return partialavail;
    }

    /**
     * Sets the value of the partialavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPARTIALAVAIL(Object value) {
        this.partialavail = value;
    }

}
