package com.mastek.training.hrshop;

public class Item
	implements Comparable<Item> // it provides the default sorting for TreeSet
{
	
	private int itemId;
	private String itemName;
	double itemQuantity;
	double unitPrice;
	
	public Item(int itemId, String itemName, double unitPrice, int itemQuantity) {
		// TODO Auto-generated constructor stub
		setItemId(itemId);
		setItemName(itemName);
		setUnitPrice(unitPrice);
		setItemQuantity(itemQuantity);
	}
	
	public Item(int i) {
		setItemId(i);
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getItemQuantity() {
		return itemQuantity;
	}
	
	public void setItemQuantity(double itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}	
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity + ", unitPrice="
				+ unitPrice + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemId;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemId != other.itemId)
			return false;
		return true;
	}

	// TreeSet uses compareTo for default order
	@Override
	public int compareTo(Item anotherItem) {
		// TODO Auto-generated method stub
		// return a number
		// +ve: current object is greater than anotherItem
		// 0: current object is equal to anotherItem
		// -ve: current object is less than anotherItem
		System.out.println("Comparing Items");
		return this.getItemId()-anotherItem.getItemId();
		// we all need to compare the unique/key values for managing order.
	}
	
}