package com.nutan.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Department(Integer deptId, String deptName)
{	
	
}

record Employee6(Integer empId, String empName, double salary, Department dept)
{
	//111 , "A", 23890.89, new Department(1,"IT");
}
public class CollectDemo4
{

	public static void main(String[] args) 
	{
		Employee6 e1 = new Employee6(111, "Raj", 23789.89, new Department(1, "IT"));
		Employee6 e2 = new Employee6(222, "Rahul", 23789.89, new Department(1, "IT"));
		Employee6 e3 = new Employee6(333, "Scott", 23789.89, new Department(2, "Sales"));
		Employee6 e4 = new Employee6(444, "Smith", 23789.89, new Department(2, "Sales"));
		Employee6 e5 = new Employee6(333, "Virat", 23789.89, new Department(3, "HR"));
		Employee6 e6 = new Employee6(444, "Rohit", 23789.89, new Department(3, "HR"));
		
		Stream<Employee6> stream = Stream.of(e1,e2,e3,e4,e5,e6);
		Map<Department, List<Employee6>> result = stream.collect(Collectors.groupingBy(Employee6::dept));
		result.forEach((dep,emps)->
		{
			System.out.println(dep+":"+emps);
		});

	}

}
