package com.microcare.corejava;

import java.util.Scanner;

public class RandomGuess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random() * 100);
		
		int num=0;
		
		do {
			System.out.println("Please enter input to guess random number");
			
			num =sc.nextInt();
			
			
			if(random==num) {
				System.out.println("Correct !!!!!");
				break;
			}
			
			//(expr)?true:false
			String ouput = (num>random)? "Given number is greater":"Given number is less";
			
			System.out.println(ouput);
		}while(num >=0);
		
		

	}

}
