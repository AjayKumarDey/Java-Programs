package MYCODE;

import java.util.Scanner;

public class Sum_Of_Natural {
public static void main(String[] args) {
	int n,sum=0;
	System.out.println("Enter the number");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   for (int i = 1; i <=n; i++)
   {
	sum=sum+i;
   }
   System.out.println(" Sum of  all "+ sum);
}
}
