package com.microcare.corejava;

public class CoreJava{




public static void main(String[] args){
String name = "Microcare";

String nameTwo = new String("Academy");

  String name3=   name + " "+ nameTwo;
  
  name =  name.concat(nameTwo);
  
  System.out.println(name.charAt(5));
  System.out.println(name);
  
  System.out.println(name.replace("Academy", "Students"));
 System.out.println(name.startsWith("care"));
 System.out.println(name.endsWith("demy"));
 
 System.out.println(nameTwo.indexOf("demy"));
String text="this is a MICROCARE academy contains string text";
 System.out.println(text.contains("MICROCARE"));
 System.out.println(text.equals("this is a microcare academy contains string text"));
 System.out.println(text.equalsIgnoreCase("this is a microcare academy contains string text"));
}

}