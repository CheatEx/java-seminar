package org.osll.js.first;

public class Point implements IPoint {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point move(int dx, int dy) {
		return new Point(x+dx, y+dy);
	}

}
