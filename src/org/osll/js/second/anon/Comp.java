package org.osll.js.second.anon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>() {{
			add("Abc"); add("bCd"); add("aBc"); add("Bcd"); add("CDE");}};
		
		List<String> l2 = new ArrayList<String>() {{
				add("Abc"); add("bCd"); add("aBc"); add("Bcd"); add("CDE");}};
		
		Comparator<String> ignoreCaseCompare = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.toLowerCase().compareTo(o2.toLowerCase());
			}
		};

		Collections.sort(l1);
		System.out.println( l1 );
		
		Collections.sort(l2, ignoreCaseCompare);
		System.out.println( l2 );
	}

}
