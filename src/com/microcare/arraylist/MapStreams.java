package com.microcare.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreams {

	public static void main(String[] args) {
		List<Integer> intergers = 
				Arrays.asList(1,2,4,2,3,4,5,6,4,3,6,5,4,6,7,8,6);
		System.out.println(
				intergers.stream().map(t -> t*t)
				.collect(Collectors.toList()));
		

		List<String> Stringnumbers = 
				Arrays.asList("1","2","4","2","3","4","5","6","4","3");
		System.out.println(Stringnumbers);
		for(String text : Stringnumbers) {
			
		}
		
		List<Integer> Stringnumbers2 = 	Stringnumbers.stream().map(s -> Integer.parseInt(s))
		.collect(Collectors.toList());
		
		System.out.println(Stringnumbers2);
		
for(int text : Stringnumbers2) {
			
		}
		
	}

}
