
public class Main_Company {
public static void main(String[] args) {
	Company comp=new Company();
	Producer p=new Producer(comp);
	Consumer c=new Consumer(comp);
	p.start();
	c.start();
	
}
}
