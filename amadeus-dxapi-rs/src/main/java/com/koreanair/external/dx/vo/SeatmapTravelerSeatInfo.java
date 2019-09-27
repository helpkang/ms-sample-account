package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Price;
import com.koreanair.external.dx.vo.RichMedia;
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

public class SeatmapTravelerSeatInfo  {
  
  @ApiModelProperty(value = "Traveler id (anonymous or known). In case of a stand-alone seatmap transaction or a seatmap transaction based on a cart that does not contain travelers, travelers id is defined in anonymousTraveler dictionary. Otherwise traveler id is defined in Cart or Order")
 /**
   * Traveler id (anonymous or known). In case of a stand-alone seatmap transaction or a seatmap transaction based on a cart that does not contain travelers, travelers id is defined in anonymousTraveler dictionary. Otherwise traveler id is defined in Cart or Order
  **/
  private String id = null;

  @ApiModelProperty(example = "PAX1", value = "Temporary id used to map travelers in the response with the travelers in the request. Only valid the time of the transaction")
 /**
   * Temporary id used to map travelers in the response with the travelers in the request. Only valid the time of the transaction
  **/
  private String tid = null;

  @ApiModelProperty(value = "List of seat characteristics for the current traveler (the characteristic's descriptions can be retrieved in the seat characteristic dictionary)")
 /**
   * List of seat characteristics for the current traveler (the characteristic's descriptions can be retrieved in the seat characteristic dictionary)
  **/
  private List<String> seatCharacteristicsCodes = null;


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

  @ApiModelProperty(value = "Seat availability for this specific traveler. Allows better seat choice per traveler")
 /**
   * Seat availability for this specific traveler. Allows better seat choice per traveler
  **/
  private SeatAvailabilityStatusEnum seatAvailabilityStatus = null;

  @ApiModelProperty(value = "Price for a given seat")
 /**
   * Price for a given seat
  **/
  private List<Price> prices = null;

  @ApiModelProperty(value = "List of media associated to the seat")
 /**
   * List of media associated to the seat
  **/
  private List<RichMedia> media = null;

  @ApiModelProperty(value = "If true, the seat is exempted")
 /**
   * If true, the seat is exempted
  **/
  private Boolean isExempted = null;
 /**
   * Traveler id (anonymous or known). In case of a stand-alone seatmap transaction or a seatmap transaction based on a cart that does not contain travelers, travelers id is defined in anonymousTraveler dictionary. Otherwise traveler id is defined in Cart or Order
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SeatmapTravelerSeatInfo id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id used to map travelers in the response with the travelers in the request. Only valid the time of the transaction
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public SeatmapTravelerSeatInfo tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * List of seat characteristics for the current traveler (the characteristic&#39;s descriptions can be retrieved in the seat characteristic dictionary)
   * @return seatCharacteristicsCodes
  **/
  @JsonProperty("seatCharacteristicsCodes")
  public List<String> getSeatCharacteristicsCodes() {
    return seatCharacteristicsCodes;
  }

  public void setSeatCharacteristicsCodes(List<String> seatCharacteristicsCodes) {
    this.seatCharacteristicsCodes = seatCharacteristicsCodes;
  }

  public SeatmapTravelerSeatInfo seatCharacteristicsCodes(List<String> seatCharacteristicsCodes) {
    this.seatCharacteristicsCodes = seatCharacteristicsCodes;
    return this;
  }

  public SeatmapTravelerSeatInfo addSeatCharacteristicsCodesItem(String seatCharacteristicsCodesItem) {
    this.seatCharacteristicsCodes.add(seatCharacteristicsCodesItem);
    return this;
  }

 /**
   * Seat availability for this specific traveler. Allows better seat choice per traveler
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

  public SeatmapTravelerSeatInfo seatAvailabilityStatus(SeatAvailabilityStatusEnum seatAvailabilityStatus) {
    this.seatAvailabilityStatus = seatAvailabilityStatus;
    return this;
  }

 /**
   * Price for a given seat
   * @return prices
  **/
  @JsonProperty("prices")
  public List<Price> getPrices() {
    return prices;
  }

  public void setPrices(List<Price> prices) {
    this.prices = prices;
  }

  public SeatmapTravelerSeatInfo prices(List<Price> prices) {
    this.prices = prices;
    return this;
  }

  public SeatmapTravelerSeatInfo addPricesItem(Price pricesItem) {
    this.prices.add(pricesItem);
    return this;
  }

 /**
   * List of media associated to the seat
   * @return media
  **/
  @JsonProperty("media")
  public List<RichMedia> getMedia() {
    return media;
  }

  public void setMedia(List<RichMedia> media) {
    this.media = media;
  }

  public SeatmapTravelerSeatInfo media(List<RichMedia> media) {
    this.media = media;
    return this;
  }

  public SeatmapTravelerSeatInfo addMediaItem(RichMedia mediaItem) {
    this.media.add(mediaItem);
    return this;
  }

 /**
   * If true, the seat is exempted
   * @return isExempted
  **/
  @JsonProperty("isExempted")
  public Boolean isIsExempted() {
    return isExempted;
  }

  public void setIsExempted(Boolean isExempted) {
    this.isExempted = isExempted;
  }

  public SeatmapTravelerSeatInfo isExempted(Boolean isExempted) {
    this.isExempted = isExempted;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapTravelerSeatInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    seatCharacteristicsCodes: ").append(toIndentedString(seatCharacteristicsCodes)).append("\n");
    sb.append("    seatAvailabilityStatus: ").append(toIndentedString(seatAvailabilityStatus)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    isExempted: ").append(toIndentedString(isExempted)).append("\n");
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

