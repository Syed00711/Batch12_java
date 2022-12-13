package com.microcare.corejava;

//Java Program to demonstrate the use of static variable  
class StaticClass{  
 int rollno;//instance variable  
 String name;  
 static String college ;//static variable  
 
 static {
	 System.out.println("STATIC BLOCK");
	 college="ITS";
 }
 StaticClass(){
	 System.out.println("Default");
 }
 //constructor  
 StaticClass(int rollno, String name){  
	 this();
	 System.out.println("Parameterized");
	
 this.rollno = rollno;  
 this.name = name;  
 }  
 //method to display the values  
 void display (){
	 instance(this);
	 System.out.println(rollno+" "+name+" "+college);
	 
 }  
 
 void instance(StaticClass sc) {
	
	 
 }
}  
