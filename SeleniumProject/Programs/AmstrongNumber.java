package Programs;

public class AmstrongNumber {
	
	public static void isAmstrong(int num)
	{
		int cube =0;
		int t;
		int r;
		t=num;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			cube = cube +(r*r*r);
		}
			
			if(t == cube)
			{
				System.out.println("is Amstrong");
			}else
			{
				System.out.println("is not Amstrong");
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			isAmstrong(222);
	}

}
