package com.shoppingCart;

import java.util.Scanner;

public class ShopCart {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Products items = new Products();
		printMenu(items, sc);
	}
	
	public static double InputPrice() {
		double input = sc.nextDouble();
		return input;
	}

	public static int InputAmount() {
		int input = sc.nextInt();
		return input;
	}

	public static void printMenu(Products product, Scanner sc) {
		char userChoice = ' ';
		boolean Stop = false;

		String menu = ("MENU:\n" + "a-Add product to cart\n" + "d-Delete product to cart\n" + "o-Output shopping cart\n"
				+ "s-Stop\n");
		System.out.println(menu);
		do {
			System.out.print("\nChoose an option:");

			userChoice = sc.next().charAt(0);
			switch (userChoice) {
			case ('q'):
				System.out.println();
				Stop = true;

				// prints out the current shopping cart with help from shoppingCart methods
			case ('o'):
				System.out.println("\nOUTPUT SHOPPING CART");

				if (Products.getNumberProductsInCart() == 0) {
					System.out.println("Number of Items: " + Products.getNumberProductsInCart());
					System.out.println();
					System.out.println("SHOPPING CART IS EMPTY");
				} else {
					System.out.println("Number of Items: " + Products.getNumberProductsInCart());
					System.out.println();
				}
				Products.printPrice();
				System.out.println("Total: €‚" + Products.getCostOfCart());
				System.out.println();
				System.out.print(menu);
				break;
			case ('a'):
				Products.addProduct(new Product("weisseSchokolade", 9.99, 7));
			    Products.addProduct(new Product("Schokolade-Marketing", 99.99, 1));
				System.out.println("Adding successfully a new product to the list ");
				System.out.println("Amount of product in cart is :" + Products.getNumberProductsInCart());
				break;
			case ('d'):
				product.removeProduct("Vollmilch");
			    System.out.println("Product is removed from the list.");
				break;
			default:
				break;
			}
		} while (!Stop);
	}

}
