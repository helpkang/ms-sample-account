package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
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
  * estimated nightly average for the stay
 **/
@ApiModel(description="estimated nightly average for the stay")
public class BaseTotalAmount  {
  
  @ApiModelProperty(required = true, value = "Amount before taxes. This amount is kept unmodified and shows the amount before taxes not including the mark-ups")
 /**
   * Amount before taxes. This amount is kept unmodified and shows the amount before taxes not including the mark-ups
  **/
  private Amount base = null;

  @ApiModelProperty(required = true, value = "Amount after taxes. This amount is kept unmodified and shows the amount after taxes not including the mark-up")
 /**
   * Amount after taxes. This amount is kept unmodified and shows the amount after taxes not including the mark-up
  **/
  private Amount total = null;
 /**
   * Amount before taxes. This amount is kept unmodified and shows the amount before taxes not including the mark-ups
   * @return base
  **/
  @JsonProperty("base")
  public Amount getBase() {
    return base;
  }

  public void setBase(Amount base) {
    this.base = base;
  }

  public BaseTotalAmount base(Amount base) {
    this.base = base;
    return this;
  }

 /**
   * Amount after taxes. This amount is kept unmodified and shows the amount after taxes not including the mark-up
   * @return total
  **/
  @JsonProperty("total")
  public Amount getTotal() {
    return total;
  }

  public void setTotal(Amount total) {
    this.total = total;
  }

  public BaseTotalAmount total(Amount total) {
    this.total = total;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseTotalAmount {\n");
    
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

