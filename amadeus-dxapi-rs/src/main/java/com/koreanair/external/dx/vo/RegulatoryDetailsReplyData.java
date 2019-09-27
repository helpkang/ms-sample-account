package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.RegulatoryDetail;
import com.koreanair.external.dx.vo.RegulatoryDetailsCategoryRequirement;
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
  * Reply data following a regulatory details call. It contains the list of stored details associated with the resource of the query. If there was some regulatory details declined by the traveler, the list of details is provided. If the authorities  are requesting more details, it will provide the list of missing requirements. Finally, the status cleared will indicate if everything is cleared for the authorities to be allowed to board the plane. 
 **/
@ApiModel(description="Reply data following a regulatory details call. It contains the list of stored details associated with the resource of the query. If there was some regulatory details declined by the traveler, the list of details is provided. If the authorities  are requesting more details, it will provide the list of missing requirements. Finally, the status cleared will indicate if everything is cleared for the authorities to be allowed to board the plane. ")
public class RegulatoryDetailsReplyData  {
  
  @ApiModelProperty(value = "Traveler Id of the regulatory details")
 /**
   * Traveler Id of the regulatory details
  **/
  private String travelerId = null;

  @ApiModelProperty(required = true, value = "Indicate if the passenger is cleared to board in regard only to the regulatory requirements for his journey.")
 /**
   * Indicate if the passenger is cleared to board in regard only to the regulatory requirements for his journey.
  **/
  private Boolean statusCleared = null;

  @ApiModelProperty(value = "List of regulatory details already provided for the traveler for his journey")
 /**
   * List of regulatory details already provided for the traveler for his journey
  **/
  private List<RegulatoryDetail> storedDetails = null;


@XmlType(name="DeclinedDetailsEnum")
@XmlEnum(String.class)
public enum DeclinedDetailsEnum {

@XmlEnumValue("personalDetails") PERSONALDETAILS(String.valueOf("personalDetails")), @XmlEnumValue("countryOfResidence") COUNTRYOFRESIDENCE(String.valueOf("countryOfResidence")), @XmlEnumValue("passport") PASSPORT(String.valueOf("passport")), @XmlEnumValue("identityCard") IDENTITYCARD(String.valueOf("identityCard")), @XmlEnumValue("airAttendanceLicense") AIRATTENDANCELICENSE(String.valueOf("airAttendanceLicense")), @XmlEnumValue("birthCertificate") BIRTHCERTIFICATE(String.valueOf("birthCertificate")), @XmlEnumValue("borderCrossingCard") BORDERCROSSINGCARD(String.valueOf("borderCrossingCard")), @XmlEnumValue("drivingLicense") DRIVINGLICENSE(String.valueOf("drivingLicense")), @XmlEnumValue("flightMechanicalLicense") FLIGHTMECHANICALLICENSE(String.valueOf("flightMechanicalLicense")), @XmlEnumValue("foreignNationalRegistration") FOREIGNNATIONALREGISTRATION(String.valueOf("foreignNationalRegistration")), @XmlEnumValue("loyalAttorneyIdentification") LOYALATTORNEYIDENTIFICATION(String.valueOf("loyalAttorneyIdentification")), @XmlEnumValue("militaryIdentityCard") MILITARYIDENTITYCARD(String.valueOf("militaryIdentityCard")), @XmlEnumValue("operationalDispatcherLicense") OPERATIONALDISPATCHERLICENSE(String.valueOf("operationalDispatcherLicense")), @XmlEnumValue("pilotLicense") PILOTLICENSE(String.valueOf("pilotLicense")), @XmlEnumValue("reEntryPermit") REENTRYPERMIT(String.valueOf("reEntryPermit")), @XmlEnumValue("naturalisationCardUS") NATURALISATIONCARDUS(String.valueOf("naturalisationCardUS")), @XmlEnumValue("workPermit") WORKPERMIT(String.valueOf("workPermit")), @XmlEnumValue("visa") VISA(String.valueOf("visa")), @XmlEnumValue("residentAlienCard") RESIDENTALIENCARD(String.valueOf("residentAlienCard")), @XmlEnumValue("permanentResidentCard") PERMANENTRESIDENTCARD(String.valueOf("permanentResidentCard")), @XmlEnumValue("destinationAddress") DESTINATIONADDRESS(String.valueOf("destinationAddress")), @XmlEnumValue("homeAddress") HOMEADDRESS(String.valueOf("homeAddress")), @XmlEnumValue("emergencyContact") EMERGENCYCONTACT(String.valueOf("emergencyContact")), @XmlEnumValue("redressNumber") REDRESSNUMBER(String.valueOf("redressNumber")), @XmlEnumValue("knownTravelerNumber") KNOWNTRAVELERNUMBER(String.valueOf("knownTravelerNumber")), @XmlEnumValue("homeReentryPermit") HOMEREENTRYPERMIT(String.valueOf("homeReentryPermit")), @XmlEnumValue("chinaTravelPermit") CHINATRAVELPERMIT(String.valueOf("chinaTravelPermit")), @XmlEnumValue("chinaTravelPermitHongKongMacao") CHINATRAVELPERMITHONGKONGMACAO(String.valueOf("chinaTravelPermitHongKongMacao")), @XmlEnumValue("chinaExitAndEntryPermit") CHINAEXITANDENTRYPERMIT(String.valueOf("chinaExitAndEntryPermit")), @XmlEnumValue("residentTravelPermit") RESIDENTTRAVELPERMIT(String.valueOf("residentTravelPermit")), @XmlEnumValue("residentTravelPermitToFromTaiwanAndChina") RESIDENTTRAVELPERMITTOFROMTAIWANANDCHINA(String.valueOf("residentTravelPermitToFromTaiwanAndChina")), @XmlEnumValue("residentTravelPermitToFromHongKongMacao") RESIDENTTRAVELPERMITTOFROMHONGKONGMACAO(String.valueOf("residentTravelPermitToFromHongKongMacao")), @XmlEnumValue("residentTravelPermitToHongKongMacao") RESIDENTTRAVELPERMITTOHONGKONGMACAO(String.valueOf("residentTravelPermitToHongKongMacao")), @XmlEnumValue("taiwanExitAndEntryPermit") TAIWANEXITANDENTRYPERMIT(String.valueOf("taiwanExitAndEntryPermit")), @XmlEnumValue("nexusCard") NEXUSCARD(String.valueOf("nexusCard"));


    private String value;

    DeclinedDetailsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DeclinedDetailsEnum fromValue(String v) {
        for (DeclinedDetailsEnum b : DeclinedDetailsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "List of regulatory details that have be declined by the traveler for his journey")
 /**
   * List of regulatory details that have be declined by the traveler for his journey
  **/
  private List<DeclinedDetailsEnum> declinedDetails = null;

  @ApiModelProperty(value = "List of regulatory details that need to be fullfilled for the passenger to be allowed to board the plane")
 /**
   * List of regulatory details that need to be fullfilled for the passenger to be allowed to board the plane
  **/
  private List<RegulatoryDetailsCategoryRequirement> missingDetails = null;
 /**
   * Traveler Id of the regulatory details
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public RegulatoryDetailsReplyData travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * Indicate if the passenger is cleared to board in regard only to the regulatory requirements for his journey.
   * @return statusCleared
  **/
  @JsonProperty("statusCleared")
  public Boolean isStatusCleared() {
    return statusCleared;
  }

  public void setStatusCleared(Boolean statusCleared) {
    this.statusCleared = statusCleared;
  }

  public RegulatoryDetailsReplyData statusCleared(Boolean statusCleared) {
    this.statusCleared = statusCleared;
    return this;
  }

 /**
   * List of regulatory details already provided for the traveler for his journey
   * @return storedDetails
  **/
  @JsonProperty("storedDetails")
  public List<RegulatoryDetail> getStoredDetails() {
    return storedDetails;
  }

  public void setStoredDetails(List<RegulatoryDetail> storedDetails) {
    this.storedDetails = storedDetails;
  }

  public RegulatoryDetailsReplyData storedDetails(List<RegulatoryDetail> storedDetails) {
    this.storedDetails = storedDetails;
    return this;
  }

  public RegulatoryDetailsReplyData addStoredDetailsItem(RegulatoryDetail storedDetailsItem) {
    this.storedDetails.add(storedDetailsItem);
    return this;
  }

 /**
   * List of regulatory details that have be declined by the traveler for his journey
   * @return declinedDetails
  **/
  @JsonProperty("declinedDetails")
  public List<DeclinedDetailsEnum> getDeclinedDetails() {
    return declinedDetails;
  }

  public void setDeclinedDetails(List<DeclinedDetailsEnum> declinedDetails) {
    this.declinedDetails = declinedDetails;
  }

  public RegulatoryDetailsReplyData declinedDetails(List<DeclinedDetailsEnum> declinedDetails) {
    this.declinedDetails = declinedDetails;
    return this;
  }

  public RegulatoryDetailsReplyData addDeclinedDetailsItem(DeclinedDetailsEnum declinedDetailsItem) {
    this.declinedDetails.add(declinedDetailsItem);
    return this;
  }

 /**
   * List of regulatory details that need to be fullfilled for the passenger to be allowed to board the plane
   * @return missingDetails
  **/
  @JsonProperty("missingDetails")
  public List<RegulatoryDetailsCategoryRequirement> getMissingDetails() {
    return missingDetails;
  }

  public void setMissingDetails(List<RegulatoryDetailsCategoryRequirement> missingDetails) {
    this.missingDetails = missingDetails;
  }

  public RegulatoryDetailsReplyData missingDetails(List<RegulatoryDetailsCategoryRequirement> missingDetails) {
    this.missingDetails = missingDetails;
    return this;
  }

  public RegulatoryDetailsReplyData addMissingDetailsItem(RegulatoryDetailsCategoryRequirement missingDetailsItem) {
    this.missingDetails.add(missingDetailsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryDetailsReplyData {\n");
    
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    statusCleared: ").append(toIndentedString(statusCleared)).append("\n");
    sb.append("    storedDetails: ").append(toIndentedString(storedDetails)).append("\n");
    sb.append("    declinedDetails: ").append(toIndentedString(declinedDetails)).append("\n");
    sb.append("    missingDetails: ").append(toIndentedString(missingDetails)).append("\n");
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

