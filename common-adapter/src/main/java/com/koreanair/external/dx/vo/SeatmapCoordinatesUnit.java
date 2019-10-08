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

public class SeatmapCoordinatesUnit  {
  
  @ApiModelProperty(value = "Translation unit: e.g. CM for centimeters, IN for inches")
 /**
   * Translation unit: e.g. CM for centimeters, IN for inches
  **/
  private String translationUnit = null;


@XmlType(name="RotationUnitEnum")
@XmlEnum(String.class)
public enum RotationUnitEnum {

@XmlEnumValue("radian") RADIAN(String.valueOf("radian")), @XmlEnumValue("degree") DEGREE(String.valueOf("degree"));


    private String value;

    RotationUnitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RotationUnitEnum fromValue(String v) {
        for (RotationUnitEnum b : RotationUnitEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Rotation unit")
 /**
   * Rotation unit
  **/
  private RotationUnitEnum rotationUnit = null;
 /**
   * Translation unit: e.g. CM for centimeters, IN for inches
   * @return translationUnit
  **/
  @JsonProperty("translationUnit")
  public String getTranslationUnit() {
    return translationUnit;
  }

  public void setTranslationUnit(String translationUnit) {
    this.translationUnit = translationUnit;
  }

  public SeatmapCoordinatesUnit translationUnit(String translationUnit) {
    this.translationUnit = translationUnit;
    return this;
  }

 /**
   * Rotation unit
   * @return rotationUnit
  **/
  @JsonProperty("rotationUnit")
  public String getRotationUnit() {
    if (rotationUnit == null) {
      return null;
    }
    return rotationUnit.value();
  }

  public void setRotationUnit(RotationUnitEnum rotationUnit) {
    this.rotationUnit = rotationUnit;
  }

  public SeatmapCoordinatesUnit rotationUnit(RotationUnitEnum rotationUnit) {
    this.rotationUnit = rotationUnit;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapCoordinatesUnit {\n");
    
    sb.append("    translationUnit: ").append(toIndentedString(translationUnit)).append("\n");
    sb.append("    rotationUnit: ").append(toIndentedString(rotationUnit)).append("\n");
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

