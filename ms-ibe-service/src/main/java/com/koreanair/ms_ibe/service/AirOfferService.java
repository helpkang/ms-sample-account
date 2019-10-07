package com.koreanair.ms_ibe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreanair.common_adapter.dx.vo.AirOfferInputVO;
import com.koreanair.external.dx.vo.AirOffersListReply;
import com.koreanair.ms_ibe.repository.AirOfferRepository;

@Service
public class AirOfferService {

	@Autowired
    private AirOfferRepository airOfferRepository;

	public AirOffersListReply getAirOfferList(AirOfferInputVO inputVo) {
		return airOfferRepository.getAirOfferList(inputVo);
	}
}