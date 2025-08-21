package ConverterDOlar;
import java.util.Locale;
import java.util.Scanner;
import java.time.*;


public class Main {

	public static void main(String[] args) {
		
		CurrencyDolar cd = new CurrencyDolar();
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		
		
		//cd.currency(sc);
		
	
		
		System.out.println("what is the dollar price? ");
		cd.setDollar(sc.nextDouble());
		System.out.println("how many dollar will be bought? ");
		cd.setQuantity(sc.nextDouble());
		
		System.out.println(cd.getDollar());
		System.out.println(cd.getQuantity());
		
		cd.converter(cd.getDollar(), cd.getQuantity());
		cd.iof();
		
		System.out.println(cd.toString());
		
		System.out.println(cd.getDollar());
		System.out.println(cd.getQuantity());
	}

}
