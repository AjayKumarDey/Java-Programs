import java.util.Scanner;

public class Key_Value {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String cities[]=new String[5];
	String std[]=new String[5];
	for (int i = 0; i <5; i++) {
		System.out.println("enter the cities and their std");
		cities[i]=sc.next();
		std[i]=sc.next();
	}
	System.out.println("enter the city name to be search");
	String key=sc.next();
	int flag=0;int i;
	for ( i = 0; i <10; i++) {
		
		if(key.equals(cities))
		{
			flag++;
			break;
		}
	}
	if(flag==1)
	{
		System.out.println("found");
		System.out.println("CITY "+cities[i]+" STD"+std[i]);
	}
	else
	{
		System.out.println("search unsuccesfull");
	}
	
}
}
