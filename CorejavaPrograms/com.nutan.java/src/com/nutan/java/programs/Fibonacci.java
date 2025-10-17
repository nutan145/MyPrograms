package com.nutan.java.programs;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int n=5;
		int f1=0,f2=1,f3;
		for(int i=1;i<=n;i++)
		{
			System.out.println(f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}

	}
}
