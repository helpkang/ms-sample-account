/*
 * Copyright 2011-2019 KoreanAir
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
package com.koreanair.common_adapter.general.vo.consts;

public class ERetailTransactionId {

	private  ERetailTransactionId() {
		throw new IllegalStateException("Consts class");
	}

	// TRANSACTION_ID
	public static final String FLEX_PRICER_AVAILABILITY 			= "FlexPricerAvailability";
	public static final String FLEX_PRICER_AWARD_AVAILABILITY 		= "FlexPricerAwardAvailability";
	public static final String AIR_AVAILABILITY 					= "AirAvailability";
	public static final String AIR_COMPLEX_AVAILABILITY 			= "AirComplexAvailability";
	public static final String AIR_COMPLEX_AVAILABILITY_CONTINUE	= "AirSelectFlightAndContinue";
	public static final String FARE 								= "Fare";
	public static final String ADD_ELEMENTS 						= "AddElements";
	public static final String BOOK_TRIP_PLAN 						= "BookTripPlan";
	public static final String RETRIEVE_PNR 						= "RetrievePNR";
	public static final String REBOOK_PNR_ATC 						= "RebookPNRATC";
	public static final String AIR_AVAILABILITY_FOR_REBOOKING 		= "AirAvailabilityForRebooking";
}
