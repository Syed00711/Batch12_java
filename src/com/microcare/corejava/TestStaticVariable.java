package com.microcare.corejava;

//Test class to show the values of objects  
public class TestStaticVariable{  
public static void main(String args[]){  
StaticClass s1 = new StaticClass(111,"Karan");  
StaticClass s2 = new StaticClass(222,"Aryan");  
//we can change the college of all objects by the single line of code  
//Student.college="BBDIT";  
s1.display();  
s2.display();  
}  
}  