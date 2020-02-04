package com.mastek.training.hrshop;

import java.util.HashMap;
import java.util.Map;

public class MapShoppingCart implements ShoppingCart<Item> {
	
	Map<Integer, Item> items;
	
	public MapShoppingCart() {
		items = new HashMap<>();
		
	}
	
	@Override
	public int addItem(Item i) {
		items.put(i.getItemId(), i);
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public int removeItem(Item i) {
		items.remove(i.getItemId());
		return items.size();
	}

	@Override
	public void printItems() {
		// TODO Auto-generated method stub
		for (Integer itemId: items.keySet()) {// get all the keys from the Map.
			Item i = items.get(itemId); // gets the value from the map using the key.
			System.out.println(i);
		}
	}

	@Override
	public double getTotalPrice(double taxPercentage, double discountPercentage) {
		// TODO Auto-generated method stub
		return 0;
	}

}
