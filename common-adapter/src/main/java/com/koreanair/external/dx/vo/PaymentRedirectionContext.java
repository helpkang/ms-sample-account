package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.HttpRequest;
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
  * List of call-back urls to be used when performing a payment authorization with redirection. 
 **/
@ApiModel(description="List of call-back urls to be used when performing a payment authorization with redirection. ")
public class PaymentRedirectionContext  {
  
  @ApiModelProperty(value = "Valid rel values are: 'successCallbackURL', 'failCallbackURL' and 'keepAliveCallbackURL' for AlternativePaymentMethod, and 'termURL' for PaymentCard enrolled for 3D Secure. ")
 /**
   * Valid rel values are: 'successCallbackURL', 'failCallbackURL' and 'keepAliveCallbackURL' for AlternativePaymentMethod, and 'termURL' for PaymentCard enrolled for 3D Secure. 
  **/
  private List<HttpRequest> links = null;
 /**
   * Valid rel values are: &#39;successCallbackURL&#39;, &#39;failCallbackURL&#39; and &#39;keepAliveCallbackURL&#39; for AlternativePaymentMethod, and &#39;termURL&#39; for PaymentCard enrolled for 3D Secure. 
   * @return links
  **/
  @JsonProperty("links")
  public List<HttpRequest> getLinks() {
    return links;
  }

  public void setLinks(List<HttpRequest> links) {
    this.links = links;
  }

  public PaymentRedirectionContext links(List<HttpRequest> links) {
    this.links = links;
    return this;
  }

  public PaymentRedirectionContext addLinksItem(HttpRequest linksItem) {
    this.links.add(linksItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRedirectionContext {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

