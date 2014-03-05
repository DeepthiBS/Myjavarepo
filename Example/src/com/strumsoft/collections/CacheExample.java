package com.strumsoft.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheExample {
	
	private final static int CACHE_MAX_INT_SIZE =  10;
	private  LinkedHashMap<String,Integer> cache;
	
	
	@SuppressWarnings("serial")
	public CacheExample() {
		cache =  new LinkedHashMap<String, Integer>(CACHE_MAX_INT_SIZE, 0.75f, true) { 
			@SuppressWarnings("unused")
			protected boolean removeeldestEntry(Map.Entry<String, Integer> eldest) {
				  // Remove the eldest entry if the size of the cache exceeds the
					return size() > CACHE_MAX_INT_SIZE;
				}
				
		};
	}

	public static void main(String[] args) {
		CacheExample example = new CacheExample();
//		example.cache.entrySet().add(Entry<String,Integer>);
		System.out.println(example.cache.keySet());
		
	}

}
