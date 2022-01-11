package OOPSConcept;



public class WrapperConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		String x = "100";
		System.out.println("Before data conversion");
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println("After data conversion");
		System.out.println(i+20 );
		
		String d = "100.55";
		System.out.println("Before conversion");
		System.out.println(d+20);
		
		double m = Double.parseDouble(d);
		System.out.println("After conversion");
		System.out.println(m+20.55);
		
		int k =200;
		System.out.println(k+50);
		
		//To convert integer to string we use valueOf
		String l = String.valueOf(k);
		System.out.println(l+30);
		
				
		
	}

}
