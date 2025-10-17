package com.nutan.java.programs;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num= sc.nextInt();
		int rev=0,rem;
		int m=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(m==rev)
		{
			System.out.println(m+" is a palindrome number");
		}
		else
		{
			System.out.println(m+" is not a palindrome number");
		}
	}
}
