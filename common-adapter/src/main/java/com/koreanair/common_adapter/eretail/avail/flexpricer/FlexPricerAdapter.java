package com.koreanair.common_adapter.eretail.avail.flexpricer;

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import org.springframework.stereotype.Component;

import com.koreanair.common.exception.GenericException;
import com.koreanair.common.exception.GenericException.ExceptionCode;
import com.koreanair.common.utils.JAXBFactory;
import com.koreanair.common.utils.ObjectSerializeUtil;
import com.koreanair.common_adapter.eretail.ERetailBaseAdapter;
import com.koreanair.common_adapter.eretail.connector.ERetailConnector;
import com.koreanair.common_adapter.eretail.connector.ERetailSoapConnectorImpl;
import com.koreanair.common_adapter.eretail.helper.FlexPricerHelper;
import com.koreanair.common_adapter.eretail.override.OverrideHelper;
import com.koreanair.common_adapter.eretail.vo.FlexPricerInputVO;
import com.koreanair.common_adapter.eretail.vo.PassengerConditionVO;
import com.koreanair.common_adapter.eretail.vo.SegmentInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerCalendarOutputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerOutputVO;
import com.koreanair.common_adapter.general.vo.consts.PAXType;
import com.koreanair.common_adapter.general.vo.consts.TripType;
import com.koreanair.external.eretail.vo.common.overrideinput.OverrideInput;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityinput.FlexPricerAvailabilityInput;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityoutput.FlexPricerAvailabilityOutput;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FlexPricerAdapter extends ERetailBaseAdapter {

	private ERetailConnector retailCon = new ERetailSoapConnectorImpl();	// SOAPMesage 기반 connector
//	private ERetailConnector retailCon = new ERetailUrlConnectionConnectorImpl();	// URL Connection기반 connector

	private FlexPricerHelper flexPricerHelper = new FlexPricerHelper();
	private OverrideHelper overrideHelper = new OverrideHelper();

	public FlexPricerAdapter() {
		log.debug("FlexPricerAdapter ready!");
	}

	/**
	 * <pre>
	 * FlexPricerInput을 호출하고 그 응답을 받아온다.
	 * </pre>
	 *
	 * @param inputVo
	 * @return
	 * @throws JAXBException
	 * @throws IOException
	 * @throws SOAPException
	 * @throws Exception
	 */
	public FlexPricerOutputVO getFlexPricerAvailability(FlexPricerInputVO inputVo) throws JAXBException, IOException, SOAPException {

		// FlexPricerInput을 구성한다.
		FlexPricerAvailabilityInput flexPricerAvailabilityInput = flexPricerHelper.getFlexPricerAvailabilityInput(inputVo);

		// FlexPricerInput을 OverrideInput에 Embedded 시킨다.
		OverrideInput overrideWithFlexPricerInput = overrideHelper.getEmbeddedOverrideInput(overrideHelper.getDefaultOverrideInput(inputVo.getOfficeId()), flexPricerAvailabilityInput);

		// JAXB Marshal을 할때 한꺼번에 수행되어야 하는 POJO (VO) 를 JAXB instance로 등록한다.
		JAXBFactory.setMultiClassInstance(OverrideInput.class, FlexPricerAvailabilityInput.class, OverrideInput.class, FlexPricerAvailabilityOutput.class );

		log.debug("{}", ObjectSerializeUtil.getObjectToJson(overrideWithFlexPricerInput));
		log.debug("{}", JAXBFactory.getObjectToXML(overrideWithFlexPricerInput));

		// FlexPricerInput을 호출하고 그 응답을 받아온다.
		Object output = retailCon.sendAndReceive(overrideWithFlexPricerInput, FlexPricerAvailabilityOutput.class);

		setJsessionid(retailCon.getJsessionId());	// eRetail의 jsession 정보
		setReturnOriginObject(output);	// 응답받은 Object

		FlexPricerOutputVO flexPricerOutputVO = null;
		if (output instanceof FlexPricerAvailabilityOutput) {
			FlexPricerAvailabilityOutput flexPricerOutput = (FlexPricerAvailabilityOutput) output;
			flexPricerOutputVO = flexPricerHelper.convertOutputVO(flexPricerOutput, retailCon.getJsessionId());
			setReturnObject(flexPricerOutputVO);
		} else {
			// 받아야 할 응답을 받지 못한 경우이기 때문에 error를 throw 한다.
			throw new GenericException(ExceptionCode.BUSINESS_ERROR, "알수없는 응답 수신");
		}

		log.debug("out = {}", JAXBFactory.getObjectToXML(output));
		return flexPricerOutputVO;
	}

	/**
	 * <pre>
	 * FlexPricerAvailabilityInput 을 호출하여 calendar형식의 fare avail을 가져온다.
	 * Created by bdlee on 2019. 10. 16.
	 * </pre>
	 *
	 * @param inputVo
	 * @return
	 * @throws JAXBException
	 * @throws IOException
	 * @throws SOAPException
	 */
	public FlexPricerCalendarOutputVO getFlexPricerCalendarAvailability(FlexPricerInputVO inputVo) throws JAXBException, IOException, SOAPException {

		if (inputVo.getDateRange() <= 0) {
			throw new GenericException(ExceptionCode.BAD_REQUEST, "Calendar Fare 조회를 위해서는 DateRange는 필수 사항입니다.");
		}

		// FlexPricerInput을 구성한다.
		FlexPricerAvailabilityInput flexPricerAvailabilityInput = flexPricerHelper.getFlexPricerAvailabilityInput(inputVo);

		// FlexPricerInput을 OverrideInput에 Embedded 시킨다.
		OverrideInput overrideWithFlexPricerInput = overrideHelper.getEmbeddedOverrideInput(overrideHelper.getDefaultOverrideInput(inputVo.getOfficeId()), flexPricerAvailabilityInput);

		// JAXB Marshal을 할때 한꺼번에 수행되어야 하는 POJO (VO) 를 JAXB instance로 등록한다.
		JAXBFactory.setMultiClassInstance(OverrideInput.class, FlexPricerAvailabilityInput.class, OverrideInput.class, FlexPricerAvailabilityOutput.class );

		// FlexPricerInput을 호출하고 그 응답을 받아온다.
		Object output = retailCon.sendAndReceive(overrideWithFlexPricerInput, FlexPricerAvailabilityOutput.class);

		setJsessionid(retailCon.getJsessionId());	// eRetail의 jsession 정보
		setReturnOriginObject(output);	// 응답받은 Object

		FlexPricerCalendarOutputVO flexPricerCalendarOutputVO = null;
		if (output instanceof FlexPricerAvailabilityOutput) {
			FlexPricerAvailabilityOutput flexPricerOutput = (FlexPricerAvailabilityOutput) output;
			flexPricerCalendarOutputVO = flexPricerHelper.convertCalendarFareOutputVO(flexPricerOutput, retailCon.getJsessionId());
			setReturnObject(flexPricerCalendarOutputVO);
		} else {
			// 받아야 할 응답을 받지 못한 경우이기 때문에 error를 throw 한다.
			throw new GenericException(ExceptionCode.BUSINESS_ERROR, "알수없는 응답 수신");
		}

		log.debug("out = {}", JAXBFactory.getObjectToXML(output));

		return flexPricerCalendarOutputVO;
	}

	public static void main(String[] args) throws Exception {
		FlexPricerAdapter adapter = new FlexPricerAdapter();
		// SELKE08DW
		FlexPricerInputVO inputVo = new FlexPricerInputVO();
		inputVo.setOfficeId("SELKE08IW");
		inputVo.setOfficeId("SELKE08DM");
		inputVo.setDualDisplay(false);
		inputVo.setOnlyCalendarFare(true);
		inputVo.setDateRange(3);
		inputVo.setTripType(TripType.RT);
		inputVo.getCffCodeList().add("DOMECOEY");

		SegmentInfoVO segmentInfo = new SegmentInfoVO();
		segmentInfo.setDepartureAirport("GMP");
		segmentInfo.setArrivalAirport("CJU");
		segmentInfo.setDepartureDateTime("201910270000");
		inputVo.getSegmentInfoList().add(segmentInfo);
		segmentInfo = new SegmentInfoVO();
		segmentInfo.setDepartureAirport("CJU");
		segmentInfo.setArrivalAirport("GMP");
		segmentInfo.setDepartureDateTime("201910290000");
		inputVo.getSegmentInfoList().add(segmentInfo);

		PassengerConditionVO passengerCondition = new PassengerConditionVO();
		passengerCondition.setPassengerType(PAXType.ADT);
		inputVo.getPassengerConditionList().add(passengerCondition);

		passengerCondition = new PassengerConditionVO();
		passengerCondition.setPassengerType(PAXType.CHD);
		inputVo.getPassengerConditionList().add(passengerCondition);

//
//		passengerCondition = new PassengerConditionVO();
//		passengerCondition.setPassengerType(PAXType.CHD);
//
//		PTCDiscountInfoVO defaultPTCDiscountInfo = new PTCDiscountInfoVO();
//		defaultPTCDiscountInfo.setPtCode("CH");
//		passengerCondition.setDefaultPTCDiscountInfo(defaultPTCDiscountInfo);
//		inputVo.getPassengerConditionList().add(passengerCondition);

		//log.debug("{}", ObjectSerializeUtil.getObjectToJson(adapter.getFlexPricerAvailability(inputVo)));
		log.debug("{}", ObjectSerializeUtil.getObjectToJson(adapter.getFlexPricerCalendarAvailability(inputVo)));

	}


}
