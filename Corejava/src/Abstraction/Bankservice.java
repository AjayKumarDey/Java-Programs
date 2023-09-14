package Abstraction;

import java.util.Scanner;

public class Bankservice extends Bank{
double balance=5000;
int password;
public double money;	
public void withdraw() {
	// TODO Auto-generated method stub
	 System.out.println("Enter password");
	 Scanner sc=new Scanner(System.in);
	 int password=sc.nextInt();
	 if(password==123)
	 {
		 System.out.println("Enter withdraw  amount :");
		 money=sc.nextDouble();
		 
		 balance=balance-money;
		 System.out.println("withdraw money "+money);
		 System.out.println("Total balance "+balance);
	 }
	 else
	 {
		 System.out.println("inncorrect");
	 }
}

public void deposite() {
	// TODO Auto-generated method stub
	 System.out.println("Enter your password");
	 Scanner sc=new Scanner(System.in);
	 int password=sc.nextInt();
	 if(password==123)
	 {
		 money=sc.nextDouble();
		 balance=balance+money;
		 System.out.println("enter the deposite money");
		balance=balance+money;
		System.out.println("Deposited Money "+money);
		System.out.println("Total Balance "+balance);
	 }
	 else
	 {
		 System.out.println("incorrect password try again");
	 }
}

 public  void balancecheck() {
	// TODO Auto-generated method stub
	 System.out.println("Enter your password");
	 Scanner sc=new Scanner(System.in);
	int  password=sc.nextInt();
	if(password==123)
	{
		System.out.println("total balance is "+balance);
	
	}
	else
	{
		System.out.println("incorrect password");
	}
}


}
