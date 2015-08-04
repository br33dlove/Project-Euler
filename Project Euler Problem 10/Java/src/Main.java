
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Find the sum of all the primes below two million.");
		long sum_primes = 0L, limit = 2000000;
		
		for (int i=0;i<limit;i++) {
			if (is_prime(i)) {
				sum_primes += i;
				System.out.println(i);
			}
		}
		
		System.out.println("The sum of all the primes below two million is " + sum_primes);
		
		System.out.println("Thank you for using this program.");
	}
	
	public static boolean is_prime(final int integer) {
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
