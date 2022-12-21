package Adv;

class Animal{  
String color="white";  
}  

class Dog extends Animal{  
	
	
String color="black";

void printColor(){  
	String color="red";
	System.out.println(color);
System.out.println(this.color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  


}  


class TestSuper1{  
	
public static void main(String args[]){  
	
Dog d=new Dog();  
d.printColor();  

}
}  