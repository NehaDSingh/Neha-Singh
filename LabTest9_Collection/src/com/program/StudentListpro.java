package com.program;
import java.util.ArrayList;
import java.util.Collections;

public class StudentListpro {
	public static ArrayList<Student> l1;
	public static ArrayList<Student> l2;
	public static void main(String[] args) {
		fillLists();
		printList();
	}
	
	public static void fillLists() {
		l1=new ArrayList<>();
		l2=new ArrayList<>();
		Student s1=new Student(1,"Johan", "1234567890");
		Student s2=new Student(2,"Nick","0987654321");
		Student s3=new Student(3,"Josen","7654321890");
		Student s4=new Student(4,"James","2134568790");
		Student s5=new Student(5,"Jack","6754890321");
		Student s6=new Student(6,"Daniel","5647382901");
		l1.add(s1);
		l1.add(s3);
		l1.add(s2);
		l2.add(s4);
		l2.add(s6);
		l2.add(s5);
		
	}

	public static void printList() {
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println("The Elements Sorting by Student Id :-\n");
		System.out.println(l1);
		System.out.println(l2);
		Collections.sort(l1, new Comparatorpro());
		Collections.sort(l2, new Comparatorpro());
		System.out.println("\nThe Elements Sorting by Student name :-\n");
		System.out.println(l1);
		System.out.println(l2);
	}
}