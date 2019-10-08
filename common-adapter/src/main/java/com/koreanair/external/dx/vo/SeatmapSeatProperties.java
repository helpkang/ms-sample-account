package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SeatmapCoordinates;
import com.koreanair.external.dx.vo.SeatmapTravelerSeatInfo;
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

public class SeatmapSeatProperties  {
  
  @ApiModelProperty(value = "Cabin of the seat, in single letter format e.g. \"Y\"")
 /**
   * Cabin of the seat, in single letter format e.g. \"Y\"
  **/
  private String cabin = null;

  @ApiModelProperty(value = "Concatenation of the row id and the column id, for example 12B")
 /**
   * Concatenation of the row id and the column id, for example 12B
  **/
  private String seatNumber = null;

  @ApiModelProperty(value = "List of seat characteristics (the value is a value that can be retrieved in the seat characteristic dictionary). List of seat characteristics at seat level will be returned when no specific travelers are specified for the seatmap computation, otherwise the characteristics will be specified for each traveler.")
 /**
   * List of seat characteristics (the value is a value that can be retrieved in the seat characteristic dictionary). List of seat characteristics at seat level will be returned when no specific travelers are specified for the seatmap computation, otherwise the characteristics will be specified for each traveler.
  **/
  private List<String> seatCharacteristicsCodes = null;

  @ApiModelProperty(value = "Check if an infant is seating on this seat. If the system detects there is no infant, value is false. If information is unknown, the node is not present (isInfantOnSeat not returned or null)")
 /**
   * Check if an infant is seating on this seat. If the system detects there is no infant, value is false. If information is unknown, the node is not present (isInfantOnSeat not returned or null)
  **/
  private Boolean isInfantOnSeat = null;


@XmlType(name="SeatAvailabilityStatusEnum")
@XmlEnum(String.class)
public enum SeatAvailabilityStatusEnum {

@XmlEnumValue("available") AVAILABLE(String.valueOf("available")), @XmlEnumValue("blocked") BLOCKED(String.valueOf("blocked")), @XmlEnumValue("occupied") OCCUPIED(String.valueOf("occupied"));


    private String value;

    SeatAvailabilityStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SeatAvailabilityStatusEnum fromValue(String v) {
        for (SeatAvailabilityStatusEnum b : SeatAvailabilityStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Availability status based on seat occupation and traveler information. Most permissive availability is computed for multiple travelers Availability status at seat level will be returned when no specific travelers are specified for the seatmap computation, otherwise the availability will be specified for each traveler.")
 /**
   * Availability status based on seat occupation and traveler information. Most permissive availability is computed for multiple travelers Availability status at seat level will be returned when no specific travelers are specified for the seatmap computation, otherwise the availability will be specified for each traveler.
  **/
  private SeatAvailabilityStatusEnum seatAvailabilityStatus = null;

  @ApiModelProperty(value = "Traveler's seat information and price")
 /**
   * Traveler's seat information and price
  **/
  private List<SeatmapTravelerSeatInfo> travelers = null;

  @ApiModelProperty(value = "Please refer to block section, with number of oxygen seats")
 /**
   * Please refer to block section, with number of oxygen seats
  **/
  private String blockId = null;

  @ApiModelProperty(value = "Tells whether seat can be exchangeable, refundable or commissionable")
 /**
   * Tells whether seat can be exchangeable, refundable or commissionable
  **/
  private String seatType = null;

  @ApiModelProperty(value = "")
  private SeatmapCoordinates coordinates = null;
 /**
   * Cabin of the seat, in single letter format e.g. \&quot;Y\&quot;
   * @return cabin
  **/
  @JsonProperty("cabin")
  public String getCabin() {
    return cabin;
  }

  public void setCabin(String cabin) {
    this.cabin = cabin;
  }

  public SeatmapSeatProperties cabin(String cabin) {
    this.cabin = cabin;
    return this;
  }

 /**
   * Concatenation of the row id and the column id, for example 12B
   * @return seatNumber
  **/
  @JsonProperty("seatNumber")
  public String getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }

  public SeatmapSeatProperties seatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

 /**
   * List of seat characteristics (the value is a value that can be retrieved in the seat characteristic dictionary). List of seat characteristics at seat level will be returned when no specific travelers are specified for the seatmap computation, otherwise the characteristics will be specified for each traveler.
   * @return seatCharacteristicsCodes
  **/
  @JsonProperty("seatCharacteristicsCodes")
  public List<String> getSeatCharacteristicsCodes() {
    return seatCharacteristicsCodes;
  }

  public void setSeatCharacteristicsCodes(List<String> seatCharacteristicsCodes) {
    this.seatCharacteristicsCodes = seatCharacteristicsCodes;
  }

  public SeatmapSeatProperties seatCharacteristicsCodes(List<String> seatCharacteristicsCodes) {
    this.seatCharacteristicsCodes = seatCharacteristicsCodes;
    return this;
  }

  public SeatmapSeatProperties addSeatCharacteristicsCodesItem(String seatCharacteristicsCodesItem) {
    this.seatCharacteristicsCodes.add(seatCharacteristicsCodesItem);
    return this;
  }

 /**
   * Check if an infant is seating on this seat. If the system detects there is no infant, value is false. If information is unknown, the node is not present (isInfantOnSeat not returned or null)
   * @return isInfantOnSeat
  **/
  @JsonProperty("isInfantOnSeat")
  public Boolean isIsInfantOnSeat() {
    return isInfantOnSeat;
  }

  public void setIsInfantOnSeat(Boolean isInfantOnSeat) {
    this.isInfantOnSeat = isInfantOnSeat;
  }

  public SeatmapSeatProperties isInfantOnSeat(Boolean isInfantOnSeat) {
    this.isInfantOnSeat = isInfantOnSeat;
    return this;
  }

 /**
   * Availability status based on seat occupation and traveler information. Most permissive availability is computed for multiple travelers Availability status at seat level will be returned when no specific travelers are specified for the seatmap computation, otherwise the availability will be specified for each traveler.
   * @return seatAvailabilityStatus
  **/
  @JsonProperty("seatAvailabilityStatus")
  public String getSeatAvailabilityStatus() {
    if (seatAvailabilityStatus == null) {
      return null;
    }
    return seatAvailabilityStatus.value();
  }

  public void setSeatAvailabilityStatus(SeatAvailabilityStatusEnum seatAvailabilityStatus) {
    this.seatAvailabilityStatus = seatAvailabilityStatus;
  }

  public SeatmapSeatProperties seatAvailabilityStatus(SeatAvailabilityStatusEnum seatAvailabilityStatus) {
    this.seatAvailabilityStatus = seatAvailabilityStatus;
    return this;
  }

 /**
   * Traveler&#39;s seat information and price
   * @return travelers
  **/
  @JsonProperty("travelers")
  public List<SeatmapTravelerSeatInfo> getTravelers() {
    return travelers;
  }

  public void setTravelers(List<SeatmapTravelerSeatInfo> travelers) {
    this.travelers = travelers;
  }

  public SeatmapSeatProperties travelers(List<SeatmapTravelerSeatInfo> travelers) {
    this.travelers = travelers;
    return this;
  }

  public SeatmapSeatProperties addTravelersItem(SeatmapTravelerSeatInfo travelersItem) {
    this.travelers.add(travelersItem);
    return this;
  }

 /**
   * Please refer to block section, with number of oxygen seats
   * @return blockId
  **/
  @JsonProperty("blockId")
  public String getBlockId() {
    return blockId;
  }

  public void setBlockId(String blockId) {
    this.blockId = blockId;
  }

  public SeatmapSeatProperties blockId(String blockId) {
    this.blockId = blockId;
    return this;
  }

 /**
   * Tells whether seat can be exchangeable, refundable or commissionable
   * @return seatType
  **/
  @JsonProperty("seatType")
  public String getSeatType() {
    return seatType;
  }

  public void setSeatType(String seatType) {
    this.seatType = seatType;
  }

  public SeatmapSeatProperties seatType(String seatType) {
    this.seatType = seatType;
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

  public SeatmapSeatProperties coordinates(SeatmapCoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapSeatProperties {\n");
    
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("    seatCharacteristicsCodes: ").append(toIndentedString(seatCharacteristicsCodes)).append("\n");
    sb.append("    isInfantOnSeat: ").append(toIndentedString(isInfantOnSeat)).append("\n");
    sb.append("    seatAvailabilityStatus: ").append(toIndentedString(seatAvailabilityStatus)).append("\n");
    sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    seatType: ").append(toIndentedString(seatType)).append("\n");
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

