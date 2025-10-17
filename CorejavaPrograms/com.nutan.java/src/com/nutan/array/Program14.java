package com.nutan.array;

import java.util.Scanner;

public class Program14 
{
	public static void printArray(int[] arr)
	{
		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	}
	
	public static void elementCount(int[] arr,int k)
	{
		boolean flag=false;
		System.out.println("\nElements Appearing Exactly "+k+" Times:");
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
			if(c==k)
			{
				int cnt=0;
				for(int m=0;m<arr.length;m++)
				{
					if(arr[i]==arr[m])
					{
						cnt++;
					}
				}
				if(cnt==k)
				{
					flag=true;
					System.out.print(arr[i]+" ");
				}
			}
		}
		if(flag==false)
		{
			System.out.println("no elements found");
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException
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
	    System.out.println("eneter the elements how many times appear:");
	    int k=sc.nextInt();
	    printArray(arr);
	    elementCount(arr,k);
	}

}
