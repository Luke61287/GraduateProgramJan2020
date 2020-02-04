package com.mastek.training.packtwo;

import com.mastek.training.packone.SimpleClass;

public class AnotherClass extends SimpleClass {
	
	public static void main(String[] args) {
		AnotherClass sc1 = new AnotherClass();
		// In the Another class, of the same package we can access public and protected members of the class except
		// we cannot access private and default members of the class.
		System.out.println(
				//"Private: "+sc1.privateNumber+
				//"\nDefault: "+sc1.defaultNumber+
				"\nProtected: "+sc1.protectedNumber+
				"\nPublic: "+sc1.publicNumber);
	}
}