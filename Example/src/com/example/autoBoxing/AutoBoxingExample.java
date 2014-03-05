package com.example.autoBoxing;

public class AutoBoxingExample {
	
	public static void main(String[] args) {
		/*
		 * example for autoBoxing
		 *
		 */
		
		//before autoboxing
		Integer iObject = Integer.valueOf(3);
		int iPrimitive = iObject.intValue();
//		System.out.println("Example: "+iPrimitive);

		
		//object comparsions not the values
		Integer one = new Integer(1);
		Integer anotherOne = new Integer(1);
		      
		if(one == anotherOne){
		  System.out.println("Object comparsions both one are equal");
		          
		}else{
		   System.out.println("Object comparsions Both one are not equal");
		}
		
		if(one.equals(anotherOne)){
			  System.out.println(" Values of the Object comparsions both one are equal");
			          
			}else{
			   System.out.println("Values of the Object comparsions Both one are not equal");
			}


	}

}
