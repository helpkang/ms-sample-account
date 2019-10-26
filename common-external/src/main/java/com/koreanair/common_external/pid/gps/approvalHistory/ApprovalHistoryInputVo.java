//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.12 at 04:24:28 ���� KST 
//

package com.koreanair.common_external.pid.gps.approvalHistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ApprovalHistoryRequestService complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalHistoryRequestService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="historyinfo" type="{http://GPS_Service_Library}historyInfo"/>
 *         &lt;element name="payMthd" type="{http://GPS_Service_Library}PayMthd" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://GPS_Service_Library}Channel" minOccurs="0"/>
 *         &lt;element name="apvStatus" type="{http://GPS_Service_Library}ApvStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalHistoryRequestService", propOrder = { "historyinfo", "payMthd", "channel", "apvStatus",
		"ipAddress", "userId" })
@XmlRootElement(name = "ApprovalHistoryRequestService")
public class ApprovalHistoryInputVo {

	@XmlElement(required = true)
	protected HistoryInfo historyinfo;
	protected PayMthd payMthd;
	protected Channel channel;
	protected ApvStatus apvStatus;
	@XmlElement(name = "IpAddress")
	protected String ipAddress;
	@XmlElement(name = "UserId")
	protected String userId;

	/**
	 * Gets the value of the historyinfo property.
	 * 
	 * @return possible object is {@link HistoryInfo }
	 * 
	 */
	public HistoryInfo getHistoryinfo() {
		return historyinfo;
	}

	/**
	 * Sets the value of the historyinfo property.
	 * 
	 * @param value
	 *            allowed object is {@link HistoryInfo }
	 * 
	 */
	public void setHistoryinfo(HistoryInfo value) {
		this.historyinfo = value;
	}

	/**
	 * Gets the value of the payMthd property.
	 * 
	 * @return possible object is {@link PayMthd }
	 * 
	 */
	public PayMthd getPayMthd() {
		return payMthd;
	}

	/**
	 * Sets the value of the payMthd property.
	 * 
	 * @param value
	 *            allowed object is {@link PayMthd }
	 * 
	 */
	public void setPayMthd(PayMthd value) {
		this.payMthd = value;
	}

	/**
	 * Gets the value of the channel property.
	 * 
	 * @return possible object is {@link Channel }
	 * 
	 */
	public Channel getChannel() {
		return channel;
	}

	/**
	 * Sets the value of the channel property.
	 * 
	 * @param value
	 *            allowed object is {@link Channel }
	 * 
	 */
	public void setChannel(Channel value) {
		this.channel = value;
	}

	/**
	 * Gets the value of the apvStatus property.
	 * 
	 * @return possible object is {@link ApvStatus }
	 * 
	 */
	public ApvStatus getApvStatus() {
		return apvStatus;
	}

	/**
	 * Sets the value of the apvStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link ApvStatus }
	 * 
	 */
	public void setApvStatus(ApvStatus value) {
		this.apvStatus = value;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * Sets the value of the ipAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIpAddress(String value) {
		this.ipAddress = value;
	}

	/**
	 * Gets the value of the userId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the value of the userId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserId(String value) {
		this.userId = value;
	}

}