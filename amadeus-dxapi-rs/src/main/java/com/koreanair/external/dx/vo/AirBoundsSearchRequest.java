package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirBoundsAdvancedSearchPreferences;
import com.koreanair.external.dx.vo.AirBoundsItinerary;
import com.koreanair.external.dx.vo.AirOfferAdvancedSearchTraveler;
import com.koreanair.external.dx.vo.AirOffersCommonSearchRequest;
import com.koreanair.external.dx.vo.FrequentFlyer;
import com.koreanair.external.dx.vo.Promotion;
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
  * Inputs needed to perform an air bounds search. To perform a round-trip, two itineraries needed, one for each bound without return date.
 **/
@ApiModel(description="Inputs needed to perform an air bounds search. To perform a round-trip, two itineraries needed, one for each bound without return date.")
public class AirBoundsSearchRequest  {
  
  @ApiModelProperty(value = "")
  private List<AirOfferAdvancedSearchTraveler> travelers = null;

  @ApiModelProperty(value = "Commercial fare families that apply to every bound of the itinerary. Must not be requested along with departureCommercialFareFamilies and returnCommercialFareFamilies. ")
 /**
   * Commercial fare families that apply to every bound of the itinerary. Must not be requested along with departureCommercialFareFamilies and returnCommercialFareFamilies. 
  **/
  private List<String> commercialFareFamilies = null;

  @ApiModelProperty(value = "Corporate code or corporate name are used for targeting specific corporate fares.")
 /**
   * Corporate code or corporate name are used for targeting specific corporate fares.
  **/
  private List<String> corporateCodes = null;

  @ApiModelProperty(value = "This defines the desired currency. If not specified the used currency is based on the location of the origin.")
 /**
   * This defines the desired currency. If not specified the used currency is based on the location of the origin.
  **/
  private String currencyCode = null;

  @ApiModelProperty(example = "50", value = "The maximum number of offers to return as long as this value doesn't exceed the limit defined by the airline. Fewer offers could be returned in the case that there are fewer actual travel proposals than requested value. ")
 /**
   * The maximum number of offers to return as long as this value doesn't exceed the limit defined by the airline. Fewer offers could be returned in the case that there are fewer actual travel proposals than requested value. 
  **/
  private Integer max = null;

  @ApiModelProperty(value = "Maximum total price excluding fees of an offer to be returned as a whole number. Example: if the target maximum price is 140.00, the value to be provided should be 140 When a particular currency is specified in input, the maxPrice value refers to amounts in that currency. ")
 /**
   * Maximum total price excluding fees of an offer to be returned as a whole number. Example: if the target maximum price is 140.00, the value to be provided should be 140 When a particular currency is specified in input, the maxPrice value refers to amounts in that currency. 
  **/
  private Integer maxPrice = null;

  @ApiModelProperty(value = "Promotion code and related airline code. When a Promotion is injected and is applied, then the price will be discounted accordingly and the applied promotion will appear in the Discount dictionary associated. ")
 /**
   * Promotion code and related airline code. When a Promotion is injected and is applied, then the price will be discounted accordingly and the applied promotion will appear in the Discount dictionary associated. 
  **/
  private Promotion promotion = null;

  @ApiModelProperty(value = "FrequentFlyer information ")
 /**
   * FrequentFlyer information 
  **/
  private FrequentFlyer frequentFlyer = null;

  @ApiModelProperty(value = "List of itineraries. It will cover all use cases: one-way (one itinerary) / round-trip (two itineraries), complex / stop-over (multiple itineraries).")
 /**
   * List of itineraries. It will cover all use cases: one-way (one itinerary) / round-trip (two itineraries), complex / stop-over (multiple itineraries).
  **/
  private List<AirBoundsItinerary> itineraries = null;

  @ApiModelProperty(value = "Selected bound from the previous air-bounds search response.")
 /**
   * Selected bound from the previous air-bounds search response.
  **/
  private String selectedBoundId = null;

  @ApiModelProperty(value = "Search preferences are intended to allow user to provide specific options for the search ")
 /**
   * Search preferences are intended to allow user to provide specific options for the search 
  **/
  private AirBoundsAdvancedSearchPreferences searchPreferences = null;
 /**
   * Get travelers
   * @return travelers
  **/
  @JsonProperty("travelers")
  public List<AirOfferAdvancedSearchTraveler> getTravelers() {
    return travelers;
  }

  public void setTravelers(List<AirOfferAdvancedSearchTraveler> travelers) {
    this.travelers = travelers;
  }

  public AirBoundsSearchRequest travelers(List<AirOfferAdvancedSearchTraveler> travelers) {
    this.travelers = travelers;
    return this;
  }

  public AirBoundsSearchRequest addTravelersItem(AirOfferAdvancedSearchTraveler travelersItem) {
    this.travelers.add(travelersItem);
    return this;
  }

 /**
   * Commercial fare families that apply to every bound of the itinerary. Must not be requested along with departureCommercialFareFamilies and returnCommercialFareFamilies. 
   * @return commercialFareFamilies
  **/
  @JsonProperty("commercialFareFamilies")
  public List<String> getCommercialFareFamilies() {
    return commercialFareFamilies;
  }

  public void setCommercialFareFamilies(List<String> commercialFareFamilies) {
    this.commercialFareFamilies = commercialFareFamilies;
  }

  public AirBoundsSearchRequest commercialFareFamilies(List<String> commercialFareFamilies) {
    this.commercialFareFamilies = commercialFareFamilies;
    return this;
  }

  public AirBoundsSearchRequest addCommercialFareFamiliesItem(String commercialFareFamiliesItem) {
    this.commercialFareFamilies.add(commercialFareFamiliesItem);
    return this;
  }

 /**
   * Corporate code or corporate name are used for targeting specific corporate fares.
   * @return corporateCodes
  **/
  @JsonProperty("corporateCodes")
  public List<String> getCorporateCodes() {
    return corporateCodes;
  }

  public void setCorporateCodes(List<String> corporateCodes) {
    this.corporateCodes = corporateCodes;
  }

  public AirBoundsSearchRequest corporateCodes(List<String> corporateCodes) {
    this.corporateCodes = corporateCodes;
    return this;
  }

  public AirBoundsSearchRequest addCorporateCodesItem(String corporateCodesItem) {
    this.corporateCodes.add(corporateCodesItem);
    return this;
  }

 /**
   * This defines the desired currency. If not specified the used currency is based on the location of the origin.
   * @return currencyCode
  **/
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AirBoundsSearchRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

 /**
   * The maximum number of offers to return as long as this value doesn&#39;t exceed the limit defined by the airline. Fewer offers could be returned in the case that there are fewer actual travel proposals than requested value. 
   * minimum: 1
   * @return max
  **/
  @JsonProperty("max")
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public AirBoundsSearchRequest max(Integer max) {
    this.max = max;
    return this;
  }

 /**
   * Maximum total price excluding fees of an offer to be returned as a whole number. Example: if the target maximum price is 140.00, the value to be provided should be 140 When a particular currency is specified in input, the maxPrice value refers to amounts in that currency. 
   * minimum: 1
   * @return maxPrice
  **/
  @JsonProperty("maxPrice")
  public Integer getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
  }

  public AirBoundsSearchRequest maxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

 /**
   * Promotion code and related airline code. When a Promotion is injected and is applied, then the price will be discounted accordingly and the applied promotion will appear in the Discount dictionary associated. 
   * @return promotion
  **/
  @JsonProperty("promotion")
  public Promotion getPromotion() {
    return promotion;
  }

  public void setPromotion(Promotion promotion) {
    this.promotion = promotion;
  }

  public AirBoundsSearchRequest promotion(Promotion promotion) {
    this.promotion = promotion;
    return this;
  }

 /**
   * FrequentFlyer information 
   * @return frequentFlyer
  **/
  @JsonProperty("frequentFlyer")
  public FrequentFlyer getFrequentFlyer() {
    return frequentFlyer;
  }

  public void setFrequentFlyer(FrequentFlyer frequentFlyer) {
    this.frequentFlyer = frequentFlyer;
  }

  public AirBoundsSearchRequest frequentFlyer(FrequentFlyer frequentFlyer) {
    this.frequentFlyer = frequentFlyer;
    return this;
  }

 /**
   * List of itineraries. It will cover all use cases: one-way (one itinerary) / round-trip (two itineraries), complex / stop-over (multiple itineraries).
   * @return itineraries
  **/
  @JsonProperty("itineraries")
  public List<AirBoundsItinerary> getItineraries() {
    return itineraries;
  }

  public void setItineraries(List<AirBoundsItinerary> itineraries) {
    this.itineraries = itineraries;
  }

  public AirBoundsSearchRequest itineraries(List<AirBoundsItinerary> itineraries) {
    this.itineraries = itineraries;
    return this;
  }

  public AirBoundsSearchRequest addItinerariesItem(AirBoundsItinerary itinerariesItem) {
    this.itineraries.add(itinerariesItem);
    return this;
  }

 /**
   * Selected bound from the previous air-bounds search response.
   * @return selectedBoundId
  **/
  @JsonProperty("selectedBoundId")
  public String getSelectedBoundId() {
    return selectedBoundId;
  }

  public void setSelectedBoundId(String selectedBoundId) {
    this.selectedBoundId = selectedBoundId;
  }

  public AirBoundsSearchRequest selectedBoundId(String selectedBoundId) {
    this.selectedBoundId = selectedBoundId;
    return this;
  }

 /**
   * Search preferences are intended to allow user to provide specific options for the search 
   * @return searchPreferences
  **/
  @JsonProperty("searchPreferences")
  public AirBoundsAdvancedSearchPreferences getSearchPreferences() {
    return searchPreferences;
  }

  public void setSearchPreferences(AirBoundsAdvancedSearchPreferences searchPreferences) {
    this.searchPreferences = searchPreferences;
  }

  public AirBoundsSearchRequest searchPreferences(AirBoundsAdvancedSearchPreferences searchPreferences) {
    this.searchPreferences = searchPreferences;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirBoundsSearchRequest {\n");
    
    sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
    sb.append("    commercialFareFamilies: ").append(toIndentedString(commercialFareFamilies)).append("\n");
    sb.append("    corporateCodes: ").append(toIndentedString(corporateCodes)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
    sb.append("    frequentFlyer: ").append(toIndentedString(frequentFlyer)).append("\n");
    sb.append("    itineraries: ").append(toIndentedString(itineraries)).append("\n");
    sb.append("    selectedBoundId: ").append(toIndentedString(selectedBoundId)).append("\n");
    sb.append("    searchPreferences: ").append(toIndentedString(searchPreferences)).append("\n");
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

