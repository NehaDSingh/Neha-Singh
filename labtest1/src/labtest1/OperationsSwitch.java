package labtest1;

public class OperationsSwitch {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 5;
		char ch='*';
		switch(ch)
		{
			case '+':
				num1+=num2;
				break;
			case '-':
				num1-=num2;
				break;
			case '*':
				num1*=num2;
				break;
			case '/':
				num1/=num2;
				break;
			case '%':
				num1%=num2;
				break;
			default :
				System.out.println("invalid operation");
				break;
		}
		System.out.println("The Output Is:"+num1);
	   }
	}

