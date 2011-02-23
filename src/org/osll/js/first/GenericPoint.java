package org.osll.js.first;

public class GenericPoint<T> {

	protected T x;
	protected T y;
	
	
	public GenericPoint(T x, T y) {
		this.x = x;
		this.y = y;
	}

}
