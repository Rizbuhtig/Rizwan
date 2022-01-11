package Automation;

public class removeDuplicate {
	
	public static int removeDuplicate(int a[], int n)
	{
		if(n==0 | n==1)
		{
			return n;
		}
		
		int j =0;
		
		for(int i = 0;i<n-1;i++) {
			if(a[i]!=a[i+1])
				a[j++] = a[i];
		}
	

		a[j++] = a[n-1];
		return j;
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,2,2,3,3,6,8,8};
		int n = a.length;
		
		int j =0;
		
		j= removeDuplicate(a,n);
		
		for(int i =0;i<j;i++)
		{
			System.out.println(a[i] + "");
		}
		
	}

}
