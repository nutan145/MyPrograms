//16)Count and Print Distinct Elements
 //Write a program to count the number of distinct/unique/non repeated
// elements in an array {1, 2, 2, 3, 4, 4, 5} and print those unique elements.


package com.nutan.array;

import java.util.Scanner;

public class Program16 
{
	public static void printArray(int[] arr)
	{
		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	}
	public static void countDistinctEle(int[] arr)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				flag=true;
				System.out.println(arr[i]+" ");
			}
		}
		if(flag==false)
		{
			System.out.println("No unique elemnts found in the array");
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
	    System.out.println("unique elements are :");
	    countDistinctEle(arr);
	}

}
