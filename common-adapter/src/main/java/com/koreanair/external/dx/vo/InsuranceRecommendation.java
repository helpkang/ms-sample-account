package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.InsuranceOffer;
import com.koreanair.external.dx.vo.InsuranceRelevantCriteria;
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
  * An insurance recommendation exposes some relevant criteria (actual search for insurance offers not supported yet)
 **/
@ApiModel(description="An insurance recommendation exposes some relevant criteria (actual search for insurance offers not supported yet)")
public class InsuranceRecommendation  {
  
  @ApiModelProperty(value = "")
  private InsuranceRelevantCriteria relevantCriteria = null;

  @ApiModelProperty(value = "")
  private List<InsuranceOffer> insuranceOffers = null;
 /**
   * Get relevantCriteria
   * @return relevantCriteria
  **/
  @JsonProperty("relevantCriteria")
  public InsuranceRelevantCriteria getRelevantCriteria() {
    return relevantCriteria;
  }

  public void setRelevantCriteria(InsuranceRelevantCriteria relevantCriteria) {
    this.relevantCriteria = relevantCriteria;
  }

  public InsuranceRecommendation relevantCriteria(InsuranceRelevantCriteria relevantCriteria) {
    this.relevantCriteria = relevantCriteria;
    return this;
  }

 /**
   * Get insuranceOffers
   * @return insuranceOffers
  **/
  @JsonProperty("insuranceOffers")
  public List<InsuranceOffer> getInsuranceOffers() {
    return insuranceOffers;
  }

  public void setInsuranceOffers(List<InsuranceOffer> insuranceOffers) {
    this.insuranceOffers = insuranceOffers;
  }

  public InsuranceRecommendation insuranceOffers(List<InsuranceOffer> insuranceOffers) {
    this.insuranceOffers = insuranceOffers;
    return this;
  }

  public InsuranceRecommendation addInsuranceOffersItem(InsuranceOffer insuranceOffersItem) {
    this.insuranceOffers.add(insuranceOffersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceRecommendation {\n");
    
    sb.append("    relevantCriteria: ").append(toIndentedString(relevantCriteria)).append("\n");
    sb.append("    insuranceOffers: ").append(toIndentedString(insuranceOffers)).append("\n");
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

