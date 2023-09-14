package Superthis;

public class Test extends Demo{

	void show()
	{
		super.show();
		System.out.println("hello java");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.show();
	}
}
