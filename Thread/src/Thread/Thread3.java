package Thread;

public class Thread3  extends Thread{

	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(i+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}
	public void run1()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i+" ");
		}
	}
}
