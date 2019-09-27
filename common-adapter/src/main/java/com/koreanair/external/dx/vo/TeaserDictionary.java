package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarMainDictionary;
import com.koreanair.external.dx.vo.HotelDictionary;
import com.koreanair.external.dx.vo.InsuranceDictionary;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TeaserDictionary  {
  
  @ApiModelProperty(value = "Dictionary for insurance offers")
 /**
   * Dictionary for insurance offers
  **/
  private InsuranceDictionary insuranceDictionary = null;

  @ApiModelProperty(value = "Dictionary for car offers")
 /**
   * Dictionary for car offers
  **/
  private CarMainDictionary carDictionary = null;

  @ApiModelProperty(value = "Dictionary for hotel offers")
 /**
   * Dictionary for hotel offers
  **/
  private HotelDictionary hotelDictionary = null;
 /**
   * Dictionary for insurance offers
   * @return insuranceDictionary
  **/
  @JsonProperty("insuranceDictionary")
  public InsuranceDictionary getInsuranceDictionary() {
    return insuranceDictionary;
  }

  public void setInsuranceDictionary(InsuranceDictionary insuranceDictionary) {
    this.insuranceDictionary = insuranceDictionary;
  }

  public TeaserDictionary insuranceDictionary(InsuranceDictionary insuranceDictionary) {
    this.insuranceDictionary = insuranceDictionary;
    return this;
  }

 /**
   * Dictionary for car offers
   * @return carDictionary
  **/
  @JsonProperty("carDictionary")
  public CarMainDictionary getCarDictionary() {
    return carDictionary;
  }

  public void setCarDictionary(CarMainDictionary carDictionary) {
    this.carDictionary = carDictionary;
  }

  public TeaserDictionary carDictionary(CarMainDictionary carDictionary) {
    this.carDictionary = carDictionary;
    return this;
  }

 /**
   * Dictionary for hotel offers
   * @return hotelDictionary
  **/
  @JsonProperty("hotelDictionary")
  public HotelDictionary getHotelDictionary() {
    return hotelDictionary;
  }

  public void setHotelDictionary(HotelDictionary hotelDictionary) {
    this.hotelDictionary = hotelDictionary;
  }

  public TeaserDictionary hotelDictionary(HotelDictionary hotelDictionary) {
    this.hotelDictionary = hotelDictionary;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeaserDictionary {\n");
    
    sb.append("    insuranceDictionary: ").append(toIndentedString(insuranceDictionary)).append("\n");
    sb.append("    carDictionary: ").append(toIndentedString(carDictionary)).append("\n");
    sb.append("    hotelDictionary: ").append(toIndentedString(hotelDictionary)).append("\n");
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

