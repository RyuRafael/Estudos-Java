package teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class teste4 {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2003-09-03");
		LocalDateTime d05 = LocalDateTime.parse("2003-09-03T08:51:36");
		Instant d06 = Instant.parse("2003-09-03T08:51:36Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7); // menos 7 dias da semana
		LocalDate nextWeekLocalDate = d04.plusDays(7); // mais 7 dias da semana

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);// menos 1 semana
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); // mais 7 dias

		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // não aceita o formato de
																								// data sem horas

		System.out.println("t2 dias " + t1.toDays());

		Duration t2 = Duration.between(pastWeekLocalDateTime, d05); // duracao de um intervalo entre uma data e outra

		System.out.println("t1 dias " + t2.toDays());// intervalo em dias
		System.out.println("t1 horas " + t2.toHours());// intervalo em horas

		Duration t3 = Duration.between(pastWeekInstant, d06);
		
		System.out.println("t3 dias " + t3.toDays());
	}

}
