package org.osll.js.second.nested;

public class First {
	private String str;
	
	public First(String str) {
		this.str = str;
	}
	
	private String captilase() {
		return str.toUpperCase();
	}
	
	public void doStuff() {
		System.out.println(new Nested().reverse());
		System.out.println(new Nested().capReverse());
	}
	
	public class Nested {
		public String reverse() {
			return new StringBuffer(str)
				.reverse().toString();
		}
		
		private String capReverse() {
			return new StringBuffer(First.this.captilase())
				.reverse().toString();
		}
	}
}
