package com.object;
//by using method
public class Dog {
String name;
int age;

public void active(String n,int a)
{
	name=n;
	age=a;
}
public void display()
{
	System.out.println(name+" "+age);
}
public static void main(String[] args) {
	Dog dog=new Dog();
	dog.active("bholu", 10);
	dog.display();
	
}
}
