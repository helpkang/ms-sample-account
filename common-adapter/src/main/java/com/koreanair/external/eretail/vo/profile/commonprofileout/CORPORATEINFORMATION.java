
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
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
 *       &lt;all&gt;
 *         &lt;element name="ADMINISTRATIVE_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="JOB" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DEPARTMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DIVISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CORPORATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CORPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CLIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_COST_CENTER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="COST_CENTER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="COST_CENTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_RM_DATA" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="RM_DATA_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="RM_DATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EMPLOYEE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="VOYAGEUR_REWARDS_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IATA_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DK_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GROUP_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GROUP_QUEUING_OFFICE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="CATEGORY" type="{}unprotectedStringType"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="CATEGORY" type="{}unprotectedStringType"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_FCE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="FCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MEMBERSHIP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="COMPANY_PROFILE_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COMPANY_PROFILE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CMP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TRAVEL_ORDER_IDENTITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FREETEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERMISSION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ADMINISTRATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="IS_TRAVELER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="TRAVEL_ARRANGER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="TRAVEL_APPROVER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="OUT_OF_POLICY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PNR_MODIFICATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="TRAVEL_APPROVAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="SUPER_ADMINISTRATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="AGENT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="AIRLINE_AGENT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="AIRLINE_AGENT_MANAGER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="USER_MANAGER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAVEL_ARRANGER_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRAVEL_ARRANGE_PERMISSION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="PNR_MODIFICATION" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="PNR_CANCELATION" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_NOMINATED_TRAVEL_ARRANGER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="NOMINATED_TRAVEL_ARRANGER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="NOMINATED_TRAVEL_ARRANGER" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="COMMUNITY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="TRAVEL_APPROVER_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRAVEL_APPROVER_PERMISSION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SUPER_TRAVEL_APPROVER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="OUT_OF_OFFICE_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="LEAVING" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RETURNING" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OUT_OF_OFFICE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlRootElement(name = "CORPORATE_INFORMATION")
public class CORPORATEINFORMATION
    implements Serializable
{

    @XmlElement(name = "ADMINISTRATIVE_INFORMATION")
    protected CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION administrativeinformation;
    @XmlElement(name = "PERMISSION")
    protected CORPORATEINFORMATION.PERMISSION permission;
    @XmlElement(name = "TRAVEL_ARRANGER_INFORMATION")
    protected CORPORATEINFORMATION.TRAVELARRANGERINFORMATION travelarrangerinformation;
    @XmlElement(name = "TRAVEL_APPROVER_INFORMATION")
    protected CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION travelapproverinformation;
    @XmlElement(name = "OUT_OF_OFFICE_INFORMATION")
    protected CORPORATEINFORMATION.OUTOFOFFICEINFORMATION outofofficeinformation;

    /**
     * Gets the value of the administrativeinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION }
     *     
     */
    public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION getADMINISTRATIVEINFORMATION() {
        return administrativeinformation;
    }

    /**
     * Sets the value of the administrativeinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION }
     *     
     */
    public void setADMINISTRATIVEINFORMATION(CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION value) {
        this.administrativeinformation = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link CORPORATEINFORMATION.PERMISSION }
     *     
     */
    public CORPORATEINFORMATION.PERMISSION getPERMISSION() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CORPORATEINFORMATION.PERMISSION }
     *     
     */
    public void setPERMISSION(CORPORATEINFORMATION.PERMISSION value) {
        this.permission = value;
    }

    /**
     * Gets the value of the travelarrangerinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION }
     *     
     */
    public CORPORATEINFORMATION.TRAVELARRANGERINFORMATION getTRAVELARRANGERINFORMATION() {
        return travelarrangerinformation;
    }

    /**
     * Sets the value of the travelarrangerinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION }
     *     
     */
    public void setTRAVELARRANGERINFORMATION(CORPORATEINFORMATION.TRAVELARRANGERINFORMATION value) {
        this.travelarrangerinformation = value;
    }

    /**
     * Gets the value of the travelapproverinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION }
     *     
     */
    public CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION getTRAVELAPPROVERINFORMATION() {
        return travelapproverinformation;
    }

    /**
     * Sets the value of the travelapproverinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION }
     *     
     */
    public void setTRAVELAPPROVERINFORMATION(CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION value) {
        this.travelapproverinformation = value;
    }

    /**
     * Gets the value of the outofofficeinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CORPORATEINFORMATION.OUTOFOFFICEINFORMATION }
     *     
     */
    public CORPORATEINFORMATION.OUTOFOFFICEINFORMATION getOUTOFOFFICEINFORMATION() {
        return outofofficeinformation;
    }

    /**
     * Sets the value of the outofofficeinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CORPORATEINFORMATION.OUTOFOFFICEINFORMATION }
     *     
     */
    public void setOUTOFOFFICEINFORMATION(CORPORATEINFORMATION.OUTOFOFFICEINFORMATION value) {
        this.outofofficeinformation = value;
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
     *         &lt;element name="JOB" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DEPARTMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DIVISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CORPORATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CORPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CLIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_COST_CENTER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="COST_CENTER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="COST_CENTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_RM_DATA" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="RM_DATA_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="RM_DATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EMPLOYEE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="VOYAGEUR_REWARDS_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IATA_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DK_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GROUP_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GROUP_QUEUING_OFFICE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="CATEGORY" type="{}unprotectedStringType"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="CATEGORY" type="{}unprotectedStringType"/&gt;
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
     *         &lt;element name="LIST_FCE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="FCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MEMBERSHIP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="COMPANY_PROFILE_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COMPANY_PROFILE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CMP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TRAVEL_ORDER_IDENTITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FREETEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "job",
        "corpcode",
        "clientid",
        "listcostcenter",
        "listrmdata",
        "employeenumber",
        "voyageurrewardsnumber",
        "iatanumber",
        "dknumber",
        "grouptype",
        "groupqueuingoffice",
        "listfce",
        "companyprofileidentifier",
        "companyprofilename",
        "cmpcode",
        "ordernumber",
        "travelorderidentity",
        "freetext"
    })
    public static class ADMINISTRATIVEINFORMATION
        implements Serializable
    {

        @XmlElement(name = "JOB")
        protected CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.JOB job;
        @XmlElement(name = "CORPCODE")
        protected String corpcode;
        @XmlElement(name = "CLIENT_ID")
        protected String clientid;
        @XmlElement(name = "LIST_COST_CENTER")
        protected List<CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTCOSTCENTER> listcostcenter;
        @XmlElement(name = "LIST_RM_DATA")
        protected List<CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTRMDATA> listrmdata;
        @XmlElement(name = "EMPLOYEE_NUMBER")
        protected String employeenumber;
        @XmlElement(name = "VOYAGEUR_REWARDS_NUMBER")
        protected String voyageurrewardsnumber;
        @XmlElement(name = "IATA_NUMBER")
        protected String iatanumber;
        @XmlElement(name = "DK_NUMBER")
        protected String dknumber;
        @XmlElement(name = "GROUP_TYPE")
        protected String grouptype;
        @XmlElement(name = "GROUP_QUEUING_OFFICE")
        protected CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE groupqueuingoffice;
        @XmlElement(name = "LIST_FCE")
        protected List<CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTFCE> listfce;
        @XmlElement(name = "COMPANY_PROFILE_IDENTIFIER")
        protected String companyprofileidentifier;
        @XmlElement(name = "COMPANY_PROFILE_NAME")
        protected String companyprofilename;
        @XmlElement(name = "CMP_CODE")
        protected String cmpcode;
        @XmlElement(name = "ORDER_NUMBER")
        protected String ordernumber;
        @XmlElement(name = "TRAVEL_ORDER_IDENTITY")
        protected String travelorderidentity;
        @XmlElement(name = "FREETEXT")
        protected String freetext;

        /**
         * Gets the value of the job property.
         * 
         * @return
         *     possible object is
         *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.JOB }
         *     
         */
        public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.JOB getJOB() {
            return job;
        }

        /**
         * Sets the value of the job property.
         * 
         * @param value
         *     allowed object is
         *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.JOB }
         *     
         */
        public void setJOB(CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.JOB value) {
            this.job = value;
        }

        /**
         * Gets the value of the corpcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCORPCODE() {
            return corpcode;
        }

        /**
         * Sets the value of the corpcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCORPCODE(String value) {
            this.corpcode = value;
        }

        /**
         * Gets the value of the clientid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLIENTID() {
            return clientid;
        }

        /**
         * Sets the value of the clientid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLIENTID(String value) {
            this.clientid = value;
        }

        /**
         * Gets the value of the listcostcenter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcostcenter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCOSTCENTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTCOSTCENTER }
         * 
         * 
         */
        public List<CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTCOSTCENTER> getLISTCOSTCENTER() {
            if (listcostcenter == null) {
                listcostcenter = new ArrayList<CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTCOSTCENTER>();
            }
            return this.listcostcenter;
        }

        /**
         * Gets the value of the listrmdata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listrmdata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTRMDATA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTRMDATA }
         * 
         * 
         */
        public List<CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTRMDATA> getLISTRMDATA() {
            if (listrmdata == null) {
                listrmdata = new ArrayList<CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTRMDATA>();
            }
            return this.listrmdata;
        }

        /**
         * Gets the value of the employeenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMPLOYEENUMBER() {
            return employeenumber;
        }

        /**
         * Sets the value of the employeenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMPLOYEENUMBER(String value) {
            this.employeenumber = value;
        }

        /**
         * Gets the value of the voyageurrewardsnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVOYAGEURREWARDSNUMBER() {
            return voyageurrewardsnumber;
        }

        /**
         * Sets the value of the voyageurrewardsnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVOYAGEURREWARDSNUMBER(String value) {
            this.voyageurrewardsnumber = value;
        }

        /**
         * Gets the value of the iatanumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIATANUMBER() {
            return iatanumber;
        }

        /**
         * Sets the value of the iatanumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIATANUMBER(String value) {
            this.iatanumber = value;
        }

        /**
         * Gets the value of the dknumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDKNUMBER() {
            return dknumber;
        }

        /**
         * Sets the value of the dknumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDKNUMBER(String value) {
            this.dknumber = value;
        }

        /**
         * Gets the value of the grouptype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGROUPTYPE() {
            return grouptype;
        }

        /**
         * Sets the value of the grouptype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGROUPTYPE(String value) {
            this.grouptype = value;
        }

        /**
         * Gets the value of the groupqueuingoffice property.
         * 
         * @return
         *     possible object is
         *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE }
         *     
         */
        public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE getGROUPQUEUINGOFFICE() {
            return groupqueuingoffice;
        }

        /**
         * Sets the value of the groupqueuingoffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE }
         *     
         */
        public void setGROUPQUEUINGOFFICE(CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE value) {
            this.groupqueuingoffice = value;
        }

        /**
         * Gets the value of the listfce property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfce property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTFCE }
         * 
         * 
         */
        public List<CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTFCE> getLISTFCE() {
            if (listfce == null) {
                listfce = new ArrayList<CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTFCE>();
            }
            return this.listfce;
        }

        /**
         * Gets the value of the companyprofileidentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPANYPROFILEIDENTIFIER() {
            return companyprofileidentifier;
        }

        /**
         * Sets the value of the companyprofileidentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPANYPROFILEIDENTIFIER(String value) {
            this.companyprofileidentifier = value;
        }

        /**
         * Gets the value of the companyprofilename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPANYPROFILENAME() {
            return companyprofilename;
        }

        /**
         * Sets the value of the companyprofilename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPANYPROFILENAME(String value) {
            this.companyprofilename = value;
        }

        /**
         * Gets the value of the cmpcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCMPCODE() {
            return cmpcode;
        }

        /**
         * Sets the value of the cmpcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCMPCODE(String value) {
            this.cmpcode = value;
        }

        /**
         * Gets the value of the ordernumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDERNUMBER() {
            return ordernumber;
        }

        /**
         * Sets the value of the ordernumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDERNUMBER(String value) {
            this.ordernumber = value;
        }

        /**
         * Gets the value of the travelorderidentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAVELORDERIDENTITY() {
            return travelorderidentity;
        }

        /**
         * Sets the value of the travelorderidentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAVELORDERIDENTITY(String value) {
            this.travelorderidentity = value;
        }

        /**
         * Gets the value of the freetext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFREETEXT() {
            return freetext;
        }

        /**
         * Sets the value of the freetext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFREETEXT(String value) {
            this.freetext = value;
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
         *         &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="CATEGORY" type="{}unprotectedStringType"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="CATEGORY" type="{}unprotectedStringType"/&gt;
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
        public static class GROUPQUEUINGOFFICE
            implements Serializable
        {

            @XmlElement(name = "QUEUE_ID")
            protected BigInteger queueid;
            @XmlElement(name = "NORMAL_QUEUE")
            protected CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.NORMALQUEUE normalqueue;
            @XmlElement(name = "FAILURE_QUEUE")
            protected CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.FAILUREQUEUE failurequeue;

            /**
             * Gets the value of the queueid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQUEUEID() {
                return queueid;
            }

            /**
             * Sets the value of the queueid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQUEUEID(BigInteger value) {
                this.queueid = value;
            }

            /**
             * Gets the value of the normalqueue property.
             * 
             * @return
             *     possible object is
             *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.NORMALQUEUE }
             *     
             */
            public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.NORMALQUEUE getNORMALQUEUE() {
                return normalqueue;
            }

            /**
             * Sets the value of the normalqueue property.
             * 
             * @param value
             *     allowed object is
             *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.NORMALQUEUE }
             *     
             */
            public void setNORMALQUEUE(CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.NORMALQUEUE value) {
                this.normalqueue = value;
            }

            /**
             * Gets the value of the failurequeue property.
             * 
             * @return
             *     possible object is
             *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.FAILUREQUEUE }
             *     
             */
            public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.FAILUREQUEUE getFAILUREQUEUE() {
                return failurequeue;
            }

            /**
             * Sets the value of the failurequeue property.
             * 
             * @param value
             *     allowed object is
             *     {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.FAILUREQUEUE }
             *     
             */
            public void setFAILUREQUEUE(CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.FAILUREQUEUE value) {
                this.failurequeue = value;
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
             *         &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="CATEGORY" type="{}unprotectedStringType"/&gt;
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
            public static class FAILUREQUEUE
                implements Serializable
            {

                @XmlElement(name = "OFFICE_ID", required = true)
                protected String officeid;
                @XmlElement(name = "NUMBER", required = true)
                protected BigInteger number;
                @XmlElement(name = "CATEGORY", required = true)
                protected String category;

                /**
                 * Gets the value of the officeid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOFFICEID() {
                    return officeid;
                }

                /**
                 * Sets the value of the officeid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOFFICEID(String value) {
                    this.officeid = value;
                }

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNUMBER() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNUMBER(BigInteger value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the category property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCATEGORY() {
                    return category;
                }

                /**
                 * Sets the value of the category property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCATEGORY(String value) {
                    this.category = value;
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
             *       &lt;all&gt;
             *         &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="CATEGORY" type="{}unprotectedStringType"/&gt;
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
            public static class NORMALQUEUE
                implements Serializable
            {

                @XmlElement(name = "OFFICE_ID", required = true)
                protected String officeid;
                @XmlElement(name = "NUMBER", required = true)
                protected BigInteger number;
                @XmlElement(name = "CATEGORY", required = true)
                protected String category;

                /**
                 * Gets the value of the officeid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOFFICEID() {
                    return officeid;
                }

                /**
                 * Sets the value of the officeid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOFFICEID(String value) {
                    this.officeid = value;
                }

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNUMBER() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNUMBER(BigInteger value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the category property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCATEGORY() {
                    return category;
                }

                /**
                 * Sets the value of the category property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCATEGORY(String value) {
                    this.category = value;
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
         *       &lt;all&gt;
         *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DEPARTMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DIVISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CORPORATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class JOB
            implements Serializable
        {

            @XmlElement(name = "TITLE")
            protected String title;
            @XmlElement(name = "PROJECT")
            protected String project;
            @XmlElement(name = "DEPARTMENT")
            protected String department;
            @XmlElement(name = "DIVISION")
            protected String division;
            @XmlElement(name = "CORPORATION")
            protected String corporation;

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTITLE() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTITLE(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the project property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROJECT() {
                return project;
            }

            /**
             * Sets the value of the project property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROJECT(String value) {
                this.project = value;
            }

            /**
             * Gets the value of the department property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEPARTMENT() {
                return department;
            }

            /**
             * Sets the value of the department property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEPARTMENT(String value) {
                this.department = value;
            }

            /**
             * Gets the value of the division property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDIVISION() {
                return division;
            }

            /**
             * Sets the value of the division property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDIVISION(String value) {
                this.division = value;
            }

            /**
             * Gets the value of the corporation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCORPORATION() {
                return corporation;
            }

            /**
             * Sets the value of the corporation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCORPORATION(String value) {
                this.corporation = value;
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
         *       &lt;all&gt;
         *         &lt;element name="COST_CENTER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="COST_CENTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class LISTCOSTCENTER
            implements Serializable
        {

            @XmlElement(name = "COST_CENTER_ID")
            protected BigInteger costcenterid;
            @XmlElement(name = "COST_CENTER")
            protected String costcenter;

            /**
             * Gets the value of the costcenterid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCOSTCENTERID() {
                return costcenterid;
            }

            /**
             * Sets the value of the costcenterid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCOSTCENTERID(BigInteger value) {
                this.costcenterid = value;
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
         *         &lt;element name="FCE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MEMBERSHIP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class LISTFCE
            implements Serializable
        {

            @XmlElement(name = "FCE_ID")
            protected String fceid;
            @XmlElement(name = "MEMBERSHIP_ID")
            protected String membershipid;
            @XmlElement(name = "CARRIER_CODE")
            protected String carriercode;

            /**
             * Gets the value of the fceid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFCEID() {
                return fceid;
            }

            /**
             * Sets the value of the fceid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFCEID(String value) {
                this.fceid = value;
            }

            /**
             * Gets the value of the membershipid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMEMBERSHIPID() {
                return membershipid;
            }

            /**
             * Sets the value of the membershipid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMEMBERSHIPID(String value) {
                this.membershipid = value;
            }

            /**
             * Gets the value of the carriercode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCARRIERCODE() {
                return carriercode;
            }

            /**
             * Sets the value of the carriercode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCARRIERCODE(String value) {
                this.carriercode = value;
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
         *       &lt;all&gt;
         *         &lt;element name="RM_DATA_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="RM_DATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class LISTRMDATA
            implements Serializable
        {

            @XmlElement(name = "RM_DATA_ID")
            protected BigInteger rmdataid;
            @XmlElement(name = "RM_DATA")
            protected String rmdata;

            /**
             * Gets the value of the rmdataid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRMDATAID() {
                return rmdataid;
            }

            /**
             * Sets the value of the rmdataid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRMDATAID(BigInteger value) {
                this.rmdataid = value;
            }

            /**
             * Gets the value of the rmdata property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRMDATA() {
                return rmdata;
            }

            /**
             * Sets the value of the rmdata property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRMDATA(String value) {
                this.rmdata = value;
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
     *       &lt;all&gt;
     *         &lt;element name="LEAVING" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RETURNING" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OUT_OF_OFFICE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class OUTOFOFFICEINFORMATION
        implements Serializable
    {

        @XmlElement(name = "LEAVING", required = true)
        protected String leaving;
        @XmlElement(name = "RETURNING", required = true)
        protected String returning;
        @XmlElement(name = "OUT_OF_OFFICE", required = true)
        protected String outofoffice;

        /**
         * Gets the value of the leaving property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLEAVING() {
            return leaving;
        }

        /**
         * Sets the value of the leaving property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLEAVING(String value) {
            this.leaving = value;
        }

        /**
         * Gets the value of the returning property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNING() {
            return returning;
        }

        /**
         * Sets the value of the returning property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNING(String value) {
            this.returning = value;
        }

        /**
         * Gets the value of the outofoffice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOUTOFOFFICE() {
            return outofoffice;
        }

        /**
         * Sets the value of the outofoffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOUTOFOFFICE(String value) {
            this.outofoffice = value;
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
     *       &lt;all&gt;
     *         &lt;element name="ADMINISTRATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_TRAVELER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="TRAVEL_ARRANGER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="TRAVEL_APPROVER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="OUT_OF_POLICY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PNR_MODIFICATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="TRAVEL_APPROVAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="SUPER_ADMINISTRATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="AGENT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="AIRLINE_AGENT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="AIRLINE_AGENT_MANAGER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="USER_MANAGER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    public static class PERMISSION
        implements Serializable
    {

        @XmlElement(name = "ADMINISTRATOR")
        protected Boolean administrator;
        @XmlElement(name = "IS_TRAVELER")
        protected Boolean istraveler;
        @XmlElement(name = "TRAVEL_ARRANGER")
        protected Boolean travelarranger;
        @XmlElement(name = "TRAVEL_APPROVER")
        protected Boolean travelapprover;
        @XmlElement(name = "OUT_OF_POLICY")
        protected Boolean outofpolicy;
        @XmlElement(name = "PNR_MODIFICATION")
        protected Boolean pnrmodification;
        @XmlElement(name = "TRAVEL_APPROVAL")
        protected Boolean travelapproval;
        @XmlElement(name = "SUPER_ADMINISTRATOR")
        protected Boolean superadministrator;
        @XmlElement(name = "AGENT")
        protected Object agent;
        @XmlElement(name = "AIRLINE_AGENT")
        protected Object airlineagent;
        @XmlElement(name = "AIRLINE_AGENT_MANAGER")
        protected Object airlineagentmanager;
        @XmlElement(name = "USER_MANAGER")
        protected Object usermanager;

        /**
         * Gets the value of the administrator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isADMINISTRATOR() {
            return administrator;
        }

        /**
         * Sets the value of the administrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setADMINISTRATOR(Boolean value) {
            this.administrator = value;
        }

        /**
         * Gets the value of the istraveler property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISTRAVELER() {
            return istraveler;
        }

        /**
         * Sets the value of the istraveler property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISTRAVELER(Boolean value) {
            this.istraveler = value;
        }

        /**
         * Gets the value of the travelarranger property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTRAVELARRANGER() {
            return travelarranger;
        }

        /**
         * Sets the value of the travelarranger property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTRAVELARRANGER(Boolean value) {
            this.travelarranger = value;
        }

        /**
         * Gets the value of the travelapprover property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTRAVELAPPROVER() {
            return travelapprover;
        }

        /**
         * Sets the value of the travelapprover property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTRAVELAPPROVER(Boolean value) {
            this.travelapprover = value;
        }

        /**
         * Gets the value of the outofpolicy property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOUTOFPOLICY() {
            return outofpolicy;
        }

        /**
         * Sets the value of the outofpolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOUTOFPOLICY(Boolean value) {
            this.outofpolicy = value;
        }

        /**
         * Gets the value of the pnrmodification property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPNRMODIFICATION() {
            return pnrmodification;
        }

        /**
         * Sets the value of the pnrmodification property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPNRMODIFICATION(Boolean value) {
            this.pnrmodification = value;
        }

        /**
         * Gets the value of the travelapproval property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTRAVELAPPROVAL() {
            return travelapproval;
        }

        /**
         * Sets the value of the travelapproval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTRAVELAPPROVAL(Boolean value) {
            this.travelapproval = value;
        }

        /**
         * Gets the value of the superadministrator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSUPERADMINISTRATOR() {
            return superadministrator;
        }

        /**
         * Sets the value of the superadministrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSUPERADMINISTRATOR(Boolean value) {
            this.superadministrator = value;
        }

        /**
         * Gets the value of the agent property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAGENT() {
            return agent;
        }

        /**
         * Sets the value of the agent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAGENT(Object value) {
            this.agent = value;
        }

        /**
         * Gets the value of the airlineagent property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAIRLINEAGENT() {
            return airlineagent;
        }

        /**
         * Sets the value of the airlineagent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAIRLINEAGENT(Object value) {
            this.airlineagent = value;
        }

        /**
         * Gets the value of the airlineagentmanager property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAIRLINEAGENTMANAGER() {
            return airlineagentmanager;
        }

        /**
         * Sets the value of the airlineagentmanager property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAIRLINEAGENTMANAGER(Object value) {
            this.airlineagentmanager = value;
        }

        /**
         * Gets the value of the usermanager property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUSERMANAGER() {
            return usermanager;
        }

        /**
         * Sets the value of the usermanager property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUSERMANAGER(Object value) {
            this.usermanager = value;
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
     *         &lt;element name="TRAVEL_APPROVER_PERMISSION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SUPER_TRAVEL_APPROVER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "travelapproverpermission"
    })
    public static class TRAVELAPPROVERINFORMATION
        implements Serializable
    {

        @XmlElement(name = "TRAVEL_APPROVER_PERMISSION")
        protected CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION.TRAVELAPPROVERPERMISSION travelapproverpermission;

        /**
         * Gets the value of the travelapproverpermission property.
         * 
         * @return
         *     possible object is
         *     {@link CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION.TRAVELAPPROVERPERMISSION }
         *     
         */
        public CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION.TRAVELAPPROVERPERMISSION getTRAVELAPPROVERPERMISSION() {
            return travelapproverpermission;
        }

        /**
         * Sets the value of the travelapproverpermission property.
         * 
         * @param value
         *     allowed object is
         *     {@link CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION.TRAVELAPPROVERPERMISSION }
         *     
         */
        public void setTRAVELAPPROVERPERMISSION(CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION.TRAVELAPPROVERPERMISSION value) {
            this.travelapproverpermission = value;
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
         *         &lt;element name="SUPER_TRAVEL_APPROVER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "supertravelapprover"
        })
        public static class TRAVELAPPROVERPERMISSION
            implements Serializable
        {

            @XmlElement(name = "SUPER_TRAVEL_APPROVER", required = true)
            protected String supertravelapprover;

            /**
             * Gets the value of the supertravelapprover property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSUPERTRAVELAPPROVER() {
                return supertravelapprover;
            }

            /**
             * Sets the value of the supertravelapprover property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSUPERTRAVELAPPROVER(String value) {
                this.supertravelapprover = value;
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
     *         &lt;element name="TRAVEL_ARRANGE_PERMISSION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="PNR_MODIFICATION" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="PNR_CANCELATION" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_NOMINATED_TRAVEL_ARRANGER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="NOMINATED_TRAVEL_ARRANGER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="NOMINATED_TRAVEL_ARRANGER" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="COMMUNITY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "travelarrangepermission",
        "listnominatedtravelarranger"
    })
    public static class TRAVELARRANGERINFORMATION
        implements Serializable
    {

        @XmlElement(name = "TRAVEL_ARRANGE_PERMISSION")
        protected CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.TRAVELARRANGEPERMISSION travelarrangepermission;
        @XmlElement(name = "LIST_NOMINATED_TRAVEL_ARRANGER")
        protected List<CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER> listnominatedtravelarranger;

        /**
         * Gets the value of the travelarrangepermission property.
         * 
         * @return
         *     possible object is
         *     {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.TRAVELARRANGEPERMISSION }
         *     
         */
        public CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.TRAVELARRANGEPERMISSION getTRAVELARRANGEPERMISSION() {
            return travelarrangepermission;
        }

        /**
         * Sets the value of the travelarrangepermission property.
         * 
         * @param value
         *     allowed object is
         *     {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.TRAVELARRANGEPERMISSION }
         *     
         */
        public void setTRAVELARRANGEPERMISSION(CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.TRAVELARRANGEPERMISSION value) {
            this.travelarrangepermission = value;
        }

        /**
         * Gets the value of the listnominatedtravelarranger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listnominatedtravelarranger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTNOMINATEDTRAVELARRANGER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER }
         * 
         * 
         */
        public List<CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER> getLISTNOMINATEDTRAVELARRANGER() {
            if (listnominatedtravelarranger == null) {
                listnominatedtravelarranger = new ArrayList<CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER>();
            }
            return this.listnominatedtravelarranger;
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
         *         &lt;element name="NOMINATED_TRAVEL_ARRANGER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="NOMINATED_TRAVEL_ARRANGER" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="COMMUNITY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        public static class LISTNOMINATEDTRAVELARRANGER
            implements Serializable
        {

            @XmlElement(name = "NOMINATED_TRAVEL_ARRANGER_ID", required = true)
            protected BigInteger nominatedtravelarrangerid;
            @XmlElement(name = "NOMINATED_TRAVEL_ARRANGER")
            protected CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER.NOMINATEDTRAVELARRANGER nominatedtravelarranger;

            /**
             * Gets the value of the nominatedtravelarrangerid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNOMINATEDTRAVELARRANGERID() {
                return nominatedtravelarrangerid;
            }

            /**
             * Sets the value of the nominatedtravelarrangerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNOMINATEDTRAVELARRANGERID(BigInteger value) {
                this.nominatedtravelarrangerid = value;
            }

            /**
             * Gets the value of the nominatedtravelarranger property.
             * 
             * @return
             *     possible object is
             *     {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER.NOMINATEDTRAVELARRANGER }
             *     
             */
            public CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER.NOMINATEDTRAVELARRANGER getNOMINATEDTRAVELARRANGER() {
                return nominatedtravelarranger;
            }

            /**
             * Sets the value of the nominatedtravelarranger property.
             * 
             * @param value
             *     allowed object is
             *     {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER.NOMINATEDTRAVELARRANGER }
             *     
             */
            public void setNOMINATEDTRAVELARRANGER(CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER.NOMINATEDTRAVELARRANGER value) {
                this.nominatedtravelarranger = value;
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
             *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="COMMUNITY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            public static class NOMINATEDTRAVELARRANGER
                implements Serializable
            {

                @XmlElement(name = "USER_ID", required = true)
                protected String userid;
                @XmlElement(name = "COMMUNITY_ID", required = true)
                protected String communityid;
                @XmlElement(name = "FIRST_NAME", required = true)
                protected String firstname;
                @XmlElement(name = "LAST_NAME", required = true)
                protected String lastname;

                /**
                 * Gets the value of the userid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUSERID() {
                    return userid;
                }

                /**
                 * Sets the value of the userid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUSERID(String value) {
                    this.userid = value;
                }

                /**
                 * Gets the value of the communityid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCOMMUNITYID() {
                    return communityid;
                }

                /**
                 * Sets the value of the communityid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCOMMUNITYID(String value) {
                    this.communityid = value;
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
         *       &lt;all&gt;
         *         &lt;element name="PNR_MODIFICATION" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="PNR_CANCELATION" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        public static class TRAVELARRANGEPERMISSION
            implements Serializable
        {

            @XmlElement(name = "PNR_MODIFICATION")
            protected boolean pnrmodification;
            @XmlElement(name = "PNR_CANCELATION")
            protected boolean pnrcancelation;

            /**
             * Gets the value of the pnrmodification property.
             * 
             */
            public boolean isPNRMODIFICATION() {
                return pnrmodification;
            }

            /**
             * Sets the value of the pnrmodification property.
             * 
             */
            public void setPNRMODIFICATION(boolean value) {
                this.pnrmodification = value;
            }

            /**
             * Gets the value of the pnrcancelation property.
             * 
             */
            public boolean isPNRCANCELATION() {
                return pnrcancelation;
            }

            /**
             * Sets the value of the pnrcancelation property.
             * 
             */
            public void setPNRCANCELATION(boolean value) {
                this.pnrcancelation = value;
            }

        }

    }

}
