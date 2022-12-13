package Adv;



public class ClassC extends ClassA{
	
	void A() {
		System.out.println("Default");
		
		InterfaceClass ref =new InterfaceImpl();
	}
	
	void A(int A) {
		System.out.println("INT parameter"+A);
	}
void A(String A) {
		System.out.println("String parameter"+A);
	}

void A(String A,int B) {
	System.out.println("Two paramter"+A+B);
}

public static void main(String[] args) {
	ClassC C =new ClassC();
	C.A();
	C.A("value:", 234);
}

}
