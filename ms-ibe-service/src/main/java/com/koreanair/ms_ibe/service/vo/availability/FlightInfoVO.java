/*
 * Copyright 2011-2019 Koreanair.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.koreanair.ms_ibe.service.vo.availability;

import lombok.Data;

@Data
public class FlightInfoVO {
	private boolean	isCodeShare				= false;
	private boolean	isPrimary				= false;
	private boolean	isLayover				= false;
	private String	carrierCode				= "";
	private String	carrierName				= "";
	private String	flightNo				= "";
	private String	operationCarrierCode	= "";
	private String	operationCarrierName	= "";
	private String	operationFlightNo		= "";
	private String	departureCountry		= "";
	private String	arrivalCountry			= "";
	private String	departureAirport		= "";
	private String	arrivalAirport			= "";
	private String	departureAirportDesc	= "";
	private String	arrivalAirportDesc		= "";
	private String	departureDate			= "";
	private String	departureDateOfSchedule	= "";
	private String	arrivalDate				= "";
	private String	arrivalDateOfSchedule	= "";
	private String	departureCity			= "";
	private String	departureCityDesc		= "";
	private String	arrivalCity				= "";
	private String	arrivalCityDesc			= "";
	private String	aircraftType			= "";
	private String	aircraftTypeDesc		= "";
	private String	flyingTime				= "";
	private String	numberOfStops			= "";
}