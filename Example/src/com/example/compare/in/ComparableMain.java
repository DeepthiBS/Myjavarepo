package com.example.compare.in;

import java.util.Arrays;


public class ComparableMain {
	
	public static void main(String[] args) {
		ComparableExample[] examples = new ComparableExample[4];
		
		ComparableExample watermelon = new ComparableExample("watermelon", "not so good", 2);
		ComparableExample apple = new ComparableExample("Apple", "Apple description",100); 
		ComparableExample orange = new ComparableExample("Orange", "Orange description",80); 
		ComparableExample banana = new ComparableExample("Banana", "Banana description",90); 
		examples[0] =  watermelon;
		examples[1] =  apple;
		examples[2] =  orange;
		examples[3] =  banana;
		
		Arrays.sort(examples);
		
		Arrays.sort(examples, ComparableExample.ComparableCompartor);
		
		int i=0;
		for(ComparableExample temp: examples){
			System.out.println("Fruits:"+temp.getFruitName());
//		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
//			", Quantity : " + temp.getQuantity());
		}
 
		
	}

}
