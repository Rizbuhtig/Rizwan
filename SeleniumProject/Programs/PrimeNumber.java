package Programs;

public class PrimeNumber {
	
	public static  boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		
		return true;
		
	}
	
	public static void getPrimeNumber(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isPrimeNumber(i))
				System.out.println(i +"");
		}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prime number - number which is divided by itself and 1
		//eg : 13,17
		//2 is lowest prime number
		
		getPrimeNumber(100);
	}

}
