/*
 * Copyright 2011-2019 AsianaIDT Inc.
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
package com.koreanair.common_adapter.eretail.avail.flexpricer;

import java.math.BigInteger;
import java.util.List;

import com.koreanair.common_adapter.general.vo.consts.ERetailTransactionId;
import com.koreanair.external.eretail.vo.fare.farecommonoutput.LISTFARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOPTCLISTPTCType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOPTCType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTLISTTRAVELLERType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTTRAVELLERType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.LISTTRAVELLERINFOType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityinputtype.FlexPricerAvailabilityInputType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityinputtype.LISTPRICINGOPTIONSTypeFlex;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.COMMERCIALFAREFAMILYInputType;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.DATERANGE;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.LISTDESTINATION;


public class FlexPricerAdapter {
	private void getFlexPricerAvailability() {
		// fix된 값
		FlexPricerAvailabilityInputType flexPricerAvailabilityInput = new FlexPricerAvailabilityInputType();
		flexPricerAvailabilityInput.setTRANSACTIONID(ERetailTransactionId.FLEX_PRICER_AVAILABILITY);
		flexPricerAvailabilityInput.setSITE(CommonConstants.SITE_REVENUE);
		flexPricerAvailabilityInput.setLANGUAGE(CommonConstants.LANGUAGE);
		flexPricerAvailabilityInput.setARRANGEBY(CommonConstants.ARRANGE_BY);
		flexPricerAvailabilityInput.setPRICINGTYPE("C");
		flexPricerAvailabilityInput.setDISPLAYTYPE(BigInteger.valueOf(2));

		// 좌석등급 셋팅 (모든 CFF 조회)
		List<COMMERCIALFAREFAMILYInputType> fareFamilyList = flexPricerAvailabilityInput.getLISTCOMMERCIALFAREFAMILY();
		COMMERCIALFAREFAMILYInputType fareFamily = new COMMERCIALFAREFAMILYInputType();
		fareFamily.setCODE(CommonConstants.CABIN_DOM_ECONOMY);
		fareFamilyList.add(fareFamily);

		flexPricerAvailabilityInput.setTRIPTYPE(flexPricerAvailabilityInputForm.getTripType());
		List<LISTDESTINATION> listDestination = flexPricerAvailabilityInput.getLISTDESTINATION();
		for (int i = 0; i < flexPricerAvailabilityInputForm.getBoundInformationList().size(); i++) {
			BoundInfo boundInfo = flexPricerAvailabilityInputForm.getBoundInformationList().get(i);
			LISTDESTINATION destination = new LISTDESTINATION();
			destination.setBLOCATION(boundInfo.getDepartureLocationCode());
			destination.setELOCATION(boundInfo.getArrivalLocationCode());
			destination.setBDATE(boundInfo.getDepartureDate() + "0000");
			destination.setBANYTIME(true);
			if (null != flexPricerAvailabilityInputForm.getFlexibleDateRange() && !"0".equals(flexPricerAvailabilityInputForm.getFlexibleDateRange())) {
				DATERANGE value = new DATERANGE();
				value.setQUALIFIER("C");
				value.setVALUE(flexPricerAvailabilityInputForm.getFlexibleDateRange());
				destination.setDATERANGE(value);
			}
			listDestination.add(destination);
		}
		// 승객 인원과 타입에 대한 정보를 구성한다.
		int travellerCnt = Integer.parseInt(flexPricerAvailabilityInputForm.getAdultCount()) + Integer.parseInt(flexPricerAvailabilityInputForm.getChildCount());
		List<INPUTLISTTRAVELLERType> travellerList = flexPricerAvailabilityInput.getLISTTRAVELLER();
		List<LISTTRAVELLERINFOType> discountList = flexPricerAvailabilityInput.getLISTTRAVELLERINFO();
		int j = 0;
		for (int i = 0; i < travellerCnt; i++) {
			INPUTLISTTRAVELLERType travellerInfomation = new INPUTLISTTRAVELLERType();
			INPUTTRAVELLERType inputtravellerType = new INPUTTRAVELLERType();
			if (i < Integer.parseInt(flexPricerAvailabilityInputForm.getAdultCount())) {
				inputtravellerType.setCODE(CommonConstants.ADULT);
				travellerInfomation.setTRAVELLERTYPE(inputtravellerType);
				if (i < Integer.parseInt(flexPricerAvailabilityInputForm.getInfantCount())) {
					travellerInfomation.setHASINFANT(true);
				} else {
					travellerInfomation.setHASINFANT(false);
				}
				travellerInfomation.setTRAVELLERID(BigInteger.valueOf(i + 1));

				if (null != flexPricerAvailabilityInputForm.getAdultDiscountPassengerTypeCode() && flexPricerAvailabilityInputForm.getAdultDiscountPassengerTypeCode().size() != 0 && null != flexPricerAvailabilityInputForm.getAdultDiscountPassengerTypeCode().get(i) && !"".equals(flexPricerAvailabilityInputForm.getAdultDiscountPassengerTypeCode().get(i))) {
					LISTTRAVELLERINFOType travellerInfo = new LISTTRAVELLERINFOType();
					DISCOUNTINFOType discountTyppe = new DISCOUNTINFOType();
					DISCOUNTINFOPTCType discount = new DISCOUNTINFOPTCType();
					DISCOUNTINFOPTCLISTPTCType type = new DISCOUNTINFOPTCLISTPTCType();
					type.setCODE(flexPricerAvailabilityInputForm.getAdultDiscountPassengerTypeCode().get(i));
					List<DISCOUNTINFOPTCLISTPTCType> list = discount.getLISTPTC();
					list.add(type);
					discount.setISCUMULATIVEDISCOUNT(false);
					discountTyppe.setPTCINFO(discount);
					travellerInfo.setDISCOUNTINFO(discountTyppe);
					travellerInfo.setTRAVELLERID(BigInteger.valueOf(i + 1));
					discountList.add(travellerInfo);
				}
			} else {
				inputtravellerType.setCODE(CommonConstants.CHILD);
				travellerInfomation.setTRAVELLERTYPE(inputtravellerType);
				travellerInfomation.setHASINFANT(false);
				travellerInfomation.setTRAVELLERID(BigInteger.valueOf(i + 1));

				if (null != flexPricerAvailabilityInputForm.getChildDiscountPassengerTypeCode() && flexPricerAvailabilityInputForm.getChildDiscountPassengerTypeCode().size() != 0 && null != flexPricerAvailabilityInputForm.getChildDiscountPassengerTypeCode().get(j) && !"".equals(flexPricerAvailabilityInputForm.getChildDiscountPassengerTypeCode().get(j))) {
					LISTTRAVELLERINFOType travellerInfo = new LISTTRAVELLERINFOType();
					DISCOUNTINFOType discountTyppe = new DISCOUNTINFOType();
					DISCOUNTINFOPTCType discount = new DISCOUNTINFOPTCType();
					DISCOUNTINFOPTCLISTPTCType type = new DISCOUNTINFOPTCLISTPTCType();
					type.setCODE(flexPricerAvailabilityInputForm.getChildDiscountPassengerTypeCode().get(j));
					List<DISCOUNTINFOPTCLISTPTCType> list = discount.getLISTPTC();
					list.add(type);
					discount.setISCUMULATIVEDISCOUNT(false);
					discountTyppe.setPTCINFO(discount);
					travellerInfo.setDISCOUNTINFO(discountTyppe);
					travellerInfo.setTRAVELLERID(BigInteger.valueOf(i + 1));
					discountList.add(travellerInfo);

				}
				j++;
			}
			travellerList.add(i, travellerInfomation);
		}
		if ("M".equals(flexPricerAvailabilityInputForm.getTripType())) {
			flexPricerAvailabilityInput.setOWCDUALFLOWSEQUENCE(new BigInteger("1"));
		}
		if (null != flexPricerAvailabilityInputForm.getCorporatedId() && !"".equals(flexPricerAvailabilityInputForm.getCorporatedId())) {
			LISTPRICINGOPTIONSTypeFlex listpricingoptions = new LISTPRICINGOPTIONSTypeFlex();
			listpricingoptions.setTYPEOFFARE(new BigInteger("-2"));
			listpricingoptions.setISPRICEBYINPUT(true);
			listpricingoptions.setTYPEOFCORPORATEFARE(new BigInteger("2"));

			List<LISTCORPORATENUMBER> listcorporatenumberList = listpricingoptions.getLISTCORPORATENUMBER();
			LISTCORPORATENUMBER listcorporatenumber = new LISTCORPORATENUMBER();
			listcorporatenumber.setCORPORATENUMBER(flexPricerAvailabilityInputForm.getCorporatedId());
			listcorporatenumberList.add(listcorporatenumber);
			flexPricerAvailabilityInput.setLISTPRICINGOPTIONS(listpricingoptions);
		}
		return flexPricerAvailabilityInput;
	}
}
