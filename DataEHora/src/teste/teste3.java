package teste; 

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class teste3 {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.forLanguageTag("en-US"));
		Locale.setDefault(new Locale("pt", "BR"));
		
		LocalDate d01 = LocalDate.parse("2025-03-26");
		LocalDateTime d02 = LocalDateTime.parse("2025-03-26T01:54:36");
		Instant d03 = Instant.parse("2025-03-26T01:54:36Z");
		
		
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
				
		
		System.out.println("d03 = " + d03); //fuso horario padrao UTC/GMT
		
		
		ZonedDateTime z = ZonedDateTime.now();
		
		System.out.println("r1 = " + r1);	//data local 3 horas atrasado:
		System.out.println("r2 = " + r2);	//data portugal 1
		System.out.println("r3 = " + r3);	//data e hora local 3 horas atrasado:
		System.out.println("r4 = " + r4);	//data e hora de portugal UTC +1 OU UTC+0
		
		System.out.println("d02 " + d02.getDayOfMonth());
		System.out.println("d02 " + d02.getMonthValue());
		System.out.println("d02 " + d02);
		
		System.out.println(d02.format(dtf2.ofLocalizedDate(FormatStyle.FULL)));
		
		
		
//		for(String s : ZoneId.getAvailableZoneIds()) {
//			//Coleção de nomes de fuso horaios: 
//			System.out.println(s);
//		}
		
		
		
		//System.out.println(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").withZone(ZoneId.systemDefault()).format(d01));

	}

}
