package hust.soict.hedspi.garbage;
import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;

public class GarbageCreator {
	public static void main(String[] args) {
		ReadfileUseString("C:\\Users\\dell\\Desktop\\Englishhomework.txt");
	}
	public static void ReadfileUseString(String filestr) {
		File file = new File(filestr);

	    try {
	        FileReader frp = new FileReader(file);
	        BufferedReader brp = new BufferedReader(frp);
	        String line;
	        String tmp ="";
	        

	        while ((line = brp.readLine()) != null) {
	        	
	        	tmp+=line;
	        }
	        System.out.println("done");

	        brp.close();

	    } catch (FileNotFoundException e) {
	        System.out.println("File not found: " + file);
	    } catch (IOException e) {
	        System.out.println("Unable to read file: " + file);
	    }
	}
}


