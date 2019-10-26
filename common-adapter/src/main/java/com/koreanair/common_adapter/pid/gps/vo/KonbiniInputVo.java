package com.koreanair.common_adapter.pid.gps.vo;

import com.koreanair.common_external.pid.gps.konbini.KonbiniIN;

public class KonbiniInputVo extends KonbiniIN {

    protected String flightNo;
    protected String route;
    protected String departureDate;
    
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
    
}
