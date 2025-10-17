package com.nutan.array;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int[] arr=new int[size];
		int l=arr.length;
		System.out.println("Enter the "+size+" elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		 
			 if(l%2==0)
			 {
				 int a=arr[l/2];
				 int b=arr[(l/2)-1];
				 System.out.println("Middel Elements are :"+a+"::"+b);
			 }
			 else
			 {
				 int c=arr[l/2];
				 System.out.println("Middel elements are :"+c);
			 }
		
	}

}
