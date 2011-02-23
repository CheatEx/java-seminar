package org.osll.js.second.nested;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {
	
	private final int from;
	private final int to;
	private final int step;
	
	private Range(int from) {
		this(from, Integer.MAX_VALUE, 1);
	}
	
	private Range(int from, int to) {
		this(from, to, 1);
	}
	
	private Range(int from, int to, int step) {
		if (from > to)
			throw new IllegalArgumentException(
				"Begining of the range is bigger than end");
		
		this.from = from;
		this.to = to;
		this.step = step;
	}
	
	public static Range from(int from) {
		return new Range(from);
	}
	
	public Range to(int to) {
		return new Range(from, to);
	}
	
	public Range step(int step) {
		return new Range(from, to, step);
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new RangeIterator();
	}
	
	private class RangeIterator implements Iterator<Integer> {

		private int cursor = from;
		
		@Override
		public boolean hasNext() {
			return cursor <= to;
		}

		@Override
		public Integer next() {
			if (hasNext()) {
				int tmp = cursor;
				cursor += step;
				return tmp;
			} else {
				throw new NoSuchElementException();
			}
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException(
					"Range is built once and forever!");
		}
	
	}

}
