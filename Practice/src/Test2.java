import java.util.Scanner;

public class Test2 {
public static void main(String []arg) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
//	System.out.println(a++);
//	System.out.println(a);
//	a=15;
//	System.out.println(a);
//	p=(a+b)/c;
//	System.out.println(p);
	
	if(a%7==0 ||a%10==7)
	{
		System.out.println("its buzz number");
	}else
	{
		System.out.println("its not buzz");
	}
}
}
