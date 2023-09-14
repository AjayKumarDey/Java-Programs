package Inheritence;

public class Car extends Vehicle {
	void run()
	{
		System.out.println("lets go for a long drive");
	}
public static void main(String[] args) {
	Car c=new Car();
	c.start();
	c.run();
	
}
}
