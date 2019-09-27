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

public class CarAcrissCodeDictionaryItem  {
  
  @ApiModelProperty(required = true, value = "Car category name. e.g. mini, economy.")
 /**
   * Car category name. e.g. mini, economy.
  **/
  private String category = null;

  @ApiModelProperty(required = true, value = "Car type name. e.g. 2-3 doors, SUV.")
 /**
   * Car type name. e.g. 2-3 doors, SUV.
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "Car drive type. e.g. 4wd, awd or unspecified.")
 /**
   * Car drive type. e.g. 4wd, awd or unspecified.
  **/
  private String drive = null;

  @ApiModelProperty(required = true, value = "Car fuel. e.g. diesel, hybrid, unspecified.")
 /**
   * Car fuel. e.g. diesel, hybrid, unspecified.
  **/
  private String fuel = null;

  @ApiModelProperty(required = true, value = "Car transmission. e.g. Y stands for auto, N for manual.")
 /**
   * Car transmission. e.g. Y stands for auto, N for manual.
  **/
  private Boolean isAutomatic = null;

  @ApiModelProperty(required = true, value = "Car air conditioning.")
 /**
   * Car air conditioning.
  **/
  private Boolean airConditioning = null;
 /**
   * Car category name. e.g. mini, economy.
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CarAcrissCodeDictionaryItem category(String category) {
    this.category = category;
    return this;
  }

 /**
   * Car type name. e.g. 2-3 doors, SUV.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CarAcrissCodeDictionaryItem type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Car drive type. e.g. 4wd, awd or unspecified.
   * @return drive
  **/
  @JsonProperty("drive")
  public String getDrive() {
    return drive;
  }

  public void setDrive(String drive) {
    this.drive = drive;
  }

  public CarAcrissCodeDictionaryItem drive(String drive) {
    this.drive = drive;
    return this;
  }

 /**
   * Car fuel. e.g. diesel, hybrid, unspecified.
   * @return fuel
  **/
  @JsonProperty("fuel")
  public String getFuel() {
    return fuel;
  }

  public void setFuel(String fuel) {
    this.fuel = fuel;
  }

  public CarAcrissCodeDictionaryItem fuel(String fuel) {
    this.fuel = fuel;
    return this;
  }

 /**
   * Car transmission. e.g. Y stands for auto, N for manual.
   * @return isAutomatic
  **/
  @JsonProperty("isAutomatic")
  public Boolean isIsAutomatic() {
    return isAutomatic;
  }

  public void setIsAutomatic(Boolean isAutomatic) {
    this.isAutomatic = isAutomatic;
  }

  public CarAcrissCodeDictionaryItem isAutomatic(Boolean isAutomatic) {
    this.isAutomatic = isAutomatic;
    return this;
  }

 /**
   * Car air conditioning.
   * @return airConditioning
  **/
  @JsonProperty("airConditioning")
  public Boolean isAirConditioning() {
    return airConditioning;
  }

  public void setAirConditioning(Boolean airConditioning) {
    this.airConditioning = airConditioning;
  }

  public CarAcrissCodeDictionaryItem airConditioning(Boolean airConditioning) {
    this.airConditioning = airConditioning;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarAcrissCodeDictionaryItem {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
    sb.append("    fuel: ").append(toIndentedString(fuel)).append("\n");
    sb.append("    isAutomatic: ").append(toIndentedString(isAutomatic)).append("\n");
    sb.append("    airConditioning: ").append(toIndentedString(airConditioning)).append("\n");
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

