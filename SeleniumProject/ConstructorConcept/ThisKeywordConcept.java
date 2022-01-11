package ConstructorConcept;

public class ThisKeywordConcept {
	
	//class variables 
	String name;
	int age;
	
	public ThisKeywordConcept(String name, int age)
	{
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordConcept obj = new ThisKeywordConcept("Tom",30);
	}

}
