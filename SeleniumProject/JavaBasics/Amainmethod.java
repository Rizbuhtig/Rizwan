package JavaBasics;


public class Amainmethod {
	
	//Can main method be called from different classes?
	//Yes they can be called as it is static 
	
	
	public static void main(String[] args) {
		System.out.println("A main method");
		Bmainmethod.main(args);
	}
}
