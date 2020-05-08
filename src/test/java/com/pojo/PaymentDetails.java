package com.pojo;

public class PaymentDetails {
	private String cardName;
	private String cardHolderName;
	private Long cardNumber;
	private Long cvvNumber;
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Long getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(Long cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	
}
