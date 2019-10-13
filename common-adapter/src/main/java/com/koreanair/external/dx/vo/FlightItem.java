package com.koreanair.external.dx.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class FlightItem {

	@ApiModelProperty(required = true, value = "Flight id, as defined in flights dictionary")
	/**
	 * Flight id, as defined in flights dictionary
	 **/
	private String id = null;

	@XmlType(name = "CabinEnum")
	@XmlEnum(String.class)
	public enum CabinEnum {

		@JsonProperty("eco")
		ECO(String.valueOf("eco")),

		@JsonProperty("ecoPremium")
		ECOPREMIUM(String.valueOf("ecoPremium")),

		@JsonProperty("business")
		BUSINESS(String.valueOf("business")),

		@JsonProperty("first")
		FIRST(String.valueOf("first"));

		private String value;

		CabinEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static CabinEnum fromValue(String v) {
			for (CabinEnum b : CabinEnum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	@ApiModelProperty(value = "")
	private CabinEnum cabin = null;

	@ApiModelProperty(value = "Booking class associated to the cabin")
	/**
	 * Booking class associated to the cabin
	 **/
	private String bookingClass = null;

	@ApiModelProperty(value = "Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. At shopping time, the only status that can be returned is HL=Wailist ")
	/**
	 * Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. At shopping time, the only status that can be returned is HL=Wailist
	 **/
	private String statusCode = null;

	@ApiModelProperty(value = "In case of flight connection, it expresses the waiting time until the next flight. Duration expressed in seconds")
	/**
	 * In case of flight connection, it expresses the waiting time until the next flight. Duration expressed in seconds
	 **/
	private Integer connectionTime = null;

	@ApiModelProperty(value = "Order id created on the airline reservation system for the airline of that flight. It could be for example the reservation number created on the PSS of the airline when the airline is not on Altea.")
	/**
	 * Order id created on the airline reservation system for the airline of that flight. It could be for example the reservation number created on the PSS of the airline when the airline is not on Altea.
	 **/
	private String airlineOrderId = null;

	@ApiModelProperty(value = "Number of remaining seats for this flight.  Quota is only returned in case of low availability at shopping time or when performing a Cart refresh.")
	/**
	 * Number of remaining seats for this flight. Quota is only returned in case of low availability at shopping time or when performing a Cart refresh.
	 **/
	private Integer quota = null;

	@ApiModelProperty(value = "Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. 'Example: +2' as departure days difference means the flight will take off '2' days later than first flight took off. ")
	/**
	 * Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. 'Example: +2' as departure days difference means the flight will take off '2' days later than first flight took off.
	 **/
	private Integer departureDaysDifference = null;

	@ApiModelProperty(value = "Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. 'Example: +2' as arrival days difference means the flight will take off '2' days later than first flight took off. ")
	/**
	 * Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. 'Example: +2' as arrival days difference means the flight will take off '2' days later than first flight took off.
	 **/
	private Integer arrivalDaysDifference = null;

	/**
	 * Flight id, as defined in flights dictionary
	 *
	 * @return id
	 **/
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FlightItem id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get cabin
	 *
	 * @return cabin
	 **/
	@JsonProperty("cabin")
	public String getCabin() {
		if (cabin == null) {
			return null;
		}
		return cabin.value();
	}

	public void setCabin(CabinEnum cabin) {
		this.cabin = cabin;
	}

	public FlightItem cabin(CabinEnum cabin) {
		this.cabin = cabin;
		return this;
	}

	/**
	 * Booking class associated to the cabin
	 *
	 * @return bookingClass
	 **/
	@JsonProperty("bookingClass")
	public String getBookingClass() {
		return bookingClass;
	}

	public void setBookingClass(String bookingClass) {
		this.bookingClass = bookingClass;
	}

	public FlightItem bookingClass(String bookingClass) {
		this.bookingClass = bookingClass;
		return this;
	}

	/**
	 * Operational status. HK &#x3D; confirmed, HL &#x3D; waitlist, TK &#x3D; schedule change confirmed, schedule change waitlist, UN &#x3D; unable to confirm not operating, UC &#x3D; unable to confirm, HX &#x3D; have cancelled, NO &#x3D; no action taken. At shopping time, the only status that can be returned is HL&#x3D;Wailist
	 *
	 * @return statusCode
	 **/
	@JsonProperty("statusCode")
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public FlightItem statusCode(String statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	/**
	 * In case of flight connection, it expresses the waiting time until the next flight. Duration expressed in seconds
	 *
	 * @return connectionTime
	 **/
	@JsonProperty("connectionTime")
	public Integer getConnectionTime() {
		return connectionTime;
	}

	public void setConnectionTime(Integer connectionTime) {
		this.connectionTime = connectionTime;
	}

	public FlightItem connectionTime(Integer connectionTime) {
		this.connectionTime = connectionTime;
		return this;
	}

	/**
	 * Order id created on the airline reservation system for the airline of that flight. It could be for example the reservation number created on the PSS of the airline when the airline is not on Altea.
	 *
	 * @return airlineOrderId
	 **/
	@JsonProperty("airlineOrderId")
	public String getAirlineOrderId() {
		return airlineOrderId;
	}

	public void setAirlineOrderId(String airlineOrderId) {
		this.airlineOrderId = airlineOrderId;
	}

	public FlightItem airlineOrderId(String airlineOrderId) {
		this.airlineOrderId = airlineOrderId;
		return this;
	}

	/**
	 * Number of remaining seats for this flight. Quota is only returned in case of low availability at shopping time or when performing a Cart refresh. minimum: 0 maximum: 9
	 *
	 * @return quota
	 **/
	@JsonProperty("quota")
	public Integer getQuota() {
		return quota;
	}

	public void setQuota(Integer quota) {
		this.quota = quota;
	}

	public FlightItem quota(Integer quota) {
		this.quota = quota;
		return this;
	}

	/**
	 * Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. &#39;Example: +2&#39; as departure days difference means the flight will take off &#39;2&#39; days later than first flight took off.
	 *
	 * @return departureDaysDifference
	 **/
	@JsonProperty("departureDaysDifference")
	public Integer getDepartureDaysDifference() {
		return departureDaysDifference;
	}

	public void setDepartureDaysDifference(Integer departureDaysDifference) {
		this.departureDaysDifference = departureDaysDifference;
	}

	public FlightItem departureDaysDifference(Integer departureDaysDifference) {
		this.departureDaysDifference = departureDaysDifference;
		return this;
	}

	/**
	 * Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. &#39;Example: +2&#39; as arrival days difference means the flight will take off &#39;2&#39; days later than first flight took off.
	 *
	 * @return arrivalDaysDifference
	 **/
	@JsonProperty("arrivalDaysDifference")
	public Integer getArrivalDaysDifference() {
		return arrivalDaysDifference;
	}

	public void setArrivalDaysDifference(Integer arrivalDaysDifference) {
		this.arrivalDaysDifference = arrivalDaysDifference;
	}

	public FlightItem arrivalDaysDifference(Integer arrivalDaysDifference) {
		this.arrivalDaysDifference = arrivalDaysDifference;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FlightItem {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
		sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
		sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
		sb.append("    connectionTime: ").append(toIndentedString(connectionTime)).append("\n");
		sb.append("    airlineOrderId: ").append(toIndentedString(airlineOrderId)).append("\n");
		sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
		sb.append("    departureDaysDifference: ").append(toIndentedString(departureDaysDifference)).append("\n");
		sb.append("    arrivalDaysDifference: ").append(toIndentedString(arrivalDaysDifference)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
