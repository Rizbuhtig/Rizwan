package Automation;

public class staticandnonstatic {
	
	String name;//Instance Variable
	String address;//Instance Variable
	static String city; //Class variables
	
	

	staticandnonstatic(String name,String address)
	{
		this.name = name;
		this.address =address;
		
	}
	
	public void getData()
	{
		System.out.println(address + " " + city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticandnonstatic sd = new staticandnonstatic("Nishanth","BenStreet");
		sd.getData();
	}

}
