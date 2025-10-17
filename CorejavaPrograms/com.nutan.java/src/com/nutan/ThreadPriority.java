package com.nutan;

public class ThreadPriority {

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Cureent Thread priority is :"+t.getPriority());
		
		Thread t1 = Thread.currentThread();
		System.out.println("Cureent Thread priority is :"+t1.getPriority());
	}

}
