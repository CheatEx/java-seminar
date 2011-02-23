package org.osll.js.second.anon;

import static org.osll.js.second.nested.Range.from;

import java.util.Iterator;

public class Anon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object o = new Object() {
			public int hashCode() {
				return 0;
			}
		};
		System.out.println(o.hashCode());
		
		Iterable<Integer> source = new Iterable<Integer>() {
			@Override
			public Iterator<Integer> iterator() {
				return from(1).to(10).iterator();
			}
		};
		
		for (Integer i: source) {
			System.out.println("I = " + i);
		}
	}
}

