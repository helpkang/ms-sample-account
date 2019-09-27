package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Mileage;
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
  * Mileage information concerning the possible extra periods. If the customer returns the car after the rental period deadline, the provider might charge the traveled mileage at a different price. 
 **/
@ApiModel(description="Mileage information concerning the possible extra periods. If the customer returns the car after the rental period deadline, the provider might charge the traveled mileage at a different price. ")
public class ExtraMileage  {
  
  @ApiModelProperty(value = "Mileage information per extra hour")
 /**
   * Mileage information per extra hour
  **/
  private Mileage perHour = null;

  @ApiModelProperty(value = "Mileage information per extra day")
 /**
   * Mileage information per extra day
  **/
  private Mileage perDay = null;
 /**
   * Mileage information per extra hour
   * @return perHour
  **/
  @JsonProperty("perHour")
  public Mileage getPerHour() {
    return perHour;
  }

  public void setPerHour(Mileage perHour) {
    this.perHour = perHour;
  }

  public ExtraMileage perHour(Mileage perHour) {
    this.perHour = perHour;
    return this;
  }

 /**
   * Mileage information per extra day
   * @return perDay
  **/
  @JsonProperty("perDay")
  public Mileage getPerDay() {
    return perDay;
  }

  public void setPerDay(Mileage perDay) {
    this.perDay = perDay;
  }

  public ExtraMileage perDay(Mileage perDay) {
    this.perDay = perDay;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraMileage {\n");
    
    sb.append("    perHour: ").append(toIndentedString(perHour)).append("\n");
    sb.append("    perDay: ").append(toIndentedString(perDay)).append("\n");
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

