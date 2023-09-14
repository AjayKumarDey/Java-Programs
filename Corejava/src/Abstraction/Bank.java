package Abstraction;

 abstract public class Bank {
 public String name=" AJAY KUMAR DEY	";
 public String ifsc="BKID001";

  public void bankDetails()
  {
	  System.out.println("Bank of India = "+name+" IFSC CODE = "+ifsc);
  }
  
  abstract void withdraw();
  abstract void deposite();
  abstract void balancecheck();
}

