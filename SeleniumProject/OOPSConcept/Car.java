package OOPSConcept;

public class Car {

	int mod;
	int wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Car() is the object and a,b,c are object reference variable
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		//initialization of class variable using reference variable
		a.mod=2019;
		a.wheel = 4;
		
		//initialization of class variable using reference variable
		b.mod = 2015;
		b.wheel= 4;
		
		//initialization of class variable using reference variable
		c.mod = 2014;
		c.wheel = 4;
		
		System.out.println("before assigning");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		//shifting of object reference from one object to another object
		a=b;
		b=c;
		c=a;
		
		a.mod =10;
		System.out.println(a.mod);
		c.mod =20;
		System.out.println(a.mod);
		System.out.println();
		
		
			
		
	}

}
