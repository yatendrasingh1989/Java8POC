package com.yaten.java.test;

import java.util.*;


public class TestIris {


	static class Employee {


		public Employee(String empId, String empName, Double salary, int age) {

			super();

			this.empId = empId;

			this.empName = empName;

			this.salary = salary;

			this.age = age;

		}

		public String empId;

		public String empName;

		public Double salary;

		public int age;

	}


	//TODO : Need to Implement by using Java 8 Streams

	public static void printEmployeeName(Map<String, Employee> empMap, String ageLimit ){
		int ageLimitInt=Integer.valueOf(ageLimit);
		// Print all employee's name whose age is greater than ageLimit(second parameter of this method)
		empMap.entrySet().stream().filter(e ->{
			return e.getValue().age>ageLimitInt;
		}).forEach(e ->{
			System.out.println(e.getValue().empName);
		});

	}



	public static void main(String...strings){

		//Created 4 Employee Objects

		Employee e1 = new Employee("e1", "Amar", 1000.0, 25);

		Employee e2 = new Employee("e2", "Akbar", 1050.0, 27);

		Employee e3 = new Employee("e3", "Anthony", 1100.0, 23);

		Employee e4 = new Employee("e4", "Geeta", 1200.0, 26);


		//Populate employee Object in map.

		Map<String, Employee> empMap = new HashMap<String, Employee>();

		empMap.put("e1", e1);

		empMap.put("e2", e2);

		empMap.put("e3", e3);

		empMap.put("e4", e4);


		printEmployeeName(empMap, "25");


	}

}
