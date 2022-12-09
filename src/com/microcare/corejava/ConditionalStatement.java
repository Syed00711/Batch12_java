package com.microcare.corejava;

public class ConditionalStatement {

	public static void main(String[] args) {
		if("microcare".equals("Microcare")) {
			System.out.println("Equals ignore case");
			
		}
		else if("microcare".equalsIgnoreCase("Microcare")){
		
				System.out.println("Equals");
			}
		else if(5<6){
			System.out.println("true");
		}

	
		
	}

}
