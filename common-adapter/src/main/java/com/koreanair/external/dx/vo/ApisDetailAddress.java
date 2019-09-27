package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.RegulatoryAddress;
import com.koreanair.external.dx.vo.RegulatoryApisDetail;
import io.swagger.annotations.ApiModel;
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
  * Regulatory address usable for Advance Passenger Information (APIS)
 **/
@ApiModel(description="Regulatory address usable for Advance Passenger Information (APIS)")
public class ApisDetailAddress extends RegulatoryApisDetail {
  
  @ApiModelProperty(required = true, value = "")
  private RegulatoryAddress address = null;
 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public RegulatoryAddress getAddress() {
    return address;
  }

  public void setAddress(RegulatoryAddress address) {
    this.address = address;
  }

  public ApisDetailAddress address(RegulatoryAddress address) {
    this.address = address;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApisDetailAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

