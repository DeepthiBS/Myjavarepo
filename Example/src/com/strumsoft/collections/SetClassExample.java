package com.strumsoft.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetClassExample {
	
	/*
	 * a set contains non dupilcate as members in the class
	 * 
	 */
	
	public static void main(String[] args) {
		Set<String>  set = new HashSet<String>();
		set.add("no idea");
		set.add("oned");
		set.add("one");
		set.add("three");
		set.add("one"); 
		//its wont allow dupilcates in the code
		System.out.println("set example set: "+set.toString());
		//we can sort the code set using sortedSet
		SortedSet<String> sortedset = new TreeSet<String>(set);
		System.out.println("Sorting the set elements: "+sortedset.toString());
		System.out.println("First element after sorting: "+sortedset.first());
		System.out.println("Last element after sorting: "+sortedset.last());
		sortedset.iterator();
	}

}
