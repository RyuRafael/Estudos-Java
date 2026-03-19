package reserva;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Reserva {

	private int numQuarto;
	private LocalDate checkin;
	private LocalDate checkout;

	public Reserva(int numQuarto, LocalDate checkin, LocalDate checkout) {
		this.numQuarto = numQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}

	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public int duracao() {

		Period p = Period.between(checkin, checkout);

		return p.getDays();
	}

	public void updateDatas(LocalDate checkin, LocalDate checkout) {

		Period p = Period.between(checkin, checkout);

		if (checkin.isBefore(this.checkin)) {
			System.out.println("Alteração da reserva só poder ser feita para datas futuras!");
		}
		if (p.getDays() < 0) {
			System.out.println("A data de saida deve ser maior que a data de entrada!");

		}
		else {
			this.checkin = checkin;
			this.checkout = checkout;
		duracao();}

	}

	@Override
	public String toString() {
		return "Reserva: Quarto " + numQuarto + ", check-in: " + checkin.format(df) + ", check-out: "
				+ checkout.format(df) + ", " + duracao() + " noites";
	}
}
