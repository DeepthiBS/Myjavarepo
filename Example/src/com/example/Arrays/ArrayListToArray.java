package com.example.Arrays;

import java.util.ArrayList;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		ArrayList<String> example = new ArrayList<String>();
		example.add("hi");
		example.add("hello");
		example.add("how");
		example.add("hell");
		System.out.println("ArrayList in java example : "+example);
		String[] arr = new String[example.size()];
		example.toArray(arr);
		System.out.println("Converting the list to the array: "+arr.toString());
		for(String array :arr) {
			System.out.println(array);
		}
		
	}

}
