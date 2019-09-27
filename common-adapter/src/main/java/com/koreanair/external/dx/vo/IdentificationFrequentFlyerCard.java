package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FormOfIdentificationDetail;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
import io.swagger.annotations.ApiModel;
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
  * Identification using a frequent flyer card
 **/
@ApiModel(description="Identification using a frequent flyer card")
public class IdentificationFrequentFlyerCard extends FormOfIdentificationDetail {
  
  @ApiModelProperty(required = true, value = "")
  private FrequentFlyerCard frequentFlyerCard = null;
 /**
   * Get frequentFlyerCard
   * @return frequentFlyerCard
  **/
  @JsonProperty("frequentFlyerCard")
  public FrequentFlyerCard getFrequentFlyerCard() {
    return frequentFlyerCard;
  }

  public void setFrequentFlyerCard(FrequentFlyerCard frequentFlyerCard) {
    this.frequentFlyerCard = frequentFlyerCard;
  }

  public IdentificationFrequentFlyerCard frequentFlyerCard(FrequentFlyerCard frequentFlyerCard) {
    this.frequentFlyerCard = frequentFlyerCard;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationFrequentFlyerCard {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    frequentFlyerCard: ").append(toIndentedString(frequentFlyerCard)).append("\n");
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

