package reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		int numero;
		String checkin;
		String checkout;
		
		try {
		System.out.println("Número do quarto: ");
		numero = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Data de check-in:");
		checkin = sc.nextLine();
		System.out.print("Data de check-out: ");
		checkout = sc.nextLine();
		
		
		Reserva reserva = new Reserva(numero,LocalDate.parse(checkin,df),LocalDate.parse(checkout,df));
		
		System.out.println(reserva);
		
		System.out.println("Atualize a reserva: ");
		
		System.out.print("Data de check-in: ");
		checkin = sc.nextLine();
		System.out.print("Data de check-out: ");
		checkout = sc.nextLine();
		
		reserva.updateDatas(LocalDate.parse(checkin,df), LocalDate.parse(checkout,df));
		System.out.println(reserva);
		
		}catch (InputMismatchException e) {
			System.err.println("Erro ao encontrar quarto, tente novamente mais tarde! ");
		}
		catch (DateTimeParseException e) {
			System.err.println("Formato de data inválido, tente novamente mais tarde!");
		}
	}

}
