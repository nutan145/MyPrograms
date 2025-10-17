package com.nutan.array;

import java.util.Scanner;

public class Program6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int[] arr=new int[size];
		int l=arr.length;
		
		System.out.println("Enter the "+size+" elements :");
		for(int i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("sum of first and last element is :"+(arr[0]+arr[l-1]));
	}

}
