package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ItemCommon;
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
  * Remark that can be added to an order. There are three types of remarks: - GeneralRemark (RM) - CorporateRemark (RX) - ConfidentialRemark (RC) Remark is a polymorphic object, meaning that it contains only the basic structure from which derive the three types of Remark. To see the structure of the different remarks, please see [Remarks documentation](http://e-travel.mkt.amadeus.net/dxapi/display/remarks.html#!/RemarkType/get) 
 **/
@ApiModel(description="Remark that can be added to an order. There are three types of remarks: - GeneralRemark (RM) - CorporateRemark (RX) - ConfidentialRemark (RC) Remark is a polymorphic object, meaning that it contains only the basic structure from which derive the three types of Remark. To see the structure of the different remarks, please see [Remarks documentation](http://e-travel.mkt.amadeus.net/dxapi/display/remarks.html#!/RemarkType/get) ")
public class Remark  {
  
  @ApiModelProperty(value = "Identifier of the resource. not read / taken into account when creating a resource")
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned remarks. Valid only for the time of the transaction")
 /**
   * Temporary id that can be used to associate requested and returned remarks. Valid only for the time of the transaction
  **/
  private String tid = null;


@XmlType(name="RemarkTypeEnum")
@XmlEnum(String.class)
public enum RemarkTypeEnum {

@XmlEnumValue("GeneralRemark") GENERALREMARK(String.valueOf("GeneralRemark")), @XmlEnumValue("CorporateRemark") CORPORATEREMARK(String.valueOf("CorporateRemark")), @XmlEnumValue("ConfidentialRemark") CONFIDENTIALREMARK(String.valueOf("ConfidentialRemark"));


    private String value;

    RemarkTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RemarkTypeEnum fromValue(String v) {
        for (RemarkTypeEnum b : RemarkTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of the Remark i.e. General Remark (RM), Corporate Remark (RX), Confidential Remark (RC). To see the structure of the different remarks, please see [Remarks documentation](http://e-travel.mkt.amadeus.net/dxapi/display/remarks.html#!/RemarkType/get) ")
 /**
   * Type of the Remark i.e. General Remark (RM), Corporate Remark (RX), Confidential Remark (RC). To see the structure of the different remarks, please see [Remarks documentation](http://e-travel.mkt.amadeus.net/dxapi/display/remarks.html#!/RemarkType/get) 
  **/
  private RemarkTypeEnum remarkType = RemarkTypeEnum.GENERALREMARK;

  @ApiModelProperty(value = "A list of travelers associated to this Remark. If not specified, the remark applies to all travelers")
 /**
   * A list of travelers associated to this Remark. If not specified, the remark applies to all travelers
  **/
  private List<String> travelerIds = null;
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Remark id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id that can be used to associate requested and returned remarks. Valid only for the time of the transaction
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public Remark tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Type of the Remark i.e. General Remark (RM), Corporate Remark (RX), Confidential Remark (RC). To see the structure of the different remarks, please see [Remarks documentation](http://e-travel.mkt.amadeus.net/dxapi/display/remarks.html#!/RemarkType/get) 
   * @return remarkType
  **/
  @JsonProperty("remarkType")
  public String getRemarkType() {
    if (remarkType == null) {
      return null;
    }
    return remarkType.value();
  }

  public void setRemarkType(RemarkTypeEnum remarkType) {
    this.remarkType = remarkType;
  }

  public Remark remarkType(RemarkTypeEnum remarkType) {
    this.remarkType = remarkType;
    return this;
  }

 /**
   * A list of travelers associated to this Remark. If not specified, the remark applies to all travelers
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public Remark travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public Remark addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Remark {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    remarkType: ").append(toIndentedString(remarkType)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
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

