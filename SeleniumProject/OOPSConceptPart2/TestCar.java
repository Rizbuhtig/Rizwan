package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//complie time polymorphism
		BMW obj = new BMW();
		obj.start();
		obj.stop();
		obj.theftsafety();
		obj.refuel();
		
		System.out.println("************");
		
		//child class object can be referred by parent class reference varibale --- Run time polymorphism
		//Top Casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting and it gives Runtime Error - ClassCastException
		//Child class is trying to inherit the properties of parent by using child class
		//BMW b1 = (BMW)new Car();
		
	}

}
