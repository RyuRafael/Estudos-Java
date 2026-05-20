package application;

//Vamos fazer um método para retornar a soma das áreas de uma lista de figuras

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Main {

	public static void main(String[] args) {

		List<Shape> list = new ArrayList<>();

		list.add(new Rectangle(3.0, 2.0));
		list.add(new Circle(2.0));

		List<Circle> circulo = new ArrayList<Circle>();

		circulo.add(new Circle(2.0));
		circulo.add(new Circle(3.0));

		System.out.println(totalArea(circulo));

	}

//	 permite referência qaualquer subtipo da classe Shape
	public static double totalArea(List<? extends Shape> list) {

		double sum = 0.0;
		for (Shape shape : list) {
			sum += shape.area();
		}
		return sum;
	}

}
