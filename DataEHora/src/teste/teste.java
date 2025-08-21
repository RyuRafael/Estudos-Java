package teste;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class teste {

	public static void main(String[] args) {

		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:s");

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2003-03-09");
		LocalDateTime d05 = LocalDateTime.parse("2003-03-09T08:51:36");
		Instant d06 = Instant.parse("2003-09-03T08:51:36Z");
		Instant d07 = Instant.parse("2003-09-03T08:51:36-03:00");
		LocalDate d08 = LocalDate.parse("25/03/2025", f1);
		// LocalDateTime d08 =
		// LocalDateTime.parse("25/03/2025",DateTimeFormatter.ofPattern("dd/MM/yyyy"););
		LocalDateTime d09 = LocalDateTime.parse("25/03/2025 08:51:36", f2);
		ZonedDateTime d10 = ZonedDateTime.parse("2003-09-03T08:51:36Z");
		LocalDateTime d11 = LocalDateTime.of(2025, 03, 26, 9, 11);
		
		String d12 = d01.format(f1);
		

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10.withZoneSameInstant(ZoneId.of("America/Sao_Paulo")));
		System.out.println("d11 = " + d11);
		System.out.println("d12 = " + d12);
		//Formatar para data padrao do brasil:
		//System.out.println("d12 = " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDate.parse("2020-03-26")));

	}

}
