package com.microcare.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {

	public static void main(String[] args) {
		List<Integer> intergers = 
				Arrays.asList(1,2,4,2,3,4,5,6,4,3,6,5,4,6,7,8,6);
		
		List<Integer> evenintergers =
				intergers.stream().filter(n ->  n%2==0).distinct().collect(Collectors.toList());
System.out.println(evenintergers);

List<String> Strings = 
Arrays.asList("to","see","cost","money","phone","run","Micro","Academy","school");
	
System.out.println(Strings.stream().filter(s -> s.length()==3).collect(Collectors.toList()));
	}

}
