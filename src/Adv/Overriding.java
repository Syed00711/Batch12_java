package Adv;

public class Overriding {

	public static void main(String[] args) {
		ClassB B = new ClassB();
		ClassA AB = new ClassB();
		ClassA A=new ClassA();
		B.display();
		AB.display();
  A.display();
	}

}
