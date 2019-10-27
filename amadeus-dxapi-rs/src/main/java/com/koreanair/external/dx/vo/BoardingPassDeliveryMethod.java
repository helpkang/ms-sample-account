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
  * Delivery method selected to provide the boarding passes. All requested boarding passes with be delivered with the same method. For more information on a specific type of boarding pass delivery method, please see the page [Boarding Pass Delivery Methods documentation](http://aek.lon.amadeus.net/swagger/ui/boarding_pass_delivery_methods.html#!/BoardingPassDeliveryMethodType/get). 
 **/
@ApiModel(description="Delivery method selected to provide the boarding passes. All requested boarding passes with be delivered with the same method. For more information on a specific type of boarding pass delivery method, please see the page [Boarding Pass Delivery Methods documentation](http://aek.lon.amadeus.net/swagger/ui/boarding_pass_delivery_methods.html#!/BoardingPassDeliveryMethodType/get). ")
public class BoardingPassDeliveryMethod  {
  

@XmlType(name="DeliveryMethodTypeEnum")
@XmlEnum(String.class)
public enum DeliveryMethodTypeEnum {

@XmlEnumValue("BoardingPassSmsDelivery") BOARDINGPASSSMSDELIVERY(String.valueOf("BoardingPassSmsDelivery")), @XmlEnumValue("BoardingPassEmailDelivery") BOARDINGPASSEMAILDELIVERY(String.valueOf("BoardingPassEmailDelivery")), @XmlEnumValue("BoardingPassInResponseDelivery") BOARDINGPASSINRESPONSEDELIVERY(String.valueOf("BoardingPassInResponseDelivery"));


    private String value;

    DeliveryMethodTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DeliveryMethodTypeEnum fromValue(String v) {
        for (DeliveryMethodTypeEnum b : DeliveryMethodTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Delivery method type to be used to deliver boarding passes. Used to determine the object used to hold the information. To see the structure of the different boarding pass delivery methods, please check [Boarding Pass Delivery Methods documentation](http://aek.lon.amadeus.net/swagger/ui/boarding_pass_delivery_methods.html#!/BoardingPassDeliveryMethodType/get). ")
 /**
   * Delivery method type to be used to deliver boarding passes. Used to determine the object used to hold the information. To see the structure of the different boarding pass delivery methods, please check [Boarding Pass Delivery Methods documentation](http://aek.lon.amadeus.net/swagger/ui/boarding_pass_delivery_methods.html#!/BoardingPassDeliveryMethodType/get). 
  **/
  private DeliveryMethodTypeEnum deliveryMethodType = null;
 /**
   * Delivery method type to be used to deliver boarding passes. Used to determine the object used to hold the information. To see the structure of the different boarding pass delivery methods, please check [Boarding Pass Delivery Methods documentation](http://aek.lon.amadeus.net/swagger/ui/boarding_pass_delivery_methods.html#!/BoardingPassDeliveryMethodType/get). 
   * @return deliveryMethodType
  **/
  @JsonProperty("deliveryMethodType")
  public String getDeliveryMethodType() {
    if (deliveryMethodType == null) {
      return null;
    }
    return deliveryMethodType.value();
  }

  public void setDeliveryMethodType(DeliveryMethodTypeEnum deliveryMethodType) {
    this.deliveryMethodType = deliveryMethodType;
  }

  public BoardingPassDeliveryMethod deliveryMethodType(DeliveryMethodTypeEnum deliveryMethodType) {
    this.deliveryMethodType = deliveryMethodType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassDeliveryMethod {\n");
    
    sb.append("    deliveryMethodType: ").append(toIndentedString(deliveryMethodType)).append("\n");
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

