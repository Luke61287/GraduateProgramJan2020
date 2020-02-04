package com.mastek.training.packone;

public class AnotherClass extends SimpleClass {
	
	public static void main(String[] args) {
		SimpleClass sc1 = new SimpleClass();
		// In the another class, of other package we can only access public members of the class
		//except private members
		System.out.println(
				//"Private: "+sc1.privateNumber+
				"\nDefault: "+sc1.defaultNumber+
				"\nProtected: "+sc1.protectedNumber+
				"\nPublic: "+sc1.publicNumber);
	}
}