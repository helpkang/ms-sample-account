package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
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
  * An upgrade, either an option or already applied, for a journey element (one traveler on one flight).
 **/
@ApiModel(description="An upgrade, either an option or already applied, for a journey element (one traveler on one flight).")
public class JourneyElementUpgrade  {
  
  @ApiModelProperty(required = true, value = "ID of this upgrade offer.")
 /**
   * ID of this upgrade offer.
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "ID of the relevant journey element")
 /**
   * ID of the relevant journey element
  **/
  private String journeyElementId = null;


@XmlType(name="UpgradeTypeEnum")
@XmlEnum(String.class)
public enum UpgradeTypeEnum {

@XmlEnumValue("paidUpgrade") PAIDUPGRADE(String.valueOf("paidUpgrade")), @XmlEnumValue("milesUpgrade") MILESUPGRADE(String.valueOf("milesUpgrade")), @XmlEnumValue("creditsUpgrade") CREDITSUPGRADE(String.valueOf("creditsUpgrade"));


    private String value;

    UpgradeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UpgradeTypeEnum fromValue(String v) {
        for (UpgradeTypeEnum b : UpgradeTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of upgrade. Paid upgrade is a standard upgrade for monetary payment, miles upgrade uses airline miles (and possibly money as well), credits upgrade is for airlines that use other types of redemption credits (and possibly money as well).")
 /**
   * Type of upgrade. Paid upgrade is a standard upgrade for monetary payment, miles upgrade uses airline miles (and possibly money as well), credits upgrade is for airlines that use other types of redemption credits (and possibly money as well).
  **/
  private UpgradeTypeEnum upgradeType = null;

  @ApiModelProperty(required = true, value = "Cabin offered by this upgrade")
 /**
   * Cabin offered by this upgrade
  **/
  private String cabin = null;

  @ApiModelProperty(value = "Price of this upgrade. There may be multiple amounts involved,  e.g. upgrade in miles + taxes in monetary")
 /**
   * Price of this upgrade. There may be multiple amounts involved,  e.g. upgrade in miles + taxes in monetary
  **/
  private List<Amount> price = null;
 /**
   * ID of this upgrade offer.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JourneyElementUpgrade id(String id) {
    this.id = id;
    return this;
  }

 /**
   * ID of the relevant journey element
   * @return journeyElementId
  **/
  @JsonProperty("journeyElementId")
  public String getJourneyElementId() {
    return journeyElementId;
  }

  public void setJourneyElementId(String journeyElementId) {
    this.journeyElementId = journeyElementId;
  }

  public JourneyElementUpgrade journeyElementId(String journeyElementId) {
    this.journeyElementId = journeyElementId;
    return this;
  }

 /**
   * Type of upgrade. Paid upgrade is a standard upgrade for monetary payment, miles upgrade uses airline miles (and possibly money as well), credits upgrade is for airlines that use other types of redemption credits (and possibly money as well).
   * @return upgradeType
  **/
  @JsonProperty("upgradeType")
  public String getUpgradeType() {
    if (upgradeType == null) {
      return null;
    }
    return upgradeType.value();
  }

  public void setUpgradeType(UpgradeTypeEnum upgradeType) {
    this.upgradeType = upgradeType;
  }

  public JourneyElementUpgrade upgradeType(UpgradeTypeEnum upgradeType) {
    this.upgradeType = upgradeType;
    return this;
  }

 /**
   * Cabin offered by this upgrade
   * @return cabin
  **/
  @JsonProperty("cabin")
  public String getCabin() {
    return cabin;
  }

  public void setCabin(String cabin) {
    this.cabin = cabin;
  }

  public JourneyElementUpgrade cabin(String cabin) {
    this.cabin = cabin;
    return this;
  }

 /**
   * Price of this upgrade. There may be multiple amounts involved,  e.g. upgrade in miles + taxes in monetary
   * @return price
  **/
  @JsonProperty("price")
  public List<Amount> getPrice() {
    return price;
  }

  public void setPrice(List<Amount> price) {
    this.price = price;
  }

  public JourneyElementUpgrade price(List<Amount> price) {
    this.price = price;
    return this;
  }

  public JourneyElementUpgrade addPriceItem(Amount priceItem) {
    this.price.add(priceItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyElementUpgrade {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    journeyElementId: ").append(toIndentedString(journeyElementId)).append("\n");
    sb.append("    upgradeType: ").append(toIndentedString(upgradeType)).append("\n");
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

