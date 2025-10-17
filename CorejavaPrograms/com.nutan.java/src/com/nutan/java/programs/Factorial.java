package com.nutan.java.programs;

public class Factorial {

	public static void main(String[] args)
	{
		int fact=1;
		int n=5;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial is :"+fact);
	}

}
