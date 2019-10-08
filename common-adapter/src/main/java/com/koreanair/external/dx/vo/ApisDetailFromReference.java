package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.RegulatoryApisDetail;
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
  * Apis details containing the ID of an already submitted document or address to be reused for a new request for different flights.
 **/
@ApiModel(description="Apis details containing the ID of an already submitted document or address to be reused for a new request for different flights.")
public class ApisDetailFromReference extends RegulatoryApisDetail {
  
  @ApiModelProperty(value = "request ID of the document or the address to be used for regulatory information.")
 /**
   * request ID of the document or the address to be used for regulatory information.
  **/
  private String referenceId = null;


@XmlType(name="AddressTypeEnum")
@XmlEnum(String.class)
public enum AddressTypeEnum {

@XmlEnumValue("homeAddress") HOMEADDRESS(String.valueOf("homeAddress")), @XmlEnumValue("destinationAddress") DESTINATIONADDRESS(String.valueOf("destinationAddress"));


    private String value;

    AddressTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AddressTypeEnum fromValue(String v) {
        for (AddressTypeEnum b : AddressTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Type of regulatory address to be created from either an other APIS address or a contact address.")
 /**
   * Type of regulatory address to be created from either an other APIS address or a contact address.
  **/
  private AddressTypeEnum addressType = null;
 /**
   * request ID of the document or the address to be used for regulatory information.
   * @return referenceId
  **/
  @JsonProperty("referenceId")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public ApisDetailFromReference referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

 /**
   * Type of regulatory address to be created from either an other APIS address or a contact address.
   * @return addressType
  **/
  @JsonProperty("addressType")
  public String getAddressType() {
    if (addressType == null) {
      return null;
    }
    return addressType.value();
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  public ApisDetailFromReference addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApisDetailFromReference {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
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

