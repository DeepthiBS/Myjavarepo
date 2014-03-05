package com.example.autoBoxing;

import java.util.ArrayList;
import java.util.List;

public class ComparsionExample {
	public static void main(String[] args) {
		// for primitive data type comparsions works like this when comes to autoboxin and unboxing
		
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(new Integer(1));
		ints.add(new Integer(2));
		
		
		int example = ((Integer)ints.get(0)).intValue();
		System.out.println(example);
		
	}

}
