package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;

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
  * Extensions have a user defined name and a text based content.  
 **/
@ApiModel(description="Extensions have a user defined name and a text based content.  ")
public class Extension  {
  
  @ApiModelProperty(value = "")
 /**
   * 
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id used to identify an extension, it is only valid the time of the transaction.")
 /**
   * Temporary id used to identify an extension, it is only valid the time of the transaction.
  **/
  private String tid = null;


@XmlType(name="ExtensionTypeEnum")
@XmlEnum(String.class)
public enum ExtensionTypeEnum {

@XmlEnumValue("TextExtension") TEXTEXTENSION(String.valueOf("TextExtension"));


    private String value;

    ExtensionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ExtensionTypeEnum fromValue(String v) {
        for (ExtensionTypeEnum b : ExtensionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "type of Extension. For available types of extensions, please see [Extension  documentation](http://e-travel.mkt.amadeus.net/dxapi/display/extension.html#!/ExtensionType/get)")
 /**
   * type of Extension. For available types of extensions, please see [Extension  documentation](http://e-travel.mkt.amadeus.net/dxapi/display/extension.html#!/ExtensionType/get)
  **/
  private ExtensionTypeEnum extensionType = null;

  @ApiModelProperty(required = true, value = "The name of this extension.")
 /**
   * The name of this extension.
  **/
  private String name = null;

  @ApiModelProperty(value = "Traveler id associated to the seat")
 /**
   * Traveler id associated to the seat
  **/
  private String travelerId = null;

  @ApiModelProperty(value = "It can be used when both the extension and its associated traveler are created simultaneously.")
 /**
   * It can be used when both the extension and its associated traveler are created simultaneously.
  **/
  private String travelerTId = null;
 /**
   * 
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Extension id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id used to identify an extension, it is only valid the time of the transaction.
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public Extension tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * type of Extension. For available types of extensions, please see [Extension  documentation](http://e-travel.mkt.amadeus.net/dxapi/display/extension.html#!/ExtensionType/get)
   * @return extensionType
  **/
  @JsonProperty("extensionType")
  public String getExtensionType() {
    if (extensionType == null) {
      return null;
    }
    return extensionType.value();
  }

  public void setExtensionType(ExtensionTypeEnum extensionType) {
    this.extensionType = extensionType;
  }

  public Extension extensionType(ExtensionTypeEnum extensionType) {
    this.extensionType = extensionType;
    return this;
  }

 /**
   * The name of this extension.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Extension name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Traveler id associated to the seat
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public Extension travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * It can be used when both the extension and its associated traveler are created simultaneously.
   * @return travelerTId
  **/
  @JsonProperty("travelerTId")
  public String getTravelerTId() {
    return travelerTId;
  }

  public void setTravelerTId(String travelerTId) {
    this.travelerTId = travelerTId;
  }

  public Extension travelerTId(String travelerTId) {
    this.travelerTId = travelerTId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extension {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    extensionType: ").append(toIndentedString(extensionType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    travelerTId: ").append(toIndentedString(travelerTId)).append("\n");
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

