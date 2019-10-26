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
package com.koreanair.ms_ibe.domain;

import com.koreanair.common_adapter.utils.StringUtil;
import com.koreanair.ms_ibe.service.vo.PaymentAuthenticationInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

@Component
@Slf4j
public class PaymentAuthenticationDomain {
	//카카오채번 비즈니스로직
	public PaymentAuthenticationInput getKakaoInput(PaymentAuthenticationInput inputVo,String seq) {
		String partnerUserId = "keonline";
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String date = sdf.format(today);

		Boolean DomInt = inputVo.getDomestic();
		Boolean award = inputVo.getAward();
		String gubun = "0";
		String productName = "";
		String cid = "";

		// 국내무상은 KPYYMMDD3nnnnn
		if (DomInt && award) {
			gubun = "3";
			productName="국내선 항공권";
			cid="C674470034";
			// 국제무상은 KPYYMMDD8nnnnn
		} else if (!DomInt && award) {
			gubun = "8";
			productName="국제선 항공권";
			cid="C117590138";
			//국내유상
		} else if (DomInt && !award) {
			gubun = "0";
			productName="국내선 항공권";
			cid="C720890192";
			//국제유상
		} else if (!DomInt && !award) {
			gubun = "6";
			productName="국제선 항공권";
			cid="C612200035";
		}

		if("EB".equals(inputVo.getMode())){
			if(award){
				gubun = "8";
			}else{
				gubun = "6";
			}
			productName="국제선 초과 수하물";
		}
		String orderNo = "KP" + date + gubun + seq;
		productName = productName+" ("+inputVo.getReservationNumber()+")";

		//비즈니스로직으로 처리된 데이터들을 input에 담는다.
		inputVo.setCid(cid);
		inputVo.setOrderNo(orderNo);
		inputVo.setPartnerUserId(partnerUserId);
		inputVo.setProductName(productName);


		return inputVo;
	}

	public PaymentAuthenticationInput getPaycoInput(PaymentAuthenticationInput inputVo, String seq) {
		String orderNo = "";
		String orderChannel="";
		String sellerKey = "S0FSJE";
		String inAppYn = "N";
		String appUrl = "";
		String cancelMobileUrl="";
		//cpId(필수)
		String cpId = "PARTNERTEST";
		//productId(필수)
		String productId="PROD_EASY";
		//외부가맹점의 주문번호(필수)***********
		boolean DomInt = inputVo.getDomestic();
		boolean award = inputVo.getAward();
		String gubun = "";
		String productName="";
		//live에서는 sellerkey,cpid,productid가 유무상 국내국제에 따라서 4개로 나뉘어진다.
		if (DomInt && award) {
			sellerKey="DOM_BNS";
			cpId="DOM_BNS";
			productId="DOM_BNS_EASYP";
			productName="국내선 항공권 예매";
			gubun = "3";
		} else if (!DomInt && award) {
			sellerKey="INT_BNS";
			cpId="INT_BNS";
			productId="INT_BNS_EASYP";
			productName="국제선 항공권 예매";
			gubun = "8";
		} else if (DomInt && !award) {
			sellerKey="DOM";
			cpId="DOM";
			productId="DOM_EASYP";
			productName="국내선 항공권 예매";
			gubun = "0";
		} else if (!DomInt && !award) {
			sellerKey="INT";
			cpId="INT";
			productId="INT_EASYP";
			productName="국제선 항공권 예매";
			gubun = "6";
		}

		String deviceCode = inputVo.getDeviceCode();
		if(deviceCode.contains("PC")){
			orderChannel = "PC";
		}else{
			orderChannel = "MOBILE";
		}

		if(null!=inputVo.getInAppYn()){
			inAppYn = inputVo.getInAppYn();
		}
		if(null!=inputVo.getAppUrl()){
			appUrl = inputVo.getAppUrl();
		}
		if(null!=inputVo.getCancelMobileUrl()){
			cancelMobileUrl=inputVo.getCancelMobileUrl();
		}
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String date = sdf.format(today);
		orderNo = "PC"+date+gubun+seq;
		productName = productName+" ("+inputVo.getReservationNumber()+ ")";

		if(StringUtil.isNotEmpty(inputVo.getCurrency())) {
			inputVo.setCurrency(inputVo.getCurrency());
		}else{
			inputVo.setCurrency("KRW");
		}
		String languageCode = "EN";
		//언어코드에 따라 해당값이 변경됨. 공통 기능 적용되면 사용.
		/*
		if("ko".equals(SecurityUtil.getPrincipal().getLanguage())){
			languageCode = "KR";
		}
		*/

		inputVo.setOrderNo(orderNo);
		inputVo.setSellerKey(sellerKey);
		inputVo.setCpId(cpId);
		inputVo.setProductId(productId);
		inputVo.setProductName(productName);
		inputVo.setLanguage(languageCode);
		inputVo.setOrderChannel(orderChannel);
		inputVo.setInAppYn(inAppYn);
		if(StringUtil.isNotBlank(cancelMobileUrl)) {
			inputVo.setCancelMobileUrl(cancelMobileUrl);
		}
		if(StringUtil.isNotBlank(appUrl)) {
			inputVo.setAppUrl(appUrl);
		}


		return inputVo;
	}

	public PaymentAuthenticationInput getPaypalInput(PaymentAuthenticationInput inputVo, String seq) {
		String orderNo = "PP";
		/*
		거래번호 형태 : PAYPAL 식별코드 (PP) + 숫자 12자리 (PP +  YYMMDDNNnnnn
		YYMMDD : 거래 연도/월/일 (각 ISSUE OFC 기준 시각)
	       . YY   : 거래 연도 뒤 2자리
	       . MM : 거래 월 2자리
	       . DD  : 거래 일 2자리

	     - NN : OID에 따른 고정 일렬 번호

			NN	구분	OFFICE ID
			10	한국발 유상	SELKE08CM / SELKE08CW / SELKE08IM / SELKE08IW / SELKE08MW 0
			11	한국발 무상	SELKE08IA / SELKE08SA 0
			20	미주발 유상	LAXKE08IM / LAXKE08IW /  -16
			21	해외발 무상	LAXKE08SN / LAXKE08SA -16
			30	일본발 유상	TYOKE08IM/ TYOKE08IW / TYOKE08MW 0
			31	일본발 무상	TYOKE08IA / TYOKE08SA 0
			40	중국발 유상	BJSKE08IM / BJSKE08IW / BJSKE08MW -1
			50	동남아발 유상	KULKE08IM / KULKE08IW / KULKE08MW -1
			51	인도네시아발 무상	JKTKE08IA -1
			60	대양주발 유상	SYDKE08IM / SYDKE08IW / SYDKE08MW -22
			70	유럽발 유상	PARKE08IM / PARKE08IW / PARKE08MW -8
			80	중동발 유상	DXBKE08IM / DXBKE08IW / DXBKE08MW -5
			90	CIS발 유상 	MOWKE08IM / MOWKE08IW / MOWKE08MW -5

		 */
		/****************************gmt계산 하는 로직 시작***********************************************/
		int gmt = 0;

		//서버타임과 일치하는 oid
		String hr0 = "SELKE08CM,SELKE08CW,SELKE08IM,SELKE08IW,SELKE08MW,SELKE08IA,SELKE08SA,TYOKE08IM,TYOKE08IW,TYOKE08MW,TYOKE08IA,TYOKE08SA";
		//서버타임보다 1시간 늦는 oid
		String hrm1 = "BJSKE08IM,BJSKE08IW,BJSKE08MW,KULKE08IM,KULKE08IW,KULKE08MW,JKTKE08IA";
		//서버타임보다 5시간 늦는 oid
		String hrm5 = "DXBKE08IM,DXBKE08IW,DXBKE08MW,MOWKE08IM,MOWKE08IW,MOWKE08MW";
		//서버타임보다 8시간 늦는 oid
		String hrm8 = "PARKE08IM,PARKE08IW,PARKE08MW";
		//서버타임보다 16시간 늦는 oid
		String hrm16 = "LAXKE08IM,LAXKE08IW,LAXKE08MW,LAXKE08SN,LAXKE08SA";
		//서버타임보다 1시간 빠른 oid
		String hrp1 = "SYDKE08IM,SYDKE08IW,SYDKE08MW";

		HashMap<String,String> gmtmap = new HashMap<String,String>();
		gmtmap.put("hr0", hr0);
		gmtmap.put("hrm1", hrm1);
		gmtmap.put("hrm5", hrm5);
		gmtmap.put("hrm8", hrm8);
		gmtmap.put("hrm16", hrm16);
		gmtmap.put("hrp1", hrp1);

		String []hrkey = {"hr0","hrm1","hrm5","hrm8","hrm16","hrp1"};

		boolean isgmt = false;
		for(String key : hrkey){
			if(isgmt){
				break;
			}
			String hr = gmtmap.get(key);
			String []hrArr = hr.split(",");
			for(String oid : hrArr){
				if(oid.equals(inputVo.getOfficeId())){
					if("hr0".equals(key)){
						gmt=0;
						isgmt=true;
					}else if("hrm1".equals(key)){
						gmt=-1;
						isgmt=true;
					}else if("hrm5".equals(key)){
						gmt=-5;
						isgmt=true;
					}else if("hrm8".equals(key)){
						gmt=-8;
						isgmt=true;
					}else if("hrm16".equals(key)){
						gmt=-16;
						isgmt=true;
					}else if("hrp1".equals(key)){
						gmt=1;
						isgmt=true;
					}
				}
			}
		}

		String nn = "10";

		SimpleDateFormat sdfmt = new SimpleDateFormat("yyMMdd");
		GregorianCalendar cal = new GregorianCalendar();
		cal.add(cal.HOUR, gmt);
		String todayDate = sdfmt.format(cal.getTime());

		/****************************gmt계산 하는 로직 끝***********************************************/

		orderNo = orderNo+todayDate;

		String nn10 = "SELKE08CM,SELKE08CW,SELKE08IM,SELKE08IW,SELKE08MW";
		String nn11 = "SELKE08IA,SELKE08SA";
		String nn20 = "LAXKE08IM,LAXKE08IW,LAXKE08MW";
		String nn21 = "LAXKE08SN,LAXKE08SA";
		String nn30 = "TYOKE08IM,TYOKE08IW,TYOKE08MW";
		String nn31 = "TYOKE08IA,TYOKE08SA";
		String nn40 = "BJSKE08IM,BJSKE08IW,BJSKE08MW";
		String nn50 = "KULKE08IM,KULKE08IW,KULKE08MW";
		String nn51 = "JKTKE08IA";
		String nn60 = "SYDKE08IM,SYDKE08IW,SYDKE08MW";
		String nn70 = "PARKE08IM,PARKE08IW,PARKE08MW";
		String nn80 = "DXBKE08IM,DXBKE08IW,DXBKE08MW";
		String nn90 = "MOWKE08IM,MOWKE08IW,MOWKE08MW";

		HashMap<String,String>nnmap = new HashMap<String,String>();
		nnmap.put("nn10", nn10 );
		nnmap.put("nn11", nn11 );
		nnmap.put("nn20", nn20 );
		nnmap.put("nn21", nn21 );
		nnmap.put("nn30", nn30 );
		nnmap.put("nn31", nn31 );
		nnmap.put("nn40", nn40 );
		nnmap.put("nn50", nn50 );
		nnmap.put("nn51", nn51 );
		nnmap.put("nn60", nn60 );
		nnmap.put("nn70", nn70 );
		nnmap.put("nn80", nn80 );
		nnmap.put("nn90", nn90 );

		String []nnkey = {"nn10","nn11","nn20","nn21","nn30","nn31","nn40","nn50","nn51","nn60","nn70","nn80","nn90"};

		boolean isnn = false;
		for(String key : nnkey){
			if(isnn){
				break;
			}
			String nnStr = nnmap.get(key);
			String []nnArr = nnStr.split(",");
			for(String oid : nnArr){
				if(oid.equals(inputVo.getOfficeId())){
					if("nn10".equals(key)){
						nn="10";
						isnn=true;
					}else if("nn11".equals(key)){
						nn="11";
						isnn=true;
					}else if("nn20".equals(key)){
						nn="20";
						isnn=true;
					}else if("nn21".equals(key)){
						nn="21";
						isnn=true;
					}else if("nn30".equals(key)){
						nn="30";
						isnn=true;
					}else if("nn31".equals(key)){
						nn="31";
						isnn=true;
					}else if("nn40".equals(key)){
						nn="40";
						isnn=true;
					}else if("nn50".equals(key)){
						nn="50";
						isnn=true;
					}else if("nn51".equals(key)){
						nn="51";
						isnn=true;
					}else if("nn60".equals(key)){
						nn="60";
						isnn=true;
					}else if("nn70".equals(key)){
						nn="70";
						isnn=true;
					}else if("nn80".equals(key)){
						nn="80";
						isnn=true;
					}else if("nn90".equals(key)){
						nn="90";
						isnn=true;
					}
				}
			}
		}
		orderNo = orderNo+nn+seq;

		String user = "";
		String pwd = "";
		String signature="";
		if(inputVo.getOfficeId().contains("SEL")){
			//user = "SELRSGG@koreanair.com";
			user = "SELRSGG_api1.koreanair.com";
			pwd = "R4PSQJSBMMMM8SDM";
			signature = "A7Pp-CkbNvlLpUTi3DlAoJ7XFgR3AnCYO6RG0Q12tLWbiM579ae1VurV";
		}else if(inputVo.getOfficeId().contains("LAX")){
			//user = "laxppusd@koreanair.com";
			user = "laxppusd_api1.koreanair.com";
			pwd = "5KNZ4R2R556ZQN7R";
			signature = "AvGCpYM8k-0VrhtnLRrD2wSFZAQZAfH9tiourDwIClTe4qgj5IDSuRk6";
		}else if(inputVo.getOfficeId().contains("TYO")){
			//user = "tyoppusd@koreanair.com";
			user = "tyoppusd_api1.koreanair.com";
			pwd = "L2YC5UQXVYTHFPWA";
			signature = "AVlhBXS0VGaLx-jqWLXPMRoiijbqAbzwyND.PpAVkARsVUrugrx-.RcX";
		}else if(inputVo.getOfficeId().contains("BJS")){
			//user = "bjsppusd@koreanair.com";
			user = "bjsppusd_api1.koreanair.com";
			pwd = "KSQHXCSG6YAV5MZK";
			signature = "AYhJx4Gu1nuk4jY36t0o7c7KL35PAcJBzNniIVDzt1YKNERG2u1bXtG3";
		}else if(inputVo.getOfficeId().contains("KUL")
				||inputVo.getOfficeId().contains("JKT")
				||inputVo.getOfficeId().contains("SYD")){
			//user = "kulppusd@koreanair.com";
			user = "kulppusd_api1.koreanair.com";
			pwd = "E9W29C27AARMKX9P";
			signature = "AYmoKoL1EaJzuQx8NBSxUQG9ufWBAsQRs6VHD3uhXf2ajkGqPI.5n3W2";
		}else if(inputVo.getOfficeId().contains("PAR")){
			//user = "PRGRU@koreanair.com";
			user = "prgru_api1.koreanair.com";
			pwd = "QX9LS7FW2PQ7WSB7";
			signature = "ACdB7LB6h11Zz9RwAAd2Zk1CI8dNA1GsvGC0.qYQsQToLMemG7EYb2yk";
		}else if(inputVo.getOfficeId().contains("MOW")){
			//user = "MOWDRG@koreanair.com";
			user = "MOWDRG_api1.koreanair.com";
			pwd = "WAJY6H9RWT4QQGP4";
			signature = "AgVPt9FQ4SgGMTZj24.Y4Vq41Z20AIMSsceGhjaPISgJgZpO1SbLy.Xv";
		}else if(inputVo.getOfficeId().contains("DXB")){
			//user = "dxbppusd@koreanair.com";
			user = "dxbppusd_api1.koreanair.com";
			pwd = "5Z9E3Z6BL5PMHSQQ";
			signature = "AUDKIFyD-YyOY6-yKxOVjCy71yVMA3TgmEaHMq-vdE.Cd2FqpeL-d5m9";
		}

		inputVo.setPwd(pwd);
		inputVo.setUserId(user);
		inputVo.setSignature(signature);
		inputVo.setOrderNo(orderNo);
		return inputVo;
	}

	public PaymentAuthenticationInput getTossInput(PaymentAuthenticationInput inputVo, String seq) {
		String orderNo = "TS";
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyMMdd");
		GregorianCalendar cal = new GregorianCalendar();
		String todayDate = sdfmt.format(cal.getTime());

		Boolean DomInt = inputVo.getDomestic();
		Boolean award = inputVo.getAward();
		String gubun = "0";
		String adminKey = "";
		String productName = "";

		// 국내무상은 KPYYMMDD3nnnnn
		if (DomInt && award) {
			gubun = "3";
			productName="국내선 항공권";
			adminKey="sk_test_apikey1234567890";
			// 국제무상은 KPYYMMDD8nnnnn
		} else if (!DomInt && award) {
			gubun = "8";
			productName="국제선 항공권";
			adminKey="sk_test_apikey1234567890";
			//국내유상
		} else if (DomInt && !award) {
			gubun = "0";
			productName="국내선 항공권";
			adminKey="sk_test_apikey1234567890";
			//국제유상
		} else if (!DomInt && !award) {
			gubun = "6";
			productName="국제선 항공권";
			adminKey="sk_test_apikey1234567890";
		}
		if("EB".equals(inputVo.getMode())){
			if(award){
				gubun = "8";
			}else{
				gubun = "6";
			}
			productName="국제선 초과 수하물";
		}
		orderNo = orderNo+todayDate+gubun+seq;

		inputVo.setAdminKey(adminKey);
		inputVo.setOrderNo(orderNo);
		inputVo.setProductName(productName);
		if(!inputVo.getDomestic()){
			inputVo.setAmountTaxFree(inputVo.getAmount());
		}else{
			inputVo.setAmountTaxFree("0");
		}
		return inputVo;
	}
}
