package Automation;

public class minnummaxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][]= {{1,2,4},{3,0,10},{5,2,3}};
		int min =abc[0][0];
		int mincolumn=0;
		
		for(int i =0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min = abc[i][j];
					mincolumn =j;
				}
			}
		}
		
		int k =0;
		int max =abc[0][mincolumn];
		
		while(k<3)
		{
			if(abc[k][mincolumn]>max)
			{
				max = abc[k][mincolumn];
			}
			k++;
		}
		
		System.out.println(max);
		
	}

}
