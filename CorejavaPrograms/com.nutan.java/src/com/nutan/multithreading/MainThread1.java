package com.nutan.multithreading;

class UserThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("user thread running on the separate stack");
	}
}
public class MainThread1 
{

	public static void main(String[] args)
	{
		System.out.println("Main Thread Started");
		UserThread us=new UserThread();
		us.start();
		System.out.println("main method end");
	}

}
