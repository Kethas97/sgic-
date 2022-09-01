package ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class datecal {

	
	
	public static long getDifferenceDays(String d1,String d2) throws ParseException {
		SimpleDateFormat df=new SimpleDateFormat("yyyy MM dd");
		
		Date dt1=df.parse(d1);
		Date dt2=df.parse(d2);
		
		long diff=(dt2.getTime()-dt1.getTime())/86400000;
		return Math.abs(diff);
		}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the two dates:");
		String dat1 = scan.nextLine();
		String dat2 = scan.nextLine();
		
		System.out.println(getDifferenceDays(dat1,dat2));
	}
}
