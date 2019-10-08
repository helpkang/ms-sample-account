package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BoardingPassDeliveryMethod;
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
  * Input fields for the boarding pass delivery
 **/
@ApiModel(description="Input fields for the boarding pass delivery")
public class BoardingPassDeliveryInput  {
  
  @ApiModelProperty(required = true, value = "")
  private BoardingPassDeliveryMethod deliveryMethod = null;

  @ApiModelProperty(value = "Code of the preferred language to be used, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm) Translation of the boarding is provided by the airline and because of international regulation, part of the document might stay in English. ")
 /**
   * Code of the preferred language to be used, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm) Translation of the boarding is provided by the airline and because of international regulation, part of the document might stay in English. 
  **/
  private String languageCode = "en-GB";

  @ApiModelProperty(required = true, value = "Journey Id for which the boarding passes should be generated")
 /**
   * Journey Id for which the boarding passes should be generated
  **/
  private String journeyId = null;

  @ApiModelProperty(value = "By default the boarding passes will be generated for any journeyElement being part of the selected Journey. In order to generate the boarding passes only for a specific list of journeyElement, the list of the corresponding Ids can be provided via this field. ")
 /**
   * By default the boarding passes will be generated for any journeyElement being part of the selected Journey. In order to generate the boarding passes only for a specific list of journeyElement, the list of the corresponding Ids can be provided via this field. 
  **/
  private List<String> journeyElementIds = null;
 /**
   * Get deliveryMethod
   * @return deliveryMethod
  **/
  @JsonProperty("deliveryMethod")
  public BoardingPassDeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(BoardingPassDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public BoardingPassDeliveryInput deliveryMethod(BoardingPassDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

 /**
   * Code of the preferred language to be used, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm) Translation of the boarding is provided by the airline and because of international regulation, part of the document might stay in English. 
   * @return languageCode
  **/
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public BoardingPassDeliveryInput languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

 /**
   * Journey Id for which the boarding passes should be generated
   * @return journeyId
  **/
  @JsonProperty("journeyId")
  public String getJourneyId() {
    return journeyId;
  }

  public void setJourneyId(String journeyId) {
    this.journeyId = journeyId;
  }

  public BoardingPassDeliveryInput journeyId(String journeyId) {
    this.journeyId = journeyId;
    return this;
  }

 /**
   * By default the boarding passes will be generated for any journeyElement being part of the selected Journey. In order to generate the boarding passes only for a specific list of journeyElement, the list of the corresponding Ids can be provided via this field. 
   * @return journeyElementIds
  **/
  @JsonProperty("journeyElementIds")
  public List<String> getJourneyElementIds() {
    return journeyElementIds;
  }

  public void setJourneyElementIds(List<String> journeyElementIds) {
    this.journeyElementIds = journeyElementIds;
  }

  public BoardingPassDeliveryInput journeyElementIds(List<String> journeyElementIds) {
    this.journeyElementIds = journeyElementIds;
    return this;
  }

  public BoardingPassDeliveryInput addJourneyElementIdsItem(String journeyElementIdsItem) {
    this.journeyElementIds.add(journeyElementIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassDeliveryInput {\n");
    
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    journeyId: ").append(toIndentedString(journeyId)).append("\n");
    sb.append("    journeyElementIds: ").append(toIndentedString(journeyElementIds)).append("\n");
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

