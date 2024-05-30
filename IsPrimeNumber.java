package Java.challenge;

public class IsPrimeNumber {

	/*public static void main(String[] args) {
		int num=15;
		int flag=0;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(num +" is a prime number");
		else
			System.out.println(num +" is a not prime number");
	}*/
	

	public static boolean isPrime(int num) {
		boolean flag=false;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			flag=true;
			System.out.println(num +" is a prime number");
		}
		else {
			flag=false;
			System.out.println(num +" is a not prime number");
		}
		return flag;
	}
	
	public static void main(String[] args) {
		int num=15;
		System.out.println("....Entered Number is.."+num);
		isPrime(num);
	}
}
