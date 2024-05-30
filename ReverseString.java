package Java.challenge;

public class ReverseString {
	/*
	 * Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
	 */
	
	public static String reverseWords(String s) {
		String[] arr = s.trim().split("\\s+");
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return String.join(" ", arr);
	}
	
	public static void main(String[] args) {
		String s= "  hello world  ";
		System.out.println("Input String is:"+ s);
		String output= reverseWords(s);
		System.out.println("Reversed string is: "+ output);
	}
}
