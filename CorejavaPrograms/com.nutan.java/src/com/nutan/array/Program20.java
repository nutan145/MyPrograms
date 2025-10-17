package com.nutan.array;

import java.util.Scanner;

public class Program20 
{
	public static void median(int[] arr)
	{
		int l=arr.length;
		if(l%2==0)
		{
			double median=(arr[l/2]+arr[l/2-1])/2.0;
			System.out.println("Median is :"+median);
		}
		else
		{
			int median=arr[l/2];
			System.out.println("Median is :"+median);
		}
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
		median(arr);
	}

}
