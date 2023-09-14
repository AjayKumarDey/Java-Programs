package Multithreading;

public class Thread1 extends Thread {

	
public void show()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println("Ajay");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) throws InterruptedException  {
		Thread1 t1=new Thread1();
		t1.show();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Kumar Dey");
			Thread.sleep(1000);
		}
	}
}
