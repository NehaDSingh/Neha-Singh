import java.io.File;

public class FileList {
	
     /*public static void main(String a[]){
        File dr = new File("c:/chiens"); // Specified the path
        File[] s = dr.listFiles();  //
        for(int i=0;i<s.length;i++) //for loop to print the length of file
        {
        	if(s[i].isFile()) //check file 
        		System.out.println("File: "+s[i].getName());//sop to read file
        		else if(s[i].isDirectory()) //directory
            		System.out.println("Directory: "+s[i].getName());//sop to read Directory
        }
     }}*/
	

		public static void main(String[] args) {
			File file=new File("c:/chiens");
			String[] s=file.list();
			System.out.println("File names present in the folder");
			for (String string : s) {
				System.out.println(string);
			}
			System.out.println("\nPermission check:");
			File[] f =file.listFiles();
			for (File file2 : f) {
				
				System.out.println(file2);
				System.out.println("File Name : "+file2.getName());
				System.out.println("File Length : "+file2.length());
				System.out.println("File Hidden : "+file2.isHidden());
				System.out.println("Writable : "+file2.canWrite());
				System.out.println("Readable : "+file2.canRead());
				System.out.println("Executable : "+file2.canExecute()+"\n");
			}
		}

	}
