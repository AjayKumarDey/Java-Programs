package FileHandling;



import java.io.*;

public class readonfile {
public static void main(String[] args)  {
try {
	FileReader r=new FileReader("C:\\Users\\Ajay\\Desktop\\MY RESUME\\Myresume.pdf");
	try {
	int ch;
	
	while((ch=r.read())!=-1);
	  {
	System.out.println(ch);
	  }
	    }

	finally
	{
		r.close();
		System.out.println("closed");
	}
}
	catch(Exception e)
	{
		System.out.println("handled...."); 
	
	}
}
}
