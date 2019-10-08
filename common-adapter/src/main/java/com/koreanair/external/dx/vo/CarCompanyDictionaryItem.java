package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarCompany;
import com.koreanair.external.dx.vo.Image;
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
  * Car company information
 **/
@ApiModel(description="Car company information")
public class CarCompanyDictionaryItem  {
  
  @ApiModelProperty(required = true, value = "company name or broker name")
 /**
   * company name or broker name
  **/
  private String name = null;

  @ApiModelProperty(value = "company logos or broker logos")
 /**
   * company logos or broker logos
  **/
  private List<Image> logos = null;

  @ApiModelProperty(value = "Car provider code or broker code when the company is a broker")
 /**
   * Car provider code or broker code when the company is a broker
  **/
  private String code = null;

  @ApiModelProperty(value = "")
  private CarCompany broker = null;
 /**
   * company name or broker name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CarCompanyDictionaryItem name(String name) {
    this.name = name;
    return this;
  }

 /**
   * company logos or broker logos
   * @return logos
  **/
  @JsonProperty("logos")
  public List<Image> getLogos() {
    return logos;
  }

  public void setLogos(List<Image> logos) {
    this.logos = logos;
  }

  public CarCompanyDictionaryItem logos(List<Image> logos) {
    this.logos = logos;
    return this;
  }

  public CarCompanyDictionaryItem addLogosItem(Image logosItem) {
    this.logos.add(logosItem);
    return this;
  }

 /**
   * Car provider code or broker code when the company is a broker
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CarCompanyDictionaryItem code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get broker
   * @return broker
  **/
  @JsonProperty("broker")
  public CarCompany getBroker() {
    return broker;
  }

  public void setBroker(CarCompany broker) {
    this.broker = broker;
  }

  public CarCompanyDictionaryItem broker(CarCompany broker) {
    this.broker = broker;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarCompanyDictionaryItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
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

