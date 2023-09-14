import java.util.Scanner;

public class Special2Digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0,prod=1,a,sp=0,dig;
	a=n;
	while(n>0)
	{
		dig=n%10;
		sum=sum+dig;
		prod=prod*dig;
		n=n/10;
		
		sp=sum+prod;
	}
	if(a==sp)
	{
		System.out.println("special 2 digit");
	}
	else
	{
		System.out.println("not ");
	}
}
}
