package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.RegulatoryType;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * It specifies the mandatory information to be provided for a specific RegulatoryDetail type
 **/
@ApiModel(description="It specifies the mandatory information to be provided for a specific RegulatoryDetail type")
public class RegulatoryDetailsRequirements  {
  

@XmlType(name="RegulatoryTypeEnum")
@XmlEnum(String.class)
public enum RegulatoryTypeEnum {

@XmlEnumValue("personalDetails") PERSONALDETAILS(String.valueOf("personalDetails")), @XmlEnumValue("countryOfResidence") COUNTRYOFRESIDENCE(String.valueOf("countryOfResidence")), @XmlEnumValue("passport") PASSPORT(String.valueOf("passport")), @XmlEnumValue("identityCard") IDENTITYCARD(String.valueOf("identityCard")), @XmlEnumValue("airAttendanceLicense") AIRATTENDANCELICENSE(String.valueOf("airAttendanceLicense")), @XmlEnumValue("birthCertificate") BIRTHCERTIFICATE(String.valueOf("birthCertificate")), @XmlEnumValue("borderCrossingCard") BORDERCROSSINGCARD(String.valueOf("borderCrossingCard")), @XmlEnumValue("drivingLicense") DRIVINGLICENSE(String.valueOf("drivingLicense")), @XmlEnumValue("flightMechanicalLicense") FLIGHTMECHANICALLICENSE(String.valueOf("flightMechanicalLicense")), @XmlEnumValue("foreignNationalRegistration") FOREIGNNATIONALREGISTRATION(String.valueOf("foreignNationalRegistration")), @XmlEnumValue("loyalAttorneyIdentification") LOYALATTORNEYIDENTIFICATION(String.valueOf("loyalAttorneyIdentification")), @XmlEnumValue("militaryIdentityCard") MILITARYIDENTITYCARD(String.valueOf("militaryIdentityCard")), @XmlEnumValue("operationalDispatcherLicense") OPERATIONALDISPATCHERLICENSE(String.valueOf("operationalDispatcherLicense")), @XmlEnumValue("pilotLicense") PILOTLICENSE(String.valueOf("pilotLicense")), @XmlEnumValue("reEntryPermit") REENTRYPERMIT(String.valueOf("reEntryPermit")), @XmlEnumValue("naturalisationCardUS") NATURALISATIONCARDUS(String.valueOf("naturalisationCardUS")), @XmlEnumValue("workPermit") WORKPERMIT(String.valueOf("workPermit")), @XmlEnumValue("visa") VISA(String.valueOf("visa")), @XmlEnumValue("residentAlienCard") RESIDENTALIENCARD(String.valueOf("residentAlienCard")), @XmlEnumValue("permanentResidentCard") PERMANENTRESIDENTCARD(String.valueOf("permanentResidentCard")), @XmlEnumValue("destinationAddress") DESTINATIONADDRESS(String.valueOf("destinationAddress")), @XmlEnumValue("homeAddress") HOMEADDRESS(String.valueOf("homeAddress")), @XmlEnumValue("emergencyContact") EMERGENCYCONTACT(String.valueOf("emergencyContact")), @XmlEnumValue("redressNumber") REDRESSNUMBER(String.valueOf("redressNumber")), @XmlEnumValue("knownTravelerNumber") KNOWNTRAVELERNUMBER(String.valueOf("knownTravelerNumber")), @XmlEnumValue("homeReentryPermit") HOMEREENTRYPERMIT(String.valueOf("homeReentryPermit")), @XmlEnumValue("chinaTravelPermit") CHINATRAVELPERMIT(String.valueOf("chinaTravelPermit")), @XmlEnumValue("chinaTravelPermitHongKongMacao") CHINATRAVELPERMITHONGKONGMACAO(String.valueOf("chinaTravelPermitHongKongMacao")), @XmlEnumValue("chinaExitAndEntryPermit") CHINAEXITANDENTRYPERMIT(String.valueOf("chinaExitAndEntryPermit")), @XmlEnumValue("residentTravelPermit") RESIDENTTRAVELPERMIT(String.valueOf("residentTravelPermit")), @XmlEnumValue("residentTravelPermitToFromTaiwanAndChina") RESIDENTTRAVELPERMITTOFROMTAIWANANDCHINA(String.valueOf("residentTravelPermitToFromTaiwanAndChina")), @XmlEnumValue("residentTravelPermitToFromHongKongMacao") RESIDENTTRAVELPERMITTOFROMHONGKONGMACAO(String.valueOf("residentTravelPermitToFromHongKongMacao")), @XmlEnumValue("residentTravelPermitToHongKongMacao") RESIDENTTRAVELPERMITTOHONGKONGMACAO(String.valueOf("residentTravelPermitToHongKongMacao")), @XmlEnumValue("taiwanExitAndEntryPermit") TAIWANEXITANDENTRYPERMIT(String.valueOf("taiwanExitAndEntryPermit")), @XmlEnumValue("nexusCard") NEXUSCARD(String.valueOf("nexusCard"));


    private String value;

    RegulatoryTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RegulatoryTypeEnum fromValue(String v) {
        for (RegulatoryTypeEnum b : RegulatoryTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private RegulatoryTypeEnum regulatoryType = null;


@XmlType(name="DetailsTypeEnum")
@XmlEnum(String.class)
public enum DetailsTypeEnum {

@XmlEnumValue("document") DOCUMENT(String.valueOf("document")), @XmlEnumValue("personalDetails") PERSONALDETAILS(String.valueOf("personalDetails")), @XmlEnumValue("address") ADDRESS(String.valueOf("address")), @XmlEnumValue("phone") PHONE(String.valueOf("phone"));


    private String value;

    DetailsTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DetailsTypeEnum fromValue(String v) {
        for (DetailsTypeEnum b : DetailsTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of the regulatory details to be filled")
 /**
   * Type of the regulatory details to be filled
  **/
  private DetailsTypeEnum detailsType = null;


@XmlType(name="RequiredDetailsFieldsEnum")
@XmlEnum(String.class)
public enum RequiredDetailsFieldsEnum {

@XmlEnumValue("name") NAME(String.valueOf("name")), @XmlEnumValue("birthDate") BIRTHDATE(String.valueOf("birthDate")), @XmlEnumValue("birthPlace") BIRTHPLACE(String.valueOf("birthPlace")), @XmlEnumValue("gender") GENDER(String.valueOf("gender")), @XmlEnumValue("number") NUMBER(String.valueOf("number")), @XmlEnumValue("nationalityCountryCode") NATIONALITYCOUNTRYCODE(String.valueOf("nationalityCountryCode")), @XmlEnumValue("expiryDate") EXPIRYDATE(String.valueOf("expiryDate")), @XmlEnumValue("effectiveDate") EFFECTIVEDATE(String.valueOf("effectiveDate")), @XmlEnumValue("issuanceDate") ISSUANCEDATE(String.valueOf("issuanceDate")), @XmlEnumValue("issuanceLocation") ISSUANCELOCATION(String.valueOf("issuanceLocation")), @XmlEnumValue("issuanceCountry") ISSUANCECOUNTRY(String.valueOf("issuanceCountry")), @XmlEnumValue("purposeOfVisit") PURPOSEOFVISIT(String.valueOf("purposeOfVisit")), @XmlEnumValue("lines") LINES(String.valueOf("lines")), @XmlEnumValue("zipCode") ZIPCODE(String.valueOf("zipCode")), @XmlEnumValue("cityName") CITYNAME(String.valueOf("cityName")), @XmlEnumValue("stateCode") STATECODE(String.valueOf("stateCode")), @XmlEnumValue("countryPhoneExtension") COUNTRYPHONEEXTENSION(String.valueOf("countryPhoneExtension")), @XmlEnumValue("countryOfResidence") COUNTRYOFRESIDENCE(String.valueOf("countryOfResidence"));


    private String value;

    RequiredDetailsFieldsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RequiredDetailsFieldsEnum fromValue(String v) {
        for (RequiredDetailsFieldsEnum b : RequiredDetailsFieldsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "List of the fields required for those details")
 /**
   * List of the fields required for those details
  **/
  private List<RequiredDetailsFieldsEnum> requiredDetailsFields = new ArrayList<>();

  @ApiModelProperty(required = true, value = "Indicate if the regulatory details can be declined by the traveler.")
 /**
   * Indicate if the regulatory details can be declined by the traveler.
  **/
  private Boolean canBeDeclined = null;
 /**
   * Get regulatoryType
   * @return regulatoryType
  **/
  @JsonProperty("regulatoryType")
  public String getRegulatoryType() {
    if (regulatoryType == null) {
      return null;
    }
    return regulatoryType.value();
  }

  public void setRegulatoryType(RegulatoryTypeEnum regulatoryType) {
    this.regulatoryType = regulatoryType;
  }

  public RegulatoryDetailsRequirements regulatoryType(RegulatoryTypeEnum regulatoryType) {
    this.regulatoryType = regulatoryType;
    return this;
  }

 /**
   * Type of the regulatory details to be filled
   * @return detailsType
  **/
  @JsonProperty("detailsType")
  public String getDetailsType() {
    if (detailsType == null) {
      return null;
    }
    return detailsType.value();
  }

  public void setDetailsType(DetailsTypeEnum detailsType) {
    this.detailsType = detailsType;
  }

  public RegulatoryDetailsRequirements detailsType(DetailsTypeEnum detailsType) {
    this.detailsType = detailsType;
    return this;
  }

 /**
   * List of the fields required for those details
   * @return requiredDetailsFields
  **/
  @JsonProperty("requiredDetailsFields")
  public List<RequiredDetailsFieldsEnum> getRequiredDetailsFields() {
    return requiredDetailsFields;
  }

  public void setRequiredDetailsFields(List<RequiredDetailsFieldsEnum> requiredDetailsFields) {
    this.requiredDetailsFields = requiredDetailsFields;
  }

  public RegulatoryDetailsRequirements requiredDetailsFields(List<RequiredDetailsFieldsEnum> requiredDetailsFields) {
    this.requiredDetailsFields = requiredDetailsFields;
    return this;
  }

  public RegulatoryDetailsRequirements addRequiredDetailsFieldsItem(RequiredDetailsFieldsEnum requiredDetailsFieldsItem) {
    this.requiredDetailsFields.add(requiredDetailsFieldsItem);
    return this;
  }

 /**
   * Indicate if the regulatory details can be declined by the traveler.
   * @return canBeDeclined
  **/
  @JsonProperty("canBeDeclined")
  public Boolean isCanBeDeclined() {
    return canBeDeclined;
  }

  public void setCanBeDeclined(Boolean canBeDeclined) {
    this.canBeDeclined = canBeDeclined;
  }

  public RegulatoryDetailsRequirements canBeDeclined(Boolean canBeDeclined) {
    this.canBeDeclined = canBeDeclined;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryDetailsRequirements {\n");
    
    sb.append("    regulatoryType: ").append(toIndentedString(regulatoryType)).append("\n");
    sb.append("    detailsType: ").append(toIndentedString(detailsType)).append("\n");
    sb.append("    requiredDetailsFields: ").append(toIndentedString(requiredDetailsFields)).append("\n");
    sb.append("    canBeDeclined: ").append(toIndentedString(canBeDeclined)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

