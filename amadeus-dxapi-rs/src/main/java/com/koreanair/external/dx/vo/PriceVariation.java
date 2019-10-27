package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;

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
  * it gathers the information about a single rate variation
 **/
@ApiModel(description="it gathers the information about a single rate variation")
public class PriceVariation  {
  
  @ApiModelProperty(required = true, value = "Begin date of the rate change Format: YYYY-MM-DD ")
 /**
   * Begin date of the rate change Format: YYYY-MM-DD 
  **/
  private LocalDate startDate = null;

  @ApiModelProperty(required = true, value = "End date of the rate change Format: YYYY-MM-DD ")
 /**
   * End date of the rate change Format: YYYY-MM-DD 
  **/
  private LocalDate endDate = null;

  @ApiModelProperty(value = "Amount of the rate change period before tax")
 /**
   * Amount of the rate change period before tax
  **/
  private Amount base = null;

  @ApiModelProperty(value = "Amount of the rate change period after tax")
 /**
   * Amount of the rate change period after tax
  **/
  private Amount total = null;
 /**
   * Begin date of the rate change Format: YYYY-MM-DD 
   * @return startDate
  **/
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public PriceVariation startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * End date of the rate change Format: YYYY-MM-DD 
   * @return endDate
  **/
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public PriceVariation endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Amount of the rate change period before tax
   * @return base
  **/
  @JsonProperty("base")
  public Amount getBase() {
    return base;
  }

  public void setBase(Amount base) {
    this.base = base;
  }

  public PriceVariation base(Amount base) {
    this.base = base;
    return this;
  }

 /**
   * Amount of the rate change period after tax
   * @return total
  **/
  @JsonProperty("total")
  public Amount getTotal() {
    return total;
  }

  public void setTotal(Amount total) {
    this.total = total;
  }

  public PriceVariation total(Amount total) {
    this.total = total;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceVariation {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

