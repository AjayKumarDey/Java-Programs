import java.util.Scanner;

// sum of digit%orginal==0
public class NivenNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int dig,a,sum=0;
	a=n;
	
	while(n>0)
	{
		dig=n%10;
		n=n/10;
		sum=sum+dig;
	}
	if(a%sum==0)
	{
		System.out.println("niven number");
	}
	else
	{
		System.out.println("not niven number");
	}
}

}
