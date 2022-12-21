package com.microcare.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//isEmpty,clear
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> newNumber = new ArrayList<>(Arrays.asList(1,2,10));
		
		newNumber=  (List<Integer>) numbers.clone();
        /*  System.out.println(numbers.isEmpty());
          System.out.println(numbers.size());
          numbers.clear();
          System.out.println(numbers.isEmpty());
          System.out.println(numbers.size());*/
          
          
          //index,lastindexof
		//System.out.println(numbers.indexOf(3));
		//System.out.println(numbers.lastIndexOf(3));
		
		//add,addAll
		
		//numbers.add(10);
		//numbers.add(2,15);
		//numbers.addAll(4,newNumber);
        //  System.out.println(numbers);
          
          //retain,remove
		//numbers.retainAll(newNumber);
		//numbers.remove(3);
		//System.out.println(numbers.get(numbers.size()-1));
		//System.out.println(numbers.set(3, 100));
		//System.out.println(newNumber);
		
		Student s1 =new Student();
		s1.setId(3264712341L);
		s1.setName("Microcare");
		s1.setAge(16);
		s1.setGraduate(true);
		
		Student s2 =new Student();
		s2.setId(3523452345L);
		s2.setName("Academy");
		s2.setAge(18);
		
		List<Student> students = new ArrayList<>();
		students.add(s2);
		students.add(s1);
          
		/*System.out.println(students.size());
		students.forEach(s -> {
			System.out.println(s.toString());

		});*/
		
		
		System.out.println(students.size());
		System.out.println(students.parallelStream().count());
		
}
	
}
