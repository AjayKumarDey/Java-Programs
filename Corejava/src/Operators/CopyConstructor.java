package Operators;

public class CopyConstructor {
int a; String b;
CopyConstructor()
{
	a=10;
	b="ajay";
	System.out.println(a+" "+b);
}
CopyConstructor(CopyConstructor r)
{
	a=r.a;
	b=r.b;
	System.out.println(a+" "+b);
}
public static void main(String[] args) {
	CopyConstructor c=new CopyConstructor();
	CopyConstructor c1= new CopyConstructor(c);
}
}
