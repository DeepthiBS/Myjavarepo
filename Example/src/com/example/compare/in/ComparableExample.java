package com.example.compare.in;

import java.util.Comparator;

public class ComparableExample implements Comparable<ComparableExample>{

	
	String fruitName;
	String fruitDesc;
	int quantity;
	
	
	public ComparableExample(String fruitname, String fruitdesc, int quantity) {
		this.fruitName =  fruitname;
		this.fruitDesc = fruitdesc;
		this.quantity =  quantity;
	}
	
	public String getFruitName() {
		return fruitName;
	}



	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}



	public String getFruitDesc() {
		return fruitDesc;
	}



	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public int compareTo(ComparableExample comparableExample) {
		
//		int compareQuantity = ((ComparableExample) comparableExample).getQuantity();  
//		return this.quantity - compareQuantity;
//		return this.quantity - comparableExample.getQuantity();
		
		return comparableExample.getQuantity() - this.quantity;
		
	}
	
	// comparable based on the example;
	public static Comparator<ComparableExample> ComparableCompartor  = new Comparator<ComparableExample>() {

		@Override
		public int compare(ComparableExample example1, ComparableExample example2) {
			String fruit1 =  example1.getFruitName();
			String fruit2 = example2.getFruitName();
			
			return fruit1.compareTo(fruit2);
		}
	};

}
