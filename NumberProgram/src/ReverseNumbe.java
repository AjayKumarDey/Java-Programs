import java.util.Scanner;

public class ReverseNumbe {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int rev=0,dig;
	while(n>0)
	{
		dig=n%10;
		n=n/10;
		rev=rev*10+dig;
	}
	System.out.println(rev);
	
}
}
