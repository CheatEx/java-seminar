package org.osll.js.first;

public class ScreenPoint extends GenericPoint<Integer> {

	public ScreenPoint(Integer x, Integer y) {
		super(x, y);
	}

	public GenericPoint<Integer> move(Integer dx, Integer dy) {
		return new ScreenPoint(x+dx, y+dy);
	}
	
	public static void main(String[] args) {
		ScreenPoint p = new ScreenPoint(1, 2);
		GenericPoint<Integer> m = p.move(2, 3);
		
		GenericPoint<Integer> gp = p;
		gp = new GenericPoint<Integer>(3, 4);
	}

}
