package org.osll.js.second.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleEnum {
	
	public static void main(String[] args) {
		System.out.println(str(Color.BLUE));
		
		List<Color> l = Arrays.asList(Color.values());
		System.out.println(l);
		
		List<Color> l2 = Arrays.asList(Color.GREEN, Color.RED);
		Collections.sort(l2);
		System.out.println(l2);
		
		Color ourCase = Color.BLUE;
		
		switch (ourCase) {
		case BLUE:
			System.out.println("Blue!!!");
			break;

		default:
			System.out.println("Oops");
			break;
		}
	}
	
	private static String str(Color c) {
		return c.toString() + " color";
	}
}

enum Color {
	RED,
	BLUE,
	GREEN
}
