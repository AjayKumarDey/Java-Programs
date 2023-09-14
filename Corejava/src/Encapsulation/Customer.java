package Encapsulation;

import java.util.Scanner; 

public class Customer {
public static void main(String[] args) {
	
	Bank bank=new Bank();
	//System.out.println(bank.Balance);
	int choice;
	System.out.println("WELCOME TO BANK OF INDIA");
	System.out.println("Enter your choice ");
	
	System.out.println("1.Deposite");
	System.out.println("2.withdraw");
	System.out.println("3.check balance");
	
		Scanner sc2=new Scanner(System.in);
		choice=sc2.nextInt();
		 switch(choice)
		 {
		 case 1:bank.deposite(3000);
		 break;
		 case 2:bank.Withdraw(2000);
		 break;
		 case 3:bank.checkBal();
		 break;
          default:
          {
        System.out.println("visit again");
          }
		 }
		 bank.deposite(choice);
		 bank.Withdraw(choice);
		 bank.checkBal();
}
}
