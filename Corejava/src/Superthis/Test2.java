package Superthis;

public class Test2 {
	int a;

	Test2(int a)
	{
		
		this.a=a;
	
	}
	public static void main(String[] args) {
		Test2 t2=new Test2(100);
		t2.show();
	}
	void show()
	{
		System.out.println(a);
	}
}

