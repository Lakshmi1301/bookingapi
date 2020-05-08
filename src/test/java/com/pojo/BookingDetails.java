package com.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class BookingDetails {
	
private String from;
private String to;
private String tripType;
private Date fromDate;
private Date returnDate;
private String flightNo;
private PassergerDetails passergerDetails;
private PaymentDetails paymentDetails;
public PaymentDetails getPaymentDetails() {
	return paymentDetails;
}
public void setPaymentDetails(PaymentDetails paymentDetails) {
	this.paymentDetails = paymentDetails;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getTripType() {
	return tripType;
}
public void setTripType(String tripType) {
	this.tripType = tripType;
}
public Date getFromDate() {
	return fromDate;
}
public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}
public Date getReturnDate() {
	return returnDate;
}
public void setReturnDate(Date returnDate) {
	this.returnDate = returnDate;
}
public String getFlightNo() {
	return flightNo;
}
public void setFlightNo(String flightNo) {
	this.flightNo = flightNo;
}
public PassergerDetails getPassergerDetails() {
	return passergerDetails;
}
public void setPassergerDetails(PassergerDetails passergerDetails) {
	this.passergerDetails = passergerDetails;
}


}
