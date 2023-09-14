package com.object;

public class Bike {

	String name;
	int price;
	public Bike(String name,int price)
	{
		this.price=price;
		this.name=name;
		System.out.println(" agrument");
		
	}
	public static void main(String[] args) {
		Bike b=new Bike("Fzs",14000);
		System.out.println(b.name+" "+b.price);
		
	}
}
