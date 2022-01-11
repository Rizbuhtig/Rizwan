package Automation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendarandDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		
		SimpleDateFormat sd = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy HH:MM:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		
		Calendar cal = Calendar.getInstance();
		//Calendar cal = new Calendar();
		SimpleDateFormat f = new SimpleDateFormat("M/d/yyy  HH:MM:ss");
		System.out.println(f.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		
		
	}

}
