package Controllstatement;

import java.util.Scanner;

// 400%0 || 4%0 && 100!0
public class LeapYear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	int year =sc.nextInt();
	if((year%400==0)||(year%4==0 && year%100!=0))
			{
		System.out.println("leap year ");
			}
	else
	{
		System.out.println("not leap year ");
	}
}
}
