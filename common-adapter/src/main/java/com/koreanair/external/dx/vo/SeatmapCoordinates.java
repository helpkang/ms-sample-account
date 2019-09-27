package com.koreanair.external.dx.vo;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatmapCoordinates  {
  
  @ApiModelProperty(value = "")
  private Double x = null;

  @ApiModelProperty(value = "")
  private Double y = null;

  @ApiModelProperty(value = "X coordinate (height)")
 /**
   * X coordinate (height)
  **/
  private Double z = null;

  @ApiModelProperty(value = "")
  private Double zRotation = null;
 /**
   * Get x
   * @return x
  **/
  @JsonProperty("x")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public SeatmapCoordinates x(Double x) {
    this.x = x;
    return this;
  }

 /**
   * Get y
   * @return y
  **/
  @JsonProperty("y")
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public SeatmapCoordinates y(Double y) {
    this.y = y;
    return this;
  }

 /**
   * X coordinate (height)
   * @return z
  **/
  @JsonProperty("z")
  public Double getZ() {
    return z;
  }

  public void setZ(Double z) {
    this.z = z;
  }

  public SeatmapCoordinates z(Double z) {
    this.z = z;
    return this;
  }

 /**
   * Get zRotation
   * @return zRotation
  **/
  @JsonProperty("zRotation")
  public Double getZRotation() {
    return zRotation;
  }

  public void setZRotation(Double zRotation) {
    this.zRotation = zRotation;
  }

  public SeatmapCoordinates zRotation(Double zRotation) {
    this.zRotation = zRotation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapCoordinates {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
    sb.append("    zRotation: ").append(toIndentedString(zRotation)).append("\n");
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

