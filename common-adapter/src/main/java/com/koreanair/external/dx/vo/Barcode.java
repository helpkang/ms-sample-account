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
  * Industry standard bar code (IATA Resolution 792) details.
 **/
@ApiModel(description="Industry standard bar code (IATA Resolution 792) details.")
public class Barcode  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("aztec") AZTEC(String.valueOf("aztec")), @XmlEnumValue("datamatrix") DATAMATRIX(String.valueOf("datamatrix")), @XmlEnumValue("pdf417") PDF417(String.valueOf("pdf417")), @XmlEnumValue("qrcode") QRCODE(String.valueOf("qrcode"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of barcode to be rendered by client (Aztec, QR etc).")
 /**
   * Type of barcode to be rendered by client (Aztec, QR etc).
  **/
  private TypeEnum type = null;

  @ApiModelProperty(required = true, value = "Bar coded boarding pass data.")
 /**
   * Bar coded boarding pass data.
  **/
  private String stream = null;
 /**
   * Type of barcode to be rendered by client (Aztec, QR etc).
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Barcode type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Bar coded boarding pass data.
   * @return stream
  **/
  @JsonProperty("stream")
  public String getStream() {
    return stream;
  }

  public void setStream(String stream) {
    this.stream = stream;
  }

  public Barcode stream(String stream) {
    this.stream = stream;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Barcode {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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

