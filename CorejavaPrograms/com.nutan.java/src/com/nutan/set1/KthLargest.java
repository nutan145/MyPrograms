package com.nutan.set1;

import java.util.PriorityQueue;

public class KthLargest 
{
	public static int findkthlargest(int[] nums,int k)
	{
		PriorityQueue<Integer> minheap=new PriorityQueue<Integer>();
		for(int num:nums)
		{
			minheap.add(num);
			if(minheap.size()>k)
			{
				minheap.poll();
			}
			
		}
		return minheap.peek();
		
	}
	public static void main(String[] args) 
	{
		int[] arr= {3,2,4,5,6,1};
		int k=2;
		int result = KthLargest.findkthlargest(arr, k);
		System.out.println(k+" largest value is :"+result);
		
		
	}

}
