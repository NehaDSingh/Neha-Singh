import java.util.TreeSet;

import com.program.Student;
import com.program.StudentListpro;

public class StudentTree {

	public static void main(String[] args) throws Exception{
		TreeSet<Student> set=new TreeSet<>();
		
		StudentListpro.fillLists();
		set.addAll(StudentListpro.l1);
		set.addAll(StudentListpro.l2);
		System.out.println("Number of element in the set : "+set.size());
		
		System.out.println("\nThe First element in the set is : \n"+set.pollFirst());
		System.out.println("\nThe Last element in the set is  : \n"+set.pollLast());
	}

}