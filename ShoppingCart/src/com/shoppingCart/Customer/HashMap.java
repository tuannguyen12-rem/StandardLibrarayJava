package com.shoppingCart.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {

		Map<Integer, Custom> customerByID = new java.util.HashMap<Integer, Custom>(10, 0.75F);

		Custom cus1 = new Custom("Jim", "Green", 50667, "Koeln", "Bachemer Str.", 11);
		Custom cus2 = new Custom("King", "Lucy", 50667, "Koeln", "Adam Str.", 45);
		Custom cus3 = new Custom("Tom", "Taylor", 50667, "Koeln", "Danteweg", 23);

		customerByID.put(1, cus1);
		customerByID.put(2, cus2);
		customerByID.put(3, cus3);

		Set<Map.Entry<Integer, Custom>> entries = customerByID.entrySet();
		for (Map.Entry<Integer, Custom> cus : entries) {
			System.out.println(cus.getKey() + "  " + cus.getValue());
			Custom customer = cus.getValue();
			customer.toString();

		}

		Iterator<Integer> keyIterator = customerByID.keySet().iterator();

		while (keyIterator.hasNext()) {
			Integer key = (Integer) keyIterator.next();
			Custom value = customerByID.get(key);
			System.out.println("key = " + key + "; value = " + value);
		}

		List<Custom> valuesList = new ArrayList<Custom>(customerByID.values());
		int randomIndex = new Random().nextInt(valuesList.size());
		int randomIndex1 = new Random().nextInt(valuesList.size());
		Custom randomValue = valuesList.get(randomIndex);
		Custom randomValue1 = valuesList.get(randomIndex1);
		System.out.println(randomValue + " " + randomValue1);
	}

}
