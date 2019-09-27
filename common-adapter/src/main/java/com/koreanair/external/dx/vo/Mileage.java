package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
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
  * Mileage information described by a maximum `maxDistance` allowed and its `distanceUnit` with the `excessCost` information in case of the mileage is exceeded 
 **/
@ApiModel(description="Mileage information described by a maximum `maxDistance` allowed and its `distanceUnit` with the `excessCost` information in case of the mileage is exceeded ")
public class Mileage  {
  
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

  public Mileage excessCost(Amount excessCost) {
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

  public Mileage maxDistance(Integer maxDistance) {
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

  public Mileage distanceUnit(DistanceUnitEnum distanceUnit) {
    this.distanceUnit = distanceUnit;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mileage {\n");
    
    sb.append("    excessCost: ").append(toIndentedString(excessCost)).append("\n");
    sb.append("    maxDistance: ").append(toIndentedString(maxDistance)).append("\n");
    sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
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

