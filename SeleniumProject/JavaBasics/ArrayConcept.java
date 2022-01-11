package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//Array Out of bound exception is given as i[4] is not existing
		System.out.println(i.length);
		
		System.out.println("**********");
		//i.length gives you array size it is 4 so then it will print i[0];i[1] ... i[4]
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		for(int j=0;j<i.length-1;j++) {
			System.out.println(i[j]);
		}
		
		
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]= 1993;
		
		System.out.println(ob.length);
		System.out.println(ob[1]);
		
				
	}

}
