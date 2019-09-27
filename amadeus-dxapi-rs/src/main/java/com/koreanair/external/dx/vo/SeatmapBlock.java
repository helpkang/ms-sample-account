package com.koreanair.external.dx.vo;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatmapBlock  {
  
  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "Number of extra oxygen masks remaining for this block on this flight at this date in Inventory. This number must be revised with current PNR or trip to get final number of extra oxygen masks")
 /**
   * Number of extra oxygen masks remaining for this block on this flight at this date in Inventory. This number must be revised with current PNR or trip to get final number of extra oxygen masks
  **/
  private Integer nbrRemainingExtraOxygenMasks = null;
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

  public SeatmapBlock id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Number of extra oxygen masks remaining for this block on this flight at this date in Inventory. This number must be revised with current PNR or trip to get final number of extra oxygen masks
   * @return nbrRemainingExtraOxygenMasks
  **/
  @JsonProperty("nbrRemainingExtraOxygenMasks")
  public Integer getNbrRemainingExtraOxygenMasks() {
    return nbrRemainingExtraOxygenMasks;
  }

  public void setNbrRemainingExtraOxygenMasks(Integer nbrRemainingExtraOxygenMasks) {
    this.nbrRemainingExtraOxygenMasks = nbrRemainingExtraOxygenMasks;
  }

  public SeatmapBlock nbrRemainingExtraOxygenMasks(Integer nbrRemainingExtraOxygenMasks) {
    this.nbrRemainingExtraOxygenMasks = nbrRemainingExtraOxygenMasks;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapBlock {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nbrRemainingExtraOxygenMasks: ").append(toIndentedString(nbrRemainingExtraOxygenMasks)).append("\n");
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

