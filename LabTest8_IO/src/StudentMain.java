import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.regex.Pattern;

   public class StudentMain {
		private static void serializeStudent (Student[] s) throws Exception{
		FileOutputStream fout=new FileOutputStream ("D:\\Student.txt");
		ObjectOutputStream oout =new ObjectOutputStream (fout);
        oout.writeObject(s);
		oout.close();
		fout.close();
		}

		public static Student[] deserializeStudent() throws Exception{
		FileInputStream fin=new FileInputStream("D:\\Student.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Student[] s= (Student[])oin.readObject();
		fin.close();
		oin.close();
		return s;
		}
		public static void main(String[] args) throws Exception {
		Student s1=new Student ("Arjun", "1", "643567859");
		Student s2=new Student ("Rohit", "2", "650895623");
		Student s3=new Student ("Sagar", "3", "865685169");
		Student[] s= {s1,s2,s3};
		serializeStudent (s);
		Student[] s5= deserializeStudent();
		for (int j = 0; j < s5.length; j++) {
		           if (Pattern.matches("[Aa] [A-Za-z]+", s5[j].getName())) {
                    	System.out.println("Name: "+s5[j].getName());
                    	System.out.println("Student ID: "+s5[j].getId()); 
		                System.out.println(" Student Contact no. " +s5[j].getContact());

		           }
		           }
		}
   }
