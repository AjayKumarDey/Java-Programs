package Polymorphism;

public class Main {

	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x,int y)
	{
		
		int c=x+y;
		System.out.println(c);
	}
	void add(int x,double y)
	{
		
		double c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Main m=new Main();
		m.add();
		m.add(100,200);
		m.add(21,90.4);
	}
}
