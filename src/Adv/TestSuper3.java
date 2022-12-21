package Adv;

class Animal2{
	
Animal2(){
	System.out.println("animal is created");
	} 

Animal2(String name){
	System.out.println("animal name is :"+name);
}
}  

class Dog2 extends Animal2{ 
	
Dog2(){  
	super("Tommy");  
System.out.println("dog is created");  

}  

}  


class TestSuper3{  
	
public static void main(String args[]){  
	
Dog2 d=new Dog2();  
}
}  
