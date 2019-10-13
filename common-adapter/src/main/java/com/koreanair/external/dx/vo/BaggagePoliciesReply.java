package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BaggagePolicies;
import com.koreanair.external.dx.vo.BaggagePoliciesDictionary;
import com.koreanair.external.dx.vo.CommonReply;
import com.koreanair.external.dx.vo.ErrorMessage;
import com.koreanair.external.dx.vo.WarningMessage;
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

public class BaggagePoliciesReply  {
  
  @ApiModelProperty(value = "Array of error messages")
 /**
   * Array of error messages
  **/
  private List<ErrorMessage> errors = null;

  @ApiModelProperty(value = "Array of warning messages")
 /**
   * Array of warning messages
  **/
  private List<WarningMessage> warnings = null;

  @ApiModelProperty(required = true, value = "")
  private BaggagePolicies data = null;

  @ApiModelProperty(value = "")
  private BaggagePoliciesDictionary dictionaries = null;
 /**
   * Array of error messages
   * @return errors
  **/
  @JsonProperty("errors")
  public List<ErrorMessage> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorMessage> errors) {
    this.errors = errors;
  }

  public BaggagePoliciesReply errors(List<ErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public BaggagePoliciesReply addErrorsItem(ErrorMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Array of warning messages
   * @return warnings
  **/
  @JsonProperty("warnings")
  public List<WarningMessage> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
  }

  public BaggagePoliciesReply warnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
    return this;
  }

  public BaggagePoliciesReply addWarningsItem(WarningMessage warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public BaggagePolicies getData() {
    return data;
  }

  public void setData(BaggagePolicies data) {
    this.data = data;
  }

  public BaggagePoliciesReply data(BaggagePolicies data) {
    this.data = data;
    return this;
  }

 /**
   * Get dictionaries
   * @return dictionaries
  **/
  @JsonProperty("dictionaries")
  public BaggagePoliciesDictionary getDictionaries() {
    return dictionaries;
  }

  public void setDictionaries(BaggagePoliciesDictionary dictionaries) {
    this.dictionaries = dictionaries;
  }

  public BaggagePoliciesReply dictionaries(BaggagePoliciesDictionary dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggagePoliciesReply {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dictionaries: ").append(toIndentedString(dictionaries)).append("\n");
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

