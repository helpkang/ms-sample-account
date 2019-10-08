package com.koreanair.common_adapter.common.vo;
/**
 * 세금 상세 내역 클래스 
 * @author v.hyunskim
 *
 */
public class TaxDetail {
	
	private String passengerTypeCodeDetailTaxStatus;			/*ptc 타입 1인의 tax 상태 코드*/
	private String passengerTypeCodeDetailTaxCode;				/*tax 코드*/
	private Float passengerTypeCodeDetailTax;					/*ptc 타입 1인의 tax 코드에 해당하는 tax 금액*/
	private Float passengerTypeCodeDetailTotalTax;				/*ptc 타입의 tax의 총금액*/
	
	public String getPassengerTypeCodeDetailTaxStatus() {
		return passengerTypeCodeDetailTaxStatus;
	}
	public void setPassengerTypeCodeDetailTaxStatus(
			String passengerTypeCodeDetailTaxStatus) {
		this.passengerTypeCodeDetailTaxStatus = passengerTypeCodeDetailTaxStatus;
	}
	public String getPassengerTypeCodeDetailTaxCode() {
		return passengerTypeCodeDetailTaxCode;
	}
	public void setPassengerTypeCodeDetailTaxCode(
			String passengerTypeCodeDetailTaxCode) {
		this.passengerTypeCodeDetailTaxCode = passengerTypeCodeDetailTaxCode;
	}
	public Float getPassengerTypeCodeDetailTax() {
		return passengerTypeCodeDetailTax;
	}
	public void setPassengerTypeCodeDetailTax(Float passengerTypeCodeDetailTax) {
		this.passengerTypeCodeDetailTax = passengerTypeCodeDetailTax;
	}
	public Float getPassengerTypeCodeDetailTotalTax() {
		return passengerTypeCodeDetailTotalTax;
	}
	public void setPassengerTypeCodeDetailTotalTax(
			Float passengerTypeCodeDetailTotalTax) {
		this.passengerTypeCodeDetailTotalTax = passengerTypeCodeDetailTotalTax;
	}
	
	
}
