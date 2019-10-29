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
  * Point of sale id and country code where the Order was created. 
 **/
@ApiModel(description="Point of sale id and country code where the Order was created. ")
public class CreationPointOfSale  {
  
  @ApiModelProperty(required = true, value = "Id of the Order's creator. E.g. 'HELAY08MO'")
 /**
   * Id of the Order's creator. E.g. 'HELAY08MO'
  **/
  private String pointOfSaleId = null;

  @ApiModelProperty(required = true, value = "ISO 3166-1 country code. Used to specify the country associated to the pointOfSaleId where the Order was created.")
 /**
   * ISO 3166-1 country code. Used to specify the country associated to the pointOfSaleId where the Order was created.
  **/
  private String countryCode = null;
 /**
   * Id of the Order&#39;s creator. E.g. &#39;HELAY08MO&#39;
   * @return pointOfSaleId
  **/
  @JsonProperty("pointOfSaleId")
  public String getPointOfSaleId() {
    return pointOfSaleId;
  }

  public void setPointOfSaleId(String pointOfSaleId) {
    this.pointOfSaleId = pointOfSaleId;
  }

  public CreationPointOfSale pointOfSaleId(String pointOfSaleId) {
    this.pointOfSaleId = pointOfSaleId;
    return this;
  }

 /**
   * ISO 3166-1 country code. Used to specify the country associated to the pointOfSaleId where the Order was created.
   * @return countryCode
  **/
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CreationPointOfSale countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreationPointOfSale {\n");
    
    sb.append("    pointOfSaleId: ").append(toIndentedString(pointOfSaleId)).append("\n");
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

