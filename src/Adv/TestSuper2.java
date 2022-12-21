package Adv;

class Animal1{ 
	
void eat(String what){System.out.println("eating..."+what);
}  
}  

class Dog1 extends Animal1{  
	
void eat(){
	System.out.println("eating bread...");
}  

void bark(){
	System.out.println("barking...");
	}  

void work(){  
	eat(); 

bark();  
super.eat("Pizza");  
}  

}  


class TestSuper2{  
	
public static void main(String args[]){ 
	
Dog1 d=new Dog1();  
d.work();  


}
}  