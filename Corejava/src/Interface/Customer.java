package Interface;

public class Customer implements Vehicle {

	@Override
	public void start() {
		System.out.println("start(): insert key and press self button"+name+" "+speed);
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop() : exit key ");
		
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.start();
		c.stop();
		System.out.println(name);
		System.out.println(speed); //static
		 c.color();    // default
		 Vehicle.price();  //static
	}

}
