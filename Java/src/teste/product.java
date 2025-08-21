package teste;

public class product {

	private String name;
	private double price;
	private int quantity;

	/*
	 * public product(String name, double prince, int quantity) { this.name = name;
	 * this.price = prince; this.quantity = quantity; }
	 */

	public double totalvalueinstock() {

		return quantity * price;
	}

	public void addquantityproduct(int add) {

		if (add > 0) {
			this.quantity += add;
		}

		else {
			System.out.println("invalid value! \n");
		}
	}

	public void removequantityproduct(int remove) {

		if (remove > 0) {
			this.quantity -= remove;
		} else {
			System.out.println("invalid value! \n");
		}
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units , Total: $"
				+ String.format("%.2f", totalvalueinstock());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	
	
}
