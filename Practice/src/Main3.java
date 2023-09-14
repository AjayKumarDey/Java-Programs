
public class Main3 {

void Result()
{
	System.out.println("thanks again visit");
}
void Result(int n)
{
	System.out.println("My mobile number is "+n);
}
void Result(String name)
{
	Result();
    Result(237086);
	System.out.println("my name is "+name);
}
public static void main(String[] args) {
	Main3 t=new Main3();
	
	t.Result("ajay kumar dey");
	
	
}
}