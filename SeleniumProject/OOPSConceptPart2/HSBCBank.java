package OOPSConceptPart2;

public class HSBCBank implements USBank, BrazilBank {//multiple inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(USBank.min_bal);
		
		HSBCBank b1 = new HSBCBank();
		b1.credit();
		b1.debit();
		b1.statement();
		b1.cheque();
		
	}
	
	public void credit()
	{
		System.out.println("hsbc- credit");
	}
	
	public void debit()
	{
		System.out.println("hsbc - debit");
	}
	
	public void statement()
	{
		System.out.println("hsbc- statement");
	}
	
	public void slip()
	{
		System.out.println("hsbc - minislip");
	}
	
	public void cheque()
	{
		System.out.println("hsbc - cheque");
	}

}
