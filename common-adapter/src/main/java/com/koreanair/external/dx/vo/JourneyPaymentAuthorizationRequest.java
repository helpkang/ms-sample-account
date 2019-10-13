package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.JourneyPaymentRequest;
import com.koreanair.external.dx.vo.PaymentMethod;
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
  * Input needed to authorize payment. 
 **/
@ApiModel(description="Input needed to authorize payment. ")
public class JourneyPaymentAuthorizationRequest  {
  

@XmlType(name="PaymentOperationTypeEnum")
@XmlEnum(String.class)
public enum PaymentOperationTypeEnum {

@XmlEnumValue("services") SERVICES(String.valueOf("services")), @XmlEnumValue("upgrade") UPGRADE(String.valueOf("upgrade")), @XmlEnumValue("standbyEarly") STANDBYEARLY(String.valueOf("standbyEarly")), @XmlEnumValue("sameDayChange") SAMEDAYCHANGE(String.valueOf("sameDayChange"));


    private String value;

    PaymentOperationTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PaymentOperationTypeEnum fromValue(String v) {
        for (PaymentOperationTypeEnum b : PaymentOperationTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "This defines what needs to be paid as part of this operation. If 'services' no additional input is needed (today all services are paid, filtering has not yet been implemented) If 'upgrade' the 'upgradeIds' array must be filled If 'sameDayChange' or 'standbyEarly', the 'alternativeOfferIds' array must be filled")
 /**
   * This defines what needs to be paid as part of this operation. If 'services' no additional input is needed (today all services are paid, filtering has not yet been implemented) If 'upgrade' the 'upgradeIds' array must be filled If 'sameDayChange' or 'standbyEarly', the 'alternativeOfferIds' array must be filled
  **/
  private PaymentOperationTypeEnum paymentOperationType = null;

  @ApiModelProperty(value = "List of IDs of individual upgrades that the customer has selected")
 /**
   * List of IDs of individual upgrades that the customer has selected
  **/
  private List<String> upgradeIds = null;

  @ApiModelProperty(value = "List of IDs of alternative flight offer being applied.")
 /**
   * List of IDs of alternative flight offer being applied.
  **/
  private List<String> alternativeOfferIds = null;

  @ApiModelProperty(value = "In case of 3D Secure payment managed by Amadeus Payment Platform, the return URL to be called by APP upon validation of the one-time code")
 /**
   * In case of 3D Secure payment managed by Amadeus Payment Platform, the return URL to be called by APP upon validation of the one-time code
  **/
  private String returnURL = null;


@XmlType(name="PaymentActionEnum")
@XmlEnum(String.class)
public enum PaymentActionEnum {

@XmlEnumValue("add") ADD(String.valueOf("add"));


    private String value;

    PaymentActionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PaymentActionEnum fromValue(String v) {
        for (PaymentActionEnum b : PaymentActionEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Payment action to apply. If not passed will default to 'add'. 'add' to add a payment method to be authorized. ")
 /**
   * Payment action to apply. If not passed will default to 'add'. 'add' to add a payment method to be authorized. 
  **/
  private PaymentActionEnum paymentAction = null;

  @ApiModelProperty(value = "PaymentMethod used for this part of the payment. Today only paymentCard is supported The ID and TID fields are not needed ")
 /**
   * PaymentMethod used for this part of the payment. Today only paymentCard is supported The ID and TID fields are not needed 
  **/
  private PaymentMethod paymentMethod = null;
 /**
   * This defines what needs to be paid as part of this operation. If &#39;services&#39; no additional input is needed (today all services are paid, filtering has not yet been implemented) If &#39;upgrade&#39; the &#39;upgradeIds&#39; array must be filled If &#39;sameDayChange&#39; or &#39;standbyEarly&#39;, the &#39;alternativeOfferIds&#39; array must be filled
   * @return paymentOperationType
  **/
  @JsonProperty("paymentOperationType")
  public String getPaymentOperationType() {
    if (paymentOperationType == null) {
      return null;
    }
    return paymentOperationType.value();
  }

  public void setPaymentOperationType(PaymentOperationTypeEnum paymentOperationType) {
    this.paymentOperationType = paymentOperationType;
  }

  public JourneyPaymentAuthorizationRequest paymentOperationType(PaymentOperationTypeEnum paymentOperationType) {
    this.paymentOperationType = paymentOperationType;
    return this;
  }

 /**
   * List of IDs of individual upgrades that the customer has selected
   * @return upgradeIds
  **/
  @JsonProperty("upgradeIds")
  public List<String> getUpgradeIds() {
    return upgradeIds;
  }

  public void setUpgradeIds(List<String> upgradeIds) {
    this.upgradeIds = upgradeIds;
  }

  public JourneyPaymentAuthorizationRequest upgradeIds(List<String> upgradeIds) {
    this.upgradeIds = upgradeIds;
    return this;
  }

  public JourneyPaymentAuthorizationRequest addUpgradeIdsItem(String upgradeIdsItem) {
    this.upgradeIds.add(upgradeIdsItem);
    return this;
  }

 /**
   * List of IDs of alternative flight offer being applied.
   * @return alternativeOfferIds
  **/
  @JsonProperty("alternativeOfferIds")
  public List<String> getAlternativeOfferIds() {
    return alternativeOfferIds;
  }

  public void setAlternativeOfferIds(List<String> alternativeOfferIds) {
    this.alternativeOfferIds = alternativeOfferIds;
  }

  public JourneyPaymentAuthorizationRequest alternativeOfferIds(List<String> alternativeOfferIds) {
    this.alternativeOfferIds = alternativeOfferIds;
    return this;
  }

  public JourneyPaymentAuthorizationRequest addAlternativeOfferIdsItem(String alternativeOfferIdsItem) {
    this.alternativeOfferIds.add(alternativeOfferIdsItem);
    return this;
  }

 /**
   * In case of 3D Secure payment managed by Amadeus Payment Platform, the return URL to be called by APP upon validation of the one-time code
   * @return returnURL
  **/
  @JsonProperty("returnURL")
  public String getReturnURL() {
    return returnURL;
  }

  public void setReturnURL(String returnURL) {
    this.returnURL = returnURL;
  }

  public JourneyPaymentAuthorizationRequest returnURL(String returnURL) {
    this.returnURL = returnURL;
    return this;
  }

 /**
   * Payment action to apply. If not passed will default to &#39;add&#39;. &#39;add&#39; to add a payment method to be authorized. 
   * @return paymentAction
  **/
  @JsonProperty("paymentAction")
  public String getPaymentAction() {
    if (paymentAction == null) {
      return null;
    }
    return paymentAction.value();
  }

  public void setPaymentAction(PaymentActionEnum paymentAction) {
    this.paymentAction = paymentAction;
  }

  public JourneyPaymentAuthorizationRequest paymentAction(PaymentActionEnum paymentAction) {
    this.paymentAction = paymentAction;
    return this;
  }

 /**
   * PaymentMethod used for this part of the payment. Today only paymentCard is supported The ID and TID fields are not needed 
   * @return paymentMethod
  **/
  @JsonProperty("paymentMethod")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public JourneyPaymentAuthorizationRequest paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyPaymentAuthorizationRequest {\n");
    
    sb.append("    paymentOperationType: ").append(toIndentedString(paymentOperationType)).append("\n");
    sb.append("    upgradeIds: ").append(toIndentedString(upgradeIds)).append("\n");
    sb.append("    alternativeOfferIds: ").append(toIndentedString(alternativeOfferIds)).append("\n");
    sb.append("    returnURL: ").append(toIndentedString(returnURL)).append("\n");
    sb.append("    paymentAction: ").append(toIndentedString(paymentAction)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

