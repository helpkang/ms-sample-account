package com.koreanair.ms_ibe.service;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreanair.common_adapter.dx.vo.AirOfferInputVO;
import com.koreanair.external.dx.vo.AirOffersListReply;
import com.koreanair.ms_ibe.helper.AvailabilityHelper;
import com.koreanair.ms_ibe.repository.AirOfferRepository;
import com.koreanair.ms_ibe.service.vo.availability.BookingCriteriaVO;

@Service
public class AirOfferService {

	@Autowired
    private AirOfferRepository airOfferRepository;

	@Autowired
	private AvailabilityHelper availHelper;

	public AirOffersListReply getAirOfferList(BookingCriteriaVO inputVo) throws ParseException {
		AirOfferInputVO  airOfferInput = availHelper.bookingCriteria2AirOfferInput(inputVo);	// 조회조건을 AirOffer input 형태로 변경
		return airOfferRepository.getAirOfferList(airOfferInput);
	}
}