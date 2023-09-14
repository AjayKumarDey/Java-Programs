
public class Thread1 implements Runnable{
	@Override
public void run()
{
	
	for (int i = 1; i <=20; i++) 
	{
		System.out.println(i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	public void run1()
	{
		for (int i =20; i>=1; i--)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
