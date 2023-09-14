import java.util.Scanner;

public class Fact {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int fact=1;
	int n=sc.nextInt();
	for (int i=1;i<=n;i++)
	{
	 fact=fact*i;
	}
	System.out.println(n+" of fact is "+fact);
}
}
