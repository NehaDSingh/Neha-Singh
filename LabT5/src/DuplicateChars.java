
public class DuplicateChars {

	public static void main(String[] args) {
		
		 String str = "Your most valuable parenting skill is learning to manage yourself first. ";  
	        int Dcount;  
	        
	        char string[] = str.toCharArray();  //Converts given string into character array 
	          
	        System.out.println("Duplicate characters in a given string:- ");  
	       
	        //Counts each character present in the string  
	        for(int i = 0; i <string.length; i++) {  
	            Dcount = 1;  
	            for(int j = i+1; j <string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ') {  
	                    Dcount++;  
	                    
	                    string[j] = '0'; //Set string[j] to 0 to avoid printing visited character 
	                }  
	            }  
	            
	            if(Dcount > 1 && string[i] != '0')  //A character is considered as duplicate if count is greater than 1  
	                System.out.println(string[i]);  
	 
	        }
	        
	}
	
}
