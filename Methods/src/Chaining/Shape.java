package Chaining;

public class Shape {

	public void volume(int a,int b,int c)
	{
		System.out.println("enter the method");
		 double result=a*b*c;
		 System.out.println(result);
		 
	}
	
	
	public static void main(String[] args) {
		Shape c=new Shape();
		c.volume(12,42,45);
		
	}
}
