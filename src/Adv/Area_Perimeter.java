package Adv;

public class Area_Perimeter {

	public static void main(String[] args) {
		MyCircle  mc =new MyCircle(4);
		System.out.println("Area of Circle"+mc.getArea() );
		System.out.println("Perimeter of Circle"+mc.getPerimeter());
		
		MyRectangle mr =new MyRectangle(4,8);
		
		System.out.println("Area of Rectangle"+mr.getArea());
		System.out.println("Perimeter of rectangle"+mr.getPerimeter());
		
		
		System.out.println(mc.toString());
		System.out.println(mr.toString());
	

	}


}
