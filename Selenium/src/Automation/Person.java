package Automation;

public class Person {
	
	private String name;

	
	public String getName(){
		// TODO Auto-generated method stub
		return name;
	}

	public  void setName(String N) {
		// TODO Auto-generated method stub
		this.name=N;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Person obj = new Person();
		obj.setName("John");
		System.out.println(obj.getName());
	}


}
