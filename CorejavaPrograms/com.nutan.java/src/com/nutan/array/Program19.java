/*
19)Search for a given Element in an Array if present then print
   "Element found at index : ", if not present print "Element not found"
    Input as: 1 4 3 5 2 6 5
    Enter searching element: 5
    Output: Element found at index 6

     Input as: 1 4 3 5 2 6
    Enter searching element: 7
    Output: Element not found
*/
package com.nutan.array;

import java.util.Scanner;

public class Program19 
{
	public static void search(int[] arr,int ele)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				flag=true;
				System.out.println("Element found at index :"+i );
			}
		}
		if(flag==false)
		{
			System.out.println("ELement Not Found");
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
		System.out.println("Enter the searching element :");
		int ele = sc.nextInt();
		search(arr, ele);
	}

}
