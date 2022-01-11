package dataExcel;

import java.io.IOException;
import java.util.ArrayList;

public class testData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dataDriven d = new dataDriven();
		ArrayList<String> al =d.getData("hanan");	
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		
	}

}
