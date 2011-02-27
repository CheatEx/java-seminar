package org.osll.js.first;

public abstract class AbstractPoint implements IPoint {

	private int x;
	private int y;
	
	AbstractPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract int dist(IPoint dest);

}
