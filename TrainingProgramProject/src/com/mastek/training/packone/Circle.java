package com.mastek.training.packone;

public class Circle implements Shape{

	private int Radius;

	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Shape.PI*(getRadius()*getRadius());
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return 2*Shape.PI*getRadius();
	}
	
}