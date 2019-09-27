package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.RegulatoryDetailsRequirements;
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
  * It provides the details categories (i.e. Identity document, greenCard, etc.) to be fulfilled and which details could be used for each category (i.e. Passport could be used as Identity document)
 **/
@ApiModel(description="It provides the details categories (i.e. Identity document, greenCard, etc.) to be fulfilled and which details could be used for each category (i.e. Passport could be used as Identity document)")
public class RegulatoryDetailsCategoryRequirement  {
  

@XmlType(name="DetailsCategoryEnum")
@XmlEnum(String.class)
public enum DetailsCategoryEnum {

@XmlEnumValue("personalDetails") PERSONALDETAILS(String.valueOf("personalDetails")), @XmlEnumValue("greenCard") GREENCARD(String.valueOf("greenCard")), @XmlEnumValue("identityDocument") IDENTITYDOCUMENT(String.valueOf("identityDocument")), @XmlEnumValue("countryEntryDocument") COUNTRYENTRYDOCUMENT(String.valueOf("countryEntryDocument")), @XmlEnumValue("destinationAddress") DESTINATIONADDRESS(String.valueOf("destinationAddress")), @XmlEnumValue("emergencyContact") EMERGENCYCONTACT(String.valueOf("emergencyContact")), @XmlEnumValue("homeAddress") HOMEADDRESS(String.valueOf("homeAddress")), @XmlEnumValue("permanentResidentCard") PERMANENTRESIDENTCARD(String.valueOf("permanentResidentCard")), @XmlEnumValue("additionalSecurityInfo") ADDITIONALSECURITYINFO(String.valueOf("additionalSecurityInfo"));


    private String value;

    DetailsCategoryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DetailsCategoryEnum fromValue(String v) {
        for (DetailsCategoryEnum b : DetailsCategoryEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of the details category : Identity document, Visa document, ResidentCard document...")
 /**
   * Type of the details category : Identity document, Visa document, ResidentCard document...
  **/
  private DetailsCategoryEnum detailsCategory = null;

  @ApiModelProperty(required = true, value = "List of details that would fullfill the regulatory need for this category (only one is required)")
 /**
   * List of details that would fullfill the regulatory need for this category (only one is required)
  **/
  private List<RegulatoryDetailsRequirements> detailsChoices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "Indicate if the category has to be fullfilled or if it is an optional category that can be skipped by the traveler")
 /**
   * Indicate if the category has to be fullfilled or if it is an optional category that can be skipped by the traveler
  **/
  private Boolean isOptional = null;
 /**
   * Type of the details category : Identity document, Visa document, ResidentCard document...
   * @return detailsCategory
  **/
  @JsonProperty("detailsCategory")
  public String getDetailsCategory() {
    if (detailsCategory == null) {
      return null;
    }
    return detailsCategory.value();
  }

  public void setDetailsCategory(DetailsCategoryEnum detailsCategory) {
    this.detailsCategory = detailsCategory;
  }

  public RegulatoryDetailsCategoryRequirement detailsCategory(DetailsCategoryEnum detailsCategory) {
    this.detailsCategory = detailsCategory;
    return this;
  }

 /**
   * List of details that would fullfill the regulatory need for this category (only one is required)
   * @return detailsChoices
  **/
  @JsonProperty("detailsChoices")
  public List<RegulatoryDetailsRequirements> getDetailsChoices() {
    return detailsChoices;
  }

  public void setDetailsChoices(List<RegulatoryDetailsRequirements> detailsChoices) {
    this.detailsChoices = detailsChoices;
  }

  public RegulatoryDetailsCategoryRequirement detailsChoices(List<RegulatoryDetailsRequirements> detailsChoices) {
    this.detailsChoices = detailsChoices;
    return this;
  }

  public RegulatoryDetailsCategoryRequirement addDetailsChoicesItem(RegulatoryDetailsRequirements detailsChoicesItem) {
    this.detailsChoices.add(detailsChoicesItem);
    return this;
  }

 /**
   * Indicate if the category has to be fullfilled or if it is an optional category that can be skipped by the traveler
   * @return isOptional
  **/
  @JsonProperty("isOptional")
  public Boolean isIsOptional() {
    return isOptional;
  }

  public void setIsOptional(Boolean isOptional) {
    this.isOptional = isOptional;
  }

  public RegulatoryDetailsCategoryRequirement isOptional(Boolean isOptional) {
    this.isOptional = isOptional;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryDetailsCategoryRequirement {\n");
    
    sb.append("    detailsCategory: ").append(toIndentedString(detailsCategory)).append("\n");
    sb.append("    detailsChoices: ").append(toIndentedString(detailsChoices)).append("\n");
    sb.append("    isOptional: ").append(toIndentedString(isOptional)).append("\n");
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

