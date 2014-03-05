package com.strumsoft.thread.example;

public class SynchroizedExample implements Runnable{
	
	private Resource resource;
	
	 
    @Override
    public void run() {
        synchronized (resource) {
            resource.display();
        }
        resource.login();
    }
	
	public SynchroizedExample(Resource r) {
		this.resource = r;
	}
	

}
