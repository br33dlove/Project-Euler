import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		System.out.println("What is the 10 001st prime number?");
		int prime_10001=0,counter=0;
		
		for (int i=1;i<(int)Math.pow(2,32);i++) {
			if (is_prime(i))
				counter++;
			if (counter == 10001) {
				prime_10001 = i;
				break;
			}
		}
		
		System.out.println("The 10,001st prime number is " + prime_10001);
		
		System.out.println("Thank you for using this program.");
	}
	
	public static boolean is_prime(int integer) {
		if (integer > 1) {
			for (int i=2;i<integer/2+1;i++) {
				if (integer % i == 0)
					return false;
			}
			return true;
		}
		else
			return false;
	}
}
