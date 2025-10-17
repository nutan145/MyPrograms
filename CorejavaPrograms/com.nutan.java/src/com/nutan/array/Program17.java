package com.nutan.array;

import java.util.Scanner;

public class Program17 
{
	public static void printArray(int[] arr)
	{
		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	}
	
	public static void uniqueNumbers(int arr[])
	{
		boolean flag=false;
        int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int c=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			if(c==2)
			{
				flag=true;
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicate elements in an array");
		}
		else
		{
			System.out.println("\nduplicate elements count: "+count);
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
	    System.out.println();
	    System.out.println("Duplicate Elements are :");
	    uniqueNumbers(arr);

	}

}
