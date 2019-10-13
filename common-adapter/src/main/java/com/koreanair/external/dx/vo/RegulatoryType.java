package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;

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
  * Type of the regulatory information : personalDetails, passport, visa, identityCard, EmergencyContact...
 **/
@ApiModel(description="Type of the regulatory information : personalDetails, passport, visa, identityCard, EmergencyContact...")
public class RegulatoryType  {
  

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

  public RegulatoryType regulatoryType(RegulatoryTypeEnum regulatoryType) {
    this.regulatoryType = regulatoryType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryType {\n");
    
    sb.append("    regulatoryType: ").append(toIndentedString(regulatoryType)).append("\n");
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

