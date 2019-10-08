package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FormOfIdentificationDetail;
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
  * The FOID can be created either by using one or several regulatory documents (ID card, passport, driving license...) or by using a frequent flyer card or a payment card. The data can come from either from an existing resource referenced by its ID, or by a new one provided in the request. For a ticket or confirmation number, the document number must be specified. 
 **/
@ApiModel(description="The FOID can be created either by using one or several regulatory documents (ID card, passport, driving license...) or by using a frequent flyer card or a payment card. The data can come from either from an existing resource referenced by its ID, or by a new one provided in the request. For a ticket or confirmation number, the document number must be specified. ")
public class FormOfIdentificationDetailPostOrderRequest extends FormOfIdentificationDetail {
  
  @ApiModelProperty(value = "")
  private String travelerId = null;
 /**
   * Get travelerId
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public FormOfIdentificationDetailPostOrderRequest travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfIdentificationDetailPostOrderRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
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

