import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Employeemain {
    static ArrayList<Employee> emp;
	public static void main(String[] args) {
		fillList();
		sortedList();
		greaterSalary();
		maximumSalary();
	}
	public static void maximumSalary() {
		System.out.println("\nEmployee having maximum salary");
		System.out.println(emp.stream().max((a,b)->a.getSalary()>b.getSalary()?1:-1).get());
	}
	public static void greaterSalary() {
		System.out.println("Employees whose salary is greater than 10000 : \n");
		System.out.println(emp.stream().filter(e1->e1.getSalary()>10000).collect(Collectors.toList()));
	}
	public static void sortedList() {
		System.out.println("Employees list sorted based on their name : \n");
		Collections.sort(emp, (a,b)->(a.getName().compareTo(b.getName())));
	    System.out.println(emp);
	}
	public static void fillList() {
		emp=new ArrayList<>();
		Employee e1=new Employee("Yuvraj", 24, "Software Development", 10000);
		Employee e2=new Employee("Nagaarjun", 25, "Technical Support", 40000);
		Employee e3=new Employee("Abhishek", 23, "Finances Management Account  ", 50000);
		Employee e4=new Employee("yogesh", 24, "Management Account ", 90000);
		Employee e5=new Employee("koshal", 23, "Non IT Department", 70000);
		Employee e6=new Employee("advik", 22, "UI/UX Design", 60000);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
	}
	}

