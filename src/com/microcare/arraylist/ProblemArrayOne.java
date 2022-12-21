package com.microcare.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemArrayOne {

	public static void main(String[] args) {
		List<Integer> numbers = 
				new ArrayList<>(Arrays.asList(45,44,556,43,464,878,433));
		numbers.subList(2, 5).clear();
		
		
	
		
		
		System.out.println(numbers);
		
		/*for(int num :numbers) {
			if(! (num == numbers.indexOf(num)+1)) {
				int val =numbers.indexOf(num);
				System.out.println(val+1);
				break;
			}
		}*/
		
		
		/*numbers.forEach(num -> {  
		if(! (num == numbers.indexOf(num)+1)) {
			int val =numbers.indexOf(num);
			System.out.println(val+1);
			return;
		}
		}
				);*/

	}

}
