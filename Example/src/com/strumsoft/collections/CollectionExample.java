package com.strumsoft.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionExample {
	
	@Override
	public String toString() {
		return super.toString();
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("deeps");
		list.add("sow");
		list.add("prats");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println("*******"+object);
		}
		System.out.println("remove the object:"+list.remove("deeps"));
		Collection<String> collection   = new ArrayList<String>();
		collection.addAll(list);
		System.out.println("Collection:"+collection.toString());
		collection.removeAll(list);
		System.out.println("Collection remove method:"+collection.toString());
		System.out.println("List:"+list.toString());
		boolean isContains =  list.contains("sow");
		System.out.println("List.contains:"+isContains);
		
		// For declaring the array in java
		Arrays[] arr = new Arrays[3];
		String[] example = {"deepthi","noidea","hahaha"};
		System.out.println("ARRAYin JAVA:"+example.toString());
//		for(int i=0 ;i<example.length;i++) {
//			System.out.println("objects in java array:"+example[i]);
//		}
		
		//for reverse the order for loop in java
		for(int j= example.length-1 ;j >=0;j--){
			System.out.println("Reverse order in java array:"+ example[j]);
			
		}
		
		//for each loop in java
		for(String foreach: example){
			System.out.println("Foreach Loop in java:"+foreach);
		}
	}
}
