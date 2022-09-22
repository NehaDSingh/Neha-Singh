import java.util.Arrays;

public class Alternate {

	public static void main(String[] args)  // to add values of arrays
	{
		int[] firstArray = {23,45,12,78,4,90,1};        //source array  
		int[] secondArray = {77,11,45,88,32,56,3};
		int a = firstArray.length;        //determines length of firstArray  
		int b = secondArray.length; 
		int[] res=new int [a+b];
		System.arraycopy(firstArray, 0, res, 0, a);  
		System.arraycopy(secondArray, 0, res, a, b); 
		System.out.println(Arrays.toString(res));  
	}
	
		

	
		
		
	
         
	}


