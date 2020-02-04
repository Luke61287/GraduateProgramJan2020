package com.mastek.training.packone;

public class SimpleClass {
	
	private int privateNumber = 10;
	int defaultNumber = 10;
	protected int protectedNumber = 10;
	public int publicNumber;
	
	public static void main(String[] args) {
		SimpleClass sc1 = new SimpleClass();
		System.out.println(
				"Private: "+sc1.privateNumber+
				"\nDefault: "+sc1.defaultNumber+
				"\nProtected: "+sc1.protectedNumber+
				"\nPublic: "+sc1.publicNumber);
	}
}