package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarAdditionalOptions;
import com.koreanair.external.dx.vo.CarCommon;
import com.koreanair.external.dx.vo.CarPricingRecords;
import com.koreanair.external.dx.vo.CarRateDetails;
import com.koreanair.external.dx.vo.CarRateRanking;
import com.koreanair.external.dx.vo.LoyaltyNumbersItem;
import com.koreanair.external.dx.vo.Vehicle;
import io.swagger.annotations.ApiModel;
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

/**
  * Object containing the information related to a car offer. Not all fields are necessarily returned: an additional call to /search/car-offers/{carOfferId} might be needed to get an exhaustive set of data
 **/
@ApiModel(description="Object containing the information related to a car offer. Not all fields are necessarily returned: an additional call to /search/car-offers/{carOfferId} might be needed to get an exhaustive set of data")
public class CarOffer  {
  
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

  @ApiModelProperty(required = true, value = "Unique id representating a car offer")
 /**
   * Unique id representating a car offer
  **/
  private String id = null;
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

  public CarOffer ranking(CarRateRanking ranking) {
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

  public CarOffer companyId(String companyId) {
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

  public CarOffer pickUpLocationId(String pickUpLocationId) {
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

  public CarOffer dropOffLocationId(String dropOffLocationId) {
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

  public CarOffer pickUpDateTime(LocalDateTime pickUpDateTime) {
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

  public CarOffer dropOffDateTime(LocalDateTime dropOffDateTime) {
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

  public CarOffer vehicle(Vehicle vehicle) {
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

  public CarOffer prices(CarPricingRecords prices) {
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

  public CarOffer bookableOptions(CarAdditionalOptions bookableOptions) {
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

  public CarOffer loyaltyNumbers(List<LoyaltyNumbersItem> loyaltyNumbers) {
    this.loyaltyNumbers = loyaltyNumbers;
    return this;
  }

  public CarOffer addLoyaltyNumbersItem(LoyaltyNumbersItem loyaltyNumbersItem) {
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

  public CarOffer rateDetails(CarRateDetails rateDetails) {
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

  public CarOffer bookingAgency(String bookingAgency) {
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

  public CarOffer remarkText(String remarkText) {
    this.remarkText = remarkText;
    return this;
  }

 /**
   * Unique id representating a car offer
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CarOffer id(String id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarOffer {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

