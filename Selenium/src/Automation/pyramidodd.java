package Automation;

public class pyramidodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k =3;
		for(int i =1;i<5;i++)
		{
			for(int j =1;j<5-i;j++)
			{
				System.out.print(k);
			
				k =k+3;
			}
			System.out.println("");
		}
	}

}
