
public class Own_Thread extends Thread {
	public void run()
	{
		System.out.println("this is user defined thread");
	}
public static void main(String[] args)
{
	System.out.println("program started");
	int n=20+25;
	System.out.println("sum is "+n);
	
	Thread t=Thread.currentThread();
	System.out.println(t.getName());
	   t.setName("ajay ");
	   System.out.println(t.getName());
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	   System.out.println(t.getId());
	   
	System.out.println("program ended");
	Own_Thread o=new Own_Thread();
	o.start();
}
}
