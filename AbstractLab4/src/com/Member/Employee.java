package com.Member;

public class Employee extends Member {

	private String specialization;

	public Employee(String name, int age, String phoneNumber, String address, double salary,String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}
