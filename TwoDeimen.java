
public class TwoDeimen {

	public static void main(String[] args) {
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
		    
		 System.out.println("Multiplication of two matrices is: ");
		int d[][]=new int[3][3];  //3 rows and 3 columns  
		     
		for(int i=0;i<a.length;i++)
		{	
		     for(int j=0;j<a.length;j++)
		     {    
		    	 d[i][j]=a[i][j]*b[i][j];    
		    	 System.out.print(d[i][j]+" ");    
		    	 }    
		     System.out.println();    
		     }
		
		}
    }
