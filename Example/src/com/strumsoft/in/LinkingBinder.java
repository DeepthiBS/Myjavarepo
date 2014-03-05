package com.strumsoft.in;

import com.google.inject.AbstractModule;

public class LinkingBinder extends AbstractModule{

	
//	Map types which map btwn interface and its class which implements it
	@Override
	protected void configure() {
//		bind(BindInterface.class).to(Service2.class);
		System.out.println("***********Binder Class ************************");
		bind(BindInterface.class).to(Service1.class);
//		based on the bind method it exceute the Service class in application which used by MyApplication
		
	}

}
