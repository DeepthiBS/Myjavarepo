package com.strumsoft.in;

public class Service2 implements BindInterface{

	@Override
	public void display(String name, int age) {
		System.out.println("Implementing the dependecy injection using guicein service2");
	}
	

}
