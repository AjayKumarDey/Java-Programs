
public class Main {
public static void main(String[] args) throws InterruptedException {


	Thread1 t1=new Thread1();
	AnnotherThread at=new AnnotherThread();
	Thread thread =new Thread(t1);
	thread.start();
	at.start();
	
//	MyThread2 t2=new MyThread2();
//	t2.start();
	
	
}
}
