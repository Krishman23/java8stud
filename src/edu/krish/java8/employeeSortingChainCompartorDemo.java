package edu.krish.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class employeeSortingChainCompartorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee("name1", "ohio",4,1,1);
		Employee emp2 = new Employee("name2", "ohio",3,1,2);
		Employee emp22 = new Employee("name2", "ohip",3,1,2);
		Employee emp21 = new Employee("name2", "ohip",2,1,2);
		Employee emp3 = new Employee("name3", "iowa",1,1,3);
		
		employees.add(emp3);
		employees.add(emp22);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp21);
		System.out.println("Before");
		for(Employee emp: employees) {
			System.out.println(emp.toString());;
		}
		Comparator<Employee> employeeNameComparator = 
				Comparator.comparing(Employee::getName, (s1, s2) -> {return s1.compareTo(s2);})
				.thenComparing(Employee::getAddress, (s1, s2) -> {return s1.compareTo(s2);})
				.thenComparing(Employee::getAge)
				.reversed()
				;
		Collections.sort(employees, employeeNameComparator);
		
		/*
		 * Comparator<Employee> employeeAgeComparator =
		 * Comparator.comparingInt(Employee::getAge); Collections.sort(employees,
		 * employeeAgeComparator);
		 */
		System.out.println("AFTER name,add,age");
		for(Employee emp: employees) {
			System.out.println(emp.toString());;
		}
		System.out.println("Reverse");
		
		employeeNameComparator = 
				employeeNameComparator
				.reversed();

		Collections.sort(employees, employeeNameComparator);
		for(Employee emp: employees) {
			System.out.println(emp.toString());;
		}
		
	}

}
