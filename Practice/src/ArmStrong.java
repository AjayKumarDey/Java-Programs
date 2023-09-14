import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0,rem, r=n;
		while(n>0)
		{
			rem=n%10;
			sum=(rem*rem*rem)+sum;
			n=n/10;
		}
		if(r==sum)
		{
			System.out.println("arm strong number");
		}else
		{
			System.out.println("not arm strong number");
		}
		
			}
}
