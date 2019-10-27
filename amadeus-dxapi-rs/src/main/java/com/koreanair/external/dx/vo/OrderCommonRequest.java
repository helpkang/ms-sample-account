package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.OtherServiceInformation;
import com.koreanair.external.dx.vo.Remark;
import com.koreanair.external.dx.vo.SpecialKeyword;
import com.koreanair.external.dx.vo.SpecialServiceRequest;
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
  * Request to perform common/standard operation on an order.
 **/
@ApiModel(description="Request to perform common/standard operation on an order.")
public class OrderCommonRequest  {
  
  @ApiModelProperty(value = "Remarks (RM) to be inserted in the order")
 /**
   * Remarks (RM) to be inserted in the order
  **/
  private List<Remark> remarks = null;

  @ApiModelProperty(value = "Other service information elements (OSI) to be inserted in the order")
 /**
   * Other service information elements (OSI) to be inserted in the order
  **/
  private List<OtherServiceInformation> otherServiceInformations = null;

  @ApiModelProperty(value = "Special Keyword elements (SK) to be inserted in the order")
 /**
   * Special Keyword elements (SK) to be inserted in the order
  **/
  private List<SpecialKeyword> specialKeywords = null;

  @ApiModelProperty(value = "Special Services Request(SSR) stored in the order")
 /**
   * Special Services Request(SSR) stored in the order
  **/
  private List<SpecialServiceRequest> specialServiceRequests = null;
 /**
   * Remarks (RM) to be inserted in the order
   * @return remarks
  **/
  @JsonProperty("remarks")
  public List<Remark> getRemarks() {
    return remarks;
  }

  public void setRemarks(List<Remark> remarks) {
    this.remarks = remarks;
  }

  public OrderCommonRequest remarks(List<Remark> remarks) {
    this.remarks = remarks;
    return this;
  }

  public OrderCommonRequest addRemarksItem(Remark remarksItem) {
    this.remarks.add(remarksItem);
    return this;
  }

 /**
   * Other service information elements (OSI) to be inserted in the order
   * @return otherServiceInformations
  **/
  @JsonProperty("otherServiceInformations")
  public List<OtherServiceInformation> getOtherServiceInformations() {
    return otherServiceInformations;
  }

  public void setOtherServiceInformations(List<OtherServiceInformation> otherServiceInformations) {
    this.otherServiceInformations = otherServiceInformations;
  }

  public OrderCommonRequest otherServiceInformations(List<OtherServiceInformation> otherServiceInformations) {
    this.otherServiceInformations = otherServiceInformations;
    return this;
  }

  public OrderCommonRequest addOtherServiceInformationsItem(OtherServiceInformation otherServiceInformationsItem) {
    this.otherServiceInformations.add(otherServiceInformationsItem);
    return this;
  }

 /**
   * Special Keyword elements (SK) to be inserted in the order
   * @return specialKeywords
  **/
  @JsonProperty("specialKeywords")
  public List<SpecialKeyword> getSpecialKeywords() {
    return specialKeywords;
  }

  public void setSpecialKeywords(List<SpecialKeyword> specialKeywords) {
    this.specialKeywords = specialKeywords;
  }

  public OrderCommonRequest specialKeywords(List<SpecialKeyword> specialKeywords) {
    this.specialKeywords = specialKeywords;
    return this;
  }

  public OrderCommonRequest addSpecialKeywordsItem(SpecialKeyword specialKeywordsItem) {
    this.specialKeywords.add(specialKeywordsItem);
    return this;
  }

 /**
   * Special Services Request(SSR) stored in the order
   * @return specialServiceRequests
  **/
  @JsonProperty("specialServiceRequests")
  public List<SpecialServiceRequest> getSpecialServiceRequests() {
    return specialServiceRequests;
  }

  public void setSpecialServiceRequests(List<SpecialServiceRequest> specialServiceRequests) {
    this.specialServiceRequests = specialServiceRequests;
  }

  public OrderCommonRequest specialServiceRequests(List<SpecialServiceRequest> specialServiceRequests) {
    this.specialServiceRequests = specialServiceRequests;
    return this;
  }

  public OrderCommonRequest addSpecialServiceRequestsItem(SpecialServiceRequest specialServiceRequestsItem) {
    this.specialServiceRequests.add(specialServiceRequestsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCommonRequest {\n");
    
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    otherServiceInformations: ").append(toIndentedString(otherServiceInformations)).append("\n");
    sb.append("    specialKeywords: ").append(toIndentedString(specialKeywords)).append("\n");
    sb.append("    specialServiceRequests: ").append(toIndentedString(specialServiceRequests)).append("\n");
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

