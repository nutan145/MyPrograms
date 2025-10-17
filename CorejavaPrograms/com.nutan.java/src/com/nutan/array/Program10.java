package com.nutan.array;

import java.util.Scanner;

public class Program10 
{
	public static void reverse(int[] arr)
	{
		System.out.println("Array elements in reverse order :");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
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
		reverse(arr);
	}

}
