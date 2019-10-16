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
package com.koreanair.ms_ibe.repository;

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koreanair.common_adapter.eretail.avail.flexpricer.FlexPricerAdapter;
import com.koreanair.common_adapter.eretail.vo.FlexPricerInputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerCalendarOutputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerOutputVO;

@Repository
public class AvailabilityRepository {

	@Autowired
	private FlexPricerAdapter flexPricer;

	/**
	 * <pre>
	 * FlexPricerAvail 조회
	 * Created by bdlee on 2019. 10. 16.
	 * </pre>
	 *
	 * @param inputVo
	 * @return
	 * @throws JAXBException
	 * @throws IOException
	 * @throws SOAPException
	 */
	public FlexPricerOutputVO getFlexPricerAvailability(FlexPricerInputVO inputVo) throws JAXBException, IOException, SOAPException {
		return flexPricer.getFlexPricerAvailability(inputVo);
	}

	/**
	 * <pre>
	 * Fare Calendar avail 조회
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
		return flexPricer.getFlexPricerCalendarAvailability(inputVo);
	}

}
