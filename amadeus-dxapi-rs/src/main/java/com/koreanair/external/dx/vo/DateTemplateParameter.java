package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.LocalizationParameter;
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
  * Date localization template parameter
 **/
@ApiModel(description="Date localization template parameter")
public class DateTemplateParameter extends LocalizationParameter {
  
  @ApiModelProperty(value = "")
  private LocalDate value = null;
 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public LocalDate getValue() {
    return value;
  }

  public void setValue(LocalDate value) {
    this.value = value;
  }

  public DateTemplateParameter value(LocalDate value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTemplateParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

