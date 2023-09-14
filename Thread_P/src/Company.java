
public class Company {
	int n;
 synchronized public void Produce_item(int n)
{
	this.n=n;
	System.out.println("produce :"+this.n);
}
 synchronized public int consume_item()
{
	System.out.println("consume :"+this.n);
	return this.n;
	
}
}
