package com.koreanair.external.dx.vo;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoyaltyNumbersItem  {
  

@XmlType(name="LoyaltyCodeEnum")
@XmlEnum(String.class)
public enum LoyaltyCodeEnum {

@XmlEnumValue("CD") CD(String.valueOf("CD")), @XmlEnumValue("PC") PC(String.valueOf("PC")), @XmlEnumValue("NIL") NIL(String.valueOf("NIL")), @XmlEnumValue("ID") ID(String.valueOf("ID")), @XmlEnumValue("IT") IT(String.valueOf("IT")), @XmlEnumValue("FT") FT(String.valueOf("FT")), @XmlEnumValue("RC") RC(String.valueOf("RC"));


    private String value;

    LoyaltyCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LoyaltyCodeEnum fromValue(String v) {
        for (LoyaltyCodeEnum b : LoyaltyCodeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "CD: corporate code, PC: promotion code, NIL: nothing, ID: customer identification number, IT: inclusive tour, FT: frequent traveler, RC: rate code")
 /**
   * CD: corporate code, PC: promotion code, NIL: nothing, ID: customer identification number, IT: inclusive tour, FT: frequent traveler, RC: rate code
  **/
  private LoyaltyCodeEnum loyaltyCode = null;

  @ApiModelProperty(value = "This holds the value of a loyalty number")
 /**
   * This holds the value of a loyalty number
  **/
  private String loyaltyNumber = null;
 /**
   * CD: corporate code, PC: promotion code, NIL: nothing, ID: customer identification number, IT: inclusive tour, FT: frequent traveler, RC: rate code
   * @return loyaltyCode
  **/
  @JsonProperty("loyaltyCode")
  public String getLoyaltyCode() {
    if (loyaltyCode == null) {
      return null;
    }
    return loyaltyCode.value();
  }

  public void setLoyaltyCode(LoyaltyCodeEnum loyaltyCode) {
    this.loyaltyCode = loyaltyCode;
  }

  public LoyaltyNumbersItem loyaltyCode(LoyaltyCodeEnum loyaltyCode) {
    this.loyaltyCode = loyaltyCode;
    return this;
  }

 /**
   * This holds the value of a loyalty number
   * @return loyaltyNumber
  **/
  @JsonProperty("loyaltyNumber")
  public String getLoyaltyNumber() {
    return loyaltyNumber;
  }

  public void setLoyaltyNumber(String loyaltyNumber) {
    this.loyaltyNumber = loyaltyNumber;
  }

  public LoyaltyNumbersItem loyaltyNumber(String loyaltyNumber) {
    this.loyaltyNumber = loyaltyNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyNumbersItem {\n");
    
    sb.append("    loyaltyCode: ").append(toIndentedString(loyaltyCode)).append("\n");
    sb.append("    loyaltyNumber: ").append(toIndentedString(loyaltyNumber)).append("\n");
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

