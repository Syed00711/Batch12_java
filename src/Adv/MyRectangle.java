package Adv;

public class MyRectangle implements GeometricObject{
	@Override
	public String toString() {
		return "MyRectangle [width=" + width + ", length=" + length + "]";
	}

	double width;
	double length;
	
	MyRectangle(double width , double length){
		this.width=width;
		this.length=length;
	}

	@Override
	public double getArea() {
		
		return width * length;
	}

	@Override
	public double getPerimeter() {
		
		return 2 * (width + length);
	}
	
	
	

}
