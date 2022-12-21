package Adv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveInteString {

	public static void main(String[] args) {
		List<String> array1 =new ArrayList<>(Arrays.asList("abc","def","abc","0","abc","ghi"));
		
		List<String> array2 =new ArrayList<>(Arrays.asList("xyz","pqr","5","6"));
		array1.addAll(array2);
		array1.set(3, "123");
		System.out.println(array1.indexOf("abc"));
		System.out.println(array1.lastIndexOf("abc"));
		//array1.clear();
		System.out.println(array1.isEmpty());
		array1.forEach(t ->{
			System.out.println(t);
			});
		
		

	}

}
