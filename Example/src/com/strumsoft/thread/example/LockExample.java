package com.strumsoft.thread.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample implements Runnable{
	
	private Resource resource;
	private Lock lock;

	public LockExample (Resource r) {
		this.resource = r;
		this.lock = new ReentrantLock();
	}
	
	@Override
	public void run() {
		
		try {
			lock.tryLock(100, TimeUnit.SECONDS);
			System.out.println("***Locking period****");
			resource.display();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		resource.login();
	}

}
