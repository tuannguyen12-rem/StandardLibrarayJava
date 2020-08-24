package com.shoppingCart.HotlineOnlineShop;

import java.util.LinkedList;
import java.util.Scanner;

public class HotlineUsingQueue {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		LinkedList<CallerData> caller = new LinkedList<CallerData>();

		caller.offer(new CallerData("21.08.2020", "21:00", "Jimmy"));
		caller.offer(new CallerData("20.08.2020", "20:00", "Kimmy"));
		caller.offer(new CallerData("19.08.2020", "19:00", "Tom"));
		caller.offer(new CallerData("18.08.2020", "18:00", "Aldous"));
		caller.offer(new CallerData("17.08.2020", "17:00", "Tim"));
		caller.offer(new CallerData("16.08.2020", "16:00", "Lucard"));
		caller.offer(new CallerData("15.08.2020", "15:00", "Jenny"));
		caller.offer(new CallerData("14.08.2020", "22:00", "Juli"));
		caller.offer(new CallerData("13.08.2020", "23:00", "Tobias"));
		caller.offer(new CallerData("12.08.2020", "20:40", "Lucie"));
		caller.offer(new CallerData("11.08.2020", "21:10", "Arthur"));

		System.out.println("Size: " + caller.size());
	
		printChoice();

		do {
			int choice;
			System.out.print("\nChoose an option:");

			choice = sc.nextInt();
			switch (choice) {
			case (1):

				System.out.println("\nInput an letter to add one name to list:");
				char inputChar = sc.next().charAt(0);
				System.out.println("Enter detailed data of caller:");
				if (inputChar >= 'a' && inputChar <= 'z' || inputChar >= 'A' && inputChar <= 'Z') {
					caller.add(new CallerData(sc.nextLine(), sc.nextLine(), sc.nextLine()));
					System.out.println("Size: " + caller.size());

				} else {
					System.out.println("Unvalid letter to add one name.");
				}
				break;
			case (2):
				System.out.println("\nDo you want delete the data of caller ?");

				System.out.println("\nEnter the name, it will be removed if it is in the list alright");
				String name = sc.next();
				for (int i = 0; i < caller.size(); ++i) {
					if (caller.get(i).getNameOfCaller().equalsIgnoreCase(name)) {
						caller.remove(i);
					}
				}
				System.out.println("Size: " + caller.size());
				break;
			case (3):
				System.out.println("\nPrint all the informations of caller");
				for (int i = 0; i < caller.size(); ++i) {
					System.out.println(caller.get(i).getDate() + " " + caller.get(i).getTime() + " "
							+ caller.get(i).getNameOfCaller());
				}
				break;
			case (4):
				break;
			}

		} while (true);

	}

	public static void printChoice() {
		String choices = ("MENU:\n" + "1-Add new caller to list\n" + "2-Delete caller out of cart\n"
				+ "3-Output infors of all callers\n" + "4-Stop\n");
		System.out.println(choices);
	}

}
