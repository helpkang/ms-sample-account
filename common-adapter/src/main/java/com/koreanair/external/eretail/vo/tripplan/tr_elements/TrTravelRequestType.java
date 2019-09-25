
package com.koreanair.external.eretail.vo.tripplan.tr_elements;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.OutputDateType;
import com.koreanair.external.eretail.vo.common.common.TRIPREASON;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrAmount;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrAmountRange;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrBaseElementsType;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrDateWindow;
import com.koreanair.external.eretail.vo.tripplan.common.common_tr.TrLocation;


/**
 * Travel request generic element.
 * 
 * <p>Java class for trTravelRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trTravelRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}trBaseElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CREATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CREATION_OFFICE" type="{}trAlphaNumericType"/&gt;
 *                   &lt;element name="CREATION_DATE" type="{}OutputDateType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALIDITY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="END_DATE" type="{}OutputDateType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APPROVAL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRICE_RANGE" type="{}trAmountRange"/&gt;
 *                   &lt;element name="COST_CENTER" type="{}trAlphaNumericType"/&gt;
 *                   &lt;element name="TRIP_JUSTIFICATION" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXPENSE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REQUIRE_ADVANCE_EXPENSE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="AMOUNT" type="{}trAmount"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="START" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_FROM" type="{}trDateWindow" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGIN_LOCATION" type="{}trLocation" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="END" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_TO" type="{}trDateWindow" minOccurs="0"/&gt;
 *                   &lt;element name="DESTINATION_LOCATION" type="{}trLocation" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PASSENGERS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ADULTS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="CHILDREN" maxOccurs="9" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
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
 *         &lt;element name="PRICE_RANGE" type="{}trAmountRange" minOccurs="0"/&gt;
 *         &lt;element ref="{}TRIP_REASON" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trTravelRequestType", propOrder = {
    "creation",
    "validity",
    "approval",
    "expense",
    "start",
    "end",
    "passengers",
    "pricerange",
    "tripreason"
})
public class TrTravelRequestType
    extends TrBaseElementsType
    implements Serializable
{

    @XmlElement(name = "CREATION")
    protected TrTravelRequestType.CREATION creation;
    @XmlElement(name = "VALIDITY")
    protected TrTravelRequestType.VALIDITY validity;
    @XmlElement(name = "APPROVAL")
    protected TrTravelRequestType.APPROVAL approval;
    @XmlElement(name = "EXPENSE")
    protected TrTravelRequestType.EXPENSE expense;
    @XmlElement(name = "START")
    protected TrTravelRequestType.START start;
    @XmlElement(name = "END")
    protected TrTravelRequestType.END end;
    @XmlElement(name = "PASSENGERS")
    protected TrTravelRequestType.PASSENGERS passengers;
    @XmlElement(name = "PRICE_RANGE")
    protected TrAmountRange pricerange;
    @XmlElement(name = "TRIP_REASON")
    protected TRIPREASON tripreason;

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link TrTravelRequestType.CREATION }
     *     
     */
    public TrTravelRequestType.CREATION getCREATION() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrTravelRequestType.CREATION }
     *     
     */
    public void setCREATION(TrTravelRequestType.CREATION value) {
        this.creation = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link TrTravelRequestType.VALIDITY }
     *     
     */
    public TrTravelRequestType.VALIDITY getVALIDITY() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrTravelRequestType.VALIDITY }
     *     
     */
    public void setVALIDITY(TrTravelRequestType.VALIDITY value) {
        this.validity = value;
    }

    /**
     * Gets the value of the approval property.
     * 
     * @return
     *     possible object is
     *     {@link TrTravelRequestType.APPROVAL }
     *     
     */
    public TrTravelRequestType.APPROVAL getAPPROVAL() {
        return approval;
    }

    /**
     * Sets the value of the approval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrTravelRequestType.APPROVAL }
     *     
     */
    public void setAPPROVAL(TrTravelRequestType.APPROVAL value) {
        this.approval = value;
    }

    /**
     * Gets the value of the expense property.
     * 
     * @return
     *     possible object is
     *     {@link TrTravelRequestType.EXPENSE }
     *     
     */
    public TrTravelRequestType.EXPENSE getEXPENSE() {
        return expense;
    }

    /**
     * Sets the value of the expense property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrTravelRequestType.EXPENSE }
     *     
     */
    public void setEXPENSE(TrTravelRequestType.EXPENSE value) {
        this.expense = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link TrTravelRequestType.START }
     *     
     */
    public TrTravelRequestType.START getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrTravelRequestType.START }
     *     
     */
    public void setSTART(TrTravelRequestType.START value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link TrTravelRequestType.END }
     *     
     */
    public TrTravelRequestType.END getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrTravelRequestType.END }
     *     
     */
    public void setEND(TrTravelRequestType.END value) {
        this.end = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link TrTravelRequestType.PASSENGERS }
     *     
     */
    public TrTravelRequestType.PASSENGERS getPASSENGERS() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrTravelRequestType.PASSENGERS }
     *     
     */
    public void setPASSENGERS(TrTravelRequestType.PASSENGERS value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the pricerange property.
     * 
     * @return
     *     possible object is
     *     {@link TrAmountRange }
     *     
     */
    public TrAmountRange getPRICERANGE() {
        return pricerange;
    }

    /**
     * Sets the value of the pricerange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrAmountRange }
     *     
     */
    public void setPRICERANGE(TrAmountRange value) {
        this.pricerange = value;
    }

    /**
     * Gets the value of the tripreason property.
     * 
     * @return
     *     possible object is
     *     {@link TRIPREASON }
     *     
     */
    public TRIPREASON getTRIPREASON() {
        return tripreason;
    }

    /**
     * Sets the value of the tripreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIPREASON }
     *     
     */
    public void setTRIPREASON(TRIPREASON value) {
        this.tripreason = value;
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
     *         &lt;element name="PRICE_RANGE" type="{}trAmountRange"/&gt;
     *         &lt;element name="COST_CENTER" type="{}trAlphaNumericType"/&gt;
     *         &lt;element name="TRIP_JUSTIFICATION" type="{}unprotectedStringType"/&gt;
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
        "pricerange",
        "costcenter",
        "tripjustification"
    })
    public static class APPROVAL
        implements Serializable
    {

        @XmlElement(name = "PRICE_RANGE", required = true)
        protected TrAmountRange pricerange;
        @XmlElement(name = "COST_CENTER", required = true)
        protected String costcenter;
        @XmlElement(name = "TRIP_JUSTIFICATION", required = true)
        protected String tripjustification;

        /**
         * Gets the value of the pricerange property.
         * 
         * @return
         *     possible object is
         *     {@link TrAmountRange }
         *     
         */
        public TrAmountRange getPRICERANGE() {
            return pricerange;
        }

        /**
         * Sets the value of the pricerange property.
         * 
         * @param value
         *     allowed object is
         *     {@link TrAmountRange }
         *     
         */
        public void setPRICERANGE(TrAmountRange value) {
            this.pricerange = value;
        }

        /**
         * Gets the value of the costcenter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCENTER() {
            return costcenter;
        }

        /**
         * Sets the value of the costcenter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCENTER(String value) {
            this.costcenter = value;
        }

        /**
         * Gets the value of the tripjustification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRIPJUSTIFICATION() {
            return tripjustification;
        }

        /**
         * Sets the value of the tripjustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRIPJUSTIFICATION(String value) {
            this.tripjustification = value;
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
     *         &lt;element name="CREATION_OFFICE" type="{}trAlphaNumericType"/&gt;
     *         &lt;element name="CREATION_DATE" type="{}OutputDateType"/&gt;
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
        "creationoffice",
        "creationdate"
    })
    public static class CREATION
        implements Serializable
    {

        @XmlElement(name = "CREATION_OFFICE", required = true)
        protected String creationoffice;
        @XmlElement(name = "CREATION_DATE", required = true)
        protected OutputDateType creationdate;

        /**
         * Gets the value of the creationoffice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCREATIONOFFICE() {
            return creationoffice;
        }

        /**
         * Sets the value of the creationoffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCREATIONOFFICE(String value) {
            this.creationoffice = value;
        }

        /**
         * Gets the value of the creationdate property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getCREATIONDATE() {
            return creationdate;
        }

        /**
         * Sets the value of the creationdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setCREATIONDATE(OutputDateType value) {
            this.creationdate = value;
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
     *         &lt;element name="DATE_TO" type="{}trDateWindow" minOccurs="0"/&gt;
     *         &lt;element name="DESTINATION_LOCATION" type="{}trLocation" minOccurs="0"/&gt;
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
        "dateto",
        "destinationlocation"
    })
    public static class END
        implements Serializable
    {

        @XmlElement(name = "DATE_TO")
        protected TrDateWindow dateto;
        @XmlElement(name = "DESTINATION_LOCATION")
        protected TrLocation destinationlocation;

        /**
         * Gets the value of the dateto property.
         * 
         * @return
         *     possible object is
         *     {@link TrDateWindow }
         *     
         */
        public TrDateWindow getDATETO() {
            return dateto;
        }

        /**
         * Sets the value of the dateto property.
         * 
         * @param value
         *     allowed object is
         *     {@link TrDateWindow }
         *     
         */
        public void setDATETO(TrDateWindow value) {
            this.dateto = value;
        }

        /**
         * Gets the value of the destinationlocation property.
         * 
         * @return
         *     possible object is
         *     {@link TrLocation }
         *     
         */
        public TrLocation getDESTINATIONLOCATION() {
            return destinationlocation;
        }

        /**
         * Sets the value of the destinationlocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TrLocation }
         *     
         */
        public void setDESTINATIONLOCATION(TrLocation value) {
            this.destinationlocation = value;
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
     *         &lt;element name="REQUIRE_ADVANCE_EXPENSE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="AMOUNT" type="{}trAmount"/&gt;
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
        "requireadvanceexpenseindicator",
        "amount"
    })
    public static class EXPENSE
        implements Serializable
    {

        @XmlElement(name = "REQUIRE_ADVANCE_EXPENSE_INDICATOR")
        protected boolean requireadvanceexpenseindicator;
        @XmlElement(name = "AMOUNT", required = true)
        protected TrAmount amount;

        /**
         * Gets the value of the requireadvanceexpenseindicator property.
         * 
         */
        public boolean isREQUIREADVANCEEXPENSEINDICATOR() {
            return requireadvanceexpenseindicator;
        }

        /**
         * Sets the value of the requireadvanceexpenseindicator property.
         * 
         */
        public void setREQUIREADVANCEEXPENSEINDICATOR(boolean value) {
            this.requireadvanceexpenseindicator = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link TrAmount }
         *     
         */
        public TrAmount getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link TrAmount }
         *     
         */
        public void setAMOUNT(TrAmount value) {
            this.amount = value;
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
     *         &lt;element name="ADULTS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="CHILDREN" maxOccurs="9" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
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
        "adults",
        "children"
    })
    public static class PASSENGERS
        implements Serializable
    {

        @XmlElement(name = "ADULTS")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger adults;
        @XmlElement(name = "CHILDREN")
        protected List<TrTravelRequestType.PASSENGERS.CHILDREN> children;

        /**
         * Gets the value of the adults property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getADULTS() {
            return adults;
        }

        /**
         * Sets the value of the adults property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setADULTS(BigInteger value) {
            this.adults = value;
        }

        /**
         * Gets the value of the children property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the children property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHILDREN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrTravelRequestType.PASSENGERS.CHILDREN }
         * 
         * 
         */
        public List<TrTravelRequestType.PASSENGERS.CHILDREN> getCHILDREN() {
            if (children == null) {
                children = new ArrayList<TrTravelRequestType.PASSENGERS.CHILDREN>();
            }
            return this.children;
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
         *         &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
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
            "age"
        })
        public static class CHILDREN
            implements Serializable
        {

            @XmlElement(name = "AGE", required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger age;

            /**
             * Gets the value of the age property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAGE() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAGE(BigInteger value) {
                this.age = value;
            }

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
     *         &lt;element name="DATE_FROM" type="{}trDateWindow" minOccurs="0"/&gt;
     *         &lt;element name="ORIGIN_LOCATION" type="{}trLocation" minOccurs="0"/&gt;
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
        "datefrom",
        "originlocation"
    })
    public static class START
        implements Serializable
    {

        @XmlElement(name = "DATE_FROM")
        protected TrDateWindow datefrom;
        @XmlElement(name = "ORIGIN_LOCATION")
        protected TrLocation originlocation;

        /**
         * Gets the value of the datefrom property.
         * 
         * @return
         *     possible object is
         *     {@link TrDateWindow }
         *     
         */
        public TrDateWindow getDATEFROM() {
            return datefrom;
        }

        /**
         * Sets the value of the datefrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link TrDateWindow }
         *     
         */
        public void setDATEFROM(TrDateWindow value) {
            this.datefrom = value;
        }

        /**
         * Gets the value of the originlocation property.
         * 
         * @return
         *     possible object is
         *     {@link TrLocation }
         *     
         */
        public TrLocation getORIGINLOCATION() {
            return originlocation;
        }

        /**
         * Sets the value of the originlocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TrLocation }
         *     
         */
        public void setORIGINLOCATION(TrLocation value) {
            this.originlocation = value;
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
     *         &lt;element name="END_DATE" type="{}OutputDateType"/&gt;
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
        "enddate"
    })
    public static class VALIDITY
        implements Serializable
    {

        @XmlElement(name = "END_DATE", required = true)
        protected OutputDateType enddate;

        /**
         * Gets the value of the enddate property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getENDDATE() {
            return enddate;
        }

        /**
         * Sets the value of the enddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setENDDATE(OutputDateType value) {
            this.enddate = value;
        }

    }

}
