package Thread;

public class Main {
public static void main(String[] args) {
	Thread1 t=new Thread1();
	Thread t2= new Thread(t);
	t2.start();
}
}
