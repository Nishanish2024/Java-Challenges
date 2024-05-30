package Java.challenge;

public class SquareRoot {

	public static void main(String[] args) {
		int num=4;
		System.out.println("Input is: " + num);
		double temp= 0;
		double squareRoot = num / 2 ;
		do
		{
			temp = squareRoot;
			squareRoot = (temp + (num/temp))/2;
		}
		while((temp - squareRoot)!= 0);
		//System.out.println("squareRoot is:"+ squareRoot);
		
		int result = (int)squareRoot;
		System.out.println("Square root is: "+result);
	}

}
