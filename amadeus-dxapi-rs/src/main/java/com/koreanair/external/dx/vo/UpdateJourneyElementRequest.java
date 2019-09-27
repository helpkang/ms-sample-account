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
  * Provide the list of changes to be applied on a journey element (traveler on flight)
 **/
@ApiModel(description="Provide the list of changes to be applied on a journey element (traveler on flight)")
public class UpdateJourneyElementRequest  {
  

@XmlType(name="ExitSeatSuitabilityEnum")
@XmlEnum(String.class)
public enum ExitSeatSuitabilityEnum {

@XmlEnumValue("suitable") SUITABLE(String.valueOf("suitable")), @XmlEnumValue("notSuitable") NOTSUITABLE(String.valueOf("notSuitable")), @XmlEnumValue("unableToDetermine") UNABLETODETERMINE(String.valueOf("unableToDetermine"));


    private String value;

    ExitSeatSuitabilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ExitSeatSuitabilityEnum fromValue(String v) {
        for (ExitSeatSuitabilityEnum b : ExitSeatSuitabilityEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Exit seat suitability. UnableToDetermine suitability will trigger a warning at next touchpoint with an agent in order for him to check the suitability. If suitability is set to notSuitable and the traveler was assigned an exit seat, the Departure Control System will change the seat automatically. ")
 /**
   * Exit seat suitability. UnableToDetermine suitability will trigger a warning at next touchpoint with an agent in order for him to check the suitability. If suitability is set to notSuitable and the traveler was assigned an exit seat, the Departure Control System will change the seat automatically. 
  **/
  private ExitSeatSuitabilityEnum exitSeatSuitability = null;
 /**
   * Exit seat suitability. UnableToDetermine suitability will trigger a warning at next touchpoint with an agent in order for him to check the suitability. If suitability is set to notSuitable and the traveler was assigned an exit seat, the Departure Control System will change the seat automatically. 
   * @return exitSeatSuitability
  **/
  @JsonProperty("exitSeatSuitability")
  public String getExitSeatSuitability() {
    if (exitSeatSuitability == null) {
      return null;
    }
    return exitSeatSuitability.value();
  }

  public void setExitSeatSuitability(ExitSeatSuitabilityEnum exitSeatSuitability) {
    this.exitSeatSuitability = exitSeatSuitability;
  }

  public UpdateJourneyElementRequest exitSeatSuitability(ExitSeatSuitabilityEnum exitSeatSuitability) {
    this.exitSeatSuitability = exitSeatSuitability;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateJourneyElementRequest {\n");
    
    sb.append("    exitSeatSuitability: ").append(toIndentedString(exitSeatSuitability)).append("\n");
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

