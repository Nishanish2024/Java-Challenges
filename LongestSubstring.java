package Java.challenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		//find the longest substring without repeating characters
		//eg: abcabcbb
		//ans: abc length=3
		
		//Input: “GEEKSFORGEEKS”
		//Output: 7
		//Explanation: The longest substrings without repeating characters are 
		//“EKSFORG” and “KSFORGE”, with lengths of 7
		
		String Str= "javaconceptoftheday";	
		System.out.println("Input String is: "+Str);
		LengthOfLongestSubstring(Str);
	}
	
	public static int LengthOfLongestSubstring(String Str) 
	{
		int n = Str.length();
		int count = 0;
		System.out.println("Length of the Input string is:"+ n);     
		for(int i = 0; i < n; i++)
		{ 
			boolean[] visited = new boolean[256];
			System.out.println("i= "+ i + " Str.charAt(i)="+ Str.charAt(i)); 
			System.out.println("-------------------------------------------");
			for(int j = i; j < n; j++)
			{
				System.out.println("j= "+ j + " Str.charAt(j)=" + Str.charAt(j));
				if (visited[Str.charAt(j)] == true)
					break;	 
			    else
				{
			    	count = Math.max(count, j - i + 1);
			    	System.out.println("count= "+ count + " j="+ j + " i=" +i);
					visited[Str.charAt(j)] = true;				
					System.out.println("j==== "+ j + " Str.charAt(j)====" + Str.charAt(j));
					
				}
			}
			visited[Str.charAt(i)] = false;
			//System.out.println("***outside jloop >>i== "+i + " Str.charAt(i)==" + Str.charAt(i));
		}
		System.out.println("Length of the longest substring is: "+count);
		return count;
	}
}
