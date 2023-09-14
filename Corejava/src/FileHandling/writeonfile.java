package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writeonfile {
public static void main(String[] args) throws IOException 	{
	
	FileWriter f=new FileWriter("C:\\Users\\Ajay\\Desktop\\File\\write.txt");
	f.write("Hi I am a Java Developer");
	f.close();
	System.out.println("written successfully");
	}
	
	
	

}
