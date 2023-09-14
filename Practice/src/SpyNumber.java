import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
		  int n=sc.nextInt();//1124
		  int sum=0,prod=1,dig,sp = 0;
		  int a=n;
		  while(n>0||n!=0)
		  {
			  dig=n%10;
			  sum=sum+dig;
			  prod=prod*dig;
			  n=n/10;
			  sp=sum+prod;
		  }
		  if(sum==prod)
		  {
			  System.out.println("spy number");
		  }
		  else
		  {
			  System.out.println("not spy number");
		  }
		  
		  
		}
}
