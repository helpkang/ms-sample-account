package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.MilesConversion;
import com.koreanair.external.dx.vo.VariationAmount;
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
  * Details of selected bound
 **/
@ApiModel(description="Details of selected bound")
public class PreviousSelectedBound  {
  
  @ApiModelProperty(required = true, value = "Difference in price for selected bound in previous step. For example: -30 or 20.")
 /**
   * Difference in price for selected bound in previous step. For example: -30 or 20.
  **/
  private VariationAmount priceDifference = null;

  @ApiModelProperty(value = "Contains price difference information about converted miles and non converted cash when Award converter is used")
 /**
   * Contains price difference information about converted miles and non converted cash when Award converter is used
  **/
  private MilesConversion milesConversionPriceDifference = null;
 /**
   * Difference in price for selected bound in previous step. For example: -30 or 20.
   * @return priceDifference
  **/
  @JsonProperty("priceDifference")
  public VariationAmount getPriceDifference() {
    return priceDifference;
  }

  public void setPriceDifference(VariationAmount priceDifference) {
    this.priceDifference = priceDifference;
  }

  public PreviousSelectedBound priceDifference(VariationAmount priceDifference) {
    this.priceDifference = priceDifference;
    return this;
  }

 /**
   * Contains price difference information about converted miles and non converted cash when Award converter is used
   * @return milesConversionPriceDifference
  **/
  @JsonProperty("milesConversionPriceDifference")
  public MilesConversion getMilesConversionPriceDifference() {
    return milesConversionPriceDifference;
  }

  public void setMilesConversionPriceDifference(MilesConversion milesConversionPriceDifference) {
    this.milesConversionPriceDifference = milesConversionPriceDifference;
  }

  public PreviousSelectedBound milesConversionPriceDifference(MilesConversion milesConversionPriceDifference) {
    this.milesConversionPriceDifference = milesConversionPriceDifference;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousSelectedBound {\n");
    
    sb.append("    priceDifference: ").append(toIndentedString(priceDifference)).append("\n");
    sb.append("    milesConversionPriceDifference: ").append(toIndentedString(milesConversionPriceDifference)).append("\n");
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

