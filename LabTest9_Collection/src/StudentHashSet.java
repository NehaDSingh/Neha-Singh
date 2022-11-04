import java.util.HashSet;

import com.program.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		HashSet<Student> hset=new HashSet<>();
		Student s1=new Student(1, "Johan", "1234567890");
		Student s2=new Student(2,"Nick","0987654321");
		Student s3=new Student(3,"Josen","7654321890");
		Student s4=new Student(4,"James","2134568790");
		Student s5=new Student(5,"Jack","6754890321");
		
		hset.add(s1);
		hset.add(s3);
		hset.add(s5);
		hset.add(s4);
		hset.add(s2);
		for (Student student : hset) {
			if (student.getSid()>3) {
				System.out.println(student);
			}
		}  
  }
}