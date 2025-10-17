package com.nutan.multithreading;


class Custome
{
	private double availableBalance = 20000;	
	private double withdrawAmount;
	
	public Custome(double withdrawAmount) 
	{
		super();
		this.withdrawAmount = withdrawAmount;
	}
	
	public void withdraw()
	{
		String name = null;
		
		if(withdrawAmount<= availableBalance)
		{
			name = Thread.currentThread().getName();
			System.out.println(withdrawAmount+ " Amount, withdraw by :"+name);
			availableBalance = availableBalance - withdrawAmount;
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!"+name+" you have insufficient Balance");
		}		
	}
	
}

public class BankApplication {

	public static void main(String[] args) 
	{
		Custome obj = new Custome(20000);
		
		Runnable r1 = ()-> 
		{
		  obj.withdraw();
		};
		
		Thread t1 = new Thread(r1,"Scott");
		Thread t2 = new Thread(r1,"Smith");
		
		t1.start();  
			
		t2.start();
	}

}