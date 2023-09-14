
public class Arithmatic {
public static void main(String[] args) {
	try
	{
		int a=10;
		int b=3;
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		//System.out.println(e);
		e.printStackTrace();
		//System.out.println(e.getMessage());
		//System.out.println(e.toString());
	}
	
	finally
	{
		System.out.println("i am in finally block");
	}
}
}
