package Java.challenge;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String companyName= "PayPal India";
		System.out.println("companyName: "+ companyName);
		char[] charArrayNames = companyName.toCharArray();
		
		Set<Character> namesHashSet= new LinkedHashSet<Character>();
		Set<Character> dupCharSet= new LinkedHashSet<Character>();
		
		int size = charArrayNames.length;
		for(int i=0; i< size ; i++ ) {
			if(namesHashSet.contains(charArrayNames[i])){
				dupCharSet.add(charArrayNames[i]);
			}
			else {
				namesHashSet.add(charArrayNames[i]);
			}
		}
		System.out.println("Duplicates are: "+ dupCharSet);
		System.out.println("Final: "+ namesHashSet);
	}

}
