package com.nutan.array;

import java.util.Scanner;

public class Program2 
{
	
	public static void printArray(int[] arr)
	{
		System.out.println("Elements are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Array :");
		int size = sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the "+size+" elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		printArray(arr);
	}

}
