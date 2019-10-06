package com.koreanair.common_adapter.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.koreanair.common_adapter.general.vo.consts.ERetailConsts;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SchemaLocation {

	private static Map<String,String> schemaLocationMap = new HashMap<>();

	static{
		schemaLocationMap.put("OverrideInput", "/common/OverrideInput.xsd");
		schemaLocationMap.put("FlexPricerAvailabilityInput", "/flexpricer/FlexPricerAvailabilityInput.xsd");
		schemaLocationMap.put("AirAvailabilityInput", "/air/AirAvailabilityInput.xsd");
		schemaLocationMap.put("RebookPNRATCInput", "/pnr/RebookPNRATCInput.xsd");
		schemaLocationMap.put("AirComplexAvailabilityInputRequestForComplexAvailability", "/air/AirComplexAvailabilityInputRequestForComplexAvailability.xsd");
		schemaLocationMap.put("SelectFlightAndContinueInput", "/air/SelectFlightAndContinueInput.xsd");
		schemaLocationMap.put("AirModifyInput1", "/pnr/AirModifyInput1.xsd");
		schemaLocationMap.put("ModifyFlightInput", "/air/ModifyFlightInput.xsd");
		schemaLocationMap.put("SelectModifiedFlightInput", "/air/SelectModifiedFlightInput.xsd");
		schemaLocationMap.put("FareInput", "/fare/FareInput.xsd");
		schemaLocationMap.put("AddElementsInput1", "/pnr/AddElementsInput1.xsd");
		schemaLocationMap.put("AddElementsInput2", "/pnr/AddElementsInput2.xsd");
		schemaLocationMap.put("BookTripPlanInput2", "/pnr/BookTripPlanInput2.xsd");
		schemaLocationMap.put("RetrievePNRInput", "/pnr/RetrievePNRInput.xsd");
		schemaLocationMap.put("GenericServicingInput", "/pnr/GenericServicingInput.xsd");
		schemaLocationMap.put("SeatMapInput", "/seatmap/SeatMapInput.xsd");
		schemaLocationMap.put("ComputeServiceSelectionInput", "/pnr/ComputeServiceSelectionInput.xsd");
		schemaLocationMap.put("CurrencyConversionInput", "/converter/CurrencyConversionInput.xsd");
		schemaLocationMap.put("FareRulesInput", "/fareshopper/FareRulesInput.xsd");
		schemaLocationMap.put("MiniRulesInput", "/fare/MiniRulesInput.xsd");
		schemaLocationMap.put("DisplayTripPlanInput", "/pnr/DisplayTripPlanInput.xsd");
	}

	public static String get(Object object){
		log.debug("object.getClass().getSimpleName() = {}", object.getClass().getSimpleName());

		String schemaUrl="http://uat5.aereww.amadeus.com/XMLSchemas/${version}";
		schemaUrl = StringUtils.replace(schemaUrl, "${version}", ERetailConsts.ERETAIL_VERSION);
		return schemaUrl + schemaLocationMap.get(object.getClass().getSimpleName());
	}
}
