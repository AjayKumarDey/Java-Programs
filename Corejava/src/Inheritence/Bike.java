package Inheritence;

public class Bike extends Vehicle {
	
	void run()
	{
		System.out.println("lets go for a little ride");
	}
public static void main(String[] args) {
	Bike b=new Bike();
	b.start();
	b.run();
}
}
