package Java.challenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name= "Nisha Anish";
		System.out.println("Input: "+ name);
		char[] charName= name.toCharArray();
		
		Set<Character> namesHashSet= new LinkedHashSet<Character>();
		Set<Character> dupCharSet= new LinkedHashSet<Character>();
		
		int size = charName.length;
		for(int i=0; i< size ; i++ ) {
			if(namesHashSet.contains(charName[i])){
				dupCharSet.add(charName[i]);	
				namesHashSet.remove(charName[i]);
			}
			else {
				namesHashSet.add(charName[i]);
			}
		}
		System.out.println("Duplicates: "+ dupCharSet);
		//System.out.println("Unique characters: "+ namesHashSet);
		//removing empty space
		namesHashSet.remove(' ');
		System.out.println("Unique characters: "+ namesHashSet);
	}

}
