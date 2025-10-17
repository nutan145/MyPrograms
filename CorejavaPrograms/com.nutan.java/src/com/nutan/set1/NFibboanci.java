package com.nutan.set1;

public class NFibboanci 
{
	public static int fib(int n)
	{
		if(n==0)return 0;
		if(n==1)return 1;
		
		int f1=0,f2=1,f3=0;
		for(int i=2;i<=n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		return f2;
	}
	public static void main(String[] args) 
	{
		int n=10;
		int res = NFibboanci.fib(n);
		System.out.println("Fibonnaci ("+n+") is :"+res);
	}

}
