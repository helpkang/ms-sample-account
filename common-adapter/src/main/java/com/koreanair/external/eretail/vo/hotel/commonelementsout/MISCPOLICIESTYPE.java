
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MISC_POLICIES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MISC_POLICIES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_GUEST_POLICY" type="{}MISC_GUEST_POLICY_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PET_POLICY" type="{}MISC_PET_POLICY_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TAX_POLICY" type="{}MISC_TAX_POLICY_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_STAY_REQUIREMENT" type="{}STAY_REQUIREMENT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_COMMISSION_POLICY" type="{}COMMISSION_POLICY_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CANCELLATION_POLICY" type="{}CANCELLATION_POLICY_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_HOLD_POLICY" type="{}HOLD_POLICY_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_GUARANTEE_PAYMENT_POLICY" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}GUARANTEE_PAYMENT_METHOD_TYPE"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="START_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="END_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CHECK_IN_POLICY" type="{}ROOM_CHECK_IN_POLICY_TYPE" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_FREETEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "MISC_POLICIES_TYPE", propOrder = {
    "listguestpolicy",
    "listpetpolicy",
    "listtaxpolicy",
    "liststayrequirement",
    "listcommissionpolicy",
    "listcancellationpolicy",
    "listholdpolicy",
    "listguaranteepaymentpolicy"
})
public class MISCPOLICIESTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_GUEST_POLICY")
    protected List<MISCGUESTPOLICYTYPE> listguestpolicy;
    @XmlElement(name = "LIST_PET_POLICY")
    protected List<MISCPETPOLICYTYPE> listpetpolicy;
    @XmlElement(name = "LIST_TAX_POLICY")
    protected List<MISCTAXPOLICYTYPE> listtaxpolicy;
    @XmlElement(name = "LIST_STAY_REQUIREMENT")
    protected List<STAYREQUIREMENTTYPE> liststayrequirement;
    @XmlElement(name = "LIST_COMMISSION_POLICY")
    protected List<COMMISSIONPOLICYTYPE> listcommissionpolicy;
    @XmlElement(name = "LIST_CANCELLATION_POLICY")
    protected List<CANCELLATIONPOLICYTYPE> listcancellationpolicy;
    @XmlElement(name = "LIST_HOLD_POLICY")
    protected List<HOLDPOLICYTYPE> listholdpolicy;
    @XmlElement(name = "LIST_GUARANTEE_PAYMENT_POLICY")
    protected List<MISCPOLICIESTYPE.LISTGUARANTEEPAYMENTPOLICY> listguaranteepaymentpolicy;

    /**
     * Gets the value of the listguestpolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listguestpolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTGUESTPOLICY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISCGUESTPOLICYTYPE }
     * 
     * 
     */
    public List<MISCGUESTPOLICYTYPE> getLISTGUESTPOLICY() {
        if (listguestpolicy == null) {
            listguestpolicy = new ArrayList<MISCGUESTPOLICYTYPE>();
        }
        return this.listguestpolicy;
    }

    /**
     * Gets the value of the listpetpolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpetpolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPETPOLICY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISCPETPOLICYTYPE }
     * 
     * 
     */
    public List<MISCPETPOLICYTYPE> getLISTPETPOLICY() {
        if (listpetpolicy == null) {
            listpetpolicy = new ArrayList<MISCPETPOLICYTYPE>();
        }
        return this.listpetpolicy;
    }

    /**
     * Gets the value of the listtaxpolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtaxpolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAXPOLICY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISCTAXPOLICYTYPE }
     * 
     * 
     */
    public List<MISCTAXPOLICYTYPE> getLISTTAXPOLICY() {
        if (listtaxpolicy == null) {
            listtaxpolicy = new ArrayList<MISCTAXPOLICYTYPE>();
        }
        return this.listtaxpolicy;
    }

    /**
     * Gets the value of the liststayrequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststayrequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTAYREQUIREMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STAYREQUIREMENTTYPE }
     * 
     * 
     */
    public List<STAYREQUIREMENTTYPE> getLISTSTAYREQUIREMENT() {
        if (liststayrequirement == null) {
            liststayrequirement = new ArrayList<STAYREQUIREMENTTYPE>();
        }
        return this.liststayrequirement;
    }

    /**
     * Gets the value of the listcommissionpolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcommissionpolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMISSIONPOLICY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COMMISSIONPOLICYTYPE }
     * 
     * 
     */
    public List<COMMISSIONPOLICYTYPE> getLISTCOMMISSIONPOLICY() {
        if (listcommissionpolicy == null) {
            listcommissionpolicy = new ArrayList<COMMISSIONPOLICYTYPE>();
        }
        return this.listcommissionpolicy;
    }

    /**
     * Gets the value of the listcancellationpolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcancellationpolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCANCELLATIONPOLICY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CANCELLATIONPOLICYTYPE }
     * 
     * 
     */
    public List<CANCELLATIONPOLICYTYPE> getLISTCANCELLATIONPOLICY() {
        if (listcancellationpolicy == null) {
            listcancellationpolicy = new ArrayList<CANCELLATIONPOLICYTYPE>();
        }
        return this.listcancellationpolicy;
    }

    /**
     * Gets the value of the listholdpolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listholdpolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTHOLDPOLICY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOLDPOLICYTYPE }
     * 
     * 
     */
    public List<HOLDPOLICYTYPE> getLISTHOLDPOLICY() {
        if (listholdpolicy == null) {
            listholdpolicy = new ArrayList<HOLDPOLICYTYPE>();
        }
        return this.listholdpolicy;
    }

    /**
     * Gets the value of the listguaranteepaymentpolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listguaranteepaymentpolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTGUARANTEEPAYMENTPOLICY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISCPOLICIESTYPE.LISTGUARANTEEPAYMENTPOLICY }
     * 
     * 
     */
    public List<MISCPOLICIESTYPE.LISTGUARANTEEPAYMENTPOLICY> getLISTGUARANTEEPAYMENTPOLICY() {
        if (listguaranteepaymentpolicy == null) {
            listguaranteepaymentpolicy = new ArrayList<MISCPOLICIESTYPE.LISTGUARANTEEPAYMENTPOLICY>();
        }
        return this.listguaranteepaymentpolicy;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}GUARANTEE_PAYMENT_METHOD_TYPE"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="START_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="END_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CHECK_IN_POLICY" type="{}ROOM_CHECK_IN_POLICY_TYPE" minOccurs="0"/&gt;
     *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_FREETEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "startvaliditydate",
        "endvaliditydate",
        "checkinpolicy",
        "listdescription"
    })
    public static class LISTGUARANTEEPAYMENTPOLICY
        extends GUARANTEEPAYMENTMETHODTYPE
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected Object type;
        @XmlElement(name = "START_VALIDITY_DATE")
        protected Object startvaliditydate;
        @XmlElement(name = "END_VALIDITY_DATE")
        protected Object endvaliditydate;
        @XmlElement(name = "CHECK_IN_POLICY")
        protected ROOMCHECKINPOLICYTYPE checkinpolicy;
        @XmlElement(name = "LIST_DESCRIPTION")
        protected List<DESCRIPTIONFREETEXTTYPE> listdescription;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
        }

        /**
         * Gets the value of the startvaliditydate property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTARTVALIDITYDATE() {
            return startvaliditydate;
        }

        /**
         * Sets the value of the startvaliditydate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTARTVALIDITYDATE(Object value) {
            this.startvaliditydate = value;
        }

        /**
         * Gets the value of the endvaliditydate property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getENDVALIDITYDATE() {
            return endvaliditydate;
        }

        /**
         * Sets the value of the endvaliditydate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setENDVALIDITYDATE(Object value) {
            this.endvaliditydate = value;
        }

        /**
         * Gets the value of the checkinpolicy property.
         * 
         * @return
         *     possible object is
         *     {@link ROOMCHECKINPOLICYTYPE }
         *     
         */
        public ROOMCHECKINPOLICYTYPE getCHECKINPOLICY() {
            return checkinpolicy;
        }

        /**
         * Sets the value of the checkinpolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link ROOMCHECKINPOLICYTYPE }
         *     
         */
        public void setCHECKINPOLICY(ROOMCHECKINPOLICYTYPE value) {
            this.checkinpolicy = value;
        }

        /**
         * Gets the value of the listdescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listdescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTDESCRIPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DESCRIPTIONFREETEXTTYPE }
         * 
         * 
         */
        public List<DESCRIPTIONFREETEXTTYPE> getLISTDESCRIPTION() {
            if (listdescription == null) {
                listdescription = new ArrayList<DESCRIPTIONFREETEXTTYPE>();
            }
            return this.listdescription;
        }

    }

}
