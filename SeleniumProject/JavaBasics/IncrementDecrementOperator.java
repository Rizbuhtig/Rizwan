package JavaBasics;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i =1;
		int j=i++;// post increment
		
		// i is set to 2 after increment as it is post increment
		
		System.out.println(i);
		// First value i is assigned to 1 and given to j and increment i
		System.out.println(j);
		// same way o/p will be 2 and 1
		System.out.println("***********");
		
		int a=1;
		// increase value of a by 1 so a=2 and assign it to b so b =2
		int b = ++a;// pre -increment
		//o/p a=2 b =2
		System.out.println(a);
		System.out.println(b);
		
		
		int p =2;
		int k= p--;// post decrement
		// p is decrement first so p=1 and before decrement assign to k
		System.out.println(p);
		System.out.println(k);
		
		int l = 2;
		int n = --l;
		// n is 1 and l is 1 l is decrement to 1 and then n operation is performed and assign to n
		System.out.println(l);
		System.out.println(n);
			
	}

}
