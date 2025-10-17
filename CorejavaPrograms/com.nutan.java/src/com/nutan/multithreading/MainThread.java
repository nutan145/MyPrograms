package com.nutan.multithreading;

public class MainThread 
{

	public static void main(String[] args) 
	{
		Thread thread = Thread.currentThread();//current executing thread obejct
		System.out.println(thread);

		String name = Thread.currentThread().getName();//to get the name of the thread
		System.out.println(name);
	}

}
