package com.nutan.array;

import java.util.Scanner;

public class Program15 
{
	public static void printArray(int[] arr)
	{
		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	}
	
	public static void primeNumbers(int arr[])
	{
		boolean flag=false;
		for(int a:arr)
		{
			int c=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				flag=true;
				System.out.print(a+" ");
			}
		}
		if(flag==false)
		{
			System.out.println("no prime elements found in array");
		}
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of the array:");
	    int size=sc.nextInt();
	    int[] arr=new int[size];
	    System.out.println("enter "+size+" elements of the array:");
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
		printArray(arr);
		System.out.println("\nprime numbers in array are:");
		primeNumbers(arr);
		sc.close();
 

	}

}
