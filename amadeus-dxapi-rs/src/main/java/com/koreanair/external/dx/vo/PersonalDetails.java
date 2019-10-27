package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Name;
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;

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
  * Hold the information relative to a traveler regarding himself or his travel
 **/
@ApiModel(description="Hold the information relative to a traveler regarding himself or his travel")
public class PersonalDetails  {
  

@XmlType(name="PurposeOfVisitEnum")
@XmlEnum(String.class)
public enum PurposeOfVisitEnum {

@XmlEnumValue("business") BUSINESS(String.valueOf("business")), @XmlEnumValue("immigration") IMMIGRATION(String.valueOf("immigration")), @XmlEnumValue("studies") STUDIES(String.valueOf("studies")), @XmlEnumValue("tourist") TOURIST(String.valueOf("tourist")), @XmlEnumValue("work") WORK(String.valueOf("work"));


    private String value;

    PurposeOfVisitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PurposeOfVisitEnum fromValue(String v) {
        for (PurposeOfVisitEnum b : PurposeOfVisitEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Reason for the traveler to request the entry to the destination country")
 /**
   * Reason for the traveler to request the entry to the destination country
  **/
  private PurposeOfVisitEnum purposeOfVisit = null;

  @ApiModelProperty(example = "1980-07-25", value = "Date of birth (date in ISO 8601, e.g. 1980-07-25: YYYY-MM-DD)")
 /**
   * Date of birth (date in ISO 8601, e.g. 1980-07-25: YYYY-MM-DD)
  **/
  private LocalDate birthDate = null;

  @ApiModelProperty(value = "Birth place")
 /**
   * Birth place
  **/
  private String birthPlace = null;

  @ApiModelProperty(value = "Name of the traveler")
 /**
   * Name of the traveler
  **/
  private Name name = null;


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

  @ApiModelProperty(value = "Gender of the traveler")
 /**
   * Gender of the traveler
  **/
  private GenderEnum gender = null;

  @ApiModelProperty(value = "Code of the nationality appearing on the document expressed using ISO 3166-1 alpha 3 format")
 /**
   * Code of the nationality appearing on the document expressed using ISO 3166-1 alpha 3 format
  **/
  private String nationalityCode = null;

  @ApiModelProperty(value = "Code of the country of the residence of the traveler expressed using ISO 3166-1 format")
 /**
   * Code of the country of the residence of the traveler expressed using ISO 3166-1 format
  **/
  private String countryOfResidenceCode = null;
 /**
   * Reason for the traveler to request the entry to the destination country
   * @return purposeOfVisit
  **/
  @JsonProperty("purposeOfVisit")
  public String getPurposeOfVisit() {
    if (purposeOfVisit == null) {
      return null;
    }
    return purposeOfVisit.value();
  }

  public void setPurposeOfVisit(PurposeOfVisitEnum purposeOfVisit) {
    this.purposeOfVisit = purposeOfVisit;
  }

  public PersonalDetails purposeOfVisit(PurposeOfVisitEnum purposeOfVisit) {
    this.purposeOfVisit = purposeOfVisit;
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

  public PersonalDetails birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

 /**
   * Birth place
   * @return birthPlace
  **/
  @JsonProperty("birthPlace")
  public String getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  public PersonalDetails birthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
    return this;
  }

 /**
   * Name of the traveler
   * @return name
  **/
  @JsonProperty("name")
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public PersonalDetails name(Name name) {
    this.name = name;
    return this;
  }

 /**
   * Gender of the traveler
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

  public PersonalDetails gender(GenderEnum gender) {
    this.gender = gender;
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

  public PersonalDetails nationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
    return this;
  }

 /**
   * Code of the country of the residence of the traveler expressed using ISO 3166-1 format
   * @return countryOfResidenceCode
  **/
  @JsonProperty("countryOfResidenceCode")
  public String getCountryOfResidenceCode() {
    return countryOfResidenceCode;
  }

  public void setCountryOfResidenceCode(String countryOfResidenceCode) {
    this.countryOfResidenceCode = countryOfResidenceCode;
  }

  public PersonalDetails countryOfResidenceCode(String countryOfResidenceCode) {
    this.countryOfResidenceCode = countryOfResidenceCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalDetails {\n");
    
    sb.append("    purposeOfVisit: ").append(toIndentedString(purposeOfVisit)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    nationalityCode: ").append(toIndentedString(nationalityCode)).append("\n");
    sb.append("    countryOfResidenceCode: ").append(toIndentedString(countryOfResidenceCode)).append("\n");
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

