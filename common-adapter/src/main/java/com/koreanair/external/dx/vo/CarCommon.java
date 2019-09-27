package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarAdditionalOptions;
import com.koreanair.external.dx.vo.CarPricingRecords;
import com.koreanair.external.dx.vo.CarRateDetails;
import com.koreanair.external.dx.vo.CarRateRanking;
import com.koreanair.external.dx.vo.LoyaltyNumbersItem;
import com.koreanair.external.dx.vo.Vehicle;
import java.time.LocalDateTime;
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

public class CarCommon  {
  
  @ApiModelProperty(value = "Conveys the order of the rate only supported by RentalCars (RS).")
 /**
   * Conveys the order of the rate only supported by RentalCars (RS).
  **/
  private CarRateRanking ranking = null;

  @ApiModelProperty(required = true, value = "Id of the car company.")
 /**
   * Id of the car company.
  **/
  private String companyId = null;

  @ApiModelProperty(required = true, value = "Id of the pick-up location whish is defined in the car location dictionary.")
 /**
   * Id of the pick-up location whish is defined in the car location dictionary.
  **/
  private String pickUpLocationId = null;

  @ApiModelProperty(value = "Id of the drop-off location whish is defined in the car location dictionary.")
 /**
   * Id of the drop-off location whish is defined in the car location dictionary.
  **/
  private String dropOffLocationId = null;

  @ApiModelProperty(required = true, value = "Pick-up date and time.")
 /**
   * Pick-up date and time.
  **/
  private LocalDateTime pickUpDateTime = null;

  @ApiModelProperty(required = true, value = "Drop-off date and time.")
 /**
   * Drop-off date and time.
  **/
  private LocalDateTime dropOffDateTime = null;

  @ApiModelProperty(required = true, value = "all information related to the vehicle (baggage capacity, number of doors, type...).")
 /**
   * all information related to the vehicle (baggage capacity, number of doors, type...).
  **/
  private Vehicle vehicle = null;

  @ApiModelProperty(required = true, value = "all price information related to the rate (base, total, and amounts to be paid now or later).")
 /**
   * all price information related to the rate (base, total, and amounts to be paid now or later).
  **/
  private CarPricingRecords prices = null;

  @ApiModelProperty(value = "Option(s) available with this offers")
 /**
   * Option(s) available with this offers
  **/
  private CarAdditionalOptions bookableOptions = null;

  @ApiModelProperty(value = "Loyalty numbers used for this offer.")
 /**
   * Loyalty numbers used for this offer.
  **/
  private List<LoyaltyNumbersItem> loyaltyNumbers = null;

  @ApiModelProperty(required = true, value = "")
  private CarRateDetails rateDetails = null;

  @ApiModelProperty(value = "Booking agency number used for this offer")
 /**
   * Booking agency number used for this offer
  **/
  private String bookingAgency = null;

  @ApiModelProperty(value = "Any additional remark text")
 /**
   * Any additional remark text
  **/
  private String remarkText = null;
 /**
   * Conveys the order of the rate only supported by RentalCars (RS).
   * @return ranking
  **/
  @JsonProperty("ranking")
  public CarRateRanking getRanking() {
    return ranking;
  }

  public void setRanking(CarRateRanking ranking) {
    this.ranking = ranking;
  }

  public CarCommon ranking(CarRateRanking ranking) {
    this.ranking = ranking;
    return this;
  }

 /**
   * Id of the car company.
   * @return companyId
  **/
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public CarCommon companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

 /**
   * Id of the pick-up location whish is defined in the car location dictionary.
   * @return pickUpLocationId
  **/
  @JsonProperty("pickUpLocationId")
  public String getPickUpLocationId() {
    return pickUpLocationId;
  }

  public void setPickUpLocationId(String pickUpLocationId) {
    this.pickUpLocationId = pickUpLocationId;
  }

  public CarCommon pickUpLocationId(String pickUpLocationId) {
    this.pickUpLocationId = pickUpLocationId;
    return this;
  }

 /**
   * Id of the drop-off location whish is defined in the car location dictionary.
   * @return dropOffLocationId
  **/
  @JsonProperty("dropOffLocationId")
  public String getDropOffLocationId() {
    return dropOffLocationId;
  }

  public void setDropOffLocationId(String dropOffLocationId) {
    this.dropOffLocationId = dropOffLocationId;
  }

  public CarCommon dropOffLocationId(String dropOffLocationId) {
    this.dropOffLocationId = dropOffLocationId;
    return this;
  }

 /**
   * Pick-up date and time.
   * @return pickUpDateTime
  **/
  @JsonProperty("pickUpDateTime")
  public LocalDateTime getPickUpDateTime() {
    return pickUpDateTime;
  }

  public void setPickUpDateTime(LocalDateTime pickUpDateTime) {
    this.pickUpDateTime = pickUpDateTime;
  }

  public CarCommon pickUpDateTime(LocalDateTime pickUpDateTime) {
    this.pickUpDateTime = pickUpDateTime;
    return this;
  }

 /**
   * Drop-off date and time.
   * @return dropOffDateTime
  **/
  @JsonProperty("dropOffDateTime")
  public LocalDateTime getDropOffDateTime() {
    return dropOffDateTime;
  }

  public void setDropOffDateTime(LocalDateTime dropOffDateTime) {
    this.dropOffDateTime = dropOffDateTime;
  }

  public CarCommon dropOffDateTime(LocalDateTime dropOffDateTime) {
    this.dropOffDateTime = dropOffDateTime;
    return this;
  }

 /**
   * all information related to the vehicle (baggage capacity, number of doors, type...).
   * @return vehicle
  **/
  @JsonProperty("vehicle")
  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public CarCommon vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

 /**
   * all price information related to the rate (base, total, and amounts to be paid now or later).
   * @return prices
  **/
  @JsonProperty("prices")
  public CarPricingRecords getPrices() {
    return prices;
  }

  public void setPrices(CarPricingRecords prices) {
    this.prices = prices;
  }

  public CarCommon prices(CarPricingRecords prices) {
    this.prices = prices;
    return this;
  }

 /**
   * Option(s) available with this offers
   * @return bookableOptions
  **/
  @JsonProperty("bookableOptions")
  public CarAdditionalOptions getBookableOptions() {
    return bookableOptions;
  }

  public void setBookableOptions(CarAdditionalOptions bookableOptions) {
    this.bookableOptions = bookableOptions;
  }

  public CarCommon bookableOptions(CarAdditionalOptions bookableOptions) {
    this.bookableOptions = bookableOptions;
    return this;
  }

 /**
   * Loyalty numbers used for this offer.
   * @return loyaltyNumbers
  **/
  @JsonProperty("loyaltyNumbers")
  public List<LoyaltyNumbersItem> getLoyaltyNumbers() {
    return loyaltyNumbers;
  }

  public void setLoyaltyNumbers(List<LoyaltyNumbersItem> loyaltyNumbers) {
    this.loyaltyNumbers = loyaltyNumbers;
  }

  public CarCommon loyaltyNumbers(List<LoyaltyNumbersItem> loyaltyNumbers) {
    this.loyaltyNumbers = loyaltyNumbers;
    return this;
  }

  public CarCommon addLoyaltyNumbersItem(LoyaltyNumbersItem loyaltyNumbersItem) {
    this.loyaltyNumbers.add(loyaltyNumbersItem);
    return this;
  }

 /**
   * Get rateDetails
   * @return rateDetails
  **/
  @JsonProperty("rateDetails")
  public CarRateDetails getRateDetails() {
    return rateDetails;
  }

  public void setRateDetails(CarRateDetails rateDetails) {
    this.rateDetails = rateDetails;
  }

  public CarCommon rateDetails(CarRateDetails rateDetails) {
    this.rateDetails = rateDetails;
    return this;
  }

 /**
   * Booking agency number used for this offer
   * @return bookingAgency
  **/
  @JsonProperty("bookingAgency")
  public String getBookingAgency() {
    return bookingAgency;
  }

  public void setBookingAgency(String bookingAgency) {
    this.bookingAgency = bookingAgency;
  }

  public CarCommon bookingAgency(String bookingAgency) {
    this.bookingAgency = bookingAgency;
    return this;
  }

 /**
   * Any additional remark text
   * @return remarkText
  **/
  @JsonProperty("remarkText")
  public String getRemarkText() {
    return remarkText;
  }

  public void setRemarkText(String remarkText) {
    this.remarkText = remarkText;
  }

  public CarCommon remarkText(String remarkText) {
    this.remarkText = remarkText;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarCommon {\n");
    
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    pickUpLocationId: ").append(toIndentedString(pickUpLocationId)).append("\n");
    sb.append("    dropOffLocationId: ").append(toIndentedString(dropOffLocationId)).append("\n");
    sb.append("    pickUpDateTime: ").append(toIndentedString(pickUpDateTime)).append("\n");
    sb.append("    dropOffDateTime: ").append(toIndentedString(dropOffDateTime)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    bookableOptions: ").append(toIndentedString(bookableOptions)).append("\n");
    sb.append("    loyaltyNumbers: ").append(toIndentedString(loyaltyNumbers)).append("\n");
    sb.append("    rateDetails: ").append(toIndentedString(rateDetails)).append("\n");
    sb.append("    bookingAgency: ").append(toIndentedString(bookingAgency)).append("\n");
    sb.append("    remarkText: ").append(toIndentedString(remarkText)).append("\n");
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

