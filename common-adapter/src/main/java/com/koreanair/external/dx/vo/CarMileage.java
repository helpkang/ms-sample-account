package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.ExtraMileage;
import com.koreanair.external.dx.vo.Mileage;
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
  * Details of a car offer mileage: rates, rental period, included distance, etc
 **/
@ApiModel(description="Details of a car offer mileage: rates, rental period, included distance, etc")
public class CarMileage  {
  
  @ApiModelProperty(value = "Unitary cost of the exceeding mileage (defined by `maxDistance` and `distanceUnit`). The amount will be expressed in the currency specified in the user preferences. Example: `1.16 USD` would be the cost per extra kilometer (if 'distanceUnit' corresponds to km) ")
 /**
   * Unitary cost of the exceeding mileage (defined by `maxDistance` and `distanceUnit`). The amount will be expressed in the currency specified in the user preferences. Example: `1.16 USD` would be the cost per extra kilometer (if 'distanceUnit' corresponds to km) 
  **/
  private Amount excessCost = null;

  @ApiModelProperty(value = "Maximum distance included")
 /**
   * Maximum distance included
  **/
  private Integer maxDistance = null;


@XmlType(name="DistanceUnitEnum")
@XmlEnum(String.class)
public enum DistanceUnitEnum {

@XmlEnumValue("km") KM(String.valueOf("km")), @XmlEnumValue("miles") MILES(String.valueOf("miles"));


    private String value;

    DistanceUnitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DistanceUnitEnum fromValue(String v) {
        for (DistanceUnitEnum b : DistanceUnitEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Unit of the distance: km or miles")
 /**
   * Unit of the distance: km or miles
  **/
  private DistanceUnitEnum distanceUnit = null;

  @ApiModelProperty(required = true, value = "Conveys whether the car can be used for an unlimited distance")
 /**
   * Conveys whether the car can be used for an unlimited distance
  **/
  private Boolean isUnlimited = null;

  @ApiModelProperty(value = "")
  private ExtraMileage extraMileage = null;
 /**
   * Unitary cost of the exceeding mileage (defined by &#x60;maxDistance&#x60; and &#x60;distanceUnit&#x60;). The amount will be expressed in the currency specified in the user preferences. Example: &#x60;1.16 USD&#x60; would be the cost per extra kilometer (if &#39;distanceUnit&#39; corresponds to km) 
   * @return excessCost
  **/
  @JsonProperty("excessCost")
  public Amount getExcessCost() {
    return excessCost;
  }

  public void setExcessCost(Amount excessCost) {
    this.excessCost = excessCost;
  }

  public CarMileage excessCost(Amount excessCost) {
    this.excessCost = excessCost;
    return this;
  }

 /**
   * Maximum distance included
   * @return maxDistance
  **/
  @JsonProperty("maxDistance")
  public Integer getMaxDistance() {
    return maxDistance;
  }

  public void setMaxDistance(Integer maxDistance) {
    this.maxDistance = maxDistance;
  }

  public CarMileage maxDistance(Integer maxDistance) {
    this.maxDistance = maxDistance;
    return this;
  }

 /**
   * Unit of the distance: km or miles
   * @return distanceUnit
  **/
  @JsonProperty("distanceUnit")
  public String getDistanceUnit() {
    if (distanceUnit == null) {
      return null;
    }
    return distanceUnit.value();
  }

  public void setDistanceUnit(DistanceUnitEnum distanceUnit) {
    this.distanceUnit = distanceUnit;
  }

  public CarMileage distanceUnit(DistanceUnitEnum distanceUnit) {
    this.distanceUnit = distanceUnit;
    return this;
  }

 /**
   * Conveys whether the car can be used for an unlimited distance
   * @return isUnlimited
  **/
  @JsonProperty("isUnlimited")
  public Boolean isIsUnlimited() {
    return isUnlimited;
  }

  public void setIsUnlimited(Boolean isUnlimited) {
    this.isUnlimited = isUnlimited;
  }

  public CarMileage isUnlimited(Boolean isUnlimited) {
    this.isUnlimited = isUnlimited;
    return this;
  }

 /**
   * Get extraMileage
   * @return extraMileage
  **/
  @JsonProperty("extraMileage")
  public ExtraMileage getExtraMileage() {
    return extraMileage;
  }

  public void setExtraMileage(ExtraMileage extraMileage) {
    this.extraMileage = extraMileage;
  }

  public CarMileage extraMileage(ExtraMileage extraMileage) {
    this.extraMileage = extraMileage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarMileage {\n");
    
    sb.append("    excessCost: ").append(toIndentedString(excessCost)).append("\n");
    sb.append("    maxDistance: ").append(toIndentedString(maxDistance)).append("\n");
    sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
    sb.append("    isUnlimited: ").append(toIndentedString(isUnlimited)).append("\n");
    sb.append("    extraMileage: ").append(toIndentedString(extraMileage)).append("\n");
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

