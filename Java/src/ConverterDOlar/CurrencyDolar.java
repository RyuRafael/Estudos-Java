package ConverterDOlar;

import java.util.Scanner;

public class CurrencyDolar {

    private double dollar;
	private double quantity;
    static double price = 0;

    /*
    public void currency(Scanner sc) {

        System.out.println("what is the dollar price? "); 
        dollar = sc.nextDouble();
        System.out.println("how many dollars will be bought? "); 
        quantity = sc.nextDouble();

        double converter = dollar * quantity;

        double iof = converter * 0.06;

        price += converter + iof;

        System.out.printf("amount to be paid in reais = %.2f", price);
    }
    */

    
    public double converter(double dollar, double quantity) {

        this.dollar = dollar;
        this.quantity = quantity;

        return dollar * quantity;
    }

    public void iof() {

        double pay = converter(dollar, quantity) * 0.06;

        price = pay + converter(dollar, quantity);
    }

    public String toString() {

        return "amount to be paid in reais: " + String.format("%.2f", price); 
    }

	public double getDollar() {
		return dollar;
	}

	public void setDollar(double dollar) {
		this.dollar = dollar;
	}
    
	public double getQuantity() {
		return  quantity;
	}
	
	public void setQuantity(double quantity) {
		
		this.quantity = quantity;
		
	}

    /*
    public void converter(double dollar, double quantity) {

        this.dollar = dollar; 
        this.quantity = quantity;

        price += dollar * quantity;
    }

    public static double iof() {

        return price * 0.06;

        // price = pay ;
    }

    public String toString() {

        return "amount to be paid in reais: " + String.format("%.2f", price + iof());
    }
    */

}
