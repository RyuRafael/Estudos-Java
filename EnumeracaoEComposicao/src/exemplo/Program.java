package exemplo;

import java.util.Date;

import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.ENTREGUE);
		
		System.out.println(order);

	}

}
