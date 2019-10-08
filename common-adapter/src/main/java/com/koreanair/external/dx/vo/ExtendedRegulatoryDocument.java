package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Name;
import com.koreanair.external.dx.vo.RegulatoryDocumentCommon;
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;
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
  * Regulatory document (passport, visa, etc.) necessary for the travel
 **/
@ApiModel(description="Regulatory document (passport, visa, etc.) necessary for the travel")
public class ExtendedRegulatoryDocument  {
  
  @ApiModelProperty(example = "QFU514563221J", value = "Document number (as it appears on the document)")
 /**
   * Document number (as it appears on the document)
  **/
  private String number = null;

  @ApiModelProperty(example = "2002-07-26", value = "Date at which the document starts to be valid (date in ISO 8601, e.g. 2002-07-25: YYYY-MM-DD)")
 /**
   * Date at which the document starts to be valid (date in ISO 8601, e.g. 2002-07-25: YYYY-MM-DD)
  **/
  private LocalDate effectiveDate = null;

  @ApiModelProperty(example = "2002-07-25", value = "Date at which the document has been issued (date in ISO 8601, e.g. 2002-07-25: YYYY-MM-DD)")
 /**
   * Date at which the document has been issued (date in ISO 8601, e.g. 2002-07-25: YYYY-MM-DD)
  **/
  private LocalDate issuanceDate = null;

  @ApiModelProperty(example = "2042-07-24", value = "Date after which the document is not valid anymore (date in ISO 8601, e.g. 2002-07-25: YYYY-MM-DD)")
 /**
   * Date after which the document is not valid anymore (date in ISO 8601, e.g. 2002-07-25: YYYY-MM-DD)
  **/
  private LocalDate expiryDate = null;

  @ApiModelProperty(value = "A more precise information concerning the place where the document has been issued, when available. It may be a country, a state, a city or any other type of location. e.g. New-York ")
 /**
   * A more precise information concerning the place where the document has been issued, when available. It may be a country, a state, a city or any other type of location. e.g. New-York 
  **/
  private String issuanceLocation = null;

  @ApiModelProperty(value = "Document issuance country (2-letters) code using ISO 3166-1 format")
 /**
   * Document issuance country (2-letters) code using ISO 3166-1 format
  **/
  private String issuanceCountryCode = null;

  @ApiModelProperty(value = "Document holder name")
 /**
   * Document holder name
  **/
  private Name name = null;

  @ApiModelProperty(value = "Code of the nationality appearing on the document expressed using ISO 3166-1 alpha 3 format")
 /**
   * Code of the nationality appearing on the document expressed using ISO 3166-1 alpha 3 format
  **/
  private String nationalityCode = null;


@XmlType(name="GenderEnum")
@XmlEnum(String.class)
public enum GenderEnum {

@XmlEnumValue("male") MALE(String.valueOf("male")), @XmlEnumValue("female") FEMALE(String.valueOf("female")), @XmlEnumValue("unknown") UNKNOWN(String.valueOf("unknown"));


    private String value;

    GenderEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GenderEnum fromValue(String v) {
        for (GenderEnum b : GenderEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private GenderEnum gender = null;

  @ApiModelProperty(example = "1980-07-25", value = "Date of birth (date in ISO 8601, e.g. 1980-07-25: YYYY-MM-DD)")
 /**
   * Date of birth (date in ISO 8601, e.g. 1980-07-25: YYYY-MM-DD)
  **/
  private LocalDate birthDate = null;

  @ApiModelProperty(value = "Birth place as indicated on the document")
 /**
   * Birth place as indicated on the document
  **/
  private String birthPlace = null;

  @ApiModelProperty(value = "Any kind of special conditions/remarks that can be found on the document. E.g. \"Valid during 1 month after arrival in the country\", \"Not valid to go to United states\"")
 /**
   * Any kind of special conditions/remarks that can be found on the document. E.g. \"Valid during 1 month after arrival in the country\", \"Not valid to go to United states\"
  **/
  private List<String> remarks = null;


@XmlType(name="DocumentTypeEnum")
@XmlEnum(String.class)
public enum DocumentTypeEnum {

@XmlEnumValue("passport") PASSPORT(String.valueOf("passport")), @XmlEnumValue("identityCard") IDENTITYCARD(String.valueOf("identityCard")), @XmlEnumValue("airAttendanceLicense") AIRATTENDANCELICENSE(String.valueOf("airAttendanceLicense")), @XmlEnumValue("birthCertificate") BIRTHCERTIFICATE(String.valueOf("birthCertificate")), @XmlEnumValue("borderCrossingCard") BORDERCROSSINGCARD(String.valueOf("borderCrossingCard")), @XmlEnumValue("drivingLicense") DRIVINGLICENSE(String.valueOf("drivingLicense")), @XmlEnumValue("flightMechanicalLicense") FLIGHTMECHANICALLICENSE(String.valueOf("flightMechanicalLicense")), @XmlEnumValue("foreignNationalRegistration") FOREIGNNATIONALREGISTRATION(String.valueOf("foreignNationalRegistration")), @XmlEnumValue("loyalAttorneyIdentification") LOYALATTORNEYIDENTIFICATION(String.valueOf("loyalAttorneyIdentification")), @XmlEnumValue("militaryIdentityCard") MILITARYIDENTITYCARD(String.valueOf("militaryIdentityCard")), @XmlEnumValue("operationalDispatcherLicense") OPERATIONALDISPATCHERLICENSE(String.valueOf("operationalDispatcherLicense")), @XmlEnumValue("pilotLicense") PILOTLICENSE(String.valueOf("pilotLicense")), @XmlEnumValue("reEntryPermit") REENTRYPERMIT(String.valueOf("reEntryPermit")), @XmlEnumValue("naturalisationCardUS") NATURALISATIONCARDUS(String.valueOf("naturalisationCardUS")), @XmlEnumValue("workPermit") WORKPERMIT(String.valueOf("workPermit")), @XmlEnumValue("visa") VISA(String.valueOf("visa")), @XmlEnumValue("residentAlienCard") RESIDENTALIENCARD(String.valueOf("residentAlienCard")), @XmlEnumValue("permanentResidentCard") PERMANENTRESIDENTCARD(String.valueOf("permanentResidentCard")), @XmlEnumValue("redressNumber") REDRESSNUMBER(String.valueOf("redressNumber")), @XmlEnumValue("knownTravelerNumber") KNOWNTRAVELERNUMBER(String.valueOf("knownTravelerNumber")), @XmlEnumValue("homeReentryPermit") HOMEREENTRYPERMIT(String.valueOf("homeReentryPermit")), @XmlEnumValue("chinaTravelPermit") CHINATRAVELPERMIT(String.valueOf("chinaTravelPermit")), @XmlEnumValue("chinaTravelPermitHongKongMacao") CHINATRAVELPERMITHONGKONGMACAO(String.valueOf("chinaTravelPermitHongKongMacao")), @XmlEnumValue("chinaExitAndEntryPermit") CHINAEXITANDENTRYPERMIT(String.valueOf("chinaExitAndEntryPermit")), @XmlEnumValue("residentTravelPermit") RESIDENTTRAVELPERMIT(String.valueOf("residentTravelPermit")), @XmlEnumValue("residentTravelPermitToFromTaiwanAndChina") RESIDENTTRAVELPERMITTOFROMTAIWANANDCHINA(String.valueOf("residentTravelPermitToFromTaiwanAndChina")), @XmlEnumValue("residentTravelPermitToFromHongKongMacao") RESIDENTTRAVELPERMITTOFROMHONGKONGMACAO(String.valueOf("residentTravelPermitToFromHongKongMacao")), @XmlEnumValue("residentTravelPermitToHongKongMacao") RESIDENTTRAVELPERMITTOHONGKONGMACAO(String.valueOf("residentTravelPermitToHongKongMacao")), @XmlEnumValue("taiwanExitAndEntryPermit") TAIWANEXITANDENTRYPERMIT(String.valueOf("taiwanExitAndEntryPermit")), @XmlEnumValue("nexusCard") NEXUSCARD(String.valueOf("nexusCard"));


    private String value;

    DocumentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String v) {
        for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of the document : passport, visa, identityCard, workPermit...")
 /**
   * Type of the document : passport, visa, identityCard, workPermit...
  **/
  private DocumentTypeEnum documentType = null;
 /**
   * Document number (as it appears on the document)
   * @return number
  **/
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ExtendedRegulatoryDocument number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Date at which the document starts to be valid (date in ISO 8601, e.g. 2002-07-25: YYYY-MM-DD)
   * @return effectiveDate
  **/
  @JsonProperty("effectiveDate")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ExtendedRegulatoryDocument effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

 /**
   * Date at which the document has been issued (date in ISO 8601, e.g. 2002-07-25: YYYY-MM-DD)
   * @return issuanceDate
  **/
  @JsonProperty("issuanceDate")
  public LocalDate getIssuanceDate() {
    return issuanceDate;
  }

  public void setIssuanceDate(LocalDate issuanceDate) {
    this.issuanceDate = issuanceDate;
  }

  public ExtendedRegulatoryDocument issuanceDate(LocalDate issuanceDate) {
    this.issuanceDate = issuanceDate;
    return this;
  }

 /**
   * Date after which the document is not valid anymore (date in ISO 8601, e.g. 2002-07-25: YYYY-MM-DD)
   * @return expiryDate
  **/
  @JsonProperty("expiryDate")
  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public ExtendedRegulatoryDocument expiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

 /**
   * A more precise information concerning the place where the document has been issued, when available. It may be a country, a state, a city or any other type of location. e.g. New-York 
   * @return issuanceLocation
  **/
  @JsonProperty("issuanceLocation")
  public String getIssuanceLocation() {
    return issuanceLocation;
  }

  public void setIssuanceLocation(String issuanceLocation) {
    this.issuanceLocation = issuanceLocation;
  }

  public ExtendedRegulatoryDocument issuanceLocation(String issuanceLocation) {
    this.issuanceLocation = issuanceLocation;
    return this;
  }

 /**
   * Document issuance country (2-letters) code using ISO 3166-1 format
   * @return issuanceCountryCode
  **/
  @JsonProperty("issuanceCountryCode")
  public String getIssuanceCountryCode() {
    return issuanceCountryCode;
  }

  public void setIssuanceCountryCode(String issuanceCountryCode) {
    this.issuanceCountryCode = issuanceCountryCode;
  }

  public ExtendedRegulatoryDocument issuanceCountryCode(String issuanceCountryCode) {
    this.issuanceCountryCode = issuanceCountryCode;
    return this;
  }

 /**
   * Document holder name
   * @return name
  **/
  @JsonProperty("name")
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public ExtendedRegulatoryDocument name(Name name) {
    this.name = name;
    return this;
  }

 /**
   * Code of the nationality appearing on the document expressed using ISO 3166-1 alpha 3 format
   * @return nationalityCode
  **/
  @JsonProperty("nationalityCode")
  public String getNationalityCode() {
    return nationalityCode;
  }

  public void setNationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
  }

  public ExtendedRegulatoryDocument nationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
    return this;
  }

 /**
   * Get gender
   * @return gender
  **/
  @JsonProperty("gender")
  public String getGender() {
    if (gender == null) {
      return null;
    }
    return gender.value();
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public ExtendedRegulatoryDocument gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Date of birth (date in ISO 8601, e.g. 1980-07-25: YYYY-MM-DD)
   * @return birthDate
  **/
  @JsonProperty("birthDate")
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public ExtendedRegulatoryDocument birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

 /**
   * Birth place as indicated on the document
   * @return birthPlace
  **/
  @JsonProperty("birthPlace")
  public String getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  public ExtendedRegulatoryDocument birthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
    return this;
  }

 /**
   * Any kind of special conditions/remarks that can be found on the document. E.g. \&quot;Valid during 1 month after arrival in the country\&quot;, \&quot;Not valid to go to United states\&quot;
   * @return remarks
  **/
  @JsonProperty("remarks")
  public List<String> getRemarks() {
    return remarks;
  }

  public void setRemarks(List<String> remarks) {
    this.remarks = remarks;
  }

  public ExtendedRegulatoryDocument remarks(List<String> remarks) {
    this.remarks = remarks;
    return this;
  }

  public ExtendedRegulatoryDocument addRemarksItem(String remarksItem) {
    this.remarks.add(remarksItem);
    return this;
  }

 /**
   * Type of the document : passport, visa, identityCard, workPermit...
   * @return documentType
  **/
  @JsonProperty("documentType")
  public String getDocumentType() {
    if (documentType == null) {
      return null;
    }
    return documentType.value();
  }

  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public ExtendedRegulatoryDocument documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedRegulatoryDocument {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    issuanceDate: ").append(toIndentedString(issuanceDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    issuanceLocation: ").append(toIndentedString(issuanceLocation)).append("\n");
    sb.append("    issuanceCountryCode: ").append(toIndentedString(issuanceCountryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nationalityCode: ").append(toIndentedString(nationalityCode)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
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

