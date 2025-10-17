/*
 * 22)Implement a Java program to find the index number of an element 
 in an int array from a given range by using binary searching and 
 display the results.
 
 int[] nums = {3,4,5,6,7,8,12,13};
 Enter the starting index : 3
 Enter the ending index : 6
 Enter the element: 7
 
 Output:
 7 present at 4 index.

 */
package com.nutan.array;

import java.util.Scanner;

public class Program22 
{
	public static void printArray(int[] arr)
	{
		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	}
	public static int binarySearching(int[] arr,int start,int end,int ele)
	{
		int left=start;
		int right=end;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==ele)
			{
				return mid;
			}
			else if(arr[mid]>ele)
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		return -1;
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
		printArray(arr);
		System.out.println();
		System.out.println("Enter the starting index :");
		int start = sc.nextInt();
		System.out.println("Enter the end index :");
		int end = sc.nextInt();
		System.out.println("Enter the element :");
		int ele = sc.nextInt();
		int binSrch = binarySearching(arr, start, end, ele);
		System.out.println(ele+" present at "+binSrch+" index");
		
	}

}
