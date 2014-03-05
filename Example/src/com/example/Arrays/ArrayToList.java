package com.example.Arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		String[] asset = {"equity", "stocks", "gold", "foreign exchange","fixed income", "futures", "options"};
		System.out.println("Array  : "+asset);
		List assetList = Arrays.asList(asset);  
		System.out.println("Array List : "+assetList.toString());
		
	}

}
