package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import io.swagger.annotations.ApiModel;
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

/**
  * Unpaid baggage of one type associated to a journey for one traveler
 **/
@ApiModel(description="Unpaid baggage of one type associated to a journey for one traveler")
public class JourneyUnpaidBaggageItem  {
  
  @ApiModelProperty(required = true, value = "Traveler to whom this baggage is associated")
 /**
   * Traveler to whom this baggage is associated
  **/
  private String travelerId = null;

  @ApiModelProperty(required = true, value = "Quantity of unpaid baggage (in kg or pieces, see quantityUnit)")
 /**
   * Quantity of unpaid baggage (in kg or pieces, see quantityUnit)
  **/
  private Integer quantity = null;


@XmlType(name="QuantityUnitEnum")
@XmlEnum(String.class)
public enum QuantityUnitEnum {

@XmlEnumValue("pieces") PIECES(String.valueOf("pieces")), @XmlEnumValue("kg") KG(String.valueOf("kg"));


    private String value;

    QuantityUnitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static QuantityUnitEnum fromValue(String v) {
        for (QuantityUnitEnum b : QuantityUnitEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Unit of the quantity")
 /**
   * Unit of the quantity
  **/
  private QuantityUnitEnum quantityUnit = null;

  @ApiModelProperty(required = true, value = "Either \"ExcessBaggage\" for generic excess or if the baggage is of special type, its type as filed by the airline.")
 /**
   * Either \"ExcessBaggage\" for generic excess or if the baggage is of special type, its type as filed by the airline.
  **/
  private String baggageType = null;

  @ApiModelProperty(required = true, value = "Flights on which this baggage is booked")
 /**
   * Flights on which this baggage is booked
  **/
  private List<String> flightIds = new ArrayList<>();

  @ApiModelProperty(required = true, value = "Total price of this set of unpaid baggage")
 /**
   * Total price of this set of unpaid baggage
  **/
  private Amount amount = null;
 /**
   * Traveler to whom this baggage is associated
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public JourneyUnpaidBaggageItem travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * Quantity of unpaid baggage (in kg or pieces, see quantityUnit)
   * minimum: 0
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public JourneyUnpaidBaggageItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Unit of the quantity
   * @return quantityUnit
  **/
  @JsonProperty("quantityUnit")
  public String getQuantityUnit() {
    if (quantityUnit == null) {
      return null;
    }
    return quantityUnit.value();
  }

  public void setQuantityUnit(QuantityUnitEnum quantityUnit) {
    this.quantityUnit = quantityUnit;
  }

  public JourneyUnpaidBaggageItem quantityUnit(QuantityUnitEnum quantityUnit) {
    this.quantityUnit = quantityUnit;
    return this;
  }

 /**
   * Either \&quot;ExcessBaggage\&quot; for generic excess or if the baggage is of special type, its type as filed by the airline.
   * @return baggageType
  **/
  @JsonProperty("baggageType")
  public String getBaggageType() {
    return baggageType;
  }

  public void setBaggageType(String baggageType) {
    this.baggageType = baggageType;
  }

  public JourneyUnpaidBaggageItem baggageType(String baggageType) {
    this.baggageType = baggageType;
    return this;
  }

 /**
   * Flights on which this baggage is booked
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public JourneyUnpaidBaggageItem flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public JourneyUnpaidBaggageItem addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * Total price of this set of unpaid baggage
   * @return amount
  **/
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public JourneyUnpaidBaggageItem amount(Amount amount) {
    this.amount = amount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyUnpaidBaggageItem {\n");
    
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityUnit: ").append(toIndentedString(quantityUnit)).append("\n");
    sb.append("    baggageType: ").append(toIndentedString(baggageType)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

