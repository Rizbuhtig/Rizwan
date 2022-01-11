package Abstraction;

public abstract class Bank {
	
	//abstract method & abstract class object cannot be created
	//No body
	//No body declaration
	//Partial abstraction
	//Abstract class can have abst and non abst methods
	public abstract void loan();
	
	public void debit()
	{
		System.out.println("Bank---- Debit");
	}
	
	public void credit()
	{
		System.out.println("Bank-----Credit");
	}
	
	//Bank HDFCBank and TestBank
}
