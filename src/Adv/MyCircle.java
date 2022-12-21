package Adv;

public class MyCircle implements GeometricObject{
	
	double radius;
	
	@Override
	public String toString() {
		return "MyCircle [radius=" + radius + "]";
	}

	MyCircle(double radius){
		this.radius=radius;
		
	}

	@Override
	public double getArea() {
		
		
		 return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		
		return 2 * Math.PI * radius;
	}

}
