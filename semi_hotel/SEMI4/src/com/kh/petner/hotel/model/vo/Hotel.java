package com.kh.petner.hotel.model.vo;

public class Hotel {
	private int Hotel_num;
	private String Hotel_name;
	private String Hotel_location;
	private int Hotel_star;
	
	public Hotel() {
		super();
		
	}

	public Hotel(int hotel_num, String hotel_name, String hotel_location, int hotel_star) {
		super();
		Hotel_num = hotel_num;
		Hotel_name = hotel_name;
		Hotel_location = hotel_location;
		Hotel_star = hotel_star;
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

	public int getHotel_star() {
		return Hotel_star;
	}

	public void setHotel_star(int hotel_star) {
		Hotel_star = hotel_star;
	}

	@Override
	public String toString() {
		return "Hotel [Hotel_num=" + Hotel_num + ", Hotel_name=" + Hotel_name + ", Hotel_location=" + Hotel_location
				+ ", Hotel_star=" + Hotel_star + "]";
	}
	
	
	
}

