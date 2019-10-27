package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;

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
  * This object contains a list of search preferences to customize search based on user requirements
 **/
@ApiModel(description="This object contains a list of search preferences to customize search based on user requirements")
public class AirCalendarAdvancedSearchPreferences  {
  
  @ApiModelProperty(value = "Enables the award converter feature that converts a commercial fare paid in cash into a fare paid in cash and miles")
 /**
   * Enables the award converter feature that converts a commercial fare paid in cash into a fare paid in cash and miles
  **/
  private Boolean showMilesPrice = false;

  @ApiModelProperty(value = "Enables the empty cell feature in calendar that allows to receive information about the cause when flights are not available in a certain date")
 /**
   * Enables the empty cell feature in calendar that allows to receive information about the cause when flights are not available in a certain date
  **/
  private Boolean showUnavailableEntries = false;
 /**
   * Enables the award converter feature that converts a commercial fare paid in cash into a fare paid in cash and miles
   * @return showMilesPrice
  **/
  @JsonProperty("showMilesPrice")
  public Boolean isShowMilesPrice() {
    return showMilesPrice;
  }

  public void setShowMilesPrice(Boolean showMilesPrice) {
    this.showMilesPrice = showMilesPrice;
  }

  public AirCalendarAdvancedSearchPreferences showMilesPrice(Boolean showMilesPrice) {
    this.showMilesPrice = showMilesPrice;
    return this;
  }

 /**
   * Enables the empty cell feature in calendar that allows to receive information about the cause when flights are not available in a certain date
   * @return showUnavailableEntries
  **/
  @JsonProperty("showUnavailableEntries")
  public Boolean isShowUnavailableEntries() {
    return showUnavailableEntries;
  }

  public void setShowUnavailableEntries(Boolean showUnavailableEntries) {
    this.showUnavailableEntries = showUnavailableEntries;
  }

  public AirCalendarAdvancedSearchPreferences showUnavailableEntries(Boolean showUnavailableEntries) {
    this.showUnavailableEntries = showUnavailableEntries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirCalendarAdvancedSearchPreferences {\n");
    
    sb.append("    showMilesPrice: ").append(toIndentedString(showMilesPrice)).append("\n");
    sb.append("    showUnavailableEntries: ").append(toIndentedString(showUnavailableEntries)).append("\n");
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

