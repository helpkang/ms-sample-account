package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ConvertedMiles;
import com.koreanair.external.dx.vo.Price;
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
  * Amount details from Award Converter product which enables shopping in miles. It is split in 2 categories: The converted miles. The remaining non converted part in cash with applicable currency.
 **/
@ApiModel(description="Amount details from Award Converter product which enables shopping in miles. It is split in 2 categories: The converted miles. The remaining non converted part in cash with applicable currency.")
public class MilesConversion  {
  
  @ApiModelProperty(required = true, value = "Price breakdown of converted part expressed in miles")
 /**
   * Price breakdown of converted part expressed in miles
  **/
  private ConvertedMiles convertedMiles = null;

  @ApiModelProperty(required = true, value = "Price breakdown of non-converted part expressed in cash")
 /**
   * Price breakdown of non-converted part expressed in cash
  **/
  private Price remainingNonConverted = null;
 /**
   * Price breakdown of converted part expressed in miles
   * @return convertedMiles
  **/
  @JsonProperty("convertedMiles")
  public ConvertedMiles getConvertedMiles() {
    return convertedMiles;
  }

  public void setConvertedMiles(ConvertedMiles convertedMiles) {
    this.convertedMiles = convertedMiles;
  }

  public MilesConversion convertedMiles(ConvertedMiles convertedMiles) {
    this.convertedMiles = convertedMiles;
    return this;
  }

 /**
   * Price breakdown of non-converted part expressed in cash
   * @return remainingNonConverted
  **/
  @JsonProperty("remainingNonConverted")
  public Price getRemainingNonConverted() {
    return remainingNonConverted;
  }

  public void setRemainingNonConverted(Price remainingNonConverted) {
    this.remainingNonConverted = remainingNonConverted;
  }

  public MilesConversion remainingNonConverted(Price remainingNonConverted) {
    this.remainingNonConverted = remainingNonConverted;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilesConversion {\n");
    
    sb.append("    convertedMiles: ").append(toIndentedString(convertedMiles)).append("\n");
    sb.append("    remainingNonConverted: ").append(toIndentedString(remainingNonConverted)).append("\n");
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

