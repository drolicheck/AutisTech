public class Customer {
	private String name;
	private int ssn;
	private Account account;
	
	public Customer (String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public void setAccount (Account account) {
		this.account = account;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void printCustomerInfo()
	{
		System.out.println("Name: " + this.name);
		System.out.println("SSN: " + this.ssn);
		System.out.println("Account Number: " + account.getAccntNum());
	}
	
}