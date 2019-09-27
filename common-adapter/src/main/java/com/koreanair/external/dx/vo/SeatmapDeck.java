package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SeatmapBlock;
import com.koreanair.external.dx.vo.SeatmapDeckDimensions;
import com.koreanair.external.dx.vo.SeatmapFacility;
import com.koreanair.external.dx.vo.SeatmapFirstAvailableSeat;
import com.koreanair.external.dx.vo.SeatmapSeatProperties;
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

public class SeatmapDeck  {
  

@XmlType(name="DeckTypeEnum")
@XmlEnum(String.class)
public enum DeckTypeEnum {

@XmlEnumValue("upper") UPPER(String.valueOf("upper")), @XmlEnumValue("main") MAIN(String.valueOf("main"));


    private String value;

    DeckTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DeckTypeEnum fromValue(String v) {
        for (DeckTypeEnum b : DeckTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "A deck is a level on an aircraft. The deck location of the cabin (current possible values are upper or main) The main deck, where passengers are seated on a passenger flight. Upper deck is above the main deck where more passengers are seated.")
 /**
   * A deck is a level on an aircraft. The deck location of the cabin (current possible values are upper or main) The main deck, where passengers are seated on a passenger flight. Upper deck is above the main deck where more passengers are seated.
  **/
  private DeckTypeEnum deckType = null;

  @ApiModelProperty(value = "")
  private SeatmapDeckDimensions deckDimensions = null;

  @ApiModelProperty(value = "")
  private List<SeatmapBlock> blocks = null;

  @ApiModelProperty(value = "")
  private SeatmapFirstAvailableSeat firstAvailableSeat = null;

  @ApiModelProperty(value = "Information regarding the cheapest available seat on a given deck (cabin dependent)")
 /**
   * Information regarding the cheapest available seat on a given deck (cabin dependent)
  **/
  private SeatmapSeatProperties cheapestSeat = null;

  @ApiModelProperty(value = "")
  private List<SeatmapFacility> facilities = null;

  @ApiModelProperty(value = "")
  private List<SeatmapSeatProperties> seats = null;
 /**
   * A deck is a level on an aircraft. The deck location of the cabin (current possible values are upper or main) The main deck, where passengers are seated on a passenger flight. Upper deck is above the main deck where more passengers are seated.
   * @return deckType
  **/
  @JsonProperty("deckType")
  public String getDeckType() {
    if (deckType == null) {
      return null;
    }
    return deckType.value();
  }

  public void setDeckType(DeckTypeEnum deckType) {
    this.deckType = deckType;
  }

  public SeatmapDeck deckType(DeckTypeEnum deckType) {
    this.deckType = deckType;
    return this;
  }

 /**
   * Get deckDimensions
   * @return deckDimensions
  **/
  @JsonProperty("deckDimensions")
  public SeatmapDeckDimensions getDeckDimensions() {
    return deckDimensions;
  }

  public void setDeckDimensions(SeatmapDeckDimensions deckDimensions) {
    this.deckDimensions = deckDimensions;
  }

  public SeatmapDeck deckDimensions(SeatmapDeckDimensions deckDimensions) {
    this.deckDimensions = deckDimensions;
    return this;
  }

 /**
   * Get blocks
   * @return blocks
  **/
  @JsonProperty("blocks")
  public List<SeatmapBlock> getBlocks() {
    return blocks;
  }

  public void setBlocks(List<SeatmapBlock> blocks) {
    this.blocks = blocks;
  }

  public SeatmapDeck blocks(List<SeatmapBlock> blocks) {
    this.blocks = blocks;
    return this;
  }

  public SeatmapDeck addBlocksItem(SeatmapBlock blocksItem) {
    this.blocks.add(blocksItem);
    return this;
  }

 /**
   * Get firstAvailableSeat
   * @return firstAvailableSeat
  **/
  @JsonProperty("firstAvailableSeat")
  public SeatmapFirstAvailableSeat getFirstAvailableSeat() {
    return firstAvailableSeat;
  }

  public void setFirstAvailableSeat(SeatmapFirstAvailableSeat firstAvailableSeat) {
    this.firstAvailableSeat = firstAvailableSeat;
  }

  public SeatmapDeck firstAvailableSeat(SeatmapFirstAvailableSeat firstAvailableSeat) {
    this.firstAvailableSeat = firstAvailableSeat;
    return this;
  }

 /**
   * Information regarding the cheapest available seat on a given deck (cabin dependent)
   * @return cheapestSeat
  **/
  @JsonProperty("cheapestSeat")
  public SeatmapSeatProperties getCheapestSeat() {
    return cheapestSeat;
  }

  public void setCheapestSeat(SeatmapSeatProperties cheapestSeat) {
    this.cheapestSeat = cheapestSeat;
  }

  public SeatmapDeck cheapestSeat(SeatmapSeatProperties cheapestSeat) {
    this.cheapestSeat = cheapestSeat;
    return this;
  }

 /**
   * Get facilities
   * @return facilities
  **/
  @JsonProperty("facilities")
  public List<SeatmapFacility> getFacilities() {
    return facilities;
  }

  public void setFacilities(List<SeatmapFacility> facilities) {
    this.facilities = facilities;
  }

  public SeatmapDeck facilities(List<SeatmapFacility> facilities) {
    this.facilities = facilities;
    return this;
  }

  public SeatmapDeck addFacilitiesItem(SeatmapFacility facilitiesItem) {
    this.facilities.add(facilitiesItem);
    return this;
  }

 /**
   * Get seats
   * @return seats
  **/
  @JsonProperty("seats")
  public List<SeatmapSeatProperties> getSeats() {
    return seats;
  }

  public void setSeats(List<SeatmapSeatProperties> seats) {
    this.seats = seats;
  }

  public SeatmapDeck seats(List<SeatmapSeatProperties> seats) {
    this.seats = seats;
    return this;
  }

  public SeatmapDeck addSeatsItem(SeatmapSeatProperties seatsItem) {
    this.seats.add(seatsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapDeck {\n");
    
    sb.append("    deckType: ").append(toIndentedString(deckType)).append("\n");
    sb.append("    deckDimensions: ").append(toIndentedString(deckDimensions)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    firstAvailableSeat: ").append(toIndentedString(firstAvailableSeat)).append("\n");
    sb.append("    cheapestSeat: ").append(toIndentedString(cheapestSeat)).append("\n");
    sb.append("    facilities: ").append(toIndentedString(facilities)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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

