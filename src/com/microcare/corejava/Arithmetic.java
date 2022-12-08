package com.microcare.corejava;

public class Arithmetic {

	public static void main(String[] args) {
		int num=11;
		int num1=5;
		int num2=32;
		int num3 =12;
		int num4=45;
		
		
		int num5= num*num1 -num2 + (++num3 +num4); 
		//    81
		System.out.println(num5);
		
        num5 *= 5;//num5 = num5 *5
        
        System.out.println(5==6);
        System.out.println(5!=6);
        System.out.println(5>6);
        System.out.println(5<6);
        System.out.println(5<=6);
        System.out.println(5>=5);
		
		

	}

}
