package com.nutan.multithreading;

class Fool implements Runnable
{

	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println("child Thread name is :"+name);
		
	}
	
}
public class ThreadGroupDemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ThreadGroup tg=new ThreadGroup("Batch38");
		
		Thread t1=new Thread(tg,new Fool(),"scott");
		Thread t2=new Thread(tg,new Fool(),"smith");
		Thread t3=new Thread(tg,new Fool(),"allen");
		Thread t4=new Thread(tg,new Fool(),"ram");
		Thread t5=new Thread(tg,new Fool(),"Virat");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		//Thread.sleep(1000);
		System.out.println("How many threads are active under Batch 38 group :"+tg.activeCount());
		System.out.println("Thread group name :"+tg.getName());

	}

}
