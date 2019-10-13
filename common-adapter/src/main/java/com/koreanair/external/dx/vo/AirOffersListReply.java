package com.koreanair.external.dx.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
  * List of air offers corresponding to the search criteria
 **/
@ApiModel(description="List of air offers corresponding to the search criteria")
public class AirOffersListReply  {

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
  private AirOffersListReplyData data = null;

  @ApiModelProperty(value = "")
  private AirOfferDictionary dictionaries = null;
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

  public AirOffersListReply errors(List<ErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public AirOffersListReply addErrorsItem(ErrorMessage errorsItem) {
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

  public AirOffersListReply warnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
    return this;
  }

  public AirOffersListReply addWarningsItem(WarningMessage warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public AirOffersListReplyData getData() {
    return data;
  }

  public void setData(AirOffersListReplyData data) {
    this.data = data;
  }

  public AirOffersListReply data(AirOffersListReplyData data) {
    this.data = data;
    return this;
  }

 /**
   * Get dictionaries
   * @return dictionaries
  **/
  @JsonProperty("dictionaries")
  public AirOfferDictionary getDictionaries() {
    return dictionaries;
  }

  public void setDictionaries(AirOfferDictionary dictionaries) {
    this.dictionaries = dictionaries;
  }

  public AirOffersListReply dictionaries(AirOfferDictionary dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirOffersListReply {\n");

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

