package Encapsulation;

public class Test {
private  int value;

public int getValue()
{
	return value;
}

public void setValue(int value) {
	if(value>100 && value<=200)
	{
		
	}
	else
	{
		System.out.println("out of range");
	}
	this.value = value;
	
}

}
