package com.nutan.concurrent;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample1 {

	public static void main(String[] args) 
	{
		List<String> listofFruits = Arrays.asList("Mango","Orange","Apple","Grapes");
		
		CopyOnWriteArrayList<String> copyOnwrite=new CopyOnWriteArrayList<String>(listofFruits);
		
		System.out.println("WIthout modification :"+copyOnwrite);
		
		//iterator1
		Iterator<String> iterator1 = copyOnwrite.iterator();
		
		copyOnwrite.add("Bannana");
		
		System.out.println("After Modification :"+copyOnwrite);
		
		//iterator2
		Iterator<String> iterator2 = copyOnwrite.iterator();
		
		System.out.println("Iterator1 Before Modification :");
		iterator1.forEachRemaining(System.out::println);
		System.out.println("Iterator2 After Modification :");
		iterator2.forEachRemaining(System.out::println);
	}

}
