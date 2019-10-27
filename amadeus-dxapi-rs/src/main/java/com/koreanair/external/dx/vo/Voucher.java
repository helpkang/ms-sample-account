package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ItemCommon;
import com.koreanair.external.dx.vo.VoucherEligibilities;
import com.koreanair.external.dx.vo.VoucherValue;
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
  * Voucher collecting money from one or more travellers to be used to buy a trip
 **/
@ApiModel(description="Voucher collecting money from one or more travellers to be used to buy a trip")
public class Voucher  {
  
  @ApiModelProperty(value = "Identifier of the resource. not read / taken into account when creating a resource")
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
  **/
  private String id = null;

  @ApiModelProperty(example = "6X", required = true, value = "The airline issuing the voucher")
 /**
   * The airline issuing the voucher
  **/
  private String airlineCode = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("Active") ACTIVE(String.valueOf("Active")), @XmlEnumValue("Used") USED(String.valueOf("Used")), @XmlEnumValue("Cancelled") CANCELLED(String.valueOf("Cancelled")), @XmlEnumValue("Expired") EXPIRED(String.valueOf("Expired"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "Active/Used/Cancelled/Expired", required = true, value = "Actual status of the voucher")
 /**
   * Actual status of the voucher
  **/
  private StatusEnum status = StatusEnum.ACTIVE;

  @ApiModelProperty(example = "Summer", required = true, value = "The category under which the voucher is applying")
 /**
   * The category under which the voucher is applying
  **/
  private String category = null;

  @ApiModelProperty(example = "2018 Promo", value = "A more detailed description on the category of the voucher")
 /**
   * A more detailed description on the category of the voucher
  **/
  private String subCategory = null;

  @ApiModelProperty(required = true, value = "Value of the voucher")
 /**
   * Value of the voucher
  **/
  private VoucherValue value = null;

  @ApiModelProperty(required = true, value = "What is the voucher is eligible for")
 /**
   * What is the voucher is eligible for
  **/
  private VoucherEligibilities voucherEligibilities = null;
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

  public Voucher id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The airline issuing the voucher
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public Voucher airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

 /**
   * Actual status of the voucher
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Voucher status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * The category under which the voucher is applying
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Voucher category(String category) {
    this.category = category;
    return this;
  }

 /**
   * A more detailed description on the category of the voucher
   * @return subCategory
  **/
  @JsonProperty("subCategory")
  public String getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }

  public Voucher subCategory(String subCategory) {
    this.subCategory = subCategory;
    return this;
  }

 /**
   * Value of the voucher
   * @return value
  **/
  @JsonProperty("value")
  public VoucherValue getValue() {
    return value;
  }

  public void setValue(VoucherValue value) {
    this.value = value;
  }

  public Voucher value(VoucherValue value) {
    this.value = value;
    return this;
  }

 /**
   * What is the voucher is eligible for
   * @return voucherEligibilities
  **/
  @JsonProperty("voucherEligibilities")
  public VoucherEligibilities getVoucherEligibilities() {
    return voucherEligibilities;
  }

  public void setVoucherEligibilities(VoucherEligibilities voucherEligibilities) {
    this.voucherEligibilities = voucherEligibilities;
  }

  public Voucher voucherEligibilities(VoucherEligibilities voucherEligibilities) {
    this.voucherEligibilities = voucherEligibilities;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Voucher {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    voucherEligibilities: ").append(toIndentedString(voucherEligibilities)).append("\n");
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

