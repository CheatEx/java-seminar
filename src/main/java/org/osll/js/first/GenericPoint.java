package org.osll.js.first;

import java.util.Map;

public class GenericPoint<T> {

	protected T x;
	protected T y;
	
	
	public GenericPoint(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	public <E> GenericPoint<E> map(Map<T, E> m) {
		return new GenericPoint<E>(m.get(x), m.get(y));
	}
}
