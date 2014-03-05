package com.strumsoft.in;

import com.google.inject.Inject;

public class Myapplication {

	private BindInterface service;
	
	//constructor based service
//	@Inject
//	public Myapplication(Service1 service) {
//		this.service =  service;
//	}
	
	@Inject
	public void setService(BindInterface service) {
		this.service =  service;
	}
	
	public void display(String name, int age) {
		
		service.display(name, age); // some business logic here
	}

}
