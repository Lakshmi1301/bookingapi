package com.pojo;

public class Address {
	private String streetName ;
	private String  cityName;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public CommunicationDetails getCommunicationDetails() {
		return communicationDetails;
	}
	public void setCommunicationDetails(CommunicationDetails communicationDetails) {
		this.communicationDetails = communicationDetails;
	}
	private String  districtName;
	private String stateName;
	private String country;
	private CommunicationDetails communicationDetails;
}
