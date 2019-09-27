package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SeatmapCoordinates;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatmapFacility  {
  
  @ApiModelProperty(value = "Facility code, as described in the facility dictionary")
 /**
   * Facility code, as described in the facility dictionary
  **/
  private String code = null;

  @ApiModelProperty(value = "Facility type, as described in the facility dictionary")
 /**
   * Facility type, as described in the facility dictionary
  **/
  private String facilityType = null;

  @ApiModelProperty(value = "")
  private String column = null;

  @ApiModelProperty(value = "")
  private String row = null;


@XmlType(name="PositionEnum")
@XmlEnum(String.class)
public enum PositionEnum {

@XmlEnumValue("front") FRONT(String.valueOf("front")), @XmlEnumValue("rear") REAR(String.valueOf("rear")), @XmlEnumValue("seat") SEAT(String.valueOf("seat"));


    private String value;

    PositionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PositionEnum fromValue(String v) {
        for (PositionEnum b : PositionEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Position is either front, rear or seat (in case the facility takes the place of a seat)")
 /**
   * Position is either front, rear or seat (in case the facility takes the place of a seat)
  **/
  private PositionEnum position = null;

  @ApiModelProperty(value = "")
  private SeatmapCoordinates coordinates = null;
 /**
   * Facility code, as described in the facility dictionary
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SeatmapFacility code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Facility type, as described in the facility dictionary
   * @return facilityType
  **/
  @JsonProperty("facilityType")
  public String getFacilityType() {
    return facilityType;
  }

  public void setFacilityType(String facilityType) {
    this.facilityType = facilityType;
  }

  public SeatmapFacility facilityType(String facilityType) {
    this.facilityType = facilityType;
    return this;
  }

 /**
   * Get column
   * @return column
  **/
  @JsonProperty("column")
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public SeatmapFacility column(String column) {
    this.column = column;
    return this;
  }

 /**
   * Get row
   * @return row
  **/
  @JsonProperty("row")
  public String getRow() {
    return row;
  }

  public void setRow(String row) {
    this.row = row;
  }

  public SeatmapFacility row(String row) {
    this.row = row;
    return this;
  }

 /**
   * Position is either front, rear or seat (in case the facility takes the place of a seat)
   * @return position
  **/
  @JsonProperty("position")
  public String getPosition() {
    if (position == null) {
      return null;
    }
    return position.value();
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public SeatmapFacility position(PositionEnum position) {
    this.position = position;
    return this;
  }

 /**
   * Get coordinates
   * @return coordinates
  **/
  @JsonProperty("coordinates")
  public SeatmapCoordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(SeatmapCoordinates coordinates) {
    this.coordinates = coordinates;
  }

  public SeatmapFacility coordinates(SeatmapCoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapFacility {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    facilityType: ").append(toIndentedString(facilityType)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

