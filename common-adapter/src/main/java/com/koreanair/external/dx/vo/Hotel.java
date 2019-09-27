package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Address;
import com.koreanair.external.dx.vo.HotelContact;
import com.koreanair.external.dx.vo.HotelDistance;
import com.koreanair.external.dx.vo.MediaUri;
import com.koreanair.external.dx.vo.Provider;
import com.koreanair.external.dx.vo.TextWithLanguageType;
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
  * details for the requested hotel
 **/
@ApiModel(description="details for the requested hotel")
public class Hotel  {
  
  @ApiModelProperty(value = "The type of this data object (hotel by default)")
 /**
   * The type of this data object (hotel by default)
  **/
  private String type = "hotel";

  @ApiModelProperty(value = "Amadeus hotel ID")
 /**
   * Amadeus hotel ID
  **/
  private String hotelId = null;

  @ApiModelProperty(value = "")
  private List<Provider> providers = null;

  @ApiModelProperty(value = "The chain code of the physical hotel Example: XD is the chain code, but the physical hotel is RT (brand code)     ")
 /**
   * The chain code of the physical hotel Example: XD is the chain code, but the physical hotel is RT (brand code)     
  **/
  private String brandCode = null;

  @ApiModelProperty(value = "Unique identifier of the physical hotel. One physical hotel can be represented by different brands, each one having its own hotel ID. This attribute allows a client application to group together hotels that are actually the same. ")
 /**
   * Unique identifier of the physical hotel. One physical hotel can be represented by different brands, each one having its own hotel ID. This attribute allows a client application to group together hotels that are actually the same. 
  **/
  private String dupeId = null;

  @ApiModelProperty(value = "Hotel name")
 /**
   * Hotel name
  **/
  private String name = null;

  @ApiModelProperty(value = "Hotel rating (1-5)")
 /**
   * Hotel rating (1-5)
  **/
  private String rating = null;

  @ApiModelProperty(value = "")
  private TextWithLanguageType description = null;

  @ApiModelProperty(value = "List of amenities offered by this hotel")
 /**
   * List of amenities offered by this hotel
  **/
  private List<String> amenities = null;

  @ApiModelProperty(value = "Hotel media")
 /**
   * Hotel media
  **/
  private List<MediaUri> media = null;

  @ApiModelProperty(value = "The IATA city code associated to the hotel")
 /**
   * The IATA city code associated to the hotel
  **/
  private String cityCode = null;

  @ApiModelProperty(value = "Hotel latitude (5 decimals)")
 /**
   * Hotel latitude (5 decimals)
  **/
  private Double latitude = null;

  @ApiModelProperty(value = "Hotel longitude (5 decimals)")
 /**
   * Hotel longitude (5 decimals)
  **/
  private Double longitude = null;

  @ApiModelProperty(value = "")
  private HotelDistance hotelDistance = null;

  @ApiModelProperty(value = "")
  private Address address = null;

  @ApiModelProperty(value = "")
  private HotelContact contact = null;
 /**
   * The type of this data object (hotel by default)
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Hotel type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Amadeus hotel ID
   * @return hotelId
  **/
  @JsonProperty("hotelId")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public Hotel hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

 /**
   * Get providers
   * @return providers
  **/
  @JsonProperty("providers")
  public List<Provider> getProviders() {
    return providers;
  }

  public void setProviders(List<Provider> providers) {
    this.providers = providers;
  }

  public Hotel providers(List<Provider> providers) {
    this.providers = providers;
    return this;
  }

  public Hotel addProvidersItem(Provider providersItem) {
    this.providers.add(providersItem);
    return this;
  }

 /**
   * The chain code of the physical hotel Example: XD is the chain code, but the physical hotel is RT (brand code)     
   * @return brandCode
  **/
  @JsonProperty("brandCode")
  public String getBrandCode() {
    return brandCode;
  }

  public void setBrandCode(String brandCode) {
    this.brandCode = brandCode;
  }

  public Hotel brandCode(String brandCode) {
    this.brandCode = brandCode;
    return this;
  }

 /**
   * Unique identifier of the physical hotel. One physical hotel can be represented by different brands, each one having its own hotel ID. This attribute allows a client application to group together hotels that are actually the same. 
   * @return dupeId
  **/
  @JsonProperty("dupeId")
  public String getDupeId() {
    return dupeId;
  }

  public void setDupeId(String dupeId) {
    this.dupeId = dupeId;
  }

  public Hotel dupeId(String dupeId) {
    this.dupeId = dupeId;
    return this;
  }

 /**
   * Hotel name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Hotel name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Hotel rating (1-5)
   * @return rating
  **/
  @JsonProperty("rating")
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public Hotel rating(String rating) {
    this.rating = rating;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public TextWithLanguageType getDescription() {
    return description;
  }

  public void setDescription(TextWithLanguageType description) {
    this.description = description;
  }

  public Hotel description(TextWithLanguageType description) {
    this.description = description;
    return this;
  }

 /**
   * List of amenities offered by this hotel
   * @return amenities
  **/
  @JsonProperty("amenities")
  public List<String> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<String> amenities) {
    this.amenities = amenities;
  }

  public Hotel amenities(List<String> amenities) {
    this.amenities = amenities;
    return this;
  }

  public Hotel addAmenitiesItem(String amenitiesItem) {
    this.amenities.add(amenitiesItem);
    return this;
  }

 /**
   * Hotel media
   * @return media
  **/
  @JsonProperty("media")
  public List<MediaUri> getMedia() {
    return media;
  }

  public void setMedia(List<MediaUri> media) {
    this.media = media;
  }

  public Hotel media(List<MediaUri> media) {
    this.media = media;
    return this;
  }

  public Hotel addMediaItem(MediaUri mediaItem) {
    this.media.add(mediaItem);
    return this;
  }

 /**
   * The IATA city code associated to the hotel
   * @return cityCode
  **/
  @JsonProperty("cityCode")
  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public Hotel cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

 /**
   * Hotel latitude (5 decimals)
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Hotel latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Hotel longitude (5 decimals)
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Hotel longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get hotelDistance
   * @return hotelDistance
  **/
  @JsonProperty("hotelDistance")
  public HotelDistance getHotelDistance() {
    return hotelDistance;
  }

  public void setHotelDistance(HotelDistance hotelDistance) {
    this.hotelDistance = hotelDistance;
  }

  public Hotel hotelDistance(HotelDistance hotelDistance) {
    this.hotelDistance = hotelDistance;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Hotel address(Address address) {
    this.address = address;
    return this;
  }

 /**
   * Get contact
   * @return contact
  **/
  @JsonProperty("contact")
  public HotelContact getContact() {
    return contact;
  }

  public void setContact(HotelContact contact) {
    this.contact = contact;
  }

  public Hotel contact(HotelContact contact) {
    this.contact = contact;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hotel {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    brandCode: ").append(toIndentedString(brandCode)).append("\n");
    sb.append("    dupeId: ").append(toIndentedString(dupeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amenities: ").append(toIndentedString(amenities)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    hotelDistance: ").append(toIndentedString(hotelDistance)).append("\n");
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

