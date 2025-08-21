package teste;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class teste2 {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dtf3 = DateTimeFormatter.ISO_INSTANT;
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of(""));
		
		
		LocalDate d01 = LocalDate.parse("2025-03-26");
		LocalDateTime  d02 = LocalDateTime.parse("2025-03-26T10:39");
		Instant d03 = Instant.parse("2025-03-26T10:52:36Z");
		
		
		System.out.println("d01 = " + d01.format(dtf1));
		System.out.println("d01 = " + dtf1.format(d01));
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d02 = " + d02.format(dtf2));
		System.out.println("d02 = " + dtf2.format(d02));
		System.out.println("d02 = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		
		System.out.println("d03 = " + dtf3.format(d03));
		System.out.println("d03 = " + dtf4.format(d03));
	}

}
