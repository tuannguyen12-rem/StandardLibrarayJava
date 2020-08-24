package com.shoppingCart;

import java.util.LinkedList;
import java.util.List;

public class Products {

	private final static List<Product> products = new LinkedList<Product>();

	public Products() {
		this.intitStoreItems();

	}

	// method is used to add the products into a new Linkedlist of type Product

	public void intitStoreItems() {
		products.add(0, new Product("Schokolade", 12.55, 4));
		products.add(1, new Product("Vollmilch", 20.75, 1));
		products.add(2, new Product("Halbbitter", 10.25, 3));
		products.add(3, new Product("Bitterschokolade", 10.00, 2));

	}

	// returns total products in cart
	public static int getNumberProductsInCart() {
		int numItems = 0;
		for (int i = 0; i < products.size(); i++) {
			numItems = numItems + products.get(i).getItemAmount();
		}
		return numItems;
	}

	// returns total products in cart
	public static void printPrice() {

		for (int i = 0; i < products.size(); ++i) {
			System.out.println(products.get(i).getItemsName() + " : " + products.get(i).getItemPrice() + " x "
					+ products.get(i).getItemAmount());

		}

	}

	public static void printDescriptions() {
		System.out.println("Product Descriptions");
		for (int i = 0; i < products.size();++i) {
			System.out.println(products.get(i).getItemsName());
		}
	}

	public static double getCostOfCart() {
		double totalCost = 0;
		for (int i = 0; i < products.size(); ++i) {
			totalCost = totalCost + (products.get(i).getItemPrice() * products.get(i).getItemAmount());

		}
		return totalCost;
	}
	

	// add product to the linked list
	public static void addProduct(Product newItem) {
		products.add(products.size(), newItem);
	}

	// removes an item from linked list
	public String removeProduct(String itemToRemove) {
		int count = 0;
		for (int i = 0; i < products.size(); ++i) {
			if (products.get(i).getItemsName().equalsIgnoreCase(itemToRemove)) {
				products.remove(i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Item not found in cart. Nothing removed.");
		}
        return itemToRemove;
	}
	 //method to modify an item in the cart
	public static void modifyProduct(Product itemToModify) {
		int count = 0;
		for (int i = 0; i < products.size(); ++i) {
			if (products.get(i).getItemsName().equals(itemToModify.getItemsName())) {
				products.get(i).setItemAmount(itemToModify.getItemAmount());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Item not found in cart. Nothing removed.");
			System.out.println();
		}
	}
}
