//21) Write java method named findEvenandOddPositionElement that print
 //all the elements which is present at even index and also in odd index.

package com.nutan.array;

import java.util.Scanner;

public class Program21 
{
	public static void findEvenandOddPositionElement(int[] arr)
	{
		System.out.println("elements which are present in the even index :");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]+" ");
			}
			
		}
		System.out.println("elements which are present in the odd index :");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]+" ");
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
		findEvenandOddPositionElement(arr);
	}
}
