package Interface;

public interface Vehicle { 
	
	String name="FZS"; //public + static + final
	int speed=109;
   void start();
   void stop();   // public + abstact

default void color()
{
System.out.println("color is red");	
}
static void price()
{
	System.out.println("139,099");
}
}
