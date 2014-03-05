package com.strumsoft.innerclass.example;

public class InnerClass {
	
	private class InnerClass2 {
		static final  String statdata  = "stat data which is string here are trying to be accessed";
		String data ="Hi accessing the inner class object here "; 
		final String unchanged  = "Hi guys accessing the inner class objects here which is declared as final";
		
		private void display() {
			System.out.println("inside the inner classes");
		}
	}

	
	public void outerclassDisplay() {
		System.out.println("outside the class");
	}
	
	public static void main(String[] args) {
//		InnerClass mainclass = new InnerClass();
//		InnerClass.InnerClass2 innerclassobject =  mainclass.new InnerClass2();
		
		// one more way to accees the inner class object is as follows
		InnerClass.InnerClass2  classobject  =  new InnerClass().new InnerClass2();
//		innerclassobject.data = innerclassobject.data +  "in the outer clss and u can modify the data :)";
//		innerclassobject.unchanged = innerclassobject.unchanged +  "lets try to mdofiy";
		System.out.println(""+classobject.data);
		System.out.println(""+classobject.unchanged);
	}
}
