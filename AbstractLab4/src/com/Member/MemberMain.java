package com.Member;

public class MemberMain {

	public static void main(String[] args) {
		
        Employee employee = new Employee("Abhishek",22,"1234567896","Chembur",35000,"Information Technology");
        System.out.println("\nEmployee Information....");
		System.out.println("Name :"+employee.getName());
		System.out.println("Age :"+employee.getAge());
		System.out.println("Contact :"+employee.getPhoneNumber());
		System.out.println("Address :"+employee.getAddress());
		System.out.println("Salary :"+employee.getSalary());
		System.out.println("Specialization :"+employee.getSpecialization());
		
		
		Manager manager = new Manager("Yuvraj",35,"1234567890","Kurla",70000,"Information Technology");
	    System.out.println("\nManager Information....");
		System.out.println("Name :"+manager.getName());
		System.out.println("Age :"+manager.getAge());
		System.out.println("Contact :"+manager.getPhoneNumber());
		System.out.println("Address :"+manager.getAddress());
		System.out.println("Salary :"+manager.getSalary());
		System.out.println("Department :"+manager.getDepartment());
       
}
	

	}
