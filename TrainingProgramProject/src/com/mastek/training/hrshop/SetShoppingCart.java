package com.mastek.training.hrshop;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetShoppingCart implements ShoppingCart<Item> {

	Set<Item> items;
	
	public SetShoppingCart() {
		// using Hashset to manage unique items in random order
		//items = new HashSet<>(); // diamond operator with new keyword, since jdk 1.7
			// new HashSet<Item>();
		
		//using Treeset to store items in sorted order
		items = new TreeSet<>();
	}
	
	@Override
	public int addItem(Item i) {
		// TODO Auto-generated method stub
		items.add(i);
		return items.size();
	}

	@Override
	public int removeItem(Item i) {
		// TODO Auto-generated method stub
		items.remove(i);
		return items.size();
	}

	@Override
	public void printItems() {
		// TODO Auto-generated method stub
		System.out.println("Items in Cart");
		for (Item item: items)
			System.out.println(item);
	}
			
	@Override
	public double getTotalPrice(double taxPercentage, double discountPercentage) {
		// TODO Auto-generated method stub
		return 0;
	}

}
