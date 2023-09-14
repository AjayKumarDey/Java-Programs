import java.util.Scanner;

public class Conditional {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1st  number");
	int a=sc.nextInt();
	System.out.println("enter the 2nd number");
	int b=sc.nextInt();
	  if(a==b)
	  {
	  System.out.println("equal");
	  }
	  else if(a>b)
	  {
		 System.out.println("A is Greater"); 
	  }
	  else if(a<b)
	  {
		  System.out.println("b is greater");
	  }
}

}
