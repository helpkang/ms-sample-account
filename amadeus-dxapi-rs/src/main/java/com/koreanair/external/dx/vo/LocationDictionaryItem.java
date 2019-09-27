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
  * Location dictionary
 **/
@ApiModel(description="Location dictionary")
public class LocationDictionaryItem  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("airport") AIRPORT(String.valueOf("airport")), @XmlEnumValue("city") CITY(String.valueOf("city")), @XmlEnumValue("state") STATE(String.valueOf("state"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Location type: airport, city or state")
 /**
   * Location type: airport, city or state
  **/
  private TypeEnum type = null;

  @ApiModelProperty(value = "Localized name of the airport (not returned if the location is a city or a state)")
 /**
   * Localized name of the airport (not returned if the location is a city or a state)
  **/
  private String airportName = null;

  @ApiModelProperty(value = "IATA city code. City code associated to airport (not returned if the location is a city or a state)")
 /**
   * IATA city code. City code associated to airport (not returned if the location is a city or a state)
  **/
  private String cityCode = null;

  @ApiModelProperty(value = "Localized name of the city (not returned if the location is a state)")
 /**
   * Localized name of the city (not returned if the location is a state)
  **/
  private String cityName = null;

  @ApiModelProperty(value = "State code (two character standard IATA state code)")
 /**
   * State code (two character standard IATA state code)
  **/
  private String stateCode = null;

  @ApiModelProperty(value = "ISO 3166-1 country code")
 /**
   * ISO 3166-1 country code
  **/
  private String countryCode = null;
 /**
   * Location type: airport, city or state
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public LocationDictionaryItem type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Localized name of the airport (not returned if the location is a city or a state)
   * @return airportName
  **/
  @JsonProperty("airportName")
  public String getAirportName() {
    return airportName;
  }

  public void setAirportName(String airportName) {
    this.airportName = airportName;
  }

  public LocationDictionaryItem airportName(String airportName) {
    this.airportName = airportName;
    return this;
  }

 /**
   * IATA city code. City code associated to airport (not returned if the location is a city or a state)
   * @return cityCode
  **/
  @JsonProperty("cityCode")
  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public LocationDictionaryItem cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

 /**
   * Localized name of the city (not returned if the location is a state)
   * @return cityName
  **/
  @JsonProperty("cityName")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public LocationDictionaryItem cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

 /**
   * State code (two character standard IATA state code)
   * @return stateCode
  **/
  @JsonProperty("stateCode")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public LocationDictionaryItem stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

 /**
   * ISO 3166-1 country code
   * @return countryCode
  **/
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public LocationDictionaryItem countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationDictionaryItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    airportName: ").append(toIndentedString(airportName)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

