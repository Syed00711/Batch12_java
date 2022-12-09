package com.microcare.corejava;

public class ForLoops {

	public static void main(String[] args) {
		
		/*for(int i=0;i<5;i++) {
			
		System.out.println("infinity");
		}
		
		String[] arrays = {"a","b","c","d","e"};
		
		for(int j=0;j<arrays.length;j++) {
			System.out.println(arrays[j]);
		}
		for(String arg : arrays) {
			System.out.println(arg);
		}*/
			
		int[][][] multidimensional = {
				{{1,2,3},{4,5,6}},{{76,45,65},{54,65,34}},
				
				
		};
		/*[0][0][0]
		 * [0][0][1]
		 * [0][0][2]
		 * [0][1][0]
		 * [0][1][1]
		 * [0][1][2]
		 * [0][2][0]
		 * [0][2][1]
		 * [0][2][2]
		 * */
				for(int k=0; k<=1; k++) {
					
					for(int l=0;l<=2;l++) {
						System.out.println(multidimensional[k][l]);
					}
				}
		

	}

}
