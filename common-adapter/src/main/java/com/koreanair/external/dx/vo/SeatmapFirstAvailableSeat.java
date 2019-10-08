package com.koreanair.external.dx.vo;

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
  * Information regarding the first available seat on a given deck (cabin dependent)
 **/
@ApiModel(description="Information regarding the first available seat on a given deck (cabin dependent)")
public class SeatmapFirstAvailableSeat  {
  
  @ApiModelProperty(value = "Concatenation of the row id and the column id, for example 12B")
 /**
   * Concatenation of the row id and the column id, for example 12B
  **/
  private String seatNumber = null;

  @ApiModelProperty(value = "X coordinate of the seat")
 /**
   * X coordinate of the seat
  **/
  private Double x = null;
 /**
   * Concatenation of the row id and the column id, for example 12B
   * @return seatNumber
  **/
  @JsonProperty("seatNumber")
  public String getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }

  public SeatmapFirstAvailableSeat seatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

 /**
   * X coordinate of the seat
   * @return x
  **/
  @JsonProperty("x")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public SeatmapFirstAvailableSeat x(Double x) {
    this.x = x;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapFirstAvailableSeat {\n");
    
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
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

