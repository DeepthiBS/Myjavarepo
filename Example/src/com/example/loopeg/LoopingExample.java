package com.example.loopeg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoopingExample {

	
	public static void main(String[] args) {
		//for each loop in java
		HashMap<String, String> mapexample=  new HashMap<String, String>();
		mapexample.put("one", "hi");
		mapexample.put("two", "hello");
		mapexample.put("three", "helll");
		for(String keys: mapexample.keySet()) {
			System.out.println("Example for ForEach Example which contains KEYSET: "+keys);
		}
		
		/*
		 * iterating the key-set in the loop using keyIterator
		 */
		Iterator<String> iterator = mapexample.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println("Example For Iterator : "+iterator.next());
		}
		
		/*
		 * using entry set also we can iterate 
		 */
		Set<Map.Entry<String, String>> entrySet  = mapexample.entrySet();
		Iterator<Entry<String, String>> entrySetIterator = entrySet.iterator();
		while(entrySetIterator.hasNext()) {
			System.out.println("Map.Entry set using tat we can which can iterate: "+entrySetIterator.next());
		}
	}
}
