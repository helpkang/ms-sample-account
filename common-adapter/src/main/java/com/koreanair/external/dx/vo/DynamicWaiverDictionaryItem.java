package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.DynamicWaiverCondition;
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
  * When a disruption is anticipated, a dynamic waiver could be offered to propose a change flights in this order.  Under the given conditions of this waiver, penalty is waived and flight change is encouraged.
 **/
@ApiModel(description="When a disruption is anticipated, a dynamic waiver could be offered to propose a change flights in this order.  Under the given conditions of this waiver, penalty is waived and flight change is encouraged.")
public class DynamicWaiverDictionaryItem  {
  
  @ApiModelProperty(required = true, value = "This code is the unique identifyer for this waiver.")
 /**
   * This code is the unique identifyer for this waiver.
  **/
  private String code = null;

  @ApiModelProperty(value = "")
  private DynamicWaiverCondition condition = null;
 /**
   * This code is the unique identifyer for this waiver.
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DynamicWaiverDictionaryItem code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get condition
   * @return condition
  **/
  @JsonProperty("condition")
  public DynamicWaiverCondition getCondition() {
    return condition;
  }

  public void setCondition(DynamicWaiverCondition condition) {
    this.condition = condition;
  }

  public DynamicWaiverDictionaryItem condition(DynamicWaiverCondition condition) {
    this.condition = condition;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicWaiverDictionaryItem {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

