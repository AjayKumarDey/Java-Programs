package Multithreading;

public class Test implements Runnable{
public void run()
{
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
		try {
		Thread.sleep(1000);
		
	        }catch (InterruptedException e)
		{
	        	
		}
	}
	
	
}
public static void main(String[] args) throws InterruptedException {
	Test t=new Test();
    Thread t1=new Thread(t);
    t1.start();
    t1.suspend();
    t1.resume();
    for(char ch='A';ch<='J';ch++)
    {
    	System.out.println(ch);
    	Thread.sleep(1000);
    }
}
}
