
package com.koreanair.external.eretail.vo.tripplan.tr_elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.OutputDateType;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrBoundType;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrCommonElementsType;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrOutBoundType;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrPassportInformationType;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrProviderType;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrSearchCriteriaType;


/**
 * TR miscellaneous activity.
 * 
 * <p>Java class for trMiscActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trMiscActivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}trCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NAME" type="{}trAlphaNumericType"/&gt;
 *         &lt;element name="SEAT_NBR" type="{}trAlphaNumericType" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_PROVIDER" type="{}trProviderType" minOccurs="0"/&gt;
 *         &lt;element name="NEEDED_ON_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="START" type="{}trOutBoundType" minOccurs="0"/&gt;
 *         &lt;element name="END" type="{}trBoundType" minOccurs="0"/&gt;
 *         &lt;element name="SEARCH_CRITERIA" type="{}trSearchCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="PASSPORT_INFORMATION" type="{}trPassportInformationType" minOccurs="0"/&gt;
 *         &lt;element name="TICKET" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NUMBER" type="{}trAlphaNumericType" minOccurs="0"/&gt;
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
@XmlType(name = "trMiscActivityType", propOrder = {
    "name",
    "seatnbr",
    "serviceprovider",
    "neededondate",
    "start",
    "end",
    "searchcriteria",
    "passportinformation",
    "ticket"
})
public class TrMiscActivityType
    extends TrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "SEAT_NBR")
    protected List<String> seatnbr;
    @XmlElement(name = "SERVICE_PROVIDER")
    protected TrProviderType serviceprovider;
    @XmlElement(name = "NEEDED_ON_DATE")
    protected OutputDateType neededondate;
    @XmlElement(name = "START")
    protected TrOutBoundType start;
    @XmlElement(name = "END")
    protected TrBoundType end;
    @XmlElement(name = "SEARCH_CRITERIA")
    protected TrSearchCriteriaType searchcriteria;
    @XmlElement(name = "PASSPORT_INFORMATION")
    protected TrPassportInformationType passportinformation;
    @XmlElement(name = "TICKET")
    protected TrMiscActivityType.TICKET ticket;

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
     * Gets the value of the seatnbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatnbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSEATNBR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSEATNBR() {
        if (seatnbr == null) {
            seatnbr = new ArrayList<String>();
        }
        return this.seatnbr;
    }

    /**
     * Gets the value of the serviceprovider property.
     * 
     * @return
     *     possible object is
     *     {@link TrProviderType }
     *     
     */
    public TrProviderType getSERVICEPROVIDER() {
        return serviceprovider;
    }

    /**
     * Sets the value of the serviceprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrProviderType }
     *     
     */
    public void setSERVICEPROVIDER(TrProviderType value) {
        this.serviceprovider = value;
    }

    /**
     * Gets the value of the neededondate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getNEEDEDONDATE() {
        return neededondate;
    }

    /**
     * Sets the value of the neededondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setNEEDEDONDATE(OutputDateType value) {
        this.neededondate = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link TrOutBoundType }
     *     
     */
    public TrOutBoundType getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrOutBoundType }
     *     
     */
    public void setSTART(TrOutBoundType value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link TrBoundType }
     *     
     */
    public TrBoundType getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrBoundType }
     *     
     */
    public void setEND(TrBoundType value) {
        this.end = value;
    }

    /**
     * Gets the value of the searchcriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TrSearchCriteriaType }
     *     
     */
    public TrSearchCriteriaType getSEARCHCRITERIA() {
        return searchcriteria;
    }

    /**
     * Sets the value of the searchcriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrSearchCriteriaType }
     *     
     */
    public void setSEARCHCRITERIA(TrSearchCriteriaType value) {
        this.searchcriteria = value;
    }

    /**
     * Gets the value of the passportinformation property.
     * 
     * @return
     *     possible object is
     *     {@link TrPassportInformationType }
     *     
     */
    public TrPassportInformationType getPASSPORTINFORMATION() {
        return passportinformation;
    }

    /**
     * Sets the value of the passportinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrPassportInformationType }
     *     
     */
    public void setPASSPORTINFORMATION(TrPassportInformationType value) {
        this.passportinformation = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link TrMiscActivityType.TICKET }
     *     
     */
    public TrMiscActivityType.TICKET getTICKET() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrMiscActivityType.TICKET }
     *     
     */
    public void setTICKET(TrMiscActivityType.TICKET value) {
        this.ticket = value;
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
     *         &lt;element name="NUMBER" type="{}trAlphaNumericType" minOccurs="0"/&gt;
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
        "number"
    })
    public static class TICKET
        implements Serializable
    {

        @XmlElement(name = "NUMBER")
        protected String number;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBER(String value) {
            this.number = value;
        }

    }

}
