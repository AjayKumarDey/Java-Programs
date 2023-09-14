package Encapsulation;

import java.util.Scanner;

public class Bank {
 private double Balance=2000;
 private int passowrd;
 
 public void deposite(double money)
 {
	 System.out.println("Enter your password");
	 Scanner sc=new Scanner(System.in);
	 int password=sc.nextInt();
	 if(password==123)
	 {
		Balance=Balance+money;
		System.out.println("Deposited Money "+money);
		System.out.println("Total Balance "+Balance);
	 }
	 else
	 {
		 System.out.println("incorrect password try again");
	 }
	 
 }
 public void Withdraw(double money)
 {
	 System.out.println("Enter password");
	 Scanner sc=new Scanner(System.in);
	 int password=sc.nextInt();
	 if(password==123)
	 {
		 Balance=Balance-money;
		 System.out.println("withdraw money "+money);
		 System.out.println("Total balance "+Balance);
	 }
	 else
	 {
		 System.out.println("incorrect password");
	 }
 }
 public  void checkBal()
 {
	 System.out.println("Enter your password");
	 Scanner sc=new Scanner(System.in);
	int  password=sc.nextInt();
	if(password==123)
	{
		System.out.println("total balance is "+Balance);
	
	}
	else
	{
		System.out.println("incorrect password");
	}
 }
}
