package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.NotificationIdentity;
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
  * The request for a notification. 
 **/
@ApiModel(description="The request for a notification. ")
public class NotificationRequest  {
  

@XmlType(name="ContentTypeEnum")
@XmlEnum(String.class)
public enum ContentTypeEnum {

@XmlEnumValue("travelDocumentReceipt") TRAVELDOCUMENTRECEIPT(String.valueOf("travelDocumentReceipt")), @XmlEnumValue("itinerary") ITINERARY(String.valueOf("itinerary")), @XmlEnumValue("invoice") INVOICE(String.valueOf("invoice"));


    private String value;

    ContentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String v) {
        for (ContentTypeEnum b : ContentTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The content type of the notification. Possible content types are:  - ``travelDocumentReceipt`` A receipt containing all travel documents in this order, also referred to as ITR/EPR. It can be used as a purchase confirmation document. - ``itinerary`` The itinerary shows a detailed information about the trip in this order. - ``invoice`` The invoice  is a commercial document for record keeping and accounting.  It contains a basic itinerary and details all purchased travel documents with prices. ")
 /**
   * The content type of the notification. Possible content types are:  - ``travelDocumentReceipt`` A receipt containing all travel documents in this order, also referred to as ITR/EPR. It can be used as a purchase confirmation document. - ``itinerary`` The itinerary shows a detailed information about the trip in this order. - ``invoice`` The invoice  is a commercial document for record keeping and accounting.  It contains a basic itinerary and details all purchased travel documents with prices. 
  **/
  private ContentTypeEnum contentType = null;


@XmlType(name="FormatEnum")
@XmlEnum(String.class)
public enum FormatEnum {

@XmlEnumValue("email") EMAIL(String.valueOf("email")), @XmlEnumValue("link") LINK(String.valueOf("link"));


    private String value;

    FormatEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FormatEnum fromValue(String v) {
        for (FormatEnum b : FormatEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The format of the notification. Possible formats are:  - ``email`` An email containing the requested contentType will be sent.  - ``link`` The content will be created at a dedicated URL. Please note that not only travelDocumentReceipt currently supports this format. ")
 /**
   * The format of the notification. Possible formats are:  - ``email`` An email containing the requested contentType will be sent.  - ``link`` The content will be created at a dedicated URL. Please note that not only travelDocumentReceipt currently supports this format. 
  **/
  private FormatEnum format = null;

  @ApiModelProperty(value = "List of to contactIds from this cart or order to use for notification by email.")
 /**
   * List of to contactIds from this cart or order to use for notification by email.
  **/
  private List<String> contactIds = null;
 /**
   * The content type of the notification. Possible content types are:  - &#x60;&#x60;travelDocumentReceipt&#x60;&#x60; A receipt containing all travel documents in this order, also referred to as ITR/EPR. It can be used as a purchase confirmation document. - &#x60;&#x60;itinerary&#x60;&#x60; The itinerary shows a detailed information about the trip in this order. - &#x60;&#x60;invoice&#x60;&#x60; The invoice  is a commercial document for record keeping and accounting.  It contains a basic itinerary and details all purchased travel documents with prices. 
   * @return contentType
  **/
  @JsonProperty("contentType")
  public String getContentType() {
    if (contentType == null) {
      return null;
    }
    return contentType.value();
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public NotificationRequest contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * The format of the notification. Possible formats are:  - &#x60;&#x60;email&#x60;&#x60; An email containing the requested contentType will be sent.  - &#x60;&#x60;link&#x60;&#x60; The content will be created at a dedicated URL. Please note that not only travelDocumentReceipt currently supports this format. 
   * @return format
  **/
  @JsonProperty("format")
  public String getFormat() {
    if (format == null) {
      return null;
    }
    return format.value();
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public NotificationRequest format(FormatEnum format) {
    this.format = format;
    return this;
  }

 /**
   * List of to contactIds from this cart or order to use for notification by email.
   * @return contactIds
  **/
  @JsonProperty("contactIds")
  public List<String> getContactIds() {
    return contactIds;
  }

  public void setContactIds(List<String> contactIds) {
    this.contactIds = contactIds;
  }

  public NotificationRequest contactIds(List<String> contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  public NotificationRequest addContactIdsItem(String contactIdsItem) {
    this.contactIds.add(contactIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRequest {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
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

