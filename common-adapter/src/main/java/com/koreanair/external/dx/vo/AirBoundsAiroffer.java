package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.MilesConversion;
import com.koreanair.external.dx.vo.PreviousSelectedBound;
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
  * Air offer information based on previous and current airBound selection. It allows for example to indicate if the previous selected bound price has changed in respect of the current bound association.
 **/
@ApiModel(description="Air offer information based on previous and current airBound selection. It allows for example to indicate if the previous selected bound price has changed in respect of the current bound association.")
public class AirBoundsAiroffer  {
  
  @ApiModelProperty(value = "AirOffer total price ")
 /**
   * AirOffer total price 
  **/
  private Amount totalPrice = null;

  @ApiModelProperty(value = "Contains information about converted miles and non converted cash when Award converter is used.")
 /**
   * Contains information about converted miles and non converted cash when Award converter is used.
  **/
  private MilesConversion milesConversion = null;

  @ApiModelProperty(value = "Bound details of selection made in previous step.")
 /**
   * Bound details of selection made in previous step.
  **/
  private PreviousSelectedBound previousSelectedBound = null;
 /**
   * AirOffer total price 
   * @return totalPrice
  **/
  @JsonProperty("totalPrice")
  public Amount getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
  }

  public AirBoundsAiroffer totalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

 /**
   * Contains information about converted miles and non converted cash when Award converter is used.
   * @return milesConversion
  **/
  @JsonProperty("milesConversion")
  public MilesConversion getMilesConversion() {
    return milesConversion;
  }

  public void setMilesConversion(MilesConversion milesConversion) {
    this.milesConversion = milesConversion;
  }

  public AirBoundsAiroffer milesConversion(MilesConversion milesConversion) {
    this.milesConversion = milesConversion;
    return this;
  }

 /**
   * Bound details of selection made in previous step.
   * @return previousSelectedBound
  **/
  @JsonProperty("previousSelectedBound")
  public PreviousSelectedBound getPreviousSelectedBound() {
    return previousSelectedBound;
  }

  public void setPreviousSelectedBound(PreviousSelectedBound previousSelectedBound) {
    this.previousSelectedBound = previousSelectedBound;
  }

  public AirBoundsAiroffer previousSelectedBound(PreviousSelectedBound previousSelectedBound) {
    this.previousSelectedBound = previousSelectedBound;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirBoundsAiroffer {\n");
    
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    milesConversion: ").append(toIndentedString(milesConversion)).append("\n");
    sb.append("    previousSelectedBound: ").append(toIndentedString(previousSelectedBound)).append("\n");
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

