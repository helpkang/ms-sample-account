package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Barcode;
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
  * Boarding pass generated.
 **/
@ApiModel(description="Boarding pass generated.")
public class BoardingPass  {
  
  @ApiModelProperty(value = "Industry standard bar code (IATA Resolution 792).")
 /**
   * Industry standard bar code (IATA Resolution 792).
  **/
  private Barcode barcode = null;


@XmlType(name="DeliveryTypeEnum")
@XmlEnum(String.class)
public enum DeliveryTypeEnum {

@XmlEnumValue("email") EMAIL(String.valueOf("email")), @XmlEnumValue("mobile") MOBILE(String.valueOf("mobile")), @XmlEnumValue("pdf") PDF(String.valueOf("pdf")), @XmlEnumValue("sms") SMS(String.valueOf("sms"));


    private String value;

    DeliveryTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DeliveryTypeEnum fromValue(String v) {
        for (DeliveryTypeEnum b : DeliveryTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of the boarding pass delivered")
 /**
   * Type of the boarding pass delivered
  **/
  private DeliveryTypeEnum deliveryType = null;

  @ApiModelProperty(value = "Link to the boarding pass for PDF and Mobile boarding passes.")
 /**
   * Link to the boarding pass for PDF and Mobile boarding passes.
  **/
  private String link = null;

  @ApiModelProperty(value = "Boarding gate if known at boarding pass generation time.")
 /**
   * Boarding gate if known at boarding pass generation time.
  **/
  private String gate = null;
 /**
   * Industry standard bar code (IATA Resolution 792).
   * @return barcode
  **/
  @JsonProperty("barcode")
  public Barcode getBarcode() {
    return barcode;
  }

  public void setBarcode(Barcode barcode) {
    this.barcode = barcode;
  }

  public BoardingPass barcode(Barcode barcode) {
    this.barcode = barcode;
    return this;
  }

 /**
   * Type of the boarding pass delivered
   * @return deliveryType
  **/
  @JsonProperty("deliveryType")
  public String getDeliveryType() {
    if (deliveryType == null) {
      return null;
    }
    return deliveryType.value();
  }

  public void setDeliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
  }

  public BoardingPass deliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

 /**
   * Link to the boarding pass for PDF and Mobile boarding passes.
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public BoardingPass link(String link) {
    this.link = link;
    return this;
  }

 /**
   * Boarding gate if known at boarding pass generation time.
   * @return gate
  **/
  @JsonProperty("gate")
  public String getGate() {
    return gate;
  }

  public void setGate(String gate) {
    this.gate = gate;
  }

  public BoardingPass gate(String gate) {
    this.gate = gate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPass {\n");
    
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    gate: ").append(toIndentedString(gate)).append("\n");
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

