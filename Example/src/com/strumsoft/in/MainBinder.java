package com.strumsoft.in;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainBinder {
	
	
	public static void main(String[] args) {
//		Binder  binder =  new Binder();
//		binder.display("deepthi", 24);
		Injector inject = Guice.createInjector(new LinkingBinder());
		Myapplication appl  = inject.getInstance(Myapplication.class);
		appl.display("no Idea", 100);
		
		Service1 service = new Service1();
		inject.injectMembers(service);
	}

	
}
