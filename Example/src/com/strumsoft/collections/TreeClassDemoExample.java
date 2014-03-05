package com.strumsoft.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeClassDemoExample {
	
	public static void main(String[] args) {
		
		TreeMap<Object, Object> map = new TreeMap<Object, Object>();
		map.put("noidea!!!",new String("big zero"));
//		map.put(10,new Integer(0));
		map.put("good",new Double(15));
//		System.out.println("Tree Map :"+ map.toString());
//		System.out.println("Entry set In Tree: "+map.entrySet());
		Iterator<?>  iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry mapentries = (Map.Entry)iterator.next();
			System.out.println("Entry in Map:"+mapentries.getValue());
			mapentries.setValue("new value");;
		}
		System.out.println("Entry set In Tree: "+map.entrySet()); 
	}

}
