package session;

import java.util.Scanner;

public class Avg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the marks :");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	int sum=a+b+c+d+e;
	System.out.println("total sum is :"+sum);
	   double avg=sum/5.0;
	   System.out.println("average is :"+avg);
	
	
}
}
