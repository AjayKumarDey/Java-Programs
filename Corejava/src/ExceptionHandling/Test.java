package ExceptionHandling;

public abstract class Test {
	public static void main(String[] args) {
		System.out.println("main thread start ");
		int a=10,b=0,c;
		try {
		c=a/b;
	
		System.out.println(c);
		}catch(Exception e)
		{
			System.out.println(e );
		}
		
		finally
		{
			System.out.println("end ");
		}
	}
}
