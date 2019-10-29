package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.EligibilityCommon;
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
  * Define the eligibility for boarding pass retrieval (after acceptance)
 **/
@ApiModel(description="Define the eligibility for boarding pass retrieval (after acceptance)")
public class BoardingPassEligibility  {
  

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("eligible") ELIGIBLE(String.valueOf("eligible")), @XmlEnumValue("ineligible") INELIGIBLE(String.valueOf("ineligible")), @XmlEnumValue("partial") PARTIAL(String.valueOf("partial"));


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

  @ApiModelProperty(required = true, value = "Eligibility status")
 /**
   * Eligibility status
  **/
  private StatusEnum status = null;


@XmlType(name="AllowedBoardingPassTypesEnum")
@XmlEnum(String.class)
public enum AllowedBoardingPassTypesEnum {

@XmlEnumValue("airportPrinted") AIRPORTPRINTED(String.valueOf("airportPrinted")), @XmlEnumValue("homePrinted") HOMEPRINTED(String.valueOf("homePrinted")), @XmlEnumValue("barcodeOnDevice") BARCODEONDEVICE(String.valueOf("barcodeOnDevice")), @XmlEnumValue("textMessageOnDevice") TEXTMESSAGEONDEVICE(String.valueOf("textMessageOnDevice"));


    private String value;

    AllowedBoardingPassTypesEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AllowedBoardingPassTypesEnum fromValue(String v) {
        for (AllowedBoardingPassTypesEnum b : AllowedBoardingPassTypesEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The types of boarding pass that the traveler is allowed to receive and use at the airport. Airport Printed = only documents printed at agent desk or on a kiosk are allowed, so the user will not be allowed to retrieve a boarding pass from DAPI Home Printed = the user can download a PDF boarding pass to be printed Barcode On Device = mobile boarding pass (including Apple Wallet and airline-specific applications) Text Message On Device (legacy) = some airports allow access to boarding gates with only a confirmation text message. This is not a mobile boarding pass!")
 /**
   * The types of boarding pass that the traveler is allowed to receive and use at the airport. Airport Printed = only documents printed at agent desk or on a kiosk are allowed, so the user will not be allowed to retrieve a boarding pass from DAPI Home Printed = the user can download a PDF boarding pass to be printed Barcode On Device = mobile boarding pass (including Apple Wallet and airline-specific applications) Text Message On Device (legacy) = some airports allow access to boarding gates with only a confirmation text message. This is not a mobile boarding pass!
  **/
  private List<AllowedBoardingPassTypesEnum> allowedBoardingPassTypes = null;
 /**
   * Eligibility status
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

  public BoardingPassEligibility status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * The types of boarding pass that the traveler is allowed to receive and use at the airport. Airport Printed &#x3D; only documents printed at agent desk or on a kiosk are allowed, so the user will not be allowed to retrieve a boarding pass from DAPI Home Printed &#x3D; the user can download a PDF boarding pass to be printed Barcode On Device &#x3D; mobile boarding pass (including Apple Wallet and airline-specific applications) Text Message On Device (legacy) &#x3D; some airports allow access to boarding gates with only a confirmation text message. This is not a mobile boarding pass!
   * @return allowedBoardingPassTypes
  **/
  @JsonProperty("allowedBoardingPassTypes")
  public List<AllowedBoardingPassTypesEnum> getAllowedBoardingPassTypes() {
    return allowedBoardingPassTypes;
  }

  public void setAllowedBoardingPassTypes(List<AllowedBoardingPassTypesEnum> allowedBoardingPassTypes) {
    this.allowedBoardingPassTypes = allowedBoardingPassTypes;
  }

  public BoardingPassEligibility allowedBoardingPassTypes(List<AllowedBoardingPassTypesEnum> allowedBoardingPassTypes) {
    this.allowedBoardingPassTypes = allowedBoardingPassTypes;
    return this;
  }

  public BoardingPassEligibility addAllowedBoardingPassTypesItem(AllowedBoardingPassTypesEnum allowedBoardingPassTypesItem) {
    this.allowedBoardingPassTypes.add(allowedBoardingPassTypesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassEligibility {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    allowedBoardingPassTypes: ").append(toIndentedString(allowedBoardingPassTypes)).append("\n");
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

