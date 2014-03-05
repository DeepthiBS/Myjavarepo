package com.strumsoft.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefelectExample {
	
	public static void main(String[] args) throws InstantiationException {
		
		Method[] method = EmployeeExample.class.getMethods();
		System.out.println(method.length);
		for(Method meth : method) {
//			System.out.println(meth.getName());
		}
		
		Method[]  reflectmethod = AppTest.class.getMethods();
		for(Method meth : reflectmethod) {
//			System.out.println("REFLECT :"+meth.getName());
		}
		
		try {
			Class cls = Class.forName("com.strumsoft.example.AppTest");
			
			System.out.println("PACKAGE:" +cls.getPackage());
			try {
				Object obj = cls.newInstance();
				Method method1 =  cls.getDeclaredMethod("display", String.class);
				method1.invoke(obj, new String("deepthi"));
				method1 =  cls.getDeclaredMethod("reflectDisplay", String.class,int.class);
				method1.invoke(obj, new String("reflect"), new Integer(23));
				
			} catch (SecurityException e) {
				// TODO Auto-generated catch blochk
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
