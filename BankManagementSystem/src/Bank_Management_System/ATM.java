package Bank_Management_System;

import java.util.Scanner;

public class ATM {
	
	int PIN=1234;
   float Balance;
	
 public void checkPIN()
 {
	 System.out.println("Enter Your Pin");
	 Scanner sc=new Scanner(System.in);
	 int interPIN =sc.nextInt();
	 if(interPIN==PIN)
	 {
		 menu();
	 }
	 else
	 {
		 System.out.println("Invalid Pin try Again");
	 }
	 
 }
 public void menu()
 {
	 System.out.println("1. A/C Balance Check");
	 System.out.println("2. Withdraw Money");
	 System.out.println("3. Deposit Money");
	 System.out.println("4. EXIT");
	 Scanner sc=new Scanner(System.in);
	 int opt=sc.nextInt();
	 if(opt==1)
	 {
		 checkBalance();
	 }
	 else if(opt==2)
	 {
		 withdraw_Money();
	 }
	 else if(opt==3)
	 {
		 deposite_money();
	 }
	 else if(opt==4)
	 {
		 System.out.println("Thank You Again Visit");
	 }
	 else
	 {
		System.out.println("Enter a valid pin");
	 }
	 
 }
 public void checkBalance()
 {
	 System.out.println("Balance :"+Balance);
	 menu();
 }
 public void withdraw_Money()
 {
	 System.out.println("Enter Amount to withdraw");
	 Scanner sc=new Scanner(System.in);
	 float amount=sc.nextFloat();
	 if(amount>Balance)
	 {
	System.out.println("insufficient Blance ");
	 }
	 else
	 {
		 Balance=amount-Balance;
		 System.out.println("Money Withdraw Successful");
	 }
	 menu();
 }
 public void deposite_money()
 {
	 System.out.println("Enter your Amount");
	 Scanner sc=new Scanner(System.in);
	 float amount=sc.nextFloat();
	 Balance=Balance+amount;
	 System.out.println("Money Deposite Successful");
  menu();
 }
 public void EXIT()
 {
	 System.out.println("thank You Again Visit");
 }
 
}
