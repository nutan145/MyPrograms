package com.nutan.streamAPI84;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee 
{
	private String name;
	private int age;
	private double salary;
	private String gender;
	
	public Employee(String name, int age, double salary, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender + "]";
	}
}
class EmployeeAdder
{
	public static List<Employee> addDetails() 
	{
		List<Employee> list = new ArrayList<>();
		Employee employee1 = new Employee("Anna", 27, 50000.0, "Male");
		Employee employee2 = new Employee("Employee 2", 27, 51000.0, "Female");
		Employee employee3 = new Employee("Bob", 27, 52000.0, "Male");
		Employee employee4 = new Employee("EmplSmithoyeeee 4", 28, 53000.0, "Female");
		Employee employee5 = new Employee("Employee 5", 29, 53000.0, "Male");
		Employee employee6 = new Employee("Employee 6", 30, 55000.0, "Female");
		Employee employee7 = new Employee("EmSmithployee 7", 31, 56000.0, "Male");
		Employee employee8 = new Employee("Employee 8", 32, 57000.0, "Female");
		Employee employee9 = new Employee("Employee 9", 35, 58000.0, "Male");
		Employee employee10 = new Employee("EMPLOYEEeeseeee 10", 35, 59000.0, "Female");

		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);
		return list;

	}
}
public class Tester 
{

	public static void main(String[] args)
	{
		List<Employee> list = EmployeeAdder.addDetails();
		Set<Integer> set=new HashSet<Integer>();
		Set<String> set2=new HashSet<String>();
//		 1. Filter Employees by Gender:
//		 - Retrieve a list of all female employees.
		list.stream().filter(emp->emp.getGender().equals("Female")).forEach(System.out::println);
		System.out.println("=========================================");
	//	2. Filter Employees by Age:
//			   - Get a list of employees older than 30 years.
		list.stream().filter(age->age.getAge()<30).forEach(System.out::println);
		System.out.println("=========================================");
	//	3. Filter Employees by Salary:
//			   - Find employees with a salary greater than $50,000.
		list.stream().filter(emp->emp.getSalary()>50000).forEach(System.out::println);
		System.out.println("=========================================");
		//4. Map Employee Names:
//		//	   - Create a list of employee names (Strings).
		list.stream().map(emp->emp.getName()).forEach(System.out::println);
		System.out.println("=========================================");
//		5.Calculate Average Salary:
//			   - Calculate the average salary of all employees.
		double res = list.stream().mapToDouble(Employee::getSalary).average().orElseThrow();
		System.out.println("Average sal of total employes :"+res);
		System.out.println("=========================================");
		//6. Find Maximum Salary:
//			   - Find the employee with the highest salary.
		double val = list.stream().mapToDouble(Employee::getSalary).max().orElseThrow();
		System.out.println("Maximum salary is :"+val);
		System.out.println("===========================================");
		//7.Group Employees by Gender:
//			   - Group employees by gender and return
//			   a map with gender as the key and a list of employees as the value.
		list.stream().collect(Collectors.groupingBy(Employee::getGender)).forEach((key,value)->
		{
			System.out.println(key+" :"+value);
		});
		System.out.println("=============================================");

//		8. Count Male Employees:
//			   - Count the number of male employees.
		long count = list.stream().filter(emp->emp.getGender().equals("Male")).count();
		System.out.println("No of male employees :"+count);
		
		System.out.println("===============================================");
		//9. Sum of All Salaries:
//			   - Calculate the total sum of salaries for all employees.
		double sum = list.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Sum of total salary :"+sum);
		System.out.println("==============================================");
		//10. Sort Employees by Name:
//		    - Sort the employees by their names in alphabetical order.
		list.stream().map(emp->emp.getName()).sorted().forEach(System.out::println);
		System.out.println("=============================================");
		//11. Sort Employees by Age:
//		    - Sort the employees by age in ascending order.
		System.out.println("**********Sort the employees by age in ascending order.********");
		list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		System.out.println("===========================================");
		//12. Sort Employees by Salary:
//		    - Sort the employees by salary in descending order.
		System.out.println("*********Sort the employees by salary in descending order.******");
		list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		System.out.println("===========================================");
		//13. Find Oldest Employee:
//		    - Find the oldest employee.
		System.out.println("*********Find the oldest employee.*********");
		int old = list.stream().mapToInt(Employee::getAge).max().orElseThrow();
		System.out.println("old Employe :"+old);
		Employee employee = list.stream()
				.max((e1,e2)->(e1.getAge()-e2.getAge()))
				.get();
		System.out.println(employee);
		System.out.println("=============================================");
//		14. Group Employees by Age:
//	    - Group employees into age groups (e.g., 20-30, 31-40, etc.)
//	    and return a map with age group as the key and a list of employees as the value.
	
		System.out.println("==============================================");
//		15. Find Employees with a Specific Age:
//	    - Find all employees who are exactly 35 years old.
		System.out.println("************ Find all employees who are exactly 35 years old.***********");
		list.stream().filter(emp->emp.getAge()==35).forEach(System.out::println);
		System.out.println("==========================================");
//		16. Calculate the Sum of Salaries by Gender:
//	    - Calculate the sum of salaries for each gender (i.e., male and female)
//	    and return a map with gender as the key and the sum of salaries as the value.
		System.out.println("********* Calculate the sum of salaries for each gender**********");
		System.out.println("===========================================");
//		17. Find Employees with Names Starting with "J":
//	    - Find all employees whose names start with the letter "E."
		System.out.println("*********Find all employees whose names start with the letter J******");
		list.stream().filter(k->k.getName().startsWith("E")).forEach(System.out::println);
		
	}
}
