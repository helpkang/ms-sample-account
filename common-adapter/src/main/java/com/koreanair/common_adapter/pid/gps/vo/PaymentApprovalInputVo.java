package com.koreanair.common_adapter.pid.gps.vo;

import com.koreanair.common_external.pid.gps.approvalRequest.*;

public class PaymentApprovalInputVo {

	protected String paymentType;
    protected GeneralInfo generalinfo;
    protected TktInfo tktinfo;
    protected TasfInfo tasfinfo;
    protected CybersourceAddedInfo cybersourceaddedinfo;
    protected CybersourceDmInfo cybersourceDmInfo;
    protected AuthInfo authinfo;
    
    protected KonbiniInputVo conveni;
    protected PayEase payEase;
    protected String cardType;
    
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public GeneralInfo getGeneralinfo() {
		return generalinfo;
	}
	public void setGeneralinfo(GeneralInfo generalinfo) {
		this.generalinfo = generalinfo;
	}
	public TktInfo getTktinfo() {
		return tktinfo;
	}
	public void setTktinfo(TktInfo tktinfo) {
		this.tktinfo = tktinfo;
	}
	public TasfInfo getTasfinfo() {
		return tasfinfo;
	}
	public void setTasfinfo(TasfInfo tasfinfo) {
		this.tasfinfo = tasfinfo;
	}
	public CybersourceAddedInfo getCybersourceaddedinfo() {
		return cybersourceaddedinfo;
	}
	public void setCybersourceaddedinfo(CybersourceAddedInfo cybersourceaddedinfo) {
		this.cybersourceaddedinfo = cybersourceaddedinfo;
	}
	public CybersourceDmInfo getCybersourceDmInfo() {
		return cybersourceDmInfo;
	}
	public void setCybersourceDmInfo(CybersourceDmInfo cybersourceDmInfo) {
		this.cybersourceDmInfo = cybersourceDmInfo;
	}
	public AuthInfo getAuthinfo() {
		return authinfo;
	}
	public void setAuthinfo(AuthInfo authinfo) {
		this.authinfo = authinfo;
	}
	public KonbiniInputVo getConveni() {
		return conveni;
	}
	public void setConveni(KonbiniInputVo conveni) {
		this.conveni = conveni;
	}
	public PayEase getPayEase() {
		return payEase;
	}
	public void setPayEase(PayEase payEase) {
		this.payEase = payEase;
	}
    
}
