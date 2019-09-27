package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirItem;
import com.koreanair.external.dx.vo.AirOfferItemCommon;
import com.koreanair.external.dx.vo.AirPricingRecords;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AirOfferItem  {
  
  @ApiModelProperty(required = true, value = "")
  private String id = null;

  @ApiModelProperty(value = "NDC identifier (for information only)")
 /**
   * NDC identifier (for information only)
  **/
  private String offerItemNdcId = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Date-time of the last revalidation for the the air offer stored in a cart. The revalidation refreshes both fare (prices and price conditions) and availability of an airOffer.")
 /**
   * Date-time of the last revalidation for the the air offer stored in a cart. The revalidation refreshes both fare (prices and price conditions) and availability of an airOffer.
  **/
  private LocalDateTime lastRefreshDateTime = null;


@XmlType(name="LastRefreshStatusEnum")
@XmlEnum(String.class)
public enum LastRefreshStatusEnum {

@XmlEnumValue("valid") VALID(String.valueOf("valid")), @XmlEnumValue("invalid") INVALID(String.valueOf("invalid"));


    private String value;

    LastRefreshStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LastRefreshStatusEnum fromValue(String v) {
        for (LastRefreshStatusEnum b : LastRefreshStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Status of the air offer stored in a cart in respect of the last revalidation")
 /**
   * Status of the air offer stored in a cart in respect of the last revalidation
  **/
  private LastRefreshStatusEnum lastRefreshStatus = null;

  @ApiModelProperty(required = true, value = "")
  private AirPricingRecords prices = null;

  @ApiModelProperty(required = true, value = "")
  private AirItem air = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AirOfferItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * NDC identifier (for information only)
   * @return offerItemNdcId
  **/
  @JsonProperty("offerItemNdcId")
  public String getOfferItemNdcId() {
    return offerItemNdcId;
  }

  public void setOfferItemNdcId(String offerItemNdcId) {
    this.offerItemNdcId = offerItemNdcId;
  }

  public AirOfferItem offerItemNdcId(String offerItemNdcId) {
    this.offerItemNdcId = offerItemNdcId;
    return this;
  }

 /**
   * Date-time of the last revalidation for the the air offer stored in a cart. The revalidation refreshes both fare (prices and price conditions) and availability of an airOffer.
   * @return lastRefreshDateTime
  **/
  @JsonProperty("lastRefreshDateTime")
  public LocalDateTime getLastRefreshDateTime() {
    return lastRefreshDateTime;
  }

  public void setLastRefreshDateTime(LocalDateTime lastRefreshDateTime) {
    this.lastRefreshDateTime = lastRefreshDateTime;
  }

  public AirOfferItem lastRefreshDateTime(LocalDateTime lastRefreshDateTime) {
    this.lastRefreshDateTime = lastRefreshDateTime;
    return this;
  }

 /**
   * Status of the air offer stored in a cart in respect of the last revalidation
   * @return lastRefreshStatus
  **/
  @JsonProperty("lastRefreshStatus")
  public String getLastRefreshStatus() {
    if (lastRefreshStatus == null) {
      return null;
    }
    return lastRefreshStatus.value();
  }

  public void setLastRefreshStatus(LastRefreshStatusEnum lastRefreshStatus) {
    this.lastRefreshStatus = lastRefreshStatus;
  }

  public AirOfferItem lastRefreshStatus(LastRefreshStatusEnum lastRefreshStatus) {
    this.lastRefreshStatus = lastRefreshStatus;
    return this;
  }

 /**
   * Get prices
   * @return prices
  **/
  @JsonProperty("prices")
  public AirPricingRecords getPrices() {
    return prices;
  }

  public void setPrices(AirPricingRecords prices) {
    this.prices = prices;
  }

  public AirOfferItem prices(AirPricingRecords prices) {
    this.prices = prices;
    return this;
  }

 /**
   * Get air
   * @return air
  **/
  @JsonProperty("air")
  public AirItem getAir() {
    return air;
  }

  public void setAir(AirItem air) {
    this.air = air;
  }

  public AirOfferItem air(AirItem air) {
    this.air = air;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirOfferItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerItemNdcId: ").append(toIndentedString(offerItemNdcId)).append("\n");
    sb.append("    lastRefreshDateTime: ").append(toIndentedString(lastRefreshDateTime)).append("\n");
    sb.append("    lastRefreshStatus: ").append(toIndentedString(lastRefreshStatus)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    air: ").append(toIndentedString(air)).append("\n");
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

