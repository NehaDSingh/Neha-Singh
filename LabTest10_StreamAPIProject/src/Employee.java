
public class Employee {
	
	    //Data Members of Employee Class
		private String name;
		private int age;
		private String dept;
		private float salary;

		
		public Employee() {      //Generated Default Constructor
			super();
		}
		
		 
		public Employee(String name, int age, String dept, float salary) {      //Generate Parameterized Constructor
			super();
			this.name = name;
			this.age = age;
			this.dept = dept;
			this.salary = salary;
		}
		
		
		//Generated Getter and setter of Employee Class Members
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
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		
		//Generate to String 
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + "]";
		}
}
