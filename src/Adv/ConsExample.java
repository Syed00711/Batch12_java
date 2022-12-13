package Adv;

public class ConsExample {
	
	public ConsExample(){
		System.out.println("Default constructor");
		Name="Microcare";
		
	}
	
	public ConsExample(String input){
		System.out.println("Parameterized");
		College=input;
	}
	
	int age;
	String Name;
	String College;

}
