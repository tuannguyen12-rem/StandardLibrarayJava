package com.shoppingCart;

public class Product {

	private String itemsName;

	private double itemPrice;
	private int itemAmount;

	public Product(String itemsName) {
		this.itemsName = itemsName;
		this.itemPrice = 0;
		this.itemAmount = 0;

	}

	public Product(String itemsName, double itemPrice, int itemAmount) {
		this.itemsName = itemsName;
		this.itemPrice = itemPrice;
		this.itemAmount = itemAmount;
	}

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(int itemAmount) {
		this.itemAmount = itemAmount;
	}

	public String OutputInfor() {
		return "the name of product" + " = " + this.itemsName + "/n the price ist " + " = " + this.itemPrice
				+ "/n the amount of product " + " = " + this.itemAmount;
	}

}
