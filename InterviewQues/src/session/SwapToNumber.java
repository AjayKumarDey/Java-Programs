package session;

import java.util.Scanner;

public class SwapToNumber {
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	System.out.println("Enter the name");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		int a=0,b=1,c;
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=b-a;
		
	}
}
}
