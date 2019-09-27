package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
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
  * Deck dimensions are used as a reference to display the entire aircraft or to the section associated to the requested cabin (or set of cabins)
 **/
@ApiModel(description="Deck dimensions are used as a reference to display the entire aircraft or to the section associated to the requested cabin (or set of cabins)")
public class SeatmapDeckDimensions  {
  
  @ApiModelProperty(value = "Width (y-axis) of the deck.The value of the width is considered for display of y coordinate. y coordinate takes the value from 0 to the value of width.")
 /**
   * Width (y-axis) of the deck.The value of the width is considered for display of y coordinate. y coordinate takes the value from 0 to the value of width.
  **/
  private Integer width = null;

  @ApiModelProperty(value = "Length (x-axis) of the deck.The value of the length is considered for display of x coordinate. x coordinate takes the value from 0 to the value of length.")
 /**
   * Length (x-axis) of the deck.The value of the length is considered for display of x coordinate. x coordinate takes the value from 0 to the value of length.
  **/
  private Integer length = null;

  @ApiModelProperty(value = "Start x coordinate of the wings.The wings display starts relatively to the length.")
 /**
   * Start x coordinate of the wings.The wings display starts relatively to the length.
  **/
  private BigDecimal startWingsX = null;

  @ApiModelProperty(value = "End x coordinate of the wings.The wings display ends relatively to the length.")
 /**
   * End x coordinate of the wings.The wings display ends relatively to the length.
  **/
  private BigDecimal endWingsX = null;

  @ApiModelProperty(value = "X coordinate of the exit rows.The exit rows are displayed relatively to the length.")
 /**
   * X coordinate of the exit rows.The exit rows are displayed relatively to the length.
  **/
  private List<BigDecimal> exitRowsX = null;
 /**
   * Width (y-axis) of the deck.The value of the width is considered for display of y coordinate. y coordinate takes the value from 0 to the value of width.
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public SeatmapDeckDimensions width(Integer width) {
    this.width = width;
    return this;
  }

 /**
   * Length (x-axis) of the deck.The value of the length is considered for display of x coordinate. x coordinate takes the value from 0 to the value of length.
   * @return length
  **/
  @JsonProperty("length")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public SeatmapDeckDimensions length(Integer length) {
    this.length = length;
    return this;
  }

 /**
   * Start x coordinate of the wings.The wings display starts relatively to the length.
   * @return startWingsX
  **/
  @JsonProperty("startWingsX")
  public BigDecimal getStartWingsX() {
    return startWingsX;
  }

  public void setStartWingsX(BigDecimal startWingsX) {
    this.startWingsX = startWingsX;
  }

  public SeatmapDeckDimensions startWingsX(BigDecimal startWingsX) {
    this.startWingsX = startWingsX;
    return this;
  }

 /**
   * End x coordinate of the wings.The wings display ends relatively to the length.
   * @return endWingsX
  **/
  @JsonProperty("endWingsX")
  public BigDecimal getEndWingsX() {
    return endWingsX;
  }

  public void setEndWingsX(BigDecimal endWingsX) {
    this.endWingsX = endWingsX;
  }

  public SeatmapDeckDimensions endWingsX(BigDecimal endWingsX) {
    this.endWingsX = endWingsX;
    return this;
  }

 /**
   * X coordinate of the exit rows.The exit rows are displayed relatively to the length.
   * @return exitRowsX
  **/
  @JsonProperty("exitRowsX")
  public List<BigDecimal> getExitRowsX() {
    return exitRowsX;
  }

  public void setExitRowsX(List<BigDecimal> exitRowsX) {
    this.exitRowsX = exitRowsX;
  }

  public SeatmapDeckDimensions exitRowsX(List<BigDecimal> exitRowsX) {
    this.exitRowsX = exitRowsX;
    return this;
  }

  public SeatmapDeckDimensions addExitRowsXItem(BigDecimal exitRowsXItem) {
    this.exitRowsX.add(exitRowsXItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapDeckDimensions {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    startWingsX: ").append(toIndentedString(startWingsX)).append("\n");
    sb.append("    endWingsX: ").append(toIndentedString(endWingsX)).append("\n");
    sb.append("    exitRowsX: ").append(toIndentedString(exitRowsX)).append("\n");
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

