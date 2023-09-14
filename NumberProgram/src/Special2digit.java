import java.util.Scanner;

//59=5*9= 45. 5+9=14.   59
public class Special2digit {
public static void main(String[] args) {
	int sum=0,prod=1,dig,a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	a=n;
	
	while(n>0)
	{
		dig=n%10;
		n=n/10;
		
		sum=sum+dig;
		prod=prod*dig;
	}
	if((sum+prod)==a)
	{
		System.out.println("speical 2 digit");
	}
	
	else
	{
		System.out.println("not speical 2 digit");
	}
	
}
}
