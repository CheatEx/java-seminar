package org.osll.js.second.bounds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparing {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(15);
		l.add(10);
		
		Comparator<Object> c = new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return Integer.signum(o1.hashCode() - o2.hashCode());
			}
		};

		System.out.println(
			Collections.min(l, c));
	}
}

class ComparableComparator<T extends Comparable<T>> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		return o1.compareTo(o2);
	}
	
}
