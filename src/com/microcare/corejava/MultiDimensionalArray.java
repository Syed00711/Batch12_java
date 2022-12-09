package com.microcare.corejava;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][][] arr = { { { 1, 2, 5 }, { 3, 4 ,7}, { 3, 4 ,7} },
				          { { 5, 6, 8 }, { 7, 8,8 }, { 3, 4 ,7} } ,
				          { { 56,66,78 },{ 57, 88,83},{ 1, 2, 5 } } 
				        };
		 
		 System.out.println(arr[2][2][2]);
		 
		 /*
		  * 
arr[0][0][0] = 1
arr[0][0][1] = 2
arr[0][1][0] = 3
arr[0][1][1] = 4
arr[1][0][0] = 5
arr[1][0][1] = 6
arr[1][1][0] = 7
arr[1][1][1] = 8
*/

	}

}
