package OOPSConcept;

public class LocalAndGlobalVariable {

	int emp_id = 14895;
	String emp_name ="Stuart";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int emp_id = 7589;
		System.out.println(emp_id);
		
		LocalAndGlobalVariable obj = new LocalAndGlobalVariable();
		
		System.out.println(obj.emp_id);
		System.out.println(obj.emp_name);
		
		
	}

}
