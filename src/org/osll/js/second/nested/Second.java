package org.osll.js.second.nested;


public class Second extends First {

	public Second(String str) {
		super(str);
	}
	
	public void doAnotherStuff() {
		System.out.println(new Nested().reverse());
		//System.out.println(new Nested().capReverse());
	}

}
