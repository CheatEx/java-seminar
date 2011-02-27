package org.osll.js.second.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrintCollection {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("a"); l.add("b"); l.add("c");
		
//		printObjectCollection(l);
		printTypedCollection(l);
		printCollection(l);
	}
	
	static void printObjectCollection(Collection<Object> c) {
	    for (Object e : c) {
	        System.out.println(e);
	    }
	}
	
	static void printCollection(Collection<?> c) {
	    for (Object e : c) {
	        System.out.println(e);
	    }
	}
	
	static<T> void printTypedCollection(Collection<T> c) {
		for (T e : c) {
	        System.out.println(e);
	    }
	}
}
