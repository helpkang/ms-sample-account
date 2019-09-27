package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Image;
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

public class Vehicle  {
  
  @ApiModelProperty(required = true, value = "Car ACRISS code")
 /**
   * Car ACRISS code
  **/
  private String acrissCode = null;

  @ApiModelProperty(value = "Car model, e.g. Polo or similar")
 /**
   * Car model, e.g. Polo or similar
  **/
  private String carModel = null;

  @ApiModelProperty(value = "Number of front seats")
 /**
   * Number of front seats
  **/
  private Integer frontSeats = null;

  @ApiModelProperty(value = "Number of back seats")
 /**
   * Number of back seats
  **/
  private Integer rearSeats = null;

  @ApiModelProperty(value = "Number of doors")
 /**
   * Number of doors
  **/
  private Integer doors = null;

  @ApiModelProperty(value = "Number of passengers")
 /**
   * Number of passengers
  **/
  private Integer passengerCapacity = null;

  @ApiModelProperty(value = "Number of small baggages supported")
 /**
   * Number of small baggages supported
  **/
  private Integer smallBaggageCapacity = null;

  @ApiModelProperty(value = "Number of large baggages supported")
 /**
   * Number of large baggages supported
  **/
  private Integer largeBaggageCapacity = null;

  @ApiModelProperty(value = "Boot size in liters")
 /**
   * Boot size in liters
  **/
  private Integer bootSize = null;

  @ApiModelProperty(value = "This field is present in the carOffers output if multimedia images are available for the rate and when requested in the input by using the parameter 'vehicleImageSizes'")
 /**
   * This field is present in the carOffers output if multimedia images are available for the rate and when requested in the input by using the parameter 'vehicleImageSizes'
  **/
  private List<Image> images = null;
 /**
   * Car ACRISS code
   * @return acrissCode
  **/
  @JsonProperty("acrissCode")
  public String getAcrissCode() {
    return acrissCode;
  }

  public void setAcrissCode(String acrissCode) {
    this.acrissCode = acrissCode;
  }

  public Vehicle acrissCode(String acrissCode) {
    this.acrissCode = acrissCode;
    return this;
  }

 /**
   * Car model, e.g. Polo or similar
   * @return carModel
  **/
  @JsonProperty("carModel")
  public String getCarModel() {
    return carModel;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public Vehicle carModel(String carModel) {
    this.carModel = carModel;
    return this;
  }

 /**
   * Number of front seats
   * @return frontSeats
  **/
  @JsonProperty("frontSeats")
  public Integer getFrontSeats() {
    return frontSeats;
  }

  public void setFrontSeats(Integer frontSeats) {
    this.frontSeats = frontSeats;
  }

  public Vehicle frontSeats(Integer frontSeats) {
    this.frontSeats = frontSeats;
    return this;
  }

 /**
   * Number of back seats
   * @return rearSeats
  **/
  @JsonProperty("rearSeats")
  public Integer getRearSeats() {
    return rearSeats;
  }

  public void setRearSeats(Integer rearSeats) {
    this.rearSeats = rearSeats;
  }

  public Vehicle rearSeats(Integer rearSeats) {
    this.rearSeats = rearSeats;
    return this;
  }

 /**
   * Number of doors
   * @return doors
  **/
  @JsonProperty("doors")
  public Integer getDoors() {
    return doors;
  }

  public void setDoors(Integer doors) {
    this.doors = doors;
  }

  public Vehicle doors(Integer doors) {
    this.doors = doors;
    return this;
  }

 /**
   * Number of passengers
   * @return passengerCapacity
  **/
  @JsonProperty("passengerCapacity")
  public Integer getPassengerCapacity() {
    return passengerCapacity;
  }

  public void setPassengerCapacity(Integer passengerCapacity) {
    this.passengerCapacity = passengerCapacity;
  }

  public Vehicle passengerCapacity(Integer passengerCapacity) {
    this.passengerCapacity = passengerCapacity;
    return this;
  }

 /**
   * Number of small baggages supported
   * @return smallBaggageCapacity
  **/
  @JsonProperty("smallBaggageCapacity")
  public Integer getSmallBaggageCapacity() {
    return smallBaggageCapacity;
  }

  public void setSmallBaggageCapacity(Integer smallBaggageCapacity) {
    this.smallBaggageCapacity = smallBaggageCapacity;
  }

  public Vehicle smallBaggageCapacity(Integer smallBaggageCapacity) {
    this.smallBaggageCapacity = smallBaggageCapacity;
    return this;
  }

 /**
   * Number of large baggages supported
   * @return largeBaggageCapacity
  **/
  @JsonProperty("largeBaggageCapacity")
  public Integer getLargeBaggageCapacity() {
    return largeBaggageCapacity;
  }

  public void setLargeBaggageCapacity(Integer largeBaggageCapacity) {
    this.largeBaggageCapacity = largeBaggageCapacity;
  }

  public Vehicle largeBaggageCapacity(Integer largeBaggageCapacity) {
    this.largeBaggageCapacity = largeBaggageCapacity;
    return this;
  }

 /**
   * Boot size in liters
   * @return bootSize
  **/
  @JsonProperty("bootSize")
  public Integer getBootSize() {
    return bootSize;
  }

  public void setBootSize(Integer bootSize) {
    this.bootSize = bootSize;
  }

  public Vehicle bootSize(Integer bootSize) {
    this.bootSize = bootSize;
    return this;
  }

 /**
   * This field is present in the carOffers output if multimedia images are available for the rate and when requested in the input by using the parameter &#39;vehicleImageSizes&#39;
   * @return images
  **/
  @JsonProperty("images")
  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public Vehicle images(List<Image> images) {
    this.images = images;
    return this;
  }

  public Vehicle addImagesItem(Image imagesItem) {
    this.images.add(imagesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    acrissCode: ").append(toIndentedString(acrissCode)).append("\n");
    sb.append("    carModel: ").append(toIndentedString(carModel)).append("\n");
    sb.append("    frontSeats: ").append(toIndentedString(frontSeats)).append("\n");
    sb.append("    rearSeats: ").append(toIndentedString(rearSeats)).append("\n");
    sb.append("    doors: ").append(toIndentedString(doors)).append("\n");
    sb.append("    passengerCapacity: ").append(toIndentedString(passengerCapacity)).append("\n");
    sb.append("    smallBaggageCapacity: ").append(toIndentedString(smallBaggageCapacity)).append("\n");
    sb.append("    largeBaggageCapacity: ").append(toIndentedString(largeBaggageCapacity)).append("\n");
    sb.append("    bootSize: ").append(toIndentedString(bootSize)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

