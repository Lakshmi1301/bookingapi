package com.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.pojo.BookingDetails;

public class Test {
public static void main(String[] args) throws JAXBException {
	readXML();
}

public static void readXML() throws JAXBException {
	JAXBContext Context = JAXBContext.newInstance(BookingDetails.class);
	 Unmarshaller un = Context.createUnmarshaller();
	File loc=new File("C:\\Users\\Vimal\\eclipse-workspace\\BookingTaskApi\\src\\test\\resources\\XMLFloder\\NewFile.xml");
    Object obj = un.unmarshal(loc);
    BookingDetails details=( BookingDetails )obj;
    System.out.println("Booking details");
    System.out.println("From:"+ details.getFrom());
    System.out.println("To:"+ details.getTo());
    System.out.println("TripType:"+ details.getTripType());
    System.out.println("FromDate:"+ details.getFromDate());
    System.out.println("ReturnDate:"+ details.getReturnDate());
    System.out.println("FlightNumber:"+ details.getFlightNo());
    System.out.println("Name:"+ details.getPassergerDetails().getName());
    System.out.println("DOB:"+ details.getPassergerDetails().getDob());
    System.out.println("StreetName:"+ details.getPassergerDetails().getAddress().getStreetName());
    System.out.println("CityName:"+ details.getPassergerDetails().getAddress().getCityName());
    System.out.println("DistrictName:"+ details.getPassergerDetails().getAddress().getDistrictName());
    System.out.println("StateName:"+ details.getPassergerDetails().getAddress().getStateName());
    System.out.println("CountryName:"+ details.getPassergerDetails().getAddress().getCountry());
    System.out.println("Mobilenumber:"+ details.getPassergerDetails().getAddress().getCommunicationDetails().getPhone().getMobileNumber());
    System.out.println("Landline:"+ details.getPassergerDetails().getAddress().getCommunicationDetails().getPhone().getLandLineNumber());
    System.out.println("office-email:"+ details.getPassergerDetails().getAddress().getCommunicationDetails().getEmail().getOfficial());
    System.out.println("personal-email:"+ details.getPassergerDetails().getAddress().getCommunicationDetails().getEmail().getPersonal());
    System.out.println("cardName:"+ details.getPaymentDetails().getCardName());
    System.out.println("cardHolderName:"+ details.getPaymentDetails().getCardHolderName());
    System.out.println("cardnumber:"+ details.getPaymentDetails().getCardNumber());
    System.out.println("cvv number:"+ details.getPaymentDetails().getCvvNumber());
    
}
}
