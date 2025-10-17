package com.nutan.array;

import java.util.Scanner;

public class Program7 
{
	public static void Even(int[] arr)
	{
		System.out.print("Even elements are :");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void Odd(int[] arr)
	{
		System.out.print("Odd elements are :");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
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
		Even(arr);
		Odd(arr);
	}

}
