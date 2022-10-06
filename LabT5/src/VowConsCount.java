
public class VowConsCount {
	public static void main(String[] args) {    
        
		   
        String str = "Your most valuable parenting skill is learning to manage yourself first."; //Declare a string  
	   
        int vowels = 0, consonants  = 0;   // variable to store the count of vowels and consonant
            
        str = str.toLowerCase();  //Converting string to lower case to reduce the comparisons       
            
        for(int i = 0; i < str.length(); i++) { 
        	
        	char ch=str.charAt(i); //converting Str.charAt to character ch.
              
        	// check if character is any of a, e, i, o, u
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {   
                 
            	vowels++; //Increments the vowel counter 
            }    
            
            //Checks whether a character is a consonant between a to z   
            else if(ch >= 'a' && ch<='z') {      
                   
            	consonants++;    //Increments the consonant counter 
            }    
        }    
        System.out.println("Number of vowels: " +vowels);    
        System.out.println("Number of consonants: " +consonants);    
    }    
}   