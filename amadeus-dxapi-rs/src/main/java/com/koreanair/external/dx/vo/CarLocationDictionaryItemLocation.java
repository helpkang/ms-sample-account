package com.koreanair.external.dx.vo;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CarLocationDictionaryItemLocation  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("amadeus") AMADEUS(String.valueOf("amadeus")), @XmlEnumValue("company") COMPANY(String.valueOf("company"));


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

  @ApiModelProperty(required = true, value = "The type of the location code return Amadeus if the location code is an amadeus format. e.g.  NCET01 ( iataCode + vicinityCode + vicinityNumber ) company if the location code is a company format without any specific format.")
 /**
   * The type of the location code return Amadeus if the location code is an amadeus format. e.g.  NCET01 ( iataCode + vicinityCode + vicinityNumber ) company if the location code is a company format without any specific format.
  **/
  private TypeEnum type = null;

  @ApiModelProperty(required = true, value = "Amadeus or company detailed location code concatenated with provider code. e.g. MUCT01, ORYC12, 12314sc")
 /**
   * Amadeus or company detailed location code concatenated with provider code. e.g. MUCT01, ORYC12, 12314sc
  **/
  private String code = null;

  @ApiModelProperty(value = "IATA location code (http://www.iata.org/publications/Pages/code-search.aspx)")
 /**
   * IATA location code (http://www.iata.org/publications/Pages/code-search.aspx)
  **/
  private String iataCode = null;

  @ApiModelProperty(value = "value states if the IATA location code refers to an IATA airport code")
 /**
   * value states if the IATA location code refers to an IATA airport code
  **/
  private Boolean isAirportCode = null;
 /**
   * The type of the location code return Amadeus if the location code is an amadeus format. e.g.  NCET01 ( iataCode + vicinityCode + vicinityNumber ) company if the location code is a company format without any specific format.
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

  public CarLocationDictionaryItemLocation type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Amadeus or company detailed location code concatenated with provider code. e.g. MUCT01, ORYC12, 12314sc
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CarLocationDictionaryItemLocation code(String code) {
    this.code = code;
    return this;
  }

 /**
   * IATA location code (http://www.iata.org/publications/Pages/code-search.aspx)
   * @return iataCode
  **/
  @JsonProperty("iataCode")
  public String getIataCode() {
    return iataCode;
  }

  public void setIataCode(String iataCode) {
    this.iataCode = iataCode;
  }

  public CarLocationDictionaryItemLocation iataCode(String iataCode) {
    this.iataCode = iataCode;
    return this;
  }

 /**
   * value states if the IATA location code refers to an IATA airport code
   * @return isAirportCode
  **/
  @JsonProperty("isAirportCode")
  public Boolean isIsAirportCode() {
    return isAirportCode;
  }

  public void setIsAirportCode(Boolean isAirportCode) {
    this.isAirportCode = isAirportCode;
  }

  public CarLocationDictionaryItemLocation isAirportCode(Boolean isAirportCode) {
    this.isAirportCode = isAirportCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarLocationDictionaryItemLocation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    iataCode: ").append(toIndentedString(iataCode)).append("\n");
    sb.append("    isAirportCode: ").append(toIndentedString(isAirportCode)).append("\n");
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

