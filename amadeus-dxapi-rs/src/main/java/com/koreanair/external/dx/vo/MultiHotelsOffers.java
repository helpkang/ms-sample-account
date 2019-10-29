package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ErrorMessage;
import com.koreanair.external.dx.vo.HotelDictionary;
import com.koreanair.external.dx.vo.HotelOffers;
import com.koreanair.external.dx.vo.Meta;
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

public class MultiHotelsOffers  {
  
  @ApiModelProperty(required = true, value = "The list of the hotels matching the search criteria, and the available offers for each hotel.")
 /**
   * The list of the hotels matching the search criteria, and the available offers for each hotel.
  **/
  private List<HotelOffers> data = new ArrayList<>();

  @ApiModelProperty(value = "")
  private Meta meta = null;

  @ApiModelProperty(value = "")
  private HotelDictionary dictionaries = null;

  @ApiModelProperty(value = "Array of error messages")
 /**
   * Array of error messages
  **/
  private List<ErrorMessage> errors = null;
 /**
   * The list of the hotels matching the search criteria, and the available offers for each hotel.
   * @return data
  **/
  @JsonProperty("data")
  public List<HotelOffers> getData() {
    return data;
  }

  public void setData(List<HotelOffers> data) {
    this.data = data;
  }

  public MultiHotelsOffers data(List<HotelOffers> data) {
    this.data = data;
    return this;
  }

  public MultiHotelsOffers addDataItem(HotelOffers dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("meta")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public MultiHotelsOffers meta(Meta meta) {
    this.meta = meta;
    return this;
  }

 /**
   * Get dictionaries
   * @return dictionaries
  **/
  @JsonProperty("dictionaries")
  public HotelDictionary getDictionaries() {
    return dictionaries;
  }

  public void setDictionaries(HotelDictionary dictionaries) {
    this.dictionaries = dictionaries;
  }

  public MultiHotelsOffers dictionaries(HotelDictionary dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }

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

  public MultiHotelsOffers errors(List<ErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public MultiHotelsOffers addErrorsItem(ErrorMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiHotelsOffers {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    dictionaries: ").append(toIndentedString(dictionaries)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

