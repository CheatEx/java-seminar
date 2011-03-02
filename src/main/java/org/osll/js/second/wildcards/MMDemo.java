package org.osll.js.second.wildcards;

import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

public class MMDemo implements Iterable<Entry<?, ?>> {
	private MultiMap m = new MultiValueMap();
	
	public void store(Object key, Object value) {
		m.put(key, value);
	}
	
	@SuppressWarnings("unchecked")
	public Iterator<Entry<?, ?>> iterator() {
		return m.entrySet().iterator();
	}
	
	public static void main(String[] args) {
		MMDemo md = new MMDemo();
		
		md.store("1", 1);
		md.store(2, "2");
		md.store("3", 3);
		
		for (Entry<?, ?> e: md) {
			if (e.getKey() instanceof Integer) {
				System.out.println("Value: " + e.getValue());
			}
		}
	}

}
