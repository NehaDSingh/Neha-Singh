import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args){
	File file=new File("D:\\Myfile.txt");
	try {
		RandomAccessFile rFile=new RandomAccessFile(file,"r");
		rFile.seek(file.length()-10);
		
		for (int i = 0; i < 10; i++) {
			System.out.print((char)rFile.read());
		}
		rFile.close();
		
	} catch (Exception e) {
			e.printStackTrace();
	}
	
	}
}