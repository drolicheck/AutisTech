
public class Account {
	private int accountNumber;
	private double balance;
	private Customer customer;
	
	public Account (int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void setCustomer (Customer customer){
		this.customer = customer;
		customer.setAccount(this);
	}
	
	public int getAccntNum()
	{
		return accountNumber;
	}
	
	public void printAccountInfo() {
		
		System.out.println("Name: " + customer.getName() 
				+ ", Account Number: " 
				+ accountNumber + ", Current Balance: " + balance );
		// Display name, account number, 
                 // and current balance.
		//Testing Git in Eclipse
	}
}
