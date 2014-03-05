package com.strumsoft.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedExample {
	
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet();
		set.add("oned");
		set.add("one");
		set.add("three");
		/// these sort according ascending order in the set..
		// set itself is like tat
		System.out.println("Sorted set: "+set.toString());
	}

}
