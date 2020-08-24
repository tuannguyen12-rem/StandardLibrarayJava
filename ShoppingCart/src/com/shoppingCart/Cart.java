package com.shoppingCart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Products items = new Products();
		printMenu(items, sc);
	}

	public static void printMenu(Products product, Scanner sc) {
		char userChoice = ' ';
		boolean Stop = false;

		String menu = ("MENU:\n" + "a-Add product to cart\n" + "d-Delete product to cart\n"
				 + "o-Output shopping cart\n" + "s-Stop\n");
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
				System.out.println("Total in €:" + Products.getCostOfCart());
				System.out.println();
				System.out.print(menu);
				break;
			// creates an object of Product and adds that to shoppingCart from user input.
			case ('a'):
				Product newItem = new Product();
				System.out.println("\nADD Product TO CART");
				System.out.println("Enter the product name:");
				newItem.setItemsName(sc.nextLine());
				try {
					System.out.println("Enter the product quantity:");
					newItem.setItemAmount(sc.nextInt());
					System.out.println("Enter the product price:");
					newItem.setItemPrice(sc.nextDouble());

				} catch (InputMismatchException e) {
				sc.nextInt();
				sc.nextDouble();
				}

				product.addProduct(newItem);
				System.out.print(menu);
				break;
			// removes an item from the shopping cart using shoppingCart method
			case ('d'):
				System.out.println();
				System.out.println("REMOVE ITEM FROM CART");
				System.out.println("Enter name of item to remove:");
				product.removeProduct(sc.nextLine());
				System.out.println();
				System.out.print(menu);
				break;
			// allows user to modify the amount of a certain item in shoppingcart
			case ('c'):
				System.out.println("\nCHANGE ITEM QUANTITY");
				Product changeItem = new Product();
				System.out.println("Enter the item name:");
				changeItem.setItemsName(sc.nextLine());
				System.out.println("Enter the new quantity:");
				changeItem.setItemAmount(sc.nextInt());
				product.modifyProduct(changeItem);
				System.out.print(menu);
				break;

			default:
				break;

			}
		} while (!Stop);
	}
}
