
public class Lamba_Expression {
	public static void main(String[] args) {
Runnable r=()->{
	for (int i = 0; i < 10; i++) 
	{
	
	
	System.out.println("this is lamda");
	try {
		Thread.sleep(1000);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
};
Thread h1= new Thread(r);
h1.start();
	}
}
