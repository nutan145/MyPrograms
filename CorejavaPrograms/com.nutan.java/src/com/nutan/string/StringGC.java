package com.nutan.string;

public class StringGC {

	public static void main(String[] args) throws InterruptedException 
	{
		String s1="India";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1=null;
		System.gc();
		
		Thread.sleep(2000);
		
		String s2="India";
		System.out.println(s2);
		System.out.println(s2.hashCode());

	}

}
