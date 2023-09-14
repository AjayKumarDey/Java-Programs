package Variables;

public class Test {

	int a=10;
	static int b=20;
	static int  d=b;
	public static void main(String[] args) {
		int c=30;  //no need to create object
		System.out.println(c);
		System.out.println(b); // direct access 
		System.out.println(d);
		Test t=new Test();
		System.out.println(t.a);
	}
}
