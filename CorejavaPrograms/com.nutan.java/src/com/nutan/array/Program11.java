package com.nutan.array;

import java.util.Scanner;

public class Program11 
{
	public static void oddEvenCount(int[] arr)
	{
		int evenCount=0,oddCount=0;
		for(int x:arr)
		{
			if(x%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even elements count are :"+evenCount);
		System.out.println("Odd elements count are :"+oddCount);
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
		oddEvenCount(arr);
	}

}
