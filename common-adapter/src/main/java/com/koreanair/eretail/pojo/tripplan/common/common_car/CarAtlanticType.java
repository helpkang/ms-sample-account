
package com.koreanair.eretail.pojo.tripplan.common.common_car;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carAtlanticType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carAtlanticType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMPANY" type="{}carCompanyType" minOccurs="0"/&gt;
 *         &lt;element name="VEHICLE_TYPE" type="{}vehicleCharacteristicsType" minOccurs="0"/&gt;
 *         &lt;element name="VEHICLE_MODEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPANY_LOGOS" type="{}PICTURE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CAR_PICTURES" type="{}PICTURE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LUGGAGE_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SMALL_LUGGAGE_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="BIG_LUGGAGE_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PASSENGER_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="REAR_SEAT_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FRONT_SEAT_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="VALIDITY_INFORMATION" type="{}validityInformation" minOccurs="0"/&gt;
 *         &lt;element name="CONVERTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FREE_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="XCHARGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CAP_PRICE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRICE" type="{}carPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SPECIAL_EQUIPMENT" type="{}specialEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PRICE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}BOOL_IS_OUT_OF_POLICY" minOccurs="0"/&gt;
 *         &lt;element ref="{}DISPLAY_RANK" minOccurs="0"/&gt;
 *         &lt;element name="FORCE_NEGOTIATED_PRICE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AVAIL_WITH_CD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AVAIL_WITH_PC_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFERENCE_KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RATE_CATEGORY" type="{}rateCategory" minOccurs="0"/&gt;
 *         &lt;element name="RATE_MARKETING_INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carAtlanticType", propOrder = {
    "company",
    "vehicletype",
    "vehiclemodel",
    "companylogos",
    "carpictures",
    "luggagecapacity",
    "smallluggagecapacity",
    "bigluggagecapacity",
    "passengercapacity",
    "rearseatcapacity",
    "frontseatcapacity",
    "validityinformation",
    "converted",
    "freemiles",
    "xcharge",
    "capprice",
    "listprice",
    "listspecialequipment",
    "pricecode",
    "terminal",
    "boolisoutofpolicy",
    "displayrank",
    "forcenegotiatedprice",
    "availwithcdnumber",
    "availwithpcnumber",
    "referencekey",
    "ratecategory",
    "ratemarketinginfo"
})
public class CarAtlanticType
    implements Serializable
{

    @XmlElement(name = "COMPANY")
    protected CarCompanyType company;
    @XmlElement(name = "VEHICLE_TYPE")
    protected VehicleCharacteristicsType vehicletype;
    @XmlElement(name = "VEHICLE_MODEL")
    protected String vehiclemodel;
    @XmlElement(name = "COMPANY_LOGOS")
    protected List<PICTURE> companylogos;
    @XmlElement(name = "CAR_PICTURES")
    protected List<PICTURE> carpictures;
    @XmlElement(name = "LUGGAGE_CAPACITY")
    protected BigInteger luggagecapacity;
    @XmlElement(name = "SMALL_LUGGAGE_CAPACITY")
    protected BigInteger smallluggagecapacity;
    @XmlElement(name = "BIG_LUGGAGE_CAPACITY")
    protected BigInteger bigluggagecapacity;
    @XmlElement(name = "PASSENGER_CAPACITY")
    protected BigInteger passengercapacity;
    @XmlElement(name = "REAR_SEAT_CAPACITY")
    protected BigInteger rearseatcapacity;
    @XmlElement(name = "FRONT_SEAT_CAPACITY")
    protected BigInteger frontseatcapacity;
    @XmlElement(name = "VALIDITY_INFORMATION")
    protected ValidityInformation validityinformation;
    @XmlElement(name = "CONVERTED")
    protected Boolean converted;
    @XmlElement(name = "FREE_MILES")
    protected BigInteger freemiles;
    @XmlElement(name = "XCHARGE")
    protected Boolean xcharge;
    @XmlElement(name = "CAP_PRICE")
    protected Boolean capprice;
    @XmlElement(name = "LIST_PRICE")
    protected List<CarPriceType> listprice;
    @XmlElement(name = "LIST_SPECIAL_EQUIPMENT")
    protected List<SpecialEquipment> listspecialequipment;
    @XmlElement(name = "PRICE_CODE")
    protected String pricecode;
    @XmlElement(name = "TERMINAL")
    protected String terminal;
    @XmlElement(name = "BOOL_IS_OUT_OF_POLICY")
    protected Boolean boolisoutofpolicy;
    @XmlElement(name = "DISPLAY_RANK")
    protected String displayrank;
    @XmlElement(name = "FORCE_NEGOTIATED_PRICE")
    protected Boolean forcenegotiatedprice;
    @XmlElement(name = "AVAIL_WITH_CD_NUMBER")
    protected String availwithcdnumber;
    @XmlElement(name = "AVAIL_WITH_PC_NUMBER")
    protected String availwithpcnumber;
    @XmlElement(name = "REFERENCE_KEY")
    protected String referencekey;
    @XmlElement(name = "RATE_CATEGORY")
    protected RateCategory ratecategory;
    @XmlElement(name = "RATE_MARKETING_INFO")
    protected String ratemarketinginfo;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CarCompanyType }
     *     
     */
    public CarCompanyType getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarCompanyType }
     *     
     */
    public void setCOMPANY(CarCompanyType value) {
        this.company = value;
    }

    /**
     * Gets the value of the vehicletype property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristicsType }
     *     
     */
    public VehicleCharacteristicsType getVEHICLETYPE() {
        return vehicletype;
    }

    /**
     * Sets the value of the vehicletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristicsType }
     *     
     */
    public void setVEHICLETYPE(VehicleCharacteristicsType value) {
        this.vehicletype = value;
    }

    /**
     * Gets the value of the vehiclemodel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEHICLEMODEL() {
        return vehiclemodel;
    }

    /**
     * Sets the value of the vehiclemodel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEHICLEMODEL(String value) {
        this.vehiclemodel = value;
    }

    /**
     * Gets the value of the companylogos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companylogos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOMPANYLOGOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PICTURE }
     * 
     * 
     */
    public List<PICTURE> getCOMPANYLOGOS() {
        if (companylogos == null) {
            companylogos = new ArrayList<PICTURE>();
        }
        return this.companylogos;
    }

    /**
     * Gets the value of the carpictures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carpictures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCARPICTURES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PICTURE }
     * 
     * 
     */
    public List<PICTURE> getCARPICTURES() {
        if (carpictures == null) {
            carpictures = new ArrayList<PICTURE>();
        }
        return this.carpictures;
    }

    /**
     * Gets the value of the luggagecapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLUGGAGECAPACITY() {
        return luggagecapacity;
    }

    /**
     * Sets the value of the luggagecapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLUGGAGECAPACITY(BigInteger value) {
        this.luggagecapacity = value;
    }

    /**
     * Gets the value of the smallluggagecapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSMALLLUGGAGECAPACITY() {
        return smallluggagecapacity;
    }

    /**
     * Sets the value of the smallluggagecapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSMALLLUGGAGECAPACITY(BigInteger value) {
        this.smallluggagecapacity = value;
    }

    /**
     * Gets the value of the bigluggagecapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBIGLUGGAGECAPACITY() {
        return bigluggagecapacity;
    }

    /**
     * Sets the value of the bigluggagecapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBIGLUGGAGECAPACITY(BigInteger value) {
        this.bigluggagecapacity = value;
    }

    /**
     * Gets the value of the passengercapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPASSENGERCAPACITY() {
        return passengercapacity;
    }

    /**
     * Sets the value of the passengercapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPASSENGERCAPACITY(BigInteger value) {
        this.passengercapacity = value;
    }

    /**
     * Gets the value of the rearseatcapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getREARSEATCAPACITY() {
        return rearseatcapacity;
    }

    /**
     * Sets the value of the rearseatcapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setREARSEATCAPACITY(BigInteger value) {
        this.rearseatcapacity = value;
    }

    /**
     * Gets the value of the frontseatcapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFRONTSEATCAPACITY() {
        return frontseatcapacity;
    }

    /**
     * Sets the value of the frontseatcapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFRONTSEATCAPACITY(BigInteger value) {
        this.frontseatcapacity = value;
    }

    /**
     * Gets the value of the validityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityInformation }
     *     
     */
    public ValidityInformation getVALIDITYINFORMATION() {
        return validityinformation;
    }

    /**
     * Sets the value of the validityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityInformation }
     *     
     */
    public void setVALIDITYINFORMATION(ValidityInformation value) {
        this.validityinformation = value;
    }

    /**
     * Gets the value of the converted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCONVERTED() {
        return converted;
    }

    /**
     * Sets the value of the converted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCONVERTED(Boolean value) {
        this.converted = value;
    }

    /**
     * Gets the value of the freemiles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFREEMILES() {
        return freemiles;
    }

    /**
     * Sets the value of the freemiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFREEMILES(BigInteger value) {
        this.freemiles = value;
    }

    /**
     * Gets the value of the xcharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXCHARGE() {
        return xcharge;
    }

    /**
     * Sets the value of the xcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXCHARGE(Boolean value) {
        this.xcharge = value;
    }

    /**
     * Gets the value of the capprice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCAPPRICE() {
        return capprice;
    }

    /**
     * Sets the value of the capprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCAPPRICE(Boolean value) {
        this.capprice = value;
    }

    /**
     * Gets the value of the listprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarPriceType }
     * 
     * 
     */
    public List<CarPriceType> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<CarPriceType>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the listspecialequipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspecialequipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPECIALEQUIPMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialEquipment }
     * 
     * 
     */
    public List<SpecialEquipment> getLISTSPECIALEQUIPMENT() {
        if (listspecialequipment == null) {
            listspecialequipment = new ArrayList<SpecialEquipment>();
        }
        return this.listspecialequipment;
    }

    /**
     * Gets the value of the pricecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICECODE() {
        return pricecode;
    }

    /**
     * Sets the value of the pricecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICECODE(String value) {
        this.pricecode = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTERMINAL() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTERMINAL(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the boolisoutofpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLISOUTOFPOLICY() {
        return boolisoutofpolicy;
    }

    /**
     * Sets the value of the boolisoutofpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLISOUTOFPOLICY(Boolean value) {
        this.boolisoutofpolicy = value;
    }

    /**
     * Gets the value of the displayrank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYRANK() {
        return displayrank;
    }

    /**
     * Sets the value of the displayrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYRANK(String value) {
        this.displayrank = value;
    }

    /**
     * Gets the value of the forcenegotiatedprice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCENEGOTIATEDPRICE() {
        return forcenegotiatedprice;
    }

    /**
     * Sets the value of the forcenegotiatedprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCENEGOTIATEDPRICE(Boolean value) {
        this.forcenegotiatedprice = value;
    }

    /**
     * Gets the value of the availwithcdnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILWITHCDNUMBER() {
        return availwithcdnumber;
    }

    /**
     * Sets the value of the availwithcdnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILWITHCDNUMBER(String value) {
        this.availwithcdnumber = value;
    }

    /**
     * Gets the value of the availwithpcnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILWITHPCNUMBER() {
        return availwithpcnumber;
    }

    /**
     * Sets the value of the availwithpcnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILWITHPCNUMBER(String value) {
        this.availwithpcnumber = value;
    }

    /**
     * Gets the value of the referencekey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEKEY() {
        return referencekey;
    }

    /**
     * Sets the value of the referencekey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEKEY(String value) {
        this.referencekey = value;
    }

    /**
     * Gets the value of the ratecategory property.
     * 
     * @return
     *     possible object is
     *     {@link RateCategory }
     *     
     */
    public RateCategory getRATECATEGORY() {
        return ratecategory;
    }

    /**
     * Sets the value of the ratecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCategory }
     *     
     */
    public void setRATECATEGORY(RateCategory value) {
        this.ratecategory = value;
    }

    /**
     * Gets the value of the ratemarketinginfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEMARKETINGINFO() {
        return ratemarketinginfo;
    }

    /**
     * Sets the value of the ratemarketinginfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEMARKETINGINFO(String value) {
        this.ratemarketinginfo = value;
    }

}
