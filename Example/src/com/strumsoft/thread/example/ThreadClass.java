package com.strumsoft.thread.example;

public class ThreadClass {
	
	public static void main(String[] args) {
		Resource resource = new Resource();
		LockExample lockExample = new LockExample(resource);
		lockExample.run();
		SynchroizedExample lock = new SynchroizedExample(resource);
//		lock.run();
	}

}
