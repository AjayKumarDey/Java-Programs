package Method;

public class Animal {
String color;
int age;
public void his(String a,int b)
{
	color=a;
	int age=b;
	System.out.println(color+" "+age);
}
public static void main(String[] args) {
	Animal cat=new Animal();
	cat.his("black", 2);
}
}
