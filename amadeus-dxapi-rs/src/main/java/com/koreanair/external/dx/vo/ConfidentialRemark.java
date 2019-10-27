package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Remark;
import com.koreanair.external.dx.vo.Security;
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
  * Confidential freetext information added to an order (RC). When the order is retrieved by an Office other than the office that created the remark or the designated office in the remark, the freetext will be replaced by RESTRICTED. 
 **/
@ApiModel(description="Confidential freetext information added to an order (RC). When the order is retrieved by an Office other than the office that created the remark or the designated office in the remark, the freetext will be replaced by RESTRICTED. ")
public class ConfidentialRemark extends Remark {
  
  @ApiModelProperty(required = true, value = "Free text of the confidential remark")
 /**
   * Free text of the confidential remark
  **/
  private String freetext = null;

  @ApiModelProperty(value = "List of security credentials for the confidential remark.")
 /**
   * List of security credentials for the confidential remark.
  **/
  private List<Security> securities = null;
 /**
   * Free text of the confidential remark
   * @return freetext
  **/
  @JsonProperty("freetext")
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public ConfidentialRemark freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

 /**
   * List of security credentials for the confidential remark.
   * @return securities
  **/
  @JsonProperty("securities")
  public List<Security> getSecurities() {
    return securities;
  }

  public void setSecurities(List<Security> securities) {
    this.securities = securities;
  }

  public ConfidentialRemark securities(List<Security> securities) {
    this.securities = securities;
    return this;
  }

  public ConfidentialRemark addSecuritiesItem(Security securitiesItem) {
    this.securities.add(securitiesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfidentialRemark {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
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

