package teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Date_1 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date();
		Date d1 = sdf1.parse("03/09/2003");
		Date d2 = sdf2.parse("03/09/2003 10:36:44");
		Date d3 = Date.from(Instant.parse("2003-09-03T10:36:44Z"));

		System.out.println("Data atual " + x1);

		System.out.println("d1 = " + d1);
		System.out.println("d1 = " + sdf1.format(d1));

		System.out.println("d2 = " + d2);
		System.out.println("d2 = " + sdf2.format(d2));

		System.out.println("d3 = " + sdf2.format(d3));
		System.out.println("d4 = " + sdf3.format(d3));
		
		
		System.out.println();
		System.out.println("............................................");
		//somando uma unidade de tempo
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d3);
		cal.add(Calendar.HOUR_OF_DAY, 3);
		d3 = cal.getTime();
		 
		System.out.println("d3 " + sdf2.format(d3));
		
		
		
		
		
		
	}
}
