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
  * Identification using data coming from an existing resource referenced by its ID.
 **/
@ApiModel(description="Identification using data coming from an existing resource referenced by its ID.")
public class IdentificationFromReference extends FormOfIdentificationDetail {
  
  @ApiModelProperty(value = "ID of the document / frequent flyer card to be used for FOID information.")
 /**
   * ID of the document / frequent flyer card to be used for FOID information.
  **/
  private String referenceId = null;
 /**
   * ID of the document / frequent flyer card to be used for FOID information.
   * @return referenceId
  **/
  @JsonProperty("referenceId")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public IdentificationFromReference referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationFromReference {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

