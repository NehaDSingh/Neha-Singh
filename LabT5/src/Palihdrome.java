import java.util.Scanner; // Scanner class is a part of java.util package, so we required to import this package in our Java program.

public class Palihdrome {
	
	   public static void main(String args[])
	   {
	      String str, rev = ""; //objects
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");// println() function is used to print on the screen.
	      
	      str = sc.nextLine();// function nextLine() is used to obtain the input
	 
	      int length = str.length(); //integer length is equal to str.length().
	 
	      for ( int i = length - 1; i >= 0; i-- ) 
	         rev = rev + str.charAt(i); 
	 
	      if (str.equals(rev)) // compare original string available in str with this reversed String
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }
	}