package teststuff;
//package com.barclays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		Map<Long, String> entries = new TreeMap()<>();
		entries.put(2198472L, "Airtel");
		entries.put(427184L, "Lion");
		entries.put(213214L,"Dog");
		entries.put(213214L,"cat");
		
		System.out.println(entries.get(213214L));
	}

}
