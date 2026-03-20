package reserva;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import model.exceptions.DomainException;

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

	public void updateDatas(LocalDate checkin, LocalDate checkout) throws DomainException {

		Period p = Period.between(checkin, checkout);
		
		if (checkin.isBefore(this.checkin)) {
			throw new DomainException("Alteração da reserva só poder ser feita para datas futuras!");
		}
		if (p.getDays() < 0) {
			throw new DomainException("A data de saida deve ser maior que a data de entrada!");

		}
			this.checkin = checkin;
			this.checkout = checkout;

	}

	@Override
	public String toString() {
		return "Reserva: Quarto " + numQuarto + ", check-in: " + checkin.format(df) + ", check-out: "
				+ checkout.format(df) + ", " + duracao() + " noites";
	}
}
