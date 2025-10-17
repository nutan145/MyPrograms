package com.nutan.multithreading;
class Foo extends Thread
{
	@Override
	public void run()
	{
		System.out.println("child thread is runnning");
	}
}
public class IsAlive 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Thread Started ");
		Foo fo=new Foo();
		System.out.println("Thread is :"+fo.isAlive());
		fo.start();
		System.out.println("Thread is :"+fo.isAlive());
		System.out.println("Main thread end");
	}

}
