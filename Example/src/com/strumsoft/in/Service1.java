package com.strumsoft.in;

import com.google.inject.Singleton;

@Singleton
public class Service1 implements BindInterface{

	@Override
	public void display(String name, int age) {
		System.out.println("Implementing the dependecy injection using guicein service1");
		System.out.println("name:"+name +" age:"+age);
	}
	

}
