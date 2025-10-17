package com.nutan.array;

import java.util.Scanner;

public class Program12 
{
	
	public static void countAvg(int[] arr)
	{
		int sum=0,avg=0,count=0;
		for(int x:arr)
		{
			sum+=x;
		}
		avg=sum/arr.length;
		for(int y:arr)
		{
			if(y>avg)
			{
				count++;
			}
		}
		System.out.println("count is :"+count);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the "+size+" elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		countAvg(arr);
	}

}
