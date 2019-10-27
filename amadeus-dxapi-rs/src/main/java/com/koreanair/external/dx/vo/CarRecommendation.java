package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarOffer;
import com.koreanair.external.dx.vo.CarRelevantCriteria;
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
  * A car recommendation exposes a list of car offers associated to the reference relevant criteria
 **/
@ApiModel(description="A car recommendation exposes a list of car offers associated to the reference relevant criteria")
public class CarRecommendation  {
  
  @ApiModelProperty(value = "")
  private CarRelevantCriteria relevantCriteria = null;

  @ApiModelProperty(value = "")
  private List<CarOffer> carOffers = null;
 /**
   * Get relevantCriteria
   * @return relevantCriteria
  **/
  @JsonProperty("relevantCriteria")
  public CarRelevantCriteria getRelevantCriteria() {
    return relevantCriteria;
  }

  public void setRelevantCriteria(CarRelevantCriteria relevantCriteria) {
    this.relevantCriteria = relevantCriteria;
  }

  public CarRecommendation relevantCriteria(CarRelevantCriteria relevantCriteria) {
    this.relevantCriteria = relevantCriteria;
    return this;
  }

 /**
   * Get carOffers
   * @return carOffers
  **/
  @JsonProperty("carOffers")
  public List<CarOffer> getCarOffers() {
    return carOffers;
  }

  public void setCarOffers(List<CarOffer> carOffers) {
    this.carOffers = carOffers;
  }

  public CarRecommendation carOffers(List<CarOffer> carOffers) {
    this.carOffers = carOffers;
    return this;
  }

  public CarRecommendation addCarOffersItem(CarOffer carOffersItem) {
    this.carOffers.add(carOffersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarRecommendation {\n");
    
    sb.append("    relevantCriteria: ").append(toIndentedString(relevantCriteria)).append("\n");
    sb.append("    carOffers: ").append(toIndentedString(carOffers)).append("\n");
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

