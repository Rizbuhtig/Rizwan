package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String c[][]= new String[2][4];
		
		System.out.println(c.length);// total no of rows will be returned
		
		System.out.println(c[0].length); //total no of columns will be returned
		
		c[0][0] = "A";
		c[0][1] = "B";
		c[0][2] = "C";
		c[0][3] = "D";
		
		
		c[1][0] = "A1";
		c[1][1] = "B1";
		c[1][2] = "C1";
		c[1][3] = "D1";
		
		
		System.out.println(c[1][3]);
		
		//For 2D array we need to use two loops 
		//row =0 and col =0 to 4
		//row =1 and col = 0 to 4
		//row =2 and col = 0 to 4
		for(int row=0;row<c.length;row++) {
			for (int col =0;col<c[0].length;col++) {
				System.out.println(c[row][col]);
			}
		}
		
	}

}
