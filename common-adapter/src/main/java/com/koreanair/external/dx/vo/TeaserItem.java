package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarRecommendation;
import com.koreanair.external.dx.vo.HotelRecommendation;
import com.koreanair.external.dx.vo.InsuranceRecommendation;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TeaserItem  {
  
  @ApiModelProperty(required = true, value = "Id of the teaser")
 /**
   * Id of the teaser
  **/
  private String id = null;


@XmlType(name="RecommendationTypeEnum")
@XmlEnum(String.class)
public enum RecommendationTypeEnum {

@XmlEnumValue("car") CAR(String.valueOf("car")), @XmlEnumValue("hotel") HOTEL(String.valueOf("hotel")), @XmlEnumValue("insurance") INSURANCE(String.valueOf("insurance"));


    private String value;

    RecommendationTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RecommendationTypeEnum fromValue(String v) {
        for (RecommendationTypeEnum b : RecommendationTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The type of the recommendation: carOffer, hotelOffer, etc.")
 /**
   * The type of the recommendation: carOffer, hotelOffer, etc.
  **/
  private RecommendationTypeEnum recommendationType = null;

  @ApiModelProperty(value = "Media id used to display the teaser")
 /**
   * Media id used to display the teaser
  **/
  private String mediaId = null;

  @ApiModelProperty(value = "Media url to display the teaser")
 /**
   * Media url to display the teaser
  **/
  private String mediaUrl = null;

  @ApiModelProperty(value = "Title of the teaser")
 /**
   * Title of the teaser
  **/
  private String teaserHeadline = null;

  @ApiModelProperty(value = "Priority order of the teaser, to be used to prioritize the display when several teaser items are returned (the higher the number, the more relevant the teaser is)")
 /**
   * Priority order of the teaser, to be used to prioritize the display when several teaser items are returned (the higher the number, the more relevant the teaser is)
  **/
  private Integer priorityOrder = null;

  @ApiModelProperty(value = "")
  private CarRecommendation car = null;

  @ApiModelProperty(value = "")
  private HotelRecommendation hotel = null;

  @ApiModelProperty(value = "")
  private InsuranceRecommendation insurance = null;
 /**
   * Id of the teaser
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TeaserItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The type of the recommendation: carOffer, hotelOffer, etc.
   * @return recommendationType
  **/
  @JsonProperty("recommendationType")
  public String getRecommendationType() {
    if (recommendationType == null) {
      return null;
    }
    return recommendationType.value();
  }

  public void setRecommendationType(RecommendationTypeEnum recommendationType) {
    this.recommendationType = recommendationType;
  }

  public TeaserItem recommendationType(RecommendationTypeEnum recommendationType) {
    this.recommendationType = recommendationType;
    return this;
  }

 /**
   * Media id used to display the teaser
   * @return mediaId
  **/
  @JsonProperty("mediaId")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public TeaserItem mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

 /**
   * Media url to display the teaser
   * @return mediaUrl
  **/
  @JsonProperty("mediaUrl")
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public TeaserItem mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

 /**
   * Title of the teaser
   * @return teaserHeadline
  **/
  @JsonProperty("teaserHeadline")
  public String getTeaserHeadline() {
    return teaserHeadline;
  }

  public void setTeaserHeadline(String teaserHeadline) {
    this.teaserHeadline = teaserHeadline;
  }

  public TeaserItem teaserHeadline(String teaserHeadline) {
    this.teaserHeadline = teaserHeadline;
    return this;
  }

 /**
   * Priority order of the teaser, to be used to prioritize the display when several teaser items are returned (the higher the number, the more relevant the teaser is)
   * minimum: 1
   * maximum: 999
   * @return priorityOrder
  **/
  @JsonProperty("priorityOrder")
  public Integer getPriorityOrder() {
    return priorityOrder;
  }

  public void setPriorityOrder(Integer priorityOrder) {
    this.priorityOrder = priorityOrder;
  }

  public TeaserItem priorityOrder(Integer priorityOrder) {
    this.priorityOrder = priorityOrder;
    return this;
  }

 /**
   * Get car
   * @return car
  **/
  @JsonProperty("car")
  public CarRecommendation getCar() {
    return car;
  }

  public void setCar(CarRecommendation car) {
    this.car = car;
  }

  public TeaserItem car(CarRecommendation car) {
    this.car = car;
    return this;
  }

 /**
   * Get hotel
   * @return hotel
  **/
  @JsonProperty("hotel")
  public HotelRecommendation getHotel() {
    return hotel;
  }

  public void setHotel(HotelRecommendation hotel) {
    this.hotel = hotel;
  }

  public TeaserItem hotel(HotelRecommendation hotel) {
    this.hotel = hotel;
    return this;
  }

 /**
   * Get insurance
   * @return insurance
  **/
  @JsonProperty("insurance")
  public InsuranceRecommendation getInsurance() {
    return insurance;
  }

  public void setInsurance(InsuranceRecommendation insurance) {
    this.insurance = insurance;
  }

  public TeaserItem insurance(InsuranceRecommendation insurance) {
    this.insurance = insurance;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeaserItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recommendationType: ").append(toIndentedString(recommendationType)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    teaserHeadline: ").append(toIndentedString(teaserHeadline)).append("\n");
    sb.append("    priorityOrder: ").append(toIndentedString(priorityOrder)).append("\n");
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
    sb.append("    hotel: ").append(toIndentedString(hotel)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
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

