package Abstraction;

import java.util.Scanner;

public class Customer {
public static void main(String[] args) {
	Bankservice b=new Bankservice();
	b.bankDetails();
	int choice;
	System.out.println("Enter your choice ");
	System.out.println("1.withdraw");
	System.out.println("2.deposite");
	System.out.println("3.balance check");
	Scanner sc=new Scanner(System.in);
	 choice =sc.nextInt();
	 switch (choice) {
	case 1:b.withdraw();
		
		break;
	case 2:b.deposite();
	   break;
	case 3:b.balancecheck();
	break;
	default:
	{
		System.out.println("thank you again visit");
		break;
	}
	}
	
}
}
