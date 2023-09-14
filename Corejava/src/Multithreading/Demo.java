package Multithreading;

public class Demo extends Thread{
public  void run()
{
	String name=Thread.currentThread().getName();
	for(int i=1;i<=3;i++)
	{
		System.out.println(name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
}
public static void main(String[] args) {
	Demo d=new Demo();
	Demo d1=new Demo();
	Demo d2=new Demo();
 d.setName("ajay");
 d1.setName("vivek");
 d2.setName("devu");
 d.start();
 d1.start();
 d1.suspend();
 d1.resume();
 d2.start();
 
 
}

}
