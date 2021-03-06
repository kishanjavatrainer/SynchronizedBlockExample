package com.infotech.workers;

public class MakingCounter implements Runnable {

	private int counter;
	
	@Override
	public void run() {
		for (int i = 1; i <=20000; i++) {
				increment();
		}
	}

	private  void increment() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName);
		synchronized (this) {
			counter++;
		}
	}
	public int getCounter() {
		return counter;
	}
}
