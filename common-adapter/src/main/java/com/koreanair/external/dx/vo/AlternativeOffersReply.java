package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AlternativeOffer;
import com.koreanair.external.dx.vo.FlightDictionary;
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

public class AlternativeOffersReply  {
  
  @ApiModelProperty(required = true, value = "A list of offers. An offer can contain a combination of flight, hotel, car ...")
 /**
   * A list of offers. An offer can contain a combination of flight, hotel, car ...
  **/
  private List<AlternativeOffer> data = new ArrayList<>();

  @ApiModelProperty(value = "")
  private FlightDictionary dictionaries = null;
 /**
   * A list of offers. An offer can contain a combination of flight, hotel, car ...
   * @return data
  **/
  @JsonProperty("data")
  public List<AlternativeOffer> getData() {
    return data;
  }

  public void setData(List<AlternativeOffer> data) {
    this.data = data;
  }

  public AlternativeOffersReply data(List<AlternativeOffer> data) {
    this.data = data;
    return this;
  }

  public AlternativeOffersReply addDataItem(AlternativeOffer dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get dictionaries
   * @return dictionaries
  **/
  @JsonProperty("dictionaries")
  public FlightDictionary getDictionaries() {
    return dictionaries;
  }

  public void setDictionaries(FlightDictionary dictionaries) {
    this.dictionaries = dictionaries;
  }

  public AlternativeOffersReply dictionaries(FlightDictionary dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeOffersReply {\n");
    
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

