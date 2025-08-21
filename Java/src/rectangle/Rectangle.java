package rectangle;

public class Rectangle {

	double height;
	double width;

	public double area() {

		return height * width;

	}

	public double perimetro() {

		return 2 * (height + width);
	}

	public double diagonal() {

		return Math.sqrt(((height * height) + (width * width)));

	}

}
