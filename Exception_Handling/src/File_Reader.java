import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Reader {
public static void main(String[] args) {
	File fr=new File("D:\\Dms.txt");
	try {
		Scanner sc=new Scanner(fr);
	    while(sc.hasNextLine())
	    {
	    	String line =sc.nextLine();
	    	System.out.println(line);
	    }
	    sc.close();
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	}
}
}
