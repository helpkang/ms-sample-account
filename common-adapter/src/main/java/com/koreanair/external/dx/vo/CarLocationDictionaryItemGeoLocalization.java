package com.koreanair.external.dx.vo;

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
  * Geo localization details
 **/
@ApiModel(description="Geo localization details")
public class CarLocationDictionaryItemGeoLocalization  {
  
  @ApiModelProperty(value = "Geocode longitude")
 /**
   * Geocode longitude
  **/
  private Double longitude = null;

  @ApiModelProperty(value = "Geocode latitude")
 /**
   * Geocode latitude
  **/
  private Double latitude = null;

  @ApiModelProperty(value = "Distance unit of measurement")
 /**
   * Distance unit of measurement
  **/
  private String distanceUnit = null;

  @ApiModelProperty(value = "Distance value from the input geolocation Only used when the search was made for a geolocation search ")
 /**
   * Distance value from the input geolocation Only used when the search was made for a geolocation search 
  **/
  private String distance = null;
 /**
   * Geocode longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public CarLocationDictionaryItemGeoLocalization longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Geocode latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public CarLocationDictionaryItemGeoLocalization latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Distance unit of measurement
   * @return distanceUnit
  **/
  @JsonProperty("distanceUnit")
  public String getDistanceUnit() {
    return distanceUnit;
  }

  public void setDistanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
  }

  public CarLocationDictionaryItemGeoLocalization distanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
    return this;
  }

 /**
   * Distance value from the input geolocation Only used when the search was made for a geolocation search 
   * @return distance
  **/
  @JsonProperty("distance")
  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public CarLocationDictionaryItemGeoLocalization distance(String distance) {
    this.distance = distance;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarLocationDictionaryItemGeoLocalization {\n");
    
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

