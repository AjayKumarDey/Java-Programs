import java.io.File;

public class delete_file {
public static void main(String[] args) {
	File fd=new File("D:\\Xender.Demo.txt");
	if(fd.delete())
	{
		System.out.println("i have deleted "+fd.getName());
	}
	else
	{
		System.out.println("some problem");
	}
}
}
