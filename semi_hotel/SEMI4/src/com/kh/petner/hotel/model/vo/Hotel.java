package com.kh.petner.hotel.model.vo;

public class Hotel {
	private int Hotel_num;
	private String Hotel_name;
	private String Hotel_location;
	
	public Hotel() {
		super();
		
	}

	public Hotel(int hotel_num, String hotel_name, String hotel_location) {
		super();
		Hotel_num = hotel_num;
		Hotel_name = hotel_name;
		Hotel_location = hotel_location;
	}

	public int getHotel_num() {
		return Hotel_num;
	}

	public void setHotel_num(int hotel_num) {
		Hotel_num = hotel_num;
	}

	public String getHotel_name() {
		return Hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		Hotel_name = hotel_name;
	}

	public String getHotel_location() {
		return Hotel_location;
	}

	public void setHotel_location(String hotel_location) {
		Hotel_location = hotel_location;
	}

	@Override
	public String toString() {
		return "Hotel [Hotel_num=" + Hotel_num + ", Hotel_name=" + Hotel_name + ", Hotel_location=" + Hotel_location
				+ "]";
	}
	
	
	
}

