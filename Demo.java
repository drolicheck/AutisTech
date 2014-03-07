public class Demo 
{	
	public static void main(String[] args)  
	{
	    Account citi = new Account(1234, 100.50);
	    Customer alice = new Customer("Alice", 7777);
	    
	    citi.setCustomer(alice);
	    
	    alice.printCustomerInfo();//name ssn, accnt num
		System.out.print("Test"); // Sup
	 }
}