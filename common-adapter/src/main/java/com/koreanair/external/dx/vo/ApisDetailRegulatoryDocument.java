package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.RegulatoryApisDetail;
import com.koreanair.external.dx.vo.RegulatoryApisDocument;
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
  * Regulatory document usable for Advance Passenger Information (APIS)
 **/
@ApiModel(description="Regulatory document usable for Advance Passenger Information (APIS)")
public class ApisDetailRegulatoryDocument extends RegulatoryApisDetail {
  
  @ApiModelProperty(required = true, value = "")
  private RegulatoryApisDocument regulatoryDocument = null;
 /**
   * Get regulatoryDocument
   * @return regulatoryDocument
  **/
  @JsonProperty("regulatoryDocument")
  public RegulatoryApisDocument getRegulatoryDocument() {
    return regulatoryDocument;
  }

  public void setRegulatoryDocument(RegulatoryApisDocument regulatoryDocument) {
    this.regulatoryDocument = regulatoryDocument;
  }

  public ApisDetailRegulatoryDocument regulatoryDocument(RegulatoryApisDocument regulatoryDocument) {
    this.regulatoryDocument = regulatoryDocument;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApisDetailRegulatoryDocument {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    regulatoryDocument: ").append(toIndentedString(regulatoryDocument)).append("\n");
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

