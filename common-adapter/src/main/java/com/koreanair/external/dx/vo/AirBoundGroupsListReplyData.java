package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirBoundGroup;
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
  * List of airBounds corresponding to the search criteria. The air bounds are grouped together with respect to a flight and the associated fares. For example let us consider following air-bounds for outbound LON-MAD, where  Flight F1 is offered for $100 for Economy Flight F1 is offered for $150 for Business Flight F2 is offered for $120 for Economy Flight F2 is offered for $150 for Business  They are grouped together and represented in format F1 -> [Economy: $100, Business: $150]  F2 -> [Economy: $120, Business: $150] 
 **/
@ApiModel(description="List of airBounds corresponding to the search criteria. The air bounds are grouped together with respect to a flight and the associated fares. For example let us consider following air-bounds for outbound LON-MAD, where  Flight F1 is offered for $100 for Economy Flight F1 is offered for $150 for Business Flight F2 is offered for $120 for Economy Flight F2 is offered for $150 for Business  They are grouped together and represented in format F1 -> [Economy: $100, Business: $150]  F2 -> [Economy: $120, Business: $150] ")
public class AirBoundGroupsListReplyData  {
  
  @ApiModelProperty(value = "")
  private List<AirBoundGroup> airBoundGroups = null;
 /**
   * Get airBoundGroups
   * @return airBoundGroups
  **/
  @JsonProperty("airBoundGroups")
  public List<AirBoundGroup> getAirBoundGroups() {
    return airBoundGroups;
  }

  public void setAirBoundGroups(List<AirBoundGroup> airBoundGroups) {
    this.airBoundGroups = airBoundGroups;
  }

  public AirBoundGroupsListReplyData airBoundGroups(List<AirBoundGroup> airBoundGroups) {
    this.airBoundGroups = airBoundGroups;
    return this;
  }

  public AirBoundGroupsListReplyData addAirBoundGroupsItem(AirBoundGroup airBoundGroupsItem) {
    this.airBoundGroups.add(airBoundGroupsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirBoundGroupsListReplyData {\n");
    
    sb.append("    airBoundGroups: ").append(toIndentedString(airBoundGroups)).append("\n");
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

