package com.nutan.java.programs;

import java.util.Scanner;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int m,sum=0,c=0,rem;
		m=num;
		while(m!=0)
		{
			c++;
			m=m/10;
		}
		m=num;
		while(m!=0)
		{
			rem=m%10;
			sum+=(int)Math.pow(rem, c);
			m=m/10;
		}
		if(sum==num)
		{
			System.out.println(num+ ": is a armstrong number");
		}
		else
		{
			System.out.println(num+ ": is not a armstrong number");
		}

	}

}
