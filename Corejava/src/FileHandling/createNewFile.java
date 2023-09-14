package FileHandling;

import java.io.File;

public class createNewFile {
	public static void main(String[] args) /* throws Exception */{
	File f=new File("C:\\Users\\Ajay\\Desktop\\File\\my.pdf");
	try
	{
	if(f.createNewFile())
	{
		System.out.println("file sucsessfully created");
	}
	else
	{
		System.out.println("file already exits.....");
	}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
