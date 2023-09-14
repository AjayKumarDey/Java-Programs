package Polymorphism;

public class Square extends Shape{
@Override
	void show()
	{
	super.show();
		System.out.println("square type");
	}
	public static void main(String[] args) {
		Square s=new Square();
		s.show();
	}
}
