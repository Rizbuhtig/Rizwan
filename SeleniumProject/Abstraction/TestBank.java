package Abstraction;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank b = new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
		b.interest();
		
		//Runtime polymorphism
		Bank h = new HDFCBank();
		h.debit();
		
	
		
		

	}

}
