package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Provider;
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
  * Set of search criteria applied to generate the recommendation, based on the AAM filing. These information can be re-used to search, in standalone mode, for insurance offers.
 **/
@ApiModel(description="Set of search criteria applied to generate the recommendation, based on the AAM filing. These information can be re-used to search, in standalone mode, for insurance offers.")
public class InsuranceRelevantCriteria  {
  
  @ApiModelProperty(value = "List of Amadeus insurance providers to filter the response by.")
 /**
   * List of Amadeus insurance providers to filter the response by.
  **/
  private List<Provider> providers = null;

  @ApiModelProperty(value = "Code of travel insurance product")
 /**
   * Code of travel insurance product
  **/
  private String productCode = null;
 /**
   * List of Amadeus insurance providers to filter the response by.
   * @return providers
  **/
  @JsonProperty("providers")
  public List<Provider> getProviders() {
    return providers;
  }

  public void setProviders(List<Provider> providers) {
    this.providers = providers;
  }

  public InsuranceRelevantCriteria providers(List<Provider> providers) {
    this.providers = providers;
    return this;
  }

  public InsuranceRelevantCriteria addProvidersItem(Provider providersItem) {
    this.providers.add(providersItem);
    return this;
  }

 /**
   * Code of travel insurance product
   * @return productCode
  **/
  @JsonProperty("productCode")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public InsuranceRelevantCriteria productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceRelevantCriteria {\n");
    
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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

