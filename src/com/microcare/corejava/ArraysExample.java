package com.microcare.corejava;

public class ArraysExample {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		int c=7;
		int d =8;
		int[] intArray = new int[4];
		intArray[0]=a;
		intArray[1]=b;
		intArray[2]=c;
		intArray[3]=d;
		
		
		int[] intArray1 = {a,b,c,d};
		
		//{'m','i','c','r','o'} micro
		
		
		String e= "5";
		String f="6";
		String g="7";
		String h ="8";
		String[] intArray2 = new String[4];
		intArray2[0]=e;
		intArray2[1]=f;
		intArray2[2]=g;
		intArray2[3]=h;
		
		
		String[] intArray3 = {e,f,g,h};
		System.out.println(intArray3.length);
		System.out.println(intArray3);
		
		
	}

}
