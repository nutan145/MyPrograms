package com.nutan.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo1 {

	public static void main(String[] args) 
	{
		Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5); 
	       Optional<Integer> reduce = integerStream.reduce(Integer::sum);
	       
	       reduce.ifPresent(System.out::println);
	           
	       
	      
	        
	        System.out.println("==========================================");
	      
	        integerStream = Stream.of(1, 2, 3, 4, 5);
	        Integer sumWithIdentity = integerStream.reduce(5, Integer::sum);
	        System.out.println(sumWithIdentity); 

	        System.out.println("==========================================");
	        
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        Optional<Integer> max = numbers.stream()
	                                       .reduce(Integer::max);

	        max.ifPresent(System.out::println);
	        
	        System.out.println("==========================================");
	        
	        List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5);

	        Optional<Integer> product = numberss.stream()
	                                           .reduce((a, b) -> a * b);

	        product.ifPresent(System.out::println); 
	        
	        System.out.println("==========================");
	        Integer reducee = numbers.stream().reduce(1,(a,b)-> a*b);
	        System.out.println(reducee);
	}

}
