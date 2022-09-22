
public class CalculatorMain {

	public static void main(String... args) {
	
		Calculator cal=new Calculator();
		System.out.println("Addition of one integer and one double :"+cal.addition(3, 7.0));
		System.out.println("Subtraction of one integer and one double :"+cal.subtraction(5, 8.0));
		System.out.println("Multiplication of one integer and one double :"+cal.multiplication(8, 2.0));
		System.out.println("Division of one integer and one double :"+cal.division(2, 6.0));
	
	}
}
