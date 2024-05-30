package Java.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNo {

	public static void main(String[] args) {
		Integer[]  array = {3, 2, 11, 4, 6, 7, 21, 19};
		
		List<Integer> sortList= new ArrayList<Integer>(Arrays.asList(array));
			
		//sorting a List
		Collections.sort(sortList);
		System.out.println("Sorted list: "+ sortList);
		int size = sortList.size();
		System.out.println("size: " +size);
		System.out.println("Second Largest No is: "+ sortList.get(size-2));
	}

}
