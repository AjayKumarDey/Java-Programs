package Operators;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	int a;
	int b;
	int c;
	int choice;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the two number");
	a=sc.nextInt();
	b=sc.nextInt();
	
System.out.println("enter your choice");
System.out.println("1. addition");
System.out.println("2. substraction");
System.out.println("3. multification");
System.out.println("4. division");
System.out.println("5. reminder");
    choice=sc.nextInt();
	switch (choice) {
	case 1:c=a+b;
		System.out.println("Addition "+c);
		break;

     case 2:c=a-b;
		System.out.println("Substraction "+c);
		break;
     case 3:c=a*b;
	System.out.println("multification "+c);
	break;
     case 4: c=a/b;
     System.out.println("division");
     break;
   
    	    
       case 5:c=a%b;
       System.out.println("reminder");
       break;
       default :
    System.out.println("invalid");
 
	}
	
	
}
}
