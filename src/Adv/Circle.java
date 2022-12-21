package Adv;

public class Circle {
	
	private double radius;
	
	Circle(double radius){
		
		this.radius=radius;
	}
	
	double getArea(){
		return Math.PI * this.radius* this.radius;
	}
	
	double getPerimeter() {
		
		return 2 *(Math.PI * this.radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
