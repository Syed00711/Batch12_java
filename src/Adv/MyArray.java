package Adv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {

	public static void main(String[] args) {
		
		String[] normalarray = {"ABC","DEF","GHI"};
		
		
		ArrayList<String> arrays = new ArrayList<>();
		
		List<Integer> listArray = new ArrayList<>();
		//ArrayList<String> arrays1 = Arrays.asList({"","",""});
	
		
		arrays.add("first");
		arrays.add("first1");
		arrays.add("first2");
		arrays.add("first3");
		arrays.add("first4");
		arrays.add("first5");
		arrays.add("first6");
		System.out.println(arrays.size());
		List<String> array2 = new ArrayList<>();;
		array2.add("2first");
		array2.add("2first1");
		array2.add("2first2");
		array2.add("2first3");
		array2.add("2first4");
		array2.add("2first5");
		array2.add("2first6");
		System.out.println(array2.size());
		
		arrays.addAll(array2);
		System.out.println(arrays.size());
		

		
		List<String> array3 = new ArrayList<String>() {{
		add("2first");
		add("2first1");
		add("2first2");
		add("2first3");
		add("2first4");
		add("2first5");
		add("2first6");
		}};
		
		
		List<String> array4 = new ArrayList<String>(Arrays.asList(normalarray));
		System.out.println(array4.size());
		
		List<String> array5 =new ArrayList<>(array3);
		
		List<String> array6 =new ArrayList<>(List.of("sdfasd","sdfds","sdfasda"));
	}

}
