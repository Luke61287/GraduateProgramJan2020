package com.mastek.training.packone;
// a class can inherit from interface using implements keywords
// One class can implement more than one interfaces
// interfaces uses the class object for implementing its behaviours
// hence it is used frequently as it effectively saves additional numbers of objects created.

public class Rectangle implements Shape{
	
	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Shape.PI*(getLength()*getBreadth());
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return Shape.PI*((getLength())^2+(getBreadth()^2));
	}
	 
}