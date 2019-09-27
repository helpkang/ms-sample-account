package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.Provider;
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;
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
  * Set of search criteria applied to generate the recommendation, based on the AAM filing. These information can be re-used to search, in standalone mode, for hotel offers.
 **/
@ApiModel(description="Set of search criteria applied to generate the recommendation, based on the AAM filing. These information can be re-used to search, in standalone mode, for hotel offers.")
public class HotelRelevantCriteria  {
  
  @ApiModelProperty(required = true, value = "Hotel location IATA code")
 /**
   * Hotel location IATA code
  **/
  private String locationCode = null;

  @ApiModelProperty(required = true, value = "Check-in date of the stay. Format YYYY-MM-DD.")
 /**
   * Check-in date of the stay. Format YYYY-MM-DD.
  **/
  private LocalDate checkInDate = null;

  @ApiModelProperty(required = true, value = "Check-out date of the stay. Format YYYY-MM-DD.")
 /**
   * Check-out date of the stay. Format YYYY-MM-DD.
  **/
  private LocalDate checkOutDate = null;

  @ApiModelProperty(value = "Number of rooms requested")
 /**
   * Number of rooms requested
  **/
  private Integer quantity = null;

  @ApiModelProperty(required = true, value = "Number of adults for the stay (1-9).")
 /**
   * Number of adults for the stay (1-9).
  **/
  private Integer adults = null;

  @ApiModelProperty(value = "List of ages of each child for the stay. If 2 children have the same age, it will be repeated here.")
 /**
   * List of ages of each child for the stay. If 2 children have the same age, it will be repeated here.
  **/
  private List<Integer> childAges = null;

  @ApiModelProperty(value = "Name of the hotel")
 /**
   * Name of the hotel
  **/
  private String hotelName = null;

  @ApiModelProperty(value = "List of Amadeus hotel provider to filter the response by.")
 /**
   * List of Amadeus hotel provider to filter the response by.
  **/
  private List<Provider> providers = null;

  @ApiModelProperty(value = "Radius of the area to search.")
 /**
   * Radius of the area to search.
  **/
  private Integer radius = null;


@XmlType(name="RadiusUnitEnum")
@XmlEnum(String.class)
public enum RadiusUnitEnum {

@XmlEnumValue("km") KM(String.valueOf("km")), @XmlEnumValue("mile") MILE(String.valueOf("mile"));


    private String value;

    RadiusUnitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RadiusUnitEnum fromValue(String v) {
        for (RadiusUnitEnum b : RadiusUnitEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Radius unit.")
 /**
   * Radius unit.
  **/
  private RadiusUnitEnum radiusUnit = null;

  @ApiModelProperty(value = "List of hotel star ratings to filter the response by.")
 /**
   * List of hotel star ratings to filter the response by.
  **/
  private List<Integer> ratings = null;

  @ApiModelProperty(value = "Requested maximum price per night.")
 /**
   * Requested maximum price per night.
  **/
  private Amount maxPricePerNight = null;


@XmlType(name="BoardTypeEnum")
@XmlEnum(String.class)
public enum BoardTypeEnum {

@XmlEnumValue("ROOM_ONLY") ROOM_ONLY(String.valueOf("ROOM_ONLY")), @XmlEnumValue("BREAKFAST") BREAKFAST(String.valueOf("BREAKFAST")), @XmlEnumValue("HALF_BOARD") HALF_BOARD(String.valueOf("HALF_BOARD")), @XmlEnumValue("FULL_BOARD") FULL_BOARD(String.valueOf("FULL_BOARD")), @XmlEnumValue("ALL_INCLUSIVE") ALL_INCLUSIVE(String.valueOf("ALL_INCLUSIVE"));


    private String value;

    BoardTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BoardTypeEnum fromValue(String v) {
        for (BoardTypeEnum b : BoardTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Requested board type (meal).")
 /**
   * Requested board type (meal).
  **/
  private BoardTypeEnum boardType = null;


@XmlType(name="AmenitiesEnum")
@XmlEnum(String.class)
public enum AmenitiesEnum {

@XmlEnumValue("SWIMMING_POOL") SWIMMING_POOL(String.valueOf("SWIMMING_POOL")), @XmlEnumValue("RESTAURANT") RESTAURANT(String.valueOf("RESTAURANT")), @XmlEnumValue("SPA") SPA(String.valueOf("SPA")), @XmlEnumValue("PARKING") PARKING(String.valueOf("PARKING")), @XmlEnumValue("FITNESS_CENTER") FITNESS_CENTER(String.valueOf("FITNESS_CENTER")), @XmlEnumValue("AIR_CONDITIONING") AIR_CONDITIONING(String.valueOf("AIR_CONDITIONING")), @XmlEnumValue("AIRPORT_SHUTTLE") AIRPORT_SHUTTLE(String.valueOf("AIRPORT_SHUTTLE")), @XmlEnumValue("PETS_ALLOWED") PETS_ALLOWED(String.valueOf("PETS_ALLOWED")), @XmlEnumValue("BUSINESS_CENTER") BUSINESS_CENTER(String.valueOf("BUSINESS_CENTER")), @XmlEnumValue("DISABLED_FACILITIES") DISABLED_FACILITIES(String.valueOf("DISABLED_FACILITIES")), @XmlEnumValue("WIFI") WIFI(String.valueOf("WIFI"));


    private String value;

    AmenitiesEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AmenitiesEnum fromValue(String v) {
        for (AmenitiesEnum b : AmenitiesEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "List of hotel amenities to filter the search response by.")
 /**
   * List of hotel amenities to filter the search response by.
  **/
  private List<AmenitiesEnum> amenities = null;
 /**
   * Hotel location IATA code
   * @return locationCode
  **/
  @JsonProperty("locationCode")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public HotelRelevantCriteria locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

 /**
   * Check-in date of the stay. Format YYYY-MM-DD.
   * @return checkInDate
  **/
  @JsonProperty("checkInDate")
  public LocalDate getCheckInDate() {
    return checkInDate;
  }

  public void setCheckInDate(LocalDate checkInDate) {
    this.checkInDate = checkInDate;
  }

  public HotelRelevantCriteria checkInDate(LocalDate checkInDate) {
    this.checkInDate = checkInDate;
    return this;
  }

 /**
   * Check-out date of the stay. Format YYYY-MM-DD.
   * @return checkOutDate
  **/
  @JsonProperty("checkOutDate")
  public LocalDate getCheckOutDate() {
    return checkOutDate;
  }

  public void setCheckOutDate(LocalDate checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  public HotelRelevantCriteria checkOutDate(LocalDate checkOutDate) {
    this.checkOutDate = checkOutDate;
    return this;
  }

 /**
   * Number of rooms requested
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public HotelRelevantCriteria quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Number of adults for the stay (1-9).
   * minimum: 1
   * maximum: 9
   * @return adults
  **/
  @JsonProperty("adults")
  public Integer getAdults() {
    return adults;
  }

  public void setAdults(Integer adults) {
    this.adults = adults;
  }

  public HotelRelevantCriteria adults(Integer adults) {
    this.adults = adults;
    return this;
  }

 /**
   * List of ages of each child for the stay. If 2 children have the same age, it will be repeated here.
   * @return childAges
  **/
  @JsonProperty("childAges")
  public List<Integer> getChildAges() {
    return childAges;
  }

  public void setChildAges(List<Integer> childAges) {
    this.childAges = childAges;
  }

  public HotelRelevantCriteria childAges(List<Integer> childAges) {
    this.childAges = childAges;
    return this;
  }

  public HotelRelevantCriteria addChildAgesItem(Integer childAgesItem) {
    this.childAges.add(childAgesItem);
    return this;
  }

 /**
   * Name of the hotel
   * @return hotelName
  **/
  @JsonProperty("hotelName")
  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public HotelRelevantCriteria hotelName(String hotelName) {
    this.hotelName = hotelName;
    return this;
  }

 /**
   * List of Amadeus hotel provider to filter the response by.
   * @return providers
  **/
  @JsonProperty("providers")
  public List<Provider> getProviders() {
    return providers;
  }

  public void setProviders(List<Provider> providers) {
    this.providers = providers;
  }

  public HotelRelevantCriteria providers(List<Provider> providers) {
    this.providers = providers;
    return this;
  }

  public HotelRelevantCriteria addProvidersItem(Provider providersItem) {
    this.providers.add(providersItem);
    return this;
  }

 /**
   * Radius of the area to search.
   * @return radius
  **/
  @JsonProperty("radius")
  public Integer getRadius() {
    return radius;
  }

  public void setRadius(Integer radius) {
    this.radius = radius;
  }

  public HotelRelevantCriteria radius(Integer radius) {
    this.radius = radius;
    return this;
  }

 /**
   * Radius unit.
   * @return radiusUnit
  **/
  @JsonProperty("radiusUnit")
  public String getRadiusUnit() {
    if (radiusUnit == null) {
      return null;
    }
    return radiusUnit.value();
  }

  public void setRadiusUnit(RadiusUnitEnum radiusUnit) {
    this.radiusUnit = radiusUnit;
  }

  public HotelRelevantCriteria radiusUnit(RadiusUnitEnum radiusUnit) {
    this.radiusUnit = radiusUnit;
    return this;
  }

 /**
   * List of hotel star ratings to filter the response by.
   * @return ratings
  **/
  @JsonProperty("ratings")
  public List<Integer> getRatings() {
    return ratings;
  }

  public void setRatings(List<Integer> ratings) {
    this.ratings = ratings;
  }

  public HotelRelevantCriteria ratings(List<Integer> ratings) {
    this.ratings = ratings;
    return this;
  }

  public HotelRelevantCriteria addRatingsItem(Integer ratingsItem) {
    this.ratings.add(ratingsItem);
    return this;
  }

 /**
   * Requested maximum price per night.
   * @return maxPricePerNight
  **/
  @JsonProperty("maxPricePerNight")
  public Amount getMaxPricePerNight() {
    return maxPricePerNight;
  }

  public void setMaxPricePerNight(Amount maxPricePerNight) {
    this.maxPricePerNight = maxPricePerNight;
  }

  public HotelRelevantCriteria maxPricePerNight(Amount maxPricePerNight) {
    this.maxPricePerNight = maxPricePerNight;
    return this;
  }

 /**
   * Requested board type (meal).
   * @return boardType
  **/
  @JsonProperty("boardType")
  public String getBoardType() {
    if (boardType == null) {
      return null;
    }
    return boardType.value();
  }

  public void setBoardType(BoardTypeEnum boardType) {
    this.boardType = boardType;
  }

  public HotelRelevantCriteria boardType(BoardTypeEnum boardType) {
    this.boardType = boardType;
    return this;
  }

 /**
   * List of hotel amenities to filter the search response by.
   * @return amenities
  **/
  @JsonProperty("amenities")
  public List<AmenitiesEnum> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<AmenitiesEnum> amenities) {
    this.amenities = amenities;
  }

  public HotelRelevantCriteria amenities(List<AmenitiesEnum> amenities) {
    this.amenities = amenities;
    return this;
  }

  public HotelRelevantCriteria addAmenitiesItem(AmenitiesEnum amenitiesItem) {
    this.amenities.add(amenitiesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRelevantCriteria {\n");
    
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    checkInDate: ").append(toIndentedString(checkInDate)).append("\n");
    sb.append("    checkOutDate: ").append(toIndentedString(checkOutDate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    childAges: ").append(toIndentedString(childAges)).append("\n");
    sb.append("    hotelName: ").append(toIndentedString(hotelName)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    radiusUnit: ").append(toIndentedString(radiusUnit)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    maxPricePerNight: ").append(toIndentedString(maxPricePerNight)).append("\n");
    sb.append("    boardType: ").append(toIndentedString(boardType)).append("\n");
    sb.append("    amenities: ").append(toIndentedString(amenities)).append("\n");
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

