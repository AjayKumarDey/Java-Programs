package Variable;

public class Abc {
int a=10;
static int b=20;
public static void main(String[] args) {
	Abc a1=new Abc();
	System.out.println(a1.a);
	System.out.println(a1.b);
	a1.a=100;
	a1.b=200;
	System.out.println(a1.a+" "+a1.b);
	
	Abc a2=new Abc();
	System.out.println(a2.a+" "+a2.b);
}
}
