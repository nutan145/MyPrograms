package com.nutan.multithreading;

class Demo extends Thread
{
	private int val = 0;
	
	@Override
	public void run()
	{
		synchronized(this)
		{
			for(int i=1; i<=10; i++)
			{
				val = val + i;
			}
			System.out.println("Completed My task, Sending u notification");
			notify();		
		}
	}
	
	public int getVal()
	{
		return this.val;
	}
	
	
	
	
}

public class ITCDemo3 {

	public static void main(String[] args) throws InterruptedException 
	{		
		Demo d1 = new Demo();
		d1.start();
						
		synchronized(d1)
		{			
			System.out.println("main thread is waiting Here :");
			d1.wait();
			System.out.println("Main thread got notification :");
			System.out.println(d1.getVal());
		}
		
		
	}

}
