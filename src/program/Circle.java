package program;

public class Circle implements Shape {

	private double radio;
	private double pi = 3.14;
	
	Circle(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double getArea() {
	    
		return pi*radio*radio;
	}

	@Override
	public double getPerimeter() {
		
		return 2*pi*radio;
	}
}
