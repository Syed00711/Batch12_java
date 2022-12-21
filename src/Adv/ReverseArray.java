package Adv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		List<String> newarray = new ArrayList<String>(Arrays.asList("1","2","3","4"));
		List<String> newarray1 = Arrays.asList("5","6");
		//List<String> reversearray = new ArrayList<String>(Arrays.asList(new String[newarray.size()]));
		//newarray.forEach(System.out::println);
		
		newarray.addAll(2, newarray1);
		//Collections.reverse(newarray);
		/*newarray.forEach(t -> {
			reversearray.set(newarray.size()-newarray.indexOf(t)-1, t);
			
		}
		);
		/*for(int i=newarray.size()-1;i>=0;i--) {
			reversearray.add(newarray.get(i));
		}*/
		
		newarray.forEach(System.out::println);
	}

}
