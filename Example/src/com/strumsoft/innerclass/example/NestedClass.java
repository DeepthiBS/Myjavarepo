package com.strumsoft.innerclass.example;


public class NestedClass {
	
	static class InnerClass {
		String hello = "";
		void display() {
			System.out.println("nested class: A inner class which is declared as static");
		}
	}
	
	public static void main(String[] args) {
		NestedClass.InnerClass innerclass =  new NestedClass.InnerClass();
		innerclass.display();
		//for acccessing the inner class
		NestedClass.NonStaticClass newclass = new NestedClass().new NonStaticClass();
		newclass.diplayInnerClass();
		System.out.println("");
	}
	
	private class NonStaticClass {
		static final String data = "trying create string inside innerclass";
		void diplayInnerClass() {
			System.out.println("Inner class:A class defined inside the Outer Class which is non static is called inner side");
		}
	}

}
