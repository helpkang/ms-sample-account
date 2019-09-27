package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FormOfIdentificationDetail;
import com.koreanair.external.dx.vo.RegulatoryFoidDocument;
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
  * Identification using identity/regulatory documents
 **/
@ApiModel(description="Identification using identity/regulatory documents")
public class IdentificationRegulatoryDocuments extends FormOfIdentificationDetail {
  
  @ApiModelProperty(required = true, value = "")
  private List<RegulatoryFoidDocument> regulatoryDocumentList = new ArrayList<>();
 /**
   * Get regulatoryDocumentList
   * @return regulatoryDocumentList
  **/
  @JsonProperty("regulatoryDocumentList")
  public List<RegulatoryFoidDocument> getRegulatoryDocumentList() {
    return regulatoryDocumentList;
  }

  public void setRegulatoryDocumentList(List<RegulatoryFoidDocument> regulatoryDocumentList) {
    this.regulatoryDocumentList = regulatoryDocumentList;
  }

  public IdentificationRegulatoryDocuments regulatoryDocumentList(List<RegulatoryFoidDocument> regulatoryDocumentList) {
    this.regulatoryDocumentList = regulatoryDocumentList;
    return this;
  }

  public IdentificationRegulatoryDocuments addRegulatoryDocumentListItem(RegulatoryFoidDocument regulatoryDocumentListItem) {
    this.regulatoryDocumentList.add(regulatoryDocumentListItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationRegulatoryDocuments {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    regulatoryDocumentList: ").append(toIndentedString(regulatoryDocumentList)).append("\n");
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

