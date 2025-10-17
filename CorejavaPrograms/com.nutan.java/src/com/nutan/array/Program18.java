/*
 * 18)Find Maximum and Minimum Element in an Array.
 Input as: 6 3 2 1 5 5 4
 Output as: Max is: 6
                       Min is:1

 */
package com.nutan.array;

import java.util.Scanner;

public class Program18 
{
	public static void maxMin(int[] arr)
	{
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum element :"+max);
		System.out.println("Minimum element :"+min);
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
		maxMin(arr);
		

	}

}
