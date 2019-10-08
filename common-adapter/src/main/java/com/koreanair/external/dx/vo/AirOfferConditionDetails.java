package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.LocalizationParameter;
import io.swagger.annotations.ApiModel;
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
  * Details of the fare condition in 2 flavors: - A ready to use description by default in English. For example: 'The minimal reissue fee is 20 Euros.' - Identifier and parameters so that you can build your own description. Few examples:  Examples: 1) With a localizationParameter (type `AmountParameter`) having value `{\"amount\": \"20\", \"currencyCode\": \"EUR\"}` and a custom template like `There is a ^amount ^currency fee to modify the dates of your LON <-> NCE round trip.` you can build: `There is a 20,00 Euros fee to modify the dates of your LON <-> NCE round trip.` Note that the locations, LON and NCE, can be taken from associated flights information.  2) With 2 localizationParameters (type `AmountParameter`) having values `{\"amount\": \"5\", \"currencyCode\": \"USD\"}}` and `{\"amount\": \"10\", \"currencyCode\": \"USD\"}`    using a template like `Refund penalty fee are between ^amout1 and ^amount2 USD.` you can obtain this result : `Refund penalty fee are between 5 and 10 USD.`  3) With a localizationParameters (type `BooleanParameter`) having value `false` and your own template `Refund ^isAllowed.` you can build: `Refund not allowed.`  4) With a localizationParameters (type `DateParameter`) having value `2018-11-22` and your own template `Exchange request must be made prior to ^date.` you can build: `Exchange request must be made prior to the 22nd of November.` 
 **/
@ApiModel(description="Details of the fare condition in 2 flavors: - A ready to use description by default in English. For example: 'The minimal reissue fee is 20 Euros.' - Identifier and parameters so that you can build your own description. Few examples:  Examples: 1) With a localizationParameter (type `AmountParameter`) having value `{\"amount\": \"20\", \"currencyCode\": \"EUR\"}` and a custom template like `There is a ^amount ^currency fee to modify the dates of your LON <-> NCE round trip.` you can build: `There is a 20,00 Euros fee to modify the dates of your LON <-> NCE round trip.` Note that the locations, LON and NCE, can be taken from associated flights information.  2) With 2 localizationParameters (type `AmountParameter`) having values `{\"amount\": \"5\", \"currencyCode\": \"USD\"}}` and `{\"amount\": \"10\", \"currencyCode\": \"USD\"}`    using a template like `Refund penalty fee are between ^amout1 and ^amount2 USD.` you can obtain this result : `Refund penalty fee are between 5 and 10 USD.`  3) With a localizationParameters (type `BooleanParameter`) having value `false` and your own template `Refund ^isAllowed.` you can build: `Refund not allowed.`  4) With a localizationParameters (type `DateParameter`) having value `2018-11-22` and your own template `Exchange request must be made prior to ^date.` you can build: `Exchange request must be made prior to the 22nd of November.` ")
public class AirOfferConditionDetails  {
  
  @ApiModelProperty(value = "Parameters to be used to customize your fare condition text templates. They can be of different nature: amount, date, datetime or boolean. ")
 /**
   * Parameters to be used to customize your fare condition text templates. They can be of different nature: amount, date, datetime or boolean. 
  **/
  private List<LocalizationParameter> localizationParameters = null;

  @ApiModelProperty(value = "Code identifying the text template to be used to build the air offer condition text. The template code could be used as reference in a CMS ")
 /**
   * Code identifying the text template to be used to build the air offer condition text. The template code could be used as reference in a CMS 
  **/
  private String descriptionCode = null;

  @ApiModelProperty(value = "Default description of the air offer condition. By default it is formatted as below: - In English-United Kingdom - dateTime format: ISO 8601 see http://www.w3.org/TR/NOTE-datetime. - date format: ISO 8601 see http://www.w3.org/TR/NOTE-datetime. - amount format: 0.00 ")
 /**
   * Default description of the air offer condition. By default it is formatted as below: - In English-United Kingdom - dateTime format: ISO 8601 see http://www.w3.org/TR/NOTE-datetime. - date format: ISO 8601 see http://www.w3.org/TR/NOTE-datetime. - amount format: 0.00 
  **/
  private String defaultDescription = null;
 /**
   * Parameters to be used to customize your fare condition text templates. They can be of different nature: amount, date, datetime or boolean. 
   * @return localizationParameters
  **/
  @JsonProperty("localizationParameters")
  public List<LocalizationParameter> getLocalizationParameters() {
    return localizationParameters;
  }

  public void setLocalizationParameters(List<LocalizationParameter> localizationParameters) {
    this.localizationParameters = localizationParameters;
  }

  public AirOfferConditionDetails localizationParameters(List<LocalizationParameter> localizationParameters) {
    this.localizationParameters = localizationParameters;
    return this;
  }

  public AirOfferConditionDetails addLocalizationParametersItem(LocalizationParameter localizationParametersItem) {
    this.localizationParameters.add(localizationParametersItem);
    return this;
  }

 /**
   * Code identifying the text template to be used to build the air offer condition text. The template code could be used as reference in a CMS 
   * @return descriptionCode
  **/
  @JsonProperty("descriptionCode")
  public String getDescriptionCode() {
    return descriptionCode;
  }

  public void setDescriptionCode(String descriptionCode) {
    this.descriptionCode = descriptionCode;
  }

  public AirOfferConditionDetails descriptionCode(String descriptionCode) {
    this.descriptionCode = descriptionCode;
    return this;
  }

 /**
   * Default description of the air offer condition. By default it is formatted as below: - In English-United Kingdom - dateTime format: ISO 8601 see http://www.w3.org/TR/NOTE-datetime. - date format: ISO 8601 see http://www.w3.org/TR/NOTE-datetime. - amount format: 0.00 
   * @return defaultDescription
  **/
  @JsonProperty("defaultDescription")
  public String getDefaultDescription() {
    return defaultDescription;
  }

  public void setDefaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
  }

  public AirOfferConditionDetails defaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirOfferConditionDetails {\n");
    
    sb.append("    localizationParameters: ").append(toIndentedString(localizationParameters)).append("\n");
    sb.append("    descriptionCode: ").append(toIndentedString(descriptionCode)).append("\n");
    sb.append("    defaultDescription: ").append(toIndentedString(defaultDescription)).append("\n");
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

