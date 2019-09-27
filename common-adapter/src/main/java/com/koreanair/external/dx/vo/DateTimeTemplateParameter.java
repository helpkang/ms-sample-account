package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.LocalizationParameter;
import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;

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
  * Date-time localization template parameter
 **/
@ApiModel(description="Date-time localization template parameter")
public class DateTimeTemplateParameter extends LocalizationParameter {
  
  @ApiModelProperty(value = "")
  private LocalDateTime value = null;
 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public LocalDateTime getValue() {
    return value;
  }

  public void setValue(LocalDateTime value) {
    this.value = value;
  }

  public DateTimeTemplateParameter value(LocalDateTime value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeTemplateParameter {\n");
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

