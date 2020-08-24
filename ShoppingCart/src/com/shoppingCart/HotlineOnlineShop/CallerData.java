package com.shoppingCart.HotlineOnlineShop;

public class CallerData {

	private String date;
	private String time;
	private String nameOfCaller;

	public CallerData() {
	
   }

	public CallerData(String date, String time, String nameOfCaller) {
		super();
		this.date = date;
		this.time = time;
		this.nameOfCaller = nameOfCaller;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getNameOfCaller() {
		return nameOfCaller;
	}

	public void setNameOfCaller(String nameOfCaller) {
		this.nameOfCaller = nameOfCaller;
	}

	
}
