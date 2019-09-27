package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Address;
import com.koreanair.external.dx.vo.HotelContact;
import com.koreanair.external.dx.vo.MediaUri;
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
  * Hotel related information to be stored in the cart when using the entry point POST /carts/{cartId}/hotel-offers/by-input 
 **/
@ApiModel(description="Hotel related information to be stored in the cart when using the entry point POST /carts/{cartId}/hotel-offers/by-input ")
public class HotelRequest  {
  
  @ApiModelProperty(required = true, value = "Identifier of the accomodation")
 /**
   * Identifier of the accomodation
  **/
  private String hotelId = null;

  @ApiModelProperty(required = true, value = "Check-in date of the accomodation rental Format: YYYY-MM-DD ")
 /**
   * Check-in date of the accomodation rental Format: YYYY-MM-DD 
  **/
  private LocalDate checkInDate = null;

  @ApiModelProperty(required = true, value = "Check-out date of the accomodation rental Format: YYYY-MM-DD ")
 /**
   * Check-out date of the accomodation rental Format: YYYY-MM-DD 
  **/
  private LocalDate checkOutDate = null;

  @ApiModelProperty(required = true, value = "Accomodation name")
 /**
   * Accomodation name
  **/
  private String name = null;

  @ApiModelProperty(value = "Accomodation rating")
 /**
   * Accomodation rating
  **/
  private String rating = null;

  @ApiModelProperty(value = "Textual description for the accomodation")
 /**
   * Textual description for the accomodation
  **/
  private String description = null;

  @ApiModelProperty(value = "List of amenities offered by the accomodation")
 /**
   * List of amenities offered by the accomodation
  **/
  private List<String> amenities = null;

  @ApiModelProperty(value = "List of media associated to the accomodation")
 /**
   * List of media associated to the accomodation
  **/
  private List<MediaUri> media = null;

  @ApiModelProperty(value = "The IATA city code associated to the accomodation")
 /**
   * The IATA city code associated to the accomodation
  **/
  private String cityCode = null;

  @ApiModelProperty(value = "Latitude of the accomodation (5 decimals)")
 /**
   * Latitude of the accomodation (5 decimals)
  **/
  private Double latitude = null;

  @ApiModelProperty(value = "Longitude of the accomodation (5 decimals)")
 /**
   * Longitude of the accomodation (5 decimals)
  **/
  private Double longitude = null;

  @ApiModelProperty(value = "Address of the accomocation")
 /**
   * Address of the accomocation
  **/
  private Address address = null;

  @ApiModelProperty(value = "Contact information (phone, email) for the accomodation")
 /**
   * Contact information (phone, email) for the accomodation
  **/
  private HotelContact contact = null;
 /**
   * Identifier of the accomodation
   * @return hotelId
  **/
  @JsonProperty("hotelId")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public HotelRequest hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

 /**
   * Check-in date of the accomodation rental Format: YYYY-MM-DD 
   * @return checkInDate
  **/
  @JsonProperty("checkInDate")
  public LocalDate getCheckInDate() {
    return checkInDate;
  }

  public void setCheckInDate(LocalDate checkInDate) {
    this.checkInDate = checkInDate;
  }

  public HotelRequest checkInDate(LocalDate checkInDate) {
    this.checkInDate = checkInDate;
    return this;
  }

 /**
   * Check-out date of the accomodation rental Format: YYYY-MM-DD 
   * @return checkOutDate
  **/
  @JsonProperty("checkOutDate")
  public LocalDate getCheckOutDate() {
    return checkOutDate;
  }

  public void setCheckOutDate(LocalDate checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  public HotelRequest checkOutDate(LocalDate checkOutDate) {
    this.checkOutDate = checkOutDate;
    return this;
  }

 /**
   * Accomodation name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HotelRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Accomodation rating
   * @return rating
  **/
  @JsonProperty("rating")
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public HotelRequest rating(String rating) {
    this.rating = rating;
    return this;
  }

 /**
   * Textual description for the accomodation
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HotelRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
   * List of amenities offered by the accomodation
   * @return amenities
  **/
  @JsonProperty("amenities")
  public List<String> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<String> amenities) {
    this.amenities = amenities;
  }

  public HotelRequest amenities(List<String> amenities) {
    this.amenities = amenities;
    return this;
  }

  public HotelRequest addAmenitiesItem(String amenitiesItem) {
    this.amenities.add(amenitiesItem);
    return this;
  }

 /**
   * List of media associated to the accomodation
   * @return media
  **/
  @JsonProperty("media")
  public List<MediaUri> getMedia() {
    return media;
  }

  public void setMedia(List<MediaUri> media) {
    this.media = media;
  }

  public HotelRequest media(List<MediaUri> media) {
    this.media = media;
    return this;
  }

  public HotelRequest addMediaItem(MediaUri mediaItem) {
    this.media.add(mediaItem);
    return this;
  }

 /**
   * The IATA city code associated to the accomodation
   * @return cityCode
  **/
  @JsonProperty("cityCode")
  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public HotelRequest cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

 /**
   * Latitude of the accomodation (5 decimals)
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public HotelRequest latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Longitude of the accomodation (5 decimals)
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public HotelRequest longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Address of the accomocation
   * @return address
  **/
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public HotelRequest address(Address address) {
    this.address = address;
    return this;
  }

 /**
   * Contact information (phone, email) for the accomodation
   * @return contact
  **/
  @JsonProperty("contact")
  public HotelContact getContact() {
    return contact;
  }

  public void setContact(HotelContact contact) {
    this.contact = contact;
  }

  public HotelRequest contact(HotelContact contact) {
    this.contact = contact;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRequest {\n");
    
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    checkInDate: ").append(toIndentedString(checkInDate)).append("\n");
    sb.append("    checkOutDate: ").append(toIndentedString(checkOutDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amenities: ").append(toIndentedString(amenities)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

