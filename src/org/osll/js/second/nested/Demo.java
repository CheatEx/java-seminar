package org.osll.js.second.nested;

import static org.osll.js.second.nested.Range.from;

public class Demo {

    private Demo() {
    }

    public static void main(String[] args) {
    	
    	for (Integer i: from(1).to(10).step(2)) {
    		System.out.println(i);
    	}
    
    }
}
