package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.TravelerIdentifier;
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
  * Information regarding a baggage : statuses, weight, bag tag number and associated travelers.
 **/
@ApiModel(description="Information regarding a baggage : statuses, weight, bag tag number and associated travelers.")
public class Baggage  {
  
  @ApiModelProperty(required = true, value = "baggage id")
 /**
   * baggage id
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Traveler ids associated to the bag. Depending on the airline configuration, baggage can be associated to a group of travelers (pool). In a journey, a traveler can only be in one pool. ")
 /**
   * Traveler ids associated to the bag. Depending on the airline configuration, baggage can be associated to a group of travelers (pool). In a journey, a traveler can only be in one pool. 
  **/
  private List<TravelerIdentifier> travelerIds = new ArrayList<>();


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("inactive") INACTIVE(String.valueOf("inactive")), @XmlEnumValue("active") ACTIVE(String.valueOf("active")), @XmlEnumValue("validated") VALIDATED(String.valueOf("validated")), @XmlEnumValue("statusNotSupportedInThisVersion") STATUSNOTSUPPORTEDINTHISVERSION(String.valueOf("statusNotSupportedInThisVersion"));


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

  @ApiModelProperty(required = true, value = "Status of the bag in the system. An inactive baggage needs to be dropped at the bag drop counter. An active baggage is in the airline/airport baggage system. A validated baggage has been seen by an agent at a desk but must be dropped at a special counter by the traveler (special bag cases) ")
 /**
   * Status of the bag in the system. An inactive baggage needs to be dropped at the bag drop counter. An active baggage is in the airline/airport baggage system. A validated baggage has been seen by an agent at a desk but must be dropped at a special counter by the traveler (special bag cases) 
  **/
  private StatusEnum status = null;


@XmlType(name="AcceptanceStatusEnum")
@XmlEnum(String.class)
public enum AcceptanceStatusEnum {

@XmlEnumValue("notAccepted") NOTACCEPTED(String.valueOf("notAccepted")), @XmlEnumValue("fullyAccepted") FULLYACCEPTED(String.valueOf("fullyAccepted")), @XmlEnumValue("standBy") STANDBY(String.valueOf("standBy")), @XmlEnumValue("statusNotSupportedInThisVersion") STATUSNOTSUPPORTEDINTHISVERSION(String.valueOf("statusNotSupportedInThisVersion"));


    private String value;

    AcceptanceStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AcceptanceStatusEnum fromValue(String v) {
        for (AcceptanceStatusEnum b : AcceptanceStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Acceptance status of the bag. If the traveler is on stand by, the bag would be in stand by as well")
 /**
   * Acceptance status of the bag. If the traveler is on stand by, the bag would be in stand by as well
  **/
  private AcceptanceStatusEnum acceptanceStatus = null;

  @ApiModelProperty(value = "Bag tag number assigned to the bag")
 /**
   * Bag tag number assigned to the bag
  **/
  private String bagTagNumber = null;


@XmlType(name="BagTagPrintStatusEnum")
@XmlEnum(String.class)
public enum BagTagPrintStatusEnum {

@XmlEnumValue("printingRequired") PRINTINGREQUIRED(String.valueOf("printingRequired")), @XmlEnumValue("printed") PRINTED(String.valueOf("printed"));


    private String value;

    BagTagPrintStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BagTagPrintStatusEnum fromValue(String v) {
        for (BagTagPrintStatusEnum b : BagTagPrintStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Indicate if the bag tag has to be printed and/or it has been already printed")
 /**
   * Indicate if the bag tag has to be printed and/or it has been already printed
  **/
  private BagTagPrintStatusEnum bagTagPrintStatus = null;

  @ApiModelProperty(value = "Baggage weight (available only once dropped and if the weight was registered at dropping time)")
 /**
   * Baggage weight (available only once dropped and if the weight was registered at dropping time)
  **/
  private String weightAmount = null;


@XmlType(name="WeightUnitEnum")
@XmlEnum(String.class)
public enum WeightUnitEnum {

@XmlEnumValue("kilogram") KILOGRAM(String.valueOf("kilogram")), @XmlEnumValue("pound") POUND(String.valueOf("pound"));


    private String value;

    WeightUnitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WeightUnitEnum fromValue(String v) {
        for (WeightUnitEnum b : WeightUnitEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Weight unit used in baggage allowance")
 /**
   * Weight unit used in baggage allowance
  **/
  private WeightUnitEnum weightUnit = null;

  @ApiModelProperty(value = "If the bag is a special bag, contains its type as filed by the airline.")
 /**
   * If the bag is a special bag, contains its type as filed by the airline.
  **/
  private String specialBagType = null;
 /**
   * baggage id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Baggage id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Traveler ids associated to the bag. Depending on the airline configuration, baggage can be associated to a group of travelers (pool). In a journey, a traveler can only be in one pool. 
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<TravelerIdentifier> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<TravelerIdentifier> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public Baggage travelerIds(List<TravelerIdentifier> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public Baggage addTravelerIdsItem(TravelerIdentifier travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Status of the bag in the system. An inactive baggage needs to be dropped at the bag drop counter. An active baggage is in the airline/airport baggage system. A validated baggage has been seen by an agent at a desk but must be dropped at a special counter by the traveler (special bag cases) 
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

  public Baggage status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Acceptance status of the bag. If the traveler is on stand by, the bag would be in stand by as well
   * @return acceptanceStatus
  **/
  @JsonProperty("acceptanceStatus")
  public String getAcceptanceStatus() {
    if (acceptanceStatus == null) {
      return null;
    }
    return acceptanceStatus.value();
  }

  public void setAcceptanceStatus(AcceptanceStatusEnum acceptanceStatus) {
    this.acceptanceStatus = acceptanceStatus;
  }

  public Baggage acceptanceStatus(AcceptanceStatusEnum acceptanceStatus) {
    this.acceptanceStatus = acceptanceStatus;
    return this;
  }

 /**
   * Bag tag number assigned to the bag
   * @return bagTagNumber
  **/
  @JsonProperty("bagTagNumber")
  public String getBagTagNumber() {
    return bagTagNumber;
  }

  public void setBagTagNumber(String bagTagNumber) {
    this.bagTagNumber = bagTagNumber;
  }

  public Baggage bagTagNumber(String bagTagNumber) {
    this.bagTagNumber = bagTagNumber;
    return this;
  }

 /**
   * Indicate if the bag tag has to be printed and/or it has been already printed
   * @return bagTagPrintStatus
  **/
  @JsonProperty("bagTagPrintStatus")
  public String getBagTagPrintStatus() {
    if (bagTagPrintStatus == null) {
      return null;
    }
    return bagTagPrintStatus.value();
  }

  public void setBagTagPrintStatus(BagTagPrintStatusEnum bagTagPrintStatus) {
    this.bagTagPrintStatus = bagTagPrintStatus;
  }

  public Baggage bagTagPrintStatus(BagTagPrintStatusEnum bagTagPrintStatus) {
    this.bagTagPrintStatus = bagTagPrintStatus;
    return this;
  }

 /**
   * Baggage weight (available only once dropped and if the weight was registered at dropping time)
   * @return weightAmount
  **/
  @JsonProperty("weightAmount")
  public String getWeightAmount() {
    return weightAmount;
  }

  public void setWeightAmount(String weightAmount) {
    this.weightAmount = weightAmount;
  }

  public Baggage weightAmount(String weightAmount) {
    this.weightAmount = weightAmount;
    return this;
  }

 /**
   * Weight unit used in baggage allowance
   * @return weightUnit
  **/
  @JsonProperty("weightUnit")
  public String getWeightUnit() {
    if (weightUnit == null) {
      return null;
    }
    return weightUnit.value();
  }

  public void setWeightUnit(WeightUnitEnum weightUnit) {
    this.weightUnit = weightUnit;
  }

  public Baggage weightUnit(WeightUnitEnum weightUnit) {
    this.weightUnit = weightUnit;
    return this;
  }

 /**
   * If the bag is a special bag, contains its type as filed by the airline.
   * @return specialBagType
  **/
  @JsonProperty("specialBagType")
  public String getSpecialBagType() {
    return specialBagType;
  }

  public void setSpecialBagType(String specialBagType) {
    this.specialBagType = specialBagType;
  }

  public Baggage specialBagType(String specialBagType) {
    this.specialBagType = specialBagType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Baggage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    acceptanceStatus: ").append(toIndentedString(acceptanceStatus)).append("\n");
    sb.append("    bagTagNumber: ").append(toIndentedString(bagTagNumber)).append("\n");
    sb.append("    bagTagPrintStatus: ").append(toIndentedString(bagTagPrintStatus)).append("\n");
    sb.append("    weightAmount: ").append(toIndentedString(weightAmount)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
    sb.append("    specialBagType: ").append(toIndentedString(specialBagType)).append("\n");
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

