package OOPSConcept;

public class CallByValueCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValueCallByReference obj = new CallByValueCallByReference();
		
		obj.sum(20,10);
		
		obj.p =50;
		obj.q = 60;
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		System.out.println("After swap");
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		
	}
	
	//call by value
	public int sum (int a, int b)
	{
		a =10;
		b=50;
		int c = a+b;
		System.out.println(c);
		
		return c;
	}
	
	
	public void swap(CallByValueCallByReference t) 
	{
		int temp;
		temp = t.p;
		t.p=t.q;
		t.q=temp;
		
	}

}
