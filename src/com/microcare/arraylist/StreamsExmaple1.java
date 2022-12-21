package com.microcare.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExmaple1 {

	public static void main(String[] args) {
		List<Integer> intergers = 
				Arrays.asList(1,2,4,2,3,4,5,6,4,3,6,5,4,6,7,8,6);
		
		List<Integer> dupInt =new ArrayList<>();
		for(int numbers :intergers) {
			if(! dupInt.contains(numbers)) {
				dupInt.add(numbers);
			}
		}
		
		System.out.println(dupInt);
		List<Integer> streaminteger =
				intergers.stream().distinct().collect(Collectors.toList());
		System.out.println(intergers.stream().distinct().count());
System.out.println(streaminteger);

List<String> stringarrays =
Arrays.asList("abc","def","abc","dvf","def","dvf","abc","abc");
List<String> streamString =
stringarrays.stream().distinct().collect(Collectors.toList());
System.out.println(streamString);
	}

}
