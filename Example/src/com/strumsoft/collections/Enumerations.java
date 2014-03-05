package com.strumsoft.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerations {
	
	public static void main(String[] args) {
		Enumeration<?> days; 
		//Vector is like java array  which contains the index in the vector
		
		Vector<String> vector = new Vector<String>();
		vector.add("jan");
		vector.add("feb");
		vector.add("march");
		vector.add("apr");
		vector.add("may");
		days =  vector.elements();
		while(days.hasMoreElements()) {
			System.out.println("Enumerations: "+days.nextElement());
		}
		
		
	}

}
