package Java.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrayList {

	public static void main(String[] args) {
		Integer[] array1= {3, 2, 11, 4, 6, 7} ;
		Integer[] array2= {1, 2, 8, 4, 9, 7} ;
	
		List<Integer> List1=  new ArrayList<Integer>(Arrays.asList(array1));
		int size1=List1.size();
		List<Integer> List2= new ArrayList<Integer>(Arrays.asList(array2));
		int size2=List2.size();
		
		System.out.println("Duplicates are: ");
		for(int i=0; i < size1 ; i++) {
			for(int j=0; j < size2 ; j++) {
				if(List1.get(i).equals(List2.get(j))) {
					System.out.print(List1.get(i) +" ");
				}
			}
		}
		/*
		int[] a= {3, 2, 11, 4, 6, 7} ;
		int[] b= {1, 2, 8, 4, 9, 7} ;
		System.out.println("duplicates: ");
		for (int i=0 ; i< a.length; i++ ) {
			for(int j=0 ; j< b.length ; j++) {
				//System.out.println("i= "+ i+ " j= "+ j);
				//System.out.println("a[i]: "+a[i] +" b[j]:"+b[j]);
				if(a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
		*/
		
		/*while(i<a.length && j< b.length) {
			
			if(a[i] == b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			}
			else if(a[i] > b[j]) {
				j++;
			}
			else
			{
				i++;
			}
		}*/
	}
	
}
