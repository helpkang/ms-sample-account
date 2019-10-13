package com.koreanair.external.dx.vo;

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
  * Object used to input the information to be used when adding an offer into a teaser. 
 **/
@ApiModel(description="Object used to input the information to be used when adding an offer into a teaser. ")
public class TeaserRequest  {
  
  @ApiModelProperty(value = "Identifier of an order (Record Locator)")
 /**
   * Identifier of an order (Record Locator)
  **/
  private String orderId = null;

  @ApiModelProperty(required = true, value = "Identifier of the teasers. When teaserIds coming from a previous call are provided, the response will include a richer set of details: third party providers information, search criteria and recommendations.")
 /**
   * Identifier of the teasers. When teaserIds coming from a previous call are provided, the response will include a richer set of details: third party providers information, search criteria and recommendations.
  **/
  private List<String> teaserIds = new ArrayList<>();


@XmlType(name="SearchModeEnum")
@XmlEnum(String.class)
public enum SearchModeEnum {

@XmlEnumValue("cheapest") CHEAPEST(String.valueOf("cheapest")), @XmlEnumValue("recommended") RECOMMENDED(String.valueOf("recommended")), @XmlEnumValue("all") ALL(String.valueOf("all"));


    private String value;

    SearchModeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SearchModeEnum fromValue(String v) {
        for (SearchModeEnum b : SearchModeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Mode applied to build teaser answer based on available offers matching the teaser criteria Possible values: - 'cheapest' (default value): to return the cheapest offer. - 'recommended': to return the best offer recommended by the provider. - 'all': to return all the available recommendations.")
 /**
   * Mode applied to build teaser answer based on available offers matching the teaser criteria Possible values: - 'cheapest' (default value): to return the cheapest offer. - 'recommended': to return the best offer recommended by the provider. - 'all': to return all the available recommendations.
  **/
  private SearchModeEnum searchMode = SearchModeEnum.CHEAPEST;

  @ApiModelProperty(value = "Car Loyalty number with the following structure {providerCode}{loyaltyCode}{loyaltyNumber}; Example: ZEFTXC12344 where providerCode=ZE, loyaltyCode=FT and loyaltyNumber=XC12344 ")
 /**
   * Car Loyalty number with the following structure {providerCode}{loyaltyCode}{loyaltyNumber}; Example: ZEFTXC12344 where providerCode=ZE, loyaltyCode=FT and loyaltyNumber=XC12344 
  **/
  private List<String> carLoyaltyNumbers = null;

  @ApiModelProperty(value = "The age of the driver at departure date. If not provided, the returned rates will not take into account the drivers age.")
 /**
   * The age of the driver at departure date. If not provided, the returned rates will not take into account the drivers age.
  **/
  private Integer driverAge = null;
 /**
   * Identifier of an order (Record Locator)
   * @return orderId
  **/
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public TeaserRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Identifier of the teasers. When teaserIds coming from a previous call are provided, the response will include a richer set of details: third party providers information, search criteria and recommendations.
   * @return teaserIds
  **/
  @JsonProperty("teaserIds")
  public List<String> getTeaserIds() {
    return teaserIds;
  }

  public void setTeaserIds(List<String> teaserIds) {
    this.teaserIds = teaserIds;
  }

  public TeaserRequest teaserIds(List<String> teaserIds) {
    this.teaserIds = teaserIds;
    return this;
  }

  public TeaserRequest addTeaserIdsItem(String teaserIdsItem) {
    this.teaserIds.add(teaserIdsItem);
    return this;
  }

 /**
   * Mode applied to build teaser answer based on available offers matching the teaser criteria Possible values: - &#39;cheapest&#39; (default value): to return the cheapest offer. - &#39;recommended&#39;: to return the best offer recommended by the provider. - &#39;all&#39;: to return all the available recommendations.
   * @return searchMode
  **/
  @JsonProperty("searchMode")
  public String getSearchMode() {
    if (searchMode == null) {
      return null;
    }
    return searchMode.value();
  }

  public void setSearchMode(SearchModeEnum searchMode) {
    this.searchMode = searchMode;
  }

  public TeaserRequest searchMode(SearchModeEnum searchMode) {
    this.searchMode = searchMode;
    return this;
  }

 /**
   * Car Loyalty number with the following structure {providerCode}{loyaltyCode}{loyaltyNumber}; Example: ZEFTXC12344 where providerCode&#x3D;ZE, loyaltyCode&#x3D;FT and loyaltyNumber&#x3D;XC12344 
   * @return carLoyaltyNumbers
  **/
  @JsonProperty("carLoyaltyNumbers")
  public List<String> getCarLoyaltyNumbers() {
    return carLoyaltyNumbers;
  }

  public void setCarLoyaltyNumbers(List<String> carLoyaltyNumbers) {
    this.carLoyaltyNumbers = carLoyaltyNumbers;
  }

  public TeaserRequest carLoyaltyNumbers(List<String> carLoyaltyNumbers) {
    this.carLoyaltyNumbers = carLoyaltyNumbers;
    return this;
  }

  public TeaserRequest addCarLoyaltyNumbersItem(String carLoyaltyNumbersItem) {
    this.carLoyaltyNumbers.add(carLoyaltyNumbersItem);
    return this;
  }

 /**
   * The age of the driver at departure date. If not provided, the returned rates will not take into account the drivers age.
   * @return driverAge
  **/
  @JsonProperty("driverAge")
  public Integer getDriverAge() {
    return driverAge;
  }

  public void setDriverAge(Integer driverAge) {
    this.driverAge = driverAge;
  }

  public TeaserRequest driverAge(Integer driverAge) {
    this.driverAge = driverAge;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeaserRequest {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    teaserIds: ").append(toIndentedString(teaserIds)).append("\n");
    sb.append("    searchMode: ").append(toIndentedString(searchMode)).append("\n");
    sb.append("    carLoyaltyNumbers: ").append(toIndentedString(carLoyaltyNumbers)).append("\n");
    sb.append("    driverAge: ").append(toIndentedString(driverAge)).append("\n");
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

