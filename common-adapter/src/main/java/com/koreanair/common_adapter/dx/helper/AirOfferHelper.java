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
package com.koreanair.common_adapter.dx.helper;

import com.koreanair.external.dx.vo.AirOffer;
import com.koreanair.external.dx.vo.AirOfferItem;
import com.koreanair.external.dx.vo.AirOffersListReply;

public class AirOfferHelper {

	/**
	 * <pre>
	 * airOfferList에 중복된 값이나 사용하지 않는 값을 제거한다.
	 * </pre>
	 *
	 * @param airOffers
	 * @return
	 */
	public AirOffersListReply optimizeAirOfferReply(AirOffersListReply airOffers) {
		for(AirOffer offer : airOffers.getData().getAirOffers()) {
			for(AirOfferItem offerItem : offer.getOfferItems()) {
				offerItem.setPrices(null);
				offerItem.getAir().setFareInfos(null);
			}
		}
		airOffers.getDictionaries().setLocation(null);
		airOffers.getDictionaries().setCountry(null);
		airOffers.getDictionaries().setAnonymousTraveler(null);
		return airOffers;
	}
}
